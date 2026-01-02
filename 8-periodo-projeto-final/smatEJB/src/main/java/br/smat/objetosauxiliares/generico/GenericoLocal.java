package br.smat.objetosauxiliares.generico;
import javax.ejb.FinderException;
import br.smat.objetosauxiliares.auxempregador.AuxEmpregador;
import br.smat.relatorio.Relatorio;
import br.smat.objetosauxiliares.auxpesquisaacidente.AuxPesquisaAcidente;
import br.smat.objetosauxiliares.menu.Menu;
import br.smat.objetosauxiliares.auxpontofiscalizacaoramoatividade.AuxPontoFiscalizacaoRamoAtividade;
import br.smat.objetosauxiliares.auxitempontofiscalizacao.AuxItemPontoFiscalizacao;
import br.smat.objetosauxiliares.auxfiscalizacaoempregador.AuxFiscalizacaoEmpregador;
import br.smat.objetosauxiliares.auxinvestigacao.AuxInvestigacao;
import br.smat.objetosauxiliares.auxlistinvestigacao.AuxListInvestigacao;
import br.smat.objetosauxiliares.auxdepoimento.AuxDepoimento;
import br.smat.objetosauxiliares.auxpessoa.AuxPessoa;
import br.smat.objetosauxiliares.auxtestemunha.AuxTestemunha;
import br.smat.objetosauxiliares.auxtramitefiscalizacao.AuxTramiteFiscalizacao;
import br.smat.objetosauxiliares.auxmedidacorretiva.AuxMedidaCorretiva;
import br.smat.objetosauxiliares.auxmonitor.AuxMonitor;
import br.smat.objetosauxiliares.auxagentecausador.AuxAgenteCausador;
import br.smat.objetosauxiliares.auxlocalatendimento.AuxLocalAtendimento;
import br.smat.objetosauxiliares.auxregional.AuxRegional;
import br.smat.objetosauxiliares.auxlocallesao.AuxLocalLesao;
import br.smat.objetosauxiliares.auxramoatividade.AuxRamoAtividade;
/**
 * Local interface for Enterprise Bean: Generico
 */
public interface GenericoLocal extends javax.ejb.EJBLocalObject {
	public AuxEmpregador[] listEmpregadores()
		throws FinderException, Exception;
	public AuxEmpregador[] listEmpregadores(String razaoSocial)
		throws FinderException, Exception;

	public String getDataAtual() throws FinderException, Exception;
	public Relatorio geraRelatorio(
		int periodicidade,
		String dataInicial,
		String dataFinal,
		String agrupamento,
		int local,
		String queryLocal,
		int campo1,
		String queryCampo1,
		int campo2,
		String queryCampo2,
		String titulo,
		String texto)
		throws FinderException, Exception;
	public String getHoraAtual() throws FinderException, Exception;
	public AuxPesquisaAcidente[] pesquisaAcidente(
		int estado,
		int regional,
		int municipio,
		String amputacao,
		String obito,
		String registroPolicial,
		String internacao,
		int tipoAcidente,
		int diagnostico,
		int fonte,
		int area,
		String dataInicial,
		String dataFinal)
		throws FinderException, Exception;
	public Menu[] montaMenu(int usuario) throws FinderException, Exception;
	public AuxPontoFiscalizacaoRamoAtividade[] listPontoFiscalizacaoRamoAtividade(int ramoAtividade)
		throws FinderException, Exception;
	public AuxItemPontoFiscalizacao[] listItemPontoFiscalizacao(int pontoFiscalizacao)
		throws FinderException, Exception;
	public void gravaItemPontoFiscalizacao(
		int pontoFiscalizacao,
		String itensFiscalizacao)
		throws Exception;
	public AuxFiscalizacaoEmpregador[] listAuxFiscalizacaoEmpregadorAgente()
		throws FinderException, Exception;
	public AuxFiscalizacaoEmpregador listAuxFiscalizacaoEmpregadorAgente(int fiscalizacao)
		throws FinderException, Exception;
	public AuxInvestigacao getTramiteInvestigacao(int investigacao)
		throws FinderException, Exception;
	public AuxListInvestigacao[] getAllInvestigacoes()
		throws FinderException, Exception;
	public AuxDepoimento[] getAllDepoimentosInvestigacao(int investigacao)
		throws FinderException, Exception;
	public AuxPessoa[] pesquisarPessoa(
		int tipoDepoimento,
		String nomePessoa,
		int acidente)
		throws FinderException, Exception;
	public AuxTestemunha[] getAllTestemunhasAcidente(int acidente)
		throws FinderException, Exception;
	public AuxItemPontoFiscalizacao[] listItemRoteiroPontoFiscal(
		int tramiteFiscalizacao,
		int fiscalizacao,
		int pontoFiscalizacao)
		throws FinderException, Exception;
	public AuxItemPontoFiscalizacao[] listItensRoteiro(int fiscalizacao)
		throws FinderException, Exception;
	public AuxItemPontoFiscalizacao[] listItensRoteiro(
		int fiscalizacao,
		int tramiteFiscalizacao)
		throws FinderException, Exception;
	public AuxItemPontoFiscalizacao[] listDetalhesItensRoteiro(
		int fiscalizacao,
		int tramiteFiscalizacao)
		throws FinderException, Exception;
	public AuxTramiteFiscalizacao[] listTramitesFiscalizacao(int fiscalizacao)
		throws FinderException, Exception;
	public AuxMedidaCorretiva[] listAllMedidaCorretivaFiscalizacao(
		int fiscalizacao,
		int tramite)
		throws FinderException, Exception;
	public AuxMonitor[] listAllMonitor() throws FinderException, Exception;
	public AuxMedidaCorretiva[] getAllMedidasCorretivasInvestigacao(int investigacao)
		throws FinderException, Exception;
	public AuxAgenteCausador[] getAllAgentesCausadores()
		throws FinderException, Exception;
	public AuxLocalAtendimento[] getAllLocaisAtendimento()
		throws FinderException, Exception;
	public AuxRegional[] getAllRegionais() throws FinderException, Exception;
	public AuxLocalLesao[] listAlllocaisLesao()
		throws FinderException, Exception;
	public AuxRamoAtividade[] listAllRamoAtividade()
		throws FinderException, Exception;
}
