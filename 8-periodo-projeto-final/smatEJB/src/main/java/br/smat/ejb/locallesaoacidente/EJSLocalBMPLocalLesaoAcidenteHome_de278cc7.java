package br.smat.ejb.locallesaoacidente;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPLocalLesaoAcidenteHome_de278cc7
 * @generated
 */
public class EJSLocalBMPLocalLesaoAcidenteHome_de278cc7
	extends EJSLocalWrapper
	implements br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteLocalHome {
	/**
	 * EJSLocalBMPLocalLesaoAcidenteHome_de278cc7
	 * @generated
	 */
	public EJSLocalBMPLocalLesaoAcidenteHome_de278cc7() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteLocal create(
		int localLesao,
		int acidente)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteLocal _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.locallesaoacidente
				.EJSBMPLocalLesaoAcidenteHomeBean_de278cc7 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.locallesaoacidente
						.EJSBMPLocalLesaoAcidenteHomeBean_de278cc7) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(localLesao, acidente);
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
	 * findByPrimaryKey
	 * @generated
	 */
	public br
		.smat
		.ejb
		.locallesaoacidente
		.LocalLesaoAcidenteLocal findByPrimaryKey(
		br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteLocal _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.locallesaoacidente
				.EJSBMPLocalLesaoAcidenteHomeBean_de278cc7 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.locallesaoacidente
						.EJSBMPLocalLesaoAcidenteHomeBean_de278cc7) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findByPrimaryKey_Local(primaryKey);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
				.ejb
				.locallesaoacidente
				.EJSBMPLocalLesaoAcidenteHomeBean_de278cc7 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.locallesaoacidente
						.EJSBMPLocalLesaoAcidenteHomeBean_de278cc7) container
						.preInvoke(
					this,
					2,
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
				container.postInvoke(this, 2, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
}
