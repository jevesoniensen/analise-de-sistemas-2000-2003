package br.smat.ejb.medidacorretivainvestigacao;

import br.smat.ejb.investigacao.InvestigacaoKey;
import br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey;

/**
 * Key class for Entity Bean: MedidaCorretivaInvestigacao
 */
public class MedidaCorretivaInvestigacaoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public InvestigacaoKey 		investigacao;
	public TipoMedidaCorretivaKey 	tipoMedidaCorretiva;
	
	/**
	 * Creates an empty key for Entity Bean: MedidaCorretivaInvestigacao
	 */
	public MedidaCorretivaInvestigacaoKey() {
	}
	
	public MedidaCorretivaInvestigacaoKey(	InvestigacaoKey 		investigacao,
											TipoMedidaCorretivaKey 	tipoMedidaCorretiva) {
			this.investigacao 		  = investigacao;
			this.tipoMedidaCorretiva = tipoMedidaCorretiva;
	}	

	public MedidaCorretivaInvestigacaoKey(	int investigacao,
											int tipoMedidaCorretiva) {
			this.investigacao 		  = new InvestigacaoKey(investigacao);
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
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoKey) {
			br
				.smat
				.ejb
				.medidacorretivainvestigacao
				.MedidaCorretivaInvestigacaoKey o =
				(br
					.smat
					.ejb
					.medidacorretivainvestigacao
					.MedidaCorretivaInvestigacaoKey) otherKey;
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
