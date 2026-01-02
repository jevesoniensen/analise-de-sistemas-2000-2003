package br.smat.ejb.vinculoempregaticio;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: VinculoEmpregaticio
 */
public interface VinculoEmpregaticioHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: VinculoEmpregaticio
	 */
	public br.smat.ejb.vinculoempregaticio.VinculoEmpregaticio create(String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;	
		
	/**
	 * Finds an instance using a key for Entity Bean: VinculoEmpregaticio
	 */
	public VinculoEmpregaticio findByPrimaryKey(VinculoEmpregaticioKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	
	public java.util.Collection findAllVinculosEmpregaticios()
		throws FinderException, java.rmi.RemoteException;
}
