package br.smat.ejb.ocupacao;
/**
 * Key class for Entity Bean: Ocupacao
 */
public class OcupacaoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;

	public int ocupacao;
	
	/**
	 * Creates an empty key for Entity Bean: Ocupacao
	 */
	public OcupacaoKey() {
	}
	/**
	 * Returns true if both keys are equal.
	 */

	public OcupacaoKey(int ocupacao){
		this.ocupacao = ocupacao;
	}
		
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.ocupacao.OcupacaoKey) {
			br.smat.ejb.ocupacao.OcupacaoKey o =
				(br.smat.ejb.ocupacao.OcupacaoKey) otherKey;
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
