package br.smat.ejb.telefoneempregador;

import br.smat.ejb.empregador.EmpregadorKey;

/**
 * Key class for Entity Bean: TelefoneEmpregador
 */
public class TelefoneEmpregadorKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;

	public EmpregadorKey empregador;
	public int		  telefoneEmpregador;
		
	/**
	 * Creates an empty key for Entity Bean: TelefoneEmpregador
	 */
	public TelefoneEmpregadorKey() {
	}

	public TelefoneEmpregadorKey(int telefoneEmpregador,EmpregadorKey empregador) {
		this.empregador 			= empregador;
		this.telefoneEmpregador	= telefoneEmpregador;
	}	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey) {
			br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey o =
				(br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey) otherKey;
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
