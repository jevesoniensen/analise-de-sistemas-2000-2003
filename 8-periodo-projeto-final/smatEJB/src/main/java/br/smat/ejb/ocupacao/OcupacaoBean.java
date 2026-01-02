package br.smat.ejb.ocupacao;

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
 * Bean implementation class for Enterprise Bean: Ocupacao
 */
public class OcupacaoBean implements javax.ejb.EntityBean {
	
	private javax.ejb.EntityContext ctx;
	
	private int ocupacao;
	private String nome;
	private int cbo;
	
	
	/**
	 * Returns the cbo.
	 * @return int
	 */
	public int getCbo() {
		return cbo;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the ocupacao.
	 * @return int
	 */
	public int getOcupacao() {
		return ocupacao;
	}

	/**
	 * Sets the cbo.
	 * @param cbo The cbo to set
	 */
	public void setCbo(int cbo) {
		this.cbo = cbo;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the ocupacao.
	 * @param ocupacao The ocupacao to set
	 */
	public void setOcupacao(int ocupacao) {
		this.ocupacao = ocupacao;
	}	
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		ocupacao = 0;
		nome = null;
		cbo = 0;
			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			OcupacaoKey key = (OcupacaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_ocupacoes ?");
		    stmt.setInt(1,key.ocupacao);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		ocupacao = rs.getInt("ocupacao");
		    	nome   = rs.getString("nome");
		    	cbo  = rs.getInt("cbo");		    	
		    }
		    else{
			   throw new EJBException("Erro ao carregar Ocupações");
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
			OcupacaoKey key = (OcupacaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_ocupacoes ?");
		    stmt.setInt(1,key.ocupacao);
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
			OcupacaoKey key = (OcupacaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_ocupacoes ?,?,?");

		    stmt.setInt(1,key.ocupacao);
			stmt.setString(2,nome);
			stmt.setInt(3,cbo);
			
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
	public br.smat.ejb.ocupacao.OcupacaoKey ejbCreate(String nome, int cbo)
		throws javax.ejb.CreateException {
			
			Connection 	conn 	= null;			
			OcupacaoKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_ocupacoes null,?,?");
				
					
			    stmt.setString(1,nome);
			    stmt.setInt(2,cbo);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					ocupacao = rs.getInt("ocupacao");
				else
					throw new EJBException("FAILED TO INSERT");

			    setNome(nome);
			    setCbo(cbo);
				retVal = new OcupacaoKey(ocupacao);
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
	public void ejbPostCreate(String nome, int cbo) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.ocupacao.OcupacaoKey ejbFindByPrimaryKey(
		br.smat.ejb.ocupacao.OcupacaoKey key)
		throws javax.ejb.FinderException {
			
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_ocupacoes ?");
				stmt.setInt(1,key.ocupacao);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("OcupacaoBean ejbFindByPrimaryKey => Ocupacao not found");
			}
			catch(SQLException e){
					throw new FinderException("OcupacaoBean ejbFindByPrimaryKey => Ocupacao not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}

	public Collection ejbFindAllOcupacoes() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_ocupacoes");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new OcupacaoKey(rs.getInt("ocupacao")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("EstadoBean ejbFindAllEstados => Estado not Found");
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
