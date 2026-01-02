package br.smat.ejb.medico;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Medico
 */
public interface MedicoHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Medico
	 */
	public br.smat.ejb.medico.Medico create(String nome,int crm, int ufCRM)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Medico
	 */
	public br.smat.ejb.medico.Medico findByPrimaryKey(
		br.smat.ejb.medico.MedicoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllMedicos()
		throws FinderException, java.rmi.RemoteException;
}
