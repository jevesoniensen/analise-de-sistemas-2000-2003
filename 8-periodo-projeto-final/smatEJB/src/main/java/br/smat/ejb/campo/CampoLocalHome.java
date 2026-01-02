package br.smat.ejb.campo;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Campo
 */
public interface CampoLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Campo
	 */
	public br.smat.ejb.campo.CampoLocal create(String tabela,
								String coluna,
								String pai,
								String nome,
								String label)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Campo
	 */
	public br.smat.ejb.campo.CampoLocal findByPrimaryKey(
		br.smat.ejb.campo.CampoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllCampos() throws FinderException;
	public java.util.Collection findAllCampos(int campo1)
		throws FinderException;
}
