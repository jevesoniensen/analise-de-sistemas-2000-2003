package br.smat.ejb.estadocivil;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: EstadoCivil
 */
public interface EstadoCivilLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: EstadoCivil
	 */
	public EstadoCivilLocal create(String nome)
		throws javax.ejb.CreateException;	
	/**
	 * Finds an instance using a key for Entity Bean: EstadoCivil
	 */
	public EstadoCivilLocal findByPrimaryKey(EstadoCivilKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllEstadosCivis() throws FinderException;
}
