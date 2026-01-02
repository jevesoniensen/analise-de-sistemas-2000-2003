package filosofos;

import static filosofos.Filosofo.*;

public class Garfos {
	private final boolean[] monitor = new boolean[5]; //vetor de garfos - True(em uso) False(liberado)

	/**
	 * método para pegar os 2 garfos (sincronizado)
	 * @param filosofo
	 */
	public synchronized void pegaGarfos(Filosofo filosofo) {

		int key = filosofo.getFilosofoId();
		while (monitor[key] || monitor[((key +1)%5)]) {
			//enquanto o seu garfo ou o do seu vizinho da direita estiver em uso espera até o(s) garfo(s) ser(em) liberado(s).
			filosofo.setStatus(FAMINTO);
			try{wait( );}
			catch(Exception e){}
		} 
		monitor[key] = true;
		monitor[((key +1)%5)] = true;
		filosofo.setStatus(COMENDO); //passa para o estado COMENDO
	}

	/**
	 * método para liberar os 2 garfos pegos (sincronizado)
	 * @param filosofo
	 */
	public synchronized void liberaGarfos(Filosofo filosofo) {
			int key = filosofo.getFilosofoId();
			monitor[key] = false; //libera o seu garfo e o de seu vizinho da direita
			filosofo.setStatus(PENSANDO);
			int aux = (key+1)%5;
			monitor[aux] = false;
			try{notifyAll( );} //notifica que liberou os garfos
			catch(Exception e){} 
	}
} 

