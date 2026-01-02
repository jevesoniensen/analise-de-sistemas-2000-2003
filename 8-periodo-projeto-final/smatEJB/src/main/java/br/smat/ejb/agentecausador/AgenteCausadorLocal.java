package br.smat.ejb.agentecausador;
import br.smat.ejb.agentecausador.AgenteCausadorKey;
/**
 * Local interface for Enterprise Bean: AgenteCausador
 */
public interface AgenteCausadorLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the agenteCausador.
	 * @return int
	 */
	public int getAgenteCausador();
	/**
	 * Returns the agenteCausadorPai.
	 * @return AgenteCausadorKey
	 */
	public AgenteCausadorKey getAgenteCausadorPai();
	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Sets the agenteCausadorPai.
	 * @param agenteCausadorPai The agenteCausadorPai to set
	 */
	public void setAgenteCausadorPai(AgenteCausadorKey agenteCausadorPai);
	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
}
