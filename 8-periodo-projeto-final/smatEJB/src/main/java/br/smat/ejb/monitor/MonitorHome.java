package br.smat.ejb.monitor;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.monitor.MonitorKey;
/**
 * Home interface for Enterprise Bean: Monitor
 */
public interface MonitorHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: Monitor
	 */
	public br.smat.ejb.monitor.Monitor findByPrimaryKey(
		br.smat.ejb.monitor.MonitorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllMonitores()
		throws FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.monitor.Monitor create(
		int periodicidade,
		int campo,
		int queryCampo,
		int maxAcidente)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
}
