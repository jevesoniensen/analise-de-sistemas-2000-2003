package br.smat.ejb.investigacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPInvestigacao_50a64b27
 * @generated
 */
public class EJSLocalBMPInvestigacao_50a64b27
	extends EJSLocalWrapper
	implements br.smat.ejb.investigacao.InvestigacaoLocal {
	/**
	 * EJSLocalBMPInvestigacao_50a64b27
	 * @generated
	 */
	public EJSLocalBMPInvestigacao_50a64b27() {
		super();
	}
	/**
	 * getAcidente
	 * @generated
	 */
	public br.smat.ejb.acidente.AcidenteKey getAcidente() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.acidente.AcidenteKey _EJS_result = null;
		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getAcidente();
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
	 * getAgenteSaude
	 * @generated
	 */
	public br.smat.ejb.agentesaude.AgenteSaudeKey getAgenteSaude() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.agentesaude.AgenteSaudeKey _EJS_result = null;
		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getAgenteSaude();
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
	 * getInvestigacao
	 * @generated
	 */
	public int getInvestigacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getInvestigacao();
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
	 * getDataAbertura
	 * @generated
	 */
	public java.lang.String getDataAbertura() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getDataAbertura();
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
	 * getDataFinalizacao
	 * @generated
	 */
	public java.lang.String getDataFinalizacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = beanRef.getDataFinalizacao();
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
	 * getObsGerais
	 * @generated
	 */
	public java.lang.String getObsGerais() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getObsGerais();
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
	 * getTitulo
	 * @generated
	 */
	public java.lang.String getTitulo() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			_EJS_result = beanRef.getTitulo();
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
	 * setAcidente
	 * @generated
	 */
	public void setAcidente(br.smat.ejb.acidente.AcidenteKey acidente) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					8,
					_EJS_s);
			beanRef.setAcidente(acidente);
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
	 * setAgenteSaude
	 * @generated
	 */
	public void setAgenteSaude(
		br.smat.ejb.agentesaude.AgenteSaudeKey agenteSaude) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					9,
					_EJS_s);
			beanRef.setAgenteSaude(agenteSaude);
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
	 * setDataAbertura
	 * @generated
	 */
	public void setDataAbertura(java.lang.String dataAbertura) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					10,
					_EJS_s);
			beanRef.setDataAbertura(dataAbertura);
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
	 * setDataFinalizacao
	 * @generated
	 */
	public void setDataFinalizacao(java.lang.String dataFinalizacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					11,
					_EJS_s);
			beanRef.setDataFinalizacao(dataFinalizacao);
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
	 * setObsGerais
	 * @generated
	 */
	public void setObsGerais(java.lang.String obsGerais) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					12,
					_EJS_s);
			beanRef.setObsGerais(obsGerais);
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
	 * setTitulo
	 * @generated
	 */
	public void setTitulo(java.lang.String titulo) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					13,
					_EJS_s);
			beanRef.setTitulo(titulo);
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
		return;
	}
	/**
	 * finalizar
	 * @generated
	 */
	public void finalizar() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.investigacao.InvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.InvestigacaoBean) container
						.preInvoke(
					this,
					7,
					_EJS_s);
			beanRef.finalizar();
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
}
