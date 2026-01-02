package br.smat.controleacesso.ejb.pagina;
/**
 * Remote interface for Enterprise Bean: Pagina
 */
public interface Pagina extends javax.ejb.EJBObject {
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the pagina.
	 * @return int
	 */
	public int getPagina() throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
}
