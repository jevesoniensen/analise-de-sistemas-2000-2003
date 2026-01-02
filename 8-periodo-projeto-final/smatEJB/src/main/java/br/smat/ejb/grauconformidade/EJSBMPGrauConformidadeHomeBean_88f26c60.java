package br.smat.ejb.grauconformidade;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPGrauConformidadeHomeBean_88f26c60
 * @generated
 */
public class EJSBMPGrauConformidadeHomeBean_88f26c60 extends EJSHome {
	/**
	 * EJSBMPGrauConformidadeHomeBean_88f26c60
	 * @generated
	 */
	public EJSBMPGrauConformidadeHomeBean_88f26c60()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public GrauConformidade findByPrimaryKey(
		br.smat.ejb.grauconformidade.GrauConformidadeKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		GrauConformidade _EJS_bmp =
			(GrauConformidade) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.grauconformidade.GrauConformidadeKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				GrauConformidadeBean _EJS_bean =
					(GrauConformidadeBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.grauconformidade
							.GrauConformidadeKey) _EJS_bean
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
				(GrauConformidade) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.grauconformidade.GrauConformidade create(
		java.lang.String nome,
		java.lang.String descricao)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.grauconformidade.GrauConformidade result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.grauconformidade.GrauConformidadeBean bean =
				(br.smat.ejb.grauconformidade.GrauConformidadeBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.grauconformidade.GrauConformidadeKey _primaryKey =
				bean.ejbCreate(nome, descricao);
			result =
				(
					br
						.smat
						.ejb
						.grauconformidade
						.GrauConformidade) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, descricao);
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
	 * findAllTipoAcidente
	 * @generated
	 */
	public java.util.Collection findAllTipoAcidente()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			GrauConformidadeBean bean =
				(GrauConformidadeBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTipoAcidente();
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
	public GrauConformidadeLocal findByPrimaryKey_Local(
		br.smat.ejb.grauconformidade.GrauConformidadeKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		GrauConformidadeLocal _EJS_bmp =
			(GrauConformidadeLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.grauconformidade.GrauConformidadeKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				GrauConformidadeBean _EJS_bean =
					(GrauConformidadeBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.grauconformidade
							.GrauConformidadeKey) _EJS_bean
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
				(GrauConformidadeLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.grauconformidade.GrauConformidadeLocal create_Local(
		java.lang.String nome,
		java.lang.String descricao)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.grauconformidade.GrauConformidadeLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.grauconformidade.GrauConformidadeBean bean =
				(br.smat.ejb.grauconformidade.GrauConformidadeBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.grauconformidade.GrauConformidadeKey _primaryKey =
				bean.ejbCreate(nome, descricao);
			result =
				(
					br
						.smat
						.ejb
						.grauconformidade
						.GrauConformidadeLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, descricao);
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
	 * findAllTipoAcidente_Local
	 * @generated
	 */
	public java.util.Collection findAllTipoAcidente_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			GrauConformidadeBean bean =
				(GrauConformidadeBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTipoAcidente();
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
