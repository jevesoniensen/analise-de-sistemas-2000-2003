package br.smat.ejb.empregador;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPEmpregadorHome_58b48954
 * @generated
 */
public class EJSRemoteBMPEmpregadorHome_58b48954
	extends EJSWrapper
	implements br.smat.ejb.empregador.EmpregadorHome {
	/**
	 * EJSRemoteBMPEmpregadorHome_58b48954
	 * @generated
	 */
	public EJSRemoteBMPEmpregadorHome_58b48954()
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
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.empregador.Empregador _EJS_result = null;
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
				_EJS_beanRef.create(
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
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.sql.SQLException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 0, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.empregador.Empregador findByPrimaryKey(
		br.smat.ejb.empregador.EmpregadorKey primaryKey)
		throws
			javax.ejb.FinderException,
			java.rmi.RemoteException,
			java.sql.SQLException,
			java.lang.Exception {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.empregador.Empregador _EJS_result = null;
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
			_EJS_result = _EJS_beanRef.findByPrimaryKey(primaryKey);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.sql.SQLException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 1, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
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
			_EJS_result = _EJS_beanRef.findAllEmpregadores();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 2, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getEJBMetaData
	 * @generated
	 */
	public javax.ejb.EJBMetaData getEJBMetaData()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		javax.ejb.EJBMetaData _EJS_result = null;
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
			_EJS_result = _EJS_beanRef.getEJBMetaData();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 3, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getHomeHandle
	 * @generated
	 */
	public javax.ejb.HomeHandle getHomeHandle()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		javax.ejb.HomeHandle _EJS_result = null;
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
					4,
					_EJS_s);
			_EJS_result = _EJS_beanRef.getHomeHandle();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 4, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(java.lang.Object arg0)
		throws java.rmi.RemoteException, javax.ejb.RemoveException {
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
					5,
					_EJS_s);
			_EJS_beanRef.remove(arg0);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 5, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(javax.ejb.Handle arg0)
		throws java.rmi.RemoteException, javax.ejb.RemoveException {
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
					6,
					_EJS_s);
			_EJS_beanRef.remove(arg0);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 6, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
}
