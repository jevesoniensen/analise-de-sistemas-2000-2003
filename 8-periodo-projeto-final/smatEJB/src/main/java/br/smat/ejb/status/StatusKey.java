package br.smat.ejb.status;
/**
 * Key class for Entity Bean: Status
 */
public class StatusKey implements java.io.Serializable {
	
	static final long serialVersionUID = 3206093459760846163L;
	
	public int status;
	
	/**
	 * Creates an empty key for Entity Bean: Status
	 */
	public StatusKey() {
	}
	
	public StatusKey(int status){
		this.status = status;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.status.StatusKey) {
			br.smat.ejb.status.StatusKey o =
				(br.smat.ejb.status.StatusKey) otherKey;
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
