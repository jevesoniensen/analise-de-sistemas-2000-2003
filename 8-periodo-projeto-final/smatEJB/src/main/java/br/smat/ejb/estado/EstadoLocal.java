package br.smat.ejb.estado;
/**
 * Local interface for Enterprise Bean: Estado
 */
public interface EstadoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Sets the sigla.
	 * @param sigla The sigla to set
	 */
	public void setSigla(String sigla);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(int estado);
	/**
	 * Returns the sigla.
	 * @return String
	 */
	public String getSigla();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the estado.
	 * @return int
	 */
	public int getEstado();
}
