package br.smat.ejb.area;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Area
 */
public interface AreaHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Area
	 */
	public br.smat.ejb.area.Area create(String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Area
	 */
	public br.smat.ejb.area.Area findByPrimaryKey(
		br.smat.ejb.area.AreaKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllAreas()
		throws FinderException, java.rmi.RemoteException;
}
