package br.smat.ejb.roteiros;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPRoteirosHomeBean_f05933e0
 * @generated
 */
public class EJSBMPRoteirosHomeBean_f05933e0 extends EJSHome {
	/**
	 * EJSBMPRoteirosHomeBean_f05933e0
	 * @generated
	 */
	public EJSBMPRoteirosHomeBean_f05933e0() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public Roteiros findByPrimaryKey(
		br.smat.ejb.roteiros.RoteirosKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		Roteiros _EJS_bmp = (Roteiros) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.roteiros.RoteirosKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				RoteirosBean _EJS_bean =
					(RoteirosBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.roteiros
							.RoteirosKey) _EJS_bean
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
				(Roteiros) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllRoteiros
	 * @generated
	 */
	public java.util.Collection findAllRoteiros(
		int tramiteFiscalizacao,
		int fiscalizacao)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RoteirosBean bean = (RoteirosBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllRoteiros(tramiteFiscalizacao, fiscalizacao);
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
	public RoteirosLocal findByPrimaryKey_Local(
		br.smat.ejb.roteiros.RoteirosKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		RoteirosLocal _EJS_bmp =
			(RoteirosLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.roteiros.RoteirosKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				RoteirosBean _EJS_bean =
					(RoteirosBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.roteiros
							.RoteirosKey) _EJS_bean
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
				(RoteirosLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllRoteiros_Local
	 * @generated
	 */
	public java.util.Collection findAllRoteiros_Local(
		int tramiteFiscalizacao,
		int fiscalizacao)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RoteirosBean bean = (RoteirosBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllRoteiros(tramiteFiscalizacao, fiscalizacao);
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
	public br.smat.ejb.roteiros.Roteiros create(
		int tramiteFiscalizacao,
		int fiscalizacao,
		int itemFiscalizacao,
		int grauConformidade,
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.roteiros.Roteiros result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.roteiros.RoteirosBean bean =
				(br.smat.ejb.roteiros.RoteirosBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.roteiros.RoteirosKey _primaryKey =
				bean.ejbCreate(
					tramiteFiscalizacao,
					fiscalizacao,
					itemFiscalizacao,
					grauConformidade,
					nome);
			result =
				(br.smat.ejb.roteiros.Roteiros) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				tramiteFiscalizacao,
				fiscalizacao,
				itemFiscalizacao,
				grauConformidade,
				nome);
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
	public br.smat.ejb.roteiros.RoteirosLocal create_Local(
		int tramiteFiscalizacao,
		int fiscalizacao,
		int itemFiscalizacao,
		int grauConformidade,
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.roteiros.RoteirosLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.roteiros.RoteirosBean bean =
				(br.smat.ejb.roteiros.RoteirosBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.roteiros.RoteirosKey _primaryKey =
				bean.ejbCreate(
					tramiteFiscalizacao,
					fiscalizacao,
					itemFiscalizacao,
					grauConformidade,
					nome);
			result =
				(br.smat.ejb.roteiros.RoteirosLocal) super.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				tramiteFiscalizacao,
				fiscalizacao,
				itemFiscalizacao,
				grauConformidade,
				nome);
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
	 * findAllItemLastTramite
	 * @generated
	 */
	public java.util.Collection findAllItemLastTramite(int fiscalizacao)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RoteirosBean bean = (RoteirosBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllItemLastTramite(fiscalizacao);
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
	 * findAllItemLastTramite_Local
	 * @generated
	 */
	public java.util.Collection findAllItemLastTramite_Local(int fiscalizacao)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			RoteirosBean bean = (RoteirosBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllItemLastTramite(fiscalizacao);
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
