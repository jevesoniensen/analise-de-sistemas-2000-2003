package br.smat.ejb.tipomedidacorretiva;
/**
 * Local interface for Enterprise Bean: TipoMedidaCorretiva
 */
public interface TipoMedidaCorretivaLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the tipoMedidaCorretiva.
	 * @return int
	 */
	public int getTipoMedidaCorretiva();
	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
}
