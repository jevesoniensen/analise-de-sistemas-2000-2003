package br.smat.ejb.fiscalizacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.fiscalizacao.FiscalizacaoKey;
/**
 * Home interface for Enterprise Bean: Fiscalizacao
 */
public interface FiscalizacaoHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: Fiscalizacao
	 */
	public br.smat.ejb.fiscalizacao.Fiscalizacao findByPrimaryKey(
		br.smat.ejb.fiscalizacao.FiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllFiscalizacao()
		throws FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.fiscalizacao.Fiscalizacao create(
		int agenteSaude,
		int empregador,
		String titulo,
		String obsGerais)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
