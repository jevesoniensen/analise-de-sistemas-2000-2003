package br.smat.ejb.agentecausador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;

/**
 * Bean implementation class for Enterprise Bean: AgenteCausador
 */
public class AgenteCausadorBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int 				agenteCausador;
	private String				nome;
	private String 			descricao;
	private AgenteCausadorKey	agenteCausadorPai;
	
	private boolean atualiza = false;

	/**
	 * Returns the agenteCausador.
	 * @return int
	 */
	public int getAgenteCausador() {
		atualiza = false;
		return agenteCausador;
	}

	/**
	 * Returns the agenteCausadorPai.
	 * @return AgenteCausadorKey
	 */
	public AgenteCausadorKey getAgenteCausadorPai() {
		atualiza = false;
		return agenteCausadorPai;
	}

	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() {
		atualiza = false;
		return descricao;
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
	 * Sets the agenteCausador.
	 * @param agenteCausador The agenteCausador to set
	 */
	public void setAgenteCausador(int agenteCausador) {
		atualiza = true;
		this.agenteCausador = agenteCausador;
	}

	/**
	 * Sets the agenteCausadorPai.
	 * @param agenteCausadorPai The agenteCausadorPai to set
	 */
	public void setAgenteCausadorPai(AgenteCausadorKey agenteCausadorPai) {
		atualiza = true;
		this.agenteCausadorPai = agenteCausadorPai;
	}

	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) {
		atualiza = true;
		this.descricao = descricao;
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
	 * ejbActivate
	 */
	public void ejbActivate() {

		agenteCausador = 0;
		nome = null;
		descricao = null;
		agenteCausadorPai = null;
		atualiza = false;
			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection 	conn  	   = null;
		int		agenteAux  = 0;
		atualiza = false;

		try{
			conn = Conexao.getConnection();
			AgenteCausadorKey key = (AgenteCausadorKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_agentescausadores ?");
		    stmt.setInt(1,key.agenteCausador);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		agenteCausador = rs.getInt("agenteCausador");
		    	nome   		   = rs.getString("nome");
		    	descricao	   = rs.getString("descricao");		    	
		    	agenteAux      = rs.getInt("agenteCausadorPai");
		    	
		    	if(agenteAux > 0)
			    	agenteCausadorPai = new AgenteCausadorKey(agenteAux);
			    else
			    	agenteCausadorPai = null;
		    }
		    else{
			   throw new EJBException("AgenteCausadorBean ejbLoad");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){}
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
	
		try{
			conn = Conexao.getConnection();
			AgenteCausadorKey key = (AgenteCausadorKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_agentescausadores ?");
		    stmt.setInt(1,key.agenteCausador);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("AgenteCausadorBean ejbRemove");
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new EJBException("AgenteCausadorBean ejbRemove");
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e)
			{
				throw new EJBException("AgenteCausadorBean ejbRemove");
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
				AgenteCausadorKey key = (AgenteCausadorKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_agentescausadores ?,?,?,?");
	
			    stmt.setInt(1,key.agenteCausador);
				stmt.setString(2,nome);
				stmt.setString(3,descricao);
				
				if(agenteCausadorPai == null)
					stmt.setNull(4,Types.INTEGER);
				else
				    stmt.setInt(4,agenteCausadorPai.agenteCausador);				
				
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("AgenteCausadorBean ejbStore rs: "+rs);
			    }
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new EJBException("AgenteCausadorBean ejbStore");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("AgenteCausadorBean ejbStore");
				}
			}
			atualiza = false;
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
	public AgenteCausadorKey ejbCreate(String nome,String descricao,int agenteCausadorPai)
		throws javax.ejb.CreateException {
			Connection 			conn 	= null;			
			AgenteCausadorKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_agentescausadores null,?,?,?");
				
					
			    stmt.setString(1,nome);
			    stmt.setString(2,descricao);
			
				if(agenteCausadorPai == 0)
					stmt.setNull(3,Types.INTEGER);
				else
				    stmt.setInt(3,agenteCausadorPai);			    

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					agenteCausador = rs.getInt("agenteCausador");
				else
					throw new EJBException("AgenteCausadorBean ejbCreate");

			    setNome(nome);
			    setDescricao(descricao);
				if(agenteCausadorPai > 0)
				    setAgenteCausadorPai(new AgenteCausadorKey(agenteCausadorPai));
				
				atualiza = false;
    
				retVal = new AgenteCausadorKey(agenteCausador);
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){}
			}
			
			return retVal;				
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(String nome,String descricao,int agenteCausadorPai) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public AgenteCausadorKey ejbFindByPrimaryKey(AgenteCausadorKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			atualiza = false;
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_agentescausadores ?");
				stmt.setInt(1,key.agenteCausador);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("AgenteCausadorBean ejbFindByPrimaryKey => AgenteCausadorKey not found");
			}
			catch(SQLException e){
					throw new FinderException("AgenteCausadorBean ejbFindByPrimaryKey => AgenteCausadorKey not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}	
	}
	
	public Collection ejbFindAllAgentesCausadores() throws FinderException
	{
		atualiza = false;
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_agentescausadores");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new AgenteCausadorKey(rs.getInt("agenteCausador")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("AgenteCausadorBean ejbFindAllAgentesCausadores => AgenteCausadorKey not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}
		
	public Collection ejbFindAllAgentesCausadores(int pai) throws FinderException
	{
		atualiza = false;
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_agentescausadores null,?");
		
			stmt.setInt(1,pai);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new AgenteCausadorKey(rs.getInt("agenteCausador")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("AgenteCausadorBean ejbFindAllAgentesCausadores => AgenteCausadorKey not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}

	public Collection ejbFindAllAgentesCausadoresNot(int agenteCausador,int agenteCausadorPai) throws FinderException
	{
		atualiza = false;
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_agentescausadores ?,?,'N'");
		
			
			System.out.println("***** NO BEAN ****");
			System.out.println("agenteCausador => " + agenteCausador);
			System.out.println("agenteCausadorPai => " + agenteCausadorPai);
			
			stmt.setInt(1,agenteCausador);
			
			if(agenteCausadorPai != 0)
				stmt.setInt(2,agenteCausadorPai);
			else
				stmt.setNull(2,Types.INTEGER);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new AgenteCausadorKey(rs.getInt("agenteCausador")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("AgenteCausadorBean ejbFindAllAgentesCausadoresNot => AgenteCausadorKey not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}
}
