package br.smat.ejb.dadoinvestigacao;
import br.smat.ejb.agentecausador.AgenteCausadorKey;
import br.smat.ejb.agentesaude.AgenteSaudeKey;
import br.smat.ejb.investigacao.InvestigacaoKey;
import br.smat.ejb.representanteempresa.RepresentanteEmpresaKey;
import br.smat.ejb.testemunha.TestemunhaKey;
import br.smat.ejb.trabalhador.TrabalhadorKey;
import br.smat.ejb.tipodepoimento.TipoDepoimentoKey;
/**
 * Remote interface for Enterprise Bean: DadoInvestigacao
 */
public interface DadoInvestigacao extends javax.ejb.EJBObject {
	/**
	 * Returns the agenteCausador.
	 * @return int
	 */
	public AgenteCausadorKey getAgenteCausador()
		throws java.rmi.RemoteException;
	/**
	 * Returns the agenteSaude.
	 * @return int
	 */
	public AgenteSaudeKey getAgenteSaude() throws java.rmi.RemoteException;
	/**
	 * Returns the dadoInvestigacao.
	 * @return int
	 */
	public int getDadoInvestigacao() throws java.rmi.RemoteException;
	/**
	 * Returns the dataHora.
	 * @return String
	 */
	public String getDataHora() throws java.rmi.RemoteException;
	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() throws java.rmi.RemoteException;
	/**
	 * Returns the investigacao.
	 * @return InvestigacaoKey
	 */
	public InvestigacaoKey getInvestigacao() throws java.rmi.RemoteException;
	/**
	 * Returns the representanteEmpresa.
	 * @return int
	 */
	public RepresentanteEmpresaKey getRepresentanteEmpresa()
		throws java.rmi.RemoteException;
	/**
	 * Returns the testemunha.
	 * @return int
	 */
	public TestemunhaKey getTestemunha() throws java.rmi.RemoteException;
	/**
	 * Returns the trabalhador.
	 * @return int
	 */
	public TrabalhadorKey getTrabalhador() throws java.rmi.RemoteException;
	/**
	 * Sets the agenteCausador.
	 * @param agenteCausador The agenteCausador to set
	 */
	public void setAgenteCausador(AgenteCausadorKey agenteCausador)
		throws java.rmi.RemoteException;
	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(AgenteSaudeKey agenteSaude)
		throws java.rmi.RemoteException;
	/**
	 * Sets the dadoInvestigacao.
	 * @param dadoInvestigacao The dadoInvestigacao to set
	 */
	public void setDadoInvestigacao(int dadoInvestigacao)
		throws java.rmi.RemoteException;
	/**
	 * Sets the dataHora.
	 * @param dataHora The dataHora to set
	 */
	public void setDataHora(String dataHora) throws java.rmi.RemoteException;
	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) throws java.rmi.RemoteException;
	/**
	 * Sets the investigacao.
	 * @param investigacao The investigacao to set
	 */
	public void setInvestigacao(InvestigacaoKey investigacao)
		throws java.rmi.RemoteException;
	/**
	 * Sets the representanteEmpresa.
	 * @param representanteEmpresa The representanteEmpresa to set
	 */
	public void setRepresentanteEmpresa(RepresentanteEmpresaKey representanteEmpresa)
		throws java.rmi.RemoteException;
	/**
	 * Sets the testemunha.
	 * @param testemunha The testemunha to set
	 */
	public void setTestemunha(TestemunhaKey testemunha)
		throws java.rmi.RemoteException;
	/**
	 * Sets the trabalhador.
	 * @param trabalhador The trabalhador to set
	 */
	public void setTrabalhador(TrabalhadorKey trabalhador)
		throws java.rmi.RemoteException;
	/**
	 * Returns the tipoDepoimento.
	 * @return TipoDepoimentoKey
	 */
	public TipoDepoimentoKey getTipoDepoimento()
		throws java.rmi.RemoteException;
	/**
	 * Sets the tipoDepoimento.
	 * @param tipoDepoimento The tipoDepoimento to set
	 */
	public void setTipoDepoimento(TipoDepoimentoKey tipoDepoimento)
		throws java.rmi.RemoteException;
}
