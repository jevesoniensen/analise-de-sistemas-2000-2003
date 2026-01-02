package br.smat.ejb.estadocivil;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: EstadoCivil
 */
public interface EstadoCivilHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: EstadoCivil
	 */
	public EstadoCivil create(String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	
	/**
	 * Finds an instance using a key for Entity Bean: EstadoCivil
	 */
	public br.smat.ejb.estadocivil.EstadoCivil findByPrimaryKey(
		br.smat.ejb.estadocivil.EstadoCivilKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllEstadosCivis()
		throws FinderException, java.rmi.RemoteException;
}
