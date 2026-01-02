package br.smat.controleacesso.ejb.pagina;
import javax.ejb.FinderException;
import java.util.Collection;


/**
 * Local Home interface for Enterprise Bean: Pagina
 */
public interface PaginaLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Pagina
	 */
	public PaginaLocal create(String nome)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Pagina
	 */
	public PaginaLocal findByPrimaryKey(PaginaKey key)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllPaginas() throws FinderException;
	public PaginaLocal findPermisaoPagina(
		int usuario,
		int pagina)
		throws FinderException;
}