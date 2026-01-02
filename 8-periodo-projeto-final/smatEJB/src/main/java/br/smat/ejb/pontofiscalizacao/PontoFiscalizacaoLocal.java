package br.smat.ejb.pontofiscalizacao;
/**
 * Local interface for Enterprise Bean: PontoFiscalizacao
 */
public interface PontoFiscalizacaoLocal extends javax.ejb.EJBLocalObject {
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
	 * Returns the pontoFiscalizacao.
	 * @return int
	 */
	public int getPontoFiscalizacao();
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
