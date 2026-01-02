package br.smat.ejb.representanteempresa;

import br.smat.ejb.empregador.EmpregadorKey;

/**
 * Key class for Entity Bean: RepresentanteEmpresa
 */
public class RepresentanteEmpresaKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int 			representanteEmpresa;
	
	/**
	 * Creates an empty key for Entity Bean: RepresentanteEmpresa
	 */
	public RepresentanteEmpresaKey() {
	}
	
	public RepresentanteEmpresaKey(int representanteEmpresa) {
		this.representanteEmpresa = representanteEmpresa;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.ejb.representanteempresa.RepresentanteEmpresaKey) {
			br.smat.ejb.representanteempresa.RepresentanteEmpresaKey o =
				(br
					.smat
					.ejb
					.representanteempresa
					.RepresentanteEmpresaKey) otherKey;
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
