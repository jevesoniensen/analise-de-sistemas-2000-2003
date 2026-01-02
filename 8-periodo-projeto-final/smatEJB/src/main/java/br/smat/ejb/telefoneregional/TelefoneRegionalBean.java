package br.smat.ejb.telefoneregional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.regional.RegionalKey;

/**
 * Bean implementation class for Enterprise Bean: TelefoneRegional
 */
public class TelefoneRegionalBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int telefoneRegional;
	private RegionalKey regional;
	private String descricao;
	private String numero;
	private String	ddd;
	
	
	private boolean atualiza = false;

	/**
	 * Returns the ddd.
	 * @return String
	 */
	public String getDdd() {
		atualiza = false;
		return ddd;
	}

	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() {
		atualiza = false;
		return descricao;
	}

	/**
	 * Returns the numero.
	 * @return String
	 */
	public String getNumero() {
		atualiza = false;
		return numero;
	}

	/**
	 * Returns the regional.
	 * @return int
	 */
	public RegionalKey getRegional() {
		atualiza = false;
		return regional;
	}

	public int getRegionalKey() {
		atualiza = false;
		return regional.regional;
	}


	/**
	 * Returns the telefoneRegional.
	 * @return int
	 */
	public int getTelefoneRegional() {
		atualiza = false;
		return telefoneRegional;
	}

	/**
	 * Sets the ddd.
	 * @param ddd The ddd to set
	 */
	public void setDdd(String ddd) {
		atualiza = true;
		this.ddd = ddd;
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
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(String numero) {
		atualiza = true;
		this.numero = numero;
	}

	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(RegionalKey regional) {
		atualiza = true;
		this.regional = regional;
	}

	/**
	 * Sets the telefoneRegional.
	 * @param telefoneRegional The telefoneRegional to set
	 */
	public void setTelefoneRegional(int telefoneRegional) {
		atualiza = true;
		this.telefoneRegional = telefoneRegional;
	}
		
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		telefoneRegional = 0;
		regional = null;
		descricao = null;
		numero = null;
		ddd = null;
		atualiza = false;			
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		Connection 	conn  	   = null;
		int		agenteAux  = 0;
		atualiza = false;			
		
		try{
			conn = Conexao.getConnection();
			TelefoneRegionalKey key = (TelefoneRegionalKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_telefonesregionais ?,?");
		    stmt.setInt(1,key.telefoneRegional);
		    stmt.setInt(2,key.regional.regional);		    
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		telefoneRegional = rs.getInt("telefoneRegional");
	    		regional         = new RegionalKey(rs.getInt("regional"));
		    	descricao	     = rs.getString("descricao");		    	
		    	numero  	     = rs.getString("numero");		    	
		    	ddd     	     = rs.getString("ddd");		    			    	
		    }
		    else{
			   throw new EJBException("TelefoneRegionalBean ejbLoad");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
		   throw new EJBException("TelefoneRegionalBean1 ejbLoad");			
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
			   throw new EJBException("TelefoneRegionalBean2 ejbLoad");				
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
			TelefoneRegionalKey key = (TelefoneRegionalKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_excluir_telefonesregionais ?,?");
		    stmt.setInt(1,key.telefoneRegional);
		    stmt.setInt(2,key.regional.regional);		    
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("TelefoneRegionalBean ejbRemove");
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		   throw new EJBException("TelefoneRegionalBean1 ejbRemove");			
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			   throw new EJBException("TelefoneRegionalBean2 ejbRemove");							
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
				TelefoneRegionalKey key = (TelefoneRegionalKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_gravar_telefonesregionais ?,?,?,?,?");
	
			    stmt.setInt(1,key.telefoneRegional);
			    stmt.setInt(2,key.regional.regional);		    
				stmt.setString(3,descricao);
				stmt.setString(4,numero);
				stmt.setString(5,ddd);
				
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("TelefoneRegionalBean ejbStore rs: "+rs);
			    }
			}
			catch(SQLException e){
				e.printStackTrace();
			   throw new EJBException("TelefoneRegionalBean1 ejbStore");							
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				   throw new EJBException("TelefoneRegionalBean2 ejbStore");												
				}
			}			
			atualiza = false;			
		}
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
	public TelefoneRegionalKey ejbCreate(int regional,
	                                      String descricao,
										  String numero,
										  String ddd)
		throws javax.ejb.CreateException {
			Connection 			conn 	= null;			
			TelefoneRegionalKey	retVal  = null;
			atualiza = false;			
					
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_telefonesregionais null,?,?,?,?");
	
	
				System.out.println("sp_smat_gravar_telefonesregionais");
							
				stmt.setInt(1,regional)	;
			    stmt.setString(2,descricao);
			    stmt.setString(3,numero);
			    stmt.setString(4,ddd);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					telefoneRegional = rs.getInt("telefoneRegional");
				else
					throw new EJBException("TelefoneRegionalBean ejbCreate");

				this.regional = new RegionalKey(regional);
			    this.descricao = descricao;
			    this.numero = numero;
			    this.ddd = ddd;
			    
			    
				    
				retVal = new TelefoneRegionalKey(telefoneRegional,new RegionalKey(regional));
			}
			catch(SQLException e){
				e.printStackTrace();				
				throw new EJBException("TelefoneRegionalBean ejbCreate");				
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					
					e.printStackTrace();				
					throw new EJBException("TelefoneRegionalBean ejbCreate");				
									
				}
			}
			
			return retVal;
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate( int regional,
	                            String descricao,
								String numero,
								String ddd) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public TelefoneRegionalKey ejbFindByPrimaryKey(TelefoneRegionalKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			atualiza = false;			
					
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_telefonesregionais ?,?");
				stmt.setInt(1,key.telefoneRegional);
				stmt.setInt(2,key.regional.regional);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("TelefoneRegionalBean ejbFindByPrimaryKey => TelefoneRegionalKey not found");
			}
			catch(SQLException e){
					throw new FinderException("TelefoneRegionalBean ejbFindByPrimaryKey => TelefoneRegionalKey not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){
					   throw new EJBException("TelefoneRegionalBean ejbFindByPrimaryKey");																	
				}
			}	
	}
	
	public Collection ejbFindAllTelefonesRegionais(int regional) throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza = false;				
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_telefonesregionais null,?");
			stmt.setInt(1,regional);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				System.out.println("telefoneRegional => " + rs.getInt("telefoneRegional"));
				System.out.println("regional => " + rs.getInt("regional"));
				retVal.addElement(new TelefoneRegionalKey(rs.getInt("telefoneRegional"),new RegionalKey(rs.getInt("regional"))));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("TelefoneRegionalBean ejbFindAllTelefonesRegionais => TelefoneRegionalKey not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
					   throw new EJBException("TelefoneRegionalBean ejbFindAllTelefonesRegionais");																					
			}
		}
		return retVal;
	}
}
