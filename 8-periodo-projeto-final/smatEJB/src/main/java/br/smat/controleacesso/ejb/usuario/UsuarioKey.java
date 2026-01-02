package br.smat.controleacesso.ejb.usuario;
/**
 * Key class for Entity Bean: Usuario
 */
public class UsuarioKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;
	
	public int usuario;
	
	/**
	 * Creates an empty key for Entity Bean: Usuario
	 */
	public UsuarioKey() {
	}

	public UsuarioKey(int usuario){
		this.usuario = usuario;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof UsuarioKey) {
			UsuarioKey o = (UsuarioKey) otherKey;
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
