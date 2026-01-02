package br.smat.ejb.municipio;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Municipio
 */
public interface MunicipioLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Municipio
	 */
	public br.smat.ejb.municipio.MunicipioLocal create( int    regional,
  							    						 String  nome,
														 String 	sigla,
														 int	populacao)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Municipio
	 */
	public br.smat.ejb.municipio.MunicipioLocal findByPrimaryKey(
		br.smat.ejb.municipio.MunicipioKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllMunicipios() throws FinderException;
	public java.util.Collection findAllMunicipios(int estado)
		throws FinderException;
	public java.util.Collection findAllMunicipiosByRegional(int regional)
		throws FinderException;
}
