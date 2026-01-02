package br.smat.ejb.medico;
/**
 * Key class for Entity Bean: Medico
 */
public class MedicoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int medico;
	
	/**
	 * Creates an empty key for Entity Bean: Medico
	 */
	public MedicoKey() {
	}

	public MedicoKey(int medico){
		this.medico = medico;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.medico.MedicoKey) {
			br.smat.ejb.medico.MedicoKey o =
				(br.smat.ejb.medico.MedicoKey) otherKey;
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
