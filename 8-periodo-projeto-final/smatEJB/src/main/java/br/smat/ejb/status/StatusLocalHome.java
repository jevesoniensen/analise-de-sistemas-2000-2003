package br.smat.ejb.status;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Status
 */
public interface StatusLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: Status
	 */
	public br.smat.ejb.status.StatusLocal findByPrimaryKey(
		br.smat.ejb.status.StatusKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllStatus() throws FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.status.StatusLocal create(String nome, String descricao)
		throws javax.ejb.CreateException;
}
