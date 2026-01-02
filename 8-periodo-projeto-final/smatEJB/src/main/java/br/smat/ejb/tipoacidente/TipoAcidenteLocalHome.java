package br.smat.ejb.tipoacidente;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: TipoAcidente
 */
public interface TipoAcidenteLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: TipoAcidente
	 */
	public br.smat.ejb.tipoacidente.TipoAcidenteLocal create(String nome)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: TipoAcidente
	 */
	public br.smat.ejb.tipoacidente.TipoAcidenteLocal findByPrimaryKey(
		br.smat.ejb.tipoacidente.TipoAcidenteKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllTiposAcidente() throws FinderException;
}
