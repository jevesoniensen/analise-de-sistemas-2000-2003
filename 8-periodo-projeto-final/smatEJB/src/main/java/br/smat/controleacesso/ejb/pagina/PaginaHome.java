package br.smat.controleacesso.ejb.pagina;
import javax.ejb.FinderException;
import java.util.Collection;

/**
 * Home interface for Enterprise Bean: Pagina
 */
public interface PaginaHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Pagina
	 */
	public Pagina create(String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Pagina
	 */
	public Pagina findByPrimaryKey(PaginaKey key)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllPaginas()
		throws FinderException, java.rmi.RemoteException;
	public Pagina findPermisaoPagina(
		int usuario,
		int pagina)
		throws FinderException, java.rmi.RemoteException;
}
