package br.smat.controleacesso.ejb.grupo;
/**
 * Key class for Entity Bean: Grupo
 */
public class GrupoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int grupo;
	
	/**
	 * Creates an empty key for Entity Bean: Grupo
	 */
	public GrupoKey() {
	}
	
	public GrupoKey(int grupo) {
		this.grupo = grupo;
	}	
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof GrupoKey) {
			GrupoKey o =(GrupoKey) otherKey;
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
