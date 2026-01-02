package br.smat.ejb.itemfiscalizacao;
/**
 * Local interface for Enterprise Bean: ItemFiscalizacao
 */
public interface ItemFiscalizacaoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Returns the itemFiscalizacao.
	 * @return int
	 */
	public int getItemFiscalizacao();
}
