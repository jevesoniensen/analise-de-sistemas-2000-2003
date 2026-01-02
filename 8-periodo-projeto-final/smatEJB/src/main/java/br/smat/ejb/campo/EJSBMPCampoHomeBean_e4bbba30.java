package br.smat.ejb.campo;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPCampoHomeBean_e4bbba30
 * @generated
 */
public class EJSBMPCampoHomeBean_e4bbba30 extends EJSHome {
	/**
	 * EJSBMPCampoHomeBean_e4bbba30
	 * @generated
	 */
	public EJSBMPCampoHomeBean_e4bbba30() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public Campo findByPrimaryKey(br.smat.ejb.campo.CampoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		Campo _EJS_bmp = (Campo) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.campo.CampoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				CampoBean _EJS_bean =
					(CampoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(br.smat.ejb.campo.CampoKey) _EJS_bean.ejbFindByPrimaryKey(
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
			_EJS_bmp = (Campo) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public CampoLocal findByPrimaryKey_Local(
		br.smat.ejb.campo.CampoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		CampoLocal _EJS_bmp = (CampoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.campo.CampoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				CampoBean _EJS_bean =
					(CampoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(br.smat.ejb.campo.CampoKey) _EJS_bean.ejbFindByPrimaryKey(
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
				(CampoLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllCampos
	 * @generated
	 */
	public java.util.Collection findAllCampos()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			CampoBean bean = (CampoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllCampos();
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
	 * findAllCampos_Local
	 * @generated
	 */
	public java.util.Collection findAllCampos_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			CampoBean bean = (CampoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllCampos();
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
	 * create
	 * @generated
	 */
	public br.smat.ejb.campo.Campo create(
		java.lang.String tabela,
		java.lang.String coluna,
		java.lang.String pai,
		java.lang.String nome,
		java.lang.String label)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.campo.Campo result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.campo.CampoBean bean =
				(br.smat.ejb.campo.CampoBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.campo.CampoKey _primaryKey =
				bean.ejbCreate(tabela, coluna, pai, nome, label);
			result =
				(br.smat.ejb.campo.Campo) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(tabela, coluna, pai, nome, label);
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
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.campo.CampoLocal create_Local(
		java.lang.String tabela,
		java.lang.String coluna,
		java.lang.String pai,
		java.lang.String nome,
		java.lang.String label)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.campo.CampoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.campo.CampoBean bean =
				(br.smat.ejb.campo.CampoBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.campo.CampoKey _primaryKey =
				bean.ejbCreate(tabela, coluna, pai, nome, label);
			result =
				(br.smat.ejb.campo.CampoLocal) super.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(tabela, coluna, pai, nome, label);
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
	 * findAllCampos
	 * @generated
	 */
	public java.util.Collection findAllCampos(int campo1)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			CampoBean bean = (CampoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllCampos(campo1);
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
	 * findAllCampos_Local
	 * @generated
	 */
	public java.util.Collection findAllCampos_Local(int campo1)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			CampoBean bean = (CampoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllCampos(campo1);
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
