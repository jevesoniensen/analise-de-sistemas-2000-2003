package br.smat.ejb.tipodepoimento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.EntityContext;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;

/**
 * Bean implementation class for Enterprise Bean: TipoDepoimento
 */
public class TipoDepoimentoBean implements javax.ejb.EntityBean {
	
	private EntityContext ctx;
	
	private int 	tipoDepoimento;
	private String nome;	
	
	private boolean atualiza;

	/**
	 * Returns the nome.
	 * @return int
	 */
	public String getNome() {
		atualiza = false;
		return nome;
	}

	/**
	 * Returns the tipoDepoimento.
	 * @return int
	 */
	public int getTipoDepoimento() {
		atualiza = false;
		return tipoDepoimento;
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
	 * Sets the tipoDepoimento.
	 * @param tipoDepoimento The tipoDepoimento to set
	 */
	public void setTipoDepoimento(int tipoDepoimento) {
		atualiza = true;
		this.tipoDepoimento = tipoDepoimento;
	}	

	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		atualiza = false;
		this.tipoDepoimento = 0;
		this.nome = null;
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		
		Connection conn = null;
		atualiza = false;

		try{
			conn = Conexao.getConnection();
			TipoDepoimentoKey key = (TipoDepoimentoKey)ctx.getPrimaryKey();
			System.out.println(key);
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_tiposdepoimento ?");
		    stmt.setInt(1,key.tipoDepoimento);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		this.tipoDepoimento = rs.getInt("tipoDepoimento");
		    	this.nome           = rs.getString("nome"       );		    	
		    }
		    else{
			   throw new EJBException("TipoDepoimentoBean ejbLoad EJBException");
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
			TipoDepoimentoKey key = (TipoDepoimentoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_tiposdepoimento ?");
		    stmt.setInt(1,key.tipoDepoimento);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("TipoDepoimentoBean ejbRemove EJBException");
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
	 * ejbStore
	 */
	public void ejbStore() {

		if(atualiza){
			Connection conn = null;

			try{
				conn = Conexao.getConnection();
				TipoDepoimentoKey key = (TipoDepoimentoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_tiposdepoimento ?,?");
	
			    stmt.setInt(1,key.tipoDepoimento);
				stmt.setString(2,this.nome);
					
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("TipoDepoimentoBean ejbStore EJBException rs:"+rs);
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
	public TipoDepoimentoKey ejbCreate(String nome)
		throws CreateException {
			
			Connection 			conn 	= null;			
			TipoDepoimentoKey 	retVal  = null;
			atualiza = false;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_tiposdepoimento null,?");
			    stmt.setString(1,nome);

				ResultSet rs = stmt.executeQuery();
				
				System.out.println("rs "+rs);

				if(rs.next())
					tipoDepoimento = rs.getInt("tipoDepoimento");					                            
				else
					throw new EJBException("TipoDepoimentoBean ejbCreate EJBException");

			    setNome(nome);
		
				retVal = new TipoDepoimentoKey(tipoDepoimento);
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
	public void ejbPostCreate(String nome) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.tipodepoimento.TipoDepoimentoKey ejbFindByPrimaryKey(
		br.smat.ejb.tipodepoimento.TipoDepoimentoKey key)
		throws javax.ejb.FinderException {
			
			atualiza = false;
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_tiposdepoimento ?");
				stmt.setInt(1,key.tipoDepoimento);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("TipoDepoimentoBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("TipoDepoimentoBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}			
	}

    public Collection ejbFindAllTiposDepoimento() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza = false;
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_tiposdepoimento");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new TipoDepoimentoKey(rs.getInt("tipoDepoimento")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("TipoDepoimentoBean ejbFindAllTiposAcidente FinderException");
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
