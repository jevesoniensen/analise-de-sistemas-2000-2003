package br.smat.AgenteSaude;

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
public class AgenteSaudeFactory {

	private ConnectDB conn;

	/**
	 * Constructor for AgenteSaudeFactory.
	 */
	public AgenteSaudeFactory() {
		
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
	
	public AgenteSaude[] getAllAgenteSaude(){
		
		Vector v = new Vector();
			
		try {
			ResultSet rs = conn.selectDB("select agenteSaude,nome,email from agentessaude");
			
			while(rs.next()){
				v.add(new AgenteSaude(	this,
										rs.getInt("agenteSaude"),
										rs.getString("nome"),
										rs.getString("email")));						
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return (AgenteSaude[])v.toArray(new AgenteSaude[0]);		
	}	

}
