package br.smat.ejb.fonte;
/**
 * Remote interface for Enterprise Bean: Fonte
 */
public interface Fonte extends javax.ejb.EJBObject {
	
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;

	/**
	 * Returns the fonte.
	 * @return int
	 */
	public int getFonte() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;


}
