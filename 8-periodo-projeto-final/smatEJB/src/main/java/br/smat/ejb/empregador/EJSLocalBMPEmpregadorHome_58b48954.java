package br.smat.ejb.empregador;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPEmpregadorHome_58b48954
 * @generated
 */
public class EJSLocalBMPEmpregadorHome_58b48954
	extends EJSLocalWrapper
	implements br.smat.ejb.empregador.EmpregadorLocalHome {
	/**
	 * EJSLocalBMPEmpregadorHome_58b48954
	 * @generated
	 */
	public EJSLocalBMPEmpregadorHome_58b48954() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.empregador.EmpregadorLocal create(
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
		throws javax.ejb.CreateException, java.sql.SQLException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.empregador.EmpregadorLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.empregador
				.EJSBMPEmpregadorHomeBean_58b48954 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.empregador
						.EJSBMPEmpregadorHomeBean_58b48954) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create_Local(
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
		} catch (javax.ejb.CreateException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.sql.SQLException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.empregador.EmpregadorLocal findByPrimaryKey(
		br.smat.ejb.empregador.EmpregadorKey primaryKey)
		throws javax.ejb.FinderException, java.lang.Exception {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.empregador.EmpregadorLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.empregador
				.EJSBMPEmpregadorHomeBean_58b48954 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.empregador
						.EJSBMPEmpregadorHomeBean_58b48954) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findByPrimaryKey_Local(primaryKey);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 1, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findAllEmpregadores
	 * @generated
	 */
	public java.util.Collection findAllEmpregadores()
		throws javax.ejb.FinderException, java.lang.Exception {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.empregador
				.EJSBMPEmpregadorHomeBean_58b48954 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.empregador
						.EJSBMPEmpregadorHomeBean_58b48954) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllEmpregadores_Local();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 2, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(java.lang.Object arg0)
		throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.empregador
				.EJSBMPEmpregadorHomeBean_58b48954 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.empregador
						.EJSBMPEmpregadorHomeBean_58b48954) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_beanRef.remove(arg0);
		} catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (javax.ejb.EJBException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 3, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
}
