package br.smat.ejb.telefoneempregador;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: TelefoneEmpregador
 */
public interface TelefoneEmpregadorHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: TelefoneEmpregador
	 */
	public br.smat.ejb.telefoneempregador.TelefoneEmpregador create(int empregador,
																	 String descricao,
							  										 String numero,
																	 String ddd)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: TelefoneEmpregador
	 */
	public br.smat.ejb.telefoneempregador.TelefoneEmpregador findByPrimaryKey(
		br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllTelefonesEmpregadores(int empregador)
		throws FinderException, java.rmi.RemoteException;
}
