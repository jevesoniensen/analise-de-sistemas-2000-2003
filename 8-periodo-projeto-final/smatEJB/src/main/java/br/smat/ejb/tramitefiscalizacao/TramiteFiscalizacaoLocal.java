package br.smat.ejb.tramitefiscalizacao;
import br.smat.ejb.fiscalizacao.FiscalizacaoKey;
import br.smat.ejb.status.StatusKey;
/**
 * Local interface for Enterprise Bean: TramiteFiscalizacao
 */
public interface TramiteFiscalizacaoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the data.
	 * @return String
	 */
	public String getData();
	/**
	 * Returns the fiscalizacao.
	 * @return FiscalizacaoKey
	 */
	public FiscalizacaoKey getFiscalizacao();
	/**
	 * Returns the status.
	 * @return StatusKey
	 */
	public StatusKey getStatus();
	/**
	 * Returns the tramiteFiscalizacao.
	 * @return int
	 */
	public int getTramiteFiscalizacao();
	/**
	 * Sets the data.
	 * @param data The data to set
	 */
	public void setData(String data);
	/**
	 * Sets the fiscalizacao.
	 * @param fiscalizacao The fiscalizacao to set
	 */
	public void setFiscalizacao(FiscalizacaoKey fiscalizacao);
	/**
	 * Sets the status.
	 * @param status The status to set
	 */
	public void setStatus(StatusKey status);
}
