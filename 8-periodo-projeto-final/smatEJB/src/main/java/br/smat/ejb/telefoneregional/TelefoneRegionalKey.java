package br.smat.ejb.telefoneregional;

import br.smat.ejb.regional.RegionalKey;

/**
 * Key class for Entity Bean: TelefoneRegional
 */
public class TelefoneRegionalKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public RegionalKey regional;
	public int		telefoneRegional;
	
	/**
	 * Creates an empty key for Entity Bean: TelefoneRegional
	 */
	public TelefoneRegionalKey() {
	}
	
	public TelefoneRegionalKey(int telefoneRegional,RegionalKey regional) {
		this.regional 			= regional;
		this.telefoneRegional	= telefoneRegional;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.ejb.telefoneregional.TelefoneRegionalKey) {
			br.smat.ejb.telefoneregional.TelefoneRegionalKey o =
				(br.smat.ejb.telefoneregional.TelefoneRegionalKey) otherKey;
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
