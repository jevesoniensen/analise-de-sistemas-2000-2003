package br.smat.ejb.agentesaude;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPAgenteSaudeHomeBean_06590eec
 * @generated
 */
public class EJSBMPAgenteSaudeHomeBean_06590eec extends EJSHome {
	/**
	 * EJSBMPAgenteSaudeHomeBean_06590eec
	 * @generated
	 */
	public EJSBMPAgenteSaudeHomeBean_06590eec()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public AgenteSaude findByPrimaryKey(
		br.smat.ejb.agentesaude.AgenteSaudeKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		AgenteSaude _EJS_bmp = (AgenteSaude) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.agentesaude.AgenteSaudeKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				AgenteSaudeBean _EJS_bean =
					(AgenteSaudeBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.agentesaude
							.AgenteSaudeKey) _EJS_bean
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
				(AgenteSaude) super.activateBean((java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllAgentesSaude
	 * @generated
	 */
	public java.util.Collection findAllAgentesSaude()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			AgenteSaudeBean bean = (AgenteSaudeBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllAgentesSaude();
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
	public br.smat.ejb.agentesaude.AgenteSaude create(
		java.lang.String nome,
		java.lang.String email,
		int regional)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.agentesaude.AgenteSaude result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.agentesaude.AgenteSaudeBean bean =
				(br.smat.ejb.agentesaude.AgenteSaudeBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.agentesaude.AgenteSaudeKey _primaryKey =
				bean.ejbCreate(nome, email, regional);
			result =
				(br.smat.ejb.agentesaude.AgenteSaude) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, email, regional);
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
	public AgenteSaudeLocal findByPrimaryKey_Local(
		br.smat.ejb.agentesaude.AgenteSaudeKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		AgenteSaudeLocal _EJS_bmp =
			(AgenteSaudeLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.agentesaude.AgenteSaudeKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				AgenteSaudeBean _EJS_bean =
					(AgenteSaudeBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.agentesaude
							.AgenteSaudeKey) _EJS_bean
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
				(AgenteSaudeLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllAgentesSaude_Local
	 * @generated
	 */
	public java.util.Collection findAllAgentesSaude_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			AgenteSaudeBean bean = (AgenteSaudeBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllAgentesSaude();
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
	public br.smat.ejb.agentesaude.AgenteSaudeLocal create_Local(
		java.lang.String nome,
		java.lang.String email,
		int regional)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.agentesaude.AgenteSaudeLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.agentesaude.AgenteSaudeBean bean =
				(br.smat.ejb.agentesaude.AgenteSaudeBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.agentesaude.AgenteSaudeKey _primaryKey =
				bean.ejbCreate(nome, email, regional);
			result =
				(
					br
						.smat
						.ejb
						.agentesaude
						.AgenteSaudeLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, email, regional);
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
}
