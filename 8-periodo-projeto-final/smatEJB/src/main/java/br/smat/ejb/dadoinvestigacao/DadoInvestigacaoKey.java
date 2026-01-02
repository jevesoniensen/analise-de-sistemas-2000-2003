package br.smat.ejb.dadoinvestigacao;

import br.smat.ejb.investigacao.InvestigacaoKey;

/**
 * Key class for Entity Bean: DadoInvestigacao
 */
public class DadoInvestigacaoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public InvestigacaoKey investigacao;
	public int			dadoInvestigacao;
	
	/**
	 * Creates an empty key for Entity Bean: DadoInvestigacao
	 */
	public DadoInvestigacaoKey() {
	}

	public DadoInvestigacaoKey(InvestigacaoKey investigacao,
								int			dadoInvestigacao) {
			this.investigacao 		= investigacao;
			this.dadoInvestigacao 	= dadoInvestigacao;
	}

	public DadoInvestigacaoKey(int investigacao,
								int dadoInvestigacao) {
			this.investigacao 		= new InvestigacaoKey(investigacao);
			this.dadoInvestigacao 	= dadoInvestigacao;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey) {
			br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey o =
				(br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey) otherKey;
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
