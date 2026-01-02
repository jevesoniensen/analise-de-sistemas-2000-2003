package br.smat.ejb.emitente;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Emitente
 */
public interface EmitenteHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Emitente
	 */
	public br.smat.ejb.emitente.Emitente create(String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Emitente
	 */
	public br.smat.ejb.emitente.Emitente findByPrimaryKey(
		br.smat.ejb.emitente.EmitenteKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllEmitentes()
		throws FinderException, java.rmi.RemoteException;
}
