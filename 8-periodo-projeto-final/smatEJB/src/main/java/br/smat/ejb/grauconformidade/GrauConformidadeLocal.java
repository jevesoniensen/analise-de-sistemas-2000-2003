package br.smat.ejb.grauconformidade;
/**
 * Local interface for Enterprise Bean: GrauConformidade
 */
public interface GrauConformidadeLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao();
	/**
	 * Returns the grauConformidade.
	 * @return int
	 */
	public int getGrauConformidade();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
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
