package br.smat.ejb.testemunha;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPTestemunhaHomeBean_2be5b035
 * @generated
 */
public class EJSBMPTestemunhaHomeBean_2be5b035 extends EJSHome {
	/**
	 * EJSBMPTestemunhaHomeBean_2be5b035
	 * @generated
	 */
	public EJSBMPTestemunhaHomeBean_2be5b035()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public Testemunha findByPrimaryKey(
		br.smat.ejb.testemunha.TestemunhaKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		Testemunha _EJS_bmp = (Testemunha) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.testemunha.TestemunhaKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TestemunhaBean _EJS_bean =
					(TestemunhaBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.testemunha
							.TestemunhaKey) _EJS_bean
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
				(Testemunha) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.testemunha.Testemunha create(
		int acidente,
		int municipio,
		java.lang.String nome,
		int numero,
		java.lang.String rua,
		java.lang.String bairro,
		java.lang.String cep,
		java.lang.String complemento,
		java.lang.String telefone,
		java.lang.String ddd)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.testemunha.Testemunha result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.testemunha.TestemunhaBean bean =
				(br.smat.ejb.testemunha.TestemunhaBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.testemunha.TestemunhaKey _primaryKey =
				bean.ejbCreate(
					acidente,
					municipio,
					nome,
					numero,
					rua,
					bairro,
					cep,
					complemento,
					telefone,
					ddd);
			result =
				(br.smat.ejb.testemunha.Testemunha) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				acidente,
				municipio,
				nome,
				numero,
				rua,
				bairro,
				cep,
				complemento,
				telefone,
				ddd);
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
	public TestemunhaLocal findByPrimaryKey_Local(
		br.smat.ejb.testemunha.TestemunhaKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		TestemunhaLocal _EJS_bmp =
			(TestemunhaLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.testemunha.TestemunhaKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				TestemunhaBean _EJS_bean =
					(TestemunhaBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.testemunha
							.TestemunhaKey) _EJS_bean
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
				(TestemunhaLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.testemunha.TestemunhaLocal create_Local(
		int acidente,
		int municipio,
		java.lang.String nome,
		int numero,
		java.lang.String rua,
		java.lang.String bairro,
		java.lang.String cep,
		java.lang.String complemento,
		java.lang.String telefone,
		java.lang.String ddd)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.testemunha.TestemunhaLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.testemunha.TestemunhaBean bean =
				(br.smat.ejb.testemunha.TestemunhaBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.testemunha.TestemunhaKey _primaryKey =
				bean.ejbCreate(
					acidente,
					municipio,
					nome,
					numero,
					rua,
					bairro,
					cep,
					complemento,
					telefone,
					ddd);
			result =
				(
					br
						.smat
						.ejb
						.testemunha
						.TestemunhaLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(
				acidente,
				municipio,
				nome,
				numero,
				rua,
				bairro,
				cep,
				complemento,
				telefone,
				ddd);
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
	 * findAllTestemunhas
	 * @generated
	 */
	public java.util.Collection findAllTestemunhas(int acidente)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TestemunhaBean bean = (TestemunhaBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTestemunhas(acidente);
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
	 * findAllTestemunhas_Local
	 * @generated
	 */
	public java.util.Collection findAllTestemunhas_Local(int acidente)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			TestemunhaBean bean = (TestemunhaBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllTestemunhas(acidente);
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
