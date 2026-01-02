package br.smat.ejb.tramitefiscalizacao;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPTramiteFiscalizacaoHomeBean_a8af6b73
 * @generated
 */
public class EJSBMPTramiteFiscalizacaoHomeBean_a8af6b73 extends EJSHome {
	/**
	 * EJSBMPTramiteFiscalizacaoHomeBean_a8af6b73
	 * @generated
	 */
	public EJSBMPTramiteFiscalizacaoHomeBean_a8af6b73()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacao create(
		int fiscalizacao,
		int status)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacao result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoBean bean =
				(br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey _primaryKey =
				bean.ejbCreate(fiscalizacao, status);
			result =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.TramiteFiscalizacao) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(fiscalizacao, status);
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
	public TramiteFiscalizacao findByPrimaryKey(
		br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TramiteFiscalizacao _EJS_bmp =
			(TramiteFiscalizacao) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TramiteFiscalizacaoBean _EJS_bean =
					(TramiteFiscalizacaoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.tramitefiscalizacao
							.TramiteFiscalizacaoKey) _EJS_bean
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
				(TramiteFiscalizacao) super.activateBean(
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
		.tramitefiscalizacao
		.TramiteFiscalizacaoLocal create_Local(
		int fiscalizacao,
		int status)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoBean bean =
				(br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey _primaryKey =
				bean.ejbCreate(fiscalizacao, status);
			result =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.TramiteFiscalizacaoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(fiscalizacao, status);
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
	public TramiteFiscalizacaoLocal findByPrimaryKey_Local(
		br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TramiteFiscalizacaoLocal _EJS_bmp =
			(TramiteFiscalizacaoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TramiteFiscalizacaoBean _EJS_bean =
					(TramiteFiscalizacaoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.tramitefiscalizacao
							.TramiteFiscalizacaoKey) _EJS_bean
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
				(TramiteFiscalizacaoLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllTramitesFiscalizacao
	 * @generated
	 */
	public java.util.Collection findAllTramitesFiscalizacao(int fiscalizacao)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TramiteFiscalizacaoBean bean =
				(TramiteFiscalizacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllTramitesFiscalizacao(fiscalizacao);
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
	 * findAllTramitesFiscalizacao_Local
	 * @generated
	 */
	public java.util.Collection findAllTramitesFiscalizacao_Local(
		int fiscalizacao)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TramiteFiscalizacaoBean bean =
				(TramiteFiscalizacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllTramitesFiscalizacao(fiscalizacao);
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
