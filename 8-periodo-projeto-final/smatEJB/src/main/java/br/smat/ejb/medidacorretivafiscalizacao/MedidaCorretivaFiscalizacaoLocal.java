package br.smat.ejb.medidacorretivafiscalizacao;
import br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey;
/**
 * Local interface for Enterprise Bean: MedidaCorretivaFiscalizacao
 */
public interface MedidaCorretivaFiscalizacaoLocal
	extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the tipoMedidaCorretiva.
	 * @return TipoMedidaCorretivaKey
	 */
	public TipoMedidaCorretivaKey getTipoMedidaCorretiva();
	/**
	 * Returns the tramiteFiscalizacao.
	 * @return TramiteFiscalizacaoKey
	 */
	public TramiteFiscalizacaoKey getTramiteFiscalizacao();
	/**
	 * Sets the tipoMedidaCorretiva.
	 * @param tipoMedidaCorretiva The tipoMedidaCorretiva to set
	 */
	public void setTipoMedidaCorretiva(TipoMedidaCorretivaKey tipoMedidaCorretiva);
	/**
	 * Sets the tramiteFiscalizacao.
	 * @param tramiteFiscalizacao The tramiteFiscalizacao to set
	 */
	public void setTramiteFiscalizacao(TramiteFiscalizacaoKey tramiteFiscalizacao);
	/**
	 * Returns the observacao.
	 * @return String
	 */
	public String getObservacao();
	/**
	 * Returns the prazoDias.
	 * @return String
	 */
	public int getPrazoDias();
	/**
	 * Sets the observacao.
	 * @param observacao The observacao to set
	 */
	public void setObservacao(String observacao);
	/**
	 * Sets the prazoDias.
	 * @param prazoDias The prazoDias to set
	 */
	public void setPrazoDias(int prazoDias);
}
