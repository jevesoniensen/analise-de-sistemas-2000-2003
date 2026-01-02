package br.smat.controleacesso.ejb.usuario;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Usuario
 */
public interface UsuarioHome extends javax.ejb.EJBHome {


	/**
	 * Finds an instance using a key for Entity Bean: Usuario
	 */
	public Usuario findByPrimaryKey(UsuarioKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public Usuario findByNomeSenha(String nome, String senha)
		throws FinderException, java.rmi.RemoteException;
	/**
	 * Creates an instance from a key for Entity Bean: Usuario
	 */
	public Usuario create(
		String nome,
		String senha,
		int agenteSaude)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	public java.util.Collection findAll()
		throws FinderException, java.rmi.RemoteException;
}
