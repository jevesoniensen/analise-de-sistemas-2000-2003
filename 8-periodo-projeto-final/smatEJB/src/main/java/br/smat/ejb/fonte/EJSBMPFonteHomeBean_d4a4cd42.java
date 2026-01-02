package br.smat.ejb.fonte;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPFonteHomeBean_d4a4cd42
 * @generated
 */
public class EJSBMPFonteHomeBean_d4a4cd42 extends EJSHome {
	/**
	 * EJSBMPFonteHomeBean_d4a4cd42
	 * @generated
	 */
	public EJSBMPFonteHomeBean_d4a4cd42() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findAllFontes
	 * @generated
	 */
	public java.util.Collection findAllFontes()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			FonteBean bean = (FonteBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllFontes();
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
	public br.smat.ejb.fonte.Fonte create(java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.fonte.Fonte result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.fonte.FonteBean bean =
				(br.smat.ejb.fonte.FonteBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.fonte.FonteKey _primaryKey = bean.ejbCreate(nome);
			result =
				(br.smat.ejb.fonte.Fonte) super.postCreate(
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
	public Fonte findByPrimaryKey(br.smat.ejb.fonte.FonteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		Fonte _EJS_bmp = (Fonte) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.fonte.FonteKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				FonteBean _EJS_bean =
					(FonteBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(br.smat.ejb.fonte.FonteKey) _EJS_bean.ejbFindByPrimaryKey(
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
			_EJS_bmp = (Fonte) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllFontes_Local
	 * @generated
	 */
	public java.util.Collection findAllFontes_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			FonteBean bean = (FonteBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllFontes();
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
	public br.smat.ejb.fonte.FonteLocal create_Local(java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.fonte.FonteLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.fonte.FonteBean bean =
				(br.smat.ejb.fonte.FonteBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.fonte.FonteKey _primaryKey = bean.ejbCreate(nome);
			result =
				(br.smat.ejb.fonte.FonteLocal) super.postCreate_Local(
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
	public FonteLocal findByPrimaryKey_Local(
		br.smat.ejb.fonte.FonteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		FonteLocal _EJS_bmp = (FonteLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.fonte.FonteKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				FonteBean _EJS_bean =
					(FonteBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(br.smat.ejb.fonte.FonteKey) _EJS_bean.ejbFindByPrimaryKey(
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
				(FonteLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
}
