package br.smat.ejb.estado;

import java.sql.Connection;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.EntityContext;
import javax.ejb.FinderException;
import javax.naming.Context;
import javax.naming.InitialContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import br.smat.conexao.Conexao;

/**
 * Bean implementation class for Enterprise Bean: Estado
 */
public class EstadoBean implements javax.ejb.EntityBean {

	private int 	estado;
	private String	nome;
	private String sigla;	
	
	private boolean atualiza;	
	
	private EntityContext ctx;
	
	/**
	 * Returns the estado.
	 * @return int
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the sigla.
	 * @return String
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(int estado) {
		atualiza = true;				
		this.estado = estado;
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
	 * Sets the sigla.
	 * @param sigla The sigla to set
	 */
	public void setSigla(String sigla) {
		atualiza = true;						
		this.sigla = sigla;
	}
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		estado = 0;
		nome = null;
		sigla = null;
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
			EstadoKey key = (EstadoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_estados ?");
		    stmt.setInt(1,key.estado);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		estado = rs.getInt("estado");
		    	nome   = rs.getString("nome");
		    	sigla  = rs.getString("sigla");		    	
		    }
		    else{
			   throw new EJBException("Erro ao carregar Estados");
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
		atualiza = false;								
		try{
			conn = Conexao.getConnection();
			EstadoKey key = (EstadoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_estados ?");
		    stmt.setInt(1,key.estado);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("Failed to Delete");
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e)
			{}
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
				EstadoKey key = (EstadoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_estados ?,?,?");
	
			    stmt.setInt(1,key.estado);
				stmt.setString(2,nome);
				stmt.setString(3,sigla);
				
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("Failed to update: "+rs);
			    }
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			finally{
				try{
					conn.close();
					atualiza = false;												
				}
				catch(SQLException e){}
			}
		}
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
		ctx = null;
	}
	/**
	 * ejbCreate
	 */
	public EstadoKey ejbCreate(String nome, String sigla) throws javax.ejb.CreateException {
			
			Connection 	conn 	= null;			
			EstadoKey 	retVal  = null;
			atualiza = false;										
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_estados null,?,?");
				
					
			    stmt.setString(1,nome);
			    stmt.setString(2,sigla);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					estado = rs.getInt("estado");
				else
					throw new EJBException("FAILED TO INSERT");

			    setNome(nome);
			    setSigla(sigla);
				retVal = new EstadoKey(estado);
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
	public void ejbPostCreate(String nome, String sigla) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public EstadoKey ejbFindByPrimaryKey(EstadoKey key)
		throws javax.ejb.FinderException {

			Connection conn = null;
			atualiza = false;										
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_estados ?");
				stmt.setInt(1,key.estado);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("EstadoBean ejbFindByPrimaryKey => Estado not found");
			}
			catch(SQLException e){
					throw new FinderException("EstadoBean ejbFindByPrimaryKey => Estado not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}
	
	public Collection ejbFindAllEstados() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza = false;									
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_estados");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new EstadoKey(rs.getInt("estado")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("EstadoBean ejbFindAllEstados => Estado not Found");
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
