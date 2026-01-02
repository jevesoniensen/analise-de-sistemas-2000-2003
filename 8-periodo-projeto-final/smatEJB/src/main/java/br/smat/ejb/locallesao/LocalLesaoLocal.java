package br.smat.ejb.locallesao;
import br.smat.ejb.locallesao.LocalLesaoKey;
/**
 * Local interface for Enterprise Bean: LocalLesao
 */
public interface LocalLesaoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the localLesaoPai.
	 * @param localLesaoPai The localLesaoPai to set
	 */
	public void setLocalLesaoPai(LocalLesaoKey localLesaoPai);
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the localLesaoPai.
	 * @return LocalLesaoKey
	 */
	public LocalLesaoKey getLocalLesaoPai();
	/**
	 * Returns the localLesao.
	 * @return int
	 */
	public int getLocalLesao();
}
