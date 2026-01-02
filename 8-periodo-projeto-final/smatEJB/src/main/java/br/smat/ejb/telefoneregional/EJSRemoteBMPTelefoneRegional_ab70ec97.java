package br.smat.ejb.telefoneregional;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPTelefoneRegional_ab70ec97
 * @generated
 */
public class EJSRemoteBMPTelefoneRegional_ab70ec97
	extends EJSWrapper
	implements TelefoneRegional {
	/**
	 * EJSRemoteBMPTelefoneRegional_ab70ec97
	 * @generated
	 */
	public EJSRemoteBMPTelefoneRegional_ab70ec97()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getRegional
	 * @generated
	 */
	public br.smat.ejb.regional.RegionalKey getRegional()
		throws java.rmi.RemoteException {
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
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 0, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getTelefoneRegional
	 * @generated
	 */
	public int getTelefoneRegional() throws java.rmi.RemoteException {
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
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 2, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getDdd
	 * @generated
	 */
	public java.lang.String getDdd() throws java.rmi.RemoteException {
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
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 3, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getDescricao
	 * @generated
	 */
	public java.lang.String getDescricao() throws java.rmi.RemoteException {
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
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 4, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getNumero
	 * @generated
	 */
	public java.lang.String getNumero() throws java.rmi.RemoteException {
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
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 5, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setDdd
	 * @generated
	 */
	public void setDdd(java.lang.String ddd) throws java.rmi.RemoteException {
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
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 6, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setDescricao
	 * @generated
	 */
	public void setDescricao(java.lang.String descricao)
		throws java.rmi.RemoteException {
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
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 7, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setNumero
	 * @generated
	 */
	public void setNumero(java.lang.String numero)
		throws java.rmi.RemoteException {
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
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 8, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * getRegionalKey
	 * @generated
	 */
	public int getRegionalKey() throws java.rmi.RemoteException {
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
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 1, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setRegional
	 * @generated
	 */
	public void setRegional(br.smat.ejb.regional.RegionalKey regional)
		throws java.rmi.RemoteException {
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
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 9, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setTelefoneRegional
	 * @generated
	 */
	public void setTelefoneRegional(int telefoneRegional)
		throws java.rmi.RemoteException {
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
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 10, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
}
