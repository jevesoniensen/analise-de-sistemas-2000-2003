package br.smat.objetosauxiliares.auxtestemunha;

import java.io.Serializable;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxTestemunha implements Serializable {

	private String nome 		= null;
	private int 	municipio 	= 0;
	private int 	estado 	= 0;	
	private String rua 		= null;
	private String bairro 		= null;
	private int	numero 		= 0;
	private String complemento = null;
	private String cep 		= null;
	private String telefone 	= null;
	private String	ddd 		= null;
	private int	testemunha	= 0;

	/**
	 * Constructor for AuxTestemunha
	 * sem o estado.
	 */
	public AuxTestemunha(	String 	nome,
							int	municipio,
							String 	rua,
							String 	bairro,
							int	numero,
							String 	complemento,
							String 	cep,
							String 	telefone,
							String	ddd) {

		setNome(nome);
		setMunicipio(municipio);
		setRua(rua);
		setBairro(bairro);
		setNumero(numero);
		setComplemento(complemento);
		setCep(cep);
		setTelefone(telefone);
		setDdd(ddd);				
	}

	public AuxTestemunha(	int testemunha,
							String 	nome,
							int	municipio,
							int 	estado,
							String 	rua,
							String 	bairro,
							int	numero,
							String 	complemento,
							String 	cep,
							String 	telefone,
							String	ddd) {

		setTestemunha(testemunha);
		setEstado(estado);
		setNome(nome);
		setMunicipio(municipio);
		setRua(rua);
		setBairro(bairro);
		setNumero(numero);
		setComplemento(complemento);
		setCep(cep);
		setTelefone(telefone);
		setDdd(ddd);				
	}
	
	/**
	 * Constructor for AuxTestemunha
	 * com o estado.
	 */
	public AuxTestemunha(	String 	nome,
							int	municipio,
							int estado,
							String 	rua,
							String 	bairro,
							int	numero,
							String 	complemento,
							String 	cep,
							String 	telefone,
							String	ddd) {

		setNome(nome);
		setMunicipio(municipio);
		setEstado(estado);
		setRua(rua);
		setBairro(bairro);
		setNumero(numero);
		setComplemento(complemento);
		setCep(cep);
		setTelefone(telefone);
		setDdd(ddd);				
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
	 * Returns the ddd.
	 * @return String
	 */
	public String getDdd() {
		return ddd;
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
	 * Returns the numero.
	 * @return String
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * Returns the telefone.
	 * @return String
	 */
	public String getTelefone() {
		return telefone;
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
	 * Sets the ddd.
	 * @param ddd The ddd to set
	 */
	public void setDdd(String ddd) {
		this.ddd = ddd;
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
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * Sets the telefone.
	 * @param telefone The telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Returns the estado.
	 * @return int
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * Returns the testemunha.
	 * @return int
	 */
	public int getTestemunha() {
		return testemunha;
	}

	/**
	 * Sets the testemunha.
	 * @param testemunha The testemunha to set
	 */
	public void setTestemunha(int testemunha) {
		this.testemunha = testemunha;
	}

}
