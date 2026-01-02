package br.smat.ejb.status;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Status
 */
public interface StatusHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: Status
	 */
	public br.smat.ejb.status.Status findByPrimaryKey(
		br.smat.ejb.status.StatusKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllStatus()
		throws FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.status.Status create(String nome, String descricao)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
