package br.smat.controleacesso.ejb.usuariogrupo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.controleacesso.ejb.grupo.GrupoKey;
import br.smat.controleacesso.ejb.usuario.UsuarioKey;

/**
 * Bean implementation class for Enterprise Bean: UsuarioGrupo
 */
public class UsuarioGrupoBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	
	private GrupoKey 	grupo;
	private UsuarioKey usuario;
	private String 	nomeUsuario;
	private String 	nomeGrupo;	
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		grupo = null;
		usuario = null;
		nomeUsuario = null;
		nomeGrupo = null;			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			UsuarioGrupoKey key = (UsuarioGrupoKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_usuariosgrupos ?,?");
		    stmt.setInt(1,key.usuario.usuario);
		    stmt.setInt(2,key.grupo.grupo);
		    		    
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.grupo 	 	= new GrupoKey(rs.getInt("grupo"));
	    		this.usuario 	 	= new UsuarioKey(rs.getInt("usuario"));	    		
		    	this.nomeGrupo  	= rs.getString("nomeGrupo");		    	
		    	this.nomeUsuario  	= rs.getString("nomeUsuario");		    	
		    	
		    }		    
		    else{
			   throw new EJBException("UsuarioGrupoBean ejbLoad EJBException");
		    }
		}
		catch(SQLException e){
			   throw new EJBException("UsuarioGrupoBean SQLException EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("UsuarioGrupoBean SQLException EJBException");
			}
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
			UsuarioGrupoKey key = (UsuarioGrupoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_usuariosgrupos ?,?");
		    stmt.setInt(1,key.usuario.usuario);
		    stmt.setInt(2,key.grupo.grupo);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("UsuarioGrupoBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			throw new EJBException("UsuarioGrupoBean1 ejbRemove EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("UsuarioGrupoBean2 ejbRemove EJBException");
			}
		}		
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
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
	public br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupoKey ejbCreate(int grupo,int usuario)
		throws javax.ejb.CreateException {
			Connection 			conn 	= null;			
			UsuarioGrupoKey 	retVal  = null;
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_usuariogrupo ?,?");
			    stmt.setInt(1,usuario);
			    stmt.setInt(2,grupo);


				ResultSet rs = stmt.executeQuery();


				if(rs.next()){
		    		this.grupo 	 	= new GrupoKey(rs.getInt("grupo"));
		    		this.usuario 	 	= new UsuarioKey(rs.getInt("usuario"));	    		
			    	this.nomeGrupo  	= rs.getString("nomeGrupo");		    	
			    	this.nomeUsuario  	= rs.getString("nomeUsuario");		    	
				}
				else
					throw new EJBException("UsuarioGrupoBean1 ejbCreate EJBException");
		
				retVal = new UsuarioGrupoKey(this.grupo,this.usuario);
			}
			catch(SQLException e){
					throw new EJBException("UsuarioGrupoBean2 ejbCreate EJBException");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("UsuarioGrupoBean3 ejbCreate EJBException");					
				}
			}
			
			return retVal;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(int grupo,int usuario) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public UsuarioGrupoKey ejbFindByPrimaryKey(UsuarioGrupoKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_usuariosgrupos ?,?");
				stmt.setInt(1,key.usuario.usuario);
				stmt.setInt(2,key.grupo.grupo);				
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("UsuarioGrupoBean1 ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("UsuarioGrupoBean2 ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){
					throw new FinderException("UsuarioGrupoBean3 ejbFindByPrimaryKey FinderException 2");					
				}
			}	
	}
	
	
    public Collection ejbFindAll() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_usuariosgrupos null,null");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new UsuarioGrupoKey(rs.getInt("grupo"),rs.getInt("usuario")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("UsuarioGrupoBean ejbFindAll FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new FinderException("UsuarioGrupoBean2 ejbFindAll FinderException ");
			}
		}
		return retVal;
	}		

    public Collection ejbFindAllByGrupo(int grupo) throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_usuariosgrupos null,?");
			stmt.setInt(1,grupo);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new UsuarioGrupoKey(rs.getInt("grupo"),rs.getInt("usuario")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("UsuarioGrupoBean ejbFindAllByGrupo FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new FinderException("UsuarioGrupoBean2 ejbFindAllByGrupo FinderException ");
			}
		}
		return retVal;
	}
	
    public Collection ejbFindAllByUsuario(int usuario) throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_usuariosgrupos ?,null");
			stmt.setInt(1,usuario);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new UsuarioGrupoKey(rs.getInt("grupo"),rs.getInt("usuario")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("UsuarioGrupoBean ejbFindAllByGrupo FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new FinderException("UsuarioGrupoBean2 ejbFindAllByGrupo FinderException ");
			}
		}
		return retVal;
	}	
	
	/**
	 * Returns the grupo.
	 * @return GrupoKey
	 */
	public GrupoKey getGrupo() {
		return grupo;
	}

	public int getGrupoKey() {
		return grupo.grupo;
	}

	/**
	 * Returns the nomeGrupo.
	 * @return String
	 */
	public String getNomeGrupo() {
		return nomeGrupo;
	}

	/**
	 * Returns the nomeUsuario.
	 * @return String
	 */
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	/**
	 * Returns the usuario.
	 * @return UsuarioKey
	 */
	public UsuarioKey getUsuario() {
		return usuario;
	}

	public int getUsuarioKey() {
		return usuario.usuario;
	}

	/**
	 * Sets the grupo.
	 * @param grupo The grupo to set
	 */
	public void setGrupo(GrupoKey grupo) {
		this.grupo = grupo;
	}

	/**
	 * Sets the nomeGrupo.
	 * @param nomeGrupo The nomeGrupo to set
	 */
	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}

	/**
	 * Sets the nomeUsuario.
	 * @param nomeUsuario The nomeUsuario to set
	 */
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	/**
	 * Sets the usuario.
	 * @param usuario The usuario to set
	 */
	public void setUsuario(UsuarioKey usuario) {
		this.usuario = usuario;
	}

}
