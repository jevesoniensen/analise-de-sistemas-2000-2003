package br.smat.transaction.empregadortransaction;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalStatelessEmpregadorTransactionHome_79cd5f02
 * @generated
 */
public class EJSLocalStatelessEmpregadorTransactionHome_79cd5f02
	extends EJSLocalWrapper
	implements br.smat.transaction.empregadortransaction.EmpregadorTransactionLocalHome {
	/**
	 * EJSLocalStatelessEmpregadorTransactionHome_79cd5f02
	 * @generated
	 */
	public EJSLocalStatelessEmpregadorTransactionHome_79cd5f02() {
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
		.EmpregadorTransactionLocal create()
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.transaction
			.empregadortransaction
			.EmpregadorTransactionLocal _EJS_result =
			null;
		try {
			br
				.smat
				.transaction
				.empregadortransaction
				.EJSStatelessEmpregadorTransactionHomeBean_79cd5f02 _EJS_beanRef =
				(
					br
						.smat
						.transaction
						.empregadortransaction
						.EJSStatelessEmpregadorTransactionHomeBean_79cd5f02) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create_Local();
		} catch (javax.ejb.CreateException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(java.lang.Object arg0)
		throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.transaction
				.empregadortransaction
				.EJSStatelessEmpregadorTransactionHomeBean_79cd5f02 _EJS_beanRef =
				(
					br
						.smat
						.transaction
						.empregadortransaction
						.EJSStatelessEmpregadorTransactionHomeBean_79cd5f02) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_beanRef.remove(arg0);
		} catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (javax.ejb.EJBException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 1, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
}
