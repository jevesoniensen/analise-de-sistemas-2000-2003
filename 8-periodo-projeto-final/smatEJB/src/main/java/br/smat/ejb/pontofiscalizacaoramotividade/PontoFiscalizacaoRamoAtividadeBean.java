package br.smat.ejb.pontofiscalizacaoramotividade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;

/**
 * Bean implementation class for Enterprise Bean: PontoFiscalizacaoRamoAtividade
 */
public class PontoFiscalizacaoRamoAtividadeBean
	implements javax.ejb.EntityBean {
	
	private javax.ejb.EntityContext ctx;
	
	private 	PontoFiscalizacaoKey 	pontoFiscalizacao;
	private	RamoAtividadeKey		ramoAtividade;
	
	/**
	 * Returns the pontoFiscalizacao.
	 * @return PontoFiscalizacaoKey
	 */
	public PontoFiscalizacaoKey getPontoFiscalizacao() {
		return pontoFiscalizacao;
	}

	/**
	 * Returns the ramoAtividade.
	 * @return RamoAtividadeKey
	 */
	public RamoAtividadeKey getRamoAtividade() {
		return ramoAtividade;
	}

	/**
	 * Sets the pontoFiscalizacao.
	 * @param pontoFiscalizacao The pontoFiscalizacao to set
	 */
	public void setPontoFiscalizacao(PontoFiscalizacaoKey pontoFiscalizacao) {
		this.pontoFiscalizacao = pontoFiscalizacao;
	}

	/**
	 * Sets the ramoAtividade.
	 * @param ramoAtividade The ramoAtividade to set
	 */
	public void setRamoAtividade(RamoAtividadeKey ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}
	
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		
		pontoFiscalizacao 	= null;
		ramoAtividade		= null;
				
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		
		PontoFiscalizacaoRamoAtividadeKey key = (PontoFiscalizacaoRamoAtividadeKey)ctx.getPrimaryKey();
		
		pontoFiscalizacao 	= key.pontoFiscalizacao;
		ramoAtividade		= key.ramoAtividade;
		
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
			PontoFiscalizacaoRamoAtividadeKey key = (PontoFiscalizacaoRamoAtividadeKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_pontosfiscalizaramoatividade ?,?");
		    
		    stmt.setInt(1,key.pontoFiscalizacao.pontoFiscalizacao);
		    stmt.setInt(2,key.ramoAtividade.ramoAtividade);
		    
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("PontoFiscalizacaoRamoAtividadeBean ejbRemove => Erro ao excluir PontoFiscalizacaoRamoAtividade");
		    }
		}
		catch(SQLException e)
		{
				throw new EJBException("PontoFiscalizacaoRamoAtividadeBean ejbRemove => Erro ao alterar SQLException");
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e){
					throw new EJBException("PontoFiscalizacaoRamoAtividadeBean ejbRemove => Erro ao alterar SQLException");
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
		this.ctx = null;
	}
	/**
	 * ejbCreate
	 */
	public PontoFiscalizacaoRamoAtividadeKey ejbCreate(int pontoFiscalizacao, int ramoAtividade)
		throws javax.ejb.CreateException {
			Connection 	conn 	= null;			
			
			PontoFiscalizacaoRamoAtividadeKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_pontosfiscalizaramoatividade ?,?");
				

			    stmt.setInt(1,pontoFiscalizacao);
		     	stmt.setInt(2,ramoAtividade);
			    
	    		int r = stmt.executeUpdate();
	    		
		    	if(r == 0)
	    		{
			   		throw new EJBException("PontoFiscalizacaoRamoAtividadeBean ejbRemove => Erro ao excluir LocaisLesaoAcidente");
		   	 	}

			    setPontoFiscalizacao(new PontoFiscalizacaoKey(pontoFiscalizacao));
			    setRamoAtividade(new RamoAtividadeKey(ramoAtividade));
			    
				retVal = new PontoFiscalizacaoRamoAtividadeKey(this.pontoFiscalizacao,this.ramoAtividade);
				
			}catch(SQLException e){
				e.printStackTrace();
				throw new CreateException("PontoFiscalizacaoRamoAtividadeBean ejbCreate " + e.getMessage());
			}

			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
				e.printStackTrace();					
					throw new CreateException("PontoFiscalizacaoRamoAtividadeBean ejbCreate "  + e.getMessage());					
				}
			}

			return retVal;

	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(int pontoFiscalizacao, int ramoAtividade) throws javax.ejb.CreateException {
	}
	
	/**
	 * ejbFindByPrimaryKey
	 */
	public PontoFiscalizacaoRamoAtividadeKey ejbFindByPrimaryKey(PontoFiscalizacaoRamoAtividadeKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_pontosfiscalizaramoatividade ?,?");
				stmt.setInt(1,key.pontoFiscalizacao.pontoFiscalizacao);
				stmt.setInt(2,key.ramoAtividade.ramoAtividade);
				
				ResultSet rs = stmt.executeQuery();
				
				if(rs.next())
					return key;
				else
					throw new FinderException("PontoFiscalizacaoRamoAtividadeBean ejbFindByPrimaryKey => PontoFiscalizacaoRamoAtividade not found");
			}
			catch(SQLException e){
					throw new FinderException("PontoFiscalizacaoRamoAtividadeBean ejbFindByPrimaryKey => PontoFiscalizacaoRamoAtividade not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}		
	}

}
