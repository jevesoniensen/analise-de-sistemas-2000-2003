package br.smat.ejb.medidacorretivainvestigacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.investigacao.InvestigacaoKey;
import br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey;

/**
 * Bean implementation class for Enterprise Bean: MedidaCorretivaInvestigacao
 */
public class MedidaCorretivaInvestigacaoBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private InvestigacaoKey 			investigacao;
	private TipoMedidaCorretivaKey 	tipoMedidaCorretiva;	
	private int						prazoDias;
	private String						observacao;

	private boolean					atualiza;

	/**
	 * Returns the investigacao.
	 * @return InvestigacaoKey
	 */
	public InvestigacaoKey getInvestigacao() {
		atualiza = false;
		return investigacao;
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
	 * @return int
	 */
	public int getPrazoDias() {
		atualiza = false;
		return prazoDias;
	}

	/**
	 * Returns the tipoMedidaCorretiva.
	 * @return TipoMedidaCorretivaKey
	 */
	public TipoMedidaCorretivaKey getTipoMedidaCorretiva() {
		atualiza = true;
		return tipoMedidaCorretiva;
	}

	/**
	 * Sets the investigacao.
	 * @param investigacao The investigacao to set
	 */
	public void setInvestigacao(InvestigacaoKey investigacao) {
		atualiza = true;
		this.investigacao = investigacao;
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
	 * Sets the tipoMedidaCorretiva.
	 * @param tipoMedidaCorretiva The tipoMedidaCorretiva to set
	 */
	public void setTipoMedidaCorretiva(TipoMedidaCorretivaKey tipoMedidaCorretiva) {
		atualiza = true;
		this.tipoMedidaCorretiva = tipoMedidaCorretiva;
	}
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		investigacao 		= null;
		tipoMedidaCorretiva = null;	
		prazoDias			= 0;
		observacao			= null;
		atualiza			= false;

	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection conn = null;
		atualiza = false;

		try{
			conn = Conexao.getConnection();
			MedidaCorretivaInvestigacaoKey key = (MedidaCorretivaInvestigacaoKey)ctx.getPrimaryKey();
			System.out.println(key);
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_medidascorretivasinvestigacao ?,?");
		    stmt.setInt(1,key.investigacao.investigacao);
		    stmt.setInt(2,key.tipoMedidaCorretiva.tipoMedidaCorretiva);
		    
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.investigacao  		= new InvestigacaoKey(rs.getInt("investigacao"));
		    	this.tipoMedidaCorretiva 	= new TipoMedidaCorretivaKey(rs.getInt("tipoMedidaCorretiva"));
		    	this.prazoDias				= rs.getInt("prazoDias");
		    	this.observacao 			= rs.getString("observacao");
		    }
		    else{
			   throw new EJBException("MedidaCorretivaInvestigacaoBean ejbLoad EJBException");
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
			MedidaCorretivaInvestigacaoKey key = (MedidaCorretivaInvestigacaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_medidascorretivasinvestigacao ?,?");

		    stmt.setInt(1,key.investigacao.investigacao);
		    stmt.setInt(2,key.tipoMedidaCorretiva.tipoMedidaCorretiva);

	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("MedidaCorretivaInvestigacaoBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("MedidaCorretivaInvestigacaoBean ejbRemove EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){throw new EJBException("MedidaCorretivaInvestigacaoBean ejbRemove EJBException");}
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
				MedidaCorretivaInvestigacaoKey key = (MedidaCorretivaInvestigacaoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_medidascorretivasinvestigacao ?,?,?,?");
	
			    stmt.setInt(1,key.investigacao.investigacao);
			    stmt.setInt(2,key.tipoMedidaCorretiva.tipoMedidaCorretiva);
			    stmt.setInt(3,prazoDias);
			    stmt.setString(4,observacao);
					
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("MedidaCorretivaInvestigacaoBean ejbStore EJBException rs:"+rs);
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
	public MedidaCorretivaInvestigacaoKey ejbCreate(	int investigacao,
														int tipoMedidaCorretiva,
														int prazoDias,
														String observacao)
		throws javax.ejb.CreateException {
			Connection 						conn 	= null;			
			MedidaCorretivaInvestigacaoKey 	retVal  = null;
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_medidascorretivasinvestigacao ?,?,?,?");
					
			    stmt.setInt(1,investigacao);
			    stmt.setInt(2,tipoMedidaCorretiva);
			    stmt.setInt(3,prazoDias);
			    stmt.setString(4,observacao);


				ResultSet rs = stmt.executeQuery();
				
				System.out.println("rs "+rs);

				if(rs.next()){
		    		investigacao 		= rs.getInt("investigacao"       );
			    	tipoMedidaCorretiva = rs.getInt("tipoMedidaCorretiva");
				}	
				else
					throw new EJBException("MedidaCorretivaInvestigacaoBean ejbCreate EJBException");

				setInvestigacao(new InvestigacaoKey(investigacao));
				setTipoMedidaCorretiva(new TipoMedidaCorretivaKey(tipoMedidaCorretiva));				
			    setPrazoDias(prazoDias);
			    setObservacao(observacao);
		
				retVal = new MedidaCorretivaInvestigacaoKey(	investigacao,
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
	public void ejbPostCreate(	int investigacao,
									int tipoMedidaCorretiva,
									int prazoDias,
									String observacao) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public MedidaCorretivaInvestigacaoKey ejbFindByPrimaryKey(MedidaCorretivaInvestigacaoKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_medidascorretivasinvestigacao ?,?");
				stmt.setInt(1,key.investigacao.investigacao);
				stmt.setInt(2,key.tipoMedidaCorretiva.tipoMedidaCorretiva);				
			
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("MedidaCorretivaInvestigacaoBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("MedidaCorretivaInvestigacaoBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}	
	}

    public Collection ejbFindAllMedidaCorretivaInvestigacao(int investigacao) throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_medidascorretivasinvestigacao ?");
			stmt.setInt(1,investigacao);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new MedidaCorretivaInvestigacaoKey(rs.getInt("investigacao"),rs.getInt("tipoMedidaCorretiva")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("MedidaCorretivaInvestigacaoBean ejbFindAllMedidaCorretivaInvestigacao FinderException");
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
