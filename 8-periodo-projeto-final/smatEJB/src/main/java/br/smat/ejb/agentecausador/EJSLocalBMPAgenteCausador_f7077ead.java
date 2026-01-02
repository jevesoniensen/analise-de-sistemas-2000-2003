package br.smat.ejb.agentecausador;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPAgenteCausador_f7077ead
 * @generated
 */
public class EJSLocalBMPAgenteCausador_f7077ead
	extends EJSLocalWrapper
	implements br.smat.ejb.agentecausador.AgenteCausadorLocal {
	/**
	 * EJSLocalBMPAgenteCausador_f7077ead
	 * @generated
	 */
	public EJSLocalBMPAgenteCausador_f7077ead() {
		super();
	}
	/**
	 * getAgenteCausadorPai
	 * @generated
	 */
	public br
		.smat
		.ejb
		.agentecausador
		.AgenteCausadorKey getAgenteCausadorPai() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.agentecausador.AgenteCausadorKey _EJS_result = null;
		try {
			br.smat.ejb.agentecausador.AgenteCausadorBean beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.AgenteCausadorBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getAgenteCausadorPai();
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
	 * getAgenteCausador
	 * @generated
	 */
	public int getAgenteCausador() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.agentecausador.AgenteCausadorBean beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.AgenteCausadorBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getAgenteCausador();
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
	 * getDescricao
	 * @generated
	 */
	public java.lang.String getDescricao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.agentecausador.AgenteCausadorBean beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.AgenteCausadorBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getDescricao();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.agentecausador.AgenteCausadorBean beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.AgenteCausadorBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getNome();
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
	 * setAgenteCausadorPai
	 * @generated
	 */
	public void setAgenteCausadorPai(
		br.smat.ejb.agentecausador.AgenteCausadorKey agenteCausadorPai) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.agentecausador.AgenteCausadorBean beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.AgenteCausadorBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			beanRef.setAgenteCausadorPai(agenteCausadorPai);
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
		return;
	}
	/**
	 * setDescricao
	 * @generated
	 */
	public void setDescricao(java.lang.String descricao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.agentecausador.AgenteCausadorBean beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.AgenteCausadorBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			beanRef.setDescricao(descricao);
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
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.agentecausador.AgenteCausadorBean beanRef =
				(
					br
						.smat
						.ejb
						.agentecausador
						.AgenteCausadorBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setNome(nome);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 6, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
}
