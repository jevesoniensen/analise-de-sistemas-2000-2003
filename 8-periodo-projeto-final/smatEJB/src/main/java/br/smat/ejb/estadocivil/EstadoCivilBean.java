package br.smat.ejb.estadocivil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.*;

/**
 * Bean implementation class for Enterprise Bean: EstadoCivil
 */
public class EstadoCivilBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;

	private int    estadoCivil;
	private String nome;
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		estadoCivil = 0;
		nome = null;
				
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			EstadoCivilKey key = (EstadoCivilKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_estadoscivis ?");
		    stmt.setInt(1,key.estadoCivil);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		estadoCivil = rs.getInt("estadocivil");
		    	nome        = rs.getString("nome");		    	
		    }
		    else{
			   throw new EJBException("Erro ao carregar EstadosCivis");
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
			EstadoCivilKey key = (EstadoCivilKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_estadoscivis ?");
		    stmt.setInt(1,key.estadoCivil);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("Erro ao excluir estadoscivis");
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
			EstadoCivilKey key = (EstadoCivilKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_estadoscivis ?,?");

		    stmt.setInt(1,key.estadoCivil);
			stmt.setString(2,this.nome);

			
		    int rs = stmt.executeUpdate();
		    
		    if(rs != 1){
		    	throw new EJBException("Erro ao alterar estadoscivis : "+rs);
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
	public EstadoCivilKey ejbCreate(String nome)
		throws javax.ejb.CreateException {
			Connection 		conn 	= null;			
			EstadoCivilKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_estadoscivis null,?");
			    stmt.setString(1,nome);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					estadoCivil = rs.getInt("estadoCivil");
				else
					throw new EJBException("Erro ao inserir estadoscivis");

			    setNome(nome);
		
				retVal = new EstadoCivilKey(estadoCivil);
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
	public EstadoCivilKey ejbFindByPrimaryKey(EstadoCivilKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_estadoscivis ?");
				stmt.setInt(1,key.estadoCivil);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("Estado não localizado");
			}
			catch(SQLException e){
					throw new FinderException("Estado não localizado");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}
	
    public Collection ejbFindAllEstadosCivis() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_estadoscivis");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new EstadoCivilKey(rs.getInt("estadocivil")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("EstadoCivisBean ejbFindAllEstadosCivis => EstadoCivil not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}		
	
	/**
	 * Returns the estadoCivil.
	 * @return int
	 */
	public int getEstadoCivil() {
		return estadoCivil;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the estadoCivil.
	 * @param estadoCivil The estadoCivil to set
	 */
	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

}
