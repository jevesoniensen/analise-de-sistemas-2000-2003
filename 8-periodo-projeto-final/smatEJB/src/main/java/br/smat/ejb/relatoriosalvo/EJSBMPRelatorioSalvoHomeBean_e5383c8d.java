package br.smat.ejb.relatoriosalvo;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPRelatorioSalvoHomeBean_e5383c8d
 * @generated
 */
public class EJSBMPRelatorioSalvoHomeBean_e5383c8d extends EJSHome {
	/**
	 * EJSBMPRelatorioSalvoHomeBean_e5383c8d
	 * @generated
	 */
	public EJSBMPRelatorioSalvoHomeBean_e5383c8d()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public RelatorioSalvo findByPrimaryKey(
		br.smat.ejb.relatoriosalvo.RelatorioSalvoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		RelatorioSalvo _EJS_bmp = (RelatorioSalvo) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.relatoriosalvo.RelatorioSalvoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				RelatorioSalvoBean _EJS_bean =
					(RelatorioSalvoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.relatoriosalvo
							.RelatorioSalvoKey) _EJS_bean
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
				(RelatorioSalvo) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllRelatorios
	 * @generated
	 */
	public java.util.Collection findAllRelatorios()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RelatorioSalvoBean bean =
				(RelatorioSalvoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllRelatorios();
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
	public RelatorioSalvoLocal findByPrimaryKey_Local(
		br.smat.ejb.relatoriosalvo.RelatorioSalvoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		RelatorioSalvoLocal _EJS_bmp =
			(RelatorioSalvoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.relatoriosalvo.RelatorioSalvoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				RelatorioSalvoBean _EJS_bean =
					(RelatorioSalvoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.relatoriosalvo
							.RelatorioSalvoKey) _EJS_bean
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
				(RelatorioSalvoLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllRelatorios_Local
	 * @generated
	 */
	public java.util.Collection findAllRelatorios_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RelatorioSalvoBean bean =
				(RelatorioSalvoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllRelatorios();
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
	 * create
	 * @generated
	 */
	public br.smat.ejb.relatoriosalvo.RelatorioSalvo create(
		int tipoAgrupamento,
		int local,
		java.lang.String queryLocal,
		int periodicidade,
		int campo1,
		java.lang.String queryCampo1,
		int campo2,
		java.lang.String queryCampo2,
		java.lang.String dataInicio,
		java.lang.String dataFim,
		java.lang.String titulo,
		java.lang.String texto)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.relatoriosalvo.RelatorioSalvo result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean bean =
				(br.smat.ejb.relatoriosalvo.RelatorioSalvoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.relatoriosalvo.RelatorioSalvoKey _primaryKey =
				bean.ejbCreate(
					tipoAgrupamento,
					local,
					queryLocal,
					periodicidade,
					campo1,
					queryCampo1,
					campo2,
					queryCampo2,
					dataInicio,
					dataFim,
					titulo,
					texto);
			result =
				(br.smat.ejb.relatoriosalvo.RelatorioSalvo) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				tipoAgrupamento,
				local,
				queryLocal,
				periodicidade,
				campo1,
				queryCampo1,
				campo2,
				queryCampo2,
				dataInicio,
				dataFim,
				titulo,
				texto);
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
	public br.smat.ejb.relatoriosalvo.RelatorioSalvoLocal create_Local(
		int tipoAgrupamento,
		int local,
		java.lang.String queryLocal,
		int periodicidade,
		int campo1,
		java.lang.String queryCampo1,
		int campo2,
		java.lang.String queryCampo2,
		java.lang.String dataInicio,
		java.lang.String dataFim,
		java.lang.String titulo,
		java.lang.String texto)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.relatoriosalvo.RelatorioSalvoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean bean =
				(br.smat.ejb.relatoriosalvo.RelatorioSalvoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.relatoriosalvo.RelatorioSalvoKey _primaryKey =
				bean.ejbCreate(
					tipoAgrupamento,
					local,
					queryLocal,
					periodicidade,
					campo1,
					queryCampo1,
					campo2,
					queryCampo2,
					dataInicio,
					dataFim,
					titulo,
					texto);
			result =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				tipoAgrupamento,
				local,
				queryLocal,
				periodicidade,
				campo1,
				queryCampo1,
				campo2,
				queryCampo2,
				dataInicio,
				dataFim,
				titulo,
				texto);
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
