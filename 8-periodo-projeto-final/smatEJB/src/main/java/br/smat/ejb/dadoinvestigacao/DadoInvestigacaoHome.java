package br.smat.ejb.dadoinvestigacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey;
/**
 * Home interface for Enterprise Bean: DadoInvestigacao
 */
public interface DadoInvestigacaoHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: DadoInvestigacao
	 */
	public br.smat.ejb.dadoinvestigacao.DadoInvestigacao findByPrimaryKey(
		br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllDadoInvestigacao(int dadoInvestigacao)
		throws FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.dadoinvestigacao.DadoInvestigacao create(
		int investigacao,
		int pessoa,
		String dataHora,
		int agenteCausador,
		String descricao,
		int tipoDepoimento)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
