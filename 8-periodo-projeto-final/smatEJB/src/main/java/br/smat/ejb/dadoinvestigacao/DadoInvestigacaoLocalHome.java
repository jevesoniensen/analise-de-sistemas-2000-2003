package br.smat.ejb.dadoinvestigacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey;
/**
 * Local Home interface for Enterprise Bean: DadoInvestigacao
 */
public interface DadoInvestigacaoLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: DadoInvestigacao
	 */
	public br.smat.ejb.dadoinvestigacao.DadoInvestigacaoLocal findByPrimaryKey(
		br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllDadoInvestigacao(int dadoInvestigacao)
		throws FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.dadoinvestigacao.DadoInvestigacaoLocal create(
		int investigacao,
		int pessoa,
		String dataHora,
		int agenteCausador,
		String descricao,
		int tipoDepoimento)
		throws javax.ejb.CreateException;
}
