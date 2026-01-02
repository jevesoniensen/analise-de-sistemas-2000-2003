package br.smat.ejb.investigacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.investigacao.InvestigacaoKey;
/**
 * Local Home interface for Enterprise Bean: Investigacao
 */
public interface InvestigacaoLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: Investigacao
	 */
	public br.smat.ejb.investigacao.InvestigacaoLocal findByPrimaryKey(
		br.smat.ejb.investigacao.InvestigacaoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllInvestigacao() throws FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.investigacao.InvestigacaoLocal create(
		int agenteSaude,
		int acidente,
		String titulo,
		String obsGerais)
		throws javax.ejb.CreateException;
	/**
	 * ejbFindByAcidente
	 */
	public br.smat.ejb.investigacao.InvestigacaoLocal findByAcidente(
		int acidente)
		throws javax.ejb.FinderException;
}
