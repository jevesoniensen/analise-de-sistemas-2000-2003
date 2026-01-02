package br.smat.ejb.medico;
import br.smat.ejb.estado.EstadoKey;
/**
 * Local interface for Enterprise Bean: Medico
 */
public interface MedicoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the crm.
	 * @return int
	 */
	public int getCrm();
	/**
	 * Returns the medico.
	 * @return int
	 */
	public int getMedico();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the ufCRM.
	 * @return EstadoKey
	 */
	public EstadoKey getUfCRM();
	/**
	 * Sets the crm.
	 * @param crm The crm to set
	 */
	public void setCrm(int crm);

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the ufCRM.
	 * @param ufCRM The ufCRM to set
	 */
	public void setUfCRM(EstadoKey ufCRM);
}
