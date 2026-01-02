package br.smat.ejb.vinculoempregaticio;
/**
 * Local interface for Enterprise Bean: VinculoEmpregaticio
 */
public interface VinculoEmpregaticioLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the vinculoEmpregaticio.
	 * @return int
	 */
	public int getVinculoEmpregaticio();
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
}
