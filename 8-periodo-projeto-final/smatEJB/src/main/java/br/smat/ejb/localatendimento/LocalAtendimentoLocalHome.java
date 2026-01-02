package br.smat.ejb.localatendimento;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: LocalAtendimento
 */
public interface LocalAtendimentoLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: LocalAtendimento
	 */
	public br.smat.ejb.localatendimento.LocalAtendimentoLocal create(String nome, int municipio)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: LocalAtendimento
	 */
	public br.smat.ejb.localatendimento.LocalAtendimentoLocal findByPrimaryKey(
		br.smat.ejb.localatendimento.LocalAtendimentoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllLocaisAtendimento()
		throws FinderException;
}
