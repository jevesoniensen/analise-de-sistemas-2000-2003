package br.smat.ejb.locallesaoacidente;

import java.sql.Connection;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.CreateException;
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
import br.smat.ejb.acidente.AcidenteKey;
import br.smat.ejb.locallesao.LocalLesaoKey;

/**
 * Bean implementation class for Enterprise Bean: LocalLesaoAcidente
 */
public class LocalLesaoAcidenteBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private LocalLesaoKey	localLesao;
	private AcidenteKey	acidente;

	/**
	 * Returns the acidente.
	 * @return AcidenteKey
	 */
	public AcidenteKey getAcidente() {
		return acidente;
	}

	/**
	 * Returns the localLesao.
	 * @return LocalLesaoKey
	 */
	public LocalLesaoKey getLocalLesao() {
		return localLesao;
	}

	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(AcidenteKey acidente) {
		this.acidente = acidente;
	}

	/**
	 * Sets the localLesao.
	 * @param localLesao The localLesao to set
	 */
	public void setLocalLesao(LocalLesaoKey localLesao) {
		this.localLesao = localLesao;
	}
		
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		localLesao = null;
		acidente = null;
			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

			LocalLesaoAcidenteKey key = (LocalLesaoAcidenteKey)ctx.getPrimaryKey();

    		localLesao = key.localLesao;
	    	acidente   = key.acidente;
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
			LocalLesaoAcidenteKey key = (LocalLesaoAcidenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_locaislesaoacidentes ?,?");
		    
		    stmt.setInt(1,key.localLesao.localLesao);
		    stmt.setInt(2,key.acidente.acidente);
		    
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("LocalLesaoAcidenteBean ejbRemove => Erro ao excluir LocaisLesaoAcidentes");
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
	public LocalLesaoAcidenteKey ejbCreate(int localLesao, int acidente)
		throws javax.ejb.CreateException {

			Connection 	conn 	= null;			
			LocalLesaoAcidenteKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_locaislesaoacidentes ?,?");
				

			    stmt.setInt(1,localLesao);
		     	stmt.setInt(2,acidente);
			    
	    		int r = stmt.executeUpdate();
	    		
		    	if(r == 0)
	    		{
			   		throw new EJBException("LocalLesaoAcidenteBean ejbRemove => Erro ao excluir LocaisLesaoAcidente");
		   	 	}

			    setLocalLesao(new LocalLesaoKey(localLesao));
			    setAcidente(new AcidenteKey(acidente));
			    
				retVal = new LocalLesaoAcidenteKey(this.localLesao,this.acidente);
			}catch(SQLException e){
				System.out.println("***********************************");
				System.out.println("******LocalLesaoAcidente Bean *****");
				e.printStackTrace();
				System.out.println("***********************************");				
				throw new CreateException("LocalLesaoAcidente ejbCreate " + e.getMessage());
			}

			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
				e.printStackTrace();					
					throw new CreateException("LocalLesaoAcidenteBean ejbCreate "  + e.getMessage());					
				}
			}

			return retVal;
			
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(int localLesao, int acidente) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public LocalLesaoAcidenteKey ejbFindByPrimaryKey(LocalLesaoAcidenteKey key)
		throws javax.ejb.FinderException {

			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_locaislesaoacidentes ?,?");
				stmt.setInt(1,key.localLesao.localLesao);
				stmt.setInt(2,key.acidente.acidente);
				
				ResultSet rs = stmt.executeQuery();
				
				if(rs.next())
					return key;
				else
					throw new FinderException("LocalLesaoAcidenteBean ejbFindByPrimaryKey => LocalLesaoAcidente not found");
			}
			catch(SQLException e){
					throw new FinderException("LocalLesaoAcidenteBean ejbFindByPrimaryKey => LocalLesaoAcidente not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
		}
}
