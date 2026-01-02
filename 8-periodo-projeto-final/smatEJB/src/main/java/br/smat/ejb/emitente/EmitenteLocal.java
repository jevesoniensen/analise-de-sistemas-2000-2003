package br.smat.ejb.emitente;
/**
 * Local interface for Enterprise Bean: Emitente
 */
public interface EmitenteLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the emitente.
	 * @return int
	 */
	public int getEmitente();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
}
