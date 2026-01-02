package br.smat.ejb.monitor;
import br.smat.ejb.campo.CampoKey;
/**
 * Remote interface for Enterprise Bean: Monitor
 */
public interface Monitor extends javax.ejb.EJBObject {
	public int getNumAcidentes() throws java.rmi.RemoteException;
	/**
	 * Returns the campo.
	 * @return CampoKey
	 */
	public CampoKey getCampo() throws java.rmi.RemoteException;
	/**
	 * Returns the maxAcidente.
	 * @return int
	 */
	public int getMaxAcidente() throws java.rmi.RemoteException;
	/**
	 * Returns the monitor.
	 * @return int
	 */
	public int getMonitor() throws java.rmi.RemoteException;
	/**
	 * Returns the periodicidade.
	 * @return int
	 */
	public int getPeriodicidade() throws java.rmi.RemoteException;
	/**
	 * Returns the queryCampo.
	 * @return int
	 */
	public int getQueryCampo() throws java.rmi.RemoteException;
	/**
	 * Returns the ultimaDataExecucao.
	 * @return String
	 */
	public String getUltimaDataExecucao() throws java.rmi.RemoteException;
	/**
	 * Sets the campo.
	 * @param campo The campo to set
	 */
	public void setCampo(CampoKey campo) throws java.rmi.RemoteException;
	/**
	 * Sets the maxAcidente.
	 * @param maxAcidente The maxAcidente to set
	 */
	public void setMaxAcidente(int maxAcidente)
		throws java.rmi.RemoteException;
	/**
	 * Sets the periodicidade.
	 * @param periodicidade The periodicidade to set
	 */
	public void setPeriodicidade(int periodicidade)
		throws java.rmi.RemoteException;
	/**
	 * Sets the queryCampo.
	 * @param queryCampo The queryCampo to set
	 */
	public void setQueryCampo(int queryCampo) throws java.rmi.RemoteException;
	/**
	 * Sets the ultimaDataExecucao.
	 * @param ultimaDataExecucao The ultimaDataExecucao to set
	 */
	public void setUltimaDataExecucao(String ultimaDataExecucao)
		throws java.rmi.RemoteException;
}
