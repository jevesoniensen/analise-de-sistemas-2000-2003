package br.smat.ejb.municipio;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPMunicipioHomeBean_a94a9642
 * @generated
 */
public class EJSBMPMunicipioHomeBean_a94a9642 extends EJSHome {
	/**
	 * EJSBMPMunicipioHomeBean_a94a9642
	 * @generated
	 */
	public EJSBMPMunicipioHomeBean_a94a9642() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public Municipio findByPrimaryKey(
		br.smat.ejb.municipio.MunicipioKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		Municipio _EJS_bmp = (Municipio) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.municipio.MunicipioKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				MunicipioBean _EJS_bean =
					(MunicipioBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.municipio
							.MunicipioKey) _EJS_bean
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
				(Municipio) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findByPrimaryKey_Local
	 * @generated
	 */
	public MunicipioLocal findByPrimaryKey_Local(
		br.smat.ejb.municipio.MunicipioKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		MunicipioLocal _EJS_bmp =
			(MunicipioLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.municipio.MunicipioKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				MunicipioBean _EJS_bean =
					(MunicipioBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.municipio
							.MunicipioKey) _EJS_bean
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
				(MunicipioLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllMunicipios
	 * @generated
	 */
	public java.util.Collection findAllMunicipios()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			MunicipioBean bean = (MunicipioBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllMunicipios();
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
	 * findAllMunicipios_Local
	 * @generated
	 */
	public java.util.Collection findAllMunicipios_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			MunicipioBean bean = (MunicipioBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllMunicipios();
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
	public br.smat.ejb.municipio.Municipio create(
		int regional,
		java.lang.String nome,
		java.lang.String sigla,
		int populacao)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.municipio.Municipio result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.municipio.MunicipioBean bean =
				(br.smat.ejb.municipio.MunicipioBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.municipio.MunicipioKey _primaryKey =
				bean.ejbCreate(regional, nome, sigla, populacao);
			result =
				(br.smat.ejb.municipio.Municipio) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(regional, nome, sigla, populacao);
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
	public br.smat.ejb.municipio.MunicipioLocal create_Local(
		int regional,
		java.lang.String nome,
		java.lang.String sigla,
		int populacao)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.municipio.MunicipioLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.municipio.MunicipioBean bean =
				(br.smat.ejb.municipio.MunicipioBean) beanO.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.municipio.MunicipioKey _primaryKey =
				bean.ejbCreate(regional, nome, sigla, populacao);
			result =
				(br.smat.ejb.municipio.MunicipioLocal) super.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(regional, nome, sigla, populacao);
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
	 * findAllMunicipios
	 * @generated
	 */
	public java.util.Collection findAllMunicipios(int estado)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			MunicipioBean bean = (MunicipioBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllMunicipios(estado);
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
	 * findAllMunicipios_Local
	 * @generated
	 */
	public java.util.Collection findAllMunicipios_Local(int estado)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			MunicipioBean bean = (MunicipioBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllMunicipios(estado);
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
	 * findAllMunicipiosByRegional
	 * @generated
	 */
	public java.util.Collection findAllMunicipiosByRegional(int regional)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			MunicipioBean bean = (MunicipioBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllMunicipiosByRegional(regional);
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
	 * findAllMunicipiosByRegional_Local
	 * @generated
	 */
	public java.util.Collection findAllMunicipiosByRegional_Local(int regional)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			MunicipioBean bean = (MunicipioBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllMunicipiosByRegional(regional);
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
