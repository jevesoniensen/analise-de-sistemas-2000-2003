package br.smat.ejb.ocupacao;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Ocupacao
 */
public interface OcupacaoHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Ocupacao
	 */
	public br.smat.ejb.ocupacao.Ocupacao create(String nome, int cbo)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Ocupacao
	 */
	public br.smat.ejb.ocupacao.Ocupacao findByPrimaryKey(
		br.smat.ejb.ocupacao.OcupacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllOcupacoes()
		throws FinderException, java.rmi.RemoteException;
}
