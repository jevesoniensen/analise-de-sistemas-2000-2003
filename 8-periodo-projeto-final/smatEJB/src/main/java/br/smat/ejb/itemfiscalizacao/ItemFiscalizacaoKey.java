package br.smat.ejb.itemfiscalizacao;
/**
 * Key class for Entity Bean: ItemFiscalizacao
 */
public class ItemFiscalizacaoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int itemFiscalizacao;
	
	/**
	 * Creates an empty key for Entity Bean: ItemFiscalizacao
	 */
	public ItemFiscalizacaoKey() {
	}
	
	public ItemFiscalizacaoKey(int itemFiscalizacao) {
		
		this.itemFiscalizacao = itemFiscalizacao;
		
	}	
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey) {
			br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey o =
				(br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey) otherKey;
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
