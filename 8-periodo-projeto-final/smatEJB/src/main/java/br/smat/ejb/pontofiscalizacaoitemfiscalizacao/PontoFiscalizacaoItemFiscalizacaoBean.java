package br.smat.ejb.pontofiscalizacaoitemfiscalizacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey;
import br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey;

/**
 * Bean implementation class for Enterprise Bean: PontoFiscalizacaoItemFiscalizacao
 */
public class PontoFiscalizacaoItemFiscalizacaoBean
	implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private PontoFiscalizacaoKey pontoFiscalizacao;
	private ItemFiscalizacaoKey  itemFiscalizacao;	
	
	/**
	 * Returns the itemFiscalizacao.
	 * @return ItemFiscalizacaoKey
	 */
	public ItemFiscalizacaoKey getItemFiscalizacao() {
		return itemFiscalizacao;
	}

	/**
	 * Returns the pontoFiscalizacao.
	 * @return PontoFiscalizacaoKey
	 */
	public PontoFiscalizacaoKey getPontoFiscalizacao() {
		return pontoFiscalizacao;
	}

	/**
	 * Sets the itemFiscalizacao.
	 * @param itemFiscalizacao The itemFiscalizacao to set
	 */
	public void setItemFiscalizacao(ItemFiscalizacaoKey itemFiscalizacao) {
		this.itemFiscalizacao = itemFiscalizacao;
	}

	/**
	 * Sets the pontoFiscalizacao.
	 * @param pontoFiscalizacao The pontoFiscalizacao to set
	 */
	public void setPontoFiscalizacao(PontoFiscalizacaoKey pontoFiscalizacao) {
		this.pontoFiscalizacao = pontoFiscalizacao;
	}
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		pontoFiscalizacao = null;
		itemFiscalizacao  = null;
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		
		PontoFiscalizacaoItemFiscalizacaoKey key = (PontoFiscalizacaoItemFiscalizacaoKey)ctx.getPrimaryKey();
		
		pontoFiscalizacao 	= key.pontoFiscalizacao;
		itemFiscalizacao	= key.itemFiscalizacao;
		
		
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
			PontoFiscalizacaoItemFiscalizacaoKey key = (PontoFiscalizacaoItemFiscalizacaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_pontosfiscaliitensfiscal ?,?");
		    
		    stmt.setInt(1,key.pontoFiscalizacao.pontoFiscalizacao);
		    stmt.setInt(2,key.itemFiscalizacao.itemFiscalizacao);
		    
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("PontoFiscalizacaoItemFiscalizacaoBean ejbRemove => Erro ao excluir PontoFiscalizacaoItemFiscalizacao");
		    }
		}
		catch(SQLException e)
		{			
			throw new EJBException("PontoFiscalizacaoItemFiscalizacaoBean ejbRemove => Erro ao alterar SQLException");		
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e)
			{
				throw new EJBException("PontoFiscalizacaoItemFiscalizacaoBean ejbRemove => Erro ao alterar SQLException");						
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
	public PontoFiscalizacaoItemFiscalizacaoKey ejbCreate(int pontoFiscalizacao, int itemFiscalizacao)
		throws javax.ejb.CreateException {
			Connection 	conn 	= null;			
			
			PontoFiscalizacaoItemFiscalizacaoKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_pontosfiscaliitensfiscal ?,?");
				

			    stmt.setInt(1,pontoFiscalizacao);
		     	stmt.setInt(2,itemFiscalizacao);
			    
	    		int r = stmt.executeUpdate();
	    		
		    	if(r == 0)
	    		{
			   		throw new EJBException("PontoFiscalizacaoItemFiscalizacaoBean ejbRemove => Erro ao excluir LocaisLesaoAcidente");
		   	 	}

			    setPontoFiscalizacao(new PontoFiscalizacaoKey(pontoFiscalizacao));
			    setItemFiscalizacao(new ItemFiscalizacaoKey(itemFiscalizacao));
			    
				retVal = new PontoFiscalizacaoItemFiscalizacaoKey(this.pontoFiscalizacao,this.itemFiscalizacao);
				
			}catch(SQLException e){
				e.printStackTrace();
				throw new CreateException("PontoFiscalizacaoItemFiscalizacaoBean ejbCreate " + e.getMessage());
			}

			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
				e.printStackTrace();					
					throw new CreateException("PontoFiscalizacaoItemFiscalizacaoBean ejbCreate "  + e.getMessage());					
				}
			}

			return retVal;

	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(int pontoFiscalizacao, int itemFiscalizacao) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public PontoFiscalizacaoItemFiscalizacaoKey ejbFindByPrimaryKey(PontoFiscalizacaoItemFiscalizacaoKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_pontosfiscaliitensfiscal ?,?");
				stmt.setInt(1,key.pontoFiscalizacao.pontoFiscalizacao);
				stmt.setInt(2,key.itemFiscalizacao.itemFiscalizacao);
				
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
