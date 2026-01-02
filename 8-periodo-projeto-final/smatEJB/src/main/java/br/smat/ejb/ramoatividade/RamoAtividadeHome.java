package br.smat.ejb.ramoatividade;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: RamoAtividade
 */
public interface RamoAtividadeHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: RamoAtividade
	 */
	public br.smat.ejb.ramoatividade.RamoAtividade create(String nome, int cnae, int ramoSuperior)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: RamoAtividade
	 */
	public br.smat.ejb.ramoatividade.RamoAtividade findByPrimaryKey(
		br.smat.ejb.ramoatividade.RamoAtividadeKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllRamosAtividade()
		throws FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllRamosAtividade(
		int ramoAtividadeSuperior)
		throws FinderException, java.rmi.RemoteException;
}
