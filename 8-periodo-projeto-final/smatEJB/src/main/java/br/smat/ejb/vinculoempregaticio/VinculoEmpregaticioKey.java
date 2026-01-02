package br.smat.ejb.vinculoempregaticio;
/**
 * Key class for Entity Bean: VinculoEmpregaticio
 */
public class VinculoEmpregaticioKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int vinculoEmpregaticio;
		
	/**
	 * Creates an empty key for Entity Bean: VinculoEmpregaticio
	 */
	public VinculoEmpregaticioKey() {
	}
	
	public VinculoEmpregaticioKey(int vinculoEmpregaticio) {
		this.vinculoEmpregaticio = vinculoEmpregaticio;
	}	
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof VinculoEmpregaticioKey) {
			VinculoEmpregaticioKey o = (VinculoEmpregaticioKey) otherKey;
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
