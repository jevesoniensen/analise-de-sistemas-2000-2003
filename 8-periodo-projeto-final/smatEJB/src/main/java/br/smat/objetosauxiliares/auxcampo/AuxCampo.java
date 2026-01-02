package br.smat.objetosauxiliares.auxcampo;

import java.io.Serializable;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxCampo implements Serializable {
	
	private int registro;
	private String nomeRegistro;
	
	/**
	 * Constructor for AuxCampo.
	 */
	public AuxCampo(int registro,String nomeRegistro) {
		this.registro = registro;
		this.nomeRegistro = nomeRegistro;
	}

	/**
	 * Returns the nomeRegistro.
	 * @return String
	 */
	public String getNomeRegistro() {
		return nomeRegistro;
	}

	/**
	 * Returns the registro.
	 * @return int
	 */
	public int getRegistro() {
		return registro;
	}

	/**
	 * Sets the nomeRegistro.
	 * @param nomeRegistro The nomeRegistro to set
	 */
	public void setNomeRegistro(String nomeRegistro) {
		this.nomeRegistro = nomeRegistro;
	}

	/**
	 * Sets the registro.
	 * @param registro The registro to set
	 */
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	public int hashCode()
	{
		return (""+registro).hashCode();
	}
	
	public boolean equals(Object o)
	{
		return ((AuxCampo)o).registro == registro;
	}	

}
