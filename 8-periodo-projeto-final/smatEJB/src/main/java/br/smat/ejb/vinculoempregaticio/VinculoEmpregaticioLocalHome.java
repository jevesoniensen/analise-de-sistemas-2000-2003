package br.smat.ejb.vinculoempregaticio;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: VinculoEmpregaticio
 */
public interface VinculoEmpregaticioLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: VinculoEmpregaticio
	 */
	public VinculoEmpregaticioLocal create(String nome)
		throws javax.ejb.CreateException;
		
	/**
	 * Finds an instance using a key for Entity Bean: VinculoEmpregaticio
	 */
	public VinculoEmpregaticioLocal findByPrimaryKey(VinculoEmpregaticioKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllVinculosEmpregaticios()
		throws FinderException;
}
