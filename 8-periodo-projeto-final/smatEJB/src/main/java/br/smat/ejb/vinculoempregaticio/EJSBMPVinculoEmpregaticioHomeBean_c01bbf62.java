package br.smat.ejb.vinculoempregaticio;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPVinculoEmpregaticioHomeBean_c01bbf62
 * @generated
 */
public class EJSBMPVinculoEmpregaticioHomeBean_c01bbf62 extends EJSHome {
	/**
	 * EJSBMPVinculoEmpregaticioHomeBean_c01bbf62
	 * @generated
	 */
	public EJSBMPVinculoEmpregaticioHomeBean_c01bbf62()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public VinculoEmpregaticio findByPrimaryKey(
		br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		VinculoEmpregaticio _EJS_bmp =
			(VinculoEmpregaticio) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				VinculoEmpregaticioBean _EJS_bean =
					(VinculoEmpregaticioBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.vinculoempregaticio
							.VinculoEmpregaticioKey) _EJS_bean
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
				(VinculoEmpregaticio) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public VinculoEmpregaticioLocal findByPrimaryKey_Local(
		br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		VinculoEmpregaticioLocal _EJS_bmp =
			(VinculoEmpregaticioLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				VinculoEmpregaticioBean _EJS_bean =
					(VinculoEmpregaticioBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.vinculoempregaticio
							.VinculoEmpregaticioKey) _EJS_bean
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
				(VinculoEmpregaticioLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.vinculoempregaticio.VinculoEmpregaticio create(
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.vinculoempregaticio.VinculoEmpregaticio result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioBean bean =
				(br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioKey _primaryKey =
				bean.ejbCreate(nome);
			result =
				(
					br
						.smat
						.ejb
						.vinculoempregaticio
						.VinculoEmpregaticio) super
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
	 * create_Local
	 * @generated
	 */
	public br
		.smat
		.ejb
		.vinculoempregaticio
		.VinculoEmpregaticioLocal create_Local(
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioBean bean =
				(br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioKey _primaryKey =
				bean.ejbCreate(nome);
			result =
				(
					br
						.smat
						.ejb
						.vinculoempregaticio
						.VinculoEmpregaticioLocal) super
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
	 * findAllVinculosEmpregaticios
	 * @generated
	 */
	public java.util.Collection findAllVinculosEmpregaticios()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			VinculoEmpregaticioBean bean =
				(VinculoEmpregaticioBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllVinculosEmpregaticios();
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
	 * findAllVinculosEmpregaticios_Local
	 * @generated
	 */
	public java.util.Collection findAllVinculosEmpregaticios_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			VinculoEmpregaticioBean bean =
				(VinculoEmpregaticioBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllVinculosEmpregaticios();
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
