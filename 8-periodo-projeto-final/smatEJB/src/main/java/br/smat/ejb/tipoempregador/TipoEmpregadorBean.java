package br.smat.ejb.tipoempregador;

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
 * Bean implementation class for Enterprise Bean: TipoEmpregador
 */
public class TipoEmpregadorBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int tipoEmpregador;
	private String nome;
	private String docIdentificador;
	
	private boolean atualiza;


	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the tipoEmpregador.
	 * @return int
	 */
	public int getTipoEmpregador() {
		return tipoEmpregador;
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
	 * Sets the tipoEmpregador.
	 * @param tipoEmpregador The tipoEmpregador to set
	 */
	public void setTipoEmpregador(int tipoEmpregador) {
		atualiza = true;									
		this.tipoEmpregador = tipoEmpregador;
	}

	/**
	 * Returns the docIdentificador.
	 * @return String
	 */
	public String getDocIdentificador() {
		return docIdentificador;
	}

	/**
	 * Sets the docIdentificador.
	 * @param docIdentificador The docIdentificador to set
	 */
	public void setDocIdentificador(String docIdentificador) {
		atualiza = true;									
		this.docIdentificador = docIdentificador;
	}		
		
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		tipoEmpregador = 0;
		nome = null;
		docIdentificador = null;
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
			TipoEmpregadorKey key = (TipoEmpregadorKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_tiposempregadores ?");
		    stmt.setInt(1,key.tipoEmpregador);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		tipoEmpregador = rs.getInt("tipoEmpregador");
		    	nome   = rs.getString("nome");
		    	docIdentificador = rs.getString("docIdentificador");
		    }
		    else{
			   throw new EJBException("TipoEmpregadorBean ejbLoad");
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

		atualiza = false;										
		Connection conn = null;
	
		try{
			conn = Conexao.getConnection();
			TipoEmpregadorKey key = (TipoEmpregadorKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_tiposempregadores ?");
		    stmt.setInt(1,key.tipoEmpregador);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("TipoEmpregadorBean ejbRemove => Failed to delete");
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
				TipoEmpregadorKey key = (TipoEmpregadorKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_tiposempregadores ?,?,?");
	
			    stmt.setInt(1,key.tipoEmpregador);
				stmt.setString(2,nome);
				stmt.setString(3,docIdentificador);
	
				
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("TipoEmpregadorBean ejbStore => Failed to update: "+rs);
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
		atualiza = false;														
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
	public br.smat.ejb.tipoempregador.TipoEmpregadorKey ejbCreate(String nome,String docIdentificador)
		throws javax.ejb.CreateException {
			
			Connection 	conn 	= null;			
			TipoEmpregadorKey 	retVal  = null;
			atualiza = false;													
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_tiposempregadores null,?,?");
				
					
			    stmt.setString(1,nome);
			    stmt.setString(2,docIdentificador);


				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					tipoEmpregador = rs.getInt("tipoEmpregador");
				else
					throw new EJBException("TipoEmpregadorBean ejbCreate => FAILED TO INSERT");

			    setNome(nome);

				retVal = new TipoEmpregadorKey(tipoEmpregador);
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
	public void ejbPostCreate(String nome,String docIdentificador) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.tipoempregador.TipoEmpregadorKey ejbFindByPrimaryKey(
		br.smat.ejb.tipoempregador.TipoEmpregadorKey key)
		throws javax.ejb.FinderException {
			
			Connection conn = null;
		atualiza = false;													
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_tiposempregadores ?");
				stmt.setInt(1,key.tipoEmpregador);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("TipoEmpregadorBean ejbFindByPrimaryKey => TipoEmpregador not found");
			}
			catch(SQLException e){
					throw new FinderException("OcupacaoBean ejbFindByPrimaryKey => TipoEmpregador not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}

	public Collection ejbFindAllTiposEmpregadores() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza = false;												
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_tiposEmpregadores");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new TipoEmpregadorKey(rs.getInt("tipoEmpregador")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("TipoEmpregadorBean ejbFindAllTiposEmpregadores => TipoEmpregador not Found");
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
