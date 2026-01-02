package br.smat.ejb.agentecausador;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSBMPAgenteCausadorHomeBean_f7077ead
 * @generated
 */
public class EJSBMPAgenteCausadorHomeBean_f7077ead extends EJSHome {
	/**
	 * EJSBMPAgenteCausadorHomeBean_f7077ead
	 * @generated
	 */
	public EJSBMPAgenteCausadorHomeBean_f7077ead()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public AgenteCausador findByPrimaryKey(
		br.smat.ejb.agentecausador.AgenteCausadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		AgenteCausador _EJS_bmp = (AgenteCausador) super.getBean(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.agentecausador.AgenteCausadorKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				AgenteCausadorBean _EJS_bean =
					(AgenteCausadorBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.agentecausador
							.AgenteCausadorKey) _EJS_bean
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
				(AgenteCausador) super.activateBean(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllAgentesCausadores
	 * @generated
	 */
	public java.util.Collection findAllAgentesCausadores()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			AgenteCausadorBean bean =
				(AgenteCausadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllAgentesCausadores();
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
	public AgenteCausadorLocal findByPrimaryKey_Local(
		br.smat.ejb.agentecausador.AgenteCausadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		AgenteCausadorLocal _EJS_bmp =
			(AgenteCausadorLocal) super.getBean_Local(primaryKey);
		if (_EJS_bmp == null) {
			EntityBeanO _EJS_beanO = null;
			br.smat.ejb.agentecausador.AgenteCausadorKey _EJS_key = null;
			try {
				_EJS_beanO = super.getFindByPrimaryKeyEntityBeanO();
				AgenteCausadorBean _EJS_bean =
					(AgenteCausadorBean) _EJS_beanO.getEnterpriseBean();
				_EJS_key =
					(
						br
							.smat
							.ejb
							.agentecausador
							.AgenteCausadorKey) _EJS_bean
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
				(AgenteCausadorLocal) super.activateBean_Local(
					(java.lang.Object) _EJS_key);
		}
		return _EJS_bmp;
	}
	/**
	 * findAllAgentesCausadores_Local
	 * @generated
	 */
	public java.util.Collection findAllAgentesCausadores_Local()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			AgenteCausadorBean bean =
				(AgenteCausadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllAgentesCausadores();
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
	public br.smat.ejb.agentecausador.AgenteCausador create(
		java.lang.String nome,
		java.lang.String descricao,
		int agenteCausadorPai)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.agentecausador.AgenteCausador result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.agentecausador.AgenteCausadorBean bean =
				(br.smat.ejb.agentecausador.AgenteCausadorBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.agentecausador.AgenteCausadorKey _primaryKey =
				bean.ejbCreate(nome, descricao, agenteCausadorPai);
			result =
				(br.smat.ejb.agentecausador.AgenteCausador) super.postCreate(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, descricao, agenteCausadorPai);
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
	public br.smat.ejb.agentecausador.AgenteCausadorLocal create_Local(
		java.lang.String nome,
		java.lang.String descricao,
		int agenteCausadorPai)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.agentecausador.AgenteCausadorLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			beanO = super.createBeanO();
			br.smat.ejb.agentecausador.AgenteCausadorBean bean =
				(br.smat.ejb.agentecausador.AgenteCausadorBean) beanO
					.getEnterpriseBean();
			preCreateFlag = super.preEjbCreate(beanO);
			br.smat.ejb.agentecausador.AgenteCausadorKey _primaryKey =
				bean.ejbCreate(nome, descricao, agenteCausadorPai);
			result =
				(
					br
						.smat
						.ejb
						.agentecausador
						.AgenteCausadorLocal) super
						.postCreate_Local(
					beanO,
					_primaryKey,
					true);
			bean.ejbPostCreate(nome, descricao, agenteCausadorPai);
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
	 * findAllAgentesCausadores
	 * @generated
	 */
	public java.util.Collection findAllAgentesCausadores(int pai)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			AgenteCausadorBean bean =
				(AgenteCausadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllAgentesCausadores(pai);
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
	 * findAllAgentesCausadores_Local
	 * @generated
	 */
	public java.util.Collection findAllAgentesCausadores_Local(int pai)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			AgenteCausadorBean bean =
				(AgenteCausadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys = bean.ejbFindAllAgentesCausadores(pai);
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
	 * findAllAgentesCausadoresNot
	 * @generated
	 */
	public java.util.Collection findAllAgentesCausadoresNot(
		int agenteCausador,
		int agenteCausadorPai)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			AgenteCausadorBean bean =
				(AgenteCausadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllAgentesCausadoresNot(
					agenteCausador,
					agenteCausadorPai);
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
	 * findAllAgentesCausadoresNot_Local
	 * @generated
	 */
	public java.util.Collection findAllAgentesCausadoresNot_Local(
		int agenteCausador,
		int agenteCausadorPai)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		java.util.Collection result = null;
		EntityBeanO beanO = null;

		try {
			beanO = super.getFinderEntityBeanO();
			AgenteCausadorBean bean =
				(AgenteCausadorBean) beanO.getEnterpriseBean();
			java.util.Collection pKeys =
				bean.ejbFindAllAgentesCausadoresNot(
					agenteCausador,
					agenteCausadorPai);
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
