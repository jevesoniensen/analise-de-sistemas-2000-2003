package br.smat.ejb.localatendimento;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPLocalAtendimentoHomeBean_60d99d9d
 * @generated
 */
public class EJSBMPLocalAtendimentoHomeBean_60d99d9d extends EJSHome {
	/**
	 * EJSBMPLocalAtendimentoHomeBean_60d99d9d
	 * @generated
	 */
	public EJSBMPLocalAtendimentoHomeBean_60d99d9d()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public LocalAtendimento findByPrimaryKey(
		br.smat.ejb.localatendimento.LocalAtendimentoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		LocalAtendimento _EJS_bmp =
			(LocalAtendimento) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.localatendimento.LocalAtendimentoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				LocalAtendimentoBean _EJS_bean =
					(LocalAtendimentoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.localatendimento
							.LocalAtendimentoKey) _EJS_bean
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
				(LocalAtendimento) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.localatendimento.LocalAtendimento create(
		java.lang.String nome,
		int municipio)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.localatendimento.LocalAtendimento result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.localatendimento.LocalAtendimentoBean bean =
				(br.smat.ejb.localatendimento.LocalAtendimentoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.localatendimento.LocalAtendimentoKey _primaryKey =
				bean.ejbCreate(nome, municipio);
			result =
				(
					br
						.smat
						.ejb
						.localatendimento
						.LocalAtendimento) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, municipio);
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
	 * findAllLocaisAtendimento
	 * @generated
	 */
	public java.util.Collection findAllLocaisAtendimento()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			LocalAtendimentoBean bean =
				(LocalAtendimentoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllLocaisAtendimento();
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
	public LocalAtendimentoLocal findByPrimaryKey_Local(
		br.smat.ejb.localatendimento.LocalAtendimentoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		LocalAtendimentoLocal _EJS_bmp =
			(LocalAtendimentoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.localatendimento.LocalAtendimentoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				LocalAtendimentoBean _EJS_bean =
					(LocalAtendimentoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.localatendimento
							.LocalAtendimentoKey) _EJS_bean
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
				(LocalAtendimentoLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.localatendimento.LocalAtendimentoLocal create_Local(
		java.lang.String nome,
		int municipio)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.localatendimento.LocalAtendimentoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.localatendimento.LocalAtendimentoBean bean =
				(br.smat.ejb.localatendimento.LocalAtendimentoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.localatendimento.LocalAtendimentoKey _primaryKey =
				bean.ejbCreate(nome, municipio);
			result =
				(
					br
						.smat
						.ejb
						.localatendimento
						.LocalAtendimentoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, municipio);
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
	 * findAllLocaisAtendimento_Local
	 * @generated
	 */
	public java.util.Collection findAllLocaisAtendimento_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			LocalAtendimentoBean bean =
				(LocalAtendimentoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllLocaisAtendimento();
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
