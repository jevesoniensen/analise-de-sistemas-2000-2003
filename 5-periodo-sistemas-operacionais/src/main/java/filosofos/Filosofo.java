package filosofos;

public class Filosofo extends Thread
{

	public static final int PENSANDO = 0;
	public static final int COMENDO = 1;
	public static final int FAMINTO = 2;

	private final int filosofoId;
	private final Jantar jantar;
	private int status;

	public Filosofo(int filosofoId, Jantar jantar) {
		this.filosofoId = filosofoId;
		this.jantar = jantar;
	}

	public int getFilosofoId() {
		return filosofoId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
		switch (this.status) {
			case PENSANDO:
					//System.out.println("Filosofo " + filosofoId + " pensando");
					break; 
			case COMENDO:
					//System.out.println("Filosofo " + filosofoId + " Faminto");
					break; 
			case FAMINTO:
					//System.out.println("Filosofo " + filosofoId + " Comendo");
					break; 
		} 
	}

	public String getStatusDesc() {
		switch (this.status) {
			case PENSANDO:
				return "pensando";
			case COMENDO:
				return "faminto ";
			case FAMINTO:
				return "comendo ";
			default:
				return "";
		}
	}


	private void pensando() {
		wait(2000);
	}

	private void comendo() {
		wait(2500);
	} 

	public void run() {
		while(true) {
			setStatus(PENSANDO);
			pensando();
			jantar.getFork().pegaGarfos(this);
			comendo();
			jantar.getFork().liberaGarfos(this);
		}
	}

	private static void wait(int millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
		}
	}
}