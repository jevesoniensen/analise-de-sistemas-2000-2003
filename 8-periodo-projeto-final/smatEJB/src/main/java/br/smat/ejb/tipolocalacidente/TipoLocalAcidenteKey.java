package br.smat.ejb.tipolocalacidente;
/**
 * Key class for Entity Bean: TipoLocalAcidente
 */
public class TipoLocalAcidenteKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int tipoLocalAcidente;
	
	/**
	 * Creates an empty key for Entity Bean: TipoLocalAcidente
	 */
	public TipoLocalAcidenteKey() {
	}
	

	public TipoLocalAcidenteKey(int tipoLocalAcidente){
		this.tipoLocalAcidente = tipoLocalAcidente;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey) {
			br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey o =
				(br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey) otherKey;
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
