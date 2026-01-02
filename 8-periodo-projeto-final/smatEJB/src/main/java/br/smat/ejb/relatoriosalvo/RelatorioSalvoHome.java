package br.smat.ejb.relatoriosalvo;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: RelatorioSalvo
 */
public interface RelatorioSalvoHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: RelatorioSalvo
	 */
	public RelatorioSalvo create(int tipoAgrupamento,
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
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: RelatorioSalvo
	 */
	public br.smat.ejb.relatoriosalvo.RelatorioSalvo findByPrimaryKey(
		br.smat.ejb.relatoriosalvo.RelatorioSalvoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllRelatorios()
		throws FinderException, java.rmi.RemoteException;
}
