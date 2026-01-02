package br.smat.ejb.diagnostico;

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
 * Bean implementation class for Enterprise Bean: Diagnostico
 */
public class DiagnosticoBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int diagnostico;
	private String nome;
	private int cid10;
	
	/**
	 * Returns the cid10.
	 * @return int
	 */
	public int getCid10() {
		return cid10;
	}

	/**
	 * Returns the diagnostico.
	 * @return int
	 */
	public int getDiagnostico() {
		return diagnostico;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the cid10.
	 * @param cid10 The cid10 to set
	 */
	public void setCid10(int cid10) {
		this.cid10 = cid10;
	}

	/**
	 * Sets the diagnostico.
	 * @param diagnostico The diagnostico to set
	 */
	public void setDiagnostico(int diagnostico) {
		this.diagnostico = diagnostico;
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

		diagnostico = 0;
		nome = null;
		cid10 = 0;
			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			DiagnosticoKey key = (DiagnosticoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_diagnosticos ?");

		    stmt.setInt(1,key.diagnostico);

	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		diagnostico = rs.getInt("diagnostico");
		    	nome   = rs.getString("nome");
		    	cid10 = rs.getInt("cid10");
		    }
		    else{
			   throw new EJBException("Erro ao carregar Diagnosticos");
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
			DiagnosticoKey key = (DiagnosticoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_diagnosticos ?");
		    stmt.setInt(1,key.diagnostico);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("Erro ao excluir Diagnosticos");
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
			DiagnosticoKey key = (DiagnosticoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_diagnosticos ?,?,?");

		    stmt.setInt(1,key.diagnostico);
			stmt.setString(2,nome);
			stmt.setInt(3,cid10);
			
			
		    int rs = stmt.executeUpdate();
		    
		    if(rs != 1){
		    	throw new EJBException("Erro ao alterar Diagnosticos: "+rs);
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
	public DiagnosticoKey ejbCreate(String nome, int cid10)
		throws javax.ejb.CreateException {

			Connection 	conn 	= null;			
			DiagnosticoKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_diagnosticos null,?,?");
				

			    stmt.setString(1,nome);
			    stmt.setInt(2,cid10);

				System.out.println("Antes de executar a query");	
				
				ResultSet rs = stmt.executeQuery();

				System.out.println("Depois de executar a query");	
				
				if(rs.next())
					diagnostico = rs.getInt("diagnostico");
				else
					throw new EJBException("Erro ao inserir Diagnosticos");

			    setNome(nome);
			    setCid10(cid10);
				retVal = new DiagnosticoKey(diagnostico);
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
	public void ejbPostCreate(String nome, int cid10) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public DiagnosticoKey ejbFindByPrimaryKey(
		DiagnosticoKey key)
		throws javax.ejb.FinderException {
			

			
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_diagnosticos ?");
				stmt.setInt(1,key.diagnostico);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("DiagnosticoBean ejbFindByPrimaryKey => Diagnostico not found");
			}
			catch(SQLException e){
					throw new FinderException("DiagnosticoBean ejbFindByPrimaryKey => Diagnostico not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}

	public Collection ejbFindAllDiagnosticos() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_diagnosticos");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new DiagnosticoKey(rs.getInt("diagnostico")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("DiagnosticoBean ejbFindAllDiagnosticos => Diagnostico not Found");
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
