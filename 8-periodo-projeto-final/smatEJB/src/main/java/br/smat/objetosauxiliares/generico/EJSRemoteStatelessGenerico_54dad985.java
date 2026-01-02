package br.smat.objetosauxiliares.generico;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteStatelessGenerico_54dad985
 * @generated
 */
public class EJSRemoteStatelessGenerico_54dad985
	extends EJSWrapper
	implements Generico {
	/**
	 * EJSRemoteStatelessGenerico_54dad985
	 * @generated
	 */
	public EJSRemoteStatelessGenerico_54dad985()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * listEmpregadores
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxempregador
		.AuxEmpregador[] listEmpregadores()
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxempregador.AuxEmpregador[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.listEmpregadores();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * listEmpregadores
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxempregador
		.AuxEmpregador[] listEmpregadores(
		java.lang.String razaoSocial)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxempregador.AuxEmpregador[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.listEmpregadores(razaoSocial);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * getDataAtual
	 * @generated
	 */
	public java.lang.String getDataAtual()
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					27,
					_EJS_s);
			_EJS_result = beanRef.getDataAtual();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 27, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * geraRelatorio
	 * @generated
	 */
	public br.smat.relatorio.Relatorio geraRelatorio(
		int periodicidade,
		java.lang.String dataInicial,
		java.lang.String dataFinal,
		java.lang.String agrupamento,
		int local,
		java.lang.String queryLocal,
		int campo1,
		java.lang.String queryCampo1,
		int campo2,
		java.lang.String queryCampo2,
		java.lang.String titulo,
		java.lang.String texto)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.relatorio.Relatorio _EJS_result = null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					26,
					_EJS_s);
			_EJS_result =
				beanRef.geraRelatorio(
					periodicidade,
					dataInicial,
					dataFinal,
					agrupamento,
					local,
					queryLocal,
					campo1,
					queryCampo1,
					campo2,
					queryCampo2,
					titulo,
					texto);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 26, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getHoraAtual
	 * @generated
	 */
	public java.lang.String getHoraAtual()
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					28,
					_EJS_s);
			_EJS_result = beanRef.getHoraAtual();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 28, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * pesquisaAcidente
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxpesquisaacidente
		.AuxPesquisaAcidente[] pesquisaAcidente(
			int estado,
			int regional,
			int municipio,
			java.lang.String amputacao,
			java.lang.String obito,
			java.lang.String registroPolicial,
			java.lang.String internacao,
			int tipoAcidente,
			int diagnostico,
			int fonte,
			int area,
			java.lang.String dataInicial,
			java.lang.String dataFinal)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxpesquisaacidente
			.AuxPesquisaAcidente[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					18,
					_EJS_s);
			_EJS_result =
				beanRef.pesquisaAcidente(
					estado,
					regional,
					municipio,
					amputacao,
					obito,
					registroPolicial,
					internacao,
					tipoAcidente,
					diagnostico,
					fonte,
					area,
					dataInicial,
					dataFinal);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 18, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * montaMenu
	 * @generated
	 */
	public br.smat.objetosauxiliares.menu.Menu[] montaMenu(int usuario)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.menu.Menu[] _EJS_result = null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					25,
					_EJS_s);
			_EJS_result = beanRef.montaMenu(usuario);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 25, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * listAuxFiscalizacaoEmpregadorAgente
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxfiscalizacaoempregador
		.AuxFiscalizacaoEmpregador listAuxFiscalizacaoEmpregadorAgente(int fiscalizacao)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxfiscalizacaoempregador
			.AuxFiscalizacaoEmpregador _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result =
				beanRef.listAuxFiscalizacaoEmpregadorAgente(fiscalizacao);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * listAuxFiscalizacaoEmpregadorAgente
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxfiscalizacaoempregador
		.AuxFiscalizacaoEmpregador[] listAuxFiscalizacaoEmpregadorAgente()
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxfiscalizacaoempregador
			.AuxFiscalizacaoEmpregador[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.listAuxFiscalizacaoEmpregadorAgente();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * listItemPontoFiscalizacao
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxitempontofiscalizacao
		.AuxItemPontoFiscalizacao[] listItemPontoFiscalizacao(int pontoFiscalizacao)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxitempontofiscalizacao
			.AuxItemPontoFiscalizacao[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					8,
					_EJS_s);
			_EJS_result = beanRef.listItemPontoFiscalizacao(pontoFiscalizacao);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 8, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * listPontoFiscalizacaoRamoAtividade
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxpontofiscalizacaoramoatividade
		.AuxPontoFiscalizacaoRamoAtividade[] listPontoFiscalizacaoRamoAtividade(int ramoAtividade)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxpontofiscalizacaoramoatividade
			.AuxPontoFiscalizacaoRamoAtividade[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					20,
					_EJS_s);
			_EJS_result =
				beanRef.listPontoFiscalizacaoRamoAtividade(ramoAtividade);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 20, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * gravaItemPontoFiscalizacao
	 * @generated
	 */
	public void gravaItemPontoFiscalizacao(
		int pontoFiscalizacao,
		java.lang.String itensFiscalizacao)
		throws java.lang.Exception, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					29,
					_EJS_s);
			beanRef.gravaItemPontoFiscalizacao(
				pontoFiscalizacao,
				itensFiscalizacao);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 29, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * getTramiteInvestigacao
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxinvestigacao
		.AuxInvestigacao getTramiteInvestigacao(int investigacao)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxinvestigacao.AuxInvestigacao _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			_EJS_result = beanRef.getTramiteInvestigacao(investigacao);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * getAllInvestigacoes
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxlistinvestigacao
		.AuxListInvestigacao[] getAllInvestigacoes()
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxlistinvestigacao
			.AuxListInvestigacao[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					12,
					_EJS_s);
			_EJS_result = beanRef.getAllInvestigacoes();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 12, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * pesquisarPessoa
	 * @generated
	 */
	public br.smat.objetosauxiliares.auxpessoa.AuxPessoa[] pesquisarPessoa(
		int tipoDepoimento,
		java.lang.String nomePessoa,
		int acidente)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxpessoa.AuxPessoa[] _EJS_result = null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					19,
					_EJS_s);
			_EJS_result =
				beanRef.pesquisarPessoa(tipoDepoimento, nomePessoa, acidente);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 19, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getAllDepoimentosInvestigacao
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxdepoimento
		.AuxDepoimento[] getAllDepoimentosInvestigacao(int investigacao)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxdepoimento.AuxDepoimento[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getAllDepoimentosInvestigacao(investigacao);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * getAllTestemunhasAcidente
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxtestemunha
		.AuxTestemunha[] getAllTestemunhasAcidente(int acidente)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxtestemunha.AuxTestemunha[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					23,
					_EJS_s);
			_EJS_result = beanRef.getAllTestemunhasAcidente(acidente);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 23, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * listAllMonitor
	 * @generated
	 */
	public br.smat.objetosauxiliares.auxmonitor.AuxMonitor[] listAllMonitor()
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxmonitor.AuxMonitor[] _EJS_result = null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					17,
					_EJS_s);
			_EJS_result = beanRef.listAllMonitor();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 17, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * listTramitesFiscalizacao
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxtramitefiscalizacao
		.AuxTramiteFiscalizacao[] listTramitesFiscalizacao(int fiscalizacao)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxtramitefiscalizacao
			.AuxTramiteFiscalizacao[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					24,
					_EJS_s);
			_EJS_result = beanRef.listTramitesFiscalizacao(fiscalizacao);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 24, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * listDetalhesItensRoteiro
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxitempontofiscalizacao
		.AuxItemPontoFiscalizacao[] listDetalhesItensRoteiro(
			int fiscalizacao,
			int tramiteFiscalizacao)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxitempontofiscalizacao
			.AuxItemPontoFiscalizacao[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					7,
					_EJS_s);
			_EJS_result =
				beanRef.listDetalhesItensRoteiro(
					fiscalizacao,
					tramiteFiscalizacao);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 7, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * listItemRoteiroPontoFiscal
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxitempontofiscalizacao
		.AuxItemPontoFiscalizacao[] listItemRoteiroPontoFiscal(
			int tramiteFiscalizacao,
			int fiscalizacao,
			int pontoFiscalizacao)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxitempontofiscalizacao
			.AuxItemPontoFiscalizacao[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					9,
					_EJS_s);
			_EJS_result =
				beanRef.listItemRoteiroPontoFiscal(
					tramiteFiscalizacao,
					fiscalizacao,
					pontoFiscalizacao);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 9, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * listItensRoteiro
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxitempontofiscalizacao
		.AuxItemPontoFiscalizacao[] listItensRoteiro(int fiscalizacao)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxitempontofiscalizacao
			.AuxItemPontoFiscalizacao[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					10,
					_EJS_s);
			_EJS_result = beanRef.listItensRoteiro(fiscalizacao);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 10, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * listItensRoteiro
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxitempontofiscalizacao
		.AuxItemPontoFiscalizacao[] listItensRoteiro(
			int fiscalizacao,
			int tramiteFiscalizacao)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxitempontofiscalizacao
			.AuxItemPontoFiscalizacao[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					11,
					_EJS_s);
			_EJS_result =
				beanRef.listItensRoteiro(fiscalizacao, tramiteFiscalizacao);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 11, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * listAllMedidaCorretivaFiscalizacao
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxmedidacorretiva
		.AuxMedidaCorretiva[] listAllMedidaCorretivaFiscalizacao(
			int fiscalizacao,
			int tramite)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxmedidacorretiva
			.AuxMedidaCorretiva[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					16,
					_EJS_s);
			_EJS_result =
				beanRef.listAllMedidaCorretivaFiscalizacao(
					fiscalizacao,
					tramite);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 16, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getAllMedidasCorretivasInvestigacao
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxmedidacorretiva
		.AuxMedidaCorretiva[] getAllMedidasCorretivasInvestigacao(int investigacao)
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxmedidacorretiva
			.AuxMedidaCorretiva[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					15,
					_EJS_s);
			_EJS_result =
				beanRef.getAllMedidasCorretivasInvestigacao(investigacao);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 15, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getAllAgentesCausadores
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxagentecausador
		.AuxAgenteCausador[] getAllAgentesCausadores()
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxagentecausador
			.AuxAgenteCausador[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getAllAgentesCausadores();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * getAllLocaisAtendimento
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxlocalatendimento
		.AuxLocalAtendimento[] getAllLocaisAtendimento()
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxlocalatendimento
			.AuxLocalAtendimento[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					13,
					_EJS_s);
			_EJS_result = beanRef.getAllLocaisAtendimento();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 13, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getAllRegionais
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxregional
		.AuxRegional[] getAllRegionais()
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxregional.AuxRegional[] _EJS_result = null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					22,
					_EJS_s);
			_EJS_result = beanRef.getAllRegionais();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 22, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * listAlllocaisLesao
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxlocallesao
		.AuxLocalLesao[] listAlllocaisLesao()
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.objetosauxiliares.auxlocallesao.AuxLocalLesao[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					14,
					_EJS_s);
			_EJS_result = beanRef.listAlllocaisLesao();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 14, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * listAllRamoAtividade
	 * @generated
	 */
	public br
		.smat
		.objetosauxiliares
		.auxramoatividade
		.AuxRamoAtividade[] listAllRamoAtividade()
		throws
			javax.ejb.FinderException,
			java.lang.Exception,
			java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br
			.smat
			.objetosauxiliares
			.auxramoatividade
			.AuxRamoAtividade[] _EJS_result =
			null;
		try {
			br.smat.objetosauxiliares.generico.GenericoBean beanRef =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoBean) container
						.preInvoke(
					this,
					21,
					_EJS_s);
			_EJS_result = beanRef.listAllRamoAtividade();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.RuntimeException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (java.lang.Exception ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 21, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
}
