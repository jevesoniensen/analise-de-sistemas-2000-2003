package br.smat.ejb.pontofiscalizacaoitemfiscalizacao;
import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey;
import br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey;
/**
 * Remote interface for Enterprise Bean: PontoFiscalizacaoItemFiscalizacao
 */
public interface PontoFiscalizacaoItemFiscalizacao
	extends javax.ejb.EJBObject {
	/**
	 * Returns the itemFiscalizacao.
	 * @return ItemFiscalizacaoKey
	 */
	public ItemFiscalizacaoKey getItemFiscalizacao()
		throws java.rmi.RemoteException;
	/**
	 * Returns the pontoFiscalizacao.
	 * @return PontoFiscalizacaoKey
	 */
	public PontoFiscalizacaoKey getPontoFiscalizacao()
		throws java.rmi.RemoteException;
	/**
	 * Sets the itemFiscalizacao.
	 * @param itemFiscalizacao The itemFiscalizacao to set
	 */
	public void setItemFiscalizacao(ItemFiscalizacaoKey itemFiscalizacao)
		throws java.rmi.RemoteException;
	/**
	 * Sets the pontoFiscalizacao.
	 * @param pontoFiscalizacao The pontoFiscalizacao to set
	 */
	public void setPontoFiscalizacao(PontoFiscalizacaoKey pontoFiscalizacao)
		throws java.rmi.RemoteException;
}
