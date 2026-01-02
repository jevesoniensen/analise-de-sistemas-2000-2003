package br.smat.ejb.telefoneempregador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.empregador.EmpregadorKey;

/**
 * Bean implementation class for Enterprise Bean: TelefoneEmpregador
 */
public class TelefoneEmpregadorBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int telefoneEmpregador;
	private EmpregadorKey empregador;
	private String descricao;
	private String numero;
	private String ddd;

	/**
	 * Returns the ddd.
	 * @return String
	 */
	public String getDdd() {
		return ddd;
	}

	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Returns the empregador.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregador() {
		return empregador;
	}
	
	public int getKeyEmpregador() {
		return empregador.empregador;
	}	

	/**
	 * Returns the numero.
	 * @return String
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Returns the telefoneEmpregador.
	 * @return int
	 */
	public int getTelefoneEmpregador() {
		return telefoneEmpregador;
	}

	/**
	 * Sets the ddd.
	 * @param ddd The ddd to set
	 */
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(EmpregadorKey empregador) {
		this.empregador = empregador;
	}

	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Sets the telefoneEmpregador.
	 * @param telefoneEmpregador The telefoneEmpregador to set
	 */
	public void setTelefoneEmpregador(int telefoneEmpregador) {
		this.telefoneEmpregador = telefoneEmpregador;
	}
		
	
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		telefoneEmpregador = 0;
		empregador = null;
		descricao = null;
		numero = null;
		ddd = null;
			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection 	conn  	   = null;
		int		agenteAux  = 0;

		try{
			conn = Conexao.getConnection();
			TelefoneEmpregadorKey key = (TelefoneEmpregadorKey) ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_telefonesempregadores ?,?");
		    stmt.setInt(1,key.telefoneEmpregador);
		    stmt.setInt(2,key.empregador.empregador);		    
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		telefoneEmpregador = rs.getInt("telefoneEmpregador");
	    		empregador         = new EmpregadorKey(rs.getInt("empregador"));
		    	descricao	     = rs.getString("descricao");		    	
		    	numero  	     = rs.getString("numero");		    	
		    	ddd     	     = rs.getString("ddd");		    			    	
		    }
		    else{
			   throw new EJBException("TelefoneEmpregadorBean ejbLoad");
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
	
		try{
			conn = Conexao.getConnection();
			TelefoneEmpregadorKey key = (TelefoneEmpregadorKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_excluir_telefonesempregadores ?,?");
		    stmt.setInt(1,key.telefoneEmpregador);
		    stmt.setInt(2,key.empregador.empregador);		    
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("TelefoneEmpregadorBean ejbRemove");
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new EJBException("TelefoneEmpregadorBean ejbRemove");
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e)
			{throw new EJBException("TelefoneEmpregadorBean ejbRemove");}
		}
				
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {

	Connection conn = null;
		try{
			conn = Conexao.getConnection();
			TelefoneEmpregadorKey key = (TelefoneEmpregadorKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_gravar_telefonesempregadores ?,?,?,?,?");

		    stmt.setInt(1,key.telefoneEmpregador);
		    stmt.setInt(2,key.empregador.empregador);		    
			stmt.setString(3,descricao);
			stmt.setString(4,numero);
			stmt.setString(5,ddd);
			
		    int rs = stmt.executeUpdate();
		    
		    if(rs != 1){
		    	throw new EJBException("TelefoneEmpregadorBean ejbStore rs: "+rs);
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("TelefoneEmpregadorBean ejbStore");
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){throw new EJBException("TelefoneEmpregadorBean ejbStore");}
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
	public br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey ejbCreate( int empregador,
	                                      									String descricao,
																		  	String numero,
																			String ddd)
		throws javax.ejb.CreateException {

			Connection 			conn 	= null;			
			TelefoneEmpregadorKey	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_telefonesempregadores null,?,?,?,?");
				
				stmt.setInt(1,empregador)	;
			    stmt.setString(2,descricao);
			    stmt.setString(3,numero);
			    stmt.setString(4,ddd);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					telefoneEmpregador = rs.getInt("telefoneEmpregador");
				else
					throw new EJBException("TelefoneEmpregadorlBean ejbCreate");

				setEmpregador(new EmpregadorKey(empregador));
			    setDescricao(descricao);
			    setNumero(numero);
			    setDdd(ddd);
				    
				retVal = new TelefoneEmpregadorKey(telefoneEmpregador,new EmpregadorKey(empregador));
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
	public void ejbPostCreate(int empregador,
								String descricao,
							  	String numero,
								String ddd) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public TelefoneEmpregadorKey ejbFindByPrimaryKey(TelefoneEmpregadorKey key)
		throws javax.ejb.FinderException {

		Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_telefonesempregadores ?,?");
				stmt.setInt(1,key.telefoneEmpregador);
				stmt.setInt(2,key.empregador.empregador);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("TelefoneEmpregadorBean ejbFindByPrimaryKey => TelefoneEmpregador not found");
			}
			catch(SQLException e){
					throw new FinderException("TelefoneEmpregadorBean ejbFindByPrimaryKey => TelefoneEmpregador not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
			
	}

	public Collection ejbFindAllTelefonesEmpregadores(int empregador) throws FinderException
		{
			Connection conn = null;
			Vector retVal = new Vector();
			
			try
			{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_telefonesempregadores null,?");
				stmt.setInt(1,empregador);
				ResultSet rs = stmt.executeQuery();
				
				while(rs.next()){
					retVal.addElement(new TelefoneEmpregadorKey(rs.getInt("telefoneEmpregador"),new EmpregadorKey(rs.getInt("empregador"))));
				}
			}
			catch(Exception e){
				e.printStackTrace();
					throw new FinderException("TelefoneEmpregadorBean ejbFindAllTelefonesEmpregadores => TelefoneEmpregador not Found");
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
