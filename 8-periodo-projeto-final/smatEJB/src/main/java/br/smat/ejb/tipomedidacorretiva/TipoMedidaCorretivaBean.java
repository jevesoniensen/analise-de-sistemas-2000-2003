package br.smat.ejb.tipomedidacorretiva;

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
 * Bean implementation class for Enterprise Bean: TipoMedidaCorretiva
 */
public class TipoMedidaCorretivaBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;

	private int 	tipoMedidaCorretiva;
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
	 * Returns the tipoMedidaCorretiva.
	 * @return int
	 */
	public int getTipoMedidaCorretiva() {
		atualiza = false;		
		return tipoMedidaCorretiva;
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
	 * Sets the tipoMedidaCorretiva.
	 * @param tipoMedidaCorretiva The tipoMedidaCorretiva to set
	 */
	public void setTipoMedidaCorretiva(int tipoMedidaCorretiva) {
		atualiza = true;		
		this.tipoMedidaCorretiva = tipoMedidaCorretiva;
	}
	
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		tipoMedidaCorretiva = 0;
		nome				= null;
		descricao			= null;		
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
			TipoMedidaCorretivaKey  key = (TipoMedidaCorretivaKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_tiposmedidascorretivas ?");
		    stmt.setInt(1,key.tipoMedidaCorretiva);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.tipoMedidaCorretiva 	= rs.getInt("tipomedidacorretiva");
		    	this.nome   				= rs.getString("nome"            );		    	
		    	this.descricao				= rs.getString("descricao"       );		    	
		    }
		    else{
			   throw new EJBException("TipoMedidaCorretivaBean ejbLoad EJBException");
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
			TipoMedidaCorretivaKey key = (TipoMedidaCorretivaKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_tiposmedidascorretivas ?");
		    stmt.setInt(1,key.tipoMedidaCorretiva);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("TipoMedidaCorretivaBean ejbRemove EJBException");
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
		
		if(atualiza){
			Connection conn = null;
		
			try{
				conn = Conexao.getConnection();
				TipoMedidaCorretivaKey key = (TipoMedidaCorretivaKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_tiposmedidascorretivas ?,?,?");
	
			    stmt.setInt(1,key.tipoMedidaCorretiva);
				stmt.setString(2,this.nome);
				stmt.setString(3,this.descricao);			
					
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("TipoMedidaCorretivaBean ejbStore EJBException rs:"+rs);
			    }
			    
			}
			catch(SQLException e){
				throw new EJBException("TipoMedidaCorretivaBean ejbStore => Erro ao alterar SQLException");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("TipoMedidaCorretivaBean ejbStore => Erro ao alterar SQLException");
				}
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
		ctx= null;
	}
	/**
	 * ejbCreate
	 */
	public TipoMedidaCorretivaKey ejbCreate(String nome, String descricao)
		throws javax.ejb.CreateException {
			Connection	conn 	= null;			
			TipoMedidaCorretivaKey 	retVal  = null;
			
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_tiposmedidascorretivas null,?,?");
			    stmt.setString(1,nome);
			    stmt.setString(2,descricao);

				ResultSet rs = stmt.executeQuery();
				
				System.out.println("rs "+rs);

				if(rs.next())
					tipoMedidaCorretiva = rs.getInt("tipoMedidaCorretiva");					                            
				else
					throw new EJBException("TipoMedidaCorretivaBean ejbCreate EJBException");

			    setNome(nome);
			    setDescricao(descricao);
		
				retVal = new TipoMedidaCorretivaKey(tipoMedidaCorretiva);
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
	public void ejbPostCreate(String nome, String descricao) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public TipoMedidaCorretivaKey ejbFindByPrimaryKey(TipoMedidaCorretivaKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_status ?");
				stmt.setInt(1,key.tipoMedidaCorretiva);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("TipoMedidaCorretivaBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("TipoMedidaCorretivaBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}
	
    public Collection ejbFindAllTipoMedidaCorretiva() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_tiposmedidascorretivas");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new TipoMedidaCorretivaKey(rs.getInt("tipoMedidaCorretiva")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("TipoMedidaCorretivaBean ejbFindAllTipoMedidaCorretiva FinderException");
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
