package br.smat.ejb.ocupacao;
/**
 * Local interface for Enterprise Bean: Ocupacao
 */
public interface OcupacaoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the cbo.
	 * @param cbo The cbo to set
	 */
	public void setCbo(int cbo);
	/**
	 * Returns the ocupacao.
	 * @return int
	 */
	public int getOcupacao();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the cbo.
	 * @return int
	 */
	public int getCbo();
}
