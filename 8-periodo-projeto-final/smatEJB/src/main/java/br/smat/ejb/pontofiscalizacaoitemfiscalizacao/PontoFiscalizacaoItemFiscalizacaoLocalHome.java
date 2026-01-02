package br.smat.ejb.pontofiscalizacaoitemfiscalizacao;
import br.smat.ejb.pontofiscalizacaoitemfiscalizacao.PontoFiscalizacaoItemFiscalizacaoKey;
/**
 * Local Home interface for Enterprise Bean: PontoFiscalizacaoItemFiscalizacao
 */
public interface PontoFiscalizacaoItemFiscalizacaoLocalHome
	extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: PontoFiscalizacaoItemFiscalizacao
	 */
	public br
		.smat
		.ejb
		.pontofiscalizacaoitemfiscalizacao
		.PontoFiscalizacaoItemFiscalizacaoLocal findByPrimaryKey(
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public br
		.smat
		.ejb
		.pontofiscalizacaoitemfiscalizacao
		.PontoFiscalizacaoItemFiscalizacaoLocal create(
			int pontoFiscalizacao,
			int itemFiscalizacao)
		throws javax.ejb.CreateException;
}
