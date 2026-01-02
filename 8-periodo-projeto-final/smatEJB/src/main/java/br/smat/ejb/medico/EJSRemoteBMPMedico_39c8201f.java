package br.smat.ejb.medico;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPMedico_39c8201f
 * @generated
 */
public class EJSRemoteBMPMedico_39c8201f extends EJSWrapper implements Medico {
	/**
	 * EJSRemoteBMPMedico_39c8201f
	 * @generated
	 */
	public EJSRemoteBMPMedico_39c8201f() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getUfCRM
	 * @generated
	 */
	public br.smat.ejb.estado.EstadoKey getUfCRM()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.estado.EstadoKey _EJS_result = null;
		try {
			br.smat.ejb.medico.MedicoBean beanRef =
				(br.smat.ejb.medico.MedicoBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getUfCRM();
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
	 * getCrm
	 * @generated
	 */
	public int getCrm() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.medico.MedicoBean beanRef =
				(br.smat.ejb.medico.MedicoBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getCrm();
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
	 * getMedico
	 * @generated
	 */
	public int getMedico() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.medico.MedicoBean beanRef =
				(br.smat.ejb.medico.MedicoBean) container.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getMedico();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.medico.MedicoBean beanRef =
				(br.smat.ejb.medico.MedicoBean) container.preInvoke(
					this,
					3,
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
			container.postInvoke(this, 3, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setCrm
	 * @generated
	 */
	public void setCrm(int crm) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.medico.MedicoBean beanRef =
				(br.smat.ejb.medico.MedicoBean) container.preInvoke(
					this,
					4,
					_EJS_s);
			beanRef.setCrm(crm);
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
		return;
	}
	/**
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.medico.MedicoBean beanRef =
				(br.smat.ejb.medico.MedicoBean) container.preInvoke(
					this,
					5,
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
			container.postInvoke(this, 5, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setUfCRM
	 * @generated
	 */
	public void setUfCRM(br.smat.ejb.estado.EstadoKey ufCRM)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.medico.MedicoBean beanRef =
				(br.smat.ejb.medico.MedicoBean) container.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setUfCRM(ufCRM);
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
}
