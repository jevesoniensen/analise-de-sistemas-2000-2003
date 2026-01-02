package br.smat.ejb.locallesaoacidente;
/**
 * Home interface for Enterprise Bean: LocalLesaoAcidente
 */
public interface LocalLesaoAcidenteHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: LocalLesaoAcidente
	 */
	public br.smat.ejb.locallesaoacidente.LocalLesaoAcidente create(int localLesao, int acidente)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: LocalLesaoAcidente
	 */
	public br.smat.ejb.locallesaoacidente.LocalLesaoAcidente findByPrimaryKey(
		br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
}
