package br.smat.web.obj;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjLocalLesaoAcidente {

	private int 	index;
	private int 	localLesao;
	private int 	acidente;
	private String	nomeLocalLesao;
	/**
	 * Constructor for ObjLocalLesaoAcidente.
	 */
	public ObjLocalLesaoAcidente(int index,int localLesao,int acidente, String nomeLocalLesao) {
		
		super();
		setIndex(index);
		setLocalLesao(localLesao);
		setAcidente(acidente);
		setNomeLocalLesao(nomeLocalLesao);
	}

	/**
	 * Returns the acidente.
	 * @return int
	 */
	public int getAcidente() {
		return acidente;
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
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(int acidente) {
		this.acidente = acidente;
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
	 * Returns the index.
	 * @return int
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Sets the index.
	 * @param index The index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
}
