package br.smat.ejb.diagnostico;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Diagnostico
 */
public interface DiagnosticoHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Diagnostico
	 */
	public Diagnostico create(String nome, int cid10)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Diagnostico
	 */

	public Diagnostico findByPrimaryKey(
		DiagnosticoKey key)
		throws javax.ejb.FinderException, java.rmi.RemoteException;	

	public java.util.Collection findAllDiagnosticos()
		throws FinderException, java.rmi.RemoteException;
}
