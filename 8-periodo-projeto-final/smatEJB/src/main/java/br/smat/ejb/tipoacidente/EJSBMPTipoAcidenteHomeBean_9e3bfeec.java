package br.smat.ejb.tipoacidente;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPTipoAcidenteHomeBean_9e3bfeec
 * @generated
 */
public class EJSBMPTipoAcidenteHomeBean_9e3bfeec extends EJSHome {
	/**
	 * EJSBMPTipoAcidenteHomeBean_9e3bfeec
	 * @generated
	 */
	public EJSBMPTipoAcidenteHomeBean_9e3bfeec()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findAllTiposAcidente
	 * @generated
	 */
	public java.util.Collection findAllTiposAcidente()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TipoAcidenteBean bean =
				(TipoAcidenteBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTiposAcidente();
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
	 * findByPrimaryKey
	 * @generated
	 */
	public TipoAcidente findByPrimaryKey(
		br.smat.ejb.tipoacidente.TipoAcidenteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TipoAcidente _EJS_bmp = (TipoAcidente) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.tipoacidente.TipoAcidenteKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TipoAcidenteBean _EJS_bean =
					(TipoAcidenteBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.tipoacidente
							.TipoAcidenteKey) _EJS_bean
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
				(TipoAcidente) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.tipoacidente.TipoAcidente create(java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.tipoacidente.TipoAcidente result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.tipoacidente.TipoAcidenteBean bean =
				(br.smat.ejb.tipoacidente.TipoAcidenteBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.tipoacidente.TipoAcidenteKey _primaryKey =
				bean.ejbCreate(nome);
			result =
				(br.smat.ejb.tipoacidente.TipoAcidente) super.postCreate(
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
	 * findAllTiposAcidente_Local
	 * @generated
	 */
	public java.util.Collection findAllTiposAcidente_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TipoAcidenteBean bean =
				(TipoAcidenteBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTiposAcidente();
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
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public TipoAcidenteLocal findByPrimaryKey_Local(
		br.smat.ejb.tipoacidente.TipoAcidenteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TipoAcidenteLocal _EJS_bmp =
			(TipoAcidenteLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.tipoacidente.TipoAcidenteKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TipoAcidenteBean _EJS_bean =
					(TipoAcidenteBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.tipoacidente
							.TipoAcidenteKey) _EJS_bean
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
				(TipoAcidenteLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.tipoacidente.TipoAcidenteLocal create_Local(
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.tipoacidente.TipoAcidenteLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.tipoacidente.TipoAcidenteBean bean =
				(br.smat.ejb.tipoacidente.TipoAcidenteBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.tipoacidente.TipoAcidenteKey _primaryKey =
				bean.ejbCreate(nome);
			result =
				(
					br
						.smat
						.ejb
						.tipoacidente
						.TipoAcidenteLocal) super
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
}
