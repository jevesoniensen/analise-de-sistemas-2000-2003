package br.smat.ejb.area;

import java.sql.Connection;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.naming.Context;
import javax.naming.InitialContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import	br.smat.conexao.Conexao;

/**
 * Bean implementation class for Enterprise Bean: Area
 */
public class AreaBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int	area;
	private String nome;
	

	/**
	 * Returns the area.
	 * @return int
	 */
	public int getArea() {
		return area;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the area.
	 * @param area The area to set
	 */
	public void setArea(int area) {
		this.area = area;
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

		area = 0;
		nome = null;
			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			AreaKey key = (AreaKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_areas ?");
		    stmt.setInt(1,key.area);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		area = rs.getInt("area");
		    	nome   = rs.getString("nome");
		    }
		    else{
			   throw new EJBException("Erro ao carregar Areas");
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
			AreaKey key = (AreaKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_areas ?");
		    stmt.setInt(1,key.area);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("Erro ao excluir Areas");
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
			AreaKey key = (AreaKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_areas ?,?");

		    stmt.setInt(1,key.area);
			stmt.setString(2,nome);
			
		    int rs = stmt.executeUpdate();
		    
		    if(rs != 1){
		    	throw new EJBException("Erro ao alterar Areas: "+rs);
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
	public AreaKey ejbCreate(String nome)
		throws javax.ejb.CreateException {
			Connection 	conn 	= null;			
			AreaKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_areas null,?");
				

			    stmt.setString(1,nome);

				System.out.println("Antes de executar a query");	
				
				ResultSet rs = stmt.executeQuery();

				System.out.println("Depois de executar a query");	
				
				if(rs.next())
					area = rs.getInt("area");
				else
					throw new EJBException("Erro ao inserir Estados");

			    setNome(nome);
				retVal = new AreaKey(area);
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
	public AreaKey ejbFindByPrimaryKey(AreaKey key)		throws javax.ejb.FinderException {
			
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_areas ?");
				stmt.setInt(1,key.area);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("AreaBean ejbFindByPrimaryKey => Area not found");
			}
			catch(SQLException e){
					throw new FinderException("AreaBean ejbFindByPrimaryKey => Area not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}	
	}

	public Collection ejbFindAllAreas() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_areas");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new AreaKey(rs.getInt("area")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("AreaBean ejbFindAllAreas => Area not Found");
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
