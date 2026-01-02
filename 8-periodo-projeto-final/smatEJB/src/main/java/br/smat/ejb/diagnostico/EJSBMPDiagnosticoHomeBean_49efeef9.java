package br.smat.ejb.diagnostico;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPDiagnosticoHomeBean_49efeef9
 * @generated
 */
public class EJSBMPDiagnosticoHomeBean_49efeef9 extends EJSHome {
	/**
	 * EJSBMPDiagnosticoHomeBean_49efeef9
	 * @generated
	 */
	public EJSBMPDiagnosticoHomeBean_49efeef9()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public Diagnostico findByPrimaryKey(
		br.smat.ejb.diagnostico.DiagnosticoKey key)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		Diagnostico _EJS_bmp = (Diagnostico) super.getBean(key);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.diagnostico.DiagnosticoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				DiagnosticoBean _EJS_bean =
					(DiagnosticoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.diagnostico
							.DiagnosticoKey) _EJS_bean
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
				(Diagnostico) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.diagnostico.Diagnostico create(
		java.lang.String nome,
		int cid10)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.diagnostico.Diagnostico result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.diagnostico.DiagnosticoBean bean =
				(br.smat.ejb.diagnostico.DiagnosticoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.diagnostico.DiagnosticoKey _primaryKey =
				bean.ejbCreate(nome, cid10);
			result =
				(br.smat.ejb.diagnostico.Diagnostico) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, cid10);
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
	public DiagnosticoLocal findByPrimaryKey_Local(
		br.smat.ejb.diagnostico.DiagnosticoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		DiagnosticoLocal _EJS_bmp =
			(DiagnosticoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.diagnostico.DiagnosticoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				DiagnosticoBean _EJS_bean =
					(DiagnosticoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.diagnostico
							.DiagnosticoKey) _EJS_bean
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
				(DiagnosticoLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.diagnostico.DiagnosticoLocal create_Local(
		java.lang.String nome,
		int cid10)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.diagnostico.DiagnosticoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.diagnostico.DiagnosticoBean bean =
				(br.smat.ejb.diagnostico.DiagnosticoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.diagnostico.DiagnosticoKey _primaryKey =
				bean.ejbCreate(nome, cid10);
			result =
				(
					br
						.smat
						.ejb
						.diagnostico
						.DiagnosticoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, cid10);
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
	 * findAllDiagnosticos
	 * @generated
	 */
	public java.util.Collection findAllDiagnosticos()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			DiagnosticoBean bean = (DiagnosticoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllDiagnosticos();
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
	 * findAllDiagnosticos_Local
	 * @generated
	 */
	public java.util.Collection findAllDiagnosticos_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			DiagnosticoBean bean = (DiagnosticoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllDiagnosticos();
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
