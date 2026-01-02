package br.smat.ejb.empregador;
/**
 * Key class for Entity Bean: Empregador
 */
public class EmpregadorKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int empregador;
	
	/**
	 * Creates an empty key for Entity Bean: Empregador
	 */
	public EmpregadorKey() {
	}

	public EmpregadorKey(int empregador){
		this.empregador = empregador;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.empregador.EmpregadorKey) {
			br.smat.ejb.empregador.EmpregadorKey o =
				(br.smat.ejb.empregador.EmpregadorKey) otherKey;
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
