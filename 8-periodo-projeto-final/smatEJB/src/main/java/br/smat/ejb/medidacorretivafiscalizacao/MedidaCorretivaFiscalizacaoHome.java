package br.smat.ejb.medidacorretivafiscalizacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.medidacorretivafiscalizacao.MedidaCorretivaFiscalizacaoKey;
/**
 * Home interface for Enterprise Bean: MedidaCorretivaFiscalizacao
 */
public interface MedidaCorretivaFiscalizacaoHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: MedidaCorretivaFiscalizacao
	 */
	public br
		.smat
		.ejb
		.medidacorretivafiscalizacao
		.MedidaCorretivaFiscalizacao findByPrimaryKey(
			br
				.smat
				.ejb
				.medidacorretivafiscalizacao
				.MedidaCorretivaFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;

	/**
	 * ejbCreate
	 */
	public br
		.smat
		.ejb
		.medidacorretivafiscalizacao
		.MedidaCorretivaFiscalizacao create(
			int tramiteFiscalizacao,
			int fiscalizacao,
			int tipoMedidaCorretiva,
			int prazoDias,
			String observacao)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	public java.util.Collection findAllMedidaCorretivaFiscalizacao(
		int tramiteFiscalizacao,
		int fiscalizacao)
		throws FinderException, java.rmi.RemoteException;
}
