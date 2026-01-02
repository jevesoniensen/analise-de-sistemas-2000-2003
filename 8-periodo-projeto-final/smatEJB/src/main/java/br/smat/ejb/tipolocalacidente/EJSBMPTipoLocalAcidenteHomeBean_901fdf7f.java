package br.smat.ejb.tipolocalacidente;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPTipoLocalAcidenteHomeBean_901fdf7f
 * @generated
 */
public class EJSBMPTipoLocalAcidenteHomeBean_901fdf7f extends EJSHome {
	/**
	 * EJSBMPTipoLocalAcidenteHomeBean_901fdf7f
	 * @generated
	 */
	public EJSBMPTipoLocalAcidenteHomeBean_901fdf7f()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findAllTiposLocalAcidente
	 * @generated
	 */
	public java.util.Collection findAllTiposLocalAcidente()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TipoLocalAcidenteBean bean =
				(TipoLocalAcidenteBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTiposLocalAcidente();
			result = super.getCMP20Collection(pKeys);
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
		} catch (javax.ejb.FinderException finderEx) {
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
			throw finderEx;
		} finally {
			if (beanO != null)
				super.discardFinderEntityBeanO(beanO);
		}
		return result;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.tipolocalacidente.TipoLocalAcidente create(
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.tipolocalacidente.TipoLocalAcidente result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.tipolocalacidente.TipoLocalAcidenteBean bean =
				(br.smat.ejb.tipolocalacidente.TipoLocalAcidenteBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey _primaryKey =
				bean.ejbCreate(nome);
			result =
				(
					br
						.smat
						.ejb
						.tipolocalacidente
						.TipoLocalAcidente) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome);
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
	 * findByPrimaryKey
	 * @generated
	 */
	public TipoLocalAcidente findByPrimaryKey(
		br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TipoLocalAcidente _EJS_bmp =
			(TipoLocalAcidente) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TipoLocalAcidenteBean _EJS_bean =
					(TipoLocalAcidenteBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.tipolocalacidente
							.TipoLocalAcidenteKey) _EJS_bean
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
				(TipoLocalAcidente) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllTiposLocalAcidente_Local
	 * @generated
	 */
	public java.util.Collection findAllTiposLocalAcidente_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TipoLocalAcidenteBean bean =
				(TipoLocalAcidenteBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTiposLocalAcidente();
			result = super.getCMP20Collection_Local(pKeys);
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
		} catch (javax.ejb.FinderException finderEx) {
			super.releaseFinderEntityBeanO(beanO);
			beanO = null;
			throw finderEx;
		} finally {
			if (beanO != null)
				super.discardFinderEntityBeanO(beanO);
		}
		return result;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.tipolocalacidente.TipoLocalAcidenteLocal create_Local(
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.tipolocalacidente.TipoLocalAcidenteLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.tipolocalacidente.TipoLocalAcidenteBean bean =
				(br.smat.ejb.tipolocalacidente.TipoLocalAcidenteBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey _primaryKey =
				bean.ejbCreate(nome);
			result =
				(
					br
						.smat
						.ejb
						.tipolocalacidente
						.TipoLocalAcidenteLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome);
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
	public TipoLocalAcidenteLocal findByPrimaryKey_Local(
		br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TipoLocalAcidenteLocal _EJS_bmp =
			(TipoLocalAcidenteLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TipoLocalAcidenteBean _EJS_bean =
					(TipoLocalAcidenteBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.tipolocalacidente
							.TipoLocalAcidenteKey) _EJS_bean
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
				(TipoLocalAcidenteLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
}
