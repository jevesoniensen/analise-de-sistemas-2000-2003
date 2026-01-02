package br.smat.ejb.session;
/**
 * Local Home interface for Enterprise Bean: AcessoBanco
 */
public interface AcessoBancoLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates a default instance of Session Bean: AcessoBanco
	 */
	public br.smat.ejb.session.AcessoBancoLocal create()
		throws javax.ejb.CreateException;
}
