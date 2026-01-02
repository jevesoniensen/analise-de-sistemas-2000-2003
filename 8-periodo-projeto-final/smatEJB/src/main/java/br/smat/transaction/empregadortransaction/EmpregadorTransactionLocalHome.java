package br.smat.transaction.empregadortransaction;
/**
 * Local Home interface for Enterprise Bean: EmpregadorTransaction
 */
public interface EmpregadorTransactionLocalHome
	extends javax.ejb.EJBLocalHome {
	/**
	 * Creates a default instance of Session Bean: EmpregadorTransaction
	 */
	public br
		.smat
		.transaction
		.empregadortransaction
		.EmpregadorTransactionLocal create()
		throws javax.ejb.CreateException;
}
