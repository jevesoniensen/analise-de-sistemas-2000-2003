package br.smat.ejb.regional;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Regional
 */
public interface RegionalHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Regional
	 */
	public br.smat.ejb.regional.Regional create(int 	municipio,
												 int	estado,
												 String 	nome,
												 int 	numero,
												 String 	rua,
												 String 	bairro,
												 String 	cep,
												 String 	complemento)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Regional
	 */
	public br.smat.ejb.regional.Regional findByPrimaryKey(
		br.smat.ejb.regional.RegionalKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllRegionais()
		throws FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllRegionais(int estado)
		throws FinderException, java.rmi.RemoteException;
}
