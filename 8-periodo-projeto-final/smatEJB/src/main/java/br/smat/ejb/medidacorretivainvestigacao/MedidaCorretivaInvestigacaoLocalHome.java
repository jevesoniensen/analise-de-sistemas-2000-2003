package br.smat.ejb.medidacorretivainvestigacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.medidacorretivainvestigacao.MedidaCorretivaInvestigacaoKey;
/**
 * Local Home interface for Enterprise Bean: MedidaCorretivaInvestigacao
 */
public interface MedidaCorretivaInvestigacaoLocalHome
	extends javax.ejb.EJBLocalHome {
	/**
	 * Finds an instance using a key for Entity Bean: MedidaCorretivaInvestigacao
	 */
	public MedidaCorretivaInvestigacaoLocal findByPrimaryKey (MedidaCorretivaInvestigacaoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllMedidaCorretivaInvestigacao(
		int investigacao)
		throws FinderException;
	/**
	 * ejbCreate
	 */
	public MedidaCorretivaInvestigacaoLocal create(
			int investigacao,
			int tipoMedidaCorretiva,
			int prazoDias,
			String observacao)
		throws javax.ejb.CreateException;
}
