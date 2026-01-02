package br.smat.ejb.estado;
/**
 * Key class for Entity Bean: Estado
 */
public class EstadoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int estado;
	
	/**
	 * Creates an empty key for Entity Bean: Estado
	 */
	public EstadoKey() {
	}
	
	public EstadoKey(int estado){
		this.estado = estado;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof EstadoKey) {
			EstadoKey o = (EstadoKey) otherKey;
			return (super.equals(otherKey));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	//public int hashCode() {
	//	return (super.hashCode());
	//}
	
	public int hashCode()
	{
		return (""+estado).hashCode();
	}	
	
	public String toString()
	{
		return ""+estado;
	}
}
