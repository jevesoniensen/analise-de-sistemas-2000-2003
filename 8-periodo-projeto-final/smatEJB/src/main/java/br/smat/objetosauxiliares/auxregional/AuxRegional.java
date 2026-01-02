package br.smat.objetosauxiliares.auxregional;

import java.io.Serializable;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxRegional implements Serializable {

	private int regional;
	private String nome;
	private int estado;
	private String nomeEstado;
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private int municipio;

/**
	 * Constructor for AuxRegional.
	 */
	public AuxRegional(int regional,
						String nome,
						int estado,
						String nomeEstado,
						String rua,
						int numero,
						String complemento,
						String bairro,
						String cep,
						int municipio) {

		setRegional(regional);
		setNome(nome);
		setEstado(estado);
		setNomeEstado(nomeEstado);
		setRua(rua);
		setNumero(numero);
		setComplemento(complemento);
		setBairro(bairro);
		setCep(cep);
		setMunicipio(municipio);

	}

	/**
	 * Returns the bairro.
	 * @return String
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * Returns the cep.
	 * @return String
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Returns the complemento.
	 * @return String
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * Returns the estado.
	 * @return int
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Returns the municipio.
	 * @return int
	 */
	public int getMunicipio() {
		return municipio;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the nomeEstado.
	 * @return String
	 */
	public String getNomeEstado() {
		return nomeEstado;
	}

	/**
	 * Returns the numero.
	 * @return int
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Returns the regional.
	 * @return int
	 */
	public int getRegional() {
		return regional;
	}

	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * Sets the bairro.
	 * @param bairro The bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * Sets the cep.
	 * @param cep The cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * Sets the complemento.
	 * @param complemento The complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(int municipio) {
		this.municipio = municipio;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the nomeEstado.
	 * @param nomeEstado The nomeEstado to set
	 */
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(int regional) {
		this.regional = regional;
	}

	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

}
