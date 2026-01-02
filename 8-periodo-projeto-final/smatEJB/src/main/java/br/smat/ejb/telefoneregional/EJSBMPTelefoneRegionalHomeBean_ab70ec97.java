package br.smat.ejb.telefoneregional;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPTelefoneRegionalHomeBean_ab70ec97
 * @generated
 */
public class EJSBMPTelefoneRegionalHomeBean_ab70ec97 extends EJSHome {
	/**
	 * EJSBMPTelefoneRegionalHomeBean_ab70ec97
	 * @generated
	 */
	public EJSBMPTelefoneRegionalHomeBean_ab70ec97()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.telefoneregional.TelefoneRegional create(
		int regional,
		java.lang.String descricao,
		java.lang.String numero,
		java.lang.String ddd)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.telefoneregional.TelefoneRegional result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.telefoneregional.TelefoneRegionalBean bean =
				(br.smat.ejb.telefoneregional.TelefoneRegionalBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.telefoneregional.TelefoneRegionalKey _primaryKey =
				bean.ejbCreate(regional, descricao, numero, ddd);
			result =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegional) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(regional, descricao, numero, ddd);
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
	public TelefoneRegional findByPrimaryKey(
		br.smat.ejb.telefoneregional.TelefoneRegionalKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TelefoneRegional _EJS_bmp =
			(TelefoneRegional) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.telefoneregional.TelefoneRegionalKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TelefoneRegionalBean _EJS_bean =
					(TelefoneRegionalBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.telefoneregional
							.TelefoneRegionalKey) _EJS_bean
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
				(TelefoneRegional) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllTelefonesRegionais
	 * @generated
	 */
	public java.util.Collection findAllTelefonesRegionais(int regional)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TelefoneRegionalBean bean =
				(TelefoneRegionalBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllTelefonesRegionais(regional);
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
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.telefoneregional.TelefoneRegionalLocal create_Local(
		int regional,
		java.lang.String descricao,
		java.lang.String numero,
		java.lang.String ddd)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.telefoneregional.TelefoneRegionalLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.telefoneregional.TelefoneRegionalBean bean =
				(br.smat.ejb.telefoneregional.TelefoneRegionalBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.telefoneregional.TelefoneRegionalKey _primaryKey =
				bean.ejbCreate(regional, descricao, numero, ddd);
			result =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegionalLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(regional, descricao, numero, ddd);
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
	public TelefoneRegionalLocal findByPrimaryKey_Local(
		br.smat.ejb.telefoneregional.TelefoneRegionalKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TelefoneRegionalLocal _EJS_bmp =
			(TelefoneRegionalLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.telefoneregional.TelefoneRegionalKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TelefoneRegionalBean _EJS_bean =
					(TelefoneRegionalBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.telefoneregional
							.TelefoneRegionalKey) _EJS_bean
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
				(TelefoneRegionalLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllTelefonesRegionais_Local
	 * @generated
	 */
	public java.util.Collection findAllTelefonesRegionais_Local(int regional)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TelefoneRegionalBean bean =
				(TelefoneRegionalBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllTelefonesRegionais(regional);
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
