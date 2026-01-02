package br.smat.controleacesso.ejb.modulo;


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
import br.smat.controleacesso.ejb.pagina.PaginaKey;

/**
 * Bean implementation class for Enterprise Bean: Modulo
 */
public class ModuloBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int modulo;
	private PaginaKey paginaDefault;
	private String nome;
	private ModuloKey moduloPai;
	private String estrutura;

	private boolean atualiza;
       	
	/**
	 * Returns the estrutura.
	 * @return String
	 */
	public String getEstrutura() {
		atualiza = false;		
		return estrutura;
	}

	/**
	 * Returns the modulo.
	 * @return int
	 */
	public int getModulo() {
		atualiza = false;		
		return modulo;
	}

	/**
	 * Returns the moduloPai.
	 * @return ModuloKey
	 */
	public ModuloKey getModuloPai() {
		atualiza = false;		
		return moduloPai;
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
	 * Returns the paginaDefault.
	 * @return PaginaKey
	 */
	public PaginaKey getPaginaDefault() {
		atualiza = false;		
		return paginaDefault;
	}

	/**
	 * Sets the estrutura.
	 * @param estrutura The estrutura to set
	 */
	public void setEstrutura(String estrutura) {
		atualiza = true;		
		this.estrutura = estrutura;
	}

	/**
	 * Sets the modulo.
	 * @param modulo The modulo to set
	 */
	public void setModulo(int modulo) {
		atualiza = true;		
		this.modulo = modulo;
	}

	/**
	 * Sets the moduloPai.
	 * @param moduloPai The moduloPai to set
	 */
	public void setModuloPai(ModuloKey moduloPai) {
		atualiza = true;		
		this.moduloPai = moduloPai;
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
	 * Sets the paginaDefault.
	 * @param paginaDefault The paginaDefault to set
	 */
	public void setPaginaDefault(PaginaKey paginaDefault) {
		atualiza = true;
		this.paginaDefault = paginaDefault;
	}

	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		modulo = 0;
		paginaDefault = null;
		nome = null;
		moduloPai = null;
		estrutura = null;		
	}
	
	/**
	 * ejbLoad
	 */
	
	public void ejbLoad() {

		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			
			ModuloKey key = (ModuloKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_modulos ?");

		    stmt.setInt(1,key.modulo);

	    	ResultSet rs = stmt.executeQuery();


		    if(rs.next()){
	    		modulo = rs.getInt("modulo");
	    		
	    		if(rs.getInt("paginaDefault") != 0)
		    		paginaDefault = new PaginaKey(rs.getInt("paginaDefault"));
		    		
		    	nome   = rs.getString("nome");

	    		if(rs.getInt("moduloPai") != 0)		    	
		    		moduloPai = new ModuloKey(rs.getInt("moduloPai"));

	    		estrutura = rs.getString("estrutura");
		    	
		    }
		    else{
			   throw new EJBException("Erro ao carregar Modulos");
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
			ModuloKey key = (ModuloKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_modulos ?");
		    stmt.setInt(1,key.modulo);
		    
		    System.out.println("Modulo a ser excluido => " + key.modulo);
		    
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("Erro ao excluir Modulos");
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new EJBException("Erro ao excluir Modulos");
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e)
			{throw new EJBException("Erro ao excluir Modulos");}
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
			ModuloKey key = (ModuloKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_modulos ?,?,?,?,?");

		    stmt.setInt(1,key.modulo);

			if(paginaDefault != null)
			    stmt.setInt(2,paginaDefault.pagina);
			else
				stmt.setNull(2,Types.INTEGER);

			stmt.setString(3,nome);
			
			if(moduloPai != null)
				stmt.setInt(4,moduloPai.modulo);
			else
				stmt.setNull(4,Types.INTEGER);				
			
			stmt.setString(5,estrutura);
			
		    int rs = stmt.executeUpdate();
		    
		    if(rs != 1){
		    	throw new EJBException("Erro ao alterar Modulos: "+rs);
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("Erro ao excluir Modulos");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){throw new EJBException("Erro ao excluir Modulos");}
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
	public ModuloKey ejbCreate(int paginaDefault,
																	 String nome,
																	 int moduloPai,
																	 String estrutura)
		throws javax.ejb.CreateException {

			Connection 	conn 	= null;			
			ModuloKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_modulos null,?,?,?,?");
				

				if(paginaDefault == 0 )
				    stmt.setInt(1,paginaDefault);
				else
					stmt.setNull(1,Types.INTEGER);
					
			    stmt.setString(2,nome);			    
			    
				if(moduloPai == 0 )
				    stmt.setInt(3,moduloPai);
				else
					stmt.setNull(3,Types.INTEGER);
			    
			    stmt.setString(4,estrutura);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					modulo = rs.getInt("modulo");
				else
					throw new EJBException("Erro ao inserir Modulos");

				setPaginaDefault(new PaginaKey(paginaDefault));
			    setNome(nome);
			    setModuloPai(new ModuloKey(moduloPai));
			    setEstrutura(estrutura);
				retVal = new ModuloKey(modulo);
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
	public void ejbPostCreate( int paginaDefault,
   							    String nome,
								int moduloPai,
								String estrutura) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public ModuloKey ejbFindByPrimaryKey(ModuloKey key)
		throws javax.ejb.FinderException {
			
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_modulos ?");
				stmt.setInt(1,key.modulo);
				
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("ModuloBean ejbFindByPrimaryKey => Modulo not found");
			}
			catch(SQLException e){
					throw new FinderException("ModuloBean ejbFindByPrimaryKey => Modulo not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
			

	}

	public Collection ejbFindAllModulos() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_modulos");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new ModuloKey(rs.getInt("modulo")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("ModuloBean ejbFindAllModulos => Modulos not Found");
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
