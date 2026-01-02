package br.smat.controleacesso.ejb.usuariogrupo;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: UsuarioGrupo
 */
public interface UsuarioGrupoHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: UsuarioGrupo
	 */
	public br
		.smat
		.controleacesso
		.ejb
		.usuariogrupo
		.UsuarioGrupo findByPrimaryKey(
		br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAll()
		throws FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllByGrupo(int grupo)
		throws FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllByUsuario(int usuario)
		throws FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupo create(
		int grupo,
		int usuario)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
