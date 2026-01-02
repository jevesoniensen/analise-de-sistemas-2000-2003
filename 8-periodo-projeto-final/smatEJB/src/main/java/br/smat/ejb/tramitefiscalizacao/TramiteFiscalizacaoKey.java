package br.smat.ejb.tramitefiscalizacao;

import br.smat.ejb.fiscalizacao.FiscalizacaoKey;

/**
 * Key class for Entity Bean: TramiteFiscalizacao
 */
public class TramiteFiscalizacaoKey implements java.io.Serializable {
	
	static final long serialVersionUID = 3206093459760846163L;
	
	public int 			tramiteFiscalizacao;
	public FiscalizacaoKey fiscalizacao;
	
	/**
	 * Creates an empty key for Entity Bean: TramiteFiscalizacao
	 */
	public TramiteFiscalizacaoKey() {
	}
	
	public TramiteFiscalizacaoKey(	int tramiteFiscalizacao,
									FiscalizacaoKey fiscalizacao) {
		this.tramiteFiscalizacao 	= tramiteFiscalizacao;
		this.fiscalizacao			= fiscalizacao;
	}	
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey) {
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey o =
				(br
					.smat
					.ejb
					.tramitefiscalizacao
					.TramiteFiscalizacaoKey) otherKey;
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
