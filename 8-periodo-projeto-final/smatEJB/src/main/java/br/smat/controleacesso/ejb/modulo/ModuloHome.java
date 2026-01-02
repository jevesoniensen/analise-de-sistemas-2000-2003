package br.smat.controleacesso.ejb.modulo;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Modulo
 */
public interface ModuloHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Modulo
	 */
	public Modulo create(int paginaDefault,
																	 String nome,
																	 int moduloPai,
																	 String estrutura)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Modulo
	 */
	public Modulo findByPrimaryKey(ModuloKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllModulos()
		throws FinderException, java.rmi.RemoteException;
}
