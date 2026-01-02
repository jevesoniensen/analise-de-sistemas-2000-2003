package br.smat.ejb.medidacorretivainvestigacao;
import br.smat.ejb.investigacao.InvestigacaoKey;
import br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey;
/**
 * Remote interface for Enterprise Bean: MedidaCorretivaInvestigacao
 */
public interface MedidaCorretivaInvestigacao extends javax.ejb.EJBObject {
	/**
	 * Returns the investigacao.
	 * @return InvestigacaoKey
	 */
	public InvestigacaoKey getInvestigacao() throws java.rmi.RemoteException;
	/**
	 * Returns the observacao.
	 * @return String
	 */
	public String getObservacao() throws java.rmi.RemoteException;
	/**
	 * Returns the prazoDias.
	 * @return int
	 */
	public int getPrazoDias() throws java.rmi.RemoteException;
	/**
	 * Returns the tipoMedidaCorretiva.
	 * @return TipoMedidaCorretivaKey
	 */
	public TipoMedidaCorretivaKey getTipoMedidaCorretiva()
		throws java.rmi.RemoteException;
	/**
	 * Sets the investigacao.
	 * @param investigacao The investigacao to set
	 */
	public void setInvestigacao(InvestigacaoKey investigacao)
		throws java.rmi.RemoteException;
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
	/**
	 * Sets the tipoMedidaCorretiva.
	 * @param tipoMedidaCorretiva The tipoMedidaCorretiva to set
	 */
	public void setTipoMedidaCorretiva(TipoMedidaCorretivaKey tipoMedidaCorretiva)
		throws java.rmi.RemoteException;
}
