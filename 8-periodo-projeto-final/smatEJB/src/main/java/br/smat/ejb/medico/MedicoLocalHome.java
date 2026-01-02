package br.smat.ejb.medico;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Medico
 */
public interface MedicoLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Medico
	 */
	public br.smat.ejb.medico.MedicoLocal create(String nome,int crm, int ufCRM)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Medico
	 */
	public br.smat.ejb.medico.MedicoLocal findByPrimaryKey(
		br.smat.ejb.medico.MedicoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllMedicos() throws FinderException;
}
