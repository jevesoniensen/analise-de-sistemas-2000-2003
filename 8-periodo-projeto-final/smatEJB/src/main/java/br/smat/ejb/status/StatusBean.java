package br.smat.ejb.status;

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
 * Bean implementation class for Enterprise Bean: Status
 */
public class StatusBean implements javax.ejb.EntityBean {
	
	private javax.ejb.EntityContext ctx;
	
	private int 	status;
	private String nome;
	private String descricao;
	
	private boolean atualiza;	
	
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
	 * Returns the status.
	 * @return int
	 */
	public int getStatus() {
		atualiza = false;		
		return status;
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
	 * Sets the status.
	 * @param status The status to set
	 */
	public void setStatus(int status) {
		atualiza = true;				
		this.status = status;
	}	
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		status    = 0;
		nome	  = null;
		descricao = null;		
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		atualiza = false;		

		Connection conn = null;
		atualiza = false;

		try{
			conn = Conexao.getConnection();
			StatusKey  key = (StatusKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_status ?");
		    stmt.setInt(1,key.status);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.status 	= rs.getInt("status");
		    	this.nome   	= rs.getString("nome"     );		    	
		    	this.descricao	= rs.getString("descricao");		    	
		    }
		    else{
			   throw new EJBException("StatusBean ejbLoad EJBException");
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
			StatusKey key = (StatusKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_status ?");
		    stmt.setInt(1,key.status);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("StatusBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("StatusBean ejbRemove EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){throw new EJBException("StatusBean ejbRemove EJBException");}
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
				StatusKey key = (StatusKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_status ?,?,?");
	
			    stmt.setInt(1,key.status);
				stmt.setString(2,this.nome);
				stmt.setString(3,this.descricao);			
					
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("StatusBean ejbStore EJBException rs:"+rs);
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
	public br.smat.ejb.status.StatusKey ejbCreate(String nome,String descricao)
		throws javax.ejb.CreateException {
			Connection	conn 	= null;			
			StatusKey 	retVal  = null;
			
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_status null,?,?");
			    stmt.setString(1,nome);
			    stmt.setString(2,descricao);

				ResultSet rs = stmt.executeQuery();
				
				System.out.println("rs "+rs);

				if(rs.next())
					status = rs.getInt("status");					                            
				else
					throw new EJBException("StatusBean ejbCreate EJBException");

			    setNome(nome);
			    setDescricao(descricao);
		
				retVal = new StatusKey(status);
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
	public void ejbPostCreate(String nome,String descricao) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.status.StatusKey ejbFindByPrimaryKey(
		br.smat.ejb.status.StatusKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_status ?");
				stmt.setInt(1,key.status);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("StatusBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("StatusBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}
	
    public Collection ejbFindAllStatus() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_status");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new StatusKey(rs.getInt("status")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("StatusBean ejbFindAllStatus FinderException");
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
