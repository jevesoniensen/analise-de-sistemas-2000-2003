package br.smat.ejb.monitor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.campo.CampoKey;

/**
 * Bean implementation class for Enterprise Bean: Monitor
 */
public class MonitorBean implements javax.ejb.EntityBean {

	private javax.ejb.EntityContext ctx;

	private int 		monitor;
	private int 		periodicidade;
	private CampoKey 	campo;		
	private int		queryCampo;	
	private int		maxAcidente;
	private String		ultimaDataExecucao;	
	
	private boolean atualiza;

	/**
	 * Returns the campo.
	 * @return CampoKey
	 */
	public CampoKey getCampo() {
		atualiza = false;
		return campo;
	}

	/**
	 * Returns the maxAcidente.
	 * @return int
	 */
	public int getMaxAcidente() {
		atualiza = false;		
		return maxAcidente;
	}

	/**
	 * Returns the monitor.
	 * @return int
	 */
	public int getMonitor() {
		atualiza = false;		
		return monitor;
	}

	/**
	 * Returns the periodicidade.
	 * @return int
	 */
	public int getPeriodicidade() {
		atualiza = false;		
		return periodicidade;
	}

	/**
	 * Returns the queryCampo.
	 * @return int
	 */
	public int getQueryCampo() {
		atualiza = false;		
		return queryCampo;
	}

	/**
	 * Returns the ultimaDataExecucao.
	 * @return String
	 */
	public String getUltimaDataExecucao() {
		atualiza = false;		
		return ultimaDataExecucao;
	}

	/**
	 * Sets the campo.
	 * @param campo The campo to set
	 */
	public void setCampo(CampoKey campo) {
		atualiza = true;		
		this.campo = campo;
	}

	/**
	 * Sets the maxAcidente.
	 * @param maxAcidente The maxAcidente to set
	 */
	public void setMaxAcidente(int maxAcidente) {
		atualiza = true;				
		this.maxAcidente = maxAcidente;
	}

	/**
	 * Sets the monitor.
	 * @param monitor The monitor to set
	 */
	public void setMonitor(int monitor) {
		atualiza = true;				
		this.monitor = monitor;
	}

	/**
	 * Sets the periodicidade.
	 * @param periodicidade The periodicidade to set
	 */
	public void setPeriodicidade(int periodicidade) {
		atualiza = true;				
		this.periodicidade = periodicidade;
	}

	/**
	 * Sets the queryCampo.
	 * @param queryCampo The queryCampo to set
	 */
	public void setQueryCampo(int queryCampo) {
		atualiza = true;				
		this.queryCampo = queryCampo;
	}

	/**
	 * Sets the ultimaDataExecucao.
	 * @param ultimaDataExecucao The ultimaDataExecucao to set
	 */
	public void setUltimaDataExecucao(String ultimaDataExecucao) {
		atualiza = true;				
		this.ultimaDataExecucao = ultimaDataExecucao;
	}

	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		monitor = 0;
		periodicidade = 0;
		campo = null;		
		queryCampo  = 0;	
		maxAcidente = 0;
		ultimaDataExecucao = null;			
		atualiza = false;
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection conn = null;
		atualiza = false;
		try{
			conn = Conexao.getConnection();
			MonitorKey key = (MonitorKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_monitor ?,null");
		    stmt.setInt(1,key.monitor);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		monitor 			= rs.getInt("monitor");
				periodicidade 		= rs.getInt("periodicidade");
				campo				= new CampoKey(rs.getInt("campo"));				
				queryCampo			= rs.getInt("queryCampo");
				maxAcidente			= rs.getInt("maxAcidente");
				ultimaDataExecucao	= rs.getString("ultimaDataExecucao");

		    }
		    else{
			   throw new EJBException("MonitorBean ejbLoad");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
		   throw new EJBException("MonitorBean ejbLoad");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
			   throw new EJBException("MonitorBean ejbLoad");				
			}
		}		
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {
		Connection conn = null;
		atualiza = false;	
		try{
			conn = Conexao.getConnection();
			MonitorKey key = (MonitorKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_monitor ?");
		    stmt.setInt(1,key.monitor);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("MonitorBean ejbRemove");
		    }
		}
		catch(SQLException e){
			throw new EJBException("MonitorBean ejbRemove");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("MonitorBean ejbRemove");
			}
		}		
		
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
		if(atualiza){
			Connection conn = null;
			try{
				conn = Conexao.getConnection();
				MonitorKey key = (MonitorKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_monitor ?,?,?,?,?");
					
					
				stmt.setInt(1,monitor);
				stmt.setInt(2,periodicidade);
				stmt.setInt(3,campo.campo);
				stmt.setInt(4,maxAcidente);
				stmt.setInt(5,queryCampo);
								
			    int rs = stmt.executeUpdate();
	
		    
			    if(rs != 1){
			    	throw new EJBException("MonitorBean ejbStore "+rs);
			    }
			}
			catch(SQLException e){
				throw new EJBException("MonitorBean ejbStore ");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("MonitorBean ejbStore ");
				}
			}		
		}
		atualiza = false;		
	}
	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return ctx;
	}
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		this.ctx = ctx;
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		this.ctx = null;
	}
	/**
	 * ejbCreate
	 */
	public MonitorKey ejbCreate(int 	periodicidade,
								 int	campo,
								 int 	queryCampo,
								 int 	maxAcidente)
		throws javax.ejb.CreateException {
			Connection 	conn 	= null;			
			MonitorKey 	retVal  = null;
			atualiza = false;		
						
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_monitor null,?,?,?,?");

				stmt.setInt(1,periodicidade);
				stmt.setInt(2,campo);
				stmt.setInt(3,maxAcidente);
				stmt.setInt(4,queryCampo);												

				ResultSet rs = stmt.executeQuery();

				if(rs.next()){
					monitor = rs.getInt("monitor");
				}
				else
					throw new EJBException("MonitorBean ejbCreate");				
				
				setPeriodicidade(periodicidade);				
				setCampo(new CampoKey(campo));
				setMaxAcidente(maxAcidente);
				setQueryCampo(queryCampo);
			    
				retVal = new MonitorKey(monitor);
			}catch(SQLException e){
			//	System.out.println("****************************");
			//	System.out.println("******Medico Bean *****");
			//	e.printStackTrace();
			//	System.out.println("****************************");				
				throw new CreateException("MonitorBean ejbCreate " + e.getMessage());
			}
			
			finally{
				try{
					atualiza = false;
					conn.close();
				}
				catch(SQLException e){				
					throw new CreateException("MonitorBean ejbCreate "  + e.getMessage());					
				}
			}
			
			return retVal;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(int 	periodicidade,
								 int	campo,
								 int 	queryCampo,
								 int 	maxAcidente) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public MonitorKey ejbFindByPrimaryKey(MonitorKey key)
		throws javax.ejb.FinderException {

			atualiza = false;		
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_monitor ?,null");
				stmt.setInt(1,key.monitor);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("MonitorBean ejbFindByPrimaryKey  not found");
			}
			catch(SQLException e){
					throw new FinderException("MonitorBean ejbFindByPrimaryKey not found SQLException");
			}
			finally{
				atualiza = false;				
				try{			
					conn.close();
				}
				catch(Exception e){
					throw new EJBException("MonitorBean ejbFindByPrimaryKey");
				}
			}		

	}

	public Collection ejbFindAllMonitores() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_monitor");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new MonitorKey(rs.getInt("monitor")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("MonitorBean ejbFindAllMonitores");
		}
		finally{
			atualiza = false;			
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}		
	
	public int getNumAcidentes(){

			atualiza = false;		
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_monitor ?,?");
				stmt.setInt(1,monitor);
				stmt.setString(2,"A");
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return rs.getInt("countAcidente");
				return 0;
			}
			catch(SQLException e){
				return 0;
			}
			finally{
				atualiza = false;				
				try{			
					conn.close();
				}
				catch(Exception e){
					return 0;
				}
			}				
	}
}
