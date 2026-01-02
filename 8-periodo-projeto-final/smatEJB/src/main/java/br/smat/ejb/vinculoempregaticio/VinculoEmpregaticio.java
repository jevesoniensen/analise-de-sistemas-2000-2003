package br.smat.ejb.vinculoempregaticio;
/**
 * Remote interface for Enterprise Bean: VinculoEmpregaticio
 */
public interface VinculoEmpregaticio extends javax.ejb.EJBObject {
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the vinculoEmpregaticio.
	 * @return int
	 */
	public int getVinculoEmpregaticio() throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
}
