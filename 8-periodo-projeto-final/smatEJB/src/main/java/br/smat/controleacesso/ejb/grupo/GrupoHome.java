package br.smat.controleacesso.ejb.grupo;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.controleacesso.ejb.grupo.GrupoKey;
/**
 * Home interface for Enterprise Bean: Grupo
 */
public interface GrupoHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: Grupo
	 */
	public Grupo findByPrimaryKey(
		GrupoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAll()
		throws FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public br.smat.controleacesso.ejb.grupo.Grupo create(String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
