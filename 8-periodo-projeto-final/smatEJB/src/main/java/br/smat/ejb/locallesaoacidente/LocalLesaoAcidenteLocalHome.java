package br.smat.ejb.locallesaoacidente;
/**
 * Local Home interface for Enterprise Bean: LocalLesaoAcidente
 */
public interface LocalLesaoAcidenteLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: LocalLesaoAcidente
	 */
	public br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteLocal create(int localLesao, int acidente)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: LocalLesaoAcidente
	 */
	public br
		.smat
		.ejb
		.locallesaoacidente
		.LocalLesaoAcidenteLocal findByPrimaryKey(
		br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey primaryKey)
		throws javax.ejb.FinderException;
}
