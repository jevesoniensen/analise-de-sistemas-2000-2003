package br.smat.ejb.roteiros;

import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey;

/**
 * Key class for Entity Bean: Roteiros
 */
public class RoteirosKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public TramiteFiscalizacaoKey 	tramiteFiscalizacao;
	public ItemFiscalizacaoKey		itemFiscalizacao;		
	
	/**
	 * Creates an empty key for Entity Bean: Roteiros
	 */
	public RoteirosKey() {
	}

	public RoteirosKey(TramiteFiscalizacaoKey 	tramiteFiscalizacao,
						ItemFiscalizacaoKey		itemFiscalizacao) {
		this.tramiteFiscalizacao = tramiteFiscalizacao;
		this.itemFiscalizacao = itemFiscalizacao;							
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.roteiros.RoteirosKey) {
			br.smat.ejb.roteiros.RoteirosKey o =
				(br.smat.ejb.roteiros.RoteirosKey) otherKey;
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
