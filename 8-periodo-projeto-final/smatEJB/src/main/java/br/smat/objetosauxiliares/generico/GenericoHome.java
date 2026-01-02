package br.smat.objetosauxiliares.generico;
/**
 * Home interface for Enterprise Bean: Generico
 */
public interface GenericoHome extends javax.ejb.EJBHome {
	/**
	 * Creates a default instance of Session Bean: Generico
	 */
	public br.smat.objetosauxiliares.generico.Generico create()
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
