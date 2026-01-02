package br.smat.ejb.fiscalizacao;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPFiscalizacaoHomeBean_af35881e
 * @generated
 */
public class EJSBMPFiscalizacaoHomeBean_af35881e extends EJSHome {
	/**
	 * EJSBMPFiscalizacaoHomeBean_af35881e
	 * @generated
	 */
	public EJSBMPFiscalizacaoHomeBean_af35881e()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findAllFiscalizacao
	 * @generated
	 */
	public java.util.Collection findAllFiscalizacao()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			FiscalizacaoBean bean =
				(FiscalizacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllFiscalizacao();
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
	 * findByPrimaryKey
	 * @generated
	 */
	public Fiscalizacao findByPrimaryKey(
		br.smat.ejb.fiscalizacao.FiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		Fiscalizacao _EJS_bmp = (Fiscalizacao) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.fiscalizacao.FiscalizacaoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				FiscalizacaoBean _EJS_bean =
					(FiscalizacaoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.fiscalizacao
							.FiscalizacaoKey) _EJS_bean
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
				(Fiscalizacao) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllFiscalizacao_Local
	 * @generated
	 */
	public java.util.Collection findAllFiscalizacao_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			FiscalizacaoBean bean =
				(FiscalizacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllFiscalizacao();
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
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public FiscalizacaoLocal findByPrimaryKey_Local(
		br.smat.ejb.fiscalizacao.FiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		FiscalizacaoLocal _EJS_bmp =
			(FiscalizacaoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.fiscalizacao.FiscalizacaoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				FiscalizacaoBean _EJS_bean =
					(FiscalizacaoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.fiscalizacao
							.FiscalizacaoKey) _EJS_bean
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
				(FiscalizacaoLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.fiscalizacao.Fiscalizacao create(
		int agenteSaude,
		int empregador,
		java.lang.String titulo,
		java.lang.String obsGerais)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.fiscalizacao.Fiscalizacao result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.fiscalizacao.FiscalizacaoBean bean =
				(br.smat.ejb.fiscalizacao.FiscalizacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.fiscalizacao.FiscalizacaoKey _primaryKey =
				bean.ejbCreate(agenteSaude, empregador, titulo, obsGerais);
			result =
				(br.smat.ejb.fiscalizacao.Fiscalizacao) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(agenteSaude, empregador, titulo, obsGerais);
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
	public br.smat.ejb.fiscalizacao.FiscalizacaoLocal create_Local(
		int agenteSaude,
		int empregador,
		java.lang.String titulo,
		java.lang.String obsGerais)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.fiscalizacao.FiscalizacaoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.fiscalizacao.FiscalizacaoBean bean =
				(br.smat.ejb.fiscalizacao.FiscalizacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.fiscalizacao.FiscalizacaoKey _primaryKey =
				bean.ejbCreate(agenteSaude, empregador, titulo, obsGerais);
			result =
				(
					br
						.smat
						.ejb
						.fiscalizacao
						.FiscalizacaoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(agenteSaude, empregador, titulo, obsGerais);
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
}
