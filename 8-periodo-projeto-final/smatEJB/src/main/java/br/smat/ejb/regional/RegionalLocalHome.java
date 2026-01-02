package br.smat.ejb.regional;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Regional
 */
public interface RegionalLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Regional
	 */
	public br.smat.ejb.regional.RegionalLocal create(int 		municipio,
													  int		estado,
													  String 	nome,
												 	  int 		numero,
												 	  String 	rua,
												 	  String 	bairro,
												 	  String 	cep,
												 	  String 	complemento)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Regional
	 */
	public br.smat.ejb.regional.RegionalLocal findByPrimaryKey(
		br.smat.ejb.regional.RegionalKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllRegionais() throws FinderException;
	public java.util.Collection findAllRegionais(int estado)
		throws FinderException;
}
