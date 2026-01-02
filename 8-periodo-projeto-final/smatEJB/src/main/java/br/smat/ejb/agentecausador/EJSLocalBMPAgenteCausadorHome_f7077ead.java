package br.smat.ejb.agentecausador;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPAgenteCausadorHome_f7077ead
 * @generated
 */
public class EJSLocalBMPAgenteCausadorHome_f7077ead
	extends EJSLocalWrapper
	implements br.smat.ejb.agentecausador.AgenteCausadorLocalHome {
	/**
	 * EJSLocalBMPAgenteCausadorHome_f7077ead
	 * @generated
	 */
	public EJSLocalBMPAgenteCausadorHome_f7077ead() {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.agentecausador.AgenteCausadorLocal findByPrimaryKey(
		br.smat.ejb.agentecausador.AgenteCausadorKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.agentecausador.AgenteCausadorLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.agentecausador
				.EJSBMPAgenteCausadorHomeBean_f7077ead _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.EJSBMPAgenteCausadorHomeBean_f7077ead) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findByPrimaryKey_Local(primaryKey);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 1, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findAllAgentesCausadores
	 * @generated
	 */
	public java.util.Collection findAllAgentesCausadores()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.agentecausador
				.EJSBMPAgenteCausadorHomeBean_f7077ead _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.EJSBMPAgenteCausadorHomeBean_f7077ead) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllAgentesCausadores_Local();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 2, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(java.lang.Object arg0)
		throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.agentecausador
				.EJSBMPAgenteCausadorHomeBean_f7077ead _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.EJSBMPAgenteCausadorHomeBean_f7077ead) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_beanRef.remove(arg0);
		} catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (javax.ejb.EJBException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 5, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.agentecausador.AgenteCausadorLocal create(
		java.lang.String nome,
		java.lang.String descricao,
		int agenteCausadorPai)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.agentecausador.AgenteCausadorLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.agentecausador
				.EJSBMPAgenteCausadorHomeBean_f7077ead _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.EJSBMPAgenteCausadorHomeBean_f7077ead) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create_Local(nome, descricao, agenteCausadorPai);
		} catch (javax.ejb.CreateException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findAllAgentesCausadores
	 * @generated
	 */
	public java.util.Collection findAllAgentesCausadores(int pai)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.agentecausador
				.EJSBMPAgenteCausadorHomeBean_f7077ead _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.EJSBMPAgenteCausadorHomeBean_f7077ead) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllAgentesCausadores_Local(pai);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 3, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * findAllAgentesCausadoresNot
	 * @generated
	 */
	public java.util.Collection findAllAgentesCausadoresNot(
		int agenteCausador,
		int agenteCausadorPai)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.agentecausador
				.EJSBMPAgenteCausadorHomeBean_f7077ead _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.EJSBMPAgenteCausadorHomeBean_f7077ead) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.findAllAgentesCausadoresNot_Local(
					agenteCausador,
					agenteCausadorPai);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 4, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
}
