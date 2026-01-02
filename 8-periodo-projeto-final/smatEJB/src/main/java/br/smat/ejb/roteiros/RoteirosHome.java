package br.smat.ejb.roteiros;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Roteiros
 */
public interface RoteirosHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: Roteiros
	 */
	public br.smat.ejb.roteiros.Roteiros findByPrimaryKey(
		br.smat.ejb.roteiros.RoteirosKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllRoteiros(
		int tramiteFiscalizacao,
		int fiscalizacao)
		throws FinderException, java.rmi.RemoteException;

	/**
	 * ejbCreate
	 */
	public br.smat.ejb.roteiros.Roteiros create(
		int tramiteFiscalizacao,
		int fiscalizacao,
		int itemFiscalizacao,
		int grauConformidade,
		String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	public java.util.Collection findAllItemLastTramite(int fiscalizacao)
		throws FinderException, java.rmi.RemoteException;
}
