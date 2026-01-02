package br.smat.ejb.fonte;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Fonte
 */
public interface FonteLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Fonte
	 */
	public br.smat.ejb.fonte.FonteLocal create(String nome)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Fonte
	 */
	public br.smat.ejb.fonte.FonteLocal findByPrimaryKey(
		br.smat.ejb.fonte.FonteKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllFontes() throws FinderException;
}
