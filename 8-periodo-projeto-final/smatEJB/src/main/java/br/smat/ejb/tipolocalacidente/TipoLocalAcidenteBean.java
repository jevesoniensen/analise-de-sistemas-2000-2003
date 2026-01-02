package br.smat.ejb.tipolocalacidente;

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
 * Bean implementation class for Enterprise Bean: TipoLocalAcidente
 */
public class TipoLocalAcidenteBean implements javax.ejb.EntityBean {
	
	private javax.ejb.EntityContext ctx;
	
	private int tipoLocalAcidente;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the tipoLocalAcidente.
	 * @return int
	 */
	public int getTipoLocalAcidente() {
		return tipoLocalAcidente;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the tipoLocalAcidente.
	 * @param tipoLocalAcidente The tipoLocalAcidente to set
	 */
	public void setTipoLocalAcidente(int tipoLocalAcidente) {
		this.tipoLocalAcidente = tipoLocalAcidente;
	}
		
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		tipoLocalAcidente = 0;
		nome = null;
		
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {


		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			TipoLocalAcidenteKey key = (TipoLocalAcidenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_tiposlocalacidente ?");
		    stmt.setInt(1,key.tipoLocalAcidente);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		tipoLocalAcidente = rs.getInt("tipoLocalAcidente");
		    	nome   = rs.getString("nome");
		    }
		    else{
			   throw new EJBException("Erro ao carregar TiposLocalAcidente");
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
			TipoLocalAcidenteKey key = (TipoLocalAcidenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_tiposlocalacidente ?");
		    stmt.setInt(1,key.tipoLocalAcidente);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("Erro ao excluir TiposLocalAcidente");
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
			TipoLocalAcidenteKey key = (TipoLocalAcidenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_tiposlocalacidente ?,?");

		    stmt.setInt(1,key.tipoLocalAcidente);
			stmt.setString(2,nome);
			
		    int rs = stmt.executeUpdate();
		    
		    if(rs != 1){
		    	throw new EJBException("Erro ao alterar TipoLocalAcidente: "+rs);
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
	public br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey ejbCreate(String nome)
		throws javax.ejb.CreateException {
			
			Connection 	conn 	= null;			
			TipoLocalAcidenteKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_tiposlocalacidente null,?");
				

			    stmt.setString(1,nome);

				System.out.println("Antes de executar a query");	
				
				ResultSet rs = stmt.executeQuery();

				System.out.println("Depois de executar a query");	
				
				if(rs.next())
					tipoLocalAcidente = rs.getInt("tipoLocalAcidente");
				else
					throw new EJBException("Erro ao inserir Estados");

			    setNome(nome);
				retVal = new TipoLocalAcidenteKey(tipoLocalAcidente);
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
	public TipoLocalAcidenteKey ejbFindByPrimaryKey(
		br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey key)
		throws javax.ejb.FinderException {

			
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_areas ?");
				stmt.setInt(1,key.tipoLocalAcidente);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("TipoLocalAcidenteBean ejbFindByPrimaryKey => TipoLocalAcidenteBean not found");
			}
			catch(SQLException e){
					throw new FinderException("TipoLocalAcidenteBean ejbFindByPrimaryKey => TipoLocalAcidenteBean not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
			
	}

	public Collection ejbFindAllTiposLocalAcidente() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_tiposlocalacidente");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new TipoLocalAcidenteKey(rs.getInt("tipoLocalAcidente")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("TipoLocalAcidenteBean ejbFindAllTiposLocalAcidente => TipoLocalAcidente not Found");
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
