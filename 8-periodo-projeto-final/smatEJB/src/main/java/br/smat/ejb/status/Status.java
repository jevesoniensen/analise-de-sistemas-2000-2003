package br.smat.ejb.status;
/**
 * Remote interface for Enterprise Bean: Status
 */
public interface Status extends javax.ejb.EJBObject {
	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the status.
	 * @return int
	 */
	public int getStatus() throws java.rmi.RemoteException;
	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
}
