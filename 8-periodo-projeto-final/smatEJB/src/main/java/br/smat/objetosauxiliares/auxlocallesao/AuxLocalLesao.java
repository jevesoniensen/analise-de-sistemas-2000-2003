package br.smat.objetosauxiliares.auxlocallesao;

import java.io.Serializable;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxLocalLesao implements Serializable{

	private	int 	localLesao;
	private 	String	nomeLocalLesao;
	private	int	pai;
	private	String	nomePai;
	
	public AuxLocalLesao(int localLesao,String nomeLocalLesao){
		
		this.localLesao = localLesao;
		this.nomeLocalLesao = nomeLocalLesao;
	}
 
	public AuxLocalLesao(	int 	localLesao,
							String 	nomeLocalLesao,
							int 	pai,
							String	nomePai){
		
		this.localLesao = localLesao;
		this.nomeLocalLesao = nomeLocalLesao;
		this.pai = pai;
		this.nomePai = nomePai;
	}	
	
	/**
	 * Returns the localLesao.
	 * @return int
	 */
	public int getLocalLesao() {
		return localLesao;
	}

	/**
	 * Returns the nomeLocalLesao.
	 * @return String
	 */
	public String getNomeLocalLesao() {
		return nomeLocalLesao;
	}

	/**
	 * Sets the localLesao.
	 * @param localLesao The localLesao to set
	 */
	public void setLocalLesao(int localLesao) {
		this.localLesao = localLesao;
	}

	/**
	 * Sets the nomeLocalLesao.
	 * @param nomeLocalLesao The nomeLocalLesao to set
	 */
	public void setNomeLocalLesao(String nomeLocalLesao) {
		this.nomeLocalLesao = nomeLocalLesao;
	}

	/**
	 * Returns the nomePai.
	 * @return String
	 */
	public String getNomePai() {
		return nomePai;
	}

	/**
	 * Returns the pai.
	 * @return int
	 */
	public int getPai() {
		return pai;
	}

	/**
	 * Sets the nomePai.
	 * @param nomePai The nomePai to set
	 */
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	/**
	 * Sets the pai.
	 * @param pai The pai to set
	 */
	public void setPai(int pai) {
		this.pai = pai;
	}

}
