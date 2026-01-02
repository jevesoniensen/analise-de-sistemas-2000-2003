package br.smat.ejb.pontofiscalizacao;

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

/**
 * Bean implementation class for Enterprise Bean: PontoFiscalizacao
 */
public class PontoFiscalizacaoBean implements javax.ejb.EntityBean {

	private javax.ejb.EntityContext ctx;

	private int	pontoFiscalizacao;	
	private String nome;
	private String descricao;
	
	private boolean atualiza;		
	
	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() {
		atualiza = false;
		return descricao;
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
	 * Returns the pontoFiscalizacao.
	 * @return int
	 */
	public int getPontoFiscalizacao() {
		atualiza = false;		
		return pontoFiscalizacao;
	}

	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) {
		atualiza = true;
		this.descricao = descricao;
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
	 * Sets the pontoFiscalizacao.
	 * @param pontoFiscalizacao The pontoFiscalizacao to set
	 */
	public void setPontoFiscalizacao(int pontoFiscalizacao) {
		atualiza = true;		
		this.pontoFiscalizacao = pontoFiscalizacao;
	}	
		
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		pontoFiscalizacao = 0;	
		nome			  = null;
		descricao		  = null;		
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
			PontoFiscalizacaoKey  key = (PontoFiscalizacaoKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_pontosfiscalizacoes ?");
		    stmt.setInt(1,key.pontoFiscalizacao);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.pontoFiscalizacao 	= rs.getInt("pontoFiscalizacao");
		    	this.nome   				= rs.getString("nome"          );		    	
		    	this.descricao				= rs.getString("descricao"     );		    	
		    }
		    else{
			   throw new EJBException("PontoFiscalizacaoBean ejbLoad EJBException");
		    }
		}
		catch(SQLException e){
			throw new EJBException("PontoFiscalizacaoBean Exception EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("PontoFiscalizacaoBean Exception EJBException");				
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
			PontoFiscalizacaoKey key = (PontoFiscalizacaoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_pontosfiscalizacoes ?");
		    stmt.setInt(1,key.pontoFiscalizacao);
	    	int r = stmt.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("PontoFiscalizacaoBean1 ejbRemove => Erro ao alterar SQLException");						
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new EJBException("PontoFiscalizacaoBean2 ejbRemove => Erro ao alterar SQLException");										
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
				PontoFiscalizacaoKey key = (PontoFiscalizacaoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_pontosfiscalizacoes ?,?,?,null");
	
			    stmt.setInt(1,key.pontoFiscalizacao);
				stmt.setString(2,this.nome);
				stmt.setString(3,this.descricao);			
					
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("PontoFiscalizacaoBean ejbStore EJBException rs:"+rs);
			    }
			}
			catch(SQLException e){
				throw new EJBException("PontoFiscalizacaoBean ejbRemove => Erro ao alterar SQLException");						
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("PontoFiscalizacaoBean ejbRemove => Erro ao alterar SQLException");						
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
	public PontoFiscalizacaoKey ejbCreate(String nome, String descricao,int ramoAtividade)
		throws javax.ejb.CreateException {
			Connection	conn 	= null;			
			PontoFiscalizacaoKey 	retVal  = null;
			
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_pontosfiscalizacoes null,?,?,?");
			    stmt.setString(1,nome);
			    stmt.setString(2,descricao);
			    
			    if(ramoAtividade ==0)
			    	stmt.setNull(3,Types.INTEGER);
			    else
				    stmt.setInt(3,ramoAtividade);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					pontoFiscalizacao = rs.getInt("pontoFiscalizacao");					                            
				else
					throw new EJBException("PontoFiscalizacaoBean ejbCreate EJBException");

			    setNome(nome);
			    setDescricao(descricao);
		
				retVal = new PontoFiscalizacaoKey(pontoFiscalizacao);
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new EJBException("PontoFiscalizacaoBean ejbCreate => Erro ao alterar SQLException");						
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					e.printStackTrace();
					throw new EJBException("PontoFiscalizacaoBean ejbCreate => Erro ao alterar SQLException");											
				}
			}
			
			return retVal;

	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(String nome, String descricao,int ramoAtividade) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public PontoFiscalizacaoKey ejbFindByPrimaryKey(PontoFiscalizacaoKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_pontosfiscalizacoes ?");
				stmt.setInt(1,key.pontoFiscalizacao);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("PontoFiscalizacaoBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("PontoFiscalizacaoBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){
					throw new EJBException("PontoFiscalizacaoBean Exception EJBException");						
				}
			}
	}

    public Collection ejbFindAllPontoFiscalizacao() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_pontosfiscalizacoes");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new PontoFiscalizacaoKey(rs.getInt("pontoFiscalizacao")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("PontoFiscalizacaoBean ejbFindAllPontoFiscalizacao FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new EJBException("PontoFiscalizacaoBean ejbFindAllPontoFiscalizacao EJBException");					
			}
		}
		return retVal;
	}	

    public Collection ejbFindAllPontoFiscalizacao(int ramoAtividade) throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_pontosfiscalizacoes null,?");
			stmt.setInt(1,ramoAtividade);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new PontoFiscalizacaoKey(rs.getInt("pontoFiscalizacao")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("PontoFiscalizacaoBean ejbFindAllPontoFiscalizacao FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new EJBException("PontoFiscalizacaoBean ejbFindAllPontoFiscalizacao(int ramoAtividade) EJBException");	
			}
		}
		return retVal;
	}	
}
