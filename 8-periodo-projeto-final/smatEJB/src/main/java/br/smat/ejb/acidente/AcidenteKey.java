package br.smat.ejb.acidente;
/**
 * Key class for Entity Bean: Acidente
 */
public class AcidenteKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int acidente;
	
	/**
	 * Creates an empty key for Entity Bean: Acidente
	 */
	public AcidenteKey() {
	}

	public AcidenteKey(int acidente){
		this.acidente = acidente;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.acidente.AcidenteKey) {
			br.smat.ejb.acidente.AcidenteKey o =
				(br.smat.ejb.acidente.AcidenteKey) otherKey;
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
