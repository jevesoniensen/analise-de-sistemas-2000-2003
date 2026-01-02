package br.smat.ejb.investigacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.investigacao.InvestigacaoKey;
/**
 * Home interface for Enterprise Bean: Investigacao
 */
public interface InvestigacaoHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: Investigacao
	 */
	public br.smat.ejb.investigacao.Investigacao findByPrimaryKey(
		br.smat.ejb.investigacao.InvestigacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllInvestigacao()
		throws FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.investigacao.Investigacao create(
		int agenteSaude,
		int acidente,
		String titulo,
		String obsGerais)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * ejbFindByAcidente
	 */
	public br.smat.ejb.investigacao.Investigacao findByAcidente(int acidente)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
}
