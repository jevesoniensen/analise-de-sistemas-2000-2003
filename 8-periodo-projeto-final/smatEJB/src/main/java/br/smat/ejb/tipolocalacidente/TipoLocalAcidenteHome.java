package br.smat.ejb.tipolocalacidente;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: TipoLocalAcidente
 */
public interface TipoLocalAcidenteHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: TipoLocalAcidente
	 */
	public br.smat.ejb.tipolocalacidente.TipoLocalAcidente create(String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: TipoLocalAcidente
	 */
	public br.smat.ejb.tipolocalacidente.TipoLocalAcidente findByPrimaryKey(
		br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllTiposLocalAcidente()
		throws FinderException, java.rmi.RemoteException;
}
