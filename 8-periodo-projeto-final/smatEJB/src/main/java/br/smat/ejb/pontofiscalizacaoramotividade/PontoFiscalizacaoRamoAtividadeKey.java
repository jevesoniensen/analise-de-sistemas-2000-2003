package br.smat.ejb.pontofiscalizacaoramotividade;

import br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;



/**
 * Key class for Entity Bean: PontoFiscalizacaoRamoAtividade
 */
public class PontoFiscalizacaoRamoAtividadeKey
	implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public PontoFiscalizacaoKey 	pontoFiscalizacao;
	public	RamoAtividadeKey		ramoAtividade;
	
	/**
	 * Creates an empty key for Entity Bean: PontoFiscalizacaoRamoAtividade
	 */
	public PontoFiscalizacaoRamoAtividadeKey() {
	}
	
	public PontoFiscalizacaoRamoAtividadeKey(PontoFiscalizacaoKey pontoFiscalizacao,RamoAtividadeKey ramoAtividade) {
		this.pontoFiscalizacao	= pontoFiscalizacao;
		this.ramoAtividade		= ramoAtividade;
	}	
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeKey) {
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeKey o =
				(br
					.smat
					.ejb
					.pontofiscalizacaoramotividade
					.PontoFiscalizacaoRamoAtividadeKey) otherKey;
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
