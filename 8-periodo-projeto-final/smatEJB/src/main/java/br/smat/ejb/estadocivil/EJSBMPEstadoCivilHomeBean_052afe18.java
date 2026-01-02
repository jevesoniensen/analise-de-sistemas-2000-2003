package br.smat.ejb.estadocivil;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPEstadoCivilHomeBean_052afe18
 * @generated
 */
public class EJSBMPEstadoCivilHomeBean_052afe18 extends EJSHome {
	/**
	 * EJSBMPEstadoCivilHomeBean_052afe18
	 * @generated
	 */
	public EJSBMPEstadoCivilHomeBean_052afe18()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public EstadoCivil findByPrimaryKey(
		br.smat.ejb.estadocivil.EstadoCivilKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EstadoCivil _EJS_bmp = (EstadoCivil) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.estadocivil.EstadoCivilKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				EstadoCivilBean _EJS_bean =
					(EstadoCivilBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.estadocivil
							.EstadoCivilKey) _EJS_bean
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
				(EstadoCivil) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public EstadoCivilLocal findByPrimaryKey_Local(
		br.smat.ejb.estadocivil.EstadoCivilKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EstadoCivilLocal _EJS_bmp =
			(EstadoCivilLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.estadocivil.EstadoCivilKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				EstadoCivilBean _EJS_bean =
					(EstadoCivilBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.estadocivil
							.EstadoCivilKey) _EJS_bean
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
				(EstadoCivilLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.estadocivil.EstadoCivil create(java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.estadocivil.EstadoCivil result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.estadocivil.EstadoCivilBean bean =
				(br.smat.ejb.estadocivil.EstadoCivilBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.estadocivil.EstadoCivilKey _primaryKey =
				bean.ejbCreate(nome);
			result =
				(br.smat.ejb.estadocivil.EstadoCivil) super.postCreate(
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
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.estadocivil.EstadoCivilLocal create_Local(
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.estadocivil.EstadoCivilLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.estadocivil.EstadoCivilBean bean =
				(br.smat.ejb.estadocivil.EstadoCivilBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.estadocivil.EstadoCivilKey _primaryKey =
				bean.ejbCreate(nome);
			result =
				(
					br
						.smat
						.ejb
						.estadocivil
						.EstadoCivilLocal) super
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
	 * findAllEstadosCivis
	 * @generated
	 */
	public java.util.Collection findAllEstadosCivis()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			EstadoCivilBean bean = (EstadoCivilBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllEstadosCivis();
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
	 * findAllEstadosCivis_Local
	 * @generated
	 */
	public java.util.Collection findAllEstadosCivis_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			EstadoCivilBean bean = (EstadoCivilBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllEstadosCivis();
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
