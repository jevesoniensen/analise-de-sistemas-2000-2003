package br.smat.controleacesso.ejb.pagina;
/**
 * Key class for Entity Bean: Pagina
 */
public class PaginaKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;

	public int pagina;
	
	/**
	 * Creates an empty key for Entity Bean: Pagina
	 */
	public PaginaKey() {
	}

	public PaginaKey(int pagina){
		this.pagina = pagina;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof PaginaKey) {PaginaKey o = (PaginaKey) otherKey;
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
