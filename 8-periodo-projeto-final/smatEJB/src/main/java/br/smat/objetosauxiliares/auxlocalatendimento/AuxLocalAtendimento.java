package br.smat.objetosauxiliares.auxlocalatendimento;

import java.io.Serializable;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxLocalAtendimento implements Serializable{

	private	int	localAtendimento;
	private	String	nome;
	private	int 	estado;
	private	int 	municipio;
	private	String	nomeMunicipio;
	
	/**
	 * Constructor for AuxLocalAtendimento.
	 */
	public AuxLocalAtendimento (int	localAtendimento,
								String	nome,
								int estado,
								int municipio,
								String nomeMunicipio) {
									
		setLocalAtendimento(localAtendimento);
		setNome(nome);
		setEstado(estado);
		setMunicipio(municipio);
		setNomeMunicipio(nomeMunicipio);
	}

	/**
	 * Returns the estado.
	 * @return int
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Returns the localAtendimento.
	 * @return int
	 */
	public int getLocalAtendimento() {
		return localAtendimento;
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
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * Sets the localAtendimento.
	 * @param localAtendimento The localAtendimento to set
	 */
	public void setLocalAtendimento(int localAtendimento) {
		this.localAtendimento = localAtendimento;
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
	 * Returns the nomeMunicipio.
	 * @return String
	 */
	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	/**
	 * Sets the nomeMunicipio.
	 * @param nomeMunicipio The nomeMunicipio to set
	 */
	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

}
