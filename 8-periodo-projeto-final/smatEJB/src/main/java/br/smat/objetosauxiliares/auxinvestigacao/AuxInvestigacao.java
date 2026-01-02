package br.smat.objetosauxiliares.auxinvestigacao;

import java.io.Serializable;

import br.smat.objetosauxiliares.auxdepoimento.AuxDepoimento;
import br.smat.objetosauxiliares.auxmedidacorretiva.AuxMedidaCorretiva;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxInvestigacao implements Serializable{
	
	private	int			investigacao = 0;
	private	int			agenteSaude = 0;
	private	int			acidente = 0;
	private	String			dataAbertura = null;
	private	String			dataFinalizacao = null;
	private	String			motivo = null;
	private	String			obsGerais = null;
	private	AuxDepoimento[] auxDepoimento = null;
	private	AuxMedidaCorretiva[] auxMedidaCorretivaInvestigacao = null;
	
	
	public AuxInvestigacao( int investigacao,
							 int agenteSaude,
							 int acidente,
							 String	dataAbertura,
							 String	dataFinalizacao,
							 String	motivo,
							 String obsGerais,
							 AuxDepoimento[] auxDepoimento,
							 AuxMedidaCorretiva[] auxMedidaCorretivaInvestigacao){

		this.investigacao = investigacao;
		this.agenteSaude = 	agenteSaude;
		this.acidente = 	 	acidente;
		this.dataAbertura = 	dataAbertura;
		this.dataFinalizacao = dataFinalizacao;
		this.motivo = motivo;
		this.obsGerais = obsGerais;
		this.auxDepoimento = auxDepoimento;
		this.auxMedidaCorretivaInvestigacao = auxMedidaCorretivaInvestigacao;
	}	
	/**
	 * Returns the acidente.
	 * @return int
	 */
	public int getAcidente() {
		return acidente;
	}

	/**
	 * Returns the agenteSaude.
	 * @return int
	 */
	public int getAgenteSaude() {
		return agenteSaude;
	}

	/**
	 * Returns the auxDepoimento.
	 * @return AuxDepoimento[]
	 */
	public AuxDepoimento[] getAuxDepoimento() {
		return auxDepoimento;
	}

	/**
	 * Returns the auxMedidaCorretivaInvestigacao.
	 * @return AuxMedidaCorretiva[]
	 */
	public AuxMedidaCorretiva[] getAuxMedidaCorretiva() {
		return auxMedidaCorretivaInvestigacao;
	}

	/**
	 * Returns the dataAbertura.
	 * @return String
	 */
	public String getDataAbertura() {
		return dataAbertura;
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
	 * Returns the obsGerais.
	 * @return String
	 */
	public String getObsGerais() {
		return obsGerais;
	}

	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(int acidente) {
		this.acidente = acidente;
	}

	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(int agenteSaude) {
		this.agenteSaude = agenteSaude;
	}

	/**
	 * Sets the auxDepoimento.
	 * @param auxDepoimento The auxDepoimento to set
	 */
	public void setAuxDepoimento(AuxDepoimento[] auxDepoimento) {
		this.auxDepoimento = auxDepoimento;
	}

	/**
	 * Sets the auxMedidaCorretivaInvestigacao.
	 * @param auxMedidaCorretivaInvestigacao The auxMedidaCorretivaInvestigacao to set
	 */
	public void setAuxMedidaCorretiva(AuxMedidaCorretiva[] auxMedidaCorretivaInvestigacao) {
		this.auxMedidaCorretivaInvestigacao = auxMedidaCorretivaInvestigacao;
	}

	/**
	 * Sets the dataAbertura.
	 * @param dataAbertura The dataAbertura to set
	 */
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
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
	 * Sets the obsGerais.
	 * @param obsGerais The obsGerais to set
	 */
	public void setObsGerais(String obsGerais) {
		this.obsGerais = obsGerais;
	}

}
