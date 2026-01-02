package br.smat.ejb.locallesaoacidente;
import br.smat.ejb.acidente.AcidenteKey;
import br.smat.ejb.locallesao.LocalLesaoKey;
/**
 * Local interface for Enterprise Bean: LocalLesaoAcidente
 */
public interface LocalLesaoAcidenteLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the acidente.
	 * @return AcidenteKey
	 */
	public AcidenteKey getAcidente();
	/**
	 * Returns the localLesao.
	 * @return LocalLesaoKey
	 */
	public LocalLesaoKey getLocalLesao();
}
