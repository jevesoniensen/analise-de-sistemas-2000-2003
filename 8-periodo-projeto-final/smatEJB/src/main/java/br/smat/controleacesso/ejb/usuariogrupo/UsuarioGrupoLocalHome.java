package br.smat.controleacesso.ejb.usuariogrupo;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: UsuarioGrupo
 */
public interface UsuarioGrupoLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: UsuarioGrupo
	 */
	public br
		.smat
		.controleacesso
		.ejb
		.usuariogrupo
		.UsuarioGrupoLocal findByPrimaryKey(
			br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAll() throws FinderException;
	public java.util.Collection findAllByGrupo(int grupo)
		throws FinderException;
	public java.util.Collection findAllByUsuario(int usuario)
		throws FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoLocal create(
		int grupo,
		int usuario)
		throws javax.ejb.CreateException;
}
