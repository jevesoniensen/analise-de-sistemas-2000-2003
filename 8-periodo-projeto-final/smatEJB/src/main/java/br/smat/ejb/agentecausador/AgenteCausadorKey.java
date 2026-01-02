package br.smat.ejb.agentecausador;
/**
 * Key class for Entity Bean: AgenteCausador
 */
public class AgenteCausadorKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int agenteCausador;
	
	/**
	 * Creates an empty key for Entity Bean: AgenteCausador
	 */
	public AgenteCausadorKey() {
	}
	
	public AgenteCausadorKey(int agenteCausador) {
		this.agenteCausador = agenteCausador;
	}	
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.agentecausador.AgenteCausadorKey) {
			br.smat.ejb.agentecausador.AgenteCausadorKey o =
				(br.smat.ejb.agentecausador.AgenteCausadorKey) otherKey;
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
