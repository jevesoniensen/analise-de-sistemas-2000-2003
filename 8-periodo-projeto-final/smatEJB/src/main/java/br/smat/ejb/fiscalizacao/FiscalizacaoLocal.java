package br.smat.ejb.fiscalizacao;
import br.smat.ejb.agentesaude.AgenteSaudeKey;
import br.smat.ejb.empregador.EmpregadorKey;
/**
 * Local interface for Enterprise Bean: Fiscalizacao
 */
public interface FiscalizacaoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the agenteSaude.
	 * @return AgenteSaudeKey
	 */
	public AgenteSaudeKey getAgenteSaude();
	/**
	 * Returns the dataAbertura.
	 * @return String
	 */
	public String getDataAbertura();
	/**
	 * Returns the dataFinalizacao.
	 * @return String
	 */
	public String getDataFinalizacao();
	/**
	 * Returns the empregador.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregador();
	/**
	 * Returns the fiscalizacao.
	 * @return int
	 */
	public int getFiscalizacao();
	/**
	 * Returns the obsGerais.
	 * @return String
	 */
	public String getObsGerais();
	/**
	 * Returns the titulo.
	 * @return String
	 */
	public String getTitulo();
	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(AgenteSaudeKey agenteSaude);
	/**
	 * Sets the dataAbertura.
	 * @param dataAbertura The dataAbertura to set
	 */
	public void setDataAbertura(String dataAbertura);
	/**
	 * Sets the dataFinalizacao.
	 * @param dataFinalizacao The dataFinalizacao to set
	 */
	public void setDataFinalizacao(String dataFinalizacao);
	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(EmpregadorKey empregador);
	/**
	 * Sets the obsGerais.
	 * @param obsGerais The obsGerais to set
	 */
	public void setObsGerais(String obsGerais);
	/**
	 * Sets the titulo.
	 * @param titulo The titulo to set
	 */
	public void setTitulo(String titulo);
}
