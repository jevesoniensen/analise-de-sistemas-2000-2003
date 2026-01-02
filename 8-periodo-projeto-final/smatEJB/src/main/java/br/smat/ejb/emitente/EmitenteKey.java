package br.smat.ejb.emitente;
/**
 * Key class for Entity Bean: Emitente
 */
public class EmitenteKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int emitente;
	
	/**
	 * Creates an empty key for Entity Bean: Emitente
	 */
	public EmitenteKey() {
	}
	
	public EmitenteKey(int emitente){
		this.emitente = emitente;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.emitente.EmitenteKey) {
			br.smat.ejb.emitente.EmitenteKey o =
				(br.smat.ejb.emitente.EmitenteKey) otherKey;
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
