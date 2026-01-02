package br.smat.ejb.tipodepoimento;
import javax.ejb.CreateException;
import br.smat.ejb.tipodepoimento.TipoDepoimentoKey;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: TipoDepoimento
 */
public interface TipoDepoimentoLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: TipoDepoimento
	 */
	public br.smat.ejb.tipodepoimento.TipoDepoimentoLocal findByPrimaryKey(
		br.smat.ejb.tipodepoimento.TipoDepoimentoKey primaryKey)
		throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.tipodepoimento.TipoDepoimentoLocal create(String nome)
		throws CreateException;

	public java.util.Collection findAllTiposDepoimento()
		throws FinderException;
}
