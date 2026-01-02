package br.smat.ejb.area;
/**
 * Key class for Entity Bean: Area
 */
public class AreaKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int area;
	
	/**
	 * Creates an empty key for Entity Bean: Area
	 */
	public AreaKey() {
	}

	public AreaKey(int area){
		this.area = area;
	}	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.area.AreaKey) {
			br.smat.ejb.area.AreaKey o = (br.smat.ejb.area.AreaKey) otherKey;
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
