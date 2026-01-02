package br.smat.ejb.agentesaude;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.regional.RegionalKey;

/**
 * Bean implementation class for Enterprise Bean: AgenteSaude
 */
public class AgenteSaudeBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int 		 agenteSaude;
	private String 	 nome;
	private RegionalKey regional;
	private String 	 email;
		
	private boolean	atualiza;	
		
		
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		agenteSaude = 0;
		nome = null;
		regional = null;
		email = null;
		atualiza = false;
			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection 	conn  	   = null;
		atualiza = false;

		try{
			conn = Conexao.getConnection();
			AgenteSaudeKey key = (AgenteSaudeKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_agentessaude ?");
		    stmt.setInt(1,key.agenteSaude);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		agenteSaude = rs.getInt("agenteSaude");
		    	nome   		= rs.getString("nome");
		    	email	    = rs.getString("email");		    	
		    	regional    = new RegionalKey(rs.getInt("regional"));
		    }
		    else{
			   throw new EJBException("AgenteSaudeBean ejbLoad");
		    }
		}
		catch(SQLException e){
			throw new EJBException("AgenteSaudeBean ejbLoad");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("AgenteSaudeBean ejbLoad");				
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
			AgenteSaudeKey key = (AgenteSaudeKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_excluir_agentesaude ?");
		    stmt.setInt(1,key.agenteSaude);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("AgenteSaudeBean ejbRemove");
		    }
		}
		catch(SQLException e){
			throw new EJBException("AgenteSaudeBean ejbRemove");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("AgenteSaudeBean ejbRemove");				
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
				AgenteSaudeKey key = (AgenteSaudeKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_gravar_agentessaude ?,?,?,?");
	
			    stmt.setInt(1,key.agenteSaude);
				stmt.setString(2,nome);
			    stmt.setInt(3,regional.regional);			
				stmt.setString(4,email);
				
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("AgenteSaudeBean ejbStore rs: "+rs);
			    }
			}
			catch(SQLException e){
					throw new EJBException("AgenteSaudeBean1 ejbStore");	
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("AgenteSaudeBean2 ejbStore");					
				}
			}				
		}
	}
	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return this.ctx;
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
	public AgenteSaudeKey ejbCreate(String nome,String email,int regional)
		throws javax.ejb.CreateException {
			Connection 			conn 	= null;			
			AgenteSaudeKey 		retVal  = null;
			atualiza = false;			
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_gravar_agentessaude null,?,?,?");
				
					
			    stmt.setString(1,nome);
  		    	stmt.setInt(2,regional);			    
			    stmt.setString(3,email);  		    	

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					agenteSaude = rs.getInt("agenteSaude");
				else
					throw new EJBException("AgenteSaudeBean ejbCreate");

			    setNome(nome);
			    setEmail(email);
			    setRegional(new RegionalKey(regional));
				    
				retVal = new AgenteSaudeKey(agenteSaude);
			}
			catch(SQLException e){
				throw new EJBException("AgenteSaudeBean1 ejbStore");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("AgenteSaudeBean1 ejbStore");
				}
			}
			
			return retVal;			
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(String nome,String email,int regional) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public AgenteSaudeKey ejbFindByPrimaryKey(AgenteSaudeKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			atualiza = false;			
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_agentessaude ?");
				stmt.setInt(1,key.agenteSaude);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("AgenteSaudeBean ejbFindByPrimaryKey => AgenteSaudeKey not found");
			}
			catch(SQLException e){
					throw new FinderException("AgenteSaudeBean ejbFindByPrimaryKey => AgenteSaudeKey not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){
					throw new EJBException("AgenteSaudeBean1 ejbFindByPrimaryKey");
				}
			}	
	}

	public Collection ejbFindAllAgentesSaude() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza = false;
				
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_agentessaude");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new AgenteSaudeKey(rs.getInt("agenteSaude")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("AgenteSaudeBean ejbFindAllAgentesSaude => AgenteSaudeKey not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new EJBException("AgenteSaudeBean1 ejbFindAllAgentesSaude");
			}
		}
		return retVal;
	}

	
	/**
	 * Returns the agenteSaude.
	 * @return int
	 */
	public int getAgenteSaude() {
		atualiza = false;		
		return agenteSaude;
	}

	/**
	 * Returns the email.
	 * @return String
	 */
	public String getEmail() {
		atualiza = false;
		return email;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		atualiza = false;		
		return nome;
	}

	/**
	 * Returns the regional.
	 * @return RegionalKey
	 */
	public RegionalKey getRegional() {
		atualiza = false;		
		return regional;
	}

	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(int agenteSaude) {
		atualiza = true;		
		this.agenteSaude = agenteSaude;
	}

	/**
	 * Sets the email.
	 * @param email The email to set
	 */
	public void setEmail(String email) {
		atualiza = true;		
		this.email = email;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		atualiza = true;			
		this.nome = nome;
	}

	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(RegionalKey regional) {
		atualiza = true;
		this.regional = regional;
	}

}
