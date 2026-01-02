package br.smat.ejb.roteiros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.fiscalizacao.FiscalizacaoKey;
import br.smat.ejb.grauconformidade.GrauConformidadeKey;
import br.smat.ejb.itemfiscalizacao.ItemFiscalizacaoKey;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey;

/**
 * Bean implementation class for Enterprise Bean: Roteiros
 */
public class RoteirosBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private TramiteFiscalizacaoKey 	tramiteFiscalizacao;
	private ItemFiscalizacaoKey		itemFiscalizacao;	
	private GrauConformidadeKey		grauConformidade;
	private String						nome;							
	
	private boolean atualiza;
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		tramiteFiscalizacao = null;
		itemFiscalizacao	= null;
		grauConformidade	= null;
		nome				= null;
		atualiza			= false;
	}

	/**
	 * Returns the grauConformidade.
	 * @return GrauConformidadeKey
	 */
	public GrauConformidadeKey getGrauConformidade() {
		atualiza = false;
		return grauConformidade;
	}

	/**
	 * Returns the itemFiscalizacao.
	 * @return ItemFiscalizacaoKey
	 */
	public ItemFiscalizacaoKey getItemFiscalizacao() {
		atualiza = false;
		return itemFiscalizacao;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		atualiza = false;		
		return nome;
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
	 * Sets the grauConformidade.
	 * @param grauConformidade The grauConformidade to set
	 */
	public void setGrauConformidade(GrauConformidadeKey grauConformidade) {
		atualiza = true;		
		this.grauConformidade = grauConformidade;
	}

	/**
	 * Sets the itemFiscalizacao.
	 * @param itemFiscalizacao The itemFiscalizacao to set
	 */
	public void setItemFiscalizacao(ItemFiscalizacaoKey itemFiscalizacao) {
		atualiza = true;		
		this.itemFiscalizacao = itemFiscalizacao;
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
	 * Sets the tramiteFiscalizacao.
	 * @param tramiteFiscalizacao The tramiteFiscalizacao to set
	 */
	public void setTramiteFiscalizacao(TramiteFiscalizacaoKey tramiteFiscalizacao) {
		atualiza = true;		
		this.tramiteFiscalizacao = tramiteFiscalizacao;
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
			RoteirosKey  key = (RoteirosKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_roteiros ?,?,?,null");
		    stmt.setInt(1,key.tramiteFiscalizacao.tramiteFiscalizacao);
		    stmt.setInt(2,key.tramiteFiscalizacao.fiscalizacao.fiscalizacao);
		    stmt.setInt(3,key.itemFiscalizacao.itemFiscalizacao);		    
		    
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
		    	this.tramiteFiscalizacao 	= new TramiteFiscalizacaoKey(rs.getInt("tramiteFiscalizacao"),
		    	                              new FiscalizacaoKey(rs.getInt("fiscalizacao"))); 
		    	this.itemFiscalizacao		= new ItemFiscalizacaoKey(rs.getInt("itemFiscalizacao"));
	    		this.grauConformidade		= new GrauConformidadeKey(rs.getInt("grauConformidade"));  	
	    		this.nome					= rs.getString("nome");
		    }
		    else{
			   throw new EJBException("RoteirosBean ejbLoad EJBException");
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
			RoteirosKey key = (RoteirosKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_roteiros ?,?,?");
				
		    stmt.setInt(1,key.tramiteFiscalizacao.tramiteFiscalizacao);
		    stmt.setInt(2,key.tramiteFiscalizacao.fiscalizacao.fiscalizacao);
		    stmt.setInt(3,key.itemFiscalizacao.itemFiscalizacao);		    
		    
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("RoteirosBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			 throw new EJBException("RoteirosBean ejbRemove EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){ throw new EJBException("RoteirosBean ejbRemove EJBException");}
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
				RoteirosKey key = (RoteirosKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_roteiros ?,?,?,?,?");
	
			    stmt.setInt(1,key.tramiteFiscalizacao.tramiteFiscalizacao);
				stmt.setInt(2,key.tramiteFiscalizacao.fiscalizacao.fiscalizacao);
				stmt.setInt(3,this.itemFiscalizacao.itemFiscalizacao);		
				
				if(this.grauConformidade.grauConformidade > 0)	
					stmt.setInt(4,this.grauConformidade.grauConformidade);			
				else
					stmt.setNull(4,Types.INTEGER);
				stmt.setString(5,nome);				
					
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("RoteirosBean ejbStore EJBException rs:"+rs);
			    }
			}
			catch(SQLException e){
				throw new EJBException("RoteirosBean ejbStore => Erro ao alterar SQLException");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("RoteirosBean ejbStore => Erro ao alterar SQLException");					
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
	public br.smat.ejb.roteiros.RoteirosKey ejbCreate(	int tramiteFiscalizacao,
														int fiscalizacao,
														int itemFiscalizacao,
														int grauConformidade,
														String nome)
		throws javax.ejb.CreateException {
	
			Connection		conn 	= null;			
			RoteirosKey 	retVal  = null;
			
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_roteiros ?,?,?,?,?");
	
				if(tramiteFiscalizacao > 0)	
				    stmt.setInt(1,tramiteFiscalizacao);
				else
					stmt.setNull(1,Types.INTEGER);    
				    
				stmt.setInt(2,fiscalizacao);
				
				stmt.setInt(3,itemFiscalizacao);
								
				if(grauConformidade > 0)
					stmt.setInt(4,grauConformidade);			
				else
					stmt.setNull(4,Types.INTEGER);
								
				stmt.setString(5,nome);				

				ResultSet rs = stmt.executeQuery();
				
				System.out.println("rs "+rs);

				if(rs.next()){
					this.tramiteFiscalizacao 	= 	new TramiteFiscalizacaoKey(rs.getInt("tramiteFiscalizacao"),
													new FiscalizacaoKey(rs.getInt("fiscalizacao")));					                            
					this.itemFiscalizacao		= 	new ItemFiscalizacaoKey(rs.getInt("itemFiscalizacao"));
					
				}
				else
					throw new EJBException("RoteirosBean ejbCreate EJBException");

			    setNome(nome);
				setGrauConformidade(new GrauConformidadeKey(grauConformidade));
		
				retVal = new RoteirosKey(this.tramiteFiscalizacao,this.itemFiscalizacao);
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
	public void ejbPostCreate(	int tramiteFiscalizacao,
									int fiscalizacao,
									int itemFiscalizacao,
									int grauConformidade,
									String nome) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public RoteirosKey ejbFindByPrimaryKey(RoteirosKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_roteiros ?,?,?,null");
				stmt.setInt(1,key.tramiteFiscalizacao.tramiteFiscalizacao);
				stmt.setInt(2,key.tramiteFiscalizacao.fiscalizacao.fiscalizacao);
				stmt.setInt(3,key.itemFiscalizacao.itemFiscalizacao);				
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("RoteirosBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("RoteirosBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
		
	}
	
    public Collection ejbFindAllRoteiros(int tramiteFiscalizacao,int fiscalizacao) throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_roteiros ?,?,null,null");
			stmt.setInt(1,tramiteFiscalizacao);
			stmt.setInt(2,fiscalizacao);			
			
			ResultSet rs = stmt.executeQuery();
			
			TramiteFiscalizacaoKey tramiteFiscalizacaoKey = null;
			
			while(rs.next()){			
				
				tramiteFiscalizacaoKey = new TramiteFiscalizacaoKey(rs.getInt("tramiteFiscalizacao"),
																	new FiscalizacaoKey(rs.getInt("fiscalizacao")));
					
				retVal.addElement(new RoteirosKey(tramiteFiscalizacaoKey,
				                  new ItemFiscalizacaoKey(rs.getInt("itemFiscalizacao"))));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("RoteirosBean ejbFindAllTramitesFiscalizacao FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}		
	
    public Collection ejbFindAllItemLastTramite(int fiscalizacao) throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_roteiros null,?,null,?");

			stmt.setInt(1,fiscalizacao);
			stmt.setInt(2,1);
						
			
			ResultSet rs = stmt.executeQuery();
			
			TramiteFiscalizacaoKey tramiteFiscalizacaoKey = null;
			
			while(rs.next()){			
				
				tramiteFiscalizacaoKey = new TramiteFiscalizacaoKey(rs.getInt("tramiteFiscalizacao"),
																	new FiscalizacaoKey(rs.getInt("fiscalizacao")));
					
				retVal.addElement(new RoteirosKey(tramiteFiscalizacaoKey,
				                  new ItemFiscalizacaoKey(rs.getInt("itemFiscalizacao"))));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("RoteirosBean ejbFindAllTramitesFiscalizacao FinderException");
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
