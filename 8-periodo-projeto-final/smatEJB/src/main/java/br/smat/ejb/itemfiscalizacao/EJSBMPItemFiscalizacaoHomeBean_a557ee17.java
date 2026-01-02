package br.smat.ejb.itemfiscalizacao;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPItemFiscalizacaoHomeBean_a557ee17
 * @generated
 */
public class EJSBMPItemFiscalizacaoHomeBean_a557ee17 extends EJSHome {
	/**
	 * EJSBMPItemFiscalizacaoHomeBean_a557ee17
	 * @generated
	 */
	public EJSBMPItemFiscalizacaoHomeBean_a557ee17()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public ItemFiscalizacao findByPrimaryKey(
		br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		ItemFiscalizacao _EJS_bmp =
			(ItemFiscalizacao) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				ItemFiscalizacaoBean _EJS_bean =
					(ItemFiscalizacaoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.itemfiscalizacao
							.ItemFiscalizacaoKey) _EJS_bean
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
				(ItemFiscalizacao) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.itemfiscalizacao.ItemFiscalizacao create(
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.itemfiscalizacao.ItemFiscalizacao result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoBean bean =
				(br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey _primaryKey =
				bean.ejbCreate(nome);
			result =
				(
					br
						.smat
						.ejb
						.itemfiscalizacao
						.ItemFiscalizacao) super
						.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome);
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
	public ItemFiscalizacaoLocal findByPrimaryKey_Local(
		br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		ItemFiscalizacaoLocal _EJS_bmp =
			(ItemFiscalizacaoLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				ItemFiscalizacaoBean _EJS_bean =
					(ItemFiscalizacaoBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.itemfiscalizacao
							.ItemFiscalizacaoKey) _EJS_bean
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
				(ItemFiscalizacaoLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoLocal create_Local(
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoBean bean =
				(br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey _primaryKey =
				bean.ejbCreate(nome);
			result =
				(
					br
						.smat
						.ejb
						.itemfiscalizacao
						.ItemFiscalizacaoLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome);
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
	 * findAllItemFiscalizacao
	 * @generated
	 */
	public java.util.Collection findAllItemFiscalizacao()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			ItemFiscalizacaoBean bean =
				(ItemFiscalizacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllItemFiscalizacao();
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
	 * findAllItemFiscalizacao_Local
	 * @generated
	 */
	public java.util.Collection findAllItemFiscalizacao_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			ItemFiscalizacaoBean bean =
				(ItemFiscalizacaoBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllItemFiscalizacao();
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
