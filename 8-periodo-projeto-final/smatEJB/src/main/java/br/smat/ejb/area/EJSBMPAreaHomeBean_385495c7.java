package br.smat.ejb.area;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPAreaHomeBean_385495c7
 * @generated
 */
public class EJSBMPAreaHomeBean_385495c7 extends EJSHome {
	/**
	 * EJSBMPAreaHomeBean_385495c7
	 * @generated
	 */
	public EJSBMPAreaHomeBean_385495c7() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public Area findByPrimaryKey(br.smat.ejb.area.AreaKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		Area _EJS_bmp = (Area) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.area.AreaKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				AreaBean _EJS_bean = (AreaBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(br.smat.ejb.area.AreaKey) _EJS_bean.ejbFindByPrimaryKey(
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
			_EJS_bmp = (Area) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.area.Area create(java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.area.Area result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.area.AreaBean bean =
				(br.smat.ejb.area.AreaBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.area.AreaKey _primaryKey = bean.ejbCreate(nome);
			result =
				(br.smat.ejb.area.Area) super.postCreate(
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
	public AreaLocal findByPrimaryKey_Local(
		br.smat.ejb.area.AreaKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		AreaLocal _EJS_bmp = (AreaLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.area.AreaKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				AreaBean _EJS_bean = (AreaBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(br.smat.ejb.area.AreaKey) _EJS_bean.ejbFindByPrimaryKey(
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
				(AreaLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.area.AreaLocal create_Local(java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.area.AreaLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.area.AreaBean bean =
				(br.smat.ejb.area.AreaBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.area.AreaKey _primaryKey = bean.ejbCreate(nome);
			result =
				(br.smat.ejb.area.AreaLocal) super.postCreate_Local(
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
	 * findAllAreas
	 * @generated
	 */
	public java.util.Collection findAllAreas()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			AreaBean bean = (AreaBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllAreas();
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
	 * findAllAreas_Local
	 * @generated
	 */
	public java.util.Collection findAllAreas_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			AreaBean bean = (AreaBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllAreas();
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
}
