package br.smat.ejb.empregador;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPEmpregador_58b48954
 * @generated
 */
public class EJSLocalBMPEmpregador_58b48954
	extends EJSLocalWrapper
	implements br.smat.ejb.empregador.EmpregadorLocal {
	/**
	 * EJSLocalBMPEmpregador_58b48954
	 * @generated
	 */
	public EJSLocalBMPEmpregador_58b48954() {
		super();
	}
	/**
	 * getMunicipio
	 * @generated
	 */
	public br.smat.ejb.municipio.MunicipioKey getMunicipio() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.municipio.MunicipioKey _EJS_result = null;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getMunicipio();
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
	 * getRamoAtividade
	 * @generated
	 */
	public br.smat.ejb.ramoatividade.RamoAtividadeKey getRamoAtividade() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.ramoatividade.RamoAtividadeKey _EJS_result = null;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getRamoAtividade();
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
	 * getTipoEmpregador
	 * @generated
	 */
	public br.smat.ejb.tipoempregador.TipoEmpregadorKey getTipoEmpregador() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipoempregador.TipoEmpregadorKey _EJS_result = null;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getTipoEmpregador();
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
	 * getEmpregador
	 * @generated
	 */
	public int getEmpregador() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getEmpregador();
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
	 * getNumero
	 * @generated
	 */
	public int getNumero() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					9,
					_EJS_s);
			_EJS_result = beanRef.getNumero();
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
	 * getBairro
	 * @generated
	 */
	public java.lang.String getBairro() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					10,
					_EJS_s);
			_EJS_result = beanRef.getBairro();
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
	 * getCep
	 * @generated
	 */
	public java.lang.String getCep() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					11,
					_EJS_s);
			_EJS_result = beanRef.getCep();
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
	 * getComplemento
	 * @generated
	 */
	public java.lang.String getComplemento() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					12,
					_EJS_s);
			_EJS_result = beanRef.getComplemento();
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
	 * getDocumento
	 * @generated
	 */
	public java.lang.String getDocumento() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					13,
					_EJS_s);
			_EJS_result = beanRef.getDocumento();
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
	 * getNomeRamoAtividade
	 * @generated
	 */
	public java.lang.String getNomeRamoAtividade() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					14,
					_EJS_s);
			_EJS_result = beanRef.getNomeRamoAtividade();
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
		return _EJS_result;
	}
	/**
	 * getRazaoSocial
	 * @generated
	 */
	public java.lang.String getRazaoSocial() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					15,
					_EJS_s);
			_EJS_result = beanRef.getRazaoSocial();
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
		return _EJS_result;
	}
	/**
	 * getRua
	 * @generated
	 */
	public java.lang.String getRua() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					16,
					_EJS_s);
			_EJS_result = beanRef.getRua();
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
		return _EJS_result;
	}
	/**
	 * setBairro
	 * @generated
	 */
	public void setBairro(java.lang.String bairro) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					17,
					_EJS_s);
			beanRef.setBairro(bairro);
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
	 * setCep
	 * @generated
	 */
	public void setCep(java.lang.String cep) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					18,
					_EJS_s);
			beanRef.setCep(cep);
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
	 * setComplemento
	 * @generated
	 */
	public void setComplemento(java.lang.String complemento) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					19,
					_EJS_s);
			beanRef.setComplemento(complemento);
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
	 * setDocumento
	 * @generated
	 */
	public void setDocumento(java.lang.String documento) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					20,
					_EJS_s);
			beanRef.setDocumento(documento);
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
	 * setMunicipio
	 * @generated
	 */
	public void setMunicipio(br.smat.ejb.municipio.MunicipioKey municipio) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					21,
					_EJS_s);
			beanRef.setMunicipio(municipio);
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
	 * setNumero
	 * @generated
	 */
	public void setNumero(int numero) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					22,
					_EJS_s);
			beanRef.setNumero(numero);
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
	 * setRamoAtividade
	 * @generated
	 */
	public void setRamoAtividade(
		br.smat.ejb.ramoatividade.RamoAtividadeKey ramoAtividade) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					23,
					_EJS_s);
			beanRef.setRamoAtividade(ramoAtividade);
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
	 * setRazaoSocial
	 * @generated
	 */
	public void setRazaoSocial(java.lang.String razaoSocial) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					24,
					_EJS_s);
			beanRef.setRazaoSocial(razaoSocial);
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
	 * setRua
	 * @generated
	 */
	public void setRua(java.lang.String rua) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					25,
					_EJS_s);
			beanRef.setRua(rua);
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
	 * setTipoEmpregador
	 * @generated
	 */
	public void setTipoEmpregador(
		br.smat.ejb.tipoempregador.TipoEmpregadorKey tipoEmpregador) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					26,
					_EJS_s);
			beanRef.setTipoEmpregador(tipoEmpregador);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 26, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * getKeyEstado
	 * @generated
	 */
	public int getKeyEstado() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = beanRef.getKeyEstado();
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
	 * getKeyRamoAtividade
	 * @generated
	 */
	public int getKeyRamoAtividade() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					6,
					_EJS_s);
			_EJS_result = beanRef.getKeyRamoAtividade();
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
	 * getKeyRamoSuperior
	 * @generated
	 */
	public int getKeyRamoSuperior() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					7,
					_EJS_s);
			_EJS_result = beanRef.getKeyRamoSuperior();
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
	 * getKeyMunicipio
	 * @generated
	 */
	public int getKeyMunicipio() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getKeyMunicipio();
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
	 * getKeyTipoEmpregador
	 * @generated
	 */
	public int getKeyTipoEmpregador() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.empregador.EmpregadorBean beanRef =
				(br.smat.ejb.empregador.EmpregadorBean) container.preInvoke(
					this,
					8,
					_EJS_s);
			_EJS_result = beanRef.getKeyTipoEmpregador();
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
}
