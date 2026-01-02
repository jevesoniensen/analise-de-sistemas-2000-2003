package br.smat.ejb.acidente;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPAcidente_d1942e0c
 * @generated
 */
public class EJSLocalBMPAcidente_d1942e0c
	extends EJSLocalWrapper
	implements br.smat.ejb.acidente.AcidenteLocal {
	/**
	 * EJSLocalBMPAcidente_d1942e0c
	 * @generated
	 */
	public EJSLocalBMPAcidente_d1942e0c() {
		super();
	}
	/**
	 * getAgenteCausador
	 * @generated
	 */
	public br.smat.ejb.agentecausador.AgenteCausadorKey getAgenteCausador() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.agentecausador.AgenteCausadorKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getAgenteCausador();
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
	 * getArea
	 * @generated
	 */
	public br.smat.ejb.area.AreaKey getArea() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.area.AreaKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getArea();
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
	 * getDiagnostico
	 * @generated
	 */
	public br.smat.ejb.diagnostico.DiagnosticoKey getDiagnostico() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.diagnostico.DiagnosticoKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getDiagnostico();
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
	 * getEmitente
	 * @generated
	 */
	public br.smat.ejb.emitente.EmitenteKey getEmitente() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.emitente.EmitenteKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getEmitente();
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
	 * getEmpregador
	 * @generated
	 */
	public br.smat.ejb.empregador.EmpregadorKey getEmpregador() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.empregador.EmpregadorKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = beanRef.getEmpregador();
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
	 * getEmpregadorTerceiro
	 * @generated
	 */
	public br.smat.ejb.empregador.EmpregadorKey getEmpregadorTerceiro() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.empregador.EmpregadorKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getEmpregadorTerceiro();
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
	 * getFonte
	 * @generated
	 */
	public br.smat.ejb.fonte.FonteKey getFonte() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.fonte.FonteKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					6,
					_EJS_s);
			_EJS_result = beanRef.getFonte();
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
	 * getLocalAtendimento
	 * @generated
	 */
	public br
		.smat
		.ejb
		.localatendimento
		.LocalAtendimentoKey getLocalAtendimento() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.localatendimento.LocalAtendimentoKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					7,
					_EJS_s);
			_EJS_result = beanRef.getLocalAtendimento();
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
	 * getMedico
	 * @generated
	 */
	public br.smat.ejb.medico.MedicoKey getMedico() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.medico.MedicoKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					8,
					_EJS_s);
			_EJS_result = beanRef.getMedico();
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
	 * getMunicipio
	 * @generated
	 */
	public br.smat.ejb.municipio.MunicipioKey getMunicipio() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.municipio.MunicipioKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					9,
					_EJS_s);
			_EJS_result = beanRef.getMunicipio();
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
	 * getOcupacao
	 * @generated
	 */
	public br.smat.ejb.ocupacao.OcupacaoKey getOcupacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.ocupacao.OcupacaoKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					10,
					_EJS_s);
			_EJS_result = beanRef.getOcupacao();
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
	 * getTipoAcidente
	 * @generated
	 */
	public br.smat.ejb.tipoacidente.TipoAcidenteKey getTipoAcidente() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipoacidente.TipoAcidenteKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					11,
					_EJS_s);
			_EJS_result = beanRef.getTipoAcidente();
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
	 * getTipoLocalAcidente
	 * @generated
	 */
	public br
		.smat
		.ejb
		.tipolocalacidente
		.TipoLocalAcidenteKey getTipoLocalAcidente() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					12,
					_EJS_s);
			_EJS_result = beanRef.getTipoLocalAcidente();
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
	 * getTrabalhador
	 * @generated
	 */
	public br.smat.ejb.trabalhador.TrabalhadorKey getTrabalhador() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.trabalhador.TrabalhadorKey _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					13,
					_EJS_s);
			_EJS_result = beanRef.getTrabalhador();
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
	 * getVinculoEmpregaticio
	 * @generated
	 */
	public br
		.smat
		.ejb
		.vinculoempregaticio
		.VinculoEmpregaticioKey getVinculoEmpregaticio() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioKey _EJS_result =
			null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					14,
					_EJS_s);
			_EJS_result = beanRef.getVinculoEmpregaticio();
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
	 * getRemuneracao
	 * @generated
	 */
	public float getRemuneracao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		float _EJS_result = 0;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					17,
					_EJS_s);
			_EJS_result = beanRef.getRemuneracao();
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
		return _EJS_result;
	}
	/**
	 * getAcidente
	 * @generated
	 */
	public int getAcidente() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					18,
					_EJS_s);
			_EJS_result = beanRef.getAcidente();
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
		return _EJS_result;
	}
	/**
	 * getDuracaoTratamento
	 * @generated
	 */
	public int getDuracaoTratamento() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					19,
					_EJS_s);
			_EJS_result = beanRef.getDuracaoTratamento();
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
		return _EJS_result;
	}
	/**
	 * getHorasTrabalhadas
	 * @generated
	 */
	public int getHorasTrabalhadas() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					20,
					_EJS_s);
			_EJS_result = beanRef.getHorasTrabalhadas();
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
		return _EJS_result;
	}
	/**
	 * getAfastamento
	 * @generated
	 */
	public java.lang.String getAfastamento() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					22,
					_EJS_s);
			_EJS_result = beanRef.getAfastamento();
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
		return _EJS_result;
	}
	/**
	 * getAmputacao
	 * @generated
	 */
	public java.lang.String getAmputacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					23,
					_EJS_s);
			_EJS_result = beanRef.getAmputacao();
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
		return _EJS_result;
	}
	/**
	 * getAposentado
	 * @generated
	 */
	public java.lang.String getAposentado() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					24,
					_EJS_s);
			_EJS_result = beanRef.getAposentado();
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
		return _EJS_result;
	}
	/**
	 * getDataAcidente
	 * @generated
	 */
	public java.lang.String getDataAcidente() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					25,
					_EJS_s);
			_EJS_result = beanRef.getDataAcidente();
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
		return _EJS_result;
	}
	/**
	 * getDataEmissaoFonte
	 * @generated
	 */
	public java.lang.String getDataEmissaoFonte() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					26,
					_EJS_s);
			_EJS_result = beanRef.getDataEmissaoFonte();
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
		return _EJS_result;
	}
	/**
	 * getDataHoraDiagnostico
	 * @generated
	 */
	public java.lang.String getDataHoraDiagnostico() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					27,
					_EJS_s);
			_EJS_result = beanRef.getDataHoraDiagnostico();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 27, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getDescLocalAcidente
	 * @generated
	 */
	public java.lang.String getDescLocalAcidente() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					28,
					_EJS_s);
			_EJS_result = beanRef.getDescLocalAcidente();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 28, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getDescricaoDiagnostico
	 * @generated
	 */
	public java.lang.String getDescricaoDiagnostico() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					29,
					_EJS_s);
			_EJS_result = beanRef.getDescricaoDiagnostico();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 29, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getDescricaoSituacaoGeradora
	 * @generated
	 */
	public java.lang.String getDescricaoSituacaoGeradora() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					30,
					_EJS_s);
			_EJS_result = beanRef.getDescricaoSituacaoGeradora();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 30, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getDistritoSaude
	 * @generated
	 */
	public java.lang.String getDistritoSaude() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					31,
					_EJS_s);
			_EJS_result = beanRef.getDistritoSaude();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 31, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getInternacao
	 * @generated
	 */
	public java.lang.String getInternacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					32,
					_EJS_s);
			_EJS_result = beanRef.getInternacao();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 32, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getNaturezaLesao
	 * @generated
	 */
	public java.lang.String getNaturezaLesao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					33,
					_EJS_s);
			_EJS_result = beanRef.getNaturezaLesao();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 33, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getNumDocFonte
	 * @generated
	 */
	public java.lang.String getNumDocFonte() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					34,
					_EJS_s);
			_EJS_result = beanRef.getNumDocFonte();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 34, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getObito
	 * @generated
	 */
	public java.lang.String getObito() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					35,
					_EJS_s);
			_EJS_result = beanRef.getObito();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 35, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getObservacaoDiagnostico
	 * @generated
	 */
	public java.lang.String getObservacaoDiagnostico() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					36,
					_EJS_s);
			_EJS_result = beanRef.getObservacaoDiagnostico();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 36, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getRegistroPolicial
	 * @generated
	 */
	public java.lang.String getRegistroPolicial() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					37,
					_EJS_s);
			_EJS_result = beanRef.getRegistroPolicial();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 37, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getUltimaTrabalhado
	 * @generated
	 */
	public java.lang.String getUltimaTrabalhado() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					38,
					_EJS_s);
			_EJS_result = beanRef.getUltimaTrabalhado();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 38, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * setAfastamento
	 * @generated
	 */
	public void setAfastamento(java.lang.String afastamento) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					39,
					_EJS_s);
			beanRef.setAfastamento(afastamento);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 39, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setAgenteCausador
	 * @generated
	 */
	public void setAgenteCausador(
		br.smat.ejb.agentecausador.AgenteCausadorKey agenteCausador) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					40,
					_EJS_s);
			beanRef.setAgenteCausador(agenteCausador);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 40, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setAmputacao
	 * @generated
	 */
	public void setAmputacao(java.lang.String amputacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					41,
					_EJS_s);
			beanRef.setAmputacao(amputacao);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 41, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setAposentado
	 * @generated
	 */
	public void setAposentado(java.lang.String aposentado) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					42,
					_EJS_s);
			beanRef.setAposentado(aposentado);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 42, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setArea
	 * @generated
	 */
	public void setArea(br.smat.ejb.area.AreaKey area) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					43,
					_EJS_s);
			beanRef.setArea(area);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 43, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setDataAcidente
	 * @generated
	 */
	public void setDataAcidente(java.lang.String dataAcidente) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					44,
					_EJS_s);
			beanRef.setDataAcidente(dataAcidente);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 44, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setDataEmissaoFonte
	 * @generated
	 */
	public void setDataEmissaoFonte(java.lang.String dataEmissaoFonte) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					45,
					_EJS_s);
			beanRef.setDataEmissaoFonte(dataEmissaoFonte);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 45, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setDataHoraDiagnostico
	 * @generated
	 */
	public void setDataHoraDiagnostico(java.lang.String dataHoraDiagnostico) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					46,
					_EJS_s);
			beanRef.setDataHoraDiagnostico(dataHoraDiagnostico);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 46, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setDescLocalAcidente
	 * @generated
	 */
	public void setDescLocalAcidente(java.lang.String descLocalAcidente) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					47,
					_EJS_s);
			beanRef.setDescLocalAcidente(descLocalAcidente);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 47, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setDescricaoDiagnostico
	 * @generated
	 */
	public void setDescricaoDiagnostico(
		java.lang.String descricaoDiagnostico) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					48,
					_EJS_s);
			beanRef.setDescricaoDiagnostico(descricaoDiagnostico);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 48, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setDescricaoSituacaoGeradora
	 * @generated
	 */
	public void setDescricaoSituacaoGeradora(
		java.lang.String descricaoSituacaoGeradora) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					49,
					_EJS_s);
			beanRef.setDescricaoSituacaoGeradora(descricaoSituacaoGeradora);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 49, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setDiagnostico
	 * @generated
	 */
	public void setDiagnostico(
		br.smat.ejb.diagnostico.DiagnosticoKey diagnostico) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					50,
					_EJS_s);
			beanRef.setDiagnostico(diagnostico);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 50, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setDistritoSaude
	 * @generated
	 */
	public void setDistritoSaude(java.lang.String distritoSaude) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					51,
					_EJS_s);
			beanRef.setDistritoSaude(distritoSaude);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 51, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setDuracaoTratamento
	 * @generated
	 */
	public void setDuracaoTratamento(int duracaoTratamento) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					52,
					_EJS_s);
			beanRef.setDuracaoTratamento(duracaoTratamento);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 52, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setEmitente
	 * @generated
	 */
	public void setEmitente(br.smat.ejb.emitente.EmitenteKey emitente) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					53,
					_EJS_s);
			beanRef.setEmitente(emitente);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 53, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setEmpregador
	 * @generated
	 */
	public void setEmpregador(
		br.smat.ejb.empregador.EmpregadorKey empregador) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					54,
					_EJS_s);
			beanRef.setEmpregador(empregador);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 54, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setEmpregadorTerceiro
	 * @generated
	 */
	public void setEmpregadorTerceiro(
		br.smat.ejb.empregador.EmpregadorKey empregadorTerceiro) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					55,
					_EJS_s);
			beanRef.setEmpregadorTerceiro(empregadorTerceiro);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 55, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setFonte
	 * @generated
	 */
	public void setFonte(br.smat.ejb.fonte.FonteKey fonte) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					56,
					_EJS_s);
			beanRef.setFonte(fonte);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 56, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setHorasTrabalhadas
	 * @generated
	 */
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					57,
					_EJS_s);
			beanRef.setHorasTrabalhadas(horasTrabalhadas);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 57, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setInternacao
	 * @generated
	 */
	public void setInternacao(java.lang.String internacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					58,
					_EJS_s);
			beanRef.setInternacao(internacao);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 58, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setLocalAtendimento
	 * @generated
	 */
	public void setLocalAtendimento(
		br.smat.ejb.localatendimento.LocalAtendimentoKey localAtendimento) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					59,
					_EJS_s);
			beanRef.setLocalAtendimento(localAtendimento);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 59, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setMedico
	 * @generated
	 */
	public void setMedico(br.smat.ejb.medico.MedicoKey medico) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					60,
					_EJS_s);
			beanRef.setMedico(medico);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 60, _EJS_s);
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
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					61,
					_EJS_s);
			beanRef.setMunicipio(municipio);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 61, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setNaturezaLesao
	 * @generated
	 */
	public void setNaturezaLesao(java.lang.String naturezaLesao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					62,
					_EJS_s);
			beanRef.setNaturezaLesao(naturezaLesao);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 62, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setNumDocFonte
	 * @generated
	 */
	public void setNumDocFonte(java.lang.String numDocFonte) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					63,
					_EJS_s);
			beanRef.setNumDocFonte(numDocFonte);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 63, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setObito
	 * @generated
	 */
	public void setObito(java.lang.String obito) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					64,
					_EJS_s);
			beanRef.setObito(obito);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 64, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setObservacaoDiagnostico
	 * @generated
	 */
	public void setObservacaoDiagnostico(
		java.lang.String observacaoDiagnostico) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					65,
					_EJS_s);
			beanRef.setObservacaoDiagnostico(observacaoDiagnostico);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 65, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setOcupacao
	 * @generated
	 */
	public void setOcupacao(br.smat.ejb.ocupacao.OcupacaoKey ocupacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					66,
					_EJS_s);
			beanRef.setOcupacao(ocupacao);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 66, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setRegistroPolicial
	 * @generated
	 */
	public void setRegistroPolicial(java.lang.String registroPolicial) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					67,
					_EJS_s);
			beanRef.setRegistroPolicial(registroPolicial);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 67, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setRemuneracao
	 * @generated
	 */
	public void setRemuneracao(float remuneracao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					68,
					_EJS_s);
			beanRef.setRemuneracao(remuneracao);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 68, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setTipoAcidente
	 * @generated
	 */
	public void setTipoAcidente(
		br.smat.ejb.tipoacidente.TipoAcidenteKey tipoAcidente) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					69,
					_EJS_s);
			beanRef.setTipoAcidente(tipoAcidente);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 69, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setTipoLocalAcidente
	 * @generated
	 */
	public void setTipoLocalAcidente(
		br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey tipoLocalAcidente) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					70,
					_EJS_s);
			beanRef.setTipoLocalAcidente(tipoLocalAcidente);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 70, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setTrabalhador
	 * @generated
	 */
	public void setTrabalhador(
		br.smat.ejb.trabalhador.TrabalhadorKey trabalhador) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					71,
					_EJS_s);
			beanRef.setTrabalhador(trabalhador);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 71, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setUltimaTrabalhado
	 * @generated
	 */
	public void setUltimaTrabalhado(java.lang.String ultimaTrabalhado) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					72,
					_EJS_s);
			beanRef.setUltimaTrabalhado(ultimaTrabalhado);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 72, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setVinculoEmpregaticio
	 * @generated
	 */
	public void setVinculoEmpregaticio(
		br
			.smat
			.ejb
			.vinculoempregaticio
			.VinculoEmpregaticioKey vinculoEmpregaticio) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					73,
					_EJS_s);
			beanRef.setVinculoEmpregaticio(vinculoEmpregaticio);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 73, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * getLocaisLesao
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxlocallesao
		.AuxLocalLesao[] getLocaisLesao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxlocallesao.AuxLocalLesao[] _EJS_result =
			null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					15,
					_EJS_s);
			_EJS_result = beanRef.getLocaisLesao();
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
	 * getTestemunhas
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxtestemunha
		.AuxTestemunha[] getTestemunhas() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxtestemunha.AuxTestemunha[] _EJS_result =
			null;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					16,
					_EJS_s);
			_EJS_result = beanRef.getTestemunhas();
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
	 * getInvestigacao
	 * @generated
	 */
	public int getInvestigacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.acidente.AcidenteBean beanRef =
				(br.smat.ejb.acidente.AcidenteBean) container.preInvoke(
					this,
					21,
					_EJS_s);
			_EJS_result = beanRef.getInvestigacao();
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
		return _EJS_result;
	}
}
