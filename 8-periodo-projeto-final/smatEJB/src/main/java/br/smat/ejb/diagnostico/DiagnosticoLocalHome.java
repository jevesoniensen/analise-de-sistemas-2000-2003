package br.smat.ejb.diagnostico;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Diagnostico
 */
public interface DiagnosticoLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Diagnostico
	 */
	public DiagnosticoLocal create(String nome,int cid10)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Diagnostico
	 */
	public DiagnosticoLocal findByPrimaryKey(
		DiagnosticoKey primaryKey)
		throws javax.ejb.FinderException;

	public java.util.Collection findAllDiagnosticos() throws FinderException;
}
