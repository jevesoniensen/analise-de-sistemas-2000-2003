package br.smat.ejb.roteiros;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Roteiros
 */
public interface RoteirosLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: Roteiros
	 */
	public br.smat.ejb.roteiros.RoteirosLocal findByPrimaryKey(
		br.smat.ejb.roteiros.RoteirosKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllRoteiros(
		int tramiteFiscalizacao,
		int fiscalizacao)
		throws FinderException;

	/**
	 * ejbCreate
	 */
	public br.smat.ejb.roteiros.RoteirosLocal create(
		int tramiteFiscalizacao,
		int fiscalizacao,
		int itemFiscalizacao,
		int grauConformidade,
		String nome)
		throws javax.ejb.CreateException;
	public java.util.Collection findAllItemLastTramite(int fiscalizacao)
		throws FinderException;
}
