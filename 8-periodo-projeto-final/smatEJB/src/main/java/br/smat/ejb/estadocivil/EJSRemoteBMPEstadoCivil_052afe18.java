package br.smat.ejb.estadocivil;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPEstadoCivil_052afe18
 * @generated
 */
public class EJSRemoteBMPEstadoCivil_052afe18
	extends EJSWrapper
	implements EstadoCivil {
	/**
	 * EJSRemoteBMPEstadoCivil_052afe18
	 * @generated
	 */
	public EJSRemoteBMPEstadoCivil_052afe18() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getEstadoCivil
	 * @generated
	 */
	public int getEstadoCivil() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.estadocivil.EstadoCivilBean beanRef =
				(br.smat.ejb.estadocivil.EstadoCivilBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getEstadoCivil();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.estadocivil.EstadoCivilBean beanRef =
				(br.smat.ejb.estadocivil.EstadoCivilBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getNome();
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
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.estadocivil.EstadoCivilBean beanRef =
				(br.smat.ejb.estadocivil.EstadoCivilBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			beanRef.setNome(nome);
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
		return;
	}
	/**
	 * setEstadoCivil
	 * @generated
	 */
	public void setEstadoCivil(int estadoCivil)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.estadocivil.EstadoCivilBean beanRef =
				(br.smat.ejb.estadocivil.EstadoCivilBean) container.preInvoke(
					this,
					2,
					_EJS_s);
			beanRef.setEstadoCivil(estadoCivil);
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
		return;
	}
}
