package br.smat.ejb.estadocivil;
/**
 * Remote interface for Enterprise Bean: EstadoCivil
 */
public interface EstadoCivil extends javax.ejb.EJBObject {
	/**
	 * Returns the estadoCivil.
	 * @return int
	 */
	public int getEstadoCivil() throws java.rmi.RemoteException;
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
	/**
	 * Sets the estadoCivil.
	 * @param estadoCivil The estadoCivil to set
	 */
	public void setEstadoCivil(int estadoCivil)
		throws java.rmi.RemoteException;
}
