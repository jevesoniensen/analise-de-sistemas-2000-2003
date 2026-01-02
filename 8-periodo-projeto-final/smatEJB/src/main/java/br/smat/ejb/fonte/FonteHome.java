package br.smat.ejb.fonte;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Fonte
 */
public interface FonteHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Fonte
	 */
	public br.smat.ejb.fonte.Fonte create(String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Fonte
	 */
	public br.smat.ejb.fonte.Fonte findByPrimaryKey(
		br.smat.ejb.fonte.FonteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllFontes()
		throws FinderException, java.rmi.RemoteException;
}
