package br.smat.ejb.campo;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPCampo_e4bbba30
 * @generated
 */
public class EJSLocalBMPCampo_e4bbba30
	extends EJSLocalWrapper
	implements br.smat.ejb.campo.CampoLocal {
	/**
	 * EJSLocalBMPCampo_e4bbba30
	 * @generated
	 */
	public EJSLocalBMPCampo_e4bbba30() {
		super();
	}
	/**
	 * getCampo
	 * @generated
	 */
	public int getCampo() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getCampo();
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
	 * getColuna
	 * @generated
	 */
	public java.lang.String getColuna() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getColuna();
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
	 * getPai
	 * @generated
	 */
	public java.lang.String getPai() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					6,
					_EJS_s);
			_EJS_result = beanRef.getPai();
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
	 * getTabela
	 * @generated
	 */
	public java.lang.String getTabela() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					7,
					_EJS_s);
			_EJS_result = beanRef.getTabela();
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
	 * setColuna
	 * @generated
	 */
	public void setColuna(java.lang.String coluna) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					8,
					_EJS_s);
			beanRef.setColuna(coluna);
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
	 * setPai
	 * @generated
	 */
	public void setPai(java.lang.String pai) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					11,
					_EJS_s);
			beanRef.setPai(pai);
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
	/**
	 * setTabela
	 * @generated
	 */
	public void setTabela(java.lang.String tabela) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					12,
					_EJS_s);
			beanRef.setTabela(tabela);
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
		return;
	}
	/**
	 * getLabel
	 * @generated
	 */
	public java.lang.String getLabel() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = beanRef.getLabel();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getNome();
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
	 * setLabel
	 * @generated
	 */
	public void setLabel(java.lang.String label) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					9,
					_EJS_s);
			beanRef.setLabel(label);
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
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					10,
					_EJS_s);
			beanRef.setNome(nome);
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
	 * getRegistros
	 * @generated
	 */
	public br.smat.objetosauxiliares.auxcampo.AuxCampo[] getRegistros() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxcampo.AuxCampo[] _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getRegistros();
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
	 * getRegistrosFilhos
	 * @generated
	 */
	public br.smat.objetosauxiliares.auxcampo.AuxCampo[] getRegistrosFilhos() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxcampo.AuxCampo[] _EJS_result = null;
		try {
			br.smat.ejb.campo.CampoBean beanRef =
				(br.smat.ejb.campo.CampoBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getRegistrosFilhos();
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
}
