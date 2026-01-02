package br.smat.ejb.pontofiscalizacaoitemfiscalizacao;
import br.smat.ejb.pontofiscalizacaoitemfiscalizacao.PontoFiscalizacaoItemFiscalizacaoKey;
/**
 * Home interface for Enterprise Bean: PontoFiscalizacaoItemFiscalizacao
 */
public interface PontoFiscalizacaoItemFiscalizacaoHome
	extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: PontoFiscalizacaoItemFiscalizacao
	 */
	public br
		.smat
		.ejb
		.pontofiscalizacaoitemfiscalizacao
		.PontoFiscalizacaoItemFiscalizacao findByPrimaryKey(
			br
				.smat
				.ejb
				.pontofiscalizacaoitemfiscalizacao
				.PontoFiscalizacaoItemFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public br
		.smat
		.ejb
		.pontofiscalizacaoitemfiscalizacao
		.PontoFiscalizacaoItemFiscalizacao create(
			int pontoFiscalizacao,
			int itemFiscalizacao)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
