package br.smat.ejb.agentesaude;
/**
 * Key class for Entity Bean: AgenteSaude
 */
public class AgenteSaudeKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;

	public int agenteSaude;
	
	/**
	 * Creates an empty key for Entity Bean: AgenteSaude
	 */
	public AgenteSaudeKey() {
	}

	public AgenteSaudeKey(int agenteSaude) {
		this.agenteSaude = agenteSaude;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.agentesaude.AgenteSaudeKey) {
			br.smat.ejb.agentesaude.AgenteSaudeKey o =
				(br.smat.ejb.agentesaude.AgenteSaudeKey) otherKey;
			return (super.equals(otherKey));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (super.hashCode());
	}
}
