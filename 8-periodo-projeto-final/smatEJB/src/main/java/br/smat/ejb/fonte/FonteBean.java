package br.smat.ejb.fonte;

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
 * Bean implementation class for Enterprise Bean: Fonte
 */
public class FonteBean implements javax.ejb.EntityBean {
	
	private javax.ejb.EntityContext ctx;
	
	private int fonte;
	private String nome;

	/**
	 * Returns the fonte.
	 * @return int
	 */
	public int getFonte() {
		return fonte;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the fonte.
	 * @param fonte The fonte to set
	 */
	public void setFonte(int fonte) {
		this.fonte = fonte;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Nome => " + nome);
	}
		
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		fonte = 0;
		nome = null;
			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			FonteKey key = (FonteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_fontes ?");
		    stmt.setInt(1,key.fonte);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		fonte = rs.getInt("fonte");
		    	nome   = rs.getString("nome");
		    }
		    else{
			   throw new EJBException("Erro ao carregar Fontes");
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
			FonteKey key = (FonteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_fontes ?");
		    stmt.setInt(1,key.fonte);
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
			FonteKey key = (FonteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_fontes ?,?");

		    stmt.setInt(1,key.fonte);
			stmt.setString(2,nome);

			System.out.println("ejbStore => Antes");
			System.out.println("fonte => " + fonte);
			System.out.println("nome => " + nome);

		    int rs = stmt.executeUpdate();
		    
			System.out.println("ejbStore => Depois");
			System.out.println("fonte => " + fonte);
			System.out.println("nome => " + nome);
					    
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
	public br.smat.ejb.fonte.FonteKey ejbCreate(String nome)
		throws javax.ejb.CreateException {

			Connection 	conn 	= null;			
			FonteKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_fontes null,?");
				
					
			    stmt.setString(1,nome);


				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					fonte = rs.getInt("fonte");
				else
					throw new EJBException("FAILED TO INSERT");

			    setNome(nome);
				retVal = new FonteKey(fonte);
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
	public br.smat.ejb.fonte.FonteKey ejbFindByPrimaryKey(
		br.smat.ejb.fonte.FonteKey key)
		throws javax.ejb.FinderException {

			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_fontes ?");
				stmt.setInt(1,key.fonte);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("FonteBean ejbFindByPrimaryKey => Fonte not found");
			}
			catch(SQLException e){
					throw new FinderException("FonteBean ejbFindByPrimaryKey => Fonte not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}

	public Collection ejbFindAllFontes() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_fontes");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new FonteKey(rs.getInt("fonte")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("FonteBean ejbFindAllFontes => Fonte not Found");
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
