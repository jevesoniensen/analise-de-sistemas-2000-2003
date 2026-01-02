package br.smat.objetosauxiliares.auxitempontofiscalizacao;

import java.io.Serializable;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxItemPontoFiscalizacao implements Serializable{
	
	private int 	itemFiscalizacao;
	private String	nome;
	private String checked;
	private int	tramiteFiscalizacao;
	private int	grauConformidade;
	private String	nomeGrauConformidade;	

	/**
	 * Constructor for AuxItemPontoFiscalizacao.
	 */
	public AuxItemPontoFiscalizacao(int 	itemFiscalizacao,String	nome,String checked) {
		super();
		this.itemFiscalizacao 	= itemFiscalizacao;
		this.nome				= nome;
		this.checked			= checked;
	}

	public AuxItemPontoFiscalizacao(int 	itemFiscalizacao,String	nome,String checked,int tramiteFiscalizacao) {
		super();
		this.itemFiscalizacao 		= itemFiscalizacao;
		this.nome					= nome;
		this.checked				= checked;
		this.tramiteFiscalizacao 	= tramiteFiscalizacao;
	}

	public AuxItemPontoFiscalizacao(	int 	itemFiscalizacao,
										String	nome,
										String 	checked,
										int 	tramiteFiscalizacao,
										int 	grauConformidade,
										String 	nomeGrauConformidade) {
		super();
		this.itemFiscalizacao 		= itemFiscalizacao;
		this.nome					= nome;
		this.checked				= checked;
		this.tramiteFiscalizacao 	= tramiteFiscalizacao;
		this.grauConformidade		= grauConformidade;
		this.nomeGrauConformidade			= nomeGrauConformidade;
	}

	/**
	 * Returns the checked.
	 * @return String
	 */
	public String getChecked() {
		return checked;
	}

	/**
	 * Returns the itemFiscalizacao.
	 * @return int
	 */
	public int getItemFiscalizacao() {
		return itemFiscalizacao;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the checked.
	 * @param checked The checked to set
	 */
	public void setChecked(String checked) {
		this.checked = checked;
	}

	/**
	 * Sets the itemFiscalizacao.
	 * @param itemFiscalizacao The itemFiscalizacao to set
	 */
	public void setItemFiscalizacao(int itemFiscalizacao) {
		this.itemFiscalizacao = itemFiscalizacao;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Returns the tramiteFiscalizacao.
	 * @return int
	 */
	public int getTramiteFiscalizacao() {
		return tramiteFiscalizacao;
	}

	/**
	 * Sets the tramiteFiscalizacao.
	 * @param tramiteFiscalizacao The tramiteFiscalizacao to set
	 */
	public void setTramiteFiscalizacao(int tramiteFiscalizacao) {
		this.tramiteFiscalizacao = tramiteFiscalizacao;
	}

	/**
	 * Returns the grauConformidade.
	 * @return int
	 */
	public int getGrauConformidade() {
		return grauConformidade;
	}

	/**
	 * Returns the nomeGrauConformidade.
	 * @return String
	 */
	public String getNomeGrauConformidade() {
		return nomeGrauConformidade;
	}

	/**
	 * Sets the grauConformidade.
	 * @param grauConformidade The grauConformidade to set
	 */
	public void setGrauConformidade(int grauConformidade) {
		this.grauConformidade = grauConformidade;
	}

	/**
	 * Sets the nomeGrauConformidade.
	 * @param nomeGrauConformidade The nomeGrauConformidade to set
	 */
	public void setNomeGrauConformidade(String nomeGrauConformidade) {
		this.nomeGrauConformidade = nomeGrauConformidade;
	}

}
