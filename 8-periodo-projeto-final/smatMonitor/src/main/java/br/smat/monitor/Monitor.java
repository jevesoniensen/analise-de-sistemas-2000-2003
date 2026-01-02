package br.smat.monitor;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class Monitor {


	private int 		monitor;
	private int 		periodicidade;
	private int	 	campo;		
	private int		queryCampo;	
	private int		maxAcidente;
	private String		ultimaDataExecucao;	
	
	private MonitorFactory factory;

	/**
	 * Constructor for Monitor.
	 */
	public Monitor(	MonitorFactory factory,
						int	monitor,
						int 	periodicidade,
					 	int	campo,
					 	int 	queryCampo,
					 	int 	maxAcidente,
					 	String	ultimaDataExecucao) {
		super();
		this.factory				= factory;
		this.monitor 				= monitor;
		this.periodicidade 		= periodicidade;
		this.campo					= campo;
		this.queryCampo 			= queryCampo;
		this.maxAcidente 			= maxAcidente;
		this.ultimaDataExecucao 	= ultimaDataExecucao;
	}
	
	public boolean situacaoCritica(){
		return (maxAcidente <= getNumAcidentes()); 
	}
	
	public int getNumAcidentes(){
		
		return factory.getNumAcidentes(monitor);
		
	}

	/**
	 * Returns the campo.
	 * @return int
	 */
	public int getCampo() {
		return campo;
	}

	/**
	 * Returns the maxAcidente.
	 * @return int
	 */
	public int getMaxAcidente() {
		return maxAcidente;
	}

	/**
	 * Returns the monitor.
	 * @return int
	 */
	public int getMonitor() {
		return monitor;
	}

	/**
	 * Returns the periodicidade.
	 * @return int
	 */
	public int getPeriodicidade() {
		return periodicidade;
	}

	/**
	 * Returns the queryCampo.
	 * @return int
	 */
	public int getQueryCampo() {
		return queryCampo;
	}

	/**
	 * Returns the ultimaDataExecucao.
	 * @return String
	 */
	public String getUltimaDataExecucao() {
		return ultimaDataExecucao;
	}

	/**
	 * Sets the campo.
	 * @param campo The campo to set
	 */
	public void setCampo(int campo) {
		this.campo = campo;
	}

	/**
	 * Sets the maxAcidente.
	 * @param maxAcidente The maxAcidente to set
	 */
	public void setMaxAcidente(int maxAcidente) {
		this.maxAcidente = maxAcidente;
	}

	/**
	 * Sets the monitor.
	 * @param monitor The monitor to set
	 */
	public void setMonitor(int monitor) {
		this.monitor = monitor;
	}

	/**
	 * Sets the periodicidade.
	 * @param periodicidade The periodicidade to set
	 */
	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}

	/**
	 * Sets the queryCampo.
	 * @param queryCampo The queryCampo to set
	 */
	public void setQueryCampo(int queryCampo) {
		this.queryCampo = queryCampo;
	}

	/**
	 * Sets the ultimaDataExecucao.
	 * @param ultimaDataExecucao The ultimaDataExecucao to set
	 */
	public void setUltimaDataExecucao(String ultimaDataExecucao) {
		this.ultimaDataExecucao = ultimaDataExecucao;
	}

	/**
	 * Returns the factory.
	 * @return MonitorFactory
	 */
	public MonitorFactory getFactory() {
		return factory;
	}

	/**
	 * Sets the factory.
	 * @param factory The factory to set
	 */
	public void setFactory(MonitorFactory factory) {
		this.factory = factory;
	}

}
