package br.smat.ejb.tipolocalacidente;
/**
 * Remote interface for Enterprise Bean: TipoLocalAcidente
 */
public interface TipoLocalAcidente extends javax.ejb.EJBObject {
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the tipoLocalAcidente.
	 * @return int
	 */
	public int getTipoLocalAcidente() throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
}
