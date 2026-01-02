package br.smat.ejb.relatoriosalvo;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: RelatorioSalvo
 */
public interface RelatorioSalvoLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: RelatorioSalvo
	 */
	public RelatorioSalvoLocal create(int tipoAgrupamento,
										int local,
										String queryLocal,
										int periodicidade,
										int campo1,
										String queryCampo1,
										int campo2,
										String queryCampo2,
										String dataInicio,
										String dataFim,
										String titulo,
										String texto)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: RelatorioSalvo
	 */
	public br.smat.ejb.relatoriosalvo.RelatorioSalvoLocal findByPrimaryKey(
		br.smat.ejb.relatoriosalvo.RelatorioSalvoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllRelatorios() throws FinderException;
}
