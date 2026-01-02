/*
  filosofos.c
*/

#include "filosofos.h"

/* Variáveis globais */
int   state[N]  = { THINKING, THINKING, THINKING, THINKING, THINKING };
char *states[3] = { "THINKING", "HUNGRY  ", "EATING  " };

/* Mutexes (semaforos binarios) */
semaphore mutex;
semaphore s[N];

/* Variavel para controlar laço - while( True ) - dos filosofos */
BOOL True = TRUE;

/* Sinais */
void Signal( int s )
{
	char msg[] = "\nCTRL+C pressionado...Aguarde.";

	write( STDOUT, (void *)msg, strlen( msg ) );
	True = FALSE;
}

/* Funcoes */
void Error( char *msg )
{
	perror( msg );
	exit( 1 );
}

void Print( void )
{
	int i;

	printf( "\n[" );

	for( i = 0; i < N; i++ )
		printf( " %d: %s ", i+1, states[state[i]] );

	printf( "]" );
	fflush( stdout );
}

/* Thread */
void Philosopher( void *f )
{
	int i = *(int *)f;

	while( True )
	{
		Think();
		TakeForks( i );
		Eat();
	PutForks( i );
	}

	pthread_exit( (void *)NULL );
}

/* Funções */
void Eat( void )
{
	/* Aguarda de 1 a 10 segundos */
	sleep( MIN + (int)( (float)MAX * rand() / ( RAND_MAX + (float)MIN ) ) );
}

void Think( void )
{
	/* Aguarda de 1 a 10 segundos */
	sleep( MIN + (int)( (float)MAX * rand() / ( RAND_MAX + (float)MIN ) ) );
}

void TakeForks( int i )
{
	DOWN( &mutex );
	state[i] = HUNGRY;

	Print();

	Test( i );
	UP( &mutex );
	DOWN( &s[i] );
}

void PutForks( int i )
{
	DOWN( &mutex );
	state[i] = THINKING;

	Print();

	Test( LEFT );
	Test( RIGHT );
	UP( &mutex );
}

void Test( int i )
{
	if( state[i] == HUNGRY && state[LEFT]!= EATING && state[RIGHT] != EATING )
	{
		state[i] = EATING;

		Print();

	UP( &s[i] );
	}
}

int main( void )
{
	int i;
	int philosophers[] = { 0, 1, 2, 3, 4 };
	void *ret_val;
	void (*oldhandler)(int);
	pthread_t ptPhilosopher[N];

	printf( "\nPressione CTRL+C para terminar...\n");
	Print();

	/* Tratar CTRL+C */
	oldhandler = signal( SIGINT, (void (*)( int ))Signal );

	/* Inicializa gerador randomico */
	srand( time( NULL ) );

	/* Inicializar mutex - valor inicial: 1 ) */
	pthread_mutex_init( &mutex, (pthread_mutexattr_t *)NULL );

	/* Inicializar mutexes - valor inicial: 0 */
	for( i = 0; i < N; i++ )
	{
		pthread_mutex_init( &s[i], (pthread_mutexattr_t *)NULL );
		DOWN( &s[i] );
	}

	/* Criar threads (filosofos) */
	for( i = 0; i < N; i++ )
		if( pthread_create( &ptPhilosopher[i], (pthread_attr_t *)NULL, (void * (*)( void *))Philosopher, (void *)&philosophers[i] ) != 0 )
			Error( "pthread_create( ... )" );

	/* Aguardar threads (filosofos) terminarem */
	for( i = 0; i < N; i++ )
		if( pthread_join( ptPhilosopher[i], &ret_val ) != 0 )
			Error( "pthread_join( ... )" );

	/* Liberar mutex */
	if( pthread_mutex_destroy( &mutex ) != 0 )
		Error( "pthread_mutex_destroy( &mutex )" );

	/* Liberar mutexes */
	for( i = 0; i < N; i++ )
	{
		/* Definir valor dos mutexes para 1 antes de libera-los */
		UP( &s[i] );

		if( pthread_mutex_destroy( &s[i] ) != 0 )
			Error( "pthread_mutex_destroy( &s[i] )" );
	}

	/* Restaurar manipulador padrão */
	signal( SIGINT, oldhandler );

	printf( "\n\nFim.\n\n" );

	return 0;
}

