package br.smat.ejb.tipomedidacorretiva;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey;
/**
 * Home interface for Enterprise Bean: TipoMedidaCorretiva
 */
public interface TipoMedidaCorretivaHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: TipoMedidaCorretiva
	 */
	public TipoMedidaCorretiva findByPrimaryKey(TipoMedidaCorretivaKey key)
		throws javax.ejb.FinderException, java.rmi.RemoteException;

	public java.util.Collection findAllTipoMedidaCorretiva()
		throws FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretiva create(String nome,String descricao)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
