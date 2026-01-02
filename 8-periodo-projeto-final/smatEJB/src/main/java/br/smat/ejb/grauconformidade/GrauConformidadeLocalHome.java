package br.smat.ejb.grauconformidade;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: GrauConformidade
 */
public interface GrauConformidadeLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: GrauConformidade
	 */
	public br.smat.ejb.grauconformidade.GrauConformidadeLocal findByPrimaryKey(
		br.smat.ejb.grauconformidade.GrauConformidadeKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllTipoAcidente() throws FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.grauconformidade.GrauConformidadeLocal create(
		String nome,
		String descricao)
		throws javax.ejb.CreateException;
}
