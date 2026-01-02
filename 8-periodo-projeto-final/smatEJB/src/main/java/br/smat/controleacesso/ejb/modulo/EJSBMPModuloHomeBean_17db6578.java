package br.smat.controleacesso.ejb.modulo;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPModuloHomeBean_17db6578
 * @generated
 */
public class EJSBMPModuloHomeBean_17db6578 extends EJSHome {
	/**
	 * EJSBMPModuloHomeBean_17db6578
	 * @generated
	 */
	public EJSBMPModuloHomeBean_17db6578() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public Modulo findByPrimaryKey(
		br.smat.controleacesso.ejb.modulo.ModuloKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		Modulo _EJS_bmp = (Modulo) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.controleacesso.ejb.modulo.ModuloKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				ModuloBean _EJS_bean =
					(ModuloBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.controleacesso
							.ejb
							.modulo
							.ModuloKey) _EJS_bean
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
			_EJS_bmp = (Modulo) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.controleacesso.ejb.modulo.Modulo create(
		int paginaDefault,
		java.lang.String nome,
		int moduloPai,
		java.lang.String estrutura)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.controleacesso.ejb.modulo.Modulo result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.controleacesso.ejb.modulo.ModuloBean bean =
				(br.smat.controleacesso.ejb.modulo.ModuloBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.controleacesso.ejb.modulo.ModuloKey _primaryKey =
				bean.ejbCreate(paginaDefault, nome, moduloPai, estrutura);
			result =
				(br.smat.controleacesso.ejb.modulo.Modulo) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(paginaDefault, nome, moduloPai, estrutura);
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
	 * findAllModulos
	 * @generated
	 */
	public java.util.Collection findAllModulos()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			ModuloBean bean = (ModuloBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllModulos();
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
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public ModuloLocal findByPrimaryKey_Local(
		br.smat.controleacesso.ejb.modulo.ModuloKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		ModuloLocal _EJS_bmp = (ModuloLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.controleacesso.ejb.modulo.ModuloKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				ModuloBean _EJS_bean =
					(ModuloBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.controleacesso
							.ejb
							.modulo
							.ModuloKey) _EJS_bean
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
				(ModuloLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.controleacesso.ejb.modulo.ModuloLocal create_Local(
		int paginaDefault,
		java.lang.String nome,
		int moduloPai,
		java.lang.String estrutura)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.controleacesso.ejb.modulo.ModuloLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.controleacesso.ejb.modulo.ModuloBean bean =
				(br.smat.controleacesso.ejb.modulo.ModuloBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.controleacesso.ejb.modulo.ModuloKey _primaryKey =
				bean.ejbCreate(paginaDefault, nome, moduloPai, estrutura);
			result =
				(
					br
						.smat
						.controleacesso
						.ejb
						.modulo
						.ModuloLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(paginaDefault, nome, moduloPai, estrutura);
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
	 * findAllModulos_Local
	 * @generated
	 */
	public java.util.Collection findAllModulos_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			ModuloBean bean = (ModuloBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllModulos();
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
