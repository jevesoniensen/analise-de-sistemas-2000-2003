package br.smat.ejb.regional;

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
import br.smat.ejb.estado.EstadoKey;
import br.smat.ejb.municipio.MunicipioKey;

/**
 * Bean implementation class for Enterprise Bean: Regional
 */
public class RegionalBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int 			regional;
	private MunicipioKey 	municipio;
	private EstadoKey 		estado;
	private String 		nome;
	private int 			numero;
	private String 		rua;
	private String 		bairro;
	private String 		cep;
	private String 		complemento;
	private boolean 		atualiza;

	/**
	 * Returns the bairro.
	 * @return String
	 */
	public String getBairro() {
		atualiza =false;
		return bairro;
	}

	/**
	 * Returns the cep.
	 * @return String
	 */
	public String getCep() {
		atualiza =false;
		return cep;
	}

	/**
	 * Returns the complemento.
	 * @return String
	 */
	public String getComplemento() {
		atualiza =false;
		return complemento;
	}

	/**
	 * Returns the estado.
	 * @return EstadoKey
	 */
	public EstadoKey getEstado() {
		atualiza =false;
		return estado;
	}
	
	public int getKeyEstado() {
		atualiza =false;
		return estado.estado;
	}	

	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio() {
		atualiza =false;
		return municipio;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		atualiza =false;
		return nome;
	}

	/**
	 * Returns the numero.
	 * @return int
	 */
	public int getNumero() {
		atualiza =false;
		return numero;
	}

	/**
	 * Returns the regional.
	 * @return int
	 */
	public int getRegional() {
		atualiza =false;
		return regional;
	}

	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua() {
		atualiza =false;
		return rua;
	}

	/**
	 * Sets the bairro.
	 * @param bairro The bairro to set
	 */
	public void setBairro(String bairro) {
		atualiza = true;		
		this.bairro = bairro;
	}

	/**
	 * Sets the cep.
	 * @param cep The cep to set
	 */
	public void setCep(String cep) {
		atualiza = true;		
		this.cep = cep;
	}

	/**
	 * Sets the complemento.
	 * @param complemento The complemento to set
	 */
	public void setComplemento(String complemento) {
		atualiza = true;		
		this.complemento = complemento;
	}

	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(EstadoKey estado) {
		atualiza = true;		
		this.estado = estado;
	}

	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(MunicipioKey municipio) {
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
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero) {
		atualiza = true;		
		this.numero = numero;
	}

	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(int regional) {
		atualiza = true;		
		this.regional = regional;
	}

	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua) {
		atualiza = true;		
		this.rua = rua;
	}	
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		regional = 0;
		municipio = null;
		estado = null;
		nome = null;
		numero = 0;
		rua = null;
		bairro = null;
		cep = null;
		complemento = null;		
		atualiza = false;		
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		atualiza = false;		
		Connection 	conn  	   = null;
		int		aux  = 0;

		try{
			conn = Conexao.getConnection();
			RegionalKey key = (RegionalKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement	("exec sp_smat_listar_regionais ?");
		    stmt.setInt(1,key.regional);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
	    		regional = rs.getInt("regional");
	    		
	    		aux = rs.getInt("municipio");
	    		
		    	if(aux > 0)
			    	municipio = new MunicipioKey(aux);
			    else
			    	municipio = null;
			    		    			
			    estado		 = new EstadoKey(rs.getInt("estado"));    		
		    	nome  		 = rs.getString("nome");
		    	numero		 = rs.getInt("numero");
		    	rua   		 = rs.getString("rua");		    	
		    	bairro 		 = rs.getString("bairro");		    	
		    	cep    		 = rs.getString("cep");		    	
		    	complemento  = rs.getString("complemento");		    	
		    }
		    else{
			   throw new EJBException("RegionalBean ejbLoad");
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
			RegionalKey key = (RegionalKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_excluir_regionais ?");
		    stmt.setInt(1,key.regional);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("RegionalBean ejbRemove");
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new EJBException("RegionalBean ejbRemove");
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e)
			{throw new EJBException("RegionalBean ejbRemove");}
		}		
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
		//System.out.println("------------------- RegionalBean ejbStore ----------------------- " + atualiza);
		if(atualiza){
			Connection conn = null;
			try{
				conn = Conexao.getConnection();
				RegionalKey key = (RegionalKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_regionais ?,?,?,?,?,?,?,?,?");
	
			    stmt.setInt(1,key.regional);
			    
				if(municipio == null)
					stmt.setNull(2,Types.INTEGER);
				else
				    stmt.setInt(2,municipio.municipio);
				    		    
	 		    stmt.setInt(3,estado.estado);				    
				stmt.setString(4,nome);
				stmt.setInt(5,numero);
				stmt.setString(6,rua);
				stmt.setString(7,bairro);
				stmt.setString(8,cep);
				stmt.setString(9,complemento);						
				
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("RegionalBean ejbStore rs: "+rs);
			    }
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new EJBException("RegionalBean ejbStore rs");
			}
			finally{
				try{
					conn.close();
					atualiza = false;
				}
				catch(SQLException e){throw new EJBException("RegionalBean ejbStore rs");}
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
	public RegionalKey ejbCreate( 	int 	municipio,
									int	estado,
									String 	nome,
									int 	numero,
									String 	rua,
									String 	bairro,
									String 	cep,
									String 	complemento)
		throws javax.ejb.CreateException {
			Connection 		conn 	= null;			
			RegionalKey 	retVal  = null;
		
		
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_regionais null,?,?,?,?,?,?,?,?");
				
					
				if(municipio == 0)
					stmt.setNull(1,Types.INTEGER);
				else					
				    stmt.setInt(1,municipio);

			    stmt.setInt(2,estado);				    
				stmt.setString(3,nome);
				stmt.setInt(4,numero);
				stmt.setString(5,rua);
				stmt.setString(6,bairro);
				stmt.setString(7,cep);
				stmt.setString(8,complemento);		    

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					regional = rs.getInt("regional");
				else
					throw new EJBException("RegionalBean ejbCreate");

				if(municipio != 0)
					setMunicipio(new MunicipioKey(municipio));
					
				setEstado(new EstadoKey(estado));									
			    setNome(nome);
			    setNumero(numero);
			    setRua(rua);
			    setBairro(bairro);
			    setCep(cep);
			    setComplemento(complemento);
			    
	         	atualiza =false;				    
	         	
				retVal = new RegionalKey(regional);
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
	public void ejbPostCreate( int 	municipio,
								int	estado,
								String 	nome,
								int 	numero,
								String 	rua,
								String 	bairro,
								String 	cep,
								String 	complemento) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public RegionalKey ejbFindByPrimaryKey(RegionalKey key)
		throws javax.ejb.FinderException {
			Connection conn = null;
   		    atualiza =false;			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_regionais ?");
				stmt.setInt(1,key.regional);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("RegionalBean ejbFindByPrimaryKey => RegionalKey not found");
			}
			catch(SQLException e){
					throw new FinderException("RegionalBean ejbFindByPrimaryKey => RegionalKey not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}		
	}
	
	public Collection ejbFindAllRegionais() throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza =false;		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_regionais");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new RegionalKey(rs.getInt("regional")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("RegionalBean ejbFindAllRegionais => RegionalKey not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}

	public Collection ejbFindAllRegionais(int estado) throws FinderException
	{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza =false;		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_regionais null,?");
			stmt.setInt(1,estado);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new RegionalKey(rs.getInt("regional")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("RegionalBean ejbFindAllRegionais => RegionalKey not Found");
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
