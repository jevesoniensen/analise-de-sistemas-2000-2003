package br.smat.controleacesso.ejb.modulo;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Modulo
 */
public interface ModuloLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Modulo
	 */
	public ModuloLocal create(int paginaDefault,
																	 String nome,
																	 int moduloPai,
																	 String estrutura)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Modulo
	 */
	public ModuloLocal findByPrimaryKey(ModuloKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllModulos() throws FinderException;
}
