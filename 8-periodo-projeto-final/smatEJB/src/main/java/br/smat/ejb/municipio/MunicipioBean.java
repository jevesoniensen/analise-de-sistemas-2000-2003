package br.smat.ejb.municipio;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.conexao.Conexao;
import br.smat.ejb.regional.Regional;
import br.smat.ejb.regional.RegionalHome;
import br.smat.ejb.regional.RegionalKey;

/**
 * Bean implementation class for Enterprise Bean: Municipio
 */
public class MunicipioBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int 				municipio;
	private RegionalKey		regional;		
	private String				nome;
	private String 			sigla;
	private int				populacao;
	
	
	private boolean atualiza;
	

	/**
	 * Returns the municipio.
	 * @return int
	 */
	public int getMunicipio() {
		atualiza = false;
		return municipio;
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
	 * Returns the populacao.
	 * @return int
	 */
	public int getPopulacao() {
		atualiza = false;		
		return populacao;
	}

	/**
	 * Returns the regional.
	 * @return RegionalKey
	 */
	public RegionalKey getRegional() {
		atualiza = false;		
		return regional;
	}
	
	public int getKeyEstado(){
		atualiza = false;		
		try {
			InitialContext ctxRamoAtividade     = new InitialContext();
			RegionalHome regionalHome = (RegionalHome)ctxRamoAtividade.lookup("ejb/br/smat/ejb/regional/RegionalHome");
					
			return regionalHome.findByPrimaryKey(regional).getKeyEstado();
		} catch (RemoteException e) {
		} catch (NamingException e) {
		} catch (FinderException e) {
		}
		return 0;
	}	

	/**
	 * Returns the sigla.
	 * @return String
	 */
	public String getSigla() {
		atualiza = false;		
		return sigla;
	}

	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(int municipio) {
		atualiza = true;		
		this.municipio = municipio;
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
	 * Sets the populacao.
	 * @param populacao The populacao to set
	 */
	public void setPopulacao(int populacao) {
		atualiza = true;		
		this.populacao = populacao;
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
	 * Sets the sigla.
	 * @param sigla The sigla to set
	 */
	public void setSigla(String sigla) {
		atualiza = true;
		this.sigla = sigla;
	}
			
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		municipio = 0;
		regional = null;		
		nome = null;
		sigla = null;
		populacao = 0;	
		
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
			MunicipioKey key = (MunicipioKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_municipios ?");
		    stmt.setInt(1,key.municipio);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		municipio = rs.getInt("municipio");
	    		regional  = new RegionalKey(rs.getInt("regional"));
		    	nome   	  = rs.getString("nome");
		    	sigla	  = rs.getString("regional");		    	
		    	populacao = rs.getInt("populacao");
		    }
		    else{
			   throw new EJBException("MunicipioBean ejbLoad");
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
			MunicipioKey key = (MunicipioKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_municipios ?");
		    stmt.setInt(1,key.municipio);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("MunicipioBean ejbRemove");
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
		
		//System.out.println("------------------- MunicipioBean ejbStore ----------------------- " + atualiza);
		if(atualiza){
			Connection conn = null;
			try{
				conn = Conexao.getConnection();
				MunicipioKey key = (MunicipioKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_gravar_municipios ?,?,?,?,?");
	
			    stmt.setInt(1,key.municipio);
			    stmt.setInt(2,regional.regional);		    
				stmt.setString(3,nome);
				stmt.setString(4,sigla);
			    stmt.setInt(5,populacao);		    					
				
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("MunicipioBean ejbStore rs: "+rs);
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
	public MunicipioKey ejbCreate(int    regional,
			  					   String nome,
								   String sigla,
								   int	  populacao) throws javax.ejb.CreateException {
							   	
			Connection 		conn 	= null;			
			MunicipioKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_municipios null,?,?,?,?");
				
					
			    stmt.setInt(1,regional);
			    stmt.setString(2,nome);
   			    stmt.setString(3,sigla);
			    stmt.setInt(4,populacao);						    

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					municipio = rs.getInt("municipio");
				else
					throw new EJBException("MunicipioBean ejbCreate");

				setRegional(new RegionalKey(regional));
			    setNome(nome);
			    setSigla(sigla);
			    setPopulacao(populacao);

				atualiza = false;					    
				
				retVal = new MunicipioKey(municipio);
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
	public void ejbPostCreate( int    regional,
  							    String  nome,
								String 	sigla,
								int	populacao) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public MunicipioKey ejbFindByPrimaryKey(MunicipioKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
			atualiza = false;
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_municipios ?");
				stmt.setInt(1,key.municipio);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("MunicipioBean ejbFindByPrimaryKey => MunicipioKey not found");
			}
			catch(SQLException e){
					throw new FinderException("MunicipioBean ejbFindByPrimaryKey => MunicipioKey not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}	
	}
	
	public Collection ejbFindAllMunicipios() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();

		atualiza = false;		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_municipios");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new MunicipioKey(rs.getInt("municipio")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("MunicipioBean ejbFindAllMunicipios => MunicipioKey not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}	
	
	public Collection ejbFindAllMunicipios(int estado) throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();

		atualiza = false;		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_municipios null,?");
			stmt.setInt(1,estado);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new MunicipioKey(rs.getInt("municipio")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("MunicipioBean ejbFindAllMunicipios => MunicipioKey not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}

	public Collection ejbFindAllMunicipiosByRegional(int regional) throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();

		atualiza = false;		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_municipios null,null,?");
			stmt.setInt(1,regional);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new MunicipioKey(rs.getInt("municipio")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("MunicipioBean ejbFindAllMunicipiosByRegional => MunicipioKey not Found");
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
