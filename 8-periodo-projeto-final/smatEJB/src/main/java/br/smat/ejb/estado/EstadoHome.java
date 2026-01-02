package br.smat.ejb.estado;

import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Estado
 */
public interface EstadoHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Estado
	 */
	public Estado create(String nome, String sigla)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Estado
	 */
	public Estado findByPrimaryKey(EstadoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
		
	public java.util.Collection findAllEstados()
		throws FinderException, java.rmi.RemoteException;
}
