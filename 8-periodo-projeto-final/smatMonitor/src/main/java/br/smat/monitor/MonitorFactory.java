package br.smat.monitor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import br.smat.conexao.ConnectDB;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class MonitorFactory {

	private ConnectDB conn;

	/**
	 * Constructor for MonitorFactory.
	 */
	public MonitorFactory() {
		super();
		try
		{
			conn = new ConnectDB();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}		
	}
	
	
	public Monitor[] getAllMonitor(){
		
		Vector v = new Vector();
			
		try {
			ResultSet rs = conn.selectDB("select monitor,periodicidade,campo,queryCampo,maxAcidente,convert(char(10),ultimaDataExecucao,103) +' ' +  convert(char(5),ultimaDataExecucao,8) as ultimaDataExecucao from monitores");
			
			while(rs.next()){
				v.add(new Monitor(	this,
									rs.getInt("monitor"),
									rs.getInt("periodicidade"),
									rs.getInt("campo"),
									rs.getInt("queryCampo"),
									rs.getInt("maxAcidente"),
									rs.getString("ultimaDataExecucao")));						
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return (Monitor[])v.toArray(new Monitor[0]);		
	}
	
	public int getNumAcidentes(int monitor){
		
		int numAcidentes = 0;
		String sql=null;

		try {
			
			sql = "exec sp_smat_listar_monitor " + monitor + ",'A'";
			
			ResultSet rs = conn.selectDB(sql);
			
			if(rs.next()){
				numAcidentes = rs.getInt("countAcidente");
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return numAcidentes;				
		
	}

}
