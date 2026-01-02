package br.smat.ejb.tipoacidente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;

/**
 * Bean implementation class for Enterprise Bean: TipoAcidente
 */
public class TipoAcidenteBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;

	private int tipoAcidente;

	private String nome;

	/**
	 * Returns the nome.
	 * @return Object
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the tipoAcidente.
	 * @return Object
	 */
	public int getTipoAcidente() {
		return tipoAcidente;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the tipoAcidente.
	 * @param tipoAcidente The tipoAcidente to set
	 */
	public void setTipoAcidente(int tipoAcidente) {
		this.tipoAcidente = tipoAcidente;
	}
		
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		tipoAcidente = 0;
		nome = null;
			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			TipoAcidenteKey key = (TipoAcidenteKey)ctx.getPrimaryKey();
			System.out.println(key);
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_tiposacidente ?");
		    stmt.setInt(1,key.tipoAcidente);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.tipoAcidente = rs.getInt("tipoAcidente");
		    	this.nome         = rs.getString("nome"     );		    	
		    }
		    else{
			   throw new EJBException("TipoAcidenteBean ejbLoad EJBException");
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
			TipoAcidenteKey key = (TipoAcidenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_tiposacidente ?");
		    stmt.setInt(1,key.tipoAcidente);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("TipoAcidenteBean ejbRemove EJBException");
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
	 * ejbStore
	 */
	public void ejbStore() {
		Connection conn = null;
		try{
			conn = Conexao.getConnection();
			TipoAcidenteKey key = (TipoAcidenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_tiposacidente ?,?");

		    stmt.setInt(1,key.tipoAcidente);
			stmt.setString(2,this.nome);

			
		    int rs = stmt.executeUpdate();
		    
		    if(rs != 1){
		    	throw new EJBException("TipoAcidenteBean ejbStore EJBException rs:"+rs);
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
	public br.smat.ejb.tipoacidente.TipoAcidenteKey ejbCreate(String nome)
		throws javax.ejb.CreateException {
			Connection 			conn 	= null;			
			TipoAcidenteKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_tiposacidente null,?");
			    stmt.setString(1,nome);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					tipoAcidente = rs.getInt("tipoAcidente");
				else
					throw new EJBException("TipoAcidenteBean ejbCreate EJBException");

			    setNome(nome);
		
				retVal = new TipoAcidenteKey(tipoAcidente);
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
	public br.smat.ejb.tipoacidente.TipoAcidenteKey ejbFindByPrimaryKey(
		br.smat.ejb.tipoacidente.TipoAcidenteKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_tiposacidente ?");
				stmt.setInt(1,key.tipoAcidente);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("TipoAcidenteBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("TipoAcidenteBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}
	
    public Collection ejbFindAllTiposAcidente() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_tiposacidente");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new TipoAcidenteKey(rs.getInt("tipoAcidente")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("TipoAcidenteBean ejbFindAllTiposAcidente FinderException");
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
