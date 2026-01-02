package br.smat.ejb.locallesao;
/**
 * Key class for Entity Bean: LocalLesao
 */
public class LocalLesaoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int localLesao;
	
	/**
	 * Creates an empty key for Entity Bean: LocalLesao
	 */
	public LocalLesaoKey() {
	}
	
	public LocalLesaoKey(int localLesao){
		this.localLesao = localLesao;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.locallesao.LocalLesaoKey) {
			br.smat.ejb.locallesao.LocalLesaoKey o =
				(br.smat.ejb.locallesao.LocalLesaoKey) otherKey;
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
