package br.smat.ejb.pontofiscalizacao;
/**
 * Key class for Entity Bean: PontoFiscalizacao
 */
public class PontoFiscalizacaoKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;
	
	public int pontoFiscalizacao;
	
	/**
	 * Creates an empty key for Entity Bean: PontoFiscalizacao
	 */
	public PontoFiscalizacaoKey() {
	}
	
	public PontoFiscalizacaoKey(int pontoFiscalizacao) {
		this.pontoFiscalizacao = pontoFiscalizacao;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey) {
			br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey o =
				(br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey) otherKey;
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
