package br.smat.ejb.representanteempresa;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPRepresentanteEmpresaHomeBean_7d569c42
 * @generated
 */
public class EJSBMPRepresentanteEmpresaHomeBean_7d569c42 extends EJSHome {
	/**
	 * EJSBMPRepresentanteEmpresaHomeBean_7d569c42
	 * @generated
	 */
	public EJSBMPRepresentanteEmpresaHomeBean_7d569c42()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.representanteempresa.RepresentanteEmpresa create(
		int empresa,
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.representanteempresa.RepresentanteEmpresa result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.representanteempresa.RepresentanteEmpresaBean bean =
				(br
					.smat
					.ejb
					.representanteempresa
					.RepresentanteEmpresaBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br
				.smat
				.ejb
				.representanteempresa
				.RepresentanteEmpresaKey _primaryKey =
				bean.ejbCreate(empresa, nome);
			result =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.RepresentanteEmpresa) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(empresa, nome);
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
	public RepresentanteEmpresa findByPrimaryKey(
		br.smat.ejb.representanteempresa.RepresentanteEmpresaKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		RepresentanteEmpresa _EJS_bmp =
			(RepresentanteEmpresa) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.representanteempresa.RepresentanteEmpresaKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				RepresentanteEmpresaBean _EJS_bean =
					(RepresentanteEmpresaBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.representanteempresa
							.RepresentanteEmpresaKey) _EJS_bean
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
				(RepresentanteEmpresa) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br
		.smat
		.ejb
		.representanteempresa
		.RepresentanteEmpresaLocal create_Local(
		int empresa,
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.representanteempresa.RepresentanteEmpresaLocal result =
			null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.representanteempresa.RepresentanteEmpresaBean bean =
				(br
					.smat
					.ejb
					.representanteempresa
					.RepresentanteEmpresaBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br
				.smat
				.ejb
				.representanteempresa
				.RepresentanteEmpresaKey _primaryKey =
				bean.ejbCreate(empresa, nome);
			result =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.RepresentanteEmpresaLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(empresa, nome);
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
	public RepresentanteEmpresaLocal findByPrimaryKey_Local(
		br.smat.ejb.representanteempresa.RepresentanteEmpresaKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		RepresentanteEmpresaLocal _EJS_bmp =
			(RepresentanteEmpresaLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.representanteempresa.RepresentanteEmpresaKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				RepresentanteEmpresaBean _EJS_bean =
					(RepresentanteEmpresaBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.representanteempresa
							.RepresentanteEmpresaKey) _EJS_bean
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
				(RepresentanteEmpresaLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllRepresentanteEmpresa
	 * @generated
	 */
	public java.util.Collection findAllRepresentanteEmpresa()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RepresentanteEmpresaBean bean =
				(RepresentanteEmpresaBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllRepresentanteEmpresa();
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
	 * findAllRepresentanteEmpresa_Local
	 * @generated
	 */
	public java.util.Collection findAllRepresentanteEmpresa_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RepresentanteEmpresaBean bean =
				(RepresentanteEmpresaBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllRepresentanteEmpresa();
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
	 * findAllRepresentanteByEmpresa
	 * @generated
	 */
	public java.util.Collection findAllRepresentanteByEmpresa(int empresa)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RepresentanteEmpresaBean bean =
				(RepresentanteEmpresaBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllRepresentanteByEmpresa(empresa);
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
	 * findAllRepresentanteByEmpresa_Local
	 * @generated
	 */
	public java.util.Collection findAllRepresentanteByEmpresa_Local(
		int empresa)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RepresentanteEmpresaBean bean =
				(RepresentanteEmpresaBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllRepresentanteByEmpresa(empresa);
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
