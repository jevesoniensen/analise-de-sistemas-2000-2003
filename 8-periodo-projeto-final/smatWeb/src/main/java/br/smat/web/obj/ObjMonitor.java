package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.campo.CampoKey;
import br.smat.ejb.monitor.Monitor;
import br.smat.ejb.monitor.MonitorHome;
import br.smat.ejb.monitor.MonitorKey;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjMonitor {

	private int 		monitor;
	private int 		periodicidade;
	private int	 	campo;		
	private int		queryCampo;	
	private int		maxAcidente;
	private String		ultimaDataExecucao;	
	
	/**
	 * Constructor for ObjMonitor.
	 */
	public ObjMonitor() {
		super();
	}

	public ObjMonitor(	int	monitor,
						int 	periodicidade,
					 	int	campo,
					 	int 	queryCampo,
					 	int 	maxAcidente) {
		super();
		this.monitor 				= monitor;
		this.periodicidade 		= periodicidade;
		this.campo					= campo;
		this.queryCampo 			= queryCampo;
		this.maxAcidente 			= maxAcidente;
	}


	public ObjMonitor(	int	monitor,
						int 	periodicidade,
					 	int	campo,
					 	int 	queryCampo,
					 	int 	maxAcidente,
					 	String	ultimaDataExecucao) {
		super();
		this.monitor 				= monitor;
		this.periodicidade 		= periodicidade;
		this.campo					= campo;
		this.queryCampo 			= queryCampo;
		this.maxAcidente 			= maxAcidente;
		this.ultimaDataExecucao 	= ultimaDataExecucao;		
	}
	
	public static Monitor[] findAllMonitor() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				MonitorHome home = (MonitorHome)ctx.lookup("ejb/br/smat/ejb/monitor/MonitorHome");
					try {
						col = (Collection)home.findAllMonitores();
					} catch (RemoteException e) {
						throw new Exception(" ObjMonitor findAllMonitor RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjMonitor findAllMonitor FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjMonitor findAllMonitor Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjMonitor findAllMonitor NamingException=> " + e.getMessage());
			}
			return (Monitor[])col.toArray(new Monitor[0]);			 		
	}
	
	public static Monitor findByPrimaryKey(int monitor) throws Exception{		
			InitialContext ctx;
			Monitor mo = null;
			try {
				ctx = new InitialContext();
				MonitorHome home = (MonitorHome)ctx.lookup("ejb/br/smat/ejb/monitor/MonitorHome");
					try {
						mo = home.findByPrimaryKey(new MonitorKey(monitor));
					} catch (RemoteException e) {
						throw new Exception(" ObjMonitor findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjMonitor findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjMonitor findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjMonitor findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return mo;			 		
	}	
	
	
	public void save() throws Exception{
		
		try {
			InitialContext ctx = new InitialContext();
					
			MonitorHome home = (MonitorHome)ctx.lookup("ejb/br/smat/ejb/monitor/MonitorHome");
			Monitor monitorH = null;		
			
			if(this.monitor == 0){
				monitorH = home.create(periodicidade,campo,queryCampo,maxAcidente);	
				monitor = monitorH.getMonitor();
			}
			else{
				monitorH = home.findByPrimaryKey(new MonitorKey(monitor));

				monitorH.setPeriodicidade(periodicidade);
				monitorH.setCampo(new CampoKey(campo));
				monitorH.setQueryCampo(queryCampo);
				monitorH.setMaxAcidente(maxAcidente);
			}

		} catch (CreateException e) {		
			throw new Exception("ObjMonitor save Exception=> " + e.getMessage());	
		} catch (RemoteException e) {
			throw new Exception("ObjMonitor save Exception=> " + e.getMessage());
		} catch (NamingException e) {
			throw new Exception("ObjMonitor save Exception=> " + e.getMessage());
		} catch (FinderException e) {
			throw new Exception("ObjMonitor save Exception=> " + e.getMessage());
		}			
	}


	public void remove() throws Exception{
		
		try {
			InitialContext ctx = new InitialContext();
					
			MonitorHome home = (MonitorHome)ctx.lookup("ejb/br/smat/ejb/monitor/MonitorHome");
			Monitor monitorH = null;		
			
			monitorH = home.findByPrimaryKey(new MonitorKey(monitor));

			monitorH.remove();
			
		} catch (RemoteException e) {
			throw new Exception("ObjMonitor save Exception=> " + e.getMessage());
		} catch (NamingException e) {
			throw new Exception("ObjMonitor save Exception=> " + e.getMessage());
		} catch (FinderException e) {
			throw new Exception("ObjMonitor save Exception=> " + e.getMessage());			
		}			
	}
	
	/**
	 * Returns the campo.
	 * @return int
	 */
	public int getCampo() {
		return campo;
	}

	/**
	 * Returns the maxAcidente.
	 * @return int
	 */
	public int getMaxAcidente() {
		return maxAcidente;
	}

	/**
	 * Returns the monitor.
	 * @return int
	 */
	public int getMonitor() {
		return monitor;
	}

	/**
	 * Returns the periodicidade.
	 * @return int
	 */
	public int getPeriodicidade() {
		return periodicidade;
	}

	/**
	 * Returns the queryCampo.
	 * @return int
	 */
	public int getQueryCampo() {
		return queryCampo;
	}

	/**
	 * Returns the ultimaDataExecucao.
	 * @return String
	 */
	public String getUltimaDataExecucao() {
		return ultimaDataExecucao;
	}

	/**
	 * Sets the campo.
	 * @param campo The campo to set
	 */
	public void setCampo(int campo) {
		this.campo = campo;
	}

	/**
	 * Sets the maxAcidente.
	 * @param maxAcidente The maxAcidente to set
	 */
	public void setMaxAcidente(int maxAcidente) {
		this.maxAcidente = maxAcidente;
	}

	/**
	 * Sets the monitor.
	 * @param monitor The monitor to set
	 */
	public void setMonitor(int monitor) {
		this.monitor = monitor;
	}

	/**
	 * Sets the periodicidade.
	 * @param periodicidade The periodicidade to set
	 */
	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}

	/**
	 * Sets the queryCampo.
	 * @param queryCampo The queryCampo to set
	 */
	public void setQueryCampo(int queryCampo) {
		this.queryCampo = queryCampo;
	}

	/**
	 * Sets the ultimaDataExecucao.
	 * @param ultimaDataExecucao The ultimaDataExecucao to set
	 */
	public void setUltimaDataExecucao(String ultimaDataExecucao) {
		this.ultimaDataExecucao = ultimaDataExecucao;
	}

}
