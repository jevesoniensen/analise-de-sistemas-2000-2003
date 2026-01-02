package br.smat.controleacesso.ejb.grupo;
/**
 * Remote interface for Enterprise Bean: Grupo
 */
public interface Grupo extends javax.ejb.EJBObject {
	/**
	 * Returns the grupo.
	 * @return int
	 */
	public int getGrupo() throws java.rmi.RemoteException;
	/**
	 * Returns the modulos.
	 * @return int
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Sets the grupo.
	 * @param grupo The grupo to set
	 */
	public void setGrupo(int grupo) throws java.rmi.RemoteException;
	/**
	 * Sets the modulos.
	 * @param modulos The modulos to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
}
