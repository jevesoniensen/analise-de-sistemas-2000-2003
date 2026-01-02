package br.smat.ejb.medico;

import java.sql.Connection;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.EntityContext;
import javax.ejb.FinderException;
import javax.naming.Context;
import javax.naming.InitialContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import br.smat.conexao.Conexao;
import br.smat.ejb.estado.*;

/**
 * Bean implementation class for Enterprise Bean: Medico
 */
public class MedicoBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int 		medico;
	private String 	nome;
	private int 		crm;
	private EstadoKey	ufCRM;	
	private boolean 	atualiza;

	/**
	 * Returns the crm.
	 * @return int
	 */
	public int getCrm() {
		atualiza = false;		
		return crm;
	}

	/**
	 * Returns the medico.
	 * @return int
	 */
	public int getMedico() {
		atualiza = false;		
		return medico;
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
	 * Returns the ufCRM.
	 * @return EstadoKey
	 */
	public EstadoKey getUfCRM() {
		atualiza = false;		
		return ufCRM;
	}

	/**
	 * Sets the crm.
	 * @param crm The crm to set
	 */
	public void setCrm(int crm) {
		atualiza = true;		
		this.crm = crm;
	}

	/**
	 * Sets the medico.
	 * @param medico The medico to set
	 */
	public void setMedico(int medico) {
		atualiza = true;		
		this.medico = medico;
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
	 * Sets the ufCRM.
	 * @param ufCRM The ufCRM to set
	 */
	public void setUfCRM(EstadoKey ufCRM) {
		atualiza = true;		
		this.ufCRM = ufCRM;
	}		
	
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
		atualiza = false;
		medico = 0;
		nome = null;
		crm = 0;
		ufCRM = null;
			
	}
	
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection conn = null;
		atualiza = false;
		try{
			conn = Conexao.getConnection();
			MedicoKey key = (MedicoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_medicos ?");
		    stmt.setInt(1,key.medico);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		medico = rs.getInt("medico");
		    	nome   = rs.getString("nome");
		    	
				crm = rs.getInt("crm");

		    	if(rs.getInt("ufCRM") > 0)
			    	ufCRM = new EstadoKey(rs.getInt("ufCRM"));

		    }
		    else{
			   throw new EJBException("MedicoBean ejbLoad => Erro ao carregar Municipio");
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
			MedicoKey key = (MedicoKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_medicos ?");
		    stmt.setInt(1,key.medico);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("MedicoBean ejbRemove => Erro ao excluir Medico");
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e)
			{}
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
				MedicoKey key = (MedicoKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_medicos ?,?,?,?");
					
					
	
			    stmt.setInt(1,key.medico);
				stmt.setString(2,nome);
				stmt.setInt(3,crm);
				
				if(ufCRM != null)
					stmt.setInt(4,ufCRM.estado);
				else
					stmt.setNull(4,Types.INTEGER);
				
				
				
			    int rs = stmt.executeUpdate();
	
		    
			    if(rs != 1){
			    	throw new EJBException("MedicoBean ejbStore => Erro ao alterar Medico: "+rs);
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
		atualiza = false;						
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
	public MedicoKey ejbCreate(String nome,int crm, int ufCRM)
		throws javax.ejb.CreateException {
			
			Connection 	conn 	= null;			
			MedicoKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_medicos null,?,?,?");
				

			    stmt.setString(1,nome);
			    stmt.setInt(2,crm);
			    
			    if(ufCRM > 0 )
				    stmt.setInt(3,ufCRM);
				else
					stmt.setNull(3,Types.INTEGER);
			    
				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					medico = rs.getInt("medico");
				else
					throw new EJBException("MedicoBean ejbCreate => Erro ao inserir Medico");				
				
		    	setNome(nome);
		    	setCrm(crm);
		    	
		    	if(ufCRM > 0 )
		    		setUfCRM(new EstadoKey(ufCRM));
			    
				retVal = new MedicoKey(medico);
			}catch(SQLException e){
			//	System.out.println("****************************");
			//	System.out.println("******Medico Bean *****");
			//	e.printStackTrace();
			//	System.out.println("****************************");				
				throw new CreateException("MedicoBean ejbCreate " + e.getMessage());
			}
			
			finally{
				try{
					atualiza = false;
					conn.close();
				}
				catch(SQLException e){
				e.printStackTrace();					
					throw new CreateException("MedicoBean ejbCreate "  + e.getMessage());					
				}
			}
			
			return retVal;
			
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(String nome,int crm, int ufCRM) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.medico.MedicoKey ejbFindByPrimaryKey(
		br.smat.ejb.medico.MedicoKey key)
		throws javax.ejb.FinderException {
			
			Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_medicos ?");
				stmt.setInt(1,key.medico);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("MedicoBean ejbFindByPrimaryKey => Medico not found");
			}
			catch(SQLException e){
					throw new FinderException("MedicoBean ejbFindByPrimaryKey => Medico not found SQLException");
			}
			finally{
				atualiza = false;				
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
	}

	public Collection ejbFindAllMedicos() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_medicos");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new MedicoKey(rs.getInt("medico")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("MedicoBean ejbFindAllMedicos => Medico not Found");
		}
		finally{
			atualiza = false;			
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}	


}
