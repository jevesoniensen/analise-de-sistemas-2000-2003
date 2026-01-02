package br.smat.ejb.telefoneempregador;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPTelefoneEmpregadorHome_48f54b25
 * @generated
 */
public class EJSRemoteBMPTelefoneEmpregadorHome_48f54b25
	extends EJSWrapper
	implements br.smat.ejb.telefoneempregador.TelefoneEmpregadorHome {
	/**
	 * EJSRemoteBMPTelefoneEmpregadorHome_48f54b25
	 * @generated
	 */
	public EJSRemoteBMPTelefoneEmpregadorHome_48f54b25()
		throws java.rmi.RemoteException {
		super();
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
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.telefoneempregador.TelefoneEmpregador _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.telefoneempregador
				.EJSBMPTelefoneEmpregadorHomeBean_48f54b25 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.EJSBMPTelefoneEmpregadorHomeBean_48f54b25) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create(empregador, descricao, numero, ddd);
		} catch (javax.ejb.CreateException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
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
	public br.smat.ejb.telefoneempregador.TelefoneEmpregador findByPrimaryKey(
		br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.telefoneempregador.TelefoneEmpregador _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.telefoneempregador
				.EJSBMPTelefoneEmpregadorHomeBean_48f54b25 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.EJSBMPTelefoneEmpregadorHomeBean_48f54b25) container
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
	 * findAllTelefonesEmpregadores
	 * @generated
	 */
	public java.util.Collection findAllTelefonesEmpregadores(int empregador)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.telefoneempregador
				.EJSBMPTelefoneEmpregadorHomeBean_48f54b25 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.EJSBMPTelefoneEmpregadorHomeBean_48f54b25) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllTelefonesEmpregadores(empregador);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
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
				.telefoneempregador
				.EJSBMPTelefoneEmpregadorHomeBean_48f54b25 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.EJSBMPTelefoneEmpregadorHomeBean_48f54b25) container
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
				.telefoneempregador
				.EJSBMPTelefoneEmpregadorHomeBean_48f54b25 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.EJSBMPTelefoneEmpregadorHomeBean_48f54b25) container
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
				.telefoneempregador
				.EJSBMPTelefoneEmpregadorHomeBean_48f54b25 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.EJSBMPTelefoneEmpregadorHomeBean_48f54b25) container
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
				.telefoneempregador
				.EJSBMPTelefoneEmpregadorHomeBean_48f54b25 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.EJSBMPTelefoneEmpregadorHomeBean_48f54b25) container
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
