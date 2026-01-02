package br.smat.controleacesso.ejb.modulo;

import br.smat.controleacesso.ejb.pagina.PaginaKey;

/**
 * Remote interface for Enterprise Bean: Modulo
 */
public interface Modulo extends javax.ejb.EJBObject {
	/**
	 * Returns the estrutura.
	 * @return String
	 */
	public String getEstrutura() throws java.rmi.RemoteException;
	/**
	 * Returns the modulo.
	 * @return int
	 */
	public int getModulo() throws java.rmi.RemoteException;
	/**
	 * Returns the moduloPai.
	 * @return ModuloKey
	 */
	public ModuloKey getModuloPai() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the paginaDefault.
	 * @return PaginaKey 
	 */
	public PaginaKey getPaginaDefault() throws java.rmi.RemoteException;
	/**
	 * Sets the estrutura.
	 * @param estrutura The estrutura to set
	 */
	public void setEstrutura(String estrutura) throws java.rmi.RemoteException;
	/**
	 * Sets the moduloPai.
	 * @param moduloPai The moduloPai to set
	 */
	public void setModuloPai(ModuloKey moduloPai)
		throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Sets the paginaDefault.
	 * @param paginaDefault The paginaDefault to set
	 */
	public void setPaginaDefault(PaginaKey paginaDefault)
		throws java.rmi.RemoteException;
}
