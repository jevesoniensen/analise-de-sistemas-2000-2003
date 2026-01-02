package br.smat.transaction.acidentetransaction;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSStatelessAcidenteTransactionHomeBean_39fa3a6a
 * @generated
 */
public class EJSStatelessAcidenteTransactionHomeBean_39fa3a6a extends EJSHome {
	/**
	 * EJSStatelessAcidenteTransactionHomeBean_39fa3a6a
	 * @generated
	 */
	public EJSStatelessAcidenteTransactionHomeBean_39fa3a6a()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.transaction.acidentetransaction.AcidenteTransaction create()
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.transaction.acidentetransaction.AcidenteTransaction result =
			null;
		boolean createFailed = false;
		try {
			result =
				(
					br
						.smat
						.transaction
						.acidentetransaction
						.AcidenteTransaction) super
						.createWrapper(
					new BeanId(this, null));
		} catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			createFailed = true;
			throw ex;
		} catch (Throwable ex) {
			createFailed = true;
			throw new CreateFailureException(ex);
		} finally {
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return result;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br
		.smat
		.transaction
		.acidentetransaction
		.AcidenteTransactionLocal create_Local()
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.transaction.acidentetransaction.AcidenteTransactionLocal result =
			null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			result =
				(
					br
						.smat
						.transaction
						.acidentetransaction
						.AcidenteTransactionLocal) super
						.createWrapper_Local(
					null);
		} catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			createFailed = true;
			throw ex;
		} catch (Throwable ex) {
			createFailed = true;
			throw new CreateFailureException(ex);
		} finally {
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return result;
	}
}
