package br.smat.ejb.dadoinvestigacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPDadoInvestigacao_2a51dca9
 * @generated
 */
public class EJSLocalBMPDadoInvestigacao_2a51dca9
	extends EJSLocalWrapper
	implements br.smat.ejb.dadoinvestigacao.DadoInvestigacaoLocal {
	/**
	 * EJSLocalBMPDadoInvestigacao_2a51dca9
	 * @generated
	 */
	public EJSLocalBMPDadoInvestigacao_2a51dca9() {
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
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
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
	 * getAgenteSaude
	 * @generated
	 */
	public br.smat.ejb.agentesaude.AgenteSaudeKey getAgenteSaude() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.agentesaude.AgenteSaudeKey _EJS_result = null;
		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
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
	public br.smat.ejb.investigacao.InvestigacaoKey getInvestigacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.investigacao.InvestigacaoKey _EJS_result = null;
		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
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
	 * getRepresentanteEmpresa
	 * @generated
	 */
	public br
		.smat
		.ejb
		.representanteempresa
		.RepresentanteEmpresaKey getRepresentanteEmpresa() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.representanteempresa.RepresentanteEmpresaKey _EJS_result =
			null;
		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getRepresentanteEmpresa();
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
	 * getTestemunha
	 * @generated
	 */
	public br.smat.ejb.testemunha.TestemunhaKey getTestemunha() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.testemunha.TestemunhaKey _EJS_result = null;
		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = beanRef.getTestemunha();
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
	 * getTipoDepoimento
	 * @generated
	 */
	public br.smat.ejb.tipodepoimento.TipoDepoimentoKey getTipoDepoimento() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipodepoimento.TipoDepoimentoKey _EJS_result = null;
		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getTipoDepoimento();
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
	 * getTrabalhador
	 * @generated
	 */
	public br.smat.ejb.trabalhador.TrabalhadorKey getTrabalhador() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.trabalhador.TrabalhadorKey _EJS_result = null;
		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			_EJS_result = beanRef.getTrabalhador();
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
	 * getDadoInvestigacao
	 * @generated
	 */
	public int getDadoInvestigacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					7,
					_EJS_s);
			_EJS_result = beanRef.getDadoInvestigacao();
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
	 * getDataHora
	 * @generated
	 */
	public java.lang.String getDataHora() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					8,
					_EJS_s);
			_EJS_result = beanRef.getDataHora();
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
	 * getDescricao
	 * @generated
	 */
	public java.lang.String getDescricao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					9,
					_EJS_s);
			_EJS_result = beanRef.getDescricao();
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
	 * setAgenteCausador
	 * @generated
	 */
	public void setAgenteCausador(
		br.smat.ejb.agentecausador.AgenteCausadorKey agenteCausador) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					10,
					_EJS_s);
			beanRef.setAgenteCausador(agenteCausador);
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
	 * setAgenteSaude
	 * @generated
	 */
	public void setAgenteSaude(
		br.smat.ejb.agentesaude.AgenteSaudeKey agenteSaude) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					11,
					_EJS_s);
			beanRef.setAgenteSaude(agenteSaude);
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
	 * setDadoInvestigacao
	 * @generated
	 */
	public void setDadoInvestigacao(int dadoInvestigacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					12,
					_EJS_s);
			beanRef.setDadoInvestigacao(dadoInvestigacao);
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
	 * setDataHora
	 * @generated
	 */
	public void setDataHora(java.lang.String dataHora) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					13,
					_EJS_s);
			beanRef.setDataHora(dataHora);
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
	 * setDescricao
	 * @generated
	 */
	public void setDescricao(java.lang.String descricao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					14,
					_EJS_s);
			beanRef.setDescricao(descricao);
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
	 * setInvestigacao
	 * @generated
	 */
	public void setInvestigacao(
		br.smat.ejb.investigacao.InvestigacaoKey investigacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					15,
					_EJS_s);
			beanRef.setInvestigacao(investigacao);
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
	 * setRepresentanteEmpresa
	 * @generated
	 */
	public void setRepresentanteEmpresa(
		br
			.smat
			.ejb
			.representanteempresa
			.RepresentanteEmpresaKey representanteEmpresa) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					16,
					_EJS_s);
			beanRef.setRepresentanteEmpresa(representanteEmpresa);
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
	 * setTestemunha
	 * @generated
	 */
	public void setTestemunha(
		br.smat.ejb.testemunha.TestemunhaKey testemunha) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					17,
					_EJS_s);
			beanRef.setTestemunha(testemunha);
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
	 * setTipoDepoimento
	 * @generated
	 */
	public void setTipoDepoimento(
		br.smat.ejb.tipodepoimento.TipoDepoimentoKey tipoDepoimento) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					18,
					_EJS_s);
			beanRef.setTipoDepoimento(tipoDepoimento);
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
	 * setTrabalhador
	 * @generated
	 */
	public void setTrabalhador(
		br.smat.ejb.trabalhador.TrabalhadorKey trabalhador) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.dadoinvestigacao
						.DadoInvestigacaoBean) container
						.preInvoke(
					this,
					19,
					_EJS_s);
			beanRef.setTrabalhador(trabalhador);
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
}
