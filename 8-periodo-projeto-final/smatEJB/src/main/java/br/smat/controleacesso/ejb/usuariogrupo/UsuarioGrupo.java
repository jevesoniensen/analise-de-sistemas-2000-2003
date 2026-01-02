package br.smat.controleacesso.ejb.usuariogrupo;
import br.smat.controleacesso.ejb.grupo.GrupoKey;
import br.smat.controleacesso.ejb.usuario.UsuarioKey;
/**
 * Remote interface for Enterprise Bean: UsuarioGrupo
 */
public interface UsuarioGrupo extends javax.ejb.EJBObject {
	/**
	 * Returns the grupo.
	 * @return GrupoKey
	 */
	public GrupoKey getGrupo() throws java.rmi.RemoteException;
	/**
	 * Returns the nomeGrupo.
	 * @return String
	 */
	public String getNomeGrupo() throws java.rmi.RemoteException;
	/**
	 * Returns the nomeUsuario.
	 * @return String
	 */
	public String getNomeUsuario() throws java.rmi.RemoteException;
	/**
	 * Returns the usuario.
	 * @return UsuarioKey
	 */
	public UsuarioKey getUsuario() throws java.rmi.RemoteException;
	/**
	 * Sets the grupo.
	 * @param grupo The grupo to set
	 */
	public void setGrupo(GrupoKey grupo) throws java.rmi.RemoteException;
	/**
	 * Sets the nomeGrupo.
	 * @param nomeGrupo The nomeGrupo to set
	 */
	public void setNomeGrupo(String nomeGrupo) throws java.rmi.RemoteException;
	/**
	 * Sets the nomeUsuario.
	 * @param nomeUsuario The nomeUsuario to set
	 */
	public void setNomeUsuario(String nomeUsuario)
		throws java.rmi.RemoteException;
	/**
	 * Sets the usuario.
	 * @param usuario The usuario to set
	 */
	public void setUsuario(UsuarioKey usuario) throws java.rmi.RemoteException;
	public int getGrupoKey() throws java.rmi.RemoteException;
	public int getUsuarioKey() throws java.rmi.RemoteException;
}
