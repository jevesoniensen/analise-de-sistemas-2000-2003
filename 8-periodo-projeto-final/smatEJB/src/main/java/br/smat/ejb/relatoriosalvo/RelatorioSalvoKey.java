package br.smat.ejb.relatoriosalvo;
/**
 * Key class for Entity Bean: RelatorioSalvo
 */
public class RelatorioSalvoKey implements java.io.Serializable {
	static final long serialVersionUID = 3206093459760846163L;
	
	public int relatorio;
	
	/**
	 * Creates an empty key for Entity Bean: RelatorioSalvo
	 */
	public RelatorioSalvoKey() {
	}

	public RelatorioSalvoKey(int relatorio){
		this.relatorio = relatorio;
	}
		
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof br.smat.ejb.relatoriosalvo.RelatorioSalvoKey) {
			br.smat.ejb.relatoriosalvo.RelatorioSalvoKey o =
				(br.smat.ejb.relatoriosalvo.RelatorioSalvoKey) otherKey;
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
