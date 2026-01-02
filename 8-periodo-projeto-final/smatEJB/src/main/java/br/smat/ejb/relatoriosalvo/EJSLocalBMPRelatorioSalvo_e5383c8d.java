package br.smat.ejb.relatoriosalvo;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPRelatorioSalvo_e5383c8d
 * @generated
 */
public class EJSLocalBMPRelatorioSalvo_e5383c8d
	extends EJSLocalWrapper
	implements br.smat.ejb.relatoriosalvo.RelatorioSalvoLocal {
	/**
	 * EJSLocalBMPRelatorioSalvo_e5383c8d
	 * @generated
	 */
	public EJSLocalBMPRelatorioSalvo_e5383c8d() {
		super();
	}
	/**
	 * getCampo1
	 * @generated
	 */
	public br.smat.ejb.campo.CampoKey getCampo1() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.campo.CampoKey _EJS_result = null;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getCampo1();
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
	 * getCampo2
	 * @generated
	 */
	public br.smat.ejb.campo.CampoKey getCampo2() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.campo.CampoKey _EJS_result = null;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getCampo2();
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
	 * getLocal
	 * @generated
	 */
	public int getLocal() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getLocal();
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
	 * getPeriodicidade
	 * @generated
	 */
	public int getPeriodicidade() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getPeriodicidade();
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
	 * getRelatorio
	 * @generated
	 */
	public int getRelatorio() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = beanRef.getRelatorio();
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
	 * getTipoAgrupamento
	 * @generated
	 */
	public int getTipoAgrupamento() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getTipoAgrupamento();
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
	 * getDataFim
	 * @generated
	 */
	public java.lang.String getDataFim() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					7,
					_EJS_s);
			_EJS_result = beanRef.getDataFim();
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
		return _EJS_result;
	}
	/**
	 * getDataInicio
	 * @generated
	 */
	public java.lang.String getDataInicio() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					8,
					_EJS_s);
			_EJS_result = beanRef.getDataInicio();
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
		return _EJS_result;
	}
	/**
	 * getQueryCampo1
	 * @generated
	 */
	public java.lang.String getQueryCampo1() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					9,
					_EJS_s);
			_EJS_result = beanRef.getQueryCampo1();
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
		return _EJS_result;
	}
	/**
	 * getQueryCampo2
	 * @generated
	 */
	public java.lang.String getQueryCampo2() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					10,
					_EJS_s);
			_EJS_result = beanRef.getQueryCampo2();
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
		return _EJS_result;
	}
	/**
	 * getQueryLocal
	 * @generated
	 */
	public java.lang.String getQueryLocal() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					11,
					_EJS_s);
			_EJS_result = beanRef.getQueryLocal();
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
		return _EJS_result;
	}
	/**
	 * getTexto
	 * @generated
	 */
	public java.lang.String getTexto() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					12,
					_EJS_s);
			_EJS_result = beanRef.getTexto();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 12, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getTitulo
	 * @generated
	 */
	public java.lang.String getTitulo() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					13,
					_EJS_s);
			_EJS_result = beanRef.getTitulo();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 13, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * setCampo1
	 * @generated
	 */
	public void setCampo1(br.smat.ejb.campo.CampoKey campo1) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					14,
					_EJS_s);
			beanRef.setCampo1(campo1);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 14, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setCampo2
	 * @generated
	 */
	public void setCampo2(br.smat.ejb.campo.CampoKey campo2) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					15,
					_EJS_s);
			beanRef.setCampo2(campo2);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 15, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setDataFim
	 * @generated
	 */
	public void setDataFim(java.lang.String dataFim) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					16,
					_EJS_s);
			beanRef.setDataFim(dataFim);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 16, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setDataInicio
	 * @generated
	 */
	public void setDataInicio(java.lang.String dataInicio) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					17,
					_EJS_s);
			beanRef.setDataInicio(dataInicio);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 17, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setLocal
	 * @generated
	 */
	public void setLocal(int local) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					18,
					_EJS_s);
			beanRef.setLocal(local);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 18, _EJS_s);
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
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					19,
					_EJS_s);
			beanRef.setPeriodicidade(periodicidade);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 19, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setQueryCampo1
	 * @generated
	 */
	public void setQueryCampo1(java.lang.String queryCampo1) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					20,
					_EJS_s);
			beanRef.setQueryCampo1(queryCampo1);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 20, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setQueryCampo2
	 * @generated
	 */
	public void setQueryCampo2(java.lang.String queryCampo2) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					21,
					_EJS_s);
			beanRef.setQueryCampo2(queryCampo2);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 21, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setQueryLocal
	 * @generated
	 */
	public void setQueryLocal(java.lang.String queryLocal) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					22,
					_EJS_s);
			beanRef.setQueryLocal(queryLocal);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 22, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setTexto
	 * @generated
	 */
	public void setTexto(java.lang.String texto) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					23,
					_EJS_s);
			beanRef.setTexto(texto);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 23, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setTipoAgrupamento
	 * @generated
	 */
	public void setTipoAgrupamento(int tipoAgrupamento) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					24,
					_EJS_s);
			beanRef.setTipoAgrupamento(tipoAgrupamento);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 24, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setTitulo
	 * @generated
	 */
	public void setTitulo(java.lang.String titulo) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					25,
					_EJS_s);
			beanRef.setTitulo(titulo);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 25, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * getDataCriacao
	 * @generated
	 */
	public java.lang.String getDataCriacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoBean beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.RelatorioSalvoBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			_EJS_result = beanRef.getDataCriacao();
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
}
