package br.smat.ejb.tipodepoimento;
/**
 * Local interface for Enterprise Bean: TipoDepoimento
 */
public interface TipoDepoimentoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the nome.
	 * @return int
	 */
	public String getNome();
	/**
	 * Returns the tipoDepoimento.
	 * @return int
	 */
	public int getTipoDepoimento();
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
}
