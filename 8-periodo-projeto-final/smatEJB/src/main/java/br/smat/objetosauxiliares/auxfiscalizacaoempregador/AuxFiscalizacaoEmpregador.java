package br.smat.objetosauxiliares.auxfiscalizacaoempregador;

import java.io.Serializable;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxFiscalizacaoEmpregador implements Serializable{

	private 	int 			fiscalizacao;
	private	int			agenteSaude;
	private	String			nomeAgente;
	private	int			empregador;
	private	String			dataAbertura;
	private	String			dataFinalizacao;
	private	String			titulo;
	private	String			obsGerais;	
	private 	String 			docEmpregador;
	private 	String 			razaoSocial;	
	
	/**
	 * Constructor for AuxFiscalizacaoEmpregador.
	 */
	public AuxFiscalizacaoEmpregador() {
		super();
	}

	public AuxFiscalizacaoEmpregador(	int 			fiscalizacao,
										int			agenteSaude,
										String			nomeAgente,
										int			empregador,
										String			dataAbertura,
										String			dataFinalizacao,
										String			titulo,
										String			obsGerais,
										String 			docEmpregador,
										String 			razaoSocial) {
			setFiscalizacao(fiscalizacao);
			setAgenteSaude(agenteSaude);
			setNomeAgente(nomeAgente);
			setEmpregador(empregador);
			setDataAbertura(dataAbertura);
			setDataFinalizacao(dataFinalizacao);
			setTitulo(titulo);
			setObsGerais(obsGerais);
			setDocEmpregador(docEmpregador);
			setRazaoSocial(razaoSocial);
		
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
	 * Returns the dataFinalizacao.
	 * @return String
	 */
	public String getDataFinalizacao() {
		return dataFinalizacao;
	}

	/**
	 * Returns the docEmpregador.
	 * @return String
	 */
	public String getDocEmpregador() {
		return docEmpregador;
	}

	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() {
		return empregador;
	}

	/**
	 * Returns the fiscalizacao.
	 * @return int
	 */
	public int getFiscalizacao() {
		return fiscalizacao;
	}

	/**
	 * Returns the obsGerais.
	 * @return String
	 */
	public String getObsGerais() {
		return obsGerais;
	}

	/**
	 * Returns the razaoSocial.
	 * @return String
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * Returns the titulo.
	 * @return String
	 */
	public String getTitulo() {
		return titulo;
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
	 * Sets the dataFinalizacao.
	 * @param dataFinalizacao The dataFinalizacao to set
	 */
	public void setDataFinalizacao(String dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	/**
	 * Sets the docEmpregador.
	 * @param docEmpregador The docEmpregador to set
	 */
	public void setDocEmpregador(String docEmpregador) {
		this.docEmpregador = docEmpregador;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(int empregador) {
		this.empregador = empregador;
	}

	/**
	 * Sets the fiscalizacao.
	 * @param fiscalizacao The fiscalizacao to set
	 */
	public void setFiscalizacao(int fiscalizacao) {
		this.fiscalizacao = fiscalizacao;
	}

	/**
	 * Sets the obsGerais.
	 * @param obsGerais The obsGerais to set
	 */
	public void setObsGerais(String obsGerais) {
		this.obsGerais = obsGerais;
	}

	/**
	 * Sets the razaoSocial.
	 * @param razaoSocial The razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	 * Sets the titulo.
	 * @param titulo The titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Returns the nomeAgente.
	 * @return int
	 */
	public String getNomeAgente() {
		return nomeAgente;
	}

	/**
	 * Sets the nomeAgente.
	 * @param nomeAgente The nomeAgente to set
	 */
	public void setNomeAgente(String nomeAgente) {
		this.nomeAgente = nomeAgente;
	}

}
