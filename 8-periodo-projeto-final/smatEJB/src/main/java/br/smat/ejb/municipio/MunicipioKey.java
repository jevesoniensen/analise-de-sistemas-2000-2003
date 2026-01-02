package br.smat.ejb.municipio;
/**
 * Key class for Entity Bean: Municipio
 */
public class MunicipioKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int municipio;
	
	/**
	 * Creates an empty key for Entity Bean: Municipio
	 */
	public MunicipioKey() {
	}

	/**
	 * Constructor MunicipioKey.
	 * @param municipio
	 */
	public MunicipioKey(int municipio) {
		this.municipio = municipio;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.municipio.MunicipioKey) {
			br.smat.ejb.municipio.MunicipioKey o =
				(br.smat.ejb.municipio.MunicipioKey) otherKey;
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
