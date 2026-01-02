package br.smat.ejb.monitor;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPMonitor_4daaff17
 * @generated
 */
public class EJSRemoteBMPMonitor_4daaff17
	extends EJSWrapper
	implements Monitor {
	/**
	 * EJSRemoteBMPMonitor_4daaff17
	 * @generated
	 */
	public EJSRemoteBMPMonitor_4daaff17() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getCampo
	 * @generated
	 */
	public br.smat.ejb.campo.CampoKey getCampo()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.campo.CampoKey _EJS_result = null;
		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getCampo();
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
	 * getMaxAcidente
	 * @generated
	 */
	public int getMaxAcidente() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getMaxAcidente();
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
	 * getMonitor
	 * @generated
	 */
	public int getMonitor() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getMonitor();
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
	 * getNumAcidentes
	 * @generated
	 */
	public int getNumAcidentes() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getNumAcidentes();
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
	 * getPeriodicidade
	 * @generated
	 */
	public int getPeriodicidade() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = beanRef.getPeriodicidade();
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
	 * getQueryCampo
	 * @generated
	 */
	public int getQueryCampo() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getQueryCampo();
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
	 * getUltimaDataExecucao
	 * @generated
	 */
	public java.lang.String getUltimaDataExecucao()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					6,
					_EJS_s);
			_EJS_result = beanRef.getUltimaDataExecucao();
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
		return _EJS_result;
	}
	/**
	 * setCampo
	 * @generated
	 */
	public void setCampo(br.smat.ejb.campo.CampoKey campo)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					7,
					_EJS_s);
			beanRef.setCampo(campo);
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
	 * setMaxAcidente
	 * @generated
	 */
	public void setMaxAcidente(int maxAcidente)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					8,
					_EJS_s);
			beanRef.setMaxAcidente(maxAcidente);
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
	 * setPeriodicidade
	 * @generated
	 */
	public void setPeriodicidade(int periodicidade)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					9,
					_EJS_s);
			beanRef.setPeriodicidade(periodicidade);
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
	 * setQueryCampo
	 * @generated
	 */
	public void setQueryCampo(int queryCampo) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					10,
					_EJS_s);
			beanRef.setQueryCampo(queryCampo);
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
	/**
	 * setUltimaDataExecucao
	 * @generated
	 */
	public void setUltimaDataExecucao(java.lang.String ultimaDataExecucao)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					11,
					_EJS_s);
			beanRef.setUltimaDataExecucao(ultimaDataExecucao);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 11, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
}
