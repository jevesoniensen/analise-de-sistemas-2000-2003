package br.smat.ejb.pontofiscalizacao;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPPontoFiscalizacaoHomeBean_570f9a1c
 * @generated
 */
public class EJSBMPPontoFiscalizacaoHomeBean_570f9a1c extends EJSHome {
	/**
	 * EJSBMPPontoFiscalizacaoHomeBean_570f9a1c
	 * @generated
	 */
	public EJSBMPPontoFiscalizacaoHomeBean_570f9a1c()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findAllPontoFiscalizacao
	 * @generated
	 */
	public java.util.Collection findAllPontoFiscalizacao()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			PontoFiscalizacaoBean bean =
				(PontoFiscalizacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllPontoFiscalizacao();
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
	public PontoFiscalizacao findByPrimaryKey(
		br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		PontoFiscalizacao _EJS_bmp =
			(PontoFiscalizacao) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				PontoFiscalizacaoBean _EJS_bean =
					(PontoFiscalizacaoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.pontofiscalizacao
							.PontoFiscalizacaoKey) _EJS_bean
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
				(PontoFiscalizacao) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllPontoFiscalizacao_Local
	 * @generated
	 */
	public java.util.Collection findAllPontoFiscalizacao_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			PontoFiscalizacaoBean bean =
				(PontoFiscalizacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllPontoFiscalizacao();
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
	public PontoFiscalizacaoLocal findByPrimaryKey_Local(
		br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		PontoFiscalizacaoLocal _EJS_bmp =
			(PontoFiscalizacaoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				PontoFiscalizacaoBean _EJS_bean =
					(PontoFiscalizacaoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.pontofiscalizacao
							.PontoFiscalizacaoKey) _EJS_bean
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
				(PontoFiscalizacaoLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.pontofiscalizacao.PontoFiscalizacao create(
		java.lang.String nome,
		java.lang.String descricao,
		int ramoAtividade)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.pontofiscalizacao.PontoFiscalizacao result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoBean bean =
				(br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey _primaryKey =
				bean.ejbCreate(nome, descricao, ramoAtividade);
			result =
				(
					br
						.smat
						.ejb
						.pontofiscalizacao
						.PontoFiscalizacao) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, descricao, ramoAtividade);
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
	public br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoLocal create_Local(
		java.lang.String nome,
		java.lang.String descricao,
		int ramoAtividade)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoBean bean =
				(br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey _primaryKey =
				bean.ejbCreate(nome, descricao, ramoAtividade);
			result =
				(
					br
						.smat
						.ejb
						.pontofiscalizacao
						.PontoFiscalizacaoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, descricao, ramoAtividade);
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
	 * findAllPontoFiscalizacao
	 * @generated
	 */
	public java.util.Collection findAllPontoFiscalizacao(int ramoAtividade)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			PontoFiscalizacaoBean bean =
				(PontoFiscalizacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllPontoFiscalizacao(ramoAtividade);
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
	 * findAllPontoFiscalizacao_Local
	 * @generated
	 */
	public java.util.Collection findAllPontoFiscalizacao_Local(
		int ramoAtividade)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			PontoFiscalizacaoBean bean =
				(PontoFiscalizacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllPontoFiscalizacao(ramoAtividade);
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
