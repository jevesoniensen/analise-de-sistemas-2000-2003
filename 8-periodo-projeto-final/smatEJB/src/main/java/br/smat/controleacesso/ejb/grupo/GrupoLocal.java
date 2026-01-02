package br.smat.controleacesso.ejb.grupo;
/**
 * Local interface for Enterprise Bean: Grupo
 */
public interface GrupoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the grupo.
	 * @return int
	 */
	public int getGrupo();
	/**
	 * Returns the modulos.
	 * @return int
	 */
	public String getNome();
	/**
	 * Sets the grupo.
	 * @param grupo The grupo to set
	 */
	public void setGrupo(int grupo);
	/**
	 * Sets the modulos.
	 * @param modulos The modulos to set
	 */
	public void setNome(String nome);
}
