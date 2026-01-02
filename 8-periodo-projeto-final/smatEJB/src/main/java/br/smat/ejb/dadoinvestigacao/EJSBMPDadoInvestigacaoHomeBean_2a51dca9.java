package br.smat.ejb.dadoinvestigacao;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPDadoInvestigacaoHomeBean_2a51dca9
 * @generated
 */
public class EJSBMPDadoInvestigacaoHomeBean_2a51dca9 extends EJSHome {
	/**
	 * EJSBMPDadoInvestigacaoHomeBean_2a51dca9
	 * @generated
	 */
	public EJSBMPDadoInvestigacaoHomeBean_2a51dca9()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findAllDadoInvestigacao
	 * @generated
	 */
	public java.util.Collection findAllDadoInvestigacao(int dadoInvestigacao)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			DadoInvestigacaoBean bean =
				(DadoInvestigacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllDadoInvestigacao(dadoInvestigacao);
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
	public DadoInvestigacao findByPrimaryKey(
		br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		DadoInvestigacao _EJS_bmp =
			(DadoInvestigacao) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				DadoInvestigacaoBean _EJS_bean =
					(DadoInvestigacaoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.dadoinvestigacao
							.DadoInvestigacaoKey) _EJS_bean
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
				(DadoInvestigacao) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllDadoInvestigacao_Local
	 * @generated
	 */
	public java.util.Collection findAllDadoInvestigacao_Local(
		int dadoInvestigacao)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			DadoInvestigacaoBean bean =
				(DadoInvestigacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllDadoInvestigacao(dadoInvestigacao);
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
	public DadoInvestigacaoLocal findByPrimaryKey_Local(
		br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		DadoInvestigacaoLocal _EJS_bmp =
			(DadoInvestigacaoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				DadoInvestigacaoBean _EJS_bean =
					(DadoInvestigacaoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.dadoinvestigacao
							.DadoInvestigacaoKey) _EJS_bean
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
				(DadoInvestigacaoLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.dadoinvestigacao.DadoInvestigacao create(
		int investigacao,
		int pessoa,
		java.lang.String dataHora,
		int agenteCausador,
		java.lang.String descricao,
		int tipoDepoimento)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.dadoinvestigacao.DadoInvestigacao result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean bean =
				(br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey _primaryKey =
				bean.ejbCreate(
					investigacao,
					pessoa,
					dataHora,
					agenteCausador,
					descricao,
					tipoDepoimento);
			result =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacao) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				investigacao,
				pessoa,
				dataHora,
				agenteCausador,
				descricao,
				tipoDepoimento);
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
	public br.smat.ejb.dadoinvestigacao.DadoInvestigacaoLocal create_Local(
		int investigacao,
		int pessoa,
		java.lang.String dataHora,
		int agenteCausador,
		java.lang.String descricao,
		int tipoDepoimento)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.dadoinvestigacao.DadoInvestigacaoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean bean =
				(br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey _primaryKey =
				bean.ejbCreate(
					investigacao,
					pessoa,
					dataHora,
					agenteCausador,
					descricao,
					tipoDepoimento);
			result =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				investigacao,
				pessoa,
				dataHora,
				agenteCausador,
				descricao,
				tipoDepoimento);
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
