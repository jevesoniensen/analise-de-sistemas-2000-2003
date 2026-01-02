package br.smat.ejb.locallesaoacidente;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPLocalLesaoAcidenteHomeBean_de278cc7
 * @generated
 */
public class EJSBMPLocalLesaoAcidenteHomeBean_de278cc7 extends EJSHome {
	/**
	 * EJSBMPLocalLesaoAcidenteHomeBean_de278cc7
	 * @generated
	 */
	public EJSBMPLocalLesaoAcidenteHomeBean_de278cc7()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public LocalLesaoAcidente findByPrimaryKey(
		br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		LocalLesaoAcidente _EJS_bmp =
			(LocalLesaoAcidente) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				LocalLesaoAcidenteBean _EJS_bean =
					(LocalLesaoAcidenteBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.locallesaoacidente
							.LocalLesaoAcidenteKey) _EJS_bean
							.ejbFindByPrimaryKey(
						primaryKey);
				super.releaseFinderEntityBeanO(_EJS_beanO);
				_EJS_beanO = null;
			} catch (javax.ejb.FinderException finderEx) {
				super.releaseFinderEntityBeanO(_EJS_beanO);
				_EJS_beanO = null;
				throw finderEx;
			} finally {
				if (_EJS_beanO != null)
					super.discardFinderEntityBeanO(_EJS_beanO);
			}
			_EJS_bmp =
				(LocalLesaoAcidente) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.locallesaoacidente.LocalLesaoAcidente create(
		int localLesao,
		int acidente)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.locallesaoacidente.LocalLesaoAcidente result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteBean bean =
				(br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey _primaryKey =
				bean.ejbCreate(localLesao, acidente);
			result =
				(
					br
						.smat
						.ejb
						.locallesaoacidente
						.LocalLesaoAcidente) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(localLesao, acidente);
			super.afterPostCreate(beanO, _primaryKey);
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
			if (preCreateFlag && !createFailed)
				super.afterPostCreateCompletion(beanO);
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return result;
	}
	/**
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public LocalLesaoAcidenteLocal findByPrimaryKey_Local(
		br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		LocalLesaoAcidenteLocal _EJS_bmp =
			(LocalLesaoAcidenteLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				LocalLesaoAcidenteBean _EJS_bean =
					(LocalLesaoAcidenteBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.locallesaoacidente
							.LocalLesaoAcidenteKey) _EJS_bean
							.ejbFindByPrimaryKey(
						primaryKey);
				super.releaseFinderEntityBeanO(_EJS_beanO);
				_EJS_beanO = null;
			} catch (javax.ejb.FinderException finderEx) {
				super.releaseFinderEntityBeanO(_EJS_beanO);
				_EJS_beanO = null;
				throw finderEx;
			} finally {
				if (_EJS_beanO != null)
					super.discardFinderEntityBeanO(_EJS_beanO);
			}
			_EJS_bmp =
				(LocalLesaoAcidenteLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteLocal create_Local(
		int localLesao,
		int acidente)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteBean bean =
				(br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey _primaryKey =
				bean.ejbCreate(localLesao, acidente);
			result =
				(
					br
						.smat
						.ejb
						.locallesaoacidente
						.LocalLesaoAcidenteLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(localLesao, acidente);
			super.afterPostCreate(beanO, _primaryKey);
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
			if (preCreateFlag && !createFailed)
				super.afterPostCreateCompletion(beanO);
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return result;
	}
}
