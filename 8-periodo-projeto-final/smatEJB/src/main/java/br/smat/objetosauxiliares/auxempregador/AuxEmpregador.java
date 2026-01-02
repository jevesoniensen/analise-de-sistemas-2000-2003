package br.smat.objetosauxiliares.auxempregador;

import java.io.Serializable;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxEmpregador implements Serializable {

	private int 	empregador;
	private int 	ramoAtividade;			
	private int 	municipio;
	private int 	tipoEmpregador;
	private String	razaoSocial;	
	private String	documento;
	private int	numero;
	private String	rua;
	private String	bairro;
	private String	cep;
	private String	complemento;			
	private String	nomeRamoAtividade;
	private int	ramoSuperior;
	private String	nomeRamoSuperior;
	private int	estado; 

	/**
	 * Constructor for AuxEmpregador.
	 */
	public AuxEmpregador(int 		empregador,
						  int 		ramoAtividade,			
						  int 		municipio,
						  int 		tipoEmpregador,
						  String	razaoSocial,	
						  String	documento,
						  int		numero,
						  String	rua,
						  String	bairro,
						  String	cep,
						  String	complemento,			
						  String	nomeRamoAtividade,
						  int		ramoSuperior,
						  String	nomeRamoSuperior,
						  int		estado ) {
						  	
		super();
		setEmpregador(empregador);
		setRamoAtividade(ramoAtividade);
		setMunicipio(municipio);
		setTipoEmpregador(tipoEmpregador);
		setRazaoSocial(razaoSocial);
		setDocumento(documento);
		setNumero(numero);
		setRua(rua);
		setBairro(bairro);
		setCep(cep);
		setComplemento(complemento);
		setNomeRamoAtividade(nomeRamoAtividade);
		setRamoSuperior(ramoSuperior);
		setNomeRamoSuperior(nomeRamoSuperior);
		setEstado(estado);
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
	 * Returns the documento.
	 * @return String
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() {
		return empregador;
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
	 * Returns the nomeRamoAtividade.
	 * @return String
	 */
	public String getNomeRamoAtividade() {
		return nomeRamoAtividade;
	}

	/**
	 * Returns the nomeRamoSuperior.
	 * @return String
	 */
	public String getNomeRamoSuperior() {
		return nomeRamoSuperior;
	}

	/**
	 * Returns the numero.
	 * @return int
	 */
	public int getNumero() {
		return numero;
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
	 * Returns the razaoSocial.
	 * @return String
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * Returns the tipoEmpregador.
	 * @return int
	 */
	public int getTipoEmpregador() {
		return tipoEmpregador;
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
	 * Sets the documento.
	 * @param documento The documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(int empregador) {
		this.empregador = empregador;
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
	 * Sets the nomeRamoAtividade.
	 * @param nomeRamoAtividade The nomeRamoAtividade to set
	 */
	public void setNomeRamoAtividade(String nomeRamoAtividade) {
		this.nomeRamoAtividade = nomeRamoAtividade;
	}

	/**
	 * Sets the nomeRamoSuperior.
	 * @param nomeRamoSuperior The nomeRamoSuperior to set
	 */
	public void setNomeRamoSuperior(String nomeRamoSuperior) {
		this.nomeRamoSuperior = nomeRamoSuperior;
	}

	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
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

	/**
	 * Sets the razaoSocial.
	 * @param razaoSocial The razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * Sets the tipoEmpregador.
	 * @param tipoEmpregador The tipoEmpregador to set
	 */
	public void setTipoEmpregador(int tipoEmpregador) {
		this.tipoEmpregador = tipoEmpregador;
	}

}
