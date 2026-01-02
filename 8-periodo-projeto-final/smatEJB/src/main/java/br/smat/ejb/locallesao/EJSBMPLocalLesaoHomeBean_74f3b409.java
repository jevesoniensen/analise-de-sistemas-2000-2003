package br.smat.ejb.locallesao;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPLocalLesaoHomeBean_74f3b409
 * @generated
 */
public class EJSBMPLocalLesaoHomeBean_74f3b409 extends EJSHome {
	/**
	 * EJSBMPLocalLesaoHomeBean_74f3b409
	 * @generated
	 */
	public EJSBMPLocalLesaoHomeBean_74f3b409()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public LocalLesao findByPrimaryKey(
		br.smat.ejb.locallesao.LocalLesaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		LocalLesao _EJS_bmp = (LocalLesao) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.locallesao.LocalLesaoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				LocalLesaoBean _EJS_bean =
					(LocalLesaoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.locallesao
							.LocalLesaoKey) _EJS_bean
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
				(LocalLesao) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllLocaisLesao
	 * @generated
	 */
	public java.util.Collection findAllLocaisLesao()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			LocalLesaoBean bean = (LocalLesaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllLocaisLesao();
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
	public br.smat.ejb.locallesao.LocalLesao create(
		java.lang.String nome,
		int localLesaoPai)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.locallesao.LocalLesao result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.locallesao.LocalLesaoBean bean =
				(br.smat.ejb.locallesao.LocalLesaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.locallesao.LocalLesaoKey _primaryKey =
				bean.ejbCreate(nome, localLesaoPai);
			result =
				(br.smat.ejb.locallesao.LocalLesao) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, localLesaoPai);
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
	public LocalLesaoLocal findByPrimaryKey_Local(
		br.smat.ejb.locallesao.LocalLesaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		LocalLesaoLocal _EJS_bmp =
			(LocalLesaoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.locallesao.LocalLesaoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				LocalLesaoBean _EJS_bean =
					(LocalLesaoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.locallesao
							.LocalLesaoKey) _EJS_bean
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
				(LocalLesaoLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllLocaisLesao_Local
	 * @generated
	 */
	public java.util.Collection findAllLocaisLesao_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			LocalLesaoBean bean = (LocalLesaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllLocaisLesao();
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
	public br.smat.ejb.locallesao.LocalLesaoLocal create_Local(
		java.lang.String nome,
		int localLesaoPai)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.locallesao.LocalLesaoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.locallesao.LocalLesaoBean bean =
				(br.smat.ejb.locallesao.LocalLesaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.locallesao.LocalLesaoKey _primaryKey =
				bean.ejbCreate(nome, localLesaoPai);
			result =
				(
					br
						.smat
						.ejb
						.locallesao
						.LocalLesaoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, localLesaoPai);
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
	 * findAllLocaisLesao
	 * @generated
	 */
	public java.util.Collection findAllLocaisLesao(int pai)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			LocalLesaoBean bean = (LocalLesaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllLocaisLesao(pai);
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
	 * findAllLocaisLesao_Local
	 * @generated
	 */
	public java.util.Collection findAllLocaisLesao_Local(int pai)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			LocalLesaoBean bean = (LocalLesaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllLocaisLesao(pai);
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
