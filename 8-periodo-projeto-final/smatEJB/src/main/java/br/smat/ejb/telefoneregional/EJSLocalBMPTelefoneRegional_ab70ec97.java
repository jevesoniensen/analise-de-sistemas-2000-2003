package br.smat.ejb.telefoneregional;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPTelefoneRegional_ab70ec97
 * @generated
 */
public class EJSLocalBMPTelefoneRegional_ab70ec97
	extends EJSLocalWrapper
	implements br.smat.ejb.telefoneregional.TelefoneRegionalLocal {
	/**
	 * EJSLocalBMPTelefoneRegional_ab70ec97
	 * @generated
	 */
	public EJSLocalBMPTelefoneRegional_ab70ec97() {
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
			br.smat.ejb.telefoneregional.TelefoneRegionalBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegionalBean) container
						.preInvoke(
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
	 * getTelefoneRegional
	 * @generated
	 */
	public int getTelefoneRegional() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.telefoneregional.TelefoneRegionalBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegionalBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getTelefoneRegional();
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
	 * getDdd
	 * @generated
	 */
	public java.lang.String getDdd() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.telefoneregional.TelefoneRegionalBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegionalBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getDdd();
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
	 * getDescricao
	 * @generated
	 */
	public java.lang.String getDescricao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.telefoneregional.TelefoneRegionalBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegionalBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = beanRef.getDescricao();
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
	/**
	 * getNumero
	 * @generated
	 */
	public java.lang.String getNumero() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.telefoneregional.TelefoneRegionalBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegionalBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getNumero();
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
		return _EJS_result;
	}
	/**
	 * setDdd
	 * @generated
	 */
	public void setDdd(java.lang.String ddd) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.telefoneregional.TelefoneRegionalBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegionalBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setDdd(ddd);
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
	/**
	 * setDescricao
	 * @generated
	 */
	public void setDescricao(java.lang.String descricao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.telefoneregional.TelefoneRegionalBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegionalBean) container
						.preInvoke(
					this,
					7,
					_EJS_s);
			beanRef.setDescricao(descricao);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 7, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setNumero
	 * @generated
	 */
	public void setNumero(java.lang.String numero) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.telefoneregional.TelefoneRegionalBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegionalBean) container
						.preInvoke(
					this,
					8,
					_EJS_s);
			beanRef.setNumero(numero);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 8, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * getRegionalKey
	 * @generated
	 */
	public int getRegionalKey() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.telefoneregional.TelefoneRegionalBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegionalBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getRegionalKey();
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
	 * setRegional
	 * @generated
	 */
	public void setRegional(br.smat.ejb.regional.RegionalKey regional) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.telefoneregional.TelefoneRegionalBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegionalBean) container
						.preInvoke(
					this,
					9,
					_EJS_s);
			beanRef.setRegional(regional);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 9, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setTelefoneRegional
	 * @generated
	 */
	public void setTelefoneRegional(int telefoneRegional) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.telefoneregional.TelefoneRegionalBean beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.TelefoneRegionalBean) container
						.preInvoke(
					this,
					10,
					_EJS_s);
			beanRef.setTelefoneRegional(telefoneRegional);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 10, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
}
