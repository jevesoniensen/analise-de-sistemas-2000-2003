package br.smat.ejb.medico;
import br.smat.ejb.estado.EstadoKey;
/**
 * Remote interface for Enterprise Bean: Medico
 */
public interface Medico extends javax.ejb.EJBObject {
	/**
	 * Returns the crm.
	 * @return int
	 */
	public int getCrm() throws java.rmi.RemoteException;
	/**
	 * Returns the medico.
	 * @return int
	 */
	public int getMedico() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the ufCRM.
	 * @return EstadoKey
	 */
	public EstadoKey getUfCRM() throws java.rmi.RemoteException;
	/**
	 * Sets the crm.
	 * @param crm The crm to set
	 */
	public void setCrm(int crm) throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Sets the ufCRM.
	 * @param ufCRM The ufCRM to set
	 */
	public void setUfCRM(EstadoKey ufCRM) throws java.rmi.RemoteException;
}
