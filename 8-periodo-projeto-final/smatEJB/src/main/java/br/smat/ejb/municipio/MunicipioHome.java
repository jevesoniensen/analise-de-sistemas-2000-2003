package br.smat.ejb.municipio;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Municipio
 */
public interface MunicipioHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Municipio
	 */
	public br.smat.ejb.municipio.Municipio create( int    regional,
  							    					String  nome,
													String 	sigla,
													int	populacao)throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Municipio
	 */
	public br.smat.ejb.municipio.Municipio findByPrimaryKey(
		br.smat.ejb.municipio.MunicipioKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllMunicipios()
		throws FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllMunicipios(int estado)
		throws FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllMunicipiosByRegional(int regional)
		throws FinderException, java.rmi.RemoteException;
}
