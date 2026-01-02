package br.smat.ejb.tramitefiscalizacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.fiscalizacao.FiscalizacaoKey;
import br.smat.ejb.status.StatusKey;
import br.smat.ejb.trabalhador.TrabalhadorKey;

/**
 * Bean implementation class for Enterprise Bean: TramiteFiscalizacao
 */
public class TramiteFiscalizacaoBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int 				tramiteFiscalizacao;
	private FiscalizacaoKey	fiscalizacao;
	private StatusKey			status;
	private String				data;
	
	private boolean atualiza;
	
	/**
	 * Returns the data.
	 * @return String
	 */
	public String getData() {
		atualiza = false;
		return data;
	}

	/**
	 * Returns the fiscalizacao.
	 * @return FiscalizacaoKey
	 */
	public FiscalizacaoKey getFiscalizacao() {
		atualiza = false;		
		return fiscalizacao;
	}

	/**
	 * Returns the status.
	 * @return StatusKey
	 */
	public StatusKey getStatus() {
		atualiza = false;
		return status;
	}

	/**
	 * Returns the tramiteFiscalizacao.
	 * @return int
	 */
	public int getTramiteFiscalizacao() {
		atualiza = false;
		return tramiteFiscalizacao;
	}

	/**
	 * Sets the data.
	 * @param data The data to set
	 */
	public void setData(String data) {
		atualiza = true;		
		this.data = data;
	}

	/**
	 * Sets the fiscalizacao.
	 * @param fiscalizacao The fiscalizacao to set
	 */
	public void setFiscalizacao(FiscalizacaoKey fiscalizacao) {
		atualiza = true;		
		this.fiscalizacao = fiscalizacao;
	}

	/**
	 * Sets the status.
	 * @param status The status to set
	 */
	public void setStatus(StatusKey status) {
		atualiza = true;		
		this.status = status;
	}

	/**
	 * Sets the tramiteFiscalizacao.
	 * @param tramiteFiscalizacao The tramiteFiscalizacao to set
	 */
	public void setTramiteFiscalizacao(int tramiteFiscalizacao) {
		atualiza = true;		
		this.tramiteFiscalizacao = tramiteFiscalizacao;
	}
	
		
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		tramiteFiscalizacao = 0;
		fiscalizacao		= null;
		status				= null;
		data				= null;
		atualiza 			= false;				
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		atualiza = false;		

		Connection conn = null;
		atualiza = false;

		try{
			conn = Conexao.getConnection();
			TramiteFiscalizacaoKey  key = (TramiteFiscalizacaoKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_tramitefiscalizacao ?,?");
		    stmt.setInt(1,key.fiscalizacao.fiscalizacao);
		    stmt.setInt(2,key.tramiteFiscalizacao);
		    
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
		    	this.tramiteFiscalizacao 	= rs.getInt("tramiteFiscalizacao"); 
		    	this.fiscalizacao			= new FiscalizacaoKey(rs.getInt("fiscalizacao"));
	    		this.status 				= new StatusKey(rs.getInt("status"));		    	
	    		this.data					= rs.getString("data");
		    }
		    else{
			   throw new EJBException("TramiteFiscalizacaoBean ejbLoad EJBException");
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
		atualiza = false;
	
		try{
			conn = Conexao.getConnection();
			TramiteFiscalizacaoKey key = (TramiteFiscalizacaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_tramitesfiscalizacoes ?,?");
				
		    stmt.setInt(1,key.fiscalizacao.fiscalizacao);
		    stmt.setInt(2,key.tramiteFiscalizacao);
		    
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("TramiteFiscalizacaoBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("TramiteFiscalizacaoBean ejbRemove EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){throw new EJBException("TramiteFiscalizacaoBean ejbRemove EJBException");}
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
				TramiteFiscalizacaoKey key = (TramiteFiscalizacaoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_tramitefiscalizacao ?,?,?");
	
			    stmt.setInt(1,key.tramiteFiscalizacao);
				stmt.setInt(2,key.fiscalizacao.fiscalizacao);
				stmt.setInt(3,this.status.status);			
					
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("TramiteFiscalizacaoBean ejbStore EJBException rs:"+rs);
			    }
			}
			catch(SQLException e){
				throw new EJBException("TramiteFiscalizacaoBean ejbStore => Erro ao alterar SQLException");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("TramiteFiscalizacaoBean ejbStore => Erro ao alterar SQLException");					
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
	public TramiteFiscalizacaoKey ejbCreate(	int 	fiscalizacao,
												int	status)	throws javax.ejb.CreateException {

			Connection				conn 	= null;			
			TramiteFiscalizacaoKey 	retVal  = null;
			
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_tramitefiscalizacao null,?,?");
			    stmt.setInt(1,fiscalizacao);
			    stmt.setInt(2,status);

				ResultSet rs = stmt.executeQuery();
				
				System.out.println("rs "+rs);

				if(rs.next()){
					tramiteFiscalizacao = rs.getInt("tramiteFiscalizacao");					                            
					data				= rs.getString("data");
					
				}
				else
					throw new EJBException("TramiteFiscalizacaoBean ejbCreate EJBException");

			    setFiscalizacao(new FiscalizacaoKey(fiscalizacao));
			    setStatus(new StatusKey(status));
		
				retVal = new TramiteFiscalizacaoKey(tramiteFiscalizacao,this.fiscalizacao);
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
	public void ejbPostCreate(	int 	fiscalizacao,
									int	status) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public TramiteFiscalizacaoKey ejbFindByPrimaryKey(TramiteFiscalizacaoKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_tramitefiscalizacao ?,?");
				stmt.setInt(1,key.fiscalizacao.fiscalizacao);
				stmt.setInt(2,key.tramiteFiscalizacao);				
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("TramiteFiscalizacaoBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("TramiteFiscalizacaoBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}
	
    public Collection ejbFindAllTramitesFiscalizacao(int fiscalizacao) throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_tramitefiscalizacao ?");
			stmt.setInt(1,fiscalizacao);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(	new TramiteFiscalizacaoKey(rs.getInt("tramiteFiscalizacao"),
									new FiscalizacaoKey(rs.getInt("fiscalizacao"))));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("TramiteFiscalizacaoBean ejbFindAllTramitesFiscalizacao FinderException");
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
