package br.smat.ejb.diagnostico;
/**
 * Local interface for Enterprise Bean: Diagnostico
 */
public interface DiagnosticoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the cid10.
	 * @return int
	 */
	public int getCid10();
	/**
	 * Returns the diagnostico.
	 * @return int
	 */
	public int getDiagnostico();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Sets the cid10.
	 * @param cid10 The cid10 to set
	 */
	public void setCid10(int cid10);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
}
