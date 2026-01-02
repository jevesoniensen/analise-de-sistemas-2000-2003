package br.smat.ejb.roteiros;
import br.smat.ejb.grauconformidade.GrauConformidadeKey;
import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey;
/**
 * Remote interface for Enterprise Bean: Roteiros
 */
public interface Roteiros extends javax.ejb.EJBObject {
	/**
	 * Returns the grauConformidade.
	 * @return GrauConformidadeKey
	 */
	public GrauConformidadeKey getGrauConformidade()
		throws java.rmi.RemoteException;
	/**
	 * Returns the itemFiscalizacao.
	 * @return ItemFiscalizacaoKey
	 */
	public ItemFiscalizacaoKey getItemFiscalizacao()
		throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the tramiteFiscalizacao.
	 * @return TramiteFiscalizacaoKey
	 */
	public TramiteFiscalizacaoKey getTramiteFiscalizacao()
		throws java.rmi.RemoteException;
	/**
	 * Sets the grauConformidade.
	 * @param grauConformidade The grauConformidade to set
	 */
	public void setGrauConformidade(GrauConformidadeKey grauConformidade)
		throws java.rmi.RemoteException;
	/**
	 * Sets the itemFiscalizacao.
	 * @param itemFiscalizacao The itemFiscalizacao to set
	 */
	public void setItemFiscalizacao(ItemFiscalizacaoKey itemFiscalizacao)
		throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Sets the tramiteFiscalizacao.
	 * @param tramiteFiscalizacao The tramiteFiscalizacao to set
	 */
	public void setTramiteFiscalizacao(TramiteFiscalizacaoKey tramiteFiscalizacao)
		throws java.rmi.RemoteException;
}
