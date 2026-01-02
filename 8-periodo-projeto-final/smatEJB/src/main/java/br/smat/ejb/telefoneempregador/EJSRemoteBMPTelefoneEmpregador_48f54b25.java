package br.smat.ejb.telefoneempregador;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPTelefoneEmpregador_48f54b25
 * @generated
 */
public class EJSRemoteBMPTelefoneEmpregador_48f54b25
	extends EJSWrapper
	implements TelefoneEmpregador {
	/**
	 * EJSRemoteBMPTelefoneEmpregador_48f54b25
	 * @generated
	 */
	public EJSRemoteBMPTelefoneEmpregador_48f54b25()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getEmpregador
	 * @generated
	 */
	public br.smat.ejb.empregador.EmpregadorKey getEmpregador()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.empregador.EmpregadorKey _EJS_result = null;
		try {
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.TelefoneEmpregadorBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getEmpregador();
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
	 * getTelefoneEmpregador
	 * @generated
	 */
	public int getTelefoneEmpregador() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.TelefoneEmpregadorBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getTelefoneEmpregador();
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
	 * getDdd
	 * @generated
	 */
	public java.lang.String getDdd() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.TelefoneEmpregadorBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getDdd();
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
	 * getDescricao
	 * @generated
	 */
	public java.lang.String getDescricao() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.TelefoneEmpregadorBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = beanRef.getDescricao();
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
	 * getNumero
	 * @generated
	 */
	public java.lang.String getNumero() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.TelefoneEmpregadorBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getNumero();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 5, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setDdd
	 * @generated
	 */
	public void setDdd(java.lang.String ddd) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.TelefoneEmpregadorBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setDdd(ddd);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
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
	/**
	 * setDescricao
	 * @generated
	 */
	public void setDescricao(java.lang.String descricao)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.TelefoneEmpregadorBean) container
						.preInvoke(
					this,
					7,
					_EJS_s);
			beanRef.setDescricao(descricao);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 7, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setNumero
	 * @generated
	 */
	public void setNumero(java.lang.String numero)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.TelefoneEmpregadorBean) container
						.preInvoke(
					this,
					8,
					_EJS_s);
			beanRef.setNumero(numero);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 8, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * getKeyEmpregador
	 * @generated
	 */
	public int getKeyEmpregador() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneempregador
						.TelefoneEmpregadorBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getKeyEmpregador();
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
}
