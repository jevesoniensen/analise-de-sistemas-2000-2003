package br.smat.AgenteSaude;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AgenteSaude {

	private int 	agenteSaude;
	private String	nome;
	private String email;	
	
	private AgenteSaudeFactory agenteSaudeFactory;

	/**
	 * Constructor for AgenteSaude.
	 */
	public AgenteSaude(AgenteSaudeFactory agenteSaudeFactory,int agenteSaude,String nome,String email) {
		super();
		this.agenteSaude 			= agenteSaude;
		this.nome				 	= nome;
		this.email				 	= email;
		this.agenteSaudeFactory 	= agenteSaudeFactory;
	}

	/**
	 * Returns the agenteSaude.
	 * @return int
	 */
	public int getAgenteSaude() {
		return agenteSaude;
	}

	/**
	 * Returns the email.
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(int agenteSaude) {
		this.agenteSaude = agenteSaude;
	}

	/**
	 * Sets the email.
	 * @param email The email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

}
