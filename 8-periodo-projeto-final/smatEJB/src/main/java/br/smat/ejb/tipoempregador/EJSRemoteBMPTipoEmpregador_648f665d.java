package br.smat.ejb.tipoempregador;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPTipoEmpregador_648f665d
 * @generated
 */
public class EJSRemoteBMPTipoEmpregador_648f665d
	extends EJSWrapper
	implements TipoEmpregador {
	/**
	 * EJSRemoteBMPTipoEmpregador_648f665d
	 * @generated
	 */
	public EJSRemoteBMPTipoEmpregador_648f665d()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getTipoEmpregador
	 * @generated
	 */
	public int getTipoEmpregador() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.tipoempregador.TipoEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.tipoempregador
						.TipoEmpregadorBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getTipoEmpregador();
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
	 * getDocIdentificador
	 * @generated
	 */
	public java.lang.String getDocIdentificador()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.tipoempregador.TipoEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.tipoempregador
						.TipoEmpregadorBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getDocIdentificador();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.tipoempregador.TipoEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.tipoempregador
						.TipoEmpregadorBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getNome();
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
	 * setDocIdentificador
	 * @generated
	 */
	public void setDocIdentificador(java.lang.String docIdentificador)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.tipoempregador.TipoEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.tipoempregador
						.TipoEmpregadorBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			beanRef.setDocIdentificador(docIdentificador);
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
		return;
	}
	/**
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.tipoempregador.TipoEmpregadorBean beanRef =
				(
					br
						.smat
						.ejb
						.tipoempregador
						.TipoEmpregadorBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			beanRef.setNome(nome);
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
		return;
	}
}
