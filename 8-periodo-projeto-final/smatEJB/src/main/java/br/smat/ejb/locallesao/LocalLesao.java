package br.smat.ejb.locallesao;
import br.smat.ejb.locallesao.LocalLesaoKey;
/**
 * Remote interface for Enterprise Bean: LocalLesao
 */
public interface LocalLesao extends javax.ejb.EJBObject {
	/**
	 * Returns the localLesao.
	 * @return int
	 */
	public int getLocalLesao() throws java.rmi.RemoteException;
	/**
	 * Returns the localLesaoPai.
	 * @return LocalLesaoKey
	 */
	public LocalLesaoKey getLocalLesaoPai() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Sets the localLesaoPai.
	 * @param localLesaoPai The localLesaoPai to set
	 */
	public void setLocalLesaoPai(LocalLesaoKey localLesaoPai)
		throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
}
