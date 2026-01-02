package br.smat.objetosauxiliares.auxlistinvestigacao;

import java.io.Serializable;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */

public class AuxListInvestigacao implements Serializable {
	
	private int 	investigacao = 0;
	private int 	agenteSaude = 0;
	private String	nomeAgenteSaude = null;
	private String	motivo = null;
	private int 	trabalhador = 0;
	private String	nomeTrabalhador = null;
	private String	dataAcidente = null;
	private String	dataAbertura = null;
	private String	dataFinalizacao = null;

	
	public AuxListInvestigacao(int 	investigacao,
								int 	agenteSaude,
								String	nomeAgenteSaude,
								String	motivo,
								int 	trabalhador,
								String	nomeTrabalhador,
								String	dataAcidente,
								String	dataAbertura,
								String	dataFinalizacao){
									
		this.investigacao = investigacao;
		this.agenteSaude = agenteSaude;
		this.nomeAgenteSaude = nomeAgenteSaude;
		this.motivo = motivo;
		this.trabalhador = trabalhador;
		this.nomeTrabalhador = nomeTrabalhador;
		this.dataAcidente = dataAcidente;
		this.dataAbertura = dataAbertura;
		this.dataFinalizacao = dataFinalizacao;
	}


	/**
	 * Returns the agenteSaude.
	 * @return int
	 */
	public int getAgenteSaude() {
		return agenteSaude;
	}

	/**
	 * Returns the dataAbertura.
	 * @return String
	 */
	public String getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * Returns the dataAcidente.
	 * @return String
	 */
	public String getDataAcidente() {
		return dataAcidente;
	}

	/**
	 * Returns the dataFinalizacao.
	 * @return String
	 */
	public String getDataFinalizacao() {
		return dataFinalizacao;
	}

	/**
	 * Returns the investigacao.
	 * @return int
	 */
	public int getInvestigacao() {
		return investigacao;
	}

	/**
	 * Returns the motivo.
	 * @return String
	 */
	public String getMotivo() {
		return motivo;
	}

	/**
	 * Returns the nomeAgenteSaude.
	 * @return String
	 */
	public String getNomeAgenteSaude() {
		return nomeAgenteSaude;
	}

	/**
	 * Returns the nomeTrabalhador.
	 * @return String
	 */
	public String getNomeTrabalhador() {
		return nomeTrabalhador;
	}

	/**
	 * Returns the trabalhador.
	 * @return int
	 */
	public int getTrabalhador() {
		return trabalhador;
	}

	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(int agenteSaude) {
		this.agenteSaude = agenteSaude;
	}

	/**
	 * Sets the dataAbertura.
	 * @param dataAbertura The dataAbertura to set
	 */
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	/**
	 * Sets the dataAcidente.
	 * @param dataAcidente The dataAcidente to set
	 */
	public void setDataAcidente(String dataAcidente) {
		this.dataAcidente = dataAcidente;
	}

	/**
	 * Sets the dataFinalizacao.
	 * @param dataFinalizacao The dataFinalizacao to set
	 */
	public void setDataFinalizacao(String dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	/**
	 * Sets the investigacao.
	 * @param investigacao The investigacao to set
	 */
	public void setInvestigacao(int investigacao) {
		this.investigacao = investigacao;
	}

	/**
	 * Sets the motivo.
	 * @param motivo The motivo to set
	 */
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	/**
	 * Sets the nomeAgenteSaude.
	 * @param nomeAgenteSaude The nomeAgenteSaude to set
	 */
	public void setNomeAgenteSaude(String nomeAgenteSaude) {
		this.nomeAgenteSaude = nomeAgenteSaude;
	}

	/**
	 * Sets the nomeTrabalhador.
	 * @param nomeTrabalhador The nomeTrabalhador to set
	 */
	public void setNomeTrabalhador(String nomeTrabalhador) {
		this.nomeTrabalhador = nomeTrabalhador;
	}

	/**
	 * Sets the trabalhador.
	 * @param trabalhador The trabalhador to set
	 */
	public void setTrabalhador(int trabalhador) {
		this.trabalhador = trabalhador;
	}

}
