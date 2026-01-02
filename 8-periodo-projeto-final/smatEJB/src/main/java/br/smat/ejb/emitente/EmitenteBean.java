package br.smat.ejb.emitente;

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
 * Bean implementation class for Enterprise Bean: Emitente
 */
public class EmitenteBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int emitente;
	private String nome;

	/**
	 * Returns the emitente.
	 * @return int
	 */
	public int getEmitente() {
		return emitente;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the emitente.
	 * @param emitente The emitente to set
	 */
	public void setEmitente(int emitente) {
		this.emitente = emitente;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		emitente = 0;
		nome = null;
			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			EmitenteKey key = (EmitenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_emitentes ?");
		    stmt.setInt(1,key.emitente);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		emitente = rs.getInt("emitente");
		    	nome   = rs.getString("nome");		    	
		    }
		    else{
			   throw new EJBException("Erro ao carregar Emitentes");
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
			EmitenteKey key = (EmitenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_emitentes ?");
		    stmt.setInt(1,key.emitente);
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

		Connection conn = null;
		try{
			conn = Conexao.getConnection();
			EmitenteKey key = (EmitenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_emitentes ?,?");

		    stmt.setInt(1,key.emitente);
			stmt.setString(2,nome);

			
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
			}
			catch(SQLException e){}
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
	public br.smat.ejb.emitente.EmitenteKey ejbCreate(String nome)
		throws javax.ejb.CreateException {

			Connection 	conn 	= null;			
			EmitenteKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_emitentes null,?");
				
					
			    stmt.setString(1,nome);


				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					emitente = rs.getInt("emitente");
				else
					throw new EJBException("FAILED TO INSERT");

			    setNome(nome);
				retVal = new EmitenteKey(emitente);
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
	public void ejbPostCreate(String nome) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.emitente.EmitenteKey ejbFindByPrimaryKey(
		br.smat.ejb.emitente.EmitenteKey key)
		throws javax.ejb.FinderException {
			
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_emitentes ?");
				stmt.setInt(1,key.emitente);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("EmitenteBean ejbFindByPrimaryKey => Emitente not found");
			}
			catch(SQLException e){
					throw new FinderException("EmitenteBean ejbFindByPrimaryKey => Emitente not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}

	public Collection ejbFindAllEmitentes() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_emitentes");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new EmitenteKey(rs.getInt("emitente")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("EmitenteBean ejbFindAllEmitentes => Emitente not Found");
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
