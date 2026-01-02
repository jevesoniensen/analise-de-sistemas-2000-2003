package br.smat.ejb.campo;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Campo
 */
public interface CampoHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Campo
	 */
	public br.smat.ejb.campo.Campo create(String tabela,
												 String coluna,
												 String pai,
												 String nome,
												 String label)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Campo
	 */
	public br.smat.ejb.campo.Campo findByPrimaryKey(
		br.smat.ejb.campo.CampoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllCampos()
		throws FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllCampos(int campo1)
		throws FinderException, java.rmi.RemoteException;
}
