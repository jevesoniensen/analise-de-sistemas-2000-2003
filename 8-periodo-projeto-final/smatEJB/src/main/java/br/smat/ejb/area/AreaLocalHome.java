package br.smat.ejb.area;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Area
 */
public interface AreaLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Area
	 */
	public br.smat.ejb.area.AreaLocal create(String nome)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Area
	 */
	public br.smat.ejb.area.AreaLocal findByPrimaryKey(
		br.smat.ejb.area.AreaKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllAreas() throws FinderException;
}
