package br.smat.ejb.telefoneempregador;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPTelefoneEmpregadorHomeBean_48f54b25
 * @generated
 */
public class EJSBMPTelefoneEmpregadorHomeBean_48f54b25 extends EJSHome {
	/**
	 * EJSBMPTelefoneEmpregadorHomeBean_48f54b25
	 * @generated
	 */
	public EJSBMPTelefoneEmpregadorHomeBean_48f54b25()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public TelefoneEmpregador findByPrimaryKey(
		br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TelefoneEmpregador _EJS_bmp =
			(TelefoneEmpregador) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TelefoneEmpregadorBean _EJS_bean =
					(TelefoneEmpregadorBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.telefoneempregador
							.TelefoneEmpregadorKey) _EJS_bean
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
				(TelefoneEmpregador) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.telefoneempregador.TelefoneEmpregador create(
		int empregador,
		java.lang.String descricao,
		java.lang.String numero,
		java.lang.String ddd)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.telefoneempregador.TelefoneEmpregador result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean bean =
				(br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey _primaryKey =
				bean.ejbCreate(empregador, descricao, numero, ddd);
			result =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.TelefoneEmpregador) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(empregador, descricao, numero, ddd);
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
	 * findAllTelefonesEmpregadores
	 * @generated
	 */
	public java.util.Collection findAllTelefonesEmpregadores(int empregador)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TelefoneEmpregadorBean bean =
				(TelefoneEmpregadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllTelefonesEmpregadores(empregador);
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
	public TelefoneEmpregadorLocal findByPrimaryKey_Local(
		br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TelefoneEmpregadorLocal _EJS_bmp =
			(TelefoneEmpregadorLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TelefoneEmpregadorBean _EJS_bean =
					(TelefoneEmpregadorBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.telefoneempregador
							.TelefoneEmpregadorKey) _EJS_bean
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
				(TelefoneEmpregadorLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.telefoneempregador.TelefoneEmpregadorLocal create_Local(
		int empregador,
		java.lang.String descricao,
		java.lang.String numero,
		java.lang.String ddd)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.telefoneempregador.TelefoneEmpregadorLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean bean =
				(br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey _primaryKey =
				bean.ejbCreate(empregador, descricao, numero, ddd);
			result =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.TelefoneEmpregadorLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(empregador, descricao, numero, ddd);
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
	 * findAllTelefonesEmpregadores_Local
	 * @generated
	 */
	public java.util.Collection findAllTelefonesEmpregadores_Local(
		int empregador)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TelefoneEmpregadorBean bean =
				(TelefoneEmpregadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllTelefonesEmpregadores(empregador);
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
