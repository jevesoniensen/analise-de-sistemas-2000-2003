package br.smat.controleacesso.ejb.modulo;

import br.smat.controleacesso.ejb.pagina.PaginaKey;

/**
 * Local interface for Enterprise Bean: Modulo
 */
public interface ModuloLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the estrutura.
	 * @return String
	 */
	public String getEstrutura();
	/**
	 * Returns the modulo.
	 * @return int
	 */
	public int getModulo();
	/**
	 * Returns the moduloPai.
	 * @return ModuloKey
	 */
	public ModuloKey getModuloPai();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the paginaDefault.
	 * @return PaginaKey
	 */
	public PaginaKey getPaginaDefault();
	/**
	 * Sets the estrutura.
	 * @param estrutura The estrutura to set
	 */
	public void setEstrutura(String estrutura);
	/**
	 * Sets the moduloPai.
	 * @param moduloPai The moduloPai to set
	 */
	public void setModuloPai(ModuloKey moduloPai);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the paginaDefault.
	 * @param paginaDefault The paginaDefault to set
	 */
	public void setPaginaDefault(PaginaKey paginaDefault);
}
