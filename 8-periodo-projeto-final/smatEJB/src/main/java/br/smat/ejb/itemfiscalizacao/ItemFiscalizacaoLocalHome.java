package br.smat.ejb.itemfiscalizacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey;
/**
 * Local Home interface for Enterprise Bean: ItemFiscalizacao
 */
public interface ItemFiscalizacaoLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: ItemFiscalizacao
	 */
	public br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoLocal findByPrimaryKey(
		br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoLocal create(
		String nome)
		throws javax.ejb.CreateException;
	public java.util.Collection findAllItemFiscalizacao()
		throws FinderException;
}
