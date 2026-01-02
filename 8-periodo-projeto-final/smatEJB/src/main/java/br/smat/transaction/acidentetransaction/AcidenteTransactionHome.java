package br.smat.transaction.acidentetransaction;
/**
 * Home interface for Enterprise Bean: AcidenteTransaction
 */
public interface AcidenteTransactionHome extends javax.ejb.EJBHome {
	/**
	 * Creates a default instance of Session Bean: AcidenteTransaction
	 */
	public br.smat.transaction.acidentetransaction.AcidenteTransaction create()
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
