package br.smat.ejb.locallesao;

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


/**
 * Bean implementation class for Enterprise Bean: LocalLesao
 */
public class LocalLesaoBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int localLesao;
	private String nome;
	private LocalLesaoKey localLesaoPai;
	
	/**
	 * Returns the localLesao.
	 * @return int
	 */
	public int getLocalLesao() {
		return localLesao;
	}

	/**
	 * Returns the localLesaoPai.
	 * @return LocalLesaoKey
	 */
	public LocalLesaoKey getLocalLesaoPai() {
		return localLesaoPai;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the localLesao.
	 * @param localLesao The localLesao to set
	 */
	public void setLocalLesao(int localLesao) {
		this.localLesao = localLesao;
	}

	/**
	 * Sets the localLesaoPai.
	 * @param localLesaoPai The localLesaoPai to set
	 */
	public void setLocalLesaoPai(LocalLesaoKey localLesaoPai) {
		this.localLesaoPai = localLesaoPai;
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

	localLesao = 0;
	nome = null;
	localLesaoPai = null;		
		
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			LocalLesaoKey key = (LocalLesaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_locaisLesao ?");
		    stmt.setInt(1,key.localLesao);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		localLesao = rs.getInt("localLesao");
		    	nome   = rs.getString("nome");

			    					
		    	if(rs.getInt("localLesaoPai") > 0)
			    	localLesaoPai = new LocalLesaoKey(rs.getInt("localLesaoPai"));
		    	
		    }
		    else{
			   throw new EJBException("Erro ao carregar LocaisLesao");
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
			LocalLesaoKey key = (LocalLesaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_locaislesao ?");
		    stmt.setInt(1,key.localLesao);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("Erro ao excluir LocaisLesao");
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
			LocalLesaoKey key = (LocalLesaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_locaislesao ?,?,?");

		    stmt.setInt(1,key.localLesao);
			stmt.setString(2,nome);
			
			
			
			if(localLesaoPai == null)
			   	stmt.setNull(3,Types.INTEGER);
			else
			    stmt.setInt(3,localLesaoPai.localLesao);

			
		    int rs = stmt.executeUpdate();

		    if(rs != 1){
		    	throw new EJBException("Erro ao alterar LocaisLesao: "+rs);
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("Erro ao alterar LocaisLesao");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){throw new EJBException("Erro ao alterar LocaisLesao");}
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
	public br.smat.ejb.locallesao.LocalLesaoKey ejbCreate(String nome, int localLesaoPai)
		throws javax.ejb.CreateException {
			
			Connection 	conn 	= null;			
			LocalLesaoKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_locaislesao null,?,?");
				

			    stmt.setString(1,nome);
			    
			    if(localLesaoPai == 0)
			    	stmt.setNull(2,Types.INTEGER);
			    else
				    stmt.setInt(2,localLesaoPai);


			
				ResultSet rs = stmt.executeQuery();
				

				
				if(rs.next())
					localLesao = rs.getInt("localLesao");
				else
					throw new EJBException("Erro ao inserir LocaisLesao");

			    setNome(nome);
			    
			    if(localLesaoPai != 0 )
			    	setLocalLesaoPai(new LocalLesaoKey(localLesaoPai));

				
				retVal = new LocalLesaoKey(localLesao);
				
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
	public void ejbPostCreate(String nome, int localLesaoPai) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.locallesao.LocalLesaoKey ejbFindByPrimaryKey(
		br.smat.ejb.locallesao.LocalLesaoKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_locaislesao ?");
				stmt.setInt(1,key.localLesao);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("LocalLesaoBean ejbFindByPrimaryKey => LocalLesao not found");
			}
			catch(SQLException e){
					throw new FinderException("LocalLesaoBean ejbFindByPrimaryKey => LocalLesao not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}

	public Collection ejbFindAllLocaisLesao() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_locaislesao");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new LocalLesaoKey(rs.getInt("localLesao")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("LocalLesaoBean ejbFindAllLocaisLesao => LocalLesao not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}

	public Collection ejbFindAllLocaisLesao(int pai) throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_locaislesao null,?");
			
			stmt.setInt(1,pai);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new LocalLesaoKey(rs.getInt("localLesao")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("LocalLesaoBean ejbFindAllLocaisLesao => LocalLesao not Found");
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
