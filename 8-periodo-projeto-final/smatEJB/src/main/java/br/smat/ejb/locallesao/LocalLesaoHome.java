package br.smat.ejb.locallesao;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: LocalLesao
 */
public interface LocalLesaoHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: LocalLesao
	 */
	public br.smat.ejb.locallesao.LocalLesao create(String nome, int localLesaoPai)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: LocalLesao
	 */
	public br.smat.ejb.locallesao.LocalLesao findByPrimaryKey(
		br.smat.ejb.locallesao.LocalLesaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllLocaisLesao()
		throws FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllLocaisLesao(int pai)
		throws FinderException, java.rmi.RemoteException;
}
