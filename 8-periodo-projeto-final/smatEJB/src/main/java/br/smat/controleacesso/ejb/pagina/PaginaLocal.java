package br.smat.controleacesso.ejb.pagina;
/**
 * Local interface for Enterprise Bean: Pagina
 */
public interface PaginaLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the pagina.
	 * @return int
	 */
	public int getPagina();
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
}
