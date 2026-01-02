package br.smat.ejb.agentesaude;
import br.smat.ejb.regional.RegionalKey;
/**
 * Local interface for Enterprise Bean: AgenteSaude
 */
public interface AgenteSaudeLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the agenteSaude.
	 * @return int
	 */
	public int getAgenteSaude();
	/**
	 * Returns the email.
	 * @return String
	 */
	public String getEmail();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the regional.
	 * @return RegionalKey
	 */
	public RegionalKey getRegional();
	/**
	 * Sets the email.
	 * @param email The email to set
	 */
	public void setEmail(String email);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(RegionalKey regional);
}
