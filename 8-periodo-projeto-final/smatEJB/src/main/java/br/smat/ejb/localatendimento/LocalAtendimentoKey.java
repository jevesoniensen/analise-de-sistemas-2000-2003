package br.smat.ejb.localatendimento;
/**
 * Key class for Entity Bean: LocalAtendimento
 */
public class LocalAtendimentoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int localAtendimento;
	
	/**
	 * Creates an empty key for Entity Bean: LocalAtendimento
	 */
	public LocalAtendimentoKey() {
	}

	public LocalAtendimentoKey(int localAtendimento){
		this.localAtendimento = localAtendimento;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.ejb.localatendimento.LocalAtendimentoKey) {
			br.smat.ejb.localatendimento.LocalAtendimentoKey o =
				(br.smat.ejb.localatendimento.LocalAtendimentoKey) otherKey;
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
