package br.smat.ejb.itemfiscalizacao;

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
 * Bean implementation class for Enterprise Bean: ItemFiscalizacao
 */
public class ItemFiscalizacaoBean implements javax.ejb.EntityBean {
	
	private javax.ejb.EntityContext ctx;
	
	
	private int 	itemFiscalizacao;
	private String nome;
	
	private boolean atualiza;

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		atualiza = false;		
		return nome;
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
	 * Returns the itemFiscalizacao.
	 * @return int
	 */
	public int getItemFiscalizacao() {
		atualiza = false;		
		return itemFiscalizacao;
	}

	/**
	 * Sets the itemFiscalizacao.
	 * @param itemFiscalizacao The itemFiscalizacao to set
	 */
	public void setItemFiscalizacao(int itemFiscalizacao) {
		atualiza = true;				
		this.itemFiscalizacao = itemFiscalizacao;
	}
		
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		itemFiscalizacao = 0;
		nome = null;
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
			ItemFiscalizacaoKey key = (ItemFiscalizacaoKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_itensfiscalizacao ?");
		    stmt.setInt(1,key.itemFiscalizacao);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.itemFiscalizacao = rs.getInt("itemFiscalizacao");
		    	this.nome           = rs.getString("nome"         );		    	
		    }
		    else{
			   throw new EJBException("ItemFiscalizacaoBean ejbLoad EJBException");
		    }
		}
		catch(SQLException e){
			throw new EJBException("ItemFiscalizacaoBean ejbLoad EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("ItemFiscalizacaoBean ejbLoad EJBException");
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
		atualiza = false;
	
		try{
			conn = Conexao.getConnection();
			ItemFiscalizacaoKey key = (ItemFiscalizacaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_itensfiscalizacao ?");
		    stmt.setInt(1,key.itemFiscalizacao);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("ItemFiscalizacaoBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			throw new EJBException("ItemFiscalizacaoBean ejbRemove EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("ItemFiscalizacaoBean ejbRemove EJBException");				
			}
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
				ItemFiscalizacaoKey key = (ItemFiscalizacaoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_itemsfiscalizacao ?,?");
	
			    stmt.setInt(1,key.itemFiscalizacao);
				stmt.setString(2,this.nome);
					
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("ItemFiscalizacaoBean ejbStore EJBException rs:"+rs);
			    }
			}
			catch(SQLException e){
				throw new EJBException("ItemFiscalizacaoBean ejbStore EJBException");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("ItemFiscalizacaoBean ejbStore EJBException");					
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
	public ItemFiscalizacaoKey ejbCreate(String nome)
		throws javax.ejb.CreateException {

			Connection 			conn 	= null;			

			ItemFiscalizacaoKey 	retVal  = null;
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_itemsfiscalizacao null,?");
			    stmt.setString(1,nome);

				ResultSet rs = stmt.executeQuery();
				
				System.out.println("rs "+rs);

				if(rs.next())
					itemFiscalizacao = rs.getInt("itemFiscalizacao");					                            
				else
					throw new EJBException("ItemFiscalizacaoBean ejbCreate EJBException");

			    setNome(nome);
		
				retVal = new ItemFiscalizacaoKey(itemFiscalizacao);
			}
			catch(SQLException e){
				throw new EJBException("ItemFiscalizacaoBean ejbCreate EJBException");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("ItemFiscalizacaoBean ejbCreate EJBException");					
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
	public ItemFiscalizacaoKey ejbFindByPrimaryKey(ItemFiscalizacaoKey key)
		throws javax.ejb.FinderException {
			
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_itensfiscalizacao ?");
				stmt.setInt(1,key.itemFiscalizacao);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("ItemFiscalizacaoBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("ItemFiscalizacaoBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){
					throw new EJBException("ItemFiscalizacaoBean ejbFindByPrimaryKey EJBException");										
				}
			}			
	}
	
    public Collection ejbFindAllItemFiscalizacao() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_itensfiscalizacao");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new ItemFiscalizacaoKey(rs.getInt("itemFiscalizacao")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("ItemFiscalizacaoBean ejbFindAllTiposAcidente FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new EJBException("ItemFiscalizacaoBean ejbFindAllTiposAcidente EJBException");	
			}
		}
		return retVal;
	}	
	

}
