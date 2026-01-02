package br.smat.ejb.tipodepoimento;
/**
 * Key class for Entity Bean: TipoDepoimento
 */
public class TipoDepoimentoKey implements java.io.Serializable {
	
	static final long serialVersionUID = 3206093459760846163L;
	
	public int tipoDepoimento;
	
	/**
	 * Creates an empty key for Entity Bean: TipoDepoimento
	 */
	public TipoDepoimentoKey() {
	}
	
	public TipoDepoimentoKey(int tipoDepoimento) {
		this.tipoDepoimento = tipoDepoimento;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.tipodepoimento.TipoDepoimentoKey) {
			br.smat.ejb.tipodepoimento.TipoDepoimentoKey o =
				(br.smat.ejb.tipodepoimento.TipoDepoimentoKey) otherKey;
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
