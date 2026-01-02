package br.smat.ejb.roteiros;
import br.smat.ejb.grauconformidade.GrauConformidadeKey;
import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey;
/**
 * Local interface for Enterprise Bean: Roteiros
 */
public interface RoteirosLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the grauConformidade.
	 * @return GrauConformidadeKey
	 */
	public GrauConformidadeKey getGrauConformidade();
	/**
	 * Returns the itemFiscalizacao.
	 * @return ItemFiscalizacaoKey
	 */
	public ItemFiscalizacaoKey getItemFiscalizacao();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the tramiteFiscalizacao.
	 * @return TramiteFiscalizacaoKey
	 */
	public TramiteFiscalizacaoKey getTramiteFiscalizacao();
	/**
	 * Sets the grauConformidade.
	 * @param grauConformidade The grauConformidade to set
	 */
	public void setGrauConformidade(GrauConformidadeKey grauConformidade);
	/**
	 * Sets the itemFiscalizacao.
	 * @param itemFiscalizacao The itemFiscalizacao to set
	 */
	public void setItemFiscalizacao(ItemFiscalizacaoKey itemFiscalizacao);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the tramiteFiscalizacao.
	 * @param tramiteFiscalizacao The tramiteFiscalizacao to set
	 */
	public void setTramiteFiscalizacao(TramiteFiscalizacaoKey tramiteFiscalizacao);
}
