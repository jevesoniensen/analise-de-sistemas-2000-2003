package br.smat.objetosauxiliares.auxmonitor;

import java.io.Serializable;
import javax.sound.midi.Synthesizer;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxMonitor implements Serializable{

	private int 		monitor;
	private int 		periodicidade;
	private int	 	campo;		
	private String		nomeCampo;
	private int		queryCampo;	
	private String		nomeRegistro;
	private int		maxAcidente;
	private String		ultimaDataExecucao;	
	
	/**
	 * Constructor for AuxMonitor.
	 */
	public AuxMonitor() {
		super();
	}
	
	public AuxMonitor(	int	monitor,
						int 	periodicidade,
					 	int	campo,
					 	int 	queryCampo,
					 	int 	maxAcidente,
					 	String	ultimaDataExecucao,
					 	String	nomeCampo,
					 	String	nomeRegistro) {
		super();
		this.monitor 				= monitor;
		this.periodicidade 		= periodicidade;
		this.campo					= campo;
		this.queryCampo 			= queryCampo;
		this.maxAcidente 			= maxAcidente;
		this.ultimaDataExecucao 	= ultimaDataExecucao;		
		this.nomeCampo				= nomeCampo;
		this.nomeRegistro			= nomeRegistro;
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
	 * Returns the nomeCampo.
	 * @return String
	 */
	public String getNomeCampo() {
		return nomeCampo;
	}

	/**
	 * Returns the nomeRegistro.
	 * @return String
	 */
	public String getNomeRegistro() {
		return nomeRegistro;
	}

	/**
	 * Sets the nomeCampo.
	 * @param nomeCampo The nomeCampo to set
	 */
	public void setNomeCampo(String nomeCampo) {
		this.nomeCampo = nomeCampo;
	}

	/**
	 * Sets the nomeRegistro.
	 * @param nomeRegistro The nomeRegistro to set
	 */
	public void setNomeRegistro(String nomeRegistro) {
		this.nomeRegistro = nomeRegistro;
	}

}
