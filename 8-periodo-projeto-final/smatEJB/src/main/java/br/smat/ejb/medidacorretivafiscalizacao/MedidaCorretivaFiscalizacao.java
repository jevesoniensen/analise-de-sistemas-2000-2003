package br.smat.ejb.medidacorretivafiscalizacao;
import br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey;
/**
 * Remote interface for Enterprise Bean: MedidaCorretivaFiscalizacao
 */
public interface MedidaCorretivaFiscalizacao extends javax.ejb.EJBObject {
	/**
	 * Returns the tipoMedidaCorretiva.
	 * @return TipoMedidaCorretivaKey
	 */
	public TipoMedidaCorretivaKey getTipoMedidaCorretiva()
		throws java.rmi.RemoteException;
	/**
	 * Returns the tramiteFiscalizacao.
	 * @return TramiteFiscalizacaoKey
	 */
	public TramiteFiscalizacaoKey getTramiteFiscalizacao()
		throws java.rmi.RemoteException;
	/**
	 * Sets the tipoMedidaCorretiva.
	 * @param tipoMedidaCorretiva The tipoMedidaCorretiva to set
	 */
	public void setTipoMedidaCorretiva(TipoMedidaCorretivaKey tipoMedidaCorretiva)
		throws java.rmi.RemoteException;
	/**
	 * Sets the tramiteFiscalizacao.
	 * @param tramiteFiscalizacao The tramiteFiscalizacao to set
	 */
	public void setTramiteFiscalizacao(TramiteFiscalizacaoKey tramiteFiscalizacao)
		throws java.rmi.RemoteException;
	/**
	 * Returns the observacao.
	 * @return String
	 */
	public String getObservacao() throws java.rmi.RemoteException;
	/**
	 * Returns the prazoDias.
	 * @return String
	 */
	public int getPrazoDias() throws java.rmi.RemoteException;
	/**
	 * Sets the observacao.
	 * @param observacao The observacao to set
	 */
	public void setObservacao(String observacao)
		throws java.rmi.RemoteException;
	/**
	 * Sets the prazoDias.
	 * @param prazoDias The prazoDias to set
	 */
	public void setPrazoDias(int prazoDias) throws java.rmi.RemoteException;
}
