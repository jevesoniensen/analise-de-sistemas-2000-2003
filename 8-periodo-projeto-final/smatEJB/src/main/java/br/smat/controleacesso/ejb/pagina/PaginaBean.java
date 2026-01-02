package br.smat.controleacesso.ejb.pagina;

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
 * Bean implementation class for Enterprise Bean: Pagina
 */
public class PaginaBean implements javax.ejb.EntityBean {
	
	private javax.ejb.EntityContext ctx;
	
	private int pagina;
	private String nome;

	private boolean atualiza;	

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		atualiza = false;
		return nome;
	}

	/**
	 * Returns the pagina.
	 * @return int
	 */
	public int getPagina() {
		atualiza = false;		
		return pagina;
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
	 * Sets the pagina.
	 * @param pagina The pagina to set
	 */
	public void setPagina(int pagina) {
		atualiza = true;		
		this.pagina = pagina;
	}

	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		pagina = 0;
		nome = null;
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection conn = null;

		System.out.println("aqui 1");
		try{
			conn = Conexao.getConnection();
			
			PaginaKey key = (PaginaKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_paginas ?");

		    stmt.setInt(1,key.pagina);

	    	ResultSet rs = stmt.executeQuery();


			System.out.println("pagina => " + key.pagina);
		    if(rs.next()){
	    		pagina = rs.getInt("pagina");
		    	nome   = rs.getString("nome");
		    }
		    else{
			   throw new EJBException("Erro ao carregar Paginas");
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
			PaginaKey key = (PaginaKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_paginas ?");
		    stmt.setInt(1,key.pagina);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("Erro ao excluir Paginas");
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
			PaginaKey key = (PaginaKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_paginas ?,?");

		    stmt.setInt(1,key.pagina);
			stmt.setString(2,nome);
			
		    int rs = stmt.executeUpdate();
		    
		    if(rs != 1){
		    	throw new EJBException("Erro ao alterar Paginas: "+rs);
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
	public PaginaKey ejbCreate(String nome)
		throws javax.ejb.CreateException {
			
			Connection 	conn 	= null;			
			PaginaKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_paginas null,?");
				

			    stmt.setString(1,nome);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					pagina = rs.getInt("pagina");
				else
					throw new EJBException("Erro ao inserir Paginas");

			    setNome(nome);
				retVal = new PaginaKey(pagina);
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
	public PaginaKey ejbFindByPrimaryKey(PaginaKey key)
		throws javax.ejb.FinderException {

			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_paginas ?");
				stmt.setInt(1,key.pagina);
				
				System.out.println("keypagina => "+key.pagina);
				
				ResultSet rs = stmt.executeQuery();
				if(rs.next()){
					System.out.println("RSSS keypagina => "+rs.getInt("pagina"));
					return key;
				}
				else
					throw new FinderException("PaginaBean ejbFindByPrimaryKey => Pagina not found");
			}
			catch(SQLException e){
					throw new FinderException("PaginaBean ejbFindByPrimaryKey => Pagina not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}	

	}

	public Collection ejbFindAllPaginas() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_paginas");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				System.out.println("find all => " + rs.getInt("pagina"));
				retVal.addElement(new PaginaKey(rs.getInt("pagina")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("PaginaBean ejbFindAllPaginas => Paginas not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}
	
	public PaginaKey ejbFindPermisaoPagina(int usuario, int pagina) throws FinderException
	{
		Connection conn = null;
		PaginaKey retVal = null;
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_permissaopagina ?,?");
			
			stmt.setInt(1,usuario);
			stmt.setInt(2,pagina);
			
			ResultSet rs = stmt.executeQuery();
			
	
			
			while(rs.next()){
				retVal = new PaginaKey(rs.getInt("pagina"));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("PaginaBean ejbFindPermisaoPagina => Sem permissão!");
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
