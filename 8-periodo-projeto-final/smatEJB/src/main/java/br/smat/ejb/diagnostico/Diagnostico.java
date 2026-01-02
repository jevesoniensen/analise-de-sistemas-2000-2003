package br.smat.ejb.diagnostico;
/**
 * Remote interface for Enterprise Bean: Diagnostico
 */
public interface Diagnostico extends javax.ejb.EJBObject {
	/**
	 * Returns the cid10.
	 * @return int
	 */
	public int getCid10() throws java.rmi.RemoteException;
	/**
	 * Returns the diagnostico.
	 * @return int
	 */
	public int getDiagnostico() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Sets the cid10.
	 * @param cid10 The cid10 to set
	 */
	public void setCid10(int cid10) throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
}
