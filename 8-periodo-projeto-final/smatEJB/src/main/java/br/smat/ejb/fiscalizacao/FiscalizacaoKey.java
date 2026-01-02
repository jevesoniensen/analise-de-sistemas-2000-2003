package br.smat.ejb.fiscalizacao;
/**
 * Key class for Entity Bean: Fiscalizacao
 */
public class FiscalizacaoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int fiscalizacao;
	
	/**
	 * Creates an empty key for Entity Bean: Fiscalizacao
	 */
	public FiscalizacaoKey() {
	}
	
	public FiscalizacaoKey(int fiscalizacao) {
		this.fiscalizacao = fiscalizacao;
	}	
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.fiscalizacao.FiscalizacaoKey) {
			br.smat.ejb.fiscalizacao.FiscalizacaoKey o =
				(br.smat.ejb.fiscalizacao.FiscalizacaoKey) otherKey;
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
