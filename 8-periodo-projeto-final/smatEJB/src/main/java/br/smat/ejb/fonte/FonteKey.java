package br.smat.ejb.fonte;
/**
 * Key class for Entity Bean: Fonte
 */
public class FonteKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int fonte;
	
	/**
	 * Creates an empty key for Entity Bean: Fonte
	 */
	public FonteKey() {
	}
	
	public FonteKey(int fonte){
		this.fonte = fonte;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.fonte.FonteKey) {
			br.smat.ejb.fonte.FonteKey o =
				(br.smat.ejb.fonte.FonteKey) otherKey;
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
