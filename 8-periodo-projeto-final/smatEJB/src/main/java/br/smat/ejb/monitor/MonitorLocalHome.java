package br.smat.ejb.monitor;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.monitor.MonitorKey;
/**
 * Local Home interface for Enterprise Bean: Monitor
 */
public interface MonitorLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: Monitor
	 */
	public br.smat.ejb.monitor.MonitorLocal findByPrimaryKey(
		br.smat.ejb.monitor.MonitorKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllMonitores() throws FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.monitor.MonitorLocal create(
		int periodicidade,
		int campo,
		int queryCampo,
		int maxAcidente)
		throws javax.ejb.CreateException;
}
