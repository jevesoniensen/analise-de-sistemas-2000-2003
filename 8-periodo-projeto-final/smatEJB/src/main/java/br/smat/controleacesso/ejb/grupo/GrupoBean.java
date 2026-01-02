package br.smat.controleacesso.ejb.grupo;

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
 * Bean implementation class for Enterprise Bean: Grupo
 */
public class GrupoBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int 	grupo;
	private String nome;
	
	
	private boolean atualiza;
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		grupo = 0;
		nome = null;
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection conn = null;
		atualiza = false;

		try{
			conn = Conexao.getConnection();
			GrupoKey key = (GrupoKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_grupos ?");
		    stmt.setInt(1,key.grupo);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.grupo = rs.getInt("grupo");
		    	this.nome  = rs.getString("nome");		    	
		    }
		    else{
			   throw new EJBException("GrupoBean ejbLoad EJBException");
		    }
		}
		catch(SQLException e){
			   throw new EJBException("GrupoBean SQLException EJBException");
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
			GrupoKey key = (GrupoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_grupos ?");
		    stmt.setInt(1,key.grupo);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("GrupoBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("GrupoBean ejbRemove EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){throw new EJBException("GrupoBean ejbRemove EJBException");}
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
				GrupoKey key = (GrupoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_grupo ?,?");
	
			    stmt.setInt(1,key.grupo);
				stmt.setString(2,this.nome);
					
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("GrupoBean ejbStore EJBException rs:"+rs);
			    }
			}
			catch(SQLException e){
					throw new EJBException("GrupoBean ejbStore SQLException ");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("GrupoBean2 ejbStore SQLException ");
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
		ctx = null;
	}
	/**
	 * ejbCreate
	 */
	public GrupoKey ejbCreate(String nome)
		throws javax.ejb.CreateException {
			Connection 			conn 	= null;			
			GrupoKey 	retVal  = null;
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_grupo null,?");
			    stmt.setString(1,nome);

				ResultSet rs = stmt.executeQuery();


				if(rs.next())
					grupo = rs.getInt("grupo");					                            
				else
					throw new EJBException("GrupoBean1 ejbCreate EJBException");

			    setNome(nome);
		
				retVal = new GrupoKey(grupo);
			}
			catch(SQLException e){
					throw new EJBException("GrupoBean2 ejbCreate EJBException");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("GrupoBean3 ejbCreate EJBException");					
				}
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
	public GrupoKey ejbFindByPrimaryKey(GrupoKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_grupos ?");
				stmt.setInt(1,key.grupo);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("GrupoBean1 ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("GrupoBean2 ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){
					throw new FinderException("GrupoBean3 ejbFindByPrimaryKey FinderException 2");					
				}
			}		
	}
	/**
	 * Returns the grupo.
	 * @return int
	 */
	public int getGrupo() {
		atualiza = false;				
		return grupo;
	}

	/**
	 * Returns the modulos.
	 * @return int
	 */
	public String getNome() {
		atualiza = false;		
		return nome;
	}

	/**
	 * Sets the grupo.
	 * @param grupo The grupo to set
	 */
	public void setGrupo(int grupo) {
		atualiza = true;
		this.grupo = grupo;
	}

	/**
	 * Sets the modulos.
	 * @param modulos The modulos to set
	 */
	public void setNome(String nome) {
		atualiza = true;
		this.nome = nome;
	}

    public Collection ejbFindAll() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_grupos");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new GrupoKey(rs.getInt("grupo")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GrupoBean ejbFindAll FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new FinderException("GrupoBean ejbFindByPrimaryKey FinderException ");
			}
		}
		return retVal;
	}	
}
