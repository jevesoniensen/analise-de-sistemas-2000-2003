package br.smat.ejb.medidacorretivafiscalizacao;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.medidacorretivafiscalizacao.MedidaCorretivaFiscalizacaoKey;
/**
 * Local Home interface for Enterprise Bean: MedidaCorretivaFiscalizacao
 */
public interface MedidaCorretivaFiscalizacaoLocalHome
	extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: MedidaCorretivaFiscalizacao
	 */
	public MedidaCorretivaFiscalizacaoLocal findByPrimaryKey(MedidaCorretivaFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException;

	/**
	 * ejbCreate
	 */
	public MedidaCorretivaFiscalizacaoLocal create(
			int tramiteFiscalizacao,
			int fiscalizacao,
			int tipoMedidaCorretiva,
			int prazoDias,
			String observacao)
		throws javax.ejb.CreateException;

	public java.util.Collection findAllMedidaCorretivaFiscalizacao(
		int tramiteFiscalizacao,
		int fiscalizacao)
		throws FinderException;
}
