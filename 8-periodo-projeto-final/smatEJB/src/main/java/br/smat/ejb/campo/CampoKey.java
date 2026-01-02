package br.smat.ejb.campo;
/**
 * Key class for Entity Bean: Campo
 */
public class CampoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int campo;
	
	/**
	 * Creates an empty key for Entity Bean: Campo
	 */
	public CampoKey() {
	}

	public CampoKey(int campo){
		this.campo = campo;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.campo.CampoKey) {
			br.smat.ejb.campo.CampoKey o =
				(br.smat.ejb.campo.CampoKey) otherKey;
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
