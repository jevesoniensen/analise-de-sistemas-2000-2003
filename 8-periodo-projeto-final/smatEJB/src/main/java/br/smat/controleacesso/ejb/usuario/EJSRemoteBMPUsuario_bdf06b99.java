package br.smat.controleacesso.ejb.usuario;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPUsuario_bdf06b99
 * @generated
 */
public class EJSRemoteBMPUsuario_bdf06b99
	extends EJSWrapper
	implements Usuario {
	/**
	 * EJSRemoteBMPUsuario_bdf06b99
	 * @generated
	 */
	public EJSRemoteBMPUsuario_bdf06b99() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getAgenteSaude
	 * @generated
	 */
	public br.smat.ejb.agentesaude.AgenteSaudeKey getAgenteSaude()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.agentesaude.AgenteSaudeKey _EJS_result = null;
		try {
			br.smat.controleacesso.ejb.usuario.UsuarioBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.UsuarioBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getAgenteSaude();
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
	 * getUsuario
	 * @generated
	 */
	public int getUsuario() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.controleacesso.ejb.usuario.UsuarioBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.UsuarioBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getUsuario();
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
			br.smat.controleacesso.ejb.usuario.UsuarioBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.UsuarioBean) container
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
	 * getSenha
	 * @generated
	 */
	public java.lang.String getSenha() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.controleacesso.ejb.usuario.UsuarioBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.UsuarioBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getSenha();
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
	 * setAgenteSaude
	 * @generated
	 */
	public void setAgenteSaude(
		br.smat.ejb.agentesaude.AgenteSaudeKey agenteSaude)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.controleacesso.ejb.usuario.UsuarioBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.UsuarioBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			beanRef.setAgenteSaude(agenteSaude);
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
	/**
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.controleacesso.ejb.usuario.UsuarioBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.UsuarioBean) container
						.preInvoke(
					this,
					5,
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
			container.postInvoke(this, 5, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setSenha
	 * @generated
	 */
	public void setSenha(java.lang.String senha)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.controleacesso.ejb.usuario.UsuarioBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.UsuarioBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setSenha(senha);
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
}
