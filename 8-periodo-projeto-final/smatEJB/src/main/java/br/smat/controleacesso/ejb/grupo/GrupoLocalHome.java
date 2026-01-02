package br.smat.controleacesso.ejb.grupo;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.controleacesso.ejb.grupo.GrupoKey;
/**
 * Local Home interface for Enterprise Bean: Grupo
 */
public interface GrupoLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Finds an instance using a key for Entity Bean: Grupo
	 */
	public GrupoLocal findByPrimaryKey(GrupoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAll() throws FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.controleacesso.ejb.grupo.GrupoLocal create(String nome)
		throws javax.ejb.CreateException;
}
