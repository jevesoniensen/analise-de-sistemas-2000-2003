package br.smat.ejb.pontofiscalizacaoitemfiscalizacao;
import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey;
import br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey;
/**
 * Local interface for Enterprise Bean: PontoFiscalizacaoItemFiscalizacao
 */
public interface PontoFiscalizacaoItemFiscalizacaoLocal
	extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the itemFiscalizacao.
	 * @return ItemFiscalizacaoKey
	 */
	public ItemFiscalizacaoKey getItemFiscalizacao();
	/**
	 * Returns the pontoFiscalizacao.
	 * @return PontoFiscalizacaoKey
	 */
	public PontoFiscalizacaoKey getPontoFiscalizacao();
	/**
	 * Sets the itemFiscalizacao.
	 * @param itemFiscalizacao The itemFiscalizacao to set
	 */
	public void setItemFiscalizacao(ItemFiscalizacaoKey itemFiscalizacao);
	/**
	 * Sets the pontoFiscalizacao.
	 * @param pontoFiscalizacao The pontoFiscalizacao to set
	 */
	public void setPontoFiscalizacao(PontoFiscalizacaoKey pontoFiscalizacao);
}
