package br.smat.ejb.tipomedidacorretiva;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPTipoMedidaCorretivaHomeBean_77914a2a
 * @generated
 */
public class EJSBMPTipoMedidaCorretivaHomeBean_77914a2a extends EJSHome {
	/**
	 * EJSBMPTipoMedidaCorretivaHomeBean_77914a2a
	 * @generated
	 */
	public EJSBMPTipoMedidaCorretivaHomeBean_77914a2a()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findAllTipoMedidaCorretiva
	 * @generated
	 */
	public java.util.Collection findAllTipoMedidaCorretiva()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TipoMedidaCorretivaBean bean =
				(TipoMedidaCorretivaBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTipoMedidaCorretiva();
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
	public br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretiva create(
		java.lang.String nome,
		java.lang.String descricao)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretiva result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaBean bean =
				(br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey _primaryKey =
				bean.ejbCreate(nome, descricao);
			result =
				(
					br
						.smat
						.ejb
						.tipomedidacorretiva
						.TipoMedidaCorretiva) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, descricao);
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
	public TipoMedidaCorretiva findByPrimaryKey(
		br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey key)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TipoMedidaCorretiva _EJS_bmp = (TipoMedidaCorretiva) super.getBean(key);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TipoMedidaCorretivaBean _EJS_bean =
					(TipoMedidaCorretivaBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.tipomedidacorretiva
							.TipoMedidaCorretivaKey) _EJS_bean
							.ejbFindByPrimaryKey(
						key);
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
				(TipoMedidaCorretiva) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllTipoMedidaCorretiva_Local
	 * @generated
	 */
	public java.util.Collection findAllTipoMedidaCorretiva_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TipoMedidaCorretivaBean bean =
				(TipoMedidaCorretivaBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTipoMedidaCorretiva();
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
		.ejb
		.tipomedidacorretiva
		.TipoMedidaCorretivaLocal create_Local(
		java.lang.String nome,
		java.lang.String descricao)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaBean bean =
				(br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey _primaryKey =
				bean.ejbCreate(nome, descricao);
			result =
				(
					br
						.smat
						.ejb
						.tipomedidacorretiva
						.TipoMedidaCorretivaLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, descricao);
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
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public TipoMedidaCorretivaLocal findByPrimaryKey_Local(
		br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TipoMedidaCorretivaLocal _EJS_bmp =
			(TipoMedidaCorretivaLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey _EJS_key =
				null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TipoMedidaCorretivaBean _EJS_bean =
					(TipoMedidaCorretivaBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.tipomedidacorretiva
							.TipoMedidaCorretivaKey) _EJS_bean
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
				(TipoMedidaCorretivaLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
}
