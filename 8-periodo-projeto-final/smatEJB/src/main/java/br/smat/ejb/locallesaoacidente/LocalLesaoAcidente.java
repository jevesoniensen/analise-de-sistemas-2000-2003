package br.smat.ejb.locallesaoacidente;
import br.smat.ejb.acidente.AcidenteKey;
import br.smat.ejb.locallesao.LocalLesaoKey;
/**
 * Remote interface for Enterprise Bean: LocalLesaoAcidente
 */
public interface LocalLesaoAcidente extends javax.ejb.EJBObject {
	/**
	 * Returns the acidente.
	 * @return AcidenteKey
	 */
	public AcidenteKey getAcidente() throws java.rmi.RemoteException;
	/**
	 * Returns the localLesao.
	 * @return LocalLesaoKey
	 */
	public LocalLesaoKey getLocalLesao() throws java.rmi.RemoteException;
}
