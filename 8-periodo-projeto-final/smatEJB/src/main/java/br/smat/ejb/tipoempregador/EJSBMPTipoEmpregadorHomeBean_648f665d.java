package br.smat.ejb.tipoempregador;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPTipoEmpregadorHomeBean_648f665d
 * @generated
 */
public class EJSBMPTipoEmpregadorHomeBean_648f665d extends EJSHome {
	/**
	 * EJSBMPTipoEmpregadorHomeBean_648f665d
	 * @generated
	 */
	public EJSBMPTipoEmpregadorHomeBean_648f665d()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public TipoEmpregador findByPrimaryKey(
		br.smat.ejb.tipoempregador.TipoEmpregadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TipoEmpregador _EJS_bmp = (TipoEmpregador) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.tipoempregador.TipoEmpregadorKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TipoEmpregadorBean _EJS_bean =
					(TipoEmpregadorBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.tipoempregador
							.TipoEmpregadorKey) _EJS_bean
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
				(TipoEmpregador) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.tipoempregador.TipoEmpregador create(
		java.lang.String nome,
		java.lang.String docIdentificador)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.tipoempregador.TipoEmpregador result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.tipoempregador.TipoEmpregadorBean bean =
				(br.smat.ejb.tipoempregador.TipoEmpregadorBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.tipoempregador.TipoEmpregadorKey _primaryKey =
				bean.ejbCreate(nome, docIdentificador);
			result =
				(br.smat.ejb.tipoempregador.TipoEmpregador) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, docIdentificador);
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
	 * findAllTiposEmpregadores
	 * @generated
	 */
	public java.util.Collection findAllTiposEmpregadores()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TipoEmpregadorBean bean =
				(TipoEmpregadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTiposEmpregadores();
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
	public TipoEmpregadorLocal findByPrimaryKey_Local(
		br.smat.ejb.tipoempregador.TipoEmpregadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TipoEmpregadorLocal _EJS_bmp =
			(TipoEmpregadorLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.tipoempregador.TipoEmpregadorKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TipoEmpregadorBean _EJS_bean =
					(TipoEmpregadorBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.tipoempregador
							.TipoEmpregadorKey) _EJS_bean
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
				(TipoEmpregadorLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.tipoempregador.TipoEmpregadorLocal create_Local(
		java.lang.String nome,
		java.lang.String docIdenticador)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.tipoempregador.TipoEmpregadorLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.tipoempregador.TipoEmpregadorBean bean =
				(br.smat.ejb.tipoempregador.TipoEmpregadorBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.tipoempregador.TipoEmpregadorKey _primaryKey =
				bean.ejbCreate(nome, docIdenticador);
			result =
				(
					br
						.smat
						.ejb
						.tipoempregador
						.TipoEmpregadorLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, docIdenticador);
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
	 * findAllTiposEmpregadores_Local
	 * @generated
	 */
	public java.util.Collection findAllTiposEmpregadores_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TipoEmpregadorBean bean =
				(TipoEmpregadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTiposEmpregadores();
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
