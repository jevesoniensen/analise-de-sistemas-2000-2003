package br.smat.controleacesso.ejb.modulo;
/**
 * Key class for Entity Bean: Modulo
 */
public class ModuloKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int modulo;
	
	
	/**
	 * Creates an empty key for Entity Bean: Modulo
	 */
	public ModuloKey() {
	}

	public ModuloKey(int modulo) {
		this.modulo = modulo;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof ModuloKey) {ModuloKey o = (ModuloKey) otherKey;
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
