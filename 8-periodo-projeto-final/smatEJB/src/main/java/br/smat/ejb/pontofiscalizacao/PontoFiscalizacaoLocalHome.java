package br.smat.ejb.pontofiscalizacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey;
/**
 * Local Home interface for Enterprise Bean: PontoFiscalizacao
 */
public interface PontoFiscalizacaoLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: PontoFiscalizacao
	 */
	public br
		.smat
		.ejb
		.pontofiscalizacao
		.PontoFiscalizacaoLocal findByPrimaryKey(
		br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllPontoFiscalizacao()
		throws FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoLocal create(
		String nome,
		String descricao,int ramoAtividade)
		throws javax.ejb.CreateException;
	public java.util.Collection findAllPontoFiscalizacao(int ramoAtividade)
		throws FinderException;
}
