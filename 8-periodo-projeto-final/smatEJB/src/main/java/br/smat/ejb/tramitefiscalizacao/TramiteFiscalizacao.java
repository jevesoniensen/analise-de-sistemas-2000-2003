package br.smat.ejb.tramitefiscalizacao;
import br.smat.ejb.fiscalizacao.FiscalizacaoKey;
import br.smat.ejb.status.StatusKey;
/**
 * Remote interface for Enterprise Bean: TramiteFiscalizacao
 */
public interface TramiteFiscalizacao extends javax.ejb.EJBObject {
	/**
	 * Returns the data.
	 * @return String
	 */
	public String getData() throws java.rmi.RemoteException;
	/**
	 * Returns the fiscalizacao.
	 * @return FiscalizacaoKey
	 */
	public FiscalizacaoKey getFiscalizacao() throws java.rmi.RemoteException;
	/**
	 * Returns the status.
	 * @return StatusKey
	 */
	public StatusKey getStatus() throws java.rmi.RemoteException;
	/**
	 * Returns the tramiteFiscalizacao.
	 * @return int
	 */
	public int getTramiteFiscalizacao() throws java.rmi.RemoteException;
	/**
	 * Sets the data.
	 * @param data The data to set
	 */
	public void setData(String data) throws java.rmi.RemoteException;
	/**
	 * Sets the fiscalizacao.
	 * @param fiscalizacao The fiscalizacao to set
	 */
	public void setFiscalizacao(FiscalizacaoKey fiscalizacao)
		throws java.rmi.RemoteException;
	/**
	 * Sets the status.
	 * @param status The status to set
	 */
	public void setStatus(StatusKey status) throws java.rmi.RemoteException;
}
