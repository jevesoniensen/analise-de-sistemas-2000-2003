package br.smat.controleacesso.ejb.usuario;
import br.smat.ejb.agentesaude.AgenteSaudeKey;
/**
 * Local interface for Enterprise Bean: Usuario
 */
public interface UsuarioLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the agenteSaude.
	 * @return AgenteSaudeKey
	 */
	public AgenteSaudeKey getAgenteSaude();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the senha.
	 * @return String
	 */
	public String getSenha();
	/**
	 * Returns the usuario.
	 * @return int
	 */
	public int getUsuario();
	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(AgenteSaudeKey agenteSaude);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the senha.
	 * @param senha The senha to set
	 */
	public void setSenha(String senha);
}
