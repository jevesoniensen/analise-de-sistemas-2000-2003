package br.smat.ejb.tipolocalacidente;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: TipoLocalAcidente
 */
public interface TipoLocalAcidenteLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: TipoLocalAcidente
	 */
	public br.smat.ejb.tipolocalacidente.TipoLocalAcidenteLocal create(String nome)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: TipoLocalAcidente
	 */
	public br
		.smat
		.ejb
		.tipolocalacidente
		.TipoLocalAcidenteLocal findByPrimaryKey(
		br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllTiposLocalAcidente()
		throws FinderException;
}
