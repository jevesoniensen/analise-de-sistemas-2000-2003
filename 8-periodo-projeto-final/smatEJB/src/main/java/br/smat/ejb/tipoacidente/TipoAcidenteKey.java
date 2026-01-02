package br.smat.ejb.tipoacidente;
/**
 * Key class for Entity Bean: TipoAcidente
 */
public class TipoAcidenteKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int tipoAcidente;
	
	/**
	 * Creates an empty key for Entity Bean: TipoAcidente
	 */
	public TipoAcidenteKey() {
	}

	public TipoAcidenteKey(int tipoAcidente) {
		this.tipoAcidente = tipoAcidente;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.tipoacidente.TipoAcidenteKey) {
			br.smat.ejb.tipoacidente.TipoAcidenteKey o =
				(br.smat.ejb.tipoacidente.TipoAcidenteKey) otherKey;
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
