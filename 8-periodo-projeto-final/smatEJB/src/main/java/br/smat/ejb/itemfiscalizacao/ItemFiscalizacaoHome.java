package br.smat.ejb.itemfiscalizacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey;
/**
 * Home interface for Enterprise Bean: ItemFiscalizacao
 */
public interface ItemFiscalizacaoHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: ItemFiscalizacao
	 */
	public br.smat.ejb.itemfiscalizacao.ItemFiscalizacao findByPrimaryKey(
		br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.itemfiscalizacao.ItemFiscalizacao create(String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	public java.util.Collection findAllItemFiscalizacao()
		throws FinderException, java.rmi.RemoteException;
}
