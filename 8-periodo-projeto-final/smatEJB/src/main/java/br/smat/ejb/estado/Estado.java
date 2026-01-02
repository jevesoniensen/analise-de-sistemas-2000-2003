package br.smat.ejb.estado;
/**
 * Remote interface for Enterprise Bean: Estado
 */
public interface Estado extends javax.ejb.EJBObject {
	/**
	 * Sets the sigla.
	 * @param sigla The sigla to set
	 */
	public void setSigla(String sigla) throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(int estado) throws java.rmi.RemoteException;
	/**
	 * Returns the sigla.
	 * @return String
	 */
	public String getSigla() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the estado.
	 * @return int
	 */
	public int getEstado() throws java.rmi.RemoteException;
}
