package filosofos;

public class Jantar
{ // detalhes da Interface da Applet

	private Filosofo f0, f1, f2, f3, f4;
	private Garfos fork;

	public Jantar( ) {
		fork = new Garfos( ); // cria objeto garfos
		f0 = new Filosofo(0,this); // cria processos (threads) fil�sofos
		f1 = new Filosofo(1,this);
		f2 = new Filosofo(2,this);
		f3 = new Filosofo(3,this);
		f4 = new Filosofo(4,this);
		f0.start( ); // inicializa cada processo fil�sofo
		f1.start( );
		f2.start( ); 
		f3.start( ); 
		f4.start( );

		Thread monitor = new Thread(() -> {
			while (true) {
				System.out.print(" | Filósofo 0: " + f0.getStatusDesc());
				System.out.print(" | Filósofo 1: " + f1.getStatusDesc());
				System.out.print(" | Filósofo 2: " + f2.getStatusDesc());
				System.out.print(" | Filósofo 3: " + f3.getStatusDesc());
				System.out.print(" | Filósofo 4: " + f4.getStatusDesc());
				System.out.println(" | ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		monitor.start();
	}
	
	public Garfos getFork() {
		return fork;
	}
	
	public static void main(String[] args) {
		new Jantar();
	}
}