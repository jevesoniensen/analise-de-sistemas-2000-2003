package br.smat.ejb.investigacao;
/**
 * Key class for Entity Bean: Investigacao
 */
public class InvestigacaoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int investigacao;
	
	/**
	 * Creates an empty key for Entity Bean: Investigacao
	 */
	public InvestigacaoKey() {
	}

	public InvestigacaoKey(int investigacao) {
		this.investigacao = investigacao;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.investigacao.InvestigacaoKey) {
			br.smat.ejb.investigacao.InvestigacaoKey o =
				(br.smat.ejb.investigacao.InvestigacaoKey) otherKey;
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
