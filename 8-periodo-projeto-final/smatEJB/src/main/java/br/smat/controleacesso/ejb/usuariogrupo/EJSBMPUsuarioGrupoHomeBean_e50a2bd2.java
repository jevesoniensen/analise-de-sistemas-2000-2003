package br.smat.controleacesso.ejb.usuariogrupo;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPUsuarioGrupoHomeBean_e50a2bd2
 * @generated
 */
public class EJSBMPUsuarioGrupoHomeBean_e50a2bd2 extends EJSHome {
	/**
	 * EJSBMPUsuarioGrupoHomeBean_e50a2bd2
	 * @generated
	 */
	public EJSBMPUsuarioGrupoHomeBean_e50a2bd2()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findAllByGrupo
	 * @generated
	 */
	public java.util.Collection findAllByGrupo(int grupo)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			UsuarioGrupoBean bean =
				(UsuarioGrupoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllByGrupo(grupo);
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
	 * create
	 * @generated
	 */
	public br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupo create(
		int grupo,
		int usuario)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupo result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoBean bean =
				(br
					.smat
					.controleacesso
					.ejb
					.usuariogrupo
					.UsuarioGrupoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoKey _primaryKey =
				bean.ejbCreate(grupo, usuario);
			result =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuariogrupo
						.UsuarioGrupo) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(grupo, usuario);
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
			UsuarioGrupoBean bean =
				(UsuarioGrupoBean) beanO.getEnterpriseBean();
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
	 * findByPrimaryKey
	 * @generated
	 */
	public UsuarioGrupo findByPrimaryKey(
		br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		UsuarioGrupo _EJS_bmp = (UsuarioGrupo) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				UsuarioGrupoBean _EJS_bean =
					(UsuarioGrupoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.controleacesso
							.ejb
							.usuariogrupo
							.UsuarioGrupoKey) _EJS_bean
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
				(UsuarioGrupo) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllByUsuario
	 * @generated
	 */
	public java.util.Collection findAllByUsuario(int usuario)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			UsuarioGrupoBean bean =
				(UsuarioGrupoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllByUsuario(usuario);
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
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public UsuarioGrupoLocal findByPrimaryKey_Local(
		br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		UsuarioGrupoLocal _EJS_bmp =
			(UsuarioGrupoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				UsuarioGrupoBean _EJS_bean =
					(UsuarioGrupoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.controleacesso
							.ejb
							.usuariogrupo
							.UsuarioGrupoKey) _EJS_bean
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
				(UsuarioGrupoLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllByGrupo_Local
	 * @generated
	 */
	public java.util.Collection findAllByGrupo_Local(int grupo)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			UsuarioGrupoBean bean =
				(UsuarioGrupoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllByGrupo(grupo);
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
			UsuarioGrupoBean bean =
				(UsuarioGrupoBean) beanO.getEnterpriseBean();
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
	/**
	 * create_Local
	 * @generated
	 */
	public br
		.smat
		.controleacesso
		.ejb
		.usuariogrupo
		.UsuarioGrupoLocal create_Local(
		int grupo,
		int usuario)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoBean bean =
				(br
					.smat
					.controleacesso
					.ejb
					.usuariogrupo
					.UsuarioGrupoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoKey _primaryKey =
				bean.ejbCreate(grupo, usuario);
			result =
				(
					br
						.smat
						.controleacesso
						.ejb
						.usuariogrupo
						.UsuarioGrupoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(grupo, usuario);
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
	 * findAllByUsuario_Local
	 * @generated
	 */
	public java.util.Collection findAllByUsuario_Local(int usuario)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			UsuarioGrupoBean bean =
				(UsuarioGrupoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllByUsuario(usuario);
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
