package br.smat.ejb.pontofiscalizacaoramotividade;
import br.smat.ejb.pontofiscalizacaoramotividade.PontoFiscalizacaoRamoAtividadeKey;
/**
 * Local Home interface for Enterprise Bean: PontoFiscalizacaoRamoAtividade
 */
public interface PontoFiscalizacaoRamoAtividadeLocalHome
	extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: PontoFiscalizacaoRamoAtividade
	 */
	public br
		.smat
		.ejb
		.pontofiscalizacaoramotividade
		.PontoFiscalizacaoRamoAtividadeLocal findByPrimaryKey(
			br
				.smat
				.ejb
				.pontofiscalizacaoramotividade
				.PontoFiscalizacaoRamoAtividadeKey primaryKey)
		throws javax.ejb.FinderException;
	/**
	 * ejbCreate
	 */
	public br
		.smat
		.ejb
		.pontofiscalizacaoramotividade
		.PontoFiscalizacaoRamoAtividadeLocal create(
			int pontoFiscalizacao,
			int ramoAtividade)
		throws javax.ejb.CreateException;
}
