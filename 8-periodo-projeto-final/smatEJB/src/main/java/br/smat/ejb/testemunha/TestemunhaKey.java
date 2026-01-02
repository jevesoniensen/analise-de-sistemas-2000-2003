package br.smat.ejb.testemunha;
/**
 * Key class for Entity Bean: Testemunha
 */
public class TestemunhaKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int testemunha;
	
	/**
	 * Creates an empty key for Entity Bean: Testemunha
	 */
	public TestemunhaKey() {
	}

	public TestemunhaKey(int testemunha) {
		this.testemunha = testemunha;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.testemunha.TestemunhaKey) {
			br.smat.ejb.testemunha.TestemunhaKey o =
				(br.smat.ejb.testemunha.TestemunhaKey) otherKey;
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
