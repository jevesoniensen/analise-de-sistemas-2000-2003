package br.smat.ejb.area;
/**
 * Remote interface for Enterprise Bean: Area
 */
public interface Area extends javax.ejb.EJBObject {
	/**
	 * Returns the area.
	 * @return int
	 */
	public int getArea() throws java.rmi.RemoteException;
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
