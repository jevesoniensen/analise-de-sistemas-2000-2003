package br.smat.ejb.localatendimento;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: LocalAtendimento
 */
public interface LocalAtendimentoHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: LocalAtendimento
	 */
	public br.smat.ejb.localatendimento.LocalAtendimento create(String nome, int municipio)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: LocalAtendimento
	 */
	public br.smat.ejb.localatendimento.LocalAtendimento findByPrimaryKey(
		br.smat.ejb.localatendimento.LocalAtendimentoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllLocaisAtendimento()
		throws FinderException, java.rmi.RemoteException;
}
