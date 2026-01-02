package br.smat.ejb.pontofiscalizacaoitemfiscalizacao;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPPontoFiscalizacaoItemFiscalizacaHomeBean_8febdf95
 * @generated
 */
public class EJSBMPPontoFiscalizacaoItemFiscalizacaHomeBean_8febdf95
	extends EJSHome {
	/**
	 * EJSBMPPontoFiscalizacaoItemFiscalizacaHomeBean_8febdf95
	 * @generated
	 */
	public EJSBMPPontoFiscalizacaoItemFiscalizacaHomeBean_8febdf95()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public PontoFiscalizacaoItemFiscalizacao findByPrimaryKey(
		br
			.smat
			.ejb
			.pontofiscalizacaoitemfiscalizacao
			.PontoFiscalizacaoItemFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		PontoFiscalizacaoItemFiscalizacao _EJS_bmp =
			(PontoFiscalizacaoItemFiscalizacao) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				PontoFiscalizacaoItemFiscalizacaoBean _EJS_bean =
					(PontoFiscalizacaoItemFiscalizacaoBean) _EJS_beanO
						.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.pontofiscalizacaoitemfiscalizacao
							.PontoFiscalizacaoItemFiscalizacaoKey) _EJS_bean
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
				(PontoFiscalizacaoItemFiscalizacao) super.activateBean(
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
		.pontofiscalizacaoitemfiscalizacao
		.PontoFiscalizacaoItemFiscalizacao create(
			int pontoFiscalizacao,
			int itemFiscalizacao)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br
			.smat
			.ejb
			.pontofiscalizacaoitemfiscalizacao
			.PontoFiscalizacaoItemFiscalizacao result =
			null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoBean bean =
				(br
					.smat
					.ejb
					.pontofiscalizacaoitemfiscalizacao
					.PontoFiscalizacaoItemFiscalizacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoKey _primaryKey =
				bean.ejbCreate(pontoFiscalizacao, itemFiscalizacao);
			result =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoitemfiscalizacao
						.PontoFiscalizacaoItemFiscalizacao) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(pontoFiscalizacao, itemFiscalizacao);
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
	public PontoFiscalizacaoItemFiscalizacaoLocal findByPrimaryKey_Local(
		br
			.smat
			.ejb
			.pontofiscalizacaoitemfiscalizacao
			.PontoFiscalizacaoItemFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		PontoFiscalizacaoItemFiscalizacaoLocal _EJS_bmp =
			(PontoFiscalizacaoItemFiscalizacaoLocal) super.getBean_Local(
				primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				PontoFiscalizacaoItemFiscalizacaoBean _EJS_bean =
					(PontoFiscalizacaoItemFiscalizacaoBean) _EJS_beanO
						.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.pontofiscalizacaoitemfiscalizacao
							.PontoFiscalizacaoItemFiscalizacaoKey) _EJS_bean
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
				(
					PontoFiscalizacaoItemFiscalizacaoLocal) super
						.activateBean_Local(
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
		.pontofiscalizacaoitemfiscalizacao
		.PontoFiscalizacaoItemFiscalizacaoLocal create_Local(
			int pontoFiscalizacao,
			int itemFiscalizacao)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br
			.smat
			.ejb
			.pontofiscalizacaoitemfiscalizacao
			.PontoFiscalizacaoItemFiscalizacaoLocal result =
			null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoBean bean =
				(br
					.smat
					.ejb
					.pontofiscalizacaoitemfiscalizacao
					.PontoFiscalizacaoItemFiscalizacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoKey _primaryKey =
				bean.ejbCreate(pontoFiscalizacao, itemFiscalizacao);
			result =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoitemfiscalizacao
						.PontoFiscalizacaoItemFiscalizacaoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(pontoFiscalizacao, itemFiscalizacao);
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
