package br.smat.ejb.monitor;
import br.smat.ejb.campo.CampoKey;
/**
 * Local interface for Enterprise Bean: Monitor
 */
public interface MonitorLocal extends javax.ejb.EJBLocalObject {
	public int getNumAcidentes();
	/**
	 * Returns the campo.
	 * @return CampoKey
	 */
	public CampoKey getCampo();
	/**
	 * Returns the maxAcidente.
	 * @return int
	 */
	public int getMaxAcidente();
	/**
	 * Returns the monitor.
	 * @return int
	 */
	public int getMonitor();
	/**
	 * Returns the periodicidade.
	 * @return int
	 */
	public int getPeriodicidade();
	/**
	 * Returns the queryCampo.
	 * @return int
	 */
	public int getQueryCampo();
	/**
	 * Returns the ultimaDataExecucao.
	 * @return String
	 */
	public String getUltimaDataExecucao();
	/**
	 * Sets the campo.
	 * @param campo The campo to set
	 */
	public void setCampo(CampoKey campo);
	/**
	 * Sets the maxAcidente.
	 * @param maxAcidente The maxAcidente to set
	 */
	public void setMaxAcidente(int maxAcidente);
	/**
	 * Sets the periodicidade.
	 * @param periodicidade The periodicidade to set
	 */
	public void setPeriodicidade(int periodicidade);
	/**
	 * Sets the queryCampo.
	 * @param queryCampo The queryCampo to set
	 */
	public void setQueryCampo(int queryCampo);
	/**
	 * Sets the ultimaDataExecucao.
	 * @param ultimaDataExecucao The ultimaDataExecucao to set
	 */
	public void setUltimaDataExecucao(String ultimaDataExecucao);
}
