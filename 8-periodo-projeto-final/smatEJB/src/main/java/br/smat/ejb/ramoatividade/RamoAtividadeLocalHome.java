package br.smat.ejb.ramoatividade;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: RamoAtividade
 */
public interface RamoAtividadeLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: RamoAtividade
	 */
	public br.smat.ejb.ramoatividade.RamoAtividadeLocal create(String nome, int cnae, int ramoSuperior)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: RamoAtividade
	 */
	public br.smat.ejb.ramoatividade.RamoAtividadeLocal findByPrimaryKey(
		br.smat.ejb.ramoatividade.RamoAtividadeKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllRamosAtividade() throws FinderException;
	public java.util.Collection findAllRamosAtividade(
		int ramoAtividadeSuperior)
		throws FinderException;
}
