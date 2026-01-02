package br.smat.ejb.grauconformidade;
/**
 * Key class for Entity Bean: GrauConformidade
 */
public class GrauConformidadeKey implements java.io.Serializable {
	
	static final long serialVersionUID = 3206093459760846163L;
	
	public int grauConformidade;
	
	/**
	 * Creates an empty key for Entity Bean: GrauConformidade
	 */
	public GrauConformidadeKey() {
	}
	
	public GrauConformidadeKey(int grauConformidade){
		this.grauConformidade = grauConformidade;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey
			instanceof br.smat.ejb.grauconformidade.GrauConformidadeKey) {
			br.smat.ejb.grauconformidade.GrauConformidadeKey o =
				(br.smat.ejb.grauconformidade.GrauConformidadeKey) otherKey;
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
