package br.smat.controleacesso.ejb.usuario;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPUsuarioHomeBean_bdf06b99
 * @generated
 */
public class EJSBMPUsuarioHomeBean_bdf06b99 extends EJSHome {
	/**
	 * EJSBMPUsuarioHomeBean_bdf06b99
	 * @generated
	 */
	public EJSBMPUsuarioHomeBean_bdf06b99() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByNomeSenha
	 * @generated
	 */
	public br.smat.controleacesso.ejb.usuario.Usuario findByNomeSenha(
		java.lang.String nome,
		java.lang.String senha)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		br.smat.controleacesso.ejb.usuario.Usuario result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			UsuarioBean bean = (UsuarioBean) beanO.getEnterpriseBean();
			br.smat.controleacesso.ejb.usuario.UsuarioKey pKey =
				bean.ejbFindByNomeSenha(nome, senha);
			result =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.Usuario) super
						.activateBean(
					(java.lang.Object) pKey);
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
	 * create
	 * @generated
	 */
	public br.smat.controleacesso.ejb.usuario.Usuario create(
		java.lang.String nome,
		java.lang.String senha,
		int agenteSaude)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.controleacesso.ejb.usuario.Usuario result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.controleacesso.ejb.usuario.UsuarioBean bean =
				(br.smat.controleacesso.ejb.usuario.UsuarioBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.controleacesso.ejb.usuario.UsuarioKey _primaryKey =
				bean.ejbCreate(nome, senha, agenteSaude);
			result =
				(br.smat.controleacesso.ejb.usuario.Usuario) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, senha, agenteSaude);
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
	 * findByPrimaryKey
	 * @generated
	 */
	public Usuario findByPrimaryKey(
		br.smat.controleacesso.ejb.usuario.UsuarioKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		Usuario _EJS_bmp = (Usuario) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.controleacesso.ejb.usuario.UsuarioKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				UsuarioBean _EJS_bean =
					(UsuarioBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.controleacesso
							.ejb
							.usuario
							.UsuarioKey) _EJS_bean
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
				(Usuario) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findByNomeSenha_Local
	 * @generated
	 */
	public br
		.smat
		.controleacesso
		.ejb
		.usuario
		.UsuarioLocal findByNomeSenha_Local(
		java.lang.String nome,
		java.lang.String senha)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		br.smat.controleacesso.ejb.usuario.UsuarioLocal result = null;
		EntityBeanO beanO = null;

		br.smat.controleacesso.ejb.usuario.UsuarioKey pKey = null;
		try {
			beanO = super.getFinderEntityBeanO();
			UsuarioBean bean = (UsuarioBean) beanO.getEnterpriseBean();
			pKey = bean.ejbFindByNomeSenha(nome, senha);
			result =
				(br
					.smat
					.controleacesso
					.ejb
					.usuario
					.UsuarioLocal) activateBean_Local(pKey);
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
	public UsuarioLocal findByPrimaryKey_Local(
		br.smat.controleacesso.ejb.usuario.UsuarioKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		UsuarioLocal _EJS_bmp = (UsuarioLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.controleacesso.ejb.usuario.UsuarioKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				UsuarioBean _EJS_bean =
					(UsuarioBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.controleacesso
							.ejb
							.usuario
							.UsuarioKey) _EJS_bean
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
				(UsuarioLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.controleacesso.ejb.usuario.UsuarioLocal create_Local(
		java.lang.String nome,
		java.lang.String senha,
		int agenteSaude)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.controleacesso.ejb.usuario.UsuarioLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.controleacesso.ejb.usuario.UsuarioBean bean =
				(br.smat.controleacesso.ejb.usuario.UsuarioBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.controleacesso.ejb.usuario.UsuarioKey _primaryKey =
				bean.ejbCreate(nome, senha, agenteSaude);
			result =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuario
						.UsuarioLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, senha, agenteSaude);
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
	 * findAll
	 * @generated
	 */
	public java.util.Collection findAll()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			UsuarioBean bean = (UsuarioBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAll();
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
	 * findAll_Local
	 * @generated
	 */
	public java.util.Collection findAll_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			UsuarioBean bean = (UsuarioBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAll();
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
