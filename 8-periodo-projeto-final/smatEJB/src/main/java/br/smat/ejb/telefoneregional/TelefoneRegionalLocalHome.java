package br.smat.ejb.telefoneregional;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: TelefoneRegional
 */
public interface TelefoneRegionalLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: TelefoneRegional
	 */
	public br.smat.ejb.telefoneregional.TelefoneRegionalLocal create(int regional,
								                                      String descricao,
																	  String numero,
																	  String ddd)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: TelefoneRegional
	 */
	public br.smat.ejb.telefoneregional.TelefoneRegionalLocal findByPrimaryKey(
		br.smat.ejb.telefoneregional.TelefoneRegionalKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllTelefonesRegionais(int regional)
		throws FinderException;
}
