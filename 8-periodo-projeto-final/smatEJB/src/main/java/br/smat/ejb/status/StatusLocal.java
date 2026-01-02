package br.smat.ejb.status;
/**
 * Local interface for Enterprise Bean: Status
 */
public interface StatusLocal extends javax.ejb.EJBLocalObject {
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
	 * Returns the status.
	 * @return int
	 */
	public int getStatus();
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
