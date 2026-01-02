package br.smat.ejb.estadocivil;
/**
 * Key class for Entity Bean: EstadoCivil
 */
public class EstadoCivilKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int estadoCivil;
	/**
	 * Creates an empty key for Entity Bean: EstadoCivil
	 */
	
	public EstadoCivilKey() {}
	
	public EstadoCivilKey(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.estadocivil.EstadoCivilKey) {
			br.smat.ejb.estadocivil.EstadoCivilKey o =
				(br.smat.ejb.estadocivil.EstadoCivilKey) otherKey;
			return (super.equals(otherKey));
		}
		return false;
	}
	
	public int hashCode(){
		return (""+estadoCivil).hashCode();
	}	
	
	public String toString(){
		return ""+estadoCivil;
	}	
}
