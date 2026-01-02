package br.smat.ejb.trabalhador;
/**
 * Key class for Entity Bean: Trabalhador
 */
public class TrabalhadorKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int trabalhador;
	
	/**
	 * Creates an empty key for Entity Bean: Trabalhador
	 */
	public TrabalhadorKey() {
	}

	public TrabalhadorKey(int trabalhador) {
		this.trabalhador = trabalhador;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.trabalhador.TrabalhadorKey) {
			br.smat.ejb.trabalhador.TrabalhadorKey o =
				(br.smat.ejb.trabalhador.TrabalhadorKey) otherKey;
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
