/*
  filosofos.h
*/

#ifndef __FILOSOFO_H
#define __FILOSOFO_H

// Inclusões
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <unistd.h>
#include <signal.h>
#include <pthread.h>

/* Definições */
#define BOOL  int
#define TRUE  1
#define FALSE 0

#define MIN      1
#define MAX      10
#define N        5
#define LEFT     ((N+i-1)%N)
#define RIGHT    ((i+1)%N)
#define THINKING 0
#define HUNGRY   1
#define EATING   2

#define STDOUT   1

#define DOWN(i) pthread_mutex_lock(i)
#define UP(i)   pthread_mutex_unlock(i)

/* Definições de tipos */
typedef pthread_mutex_t semaphore;

/* Protótipos */
void Error( char * );
void Signal( int );
void Print( void );
void Philosopher( void * );
void Eat( void );
void Think( void );
void TakeForks( int );
void PutForks( int );
void Test( int );

#endif // __FILOSOFO_H
