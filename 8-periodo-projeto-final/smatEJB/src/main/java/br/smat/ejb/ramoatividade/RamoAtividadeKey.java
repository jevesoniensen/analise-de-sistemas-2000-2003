package br.smat.ejb.ramoatividade;
/**
 * Key class for Entity Bean: RamoAtividade
 */
public class RamoAtividadeKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int ramoAtividade; 
	
	/**
	 * Creates an empty key for Entity Bean: RamoAtividade
	 */
	public RamoAtividadeKey() {
	}
	
	public RamoAtividadeKey(int ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}	
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.ramoatividade.RamoAtividadeKey) {
			br.smat.ejb.ramoatividade.RamoAtividadeKey o =
				(br.smat.ejb.ramoatividade.RamoAtividadeKey) otherKey;
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
