package br.smat.objetosauxiliares.auxramoatividade;

import java.io.Serializable;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxRamoAtividade implements Serializable {

	private int 				ramoAtividade;
	private String				nome;
	private int 				cnae;
	private int 				ramoSuperior;
	private String				nomeRamoSuperior;	
	
	/**
	 * Constructor for AuxRamoAtividade.
	 */
	public AuxRamoAtividade() {
		super();
	}

	public AuxRamoAtividade(	int 	ramoAtividade,
							 	String 	nome,
							 	int	cnae,
								int	ramoSuperior,
								String	nomeRamoSuperior) {
		super();
		this.ramoAtividade		= ramoAtividade;
		this.nome				= nome;
		this.cnae				= cnae;
		this.ramoSuperior		= ramoSuperior;
		this.nomeRamoSuperior	= nomeRamoSuperior;
	}


	/**
	 * Returns the cnae.
	 * @return int
	 */
	public int getCnae() {
		return cnae;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the nomeRamoSuperior.
	 * @return String
	 */
	public String getNomeRamoSuperior() {
		return nomeRamoSuperior;
	}

	/**
	 * Returns the ramoAtividade.
	 * @return int
	 */
	public int getRamoAtividade() {
		return ramoAtividade;
	}

	/**
	 * Returns the ramoSuperior.
	 * @return int
	 */
	public int getRamoSuperior() {
		return ramoSuperior;
	}

	/**
	 * Sets the cnae.
	 * @param cnae The cnae to set
	 */
	public void setCnae(int cnae) {
		this.cnae = cnae;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the nomeRamoSuperior.
	 * @param nomeRamoSuperior The nomeRamoSuperior to set
	 */
	public void setNomeRamoSuperior(String nomeRamoSuperior) {
		this.nomeRamoSuperior = nomeRamoSuperior;
	}

	/**
	 * Sets the ramoAtividade.
	 * @param ramoAtividade The ramoAtividade to set
	 */
	public void setRamoAtividade(int ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	/**
	 * Sets the ramoSuperior.
	 * @param ramoSuperior The ramoSuperior to set
	 */
	public void setRamoSuperior(int ramoSuperior) {
		this.ramoSuperior = ramoSuperior;
	}

}
