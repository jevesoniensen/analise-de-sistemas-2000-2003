package br.smat.ejb.tipoempregador;
/**
 * Key class for Entity Bean: TipoEmpregador
 */
public class TipoEmpregadorKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;

	public int tipoEmpregador;
	
	/**
	 * Creates an empty key for Entity Bean: TipoEmpregador
	 */
	public TipoEmpregadorKey() {
	}

	public TipoEmpregadorKey(int tipoEmpregador){
		this.tipoEmpregador = tipoEmpregador;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.tipoempregador.TipoEmpregadorKey) {
			br.smat.ejb.tipoempregador.TipoEmpregadorKey o =
				(br.smat.ejb.tipoempregador.TipoEmpregadorKey) otherKey;
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
