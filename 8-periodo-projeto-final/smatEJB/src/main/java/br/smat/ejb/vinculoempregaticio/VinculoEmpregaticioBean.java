package br.smat.ejb.vinculoempregaticio;

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
 * Bean implementation class for Enterprise Bean: VinculoEmpregaticio
 */
public class VinculoEmpregaticioBean implements javax.ejb.EntityBean {
	
    private int 	vinculoEmpregaticio;
    private String	nome;
       		
	private javax.ejb.EntityContext ctx;
	
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the vinculoEmpregaticio.
	 * @return int
	 */
	public int getVinculoEmpregaticio() {
		return vinculoEmpregaticio;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the vinculoEmpregaticio.
	 * @param vinculoEmpregaticio The vinculoEmpregaticio to set
	 */
	public void setVinculoEmpregaticio(int vinculoEmpregaticio) {
		this.vinculoEmpregaticio = vinculoEmpregaticio;
	}
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

    	vinculoEmpregaticio = 0;
    	nome = null;
    		
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			VinculoEmpregaticioKey key = (VinculoEmpregaticioKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_vinculosempregaticios ?");
		    stmt.setInt(1,key.vinculoEmpregaticio);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		vinculoEmpregaticio = rs.getInt("vinculoEmpregaticio");
		    	nome                = rs.getString("nome");		    	
		    }
		    else{
			   throw new EJBException("VinculosEmpregaticiosBean ejbLoad EJBException");
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
			VinculoEmpregaticioKey key = (VinculoEmpregaticioKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_vinculosempregaticios ?");
		    stmt.setInt(1,key.vinculoEmpregaticio);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("VinculosEmpregaticiosBean ejbRemove EJBException");
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
			VinculoEmpregaticioKey key = (VinculoEmpregaticioKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_gravar_vinculosempregaticios ?,?");

		    stmt.setInt(1,key.vinculoEmpregaticio);
			stmt.setString(2,this.nome);

			
		    int rs = stmt.executeUpdate();
		    
		    if(rs != 1){
		    	throw new EJBException("VinculosEmpregaticiosBean ejbStore EJBException rs:"+rs);
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
	public VinculoEmpregaticioKey ejbCreate(String nome)
		throws javax.ejb.CreateException {
			Connection 		conn 	= null;			
			VinculoEmpregaticioKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_vinculosempregaticios null,?");
			    stmt.setString(1,nome);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					vinculoEmpregaticio = rs.getInt("vinculoEmpregaticio");
				else
					throw new EJBException("VinculosEmpregaticiosBean ejbCreate EJBException");

			    setNome(nome);
		
				retVal = new VinculoEmpregaticioKey(vinculoEmpregaticio);
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
	public VinculoEmpregaticioKey ejbFindByPrimaryKey(VinculoEmpregaticioKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_vinculosempregaticios ?");
				stmt.setInt(1,key.vinculoEmpregaticio);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("VinculoEmpregaticio ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("VinculoEmpregaticio ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}
	
    public Collection ejbFindAllVinculosEmpregaticios() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_vinculosempregaticios");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new VinculoEmpregaticioKey(rs.getInt("vinculoEmpregaticio")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("EstadoCivisBean ejbFindAllVinculosEmpregaticios FinderException");
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
