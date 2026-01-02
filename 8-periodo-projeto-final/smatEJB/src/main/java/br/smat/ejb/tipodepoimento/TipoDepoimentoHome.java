package br.smat.ejb.tipodepoimento;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: TipoDepoimento
 */
public interface TipoDepoimentoHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: TipoDepoimento
	 */
	public br.smat.ejb.tipodepoimento.TipoDepoimento create(String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: TipoDepoimento
	 */
	public br.smat.ejb.tipodepoimento.TipoDepoimento findByPrimaryKey(
		br.smat.ejb.tipodepoimento.TipoDepoimentoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllTiposDepoimento()
		throws FinderException, java.rmi.RemoteException;
}
