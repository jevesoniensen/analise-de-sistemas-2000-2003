package br.smat.ejb.pontofiscalizacaoitemfiscalizacao;

import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey;
import br.smat.ejb.pontofiscalizacao.PontoFiscalizacao;
import br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey;

/**
 * Key class for Entity Bean: PontoFiscalizacaoItemFiscalizacao
 */
public class PontoFiscalizacaoItemFiscalizacaoKey
	implements java.io.Serializable {
		
	static final long serialVersionUID = 3206093459760846163L;
	
	public PontoFiscalizacaoKey pontoFiscalizacao;
	public ItemFiscalizacaoKey  itemFiscalizacao;	
	
	/**
	 * Creates an empty key for Entity Bean: PontoFiscalizacaoItemFiscalizacao
	 */
	public PontoFiscalizacaoItemFiscalizacaoKey() {
	}
	
	public PontoFiscalizacaoItemFiscalizacaoKey(PontoFiscalizacaoKey pontoFiscalizacao,
	                                             ItemFiscalizacaoKey  itemFiscalizacao) {
		this.pontoFiscalizacao	= pontoFiscalizacao;
		this.itemFiscalizacao 	= itemFiscalizacao;		                                       
	}	
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoKey) {
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoKey o =
				(br
					.smat
					.ejb
					.pontofiscalizacaoitemfiscalizacao
					.PontoFiscalizacaoItemFiscalizacaoKey) otherKey;
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
