package br.smat.controleacesso.ejb.usuario;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Usuario
 */
public interface UsuarioLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Usuario
	 */
	public UsuarioLocal create( String nome,
							    String senha,
								int    agenteSaude)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Usuario
	 */
	public UsuarioLocal findByPrimaryKey(UsuarioKey primaryKey)
		throws javax.ejb.FinderException;
	public UsuarioLocal findByNomeSenha(String nome, String senha)
		throws FinderException;

	public java.util.Collection findAll() throws FinderException;
}
