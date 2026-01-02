package br.smat.ejb.regional;
/**
 * Key class for Entity Bean: Regional
 */
public class RegionalKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int regional;
	
	/**
	 * Creates an empty key for Entity Bean: Regional
	 */
	public RegionalKey() {
	}
	
	public RegionalKey(int regional) {
		this.regional = regional;
	}	
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.regional.RegionalKey) {
			br.smat.ejb.regional.RegionalKey o =
				(br.smat.ejb.regional.RegionalKey) otherKey;
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
