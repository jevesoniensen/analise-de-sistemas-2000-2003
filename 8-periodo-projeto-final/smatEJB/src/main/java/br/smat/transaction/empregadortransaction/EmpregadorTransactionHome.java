package br.smat.transaction.empregadortransaction;
/**
 * Home interface for Enterprise Bean: EmpregadorTransaction
 */
public interface EmpregadorTransactionHome extends javax.ejb.EJBHome {
	/**
	 * Creates a default instance of Session Bean: EmpregadorTransaction
	 */
	public br
		.smat
		.transaction
		.empregadortransaction
		.EmpregadorTransaction create()
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
