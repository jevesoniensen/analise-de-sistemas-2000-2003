package br.smat.ejb.tipomedidacorretiva;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey;
/**
 * Local Home interface for Enterprise Bean: TipoMedidaCorretiva
 */
public interface TipoMedidaCorretivaLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: TipoMedidaCorretiva
	 */
	public TipoMedidaCorretivaLocal findByPrimaryKey(TipoMedidaCorretivaKey primaryKey)
		throws javax.ejb.FinderException;
		
	public java.util.Collection findAllTipoMedidaCorretiva()
		throws FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaLocal create(String nome,String descricao)
		throws javax.ejb.CreateException;
}
