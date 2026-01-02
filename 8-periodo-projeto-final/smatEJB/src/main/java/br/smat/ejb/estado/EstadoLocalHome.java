package br.smat.ejb.estado;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Estado
 */
public interface EstadoLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Estado
	 */
	public EstadoLocal create(String nome,String sigla) throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Estado
	 */
	public EstadoLocal findByPrimaryKey(EstadoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllEstados() throws FinderException;
}
