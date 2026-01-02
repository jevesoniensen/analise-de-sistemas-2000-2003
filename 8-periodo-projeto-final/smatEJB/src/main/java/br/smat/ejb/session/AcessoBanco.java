package br.smat.ejb.session;
/**
 * Remote interface for Enterprise Bean: AcessoBanco
 */
public interface AcessoBanco extends javax.ejb.EJBObject {
	public void cadastraAcidente()
		throws java.rmi.RemoteException;
}
