package br.smat.ejb.tipoacidente;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: TipoAcidente
 */
public interface TipoAcidenteHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: TipoAcidente
	 */
	public br.smat.ejb.tipoacidente.TipoAcidente create(String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: TipoAcidente
	 */
	public br.smat.ejb.tipoacidente.TipoAcidente findByPrimaryKey(
		br.smat.ejb.tipoacidente.TipoAcidenteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllTiposAcidente()
		throws FinderException, java.rmi.RemoteException;
}
