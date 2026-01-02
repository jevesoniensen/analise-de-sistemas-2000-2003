package br.smat.ejb.investigacao;
import br.smat.ejb.acidente.AcidenteKey;
import br.smat.ejb.agentesaude.AgenteSaudeKey;
/**
 * Local interface for Enterprise Bean: Investigacao
 */
public interface InvestigacaoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the acidente.
	 * @return AcidenteKey
	 */
	public AcidenteKey getAcidente();
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
	 * Returns the fiscalizacao.
	 * @return int
	 */
	public int getInvestigacao();
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
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(AcidenteKey acidente);
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
	 * Sets the obsGerais.
	 * @param obsGerais The obsGerais to set
	 */
	public void setObsGerais(String obsGerais);
	/**
	 * Sets the titulo.
	 * @param titulo The titulo to set
	 */
	public void setTitulo(String titulo);
	public void finalizar();
}
