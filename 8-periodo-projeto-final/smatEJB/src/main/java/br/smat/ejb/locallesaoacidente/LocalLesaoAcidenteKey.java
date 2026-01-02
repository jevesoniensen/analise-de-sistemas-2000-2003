package br.smat.ejb.locallesaoacidente;

import br.smat.ejb.acidente.AcidenteKey;
import br.smat.ejb.locallesao.LocalLesaoKey;

/**
 * Key class for Entity Bean: LocalLesaoAcidente
 */
public class LocalLesaoAcidenteKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public LocalLesaoKey localLesao;
	public	AcidenteKey   acidente;
	/**
	 * Creates an empty key for Entity Bean: LocalLesaoAcidente
	 */
	public LocalLesaoAcidenteKey() {
	}

	public LocalLesaoAcidenteKey(LocalLesaoKey localLesao,
								  AcidenteKey	acidente){
		this.localLesao = localLesao;
		this.acidente = acidente;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey) {
			br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey o =
				(br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteKey) otherKey;
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
