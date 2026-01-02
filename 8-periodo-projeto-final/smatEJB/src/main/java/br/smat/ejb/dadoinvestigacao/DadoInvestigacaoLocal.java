package br.smat.ejb.dadoinvestigacao;
import br.smat.ejb.agentecausador.AgenteCausadorKey;
import br.smat.ejb.agentesaude.AgenteSaudeKey;
import br.smat.ejb.investigacao.InvestigacaoKey;
import br.smat.ejb.representanteempresa.RepresentanteEmpresaKey;
import br.smat.ejb.testemunha.TestemunhaKey;
import br.smat.ejb.trabalhador.TrabalhadorKey;
import br.smat.ejb.tipodepoimento.TipoDepoimentoKey;
/**
 * Local interface for Enterprise Bean: DadoInvestigacao
 */
public interface DadoInvestigacaoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the agenteCausador.
	 * @return int
	 */
	public AgenteCausadorKey getAgenteCausador();
	/**
	 * Returns the agenteSaude.
	 * @return int
	 */
	public AgenteSaudeKey getAgenteSaude();
	/**
	 * Returns the dadoInvestigacao.
	 * @return int
	 */
	public int getDadoInvestigacao();
	/**
	 * Returns the dataHora.
	 * @return String
	 */
	public String getDataHora();
	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao();
	/**
	 * Returns the investigacao.
	 * @return InvestigacaoKey
	 */
	public InvestigacaoKey getInvestigacao();
	/**
	 * Returns the representanteEmpresa.
	 * @return int
	 */
	public RepresentanteEmpresaKey getRepresentanteEmpresa();
	/**
	 * Returns the testemunha.
	 * @return int
	 */
	public TestemunhaKey getTestemunha();
	/**
	 * Returns the trabalhador.
	 * @return int
	 */
	public TrabalhadorKey getTrabalhador();
	/**
	 * Sets the agenteCausador.
	 * @param agenteCausador The agenteCausador to set
	 */
	public void setAgenteCausador(AgenteCausadorKey agenteCausador);
	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(AgenteSaudeKey agenteSaude);
	/**
	 * Sets the dadoInvestigacao.
	 * @param dadoInvestigacao The dadoInvestigacao to set
	 */
	public void setDadoInvestigacao(int dadoInvestigacao);
	/**
	 * Sets the dataHora.
	 * @param dataHora The dataHora to set
	 */
	public void setDataHora(String dataHora);
	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao);
	/**
	 * Sets the investigacao.
	 * @param investigacao The investigacao to set
	 */
	public void setInvestigacao(InvestigacaoKey investigacao);
	/**
	 * Sets the representanteEmpresa.
	 * @param representanteEmpresa The representanteEmpresa to set
	 */
	public void setRepresentanteEmpresa(RepresentanteEmpresaKey representanteEmpresa);
	/**
	 * Sets the testemunha.
	 * @param testemunha The testemunha to set
	 */
	public void setTestemunha(TestemunhaKey testemunha);
	/**
	 * Sets the trabalhador.
	 * @param trabalhador The trabalhador to set
	 */
	public void setTrabalhador(TrabalhadorKey trabalhador);
	/**
	 * Returns the tipoDepoimento.
	 * @return TipoDepoimentoKey
	 */
	public TipoDepoimentoKey getTipoDepoimento();
	/**
	 * Sets the tipoDepoimento.
	 * @param tipoDepoimento The tipoDepoimento to set
	 */
	public void setTipoDepoimento(TipoDepoimentoKey tipoDepoimento);
}
