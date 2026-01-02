package br.smat.ejb.ramoatividade;

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
 * Bean implementation class for Enterprise Bean: RamoAtividade
 */
public class RamoAtividadeBean implements javax.ejb.EntityBean {

	private int 				ramoAtividade;
	private String				nome;
	private int 				cnae;
	private RamoAtividadeKey 	ramoSuperior;
	
	private boolean atualiza;	

	private javax.ejb.EntityContext ctx;


	/**
	 * Returns the cnae.
	 * @return int
	 */
	public int getCnae() {
		atualiza = false;
		return cnae;
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
	 * Returns the ramoAtividade.
	 * @return int
	 */
	public int getRamoAtividade() {
		atualiza = false;		
		return ramoAtividade;
	}

	/**
	 * Returns the ramoSuperior.
	 * @return RamoAtividadeKey
	 */
	public RamoAtividadeKey getRamoSuperior() {
		atualiza = false;		
		return ramoSuperior;
	}

	/**
	 * Sets the cnae.
	 * @param cnae The cnae to set
	 */
	public void setCnae(int cnae) {
		atualiza = true;
		this.cnae = cnae;
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
	 * Sets the ramoAtividade.
	 * @param ramoAtividade The ramoAtividade to set
	 */
	public void setRamoAtividade(int ramoAtividade) {
		atualiza = true;		
		this.ramoAtividade = ramoAtividade;
	}

	/**
	 * Sets the ramoSuperior.
	 * @param ramoSuperior The ramoSuperior to set
	 */
	public void setRamoSuperior(RamoAtividadeKey ramoSuperior) {
		atualiza = true;		
		this.ramoSuperior = ramoSuperior;
	}
		
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		ramoAtividade = 0;
		nome = null;
		cnae = 0;
		ramoSuperior = null;
		atualiza = false;
			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection 	conn	 = null;
		int		ramoAux  = 0;
		atualiza = false;
		
		try{
			conn = Conexao.getConnection();
			RamoAtividadeKey key = (RamoAtividadeKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_ramosatividade ?");
		    stmt.setInt(1,key.ramoAtividade);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		ramoAtividade = rs.getInt("ramoAtividade");
		    	nome   		  = rs.getString("nome");
		    	cnae		  = rs.getInt("cnae");		    	
		    	ramoAux       = rs.getInt("ramoSuperior");
		    	if(ramoAux > 0)
			    	ramoSuperior = new RamoAtividadeKey(ramoAux);
			    else
			    	ramoSuperior = null;
		    }
		    else{
			   throw new EJBException("RamoAtividadeBean ejbLoad");
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
				RamoAtividadeKey key = (RamoAtividadeKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_excluir_ramosatividade ?");
			    stmt.setInt(1,key.ramoAtividade);
		    	int r = stmt.executeUpdate();
		    	
			    if(r == 0){
			  	 	throw new EJBException("RamoAtividadeBean ejbRemove");
			    }
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new EJBException("RamoAtividadeBean ejbRemove");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){throw new EJBException("RamoAtividadeBean ejbRemove");}
			}	
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {

		if(atualiza){	
			
			System.out.println("-------- EJBStore ------------");
			
			Connection conn = null;
			try{
				conn = Conexao.getConnection();
				RamoAtividadeKey key = (RamoAtividadeKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_ramosatividade ?,?,?,?");
	
			    stmt.setInt(1,key.ramoAtividade);
				stmt.setString(2,nome);
				stmt.setInt(3,cnae);
				
				if(ramoSuperior == null)
					stmt.setNull(4,Types.INTEGER);
				else
				    stmt.setInt(4,ramoSuperior.ramoAtividade);				
				
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("RamoAtividadeBean ejbStore rs: "+rs);
			    }
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new EJBException("RamoAtividadeBean ejbStore");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){throw new EJBException("RamoAtividadeBean ejbStore");}
			}		
		}
		atualiza = false;
	}
	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return this.ctx;
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
	public br.smat.ejb.ramoatividade.RamoAtividadeKey ejbCreate(String nome, int cnae, int ramoSuperior)
		throws javax.ejb.CreateException {
			Connection 			conn 	= null;			
			RamoAtividadeKey 	retVal  = null;
			
			atualiza = false;					
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_ramosatividade null,?,?,?");
				
					
			    stmt.setString(1,nome);
			    stmt.setInt(2,cnae);
			
				if(ramoSuperior == 0)
					stmt.setNull(3,Types.INTEGER);
				else
				    stmt.setInt(3,ramoSuperior);			    

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					ramoAtividade = rs.getInt("ramoAtividade");
				else
					throw new EJBException("RamoAtividadeKey ejbCreate");

			    setNome(nome);
			    setCnae(cnae);
				if(ramoSuperior > 0)
				    setRamoSuperior(new RamoAtividadeKey(ramoSuperior));
				    
				retVal = new RamoAtividadeKey(ramoAtividade);
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
	public void ejbPostCreate(String nome, int cnae, int ramoSuperior) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public RamoAtividadeKey ejbFindByPrimaryKey(RamoAtividadeKey key)
		throws javax.ejb.FinderException {
			atualiza = false;			
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_ramosatividade ?");
				stmt.setInt(1,key.ramoAtividade);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("RamoAtividadeKey ejbFindByPrimaryKey => RamoAtividadeKey not found");
			}
			catch(SQLException e){
					throw new FinderException("RamoAtividadeKey ejbFindByPrimaryKey => RamoAtividadeKey not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}	
	}
	
	public Collection ejbFindAllRamosAtividade() throws FinderException
	{
		atualiza = false;				
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_ramosatividade");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new RamoAtividadeKey(rs.getInt("ramoAtividade")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("FonteBean ejbFindAllFontes => Fonte not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}	
	
	public Collection ejbFindAllRamosAtividade(int ramoAtividadeSuperior) throws FinderException
	{
		atualiza = false;		
		
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_ramosatividade null,?");
			
			if(ramoAtividadeSuperior > 0)
				stmt.setInt(1,ramoAtividadeSuperior);
			else
				stmt.setNull(1,Types.INTEGER);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new RamoAtividadeKey(rs.getInt("ramoAtividade")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("FonteBean ejbFindAllFontes => Fonte not Found");
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
