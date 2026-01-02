package br.smat.ejb.medidacorretivainvestigacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.medidacorretivainvestigacao.MedidaCorretivaInvestigacaoKey;
/**
 * Home interface for Enterprise Bean: MedidaCorretivaInvestigacao
 */
public interface MedidaCorretivaInvestigacaoHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: MedidaCorretivaInvestigacao
	 */
	public MedidaCorretivaInvestigacao findByPrimaryKey (MedidaCorretivaInvestigacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllMedidaCorretivaInvestigacao(
		int investigacao)
		throws FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public MedidaCorretivaInvestigacao create(
			int investigacao,
			int tipoMedidaCorretiva,
			int prazoDias,
			String observacao)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
