package br.smat.ejb.tramitefiscalizacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey;
/**
 * Local Home interface for Enterprise Bean: TramiteFiscalizacao
 */
public interface TramiteFiscalizacaoLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: TramiteFiscalizacao
	 */
	public br
		.smat
		.ejb
		.tramitefiscalizacao
		.TramiteFiscalizacaoLocal findByPrimaryKey(
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException;

	/**
	 * ejbCreate
	 */
	public br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoLocal create(
		int fiscalizacao,
		int status)
		throws javax.ejb.CreateException;
	public java.util.Collection findAllTramitesFiscalizacao(int fiscalizacao)
		throws FinderException;
}
