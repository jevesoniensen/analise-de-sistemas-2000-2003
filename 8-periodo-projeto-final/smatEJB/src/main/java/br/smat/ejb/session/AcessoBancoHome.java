package br.smat.ejb.session;
/**
 * Home interface for Enterprise Bean: AcessoBanco
 */
public interface AcessoBancoHome extends javax.ejb.EJBHome {
	/**
	 * Creates a default instance of Session Bean: AcessoBanco
	 */
	public br.smat.ejb.session.AcessoBanco create()
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
