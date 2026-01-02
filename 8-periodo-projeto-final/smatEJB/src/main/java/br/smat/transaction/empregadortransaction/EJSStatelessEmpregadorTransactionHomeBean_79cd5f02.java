package br.smat.transaction.empregadortransaction;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSStatelessEmpregadorTransactionHomeBean_79cd5f02
 * @generated
 */
public class EJSStatelessEmpregadorTransactionHomeBean_79cd5f02
	extends EJSHome {
	/**
	 * EJSStatelessEmpregadorTransactionHomeBean_79cd5f02
	 * @generated
	 */
	public EJSStatelessEmpregadorTransactionHomeBean_79cd5f02()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br
		.smat
		.transaction
		.empregadortransaction
		.EmpregadorTransaction create()
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.transaction.empregadortransaction.EmpregadorTransaction result =
			null;
		boolean createFailed = false;
		try {
			result =
				(
					br
						.smat
						.transaction
						.empregadortransaction
						.EmpregadorTransaction) super
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
		.empregadortransaction
		.EmpregadorTransactionLocal create_Local()
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br
			.smat
			.transaction
			.empregadortransaction
			.EmpregadorTransactionLocal result =
			null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			result =
				(
					br
						.smat
						.transaction
						.empregadortransaction
						.EmpregadorTransactionLocal) super
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
