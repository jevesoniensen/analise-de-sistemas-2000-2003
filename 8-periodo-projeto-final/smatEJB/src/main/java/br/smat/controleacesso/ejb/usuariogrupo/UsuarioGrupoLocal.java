package br.smat.controleacesso.ejb.usuariogrupo;
import br.smat.controleacesso.ejb.grupo.GrupoKey;
import br.smat.controleacesso.ejb.usuario.UsuarioKey;
/**
 * Local interface for Enterprise Bean: UsuarioGrupo
 */
public interface UsuarioGrupoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the grupo.
	 * @return GrupoKey
	 */
	public GrupoKey getGrupo();
	/**
	 * Returns the nomeGrupo.
	 * @return String
	 */
	public String getNomeGrupo();
	/**
	 * Returns the nomeUsuario.
	 * @return String
	 */
	public String getNomeUsuario();
	/**
	 * Returns the usuario.
	 * @return UsuarioKey
	 */
	public UsuarioKey getUsuario();
	/**
	 * Sets the grupo.
	 * @param grupo The grupo to set
	 */
	public void setGrupo(GrupoKey grupo);
	/**
	 * Sets the nomeGrupo.
	 * @param nomeGrupo The nomeGrupo to set
	 */
	public void setNomeGrupo(String nomeGrupo);
	/**
	 * Sets the nomeUsuario.
	 * @param nomeUsuario The nomeUsuario to set
	 */
	public void setNomeUsuario(String nomeUsuario);
	/**
	 * Sets the usuario.
	 * @param usuario The usuario to set
	 */
	public void setUsuario(UsuarioKey usuario);
	public int getGrupoKey();
	public int getUsuarioKey();
}
