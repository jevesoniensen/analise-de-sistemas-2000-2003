package br.smat.ejb.medidacorretivainvestigacao;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPMedidaCorretivaInvestigacaoHomeBean_fece7eb8
 * @generated
 */
public class EJSBMPMedidaCorretivaInvestigacaoHomeBean_fece7eb8
	extends EJSHome {
	/**
	 * EJSBMPMedidaCorretivaInvestigacaoHomeBean_fece7eb8
	 * @generated
	 */
	public EJSBMPMedidaCorretivaInvestigacaoHomeBean_fece7eb8()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findAllMedidaCorretivaInvestigacao
	 * @generated
	 */
	public java.util.Collection findAllMedidaCorretivaInvestigacao(
		int investigacao)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			MedidaCorretivaInvestigacaoBean bean =
				(MedidaCorretivaInvestigacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllMedidaCorretivaInvestigacao(investigacao);
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
	public MedidaCorretivaInvestigacao findByPrimaryKey(
		br
			.smat
			.ejb
			.medidacorretivainvestigacao
			.MedidaCorretivaInvestigacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		MedidaCorretivaInvestigacao _EJS_bmp =
			(MedidaCorretivaInvestigacao) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				MedidaCorretivaInvestigacaoBean _EJS_bean =
					(MedidaCorretivaInvestigacaoBean) _EJS_beanO
						.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.medidacorretivainvestigacao
							.MedidaCorretivaInvestigacaoKey) _EJS_bean
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
				(MedidaCorretivaInvestigacao) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br
		.smat
		.ejb
		.medidacorretivainvestigacao
		.MedidaCorretivaInvestigacao create(
			int investigacao,
			int tipoMedidaCorretiva,
			int prazoDias,
			java.lang.String observacao)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br
			.smat
			.ejb
			.medidacorretivainvestigacao
			.MedidaCorretivaInvestigacao result =
			null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoBean bean =
				(br
					.smat
					.ejb
					.medidacorretivainvestigacao
					.MedidaCorretivaInvestigacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoKey _primaryKey =
				bean.ejbCreate(
					investigacao,
					tipoMedidaCorretiva,
					prazoDias,
					observacao);
			result =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.MedidaCorretivaInvestigacao) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				investigacao,
				tipoMedidaCorretiva,
				prazoDias,
				observacao);
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
	 * findAllMedidaCorretivaInvestigacao_Local
	 * @generated
	 */
	public java.util.Collection findAllMedidaCorretivaInvestigacao_Local(
		int investigacao)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			MedidaCorretivaInvestigacaoBean bean =
				(MedidaCorretivaInvestigacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllMedidaCorretivaInvestigacao(investigacao);
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
	public MedidaCorretivaInvestigacaoLocal findByPrimaryKey_Local(
		br
			.smat
			.ejb
			.medidacorretivainvestigacao
			.MedidaCorretivaInvestigacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		MedidaCorretivaInvestigacaoLocal _EJS_bmp =
			(MedidaCorretivaInvestigacaoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				MedidaCorretivaInvestigacaoBean _EJS_bean =
					(MedidaCorretivaInvestigacaoBean) _EJS_beanO
						.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.medidacorretivainvestigacao
							.MedidaCorretivaInvestigacaoKey) _EJS_bean
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
				(MedidaCorretivaInvestigacaoLocal) super.activateBean_Local(
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
		.medidacorretivainvestigacao
		.MedidaCorretivaInvestigacaoLocal create_Local(
			int investigacao,
			int tipoMedidaCorretiva,
			int prazoDias,
			java.lang.String observacao)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br
			.smat
			.ejb
			.medidacorretivainvestigacao
			.MedidaCorretivaInvestigacaoLocal result =
			null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoBean bean =
				(br
					.smat
					.ejb
					.medidacorretivainvestigacao
					.MedidaCorretivaInvestigacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoKey _primaryKey =
				bean.ejbCreate(
					investigacao,
					tipoMedidaCorretiva,
					prazoDias,
					observacao);
			result =
				(
					br
						.smat
						.ejb
						.medidacorretivainvestigacao
						.MedidaCorretivaInvestigacaoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				investigacao,
				tipoMedidaCorretiva,
				prazoDias,
				observacao);
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
