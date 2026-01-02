package br.smat.ejb.agentesaude;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPAgenteSaude_06590eec
 * @generated
 */
public class EJSLocalBMPAgenteSaude_06590eec
	extends EJSLocalWrapper
	implements br.smat.ejb.agentesaude.AgenteSaudeLocal {
	/**
	 * EJSLocalBMPAgenteSaude_06590eec
	 * @generated
	 */
	public EJSLocalBMPAgenteSaude_06590eec() {
		super();
	}
	/**
	 * getRegional
	 * @generated
	 */
	public br.smat.ejb.regional.RegionalKey getRegional() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.regional.RegionalKey _EJS_result = null;
		try {
			br.smat.ejb.agentesaude.AgenteSaudeBean beanRef =
				(br.smat.ejb.agentesaude.AgenteSaudeBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getRegional();
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
	 * getAgenteSaude
	 * @generated
	 */
	public int getAgenteSaude() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.agentesaude.AgenteSaudeBean beanRef =
				(br.smat.ejb.agentesaude.AgenteSaudeBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getAgenteSaude();
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
	 * getEmail
	 * @generated
	 */
	public java.lang.String getEmail() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.agentesaude.AgenteSaudeBean beanRef =
				(br.smat.ejb.agentesaude.AgenteSaudeBean) container.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getEmail();
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
			br.smat.ejb.agentesaude.AgenteSaudeBean beanRef =
				(br.smat.ejb.agentesaude.AgenteSaudeBean) container.preInvoke(
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
	 * setEmail
	 * @generated
	 */
	public void setEmail(java.lang.String email) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.agentesaude.AgenteSaudeBean beanRef =
				(br.smat.ejb.agentesaude.AgenteSaudeBean) container.preInvoke(
					this,
					4,
					_EJS_s);
			beanRef.setEmail(email);
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
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.agentesaude.AgenteSaudeBean beanRef =
				(br.smat.ejb.agentesaude.AgenteSaudeBean) container.preInvoke(
					this,
					5,
					_EJS_s);
			beanRef.setNome(nome);
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
	 * setRegional
	 * @generated
	 */
	public void setRegional(br.smat.ejb.regional.RegionalKey regional) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.agentesaude.AgenteSaudeBean beanRef =
				(br.smat.ejb.agentesaude.AgenteSaudeBean) container.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setRegional(regional);
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
