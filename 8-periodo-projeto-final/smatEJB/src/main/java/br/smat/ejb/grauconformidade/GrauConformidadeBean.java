package br.smat.ejb.grauconformidade;

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
 * Bean implementation class for Enterprise Bean: GrauConformidade
 */
public class GrauConformidadeBean implements javax.ejb.EntityBean {

	private javax.ejb.EntityContext ctx;
	
	
	private int 	grauConformidade;
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
	 * Returns the grauConformidade.
	 * @return int
	 */
	public int getGrauConformidade() {
		atualiza = false;		
		return grauConformidade;
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
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) {
		atualiza = true;		
		this.descricao = descricao;
	}

	/**
	 * Sets the grauConformidade.
	 * @param grauConformidade The grauConformidade to set
	 */
	public void setGrauConformidade(int grauConformidade) {
		atualiza = true;				
		this.grauConformidade = grauConformidade;
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
	 * ejbActivate
	 */
	public void ejbActivate() {
		grauConformidade = 0;
		nome			 = null;
		descricao		 = null;		
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
			GrauConformidadeKey  key = (GrauConformidadeKey)ctx.getPrimaryKey();

			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_grausconformidade ?");
		    stmt.setInt(1,key.grauConformidade);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.grauConformidade 	= rs.getInt("grauConformidade");
		    	this.nome   			= rs.getString("nome"     );		    	
		    	this.descricao			= rs.getString("descricao");		    	
		    }
		    else{
			   throw new EJBException("GrauConformidadeBean ejbLoad EJBException");
		    }
		}
		catch(SQLException e){
			throw new EJBException("GrauConformidadeBean ejbLoad EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("GrauConformidadeBean ejbLoad EJBException");
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
			GrauConformidadeKey key = (GrauConformidadeKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement	("exec sp_smat_excluir_grausconformidade ?");
			
		    stmt.setInt(1,key.grauConformidade);
		    
	    	int r = stmt.executeUpdate();
	    	
		    if(r == 0){
			   throw new EJBException("GrauConformidadeBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			throw new EJBException("GrauConformidadeBean ejbRemove EJBException");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("GrauConformidadeBean ejbRemove EJBException");
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
				GrauConformidadeKey key = (GrauConformidadeKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_grausconformidade ?,?,?");
	
			    stmt.setInt(1,key.grauConformidade);
				stmt.setString(2,this.nome);
				stmt.setString(3,this.descricao);			
					
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("GrauConformidadeBean ejbStore EJBException rs:"+rs);
			    }
			}
			catch(SQLException e){
					throw new EJBException("GrauConformidadeBean ejbStore EJBException");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("GrauConformidadeBean ejbStore EJBException");					
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
	public br.smat.ejb.grauconformidade.GrauConformidadeKey ejbCreate(String nome,String descricao)
		throws javax.ejb.CreateException {
			Connection			conn 	= null;			
			GrauConformidadeKey retVal  = null;
			
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_grausconformidade null,?,?");
			    stmt.setString(1,nome);
			    stmt.setString(2,descricao);

				ResultSet rs = stmt.executeQuery();
				
				System.out.println("rs "+rs);

				if(rs.next())
					grauConformidade = rs.getInt("grauConformidade");					                            
				else
					throw new EJBException("GrauConformidadeBean ejbCreate EJBException");

			    setNome(nome);
			    setDescricao(descricao);
		
				retVal = new GrauConformidadeKey(grauConformidade);
			}
			catch(SQLException e){
					throw new EJBException("GrauConformidadeBean ejbCreate EJBException");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("GrauConformidadeBean ejbCreate EJBException");					
				}
			}
			
			return retVal;

	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(String nome,String descricao) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public GrauConformidadeKey ejbFindByPrimaryKey(
		br.smat.ejb.grauconformidade.GrauConformidadeKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_grausconformidade ?");
				stmt.setInt(1,key.grauConformidade);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("GrauConformidadeBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("GrauConformidadeBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}
	
    public Collection ejbFindAllTipoAcidente() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_grausconformidade");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new GrauConformidadeKey(rs.getInt("grauConformidade")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("GrauConformidadeBean ejbFindAllGrausConformidade FinderException");
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
