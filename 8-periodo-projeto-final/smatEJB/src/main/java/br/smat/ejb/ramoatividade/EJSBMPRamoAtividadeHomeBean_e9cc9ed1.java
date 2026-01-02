package br.smat.ejb.ramoatividade;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPRamoAtividadeHomeBean_e9cc9ed1
 * @generated
 */
public class EJSBMPRamoAtividadeHomeBean_e9cc9ed1 extends EJSHome {
	/**
	 * EJSBMPRamoAtividadeHomeBean_e9cc9ed1
	 * @generated
	 */
	public EJSBMPRamoAtividadeHomeBean_e9cc9ed1()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public RamoAtividade findByPrimaryKey(
		br.smat.ejb.ramoatividade.RamoAtividadeKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		RamoAtividade _EJS_bmp = (RamoAtividade) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.ramoatividade.RamoAtividadeKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				RamoAtividadeBean _EJS_bean =
					(RamoAtividadeBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.ramoatividade
							.RamoAtividadeKey) _EJS_bean
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
				(RamoAtividade) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public RamoAtividadeLocal findByPrimaryKey_Local(
		br.smat.ejb.ramoatividade.RamoAtividadeKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		RamoAtividadeLocal _EJS_bmp =
			(RamoAtividadeLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.ramoatividade.RamoAtividadeKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				RamoAtividadeBean _EJS_bean =
					(RamoAtividadeBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.ramoatividade
							.RamoAtividadeKey) _EJS_bean
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
				(RamoAtividadeLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.ramoatividade.RamoAtividade create(
		java.lang.String nome,
		int cnae,
		int ramoSuperior)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.ramoatividade.RamoAtividade result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.ramoatividade.RamoAtividadeBean bean =
				(br.smat.ejb.ramoatividade.RamoAtividadeBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.ramoatividade.RamoAtividadeKey _primaryKey =
				bean.ejbCreate(nome, cnae, ramoSuperior);
			result =
				(br.smat.ejb.ramoatividade.RamoAtividade) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, cnae, ramoSuperior);
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
	public br.smat.ejb.ramoatividade.RamoAtividadeLocal create_Local(
		java.lang.String nome,
		int cnae,
		int ramoSuperior)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.ramoatividade.RamoAtividadeLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.ramoatividade.RamoAtividadeBean bean =
				(br.smat.ejb.ramoatividade.RamoAtividadeBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.ramoatividade.RamoAtividadeKey _primaryKey =
				bean.ejbCreate(nome, cnae, ramoSuperior);
			result =
				(
					br
						.smat
						.ejb
						.ramoatividade
						.RamoAtividadeLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, cnae, ramoSuperior);
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
	 * findAllRamosAtividade
	 * @generated
	 */
	public java.util.Collection findAllRamosAtividade()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RamoAtividadeBean bean =
				(RamoAtividadeBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllRamosAtividade();
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
	 * findAllRamosAtividade_Local
	 * @generated
	 */
	public java.util.Collection findAllRamosAtividade_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RamoAtividadeBean bean =
				(RamoAtividadeBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllRamosAtividade();
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
	 * findAllRamosAtividade
	 * @generated
	 */
	public java.util.Collection findAllRamosAtividade(
		int ramoAtividadeSuperior)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RamoAtividadeBean bean =
				(RamoAtividadeBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllRamosAtividade(ramoAtividadeSuperior);
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
	 * findAllRamosAtividade_Local
	 * @generated
	 */
	public java.util.Collection findAllRamosAtividade_Local(
		int ramoAtividadeSuperior)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RamoAtividadeBean bean =
				(RamoAtividadeBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllRamosAtividade(ramoAtividadeSuperior);
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
