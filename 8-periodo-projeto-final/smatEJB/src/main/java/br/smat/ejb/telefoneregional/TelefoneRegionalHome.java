package br.smat.ejb.telefoneregional;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: TelefoneRegional
 */
public interface TelefoneRegionalHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: TelefoneRegional
	 */
	public br.smat.ejb.telefoneregional.TelefoneRegional create( int regional,
							                                      String descricao,
																  String numero,
																  String ddd)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: TelefoneRegional
	 */
	public br.smat.ejb.telefoneregional.TelefoneRegional findByPrimaryKey(
		br.smat.ejb.telefoneregional.TelefoneRegionalKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllTelefonesRegionais(int regional)
		throws FinderException, java.rmi.RemoteException;
}
