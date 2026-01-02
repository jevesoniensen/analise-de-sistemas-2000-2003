package br.smat.ejb.emitente;
/**
 * Remote interface for Enterprise Bean: Emitente
 */
public interface Emitente extends javax.ejb.EJBObject {
	/**
	 * Returns the emitente.
	 * @return int
	 */
	public int getEmitente() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
}
