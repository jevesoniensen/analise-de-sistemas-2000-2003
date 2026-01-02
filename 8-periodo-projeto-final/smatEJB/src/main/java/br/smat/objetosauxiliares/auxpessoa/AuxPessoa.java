package br.smat.objetosauxiliares.auxpessoa;

import java.io.Serializable;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxPessoa implements Serializable {
	
	private int pessoa;
	private String nomePessoa;
	
	public	AuxPessoa(int pessoa,String nomePessoa){
		
		this.pessoa = pessoa;
		this.nomePessoa = nomePessoa;
	}

	/**
	 * Returns the nomePessoa.
	 * @return String
	 */
	public String getNomePessoa() {
		return nomePessoa;
	}

	/**
	 * Returns the pessoa.
	 * @return int
	 */
	public int getPessoa() {
		return pessoa;
	}

	/**
	 * Sets the nomePessoa.
	 * @param nomePessoa The nomePessoa to set
	 */
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	/**
	 * Sets the pessoa.
	 * @param pessoa The pessoa to set
	 */
	public void setPessoa(int pessoa) {
		this.pessoa = pessoa;
	}

}
