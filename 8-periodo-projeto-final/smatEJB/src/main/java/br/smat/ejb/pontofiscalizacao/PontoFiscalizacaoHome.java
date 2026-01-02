package br.smat.ejb.pontofiscalizacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey;
/**
 * Home interface for Enterprise Bean: PontoFiscalizacao
 */
public interface PontoFiscalizacaoHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: PontoFiscalizacao
	 */
	public br.smat.ejb.pontofiscalizacao.PontoFiscalizacao findByPrimaryKey(
		br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllPontoFiscalizacao()
		throws FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.pontofiscalizacao.PontoFiscalizacao create(
		String nome,
		String descricao,int ramoAtividade)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	public java.util.Collection findAllPontoFiscalizacao(int ramoAtividade)
		throws FinderException, java.rmi.RemoteException;
}
