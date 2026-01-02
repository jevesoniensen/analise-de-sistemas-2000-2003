package br.smat.ejb.diagnostico;
/**
 * Key class for Entity Bean: Diagnostico
 */
public class DiagnosticoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;

	public int diagnostico;
	
	/**
	 * Creates an empty key for Entity Bean: Diagnostico
	 */
	public DiagnosticoKey() {
	}
	

	public DiagnosticoKey(int diagnostico){
		this.diagnostico = diagnostico;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof DiagnosticoKey) {
			DiagnosticoKey o =
				(DiagnosticoKey) otherKey;
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
