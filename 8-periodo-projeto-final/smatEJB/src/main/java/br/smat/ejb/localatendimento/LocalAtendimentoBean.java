package br.smat.ejb.localatendimento;

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
import java.sql.Types;

import javax.sql.DataSource;

import	br.smat.conexao.Conexao;
import br.smat.ejb.municipio.*;

/**
 * Bean implementation class for Enterprise Bean: LocalAtendimento
 */
public class LocalAtendimentoBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;

	private 	int localAtendimento;
	private	String nome;
	private	MunicipioKey	municipio;


	/**
	 * Returns the localAtendimento.
	 * @return int
	 */
	public int getLocalAtendimento() {
		return localAtendimento;
	}

	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio() {
		return municipio;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the localAtendimento.
	 * @param localAtendimento The localAtendimento to set
	 */
	public void setLocalAtendimento(int localAtendimento) {
		this.localAtendimento = localAtendimento;
	}

	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(MunicipioKey municipio) {
		this.municipio = municipio;
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

		localAtendimento = 0;
		nome = null;
		municipio = null;
			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			LocalAtendimentoKey key = (LocalAtendimentoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_locaisatendimento ?");
				
		    stmt.setInt(1,key.localAtendimento);
		    
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		localAtendimento = rs.getInt("localAtendimento");
		    	nome   = rs.getString("nome");
				municipio = new MunicipioKey(rs.getInt("municipio"));
		    	
		    }
		    else{
			   throw new EJBException("LocalAtendimentoKey ejbLoad => Erro ao carregar LocalAtendimento");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("LocalAtendimentoKey ejbLoad => Erro ao carregar LocalAtendimento");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){throw new EJBException("LocalAtendimentoKey ejbLoad => Erro ao carregar LocalAtendimento");}
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
			LocalAtendimentoKey key = (LocalAtendimentoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_locaisatendimento ?");
		    stmt.setInt(1,key.localAtendimento);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("LocalAtendimento ejbRemove => Erro ao excluir LocalAtendimento");
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new EJBException("LocalAtendimento ejbRemove => Erro ao excluir LocalAtendimento");
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e)
			{throw new EJBException("LocalAtendimento ejbRemove => Erro ao excluir LocalAtendimento");}
		}
				
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {

		Connection conn = null;
		try{
			conn = Conexao.getConnection();
			LocalAtendimentoKey key = (LocalAtendimentoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_locaisatendimento ?,?,?");

		    stmt.setInt(1,key.localAtendimento);
			stmt.setString(2,nome);
			stmt.setInt(3,municipio.municipio);
			
		    int rs = stmt.executeUpdate();

		    if(rs != 1){
		    	throw new EJBException("LocalAtendimentoBean ejbStore => Erro ao alterar LocaisAtendimento: "+rs);
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("LocalAtendimentoBean ejbStore => Erro ao alterar LocaisAtendimento");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){throw new EJBException("LocalAtendimentoBean ejbStore => Erro ao alterar LocaisAtendimento");}
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
	public br.smat.ejb.localatendimento.LocalAtendimentoKey ejbCreate(String nome, int municipio)
		throws javax.ejb.CreateException {

			Connection 	conn 	= null;			
			LocalAtendimentoKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_locaisatendimento null,?,?");
				

			    stmt.setString(1,nome);
			    stmt.setInt(2,municipio);
			    
				ResultSet rs = stmt.executeQuery();
				
				if(rs.next())
					localAtendimento = rs.getInt("localAtendimento");
				else
					throw new EJBException("LocalAtendimento ejbCreate => Erro ao inserir LocalAtendimento");

			    setNome(nome);
			    
			    setMunicipio(new MunicipioKey(municipio));
			    
				retVal = new LocalAtendimentoKey(localAtendimento);
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
	public void ejbPostCreate(String nome, int municipio) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public LocalAtendimentoKey ejbFindByPrimaryKey(
		br.smat.ejb.localatendimento.LocalAtendimentoKey key)
		throws javax.ejb.FinderException {

			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_locaisatendimento ?");
				stmt.setInt(1,key.localAtendimento);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("LocalAtendimentoBean ejbFindByPrimaryKey => LocalAtendimento not found");
			}
			catch(SQLException e){
					throw new FinderException("LocalAtendimentoBean ejbFindByPrimaryKey => LocalAtendimento not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
			
	}

	public Collection ejbFindAllLocaisAtendimento() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_locaisatendimento");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new LocalAtendimentoKey(rs.getInt("localAtendimento")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("LocalAtendimentoBean ejbFindAllLocaisAtendimento => LocalAtendimento not Found");
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
