package br.smat.objetosauxiliares.auxpontofiscalizacaoramoatividade;

import java.io.Serializable;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxPontoFiscalizacaoRamoAtividade implements Serializable{
	
	public int 	pontoFiscalizacao;
	public int 	ramoAtividade;
	public String	nomeRamoAtividade;
	public String	nomePontoFiscalizacao;
	public String	descricao;

	/**
	 * Returns the nomePontoFiscalizacao.
	 * @return String
	 */
	public String getNomePontoFiscalizacao() {
		return nomePontoFiscalizacao;
	}

	/**
	 * Returns the nomeRamoAtividade.
	 * @return String
	 */
	public String getNomeRamoAtividade() {
		return nomeRamoAtividade;
	}

	/**
	 * Returns the pontoFiscalizacao.
	 * @return int
	 */
	public int getPontoFiscalizacao() {
		return pontoFiscalizacao;
	}

	/**
	 * Returns the ramoAtividade.
	 * @return int
	 */
	public int getRamoAtividade() {
		return ramoAtividade;
	}

	/**
	 * Sets the nomePontoFiscalizacao.
	 * @param nomePontoFiscalizacao The nomePontoFiscalizacao to set
	 */
	public void setNomePontoFiscalizacao(String nomePontoFiscalizacao) {
		this.nomePontoFiscalizacao = nomePontoFiscalizacao;
	}

	/**
	 * Sets the nomeRamoAtividade.
	 * @param nomeRamoAtividade The nomeRamoAtividade to set
	 */
	public void setNomeRamoAtividade(String nomeRamoAtividade) {
		this.nomeRamoAtividade = nomeRamoAtividade;
	}

	/**
	 * Sets the pontoFiscalizacao.
	 * @param pontoFiscalizacao The pontoFiscalizacao to set
	 */
	public void setPontoFiscalizacao(int pontoFiscalizacao) {
		this.pontoFiscalizacao = pontoFiscalizacao;
	}

	/**
	 * Sets the ramoAtividade.
	 * @param ramoAtividade The ramoAtividade to set
	 */
	public void setRamoAtividade(int ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}
	
	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
	public AuxPontoFiscalizacaoRamoAtividade(){
		super();
	}	

	/**
	 * Constructor for AuxPontoFiscalizacaoRamoAtividade.
	 */
	public AuxPontoFiscalizacaoRamoAtividade(	int 	pontoFiscalizacao,
												int 	ramoAtividade,
												String	nomeRamoAtividade,
												String	nomePontoFiscalizacao,
												String	descricao) {
		super();
		this.pontoFiscalizacao	= pontoFiscalizacao;
		this.ramoAtividade 	= ramoAtividade;
		this.nomePontoFiscalizacao = nomePontoFiscalizacao;
		this.nomeRamoAtividade = nomeRamoAtividade;
		this.descricao	= descricao;
	}

}
