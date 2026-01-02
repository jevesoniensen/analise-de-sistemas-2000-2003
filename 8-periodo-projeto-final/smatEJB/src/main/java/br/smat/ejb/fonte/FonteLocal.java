package br.smat.ejb.fonte;
/**
 * Local interface for Enterprise Bean: Fonte
 */
public interface FonteLocal extends javax.ejb.EJBLocalObject {
	
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	
	/**
	 * Returns the fonte.
	 * @return int
	 */
	public int getFonte();
	
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();

}
