package br.smat.ejb.empregador;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPEmpregadorHomeBean_58b48954
 * @generated
 */
public class EJSBMPEmpregadorHomeBean_58b48954 extends EJSHome {
	/**
	 * EJSBMPEmpregadorHomeBean_58b48954
	 * @generated
	 */
	public EJSBMPEmpregadorHomeBean_58b48954()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.empregador.Empregador create(
		int ramoAtividade,
		int municipio,
		int tipoEmpregador,
		java.lang.String razaoSocial,
		java.lang.String documento,
		int numero,
		java.lang.String rua,
		java.lang.String bairro,
		java.lang.String cep,
		java.lang.String complemento)
		throws
			javax.ejb.CreateException,
			java.rmi.RemoteException,
			java.sql.SQLException {
		BeanO beanO = null;
		br.smat.ejb.empregador.Empregador result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.empregador.EmpregadorBean bean =
				(br.smat.ejb.empregador.EmpregadorBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.empregador.EmpregadorKey _primaryKey =
				bean.ejbCreate(
					ramoAtividade,
					municipio,
					tipoEmpregador,
					razaoSocial,
					documento,
					numero,
					rua,
					bairro,
					cep,
					complemento);
			result =
				(br.smat.ejb.empregador.Empregador) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				ramoAtividade,
				municipio,
				tipoEmpregador,
				razaoSocial,
				documento,
				numero,
				rua,
				bairro,
				cep,
				complemento);
			super.afterPostCreate(beanO, _primaryKey);
		} catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			createFailed = true;
			throw ex;
		} catch (java.sql.SQLException ex) {
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
	 * findByPrimaryKey
	 * @generated
	 */
	public Empregador findByPrimaryKey(
		br.smat.ejb.empregador.EmpregadorKey primaryKey)
		throws
			javax.ejb.FinderException,
			java.rmi.RemoteException,
			java.sql.SQLException,
			java.lang.Exception {
		Empregador _EJS_bmp = (Empregador) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.empregador.EmpregadorKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				EmpregadorBean _EJS_bean =
					(EmpregadorBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.empregador
							.EmpregadorKey) _EJS_bean
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
				(Empregador) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllEmpregadores
	 * @generated
	 */
	public java.util.Collection findAllEmpregadores()
		throws
			javax.ejb.FinderException,
			java.rmi.RemoteException,
			java.lang.Exception {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			EmpregadorBean bean = (EmpregadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllEmpregadores();
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
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.empregador.EmpregadorLocal create_Local(
		int ramoAtividade,
		int municipio,
		int tipoEmpregador,
		java.lang.String razaoSocial,
		java.lang.String documento,
		int numero,
		java.lang.String rua,
		java.lang.String bairro,
		java.lang.String cep,
		java.lang.String complemento)
		throws
			javax.ejb.CreateException,
			java.sql.SQLException,
			java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.empregador.EmpregadorLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.empregador.EmpregadorBean bean =
				(br.smat.ejb.empregador.EmpregadorBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.empregador.EmpregadorKey _primaryKey =
				bean.ejbCreate(
					ramoAtividade,
					municipio,
					tipoEmpregador,
					razaoSocial,
					documento,
					numero,
					rua,
					bairro,
					cep,
					complemento);
			result =
				(
					br
						.smat
						.ejb
						.empregador
						.EmpregadorLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				ramoAtividade,
				municipio,
				tipoEmpregador,
				razaoSocial,
				documento,
				numero,
				rua,
				bairro,
				cep,
				complemento);
			super.afterPostCreate(beanO, _primaryKey);
		} catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.sql.SQLException ex) {
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
	public EmpregadorLocal findByPrimaryKey_Local(
		br.smat.ejb.empregador.EmpregadorKey primaryKey)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EmpregadorLocal _EJS_bmp =
			(EmpregadorLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.empregador.EmpregadorKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				EmpregadorBean _EJS_bean =
					(EmpregadorBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.empregador
							.EmpregadorKey) _EJS_bean
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
				(EmpregadorLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllEmpregadores_Local
	 * @generated
	 */
	public java.util.Collection findAllEmpregadores_Local()
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			EmpregadorBean bean = (EmpregadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllEmpregadores();
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
