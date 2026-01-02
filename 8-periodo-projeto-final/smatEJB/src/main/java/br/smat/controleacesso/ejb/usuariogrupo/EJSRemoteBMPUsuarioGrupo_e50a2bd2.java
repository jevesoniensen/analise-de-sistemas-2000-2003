package br.smat.controleacesso.ejb.usuariogrupo;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPUsuarioGrupo_e50a2bd2
 * @generated
 */
public class EJSRemoteBMPUsuarioGrupo_e50a2bd2
	extends EJSWrapper
	implements UsuarioGrupo {
	/**
	 * EJSRemoteBMPUsuarioGrupo_e50a2bd2
	 * @generated
	 */
	public EJSRemoteBMPUsuarioGrupo_e50a2bd2()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getGrupo
	 * @generated
	 */
	public br.smat.controleacesso.ejb.grupo.GrupoKey getGrupo()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.controleacesso.ejb.grupo.GrupoKey _EJS_result = null;
		try {
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuariogrupo
						.UsuarioGrupoBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getGrupo();
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
	public br.smat.controleacesso.ejb.usuario.UsuarioKey getUsuario()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.controleacesso.ejb.usuario.UsuarioKey _EJS_result = null;
		try {
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuariogrupo
						.UsuarioGrupoBean) container
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
	 * getGrupoKey
	 * @generated
	 */
	public int getGrupoKey() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuariogrupo
						.UsuarioGrupoBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getGrupoKey();
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
	 * getUsuarioKey
	 * @generated
	 */
	public int getUsuarioKey() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuariogrupo
						.UsuarioGrupoBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getUsuarioKey();
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
	 * getNomeGrupo
	 * @generated
	 */
	public java.lang.String getNomeGrupo() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuariogrupo
						.UsuarioGrupoBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = beanRef.getNomeGrupo();
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
	 * getNomeUsuario
	 * @generated
	 */
	public java.lang.String getNomeUsuario() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuariogrupo
						.UsuarioGrupoBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getNomeUsuario();
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
	 * setGrupo
	 * @generated
	 */
	public void setGrupo(br.smat.controleacesso.ejb.grupo.GrupoKey grupo)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuariogrupo
						.UsuarioGrupoBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setGrupo(grupo);
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
	 * setNomeGrupo
	 * @generated
	 */
	public void setNomeGrupo(java.lang.String nomeGrupo)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuariogrupo
						.UsuarioGrupoBean) container
						.preInvoke(
					this,
					7,
					_EJS_s);
			beanRef.setNomeGrupo(nomeGrupo);
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
	 * setNomeUsuario
	 * @generated
	 */
	public void setNomeUsuario(java.lang.String nomeUsuario)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuariogrupo
						.UsuarioGrupoBean) container
						.preInvoke(
					this,
					8,
					_EJS_s);
			beanRef.setNomeUsuario(nomeUsuario);
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
	 * setUsuario
	 * @generated
	 */
	public void setUsuario(
		br.smat.controleacesso.ejb.usuario.UsuarioKey usuario)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoBean beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuariogrupo
						.UsuarioGrupoBean) container
						.preInvoke(
					this,
					9,
					_EJS_s);
			beanRef.setUsuario(usuario);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 9, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
}
