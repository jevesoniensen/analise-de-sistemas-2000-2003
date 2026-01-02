package br.smat.ejb.fiscalizacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.fiscalizacao.FiscalizacaoKey;
/**
 * Local Home interface for Enterprise Bean: Fiscalizacao
 */
public interface FiscalizacaoLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: Fiscalizacao
	 */
	public br.smat.ejb.fiscalizacao.FiscalizacaoLocal findByPrimaryKey(
		br.smat.ejb.fiscalizacao.FiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllFiscalizacao() throws FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.fiscalizacao.FiscalizacaoLocal create(
		int agenteSaude,
		int empregador,
		String titulo,
		String obsGerais)
		throws javax.ejb.CreateException;
}
