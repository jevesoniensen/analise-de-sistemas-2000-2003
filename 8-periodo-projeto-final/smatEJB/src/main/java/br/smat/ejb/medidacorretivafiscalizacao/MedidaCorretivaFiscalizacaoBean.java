package br.smat.ejb.medidacorretivafiscalizacao;

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
import br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey;

/**
 * Bean implementation class for Enterprise Bean: MedidaCorretivaFiscalizacao
 */
public class MedidaCorretivaFiscalizacaoBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private TramiteFiscalizacaoKey tramiteFiscalizacao;
	private TipoMedidaCorretivaKey tipoMedidaCorretiva;	
	private int					prazoDias;
	private String					observacao;
	
	private boolean atualiza;

	/**
	 * Returns the tipoMedidaCorretiva.
	 * @return TipoMedidaCorretivaKey
	 */
	public TipoMedidaCorretivaKey getTipoMedidaCorretiva() {
		atualiza = false;
		return tipoMedidaCorretiva;
	}

	/**
	 * Returns the tramiteFiscalizacao.
	 * @return TramiteFiscalizacaoKey
	 */
	public TramiteFiscalizacaoKey getTramiteFiscalizacao() {
		atualiza = false;		
		return tramiteFiscalizacao;
	}

	/**
	 * Sets the tipoMedidaCorretiva.
	 * @param tipoMedidaCorretiva The tipoMedidaCorretiva to set
	 */
	public void setTipoMedidaCorretiva(TipoMedidaCorretivaKey tipoMedidaCorretiva) {
		atualiza = true;		
		this.tipoMedidaCorretiva = tipoMedidaCorretiva;
	}

	/**
	 * Sets the tramiteFiscalizacao.
	 * @param tramiteFiscalizacao The tramiteFiscalizacao to set
	 */
	public void setTramiteFiscalizacao(TramiteFiscalizacaoKey tramiteFiscalizacao) {
		atualiza = true;		
		this.tramiteFiscalizacao = tramiteFiscalizacao;
	}

	/**
	 * Returns the observacao.
	 * @return String
	 */
	public String getObservacao() {
		atualiza = false;		
		return observacao;
	}

	/**
	 * Returns the prazoDias.
	 * @return String
	 */
	public int getPrazoDias() {
		atualiza = false;		
		return prazoDias;
	}

	/**
	 * Sets the observacao.
	 * @param observacao The observacao to set
	 */
	public void setObservacao(String observacao) {
		atualiza = true;		
		this.observacao = observacao;
	}

	/**
	 * Sets the prazoDias.
	 * @param prazoDias The prazoDias to set
	 */
	public void setPrazoDias(int prazoDias) {
		atualiza = true;				
		this.prazoDias = prazoDias;
	}
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		tramiteFiscalizacao = null;
		tipoMedidaCorretiva	= null;			
		prazoDias			= 0;
		observacao			= null;
		atualiza = false;
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection conn = null;
		atualiza = false;

		try{
			conn = Conexao.getConnection();
			MedidaCorretivaFiscalizacaoKey key = (MedidaCorretivaFiscalizacaoKey)ctx.getPrimaryKey();
			System.out.println(key);
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_medidascorretivasfiscalizacao ?,?,?");
		    stmt.setInt(1,key.tramiteFiscalizacao.tramiteFiscalizacao);
		    stmt.setInt(2,key.tramiteFiscalizacao.fiscalizacao.fiscalizacao);
		    stmt.setInt(3,key.tipoMedidaCorretiva.tipoMedidaCorretiva);
		    
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.tramiteFiscalizacao = new TramiteFiscalizacaoKey(rs.getInt("tramiteFiscalizacao"),
	    									new FiscalizacaoKey(rs.getInt("fiscalizacao")));
		    	this.tipoMedidaCorretiva = new TipoMedidaCorretivaKey(rs.getInt("tipoMedidaCorretiva"));
		    	this.prazoDias		= rs.getInt("prazoDias");
		    	this.observacao 	= rs.getString("observacao");
		    }
		    else{
			   throw new EJBException("MedidaCorretivaFiscalizacaoBean ejbLoad EJBException");
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
			MedidaCorretivaFiscalizacaoKey key = (MedidaCorretivaFiscalizacaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_medidascorretivasfiscalizacao ?,?,?");

		    stmt.setInt(1,key.tramiteFiscalizacao.tramiteFiscalizacao);
		    stmt.setInt(2,key.tramiteFiscalizacao.fiscalizacao.fiscalizacao);
		    stmt.setInt(3,key.tipoMedidaCorretiva.tipoMedidaCorretiva);

	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("MedidaCorretivaFiscalizacaoBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("MedidaCorretivaFiscalizacaoBean ejbRemove EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){throw new EJBException("MedidaCorretivaFiscalizacaoBean ejbRemove EJBException");}
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
				MedidaCorretivaFiscalizacaoKey key = (MedidaCorretivaFiscalizacaoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_medidascorretivasfiscalizacao ?,?,?,?,?");
	
			    stmt.setInt(1,key.tramiteFiscalizacao.tramiteFiscalizacao);
			    stmt.setInt(2,key.tramiteFiscalizacao.fiscalizacao.fiscalizacao);
			    stmt.setInt(3,key.tipoMedidaCorretiva.tipoMedidaCorretiva);
			    stmt.setInt(4,prazoDias);
			    stmt.setString(5,observacao);
					
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("MedidaCorretivaFiscalizacaoBean ejbStore EJBException rs:"+rs);
			    }
			}
			catch(SQLException e){
				throw new EJBException("MedidaCorretivaFiscalizacaoBean ejbStore => Erro ao alterar SQLException");						
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("MedidaCorretivaFiscalizacaoBean ejbStore => Erro ao alterar SQLException");						
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
	public MedidaCorretivaFiscalizacaoKey ejbCreate(	int tramiteFiscalizacao,
														int fiscalizacao,
														int tipoMedidaCorretiva,
														int prazoDias,
														String observacao)
		throws javax.ejb.CreateException {
			Connection 			conn 	= null;			
			MedidaCorretivaFiscalizacaoKey 	retVal  = null;
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_medidascorretivasfiscalizacao ?,?,?,?,?");
					
			    stmt.setInt(1,tramiteFiscalizacao);
			    stmt.setInt(2,fiscalizacao);
			    stmt.setInt(3,tipoMedidaCorretiva);
			    stmt.setInt(4,prazoDias);
			    stmt.setString(5,observacao);


				ResultSet rs = stmt.executeQuery();
				
				System.out.println("rs "+rs);

				if(rs.next()){
		    		tramiteFiscalizacao = rs.getInt("tramiteFiscalizacao");
	    			fiscalizacao = rs.getInt("fiscalizacao");
			    	tipoMedidaCorretiva = rs.getInt("tipoMedidaCorretiva");
				}	
				else
					throw new EJBException("MedidaCorretivaFiscalizacaoBean ejbCreate EJBException");

				setTramiteFiscalizacao(new TramiteFiscalizacaoKey(tramiteFiscalizacao,
										new FiscalizacaoKey(fiscalizacao)));
				
			    setPrazoDias(prazoDias);
			    setObservacao(observacao);
		
				retVal = new MedidaCorretivaFiscalizacaoKey(	tramiteFiscalizacao,
																fiscalizacao,
																tipoMedidaCorretiva);
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
	public void ejbPostCreate(	int 	tramiteFiscalizacao,
									int 	fiscalizacao,
									int 	tipoMedidaCorretiva,
									int 	prazoDias,
									String 	observacao) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public MedidaCorretivaFiscalizacaoKey ejbFindByPrimaryKey(MedidaCorretivaFiscalizacaoKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_medidascorretivasfiscalizacao ?,?,?");
				stmt.setInt(1,key.tramiteFiscalizacao.tramiteFiscalizacao);
				stmt.setInt(2,key.tramiteFiscalizacao.fiscalizacao.fiscalizacao);				
				stmt.setInt(3,key.tipoMedidaCorretiva.tipoMedidaCorretiva);				
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("MedidaCorretivaFiscalizacaoBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("MedidaCorretivaFiscalizacaoBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}	
	}
	
    public Collection ejbFindAllMedidaCorretivaFiscalizacao(int tramiteFiscalizacao,
    														 int fiscalizacao) throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_medidascorretivasfiscalizacao ?,?");
			stmt.setInt(1,tramiteFiscalizacao);
			stmt.setInt(2,fiscalizacao);				
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new MedidaCorretivaFiscalizacaoKey( 	rs.getInt("tramiteFiscalizacao"),
																	  	rs.getInt("fiscalizacao"),
																	  	rs.getInt("tipoMedidaCorretiva")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("MedidaCorretivaFiscalizacaoBean ejbFindAllMedidaCorretivaFiscalizacao FinderException");
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
