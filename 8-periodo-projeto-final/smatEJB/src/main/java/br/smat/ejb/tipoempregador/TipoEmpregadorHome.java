package br.smat.ejb.tipoempregador;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: TipoEmpregador
 */
public interface TipoEmpregadorHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: TipoEmpregador
	 */
	public br.smat.ejb.tipoempregador.TipoEmpregador create(String nome,String docIdentificador)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: TipoEmpregador
	 */
	public br.smat.ejb.tipoempregador.TipoEmpregador findByPrimaryKey(
		br.smat.ejb.tipoempregador.TipoEmpregadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllTiposEmpregadores()
		throws FinderException, java.rmi.RemoteException;
}
