package br.smat.ejb.medidacorretivafiscalizacao;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPMedidaCorretivaFiscalizacaoHomeBean_7dc0c8a6
 * @generated
 */
public class EJSBMPMedidaCorretivaFiscalizacaoHomeBean_7dc0c8a6
	extends EJSHome {
	/**
	 * EJSBMPMedidaCorretivaFiscalizacaoHomeBean_7dc0c8a6
	 * @generated
	 */
	public EJSBMPMedidaCorretivaFiscalizacaoHomeBean_7dc0c8a6()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public MedidaCorretivaFiscalizacao findByPrimaryKey(
		br
			.smat
			.ejb
			.medidacorretivafiscalizacao
			.MedidaCorretivaFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		MedidaCorretivaFiscalizacao _EJS_bmp =
			(MedidaCorretivaFiscalizacao) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				MedidaCorretivaFiscalizacaoBean _EJS_bean =
					(MedidaCorretivaFiscalizacaoBean) _EJS_beanO
						.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.medidacorretivafiscalizacao
							.MedidaCorretivaFiscalizacaoKey) _EJS_bean
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
				(MedidaCorretivaFiscalizacao) super.activateBean(
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
		.medidacorretivafiscalizacao
		.MedidaCorretivaFiscalizacao create(
			int tramiteFiscalizacao,
			int fiscalizacao,
			int tipoMedidaCorretiva,
			int prazoDias,
			java.lang.String observacao)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br
			.smat
			.ejb
			.medidacorretivafiscalizacao
			.MedidaCorretivaFiscalizacao result =
			null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoBean bean =
				(br
					.smat
					.ejb
					.medidacorretivafiscalizacao
					.MedidaCorretivaFiscalizacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoKey _primaryKey =
				bean.ejbCreate(
					tramiteFiscalizacao,
					fiscalizacao,
					tipoMedidaCorretiva,
					prazoDias,
					observacao);
			result =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.MedidaCorretivaFiscalizacao) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				tramiteFiscalizacao,
				fiscalizacao,
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
	 * create_Local
	 * @generated
	 */
	public br
		.smat
		.ejb
		.medidacorretivafiscalizacao
		.MedidaCorretivaFiscalizacaoLocal create_Local(
			int tramiteFiscalizacao,
			int fiscalizacao,
			int tipoMedidaCorretiva,
			int prazoDias,
			java.lang.String observacao)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br
			.smat
			.ejb
			.medidacorretivafiscalizacao
			.MedidaCorretivaFiscalizacaoLocal result =
			null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoBean bean =
				(br
					.smat
					.ejb
					.medidacorretivafiscalizacao
					.MedidaCorretivaFiscalizacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoKey _primaryKey =
				bean.ejbCreate(
					tramiteFiscalizacao,
					fiscalizacao,
					tipoMedidaCorretiva,
					prazoDias,
					observacao);
			result =
				(
					br
						.smat
						.ejb
						.medidacorretivafiscalizacao
						.MedidaCorretivaFiscalizacaoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				tramiteFiscalizacao,
				fiscalizacao,
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
	 * findAllMedidaCorretivaFiscalizacao
	 * @generated
	 */
	public java.util.Collection findAllMedidaCorretivaFiscalizacao(
		int tramiteFiscalizacao,
		int fiscalizacao)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			MedidaCorretivaFiscalizacaoBean bean =
				(MedidaCorretivaFiscalizacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllMedidaCorretivaFiscalizacao(
					tramiteFiscalizacao,
					fiscalizacao);
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
	 * findAllMedidaCorretivaFiscalizacao_Local
	 * @generated
	 */
	public java.util.Collection findAllMedidaCorretivaFiscalizacao_Local(
		int tramiteFiscalizacao,
		int fiscalizacao)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			MedidaCorretivaFiscalizacaoBean bean =
				(MedidaCorretivaFiscalizacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllMedidaCorretivaFiscalizacao(
					tramiteFiscalizacao,
					fiscalizacao);
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
	public MedidaCorretivaFiscalizacaoLocal findByPrimaryKey_Local(
		br
			.smat
			.ejb
			.medidacorretivafiscalizacao
			.MedidaCorretivaFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		MedidaCorretivaFiscalizacaoLocal _EJS_bmp =
			(MedidaCorretivaFiscalizacaoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				MedidaCorretivaFiscalizacaoBean _EJS_bean =
					(MedidaCorretivaFiscalizacaoBean) _EJS_beanO
						.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.medidacorretivafiscalizacao
							.MedidaCorretivaFiscalizacaoKey) _EJS_bean
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
				(MedidaCorretivaFiscalizacaoLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
}
