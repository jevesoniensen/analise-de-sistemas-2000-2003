package br.smat.ejb.tramitefiscalizacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey;
/**
 * Home interface for Enterprise Bean: TramiteFiscalizacao
 */
public interface TramiteFiscalizacaoHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: TramiteFiscalizacao
	 */
	public br
		.smat
		.ejb
		.tramitefiscalizacao
		.TramiteFiscalizacao findByPrimaryKey(
		br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;

	/**
	 * ejbCreate
	 */
	public br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacao create(
		int fiscalizacao,
		int status)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	public java.util.Collection findAllTramitesFiscalizacao(int fiscalizacao)
		throws FinderException, java.rmi.RemoteException;
}
