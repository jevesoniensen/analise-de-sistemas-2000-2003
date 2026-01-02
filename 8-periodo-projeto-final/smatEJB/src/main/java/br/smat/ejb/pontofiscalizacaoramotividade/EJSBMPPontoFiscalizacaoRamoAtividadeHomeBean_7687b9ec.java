package br.smat.ejb.pontofiscalizacaoramotividade;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPPontoFiscalizacaoRamoAtividadeHomeBean_7687b9ec
 * @generated
 */
public class EJSBMPPontoFiscalizacaoRamoAtividadeHomeBean_7687b9ec
	extends EJSHome {
	/**
	 * EJSBMPPontoFiscalizacaoRamoAtividadeHomeBean_7687b9ec
	 * @generated
	 */
	public EJSBMPPontoFiscalizacaoRamoAtividadeHomeBean_7687b9ec()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public PontoFiscalizacaoRamoAtividade findByPrimaryKey(
		br
			.smat
			.ejb
			.pontofiscalizacaoramotividade
			.PontoFiscalizacaoRamoAtividadeKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		PontoFiscalizacaoRamoAtividade _EJS_bmp =
			(PontoFiscalizacaoRamoAtividade) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				PontoFiscalizacaoRamoAtividadeBean _EJS_bean =
					(PontoFiscalizacaoRamoAtividadeBean) _EJS_beanO
						.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.pontofiscalizacaoramotividade
							.PontoFiscalizacaoRamoAtividadeKey) _EJS_bean
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
				(PontoFiscalizacaoRamoAtividade) super.activateBean(
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
		.pontofiscalizacaoramotividade
		.PontoFiscalizacaoRamoAtividade create(
			int pontoFiscalizacao,
			int ramoAtividade)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br
			.smat
			.ejb
			.pontofiscalizacaoramotividade
			.PontoFiscalizacaoRamoAtividade result =
			null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeBean bean =
				(br
					.smat
					.ejb
					.pontofiscalizacaoramotividade
					.PontoFiscalizacaoRamoAtividadeBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeKey _primaryKey =
				bean.ejbCreate(pontoFiscalizacao, ramoAtividade);
			result =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoramotividade
						.PontoFiscalizacaoRamoAtividade) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(pontoFiscalizacao, ramoAtividade);
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
	public PontoFiscalizacaoRamoAtividadeLocal findByPrimaryKey_Local(
		br
			.smat
			.ejb
			.pontofiscalizacaoramotividade
			.PontoFiscalizacaoRamoAtividadeKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		PontoFiscalizacaoRamoAtividadeLocal _EJS_bmp =
			(PontoFiscalizacaoRamoAtividadeLocal) super.getBean_Local(
				primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				PontoFiscalizacaoRamoAtividadeBean _EJS_bean =
					(PontoFiscalizacaoRamoAtividadeBean) _EJS_beanO
						.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.pontofiscalizacaoramotividade
							.PontoFiscalizacaoRamoAtividadeKey) _EJS_bean
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
				(PontoFiscalizacaoRamoAtividadeLocal) super.activateBean_Local(
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
		.pontofiscalizacaoramotividade
		.PontoFiscalizacaoRamoAtividadeLocal create_Local(
			int pontoFiscalizacao,
			int ramoAtividade)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br
			.smat
			.ejb
			.pontofiscalizacaoramotividade
			.PontoFiscalizacaoRamoAtividadeLocal result =
			null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeBean bean =
				(br
					.smat
					.ejb
					.pontofiscalizacaoramotividade
					.PontoFiscalizacaoRamoAtividadeBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeKey _primaryKey =
				bean.ejbCreate(pontoFiscalizacao, ramoAtividade);
			result =
				(
					br
						.smat
						.ejb
						.pontofiscalizacaoramotividade
						.PontoFiscalizacaoRamoAtividadeLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(pontoFiscalizacao, ramoAtividade);
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
