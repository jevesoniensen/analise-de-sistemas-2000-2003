package br.smat.ejb.medidacorretivafiscalizacao;

import br.smat.ejb.fiscalizacao.FiscalizacaoKey;
import br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey;

/**
 * Key class for Entity Bean: MedidaCorretivaFiscalizacao
 */
public class MedidaCorretivaFiscalizacaoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public TramiteFiscalizacaoKey tramiteFiscalizacao;
	public TipoMedidaCorretivaKey tipoMedidaCorretiva;
	
	/**
	 * Creates an empty key for Entity Bean: MedidaCorretivaFiscalizacao
	 */
	public MedidaCorretivaFiscalizacaoKey() {
	}
	
	public MedidaCorretivaFiscalizacaoKey(	TramiteFiscalizacaoKey tramiteFiscalizacao,
											TipoMedidaCorretivaKey tipoMedidaCorretiva) {
		this.tramiteFiscalizacao = tramiteFiscalizacao;
		this.tipoMedidaCorretiva = tipoMedidaCorretiva;												
	}	

	public MedidaCorretivaFiscalizacaoKey(	int tramiteFiscalizacao,
											int fiscalizacao,	
											int tipoMedidaCorretiva) {
		this.tramiteFiscalizacao = new TramiteFiscalizacaoKey(tramiteFiscalizacao,new FiscalizacaoKey(fiscalizacao));
		this.tipoMedidaCorretiva = new TipoMedidaCorretivaKey(tipoMedidaCorretiva);												
	}		
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoKey) {
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoKey o =
				(br
					.smat
					.ejb
					.medidacorretivafiscalizacao
					.MedidaCorretivaFiscalizacaoKey) otherKey;
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
