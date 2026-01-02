package br.smat.controleacesso.ejb.usuario;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPUsuarioHome_bdf06b99
 * @generated
 */
public class EJSLocalBMPUsuarioHome_bdf06b99
	extends EJSLocalWrapper
	implements br.smat.controleacesso.ejb.usuario.UsuarioLocalHome {
	/**
	 * EJSLocalBMPUsuarioHome_bdf06b99
	 * @generated
	 */
	public EJSLocalBMPUsuarioHome_bdf06b99() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.controleacesso.ejb.usuario.UsuarioLocal create(
		java.lang.String nome,
		java.lang.String senha,
		int agenteSaude)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.controleacesso.ejb.usuario.UsuarioLocal _EJS_result = null;
		try {
			br
				.smat
				.controleacesso
				.ejb
				.usuario
				.EJSBMPUsuarioHomeBean_bdf06b99 _EJS_beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.EJSBMPUsuarioHomeBean_bdf06b99) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(nome, senha, agenteSaude);
		} catch (javax.ejb.CreateException ex) {
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
	 * findByNomeSenha
	 * @generated
	 */
	public br.smat.controleacesso.ejb.usuario.UsuarioLocal findByNomeSenha(
		java.lang.String nome,
		java.lang.String senha)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.controleacesso.ejb.usuario.UsuarioLocal _EJS_result = null;
		try {
			br
				.smat
				.controleacesso
				.ejb
				.usuario
				.EJSBMPUsuarioHomeBean_bdf06b99 _EJS_beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.EJSBMPUsuarioHomeBean_bdf06b99) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findByNomeSenha_Local(nome, senha);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
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
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.controleacesso.ejb.usuario.UsuarioLocal findByPrimaryKey(
		br.smat.controleacesso.ejb.usuario.UsuarioKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.controleacesso.ejb.usuario.UsuarioLocal _EJS_result = null;
		try {
			br
				.smat
				.controleacesso
				.ejb
				.usuario
				.EJSBMPUsuarioHomeBean_bdf06b99 _EJS_beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.EJSBMPUsuarioHomeBean_bdf06b99) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findByPrimaryKey_Local(primaryKey);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
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
				.controleacesso
				.ejb
				.usuario
				.EJSBMPUsuarioHomeBean_bdf06b99 _EJS_beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.EJSBMPUsuarioHomeBean_bdf06b99) container
						.preInvoke(
					this,
					4,
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
				container.postInvoke(this, 4, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * findAll
	 * @generated
	 */
	public java.util.Collection findAll() throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.controleacesso
				.ejb
				.usuario
				.EJSBMPUsuarioHomeBean_bdf06b99 _EJS_beanRef =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.EJSBMPUsuarioHomeBean_bdf06b99) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAll_Local();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
		return _EJS_result;
	}
}
