package br.smat.ejb.tipomedidacorretiva;
/**
 * Key class for Entity Bean: TipoMedidaCorretiva
 */
public class TipoMedidaCorretivaKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int tipoMedidaCorretiva;
	
	/**
	 * Creates an empty key for Entity Bean: TipoMedidaCorretiva
	 */
	public TipoMedidaCorretivaKey() {
	}
	
	public TipoMedidaCorretivaKey(int tipoMedidaCorretiva) {
		this.tipoMedidaCorretiva = tipoMedidaCorretiva;
	}	
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey) {
			br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey o =
				(br
					.smat
					.ejb
					.tipomedidacorretiva
					.TipoMedidaCorretivaKey) otherKey;
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
