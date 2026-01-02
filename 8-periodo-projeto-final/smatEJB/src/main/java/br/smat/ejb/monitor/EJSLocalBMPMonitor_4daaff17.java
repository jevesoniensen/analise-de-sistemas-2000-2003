package br.smat.ejb.monitor;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPMonitor_4daaff17
 * @generated
 */
public class EJSLocalBMPMonitor_4daaff17
	extends EJSLocalWrapper
	implements br.smat.ejb.monitor.MonitorLocal {
	/**
	 * EJSLocalBMPMonitor_4daaff17
	 * @generated
	 */
	public EJSLocalBMPMonitor_4daaff17() {
		super();
	}
	/**
	 * getCampo
	 * @generated
	 */
	public br.smat.ejb.campo.CampoKey getCampo() {
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
	 * getMaxAcidente
	 * @generated
	 */
	public int getMaxAcidente() {
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
	 * getMonitor
	 * @generated
	 */
	public int getMonitor() {
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
	 * getNumAcidentes
	 * @generated
	 */
	public int getNumAcidentes() {
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
	 * getPeriodicidade
	 * @generated
	 */
	public int getPeriodicidade() {
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
	 * getQueryCampo
	 * @generated
	 */
	public int getQueryCampo() {
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
	 * getUltimaDataExecucao
	 * @generated
	 */
	public java.lang.String getUltimaDataExecucao() {
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
		return _EJS_result;
	}
	/**
	 * setCampo
	 * @generated
	 */
	public void setCampo(br.smat.ejb.campo.CampoKey campo) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					7,
					_EJS_s);
			beanRef.setCampo(campo);
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
	 * setMaxAcidente
	 * @generated
	 */
	public void setMaxAcidente(int maxAcidente) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					8,
					_EJS_s);
			beanRef.setMaxAcidente(maxAcidente);
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
	 * setPeriodicidade
	 * @generated
	 */
	public void setPeriodicidade(int periodicidade) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					9,
					_EJS_s);
			beanRef.setPeriodicidade(periodicidade);
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
	 * setQueryCampo
	 * @generated
	 */
	public void setQueryCampo(int queryCampo) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					10,
					_EJS_s);
			beanRef.setQueryCampo(queryCampo);
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
	/**
	 * setUltimaDataExecucao
	 * @generated
	 */
	public void setUltimaDataExecucao(java.lang.String ultimaDataExecucao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.monitor.MonitorBean beanRef =
				(br.smat.ejb.monitor.MonitorBean) container.preInvoke(
					this,
					11,
					_EJS_s);
			beanRef.setUltimaDataExecucao(ultimaDataExecucao);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 11, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
}
