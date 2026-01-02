package br.smat.ejb.empregador;

import java.rmi.RemoteException;
import java.security.Key;
import java.sql.Connection;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.EJBException;
import javax.ejb.EntityContext;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import br.smat.conexao.Conexao;
import br.smat.ejb.municipio.MunicipioHome;
import br.smat.ejb.municipio.MunicipioKey;
import br.smat.ejb.ramoatividade.RamoAtividade;
import br.smat.ejb.ramoatividade.RamoAtividadeHome;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;
import br.smat.ejb.regional.RegionalHome;
import br.smat.ejb.tipoempregador.TipoEmpregadorKey;

/**
 * Bean implementation class for Enterprise Bean: Empregador
 */
public class EmpregadorBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private int empregador;
	private RamoAtividadeKey ramoAtividade;
	private MunicipioKey municipio;
	private TipoEmpregadorKey tipoEmpregador;
	private String razaoSocial;
	private String documento;
	private int numero;
	private String rua;
	private String bairro;
	private String cep;
	private String complemento;
	
	
	private boolean atualiza;


	/**
	 * Returns the bairro.
	 * @return String
	 */
	public String getBairro() {
		atualiza = false;
		return bairro;
	}

	/**
	 * Returns the cep.
	 * @return String
	 */
	public String getCep() {
		atualiza = false;		
		return cep;
	}

	/**
	 * Returns the complemento.
	 * @return String
	 */
	public String getComplemento() {
		atualiza = false;		
		return complemento;
	}

	/**
	 * Returns the documento.
	 * @return String
	 */
	public String getDocumento() {
		atualiza = false;		
		return documento;
	}

	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() {
		atualiza = false;
		return empregador;
	}

	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio() {
		atualiza = false;
		return municipio;
	}
	
	public int getKeyMunicipio() {
		atualiza = false;		
		return municipio.municipio;
	}	
	
	public int getKeyEstado(){
		atualiza = false;		
		try {
			InitialContext ctxMunicipio     = new InitialContext();
			MunicipioHome municipioHome = (MunicipioHome)ctxMunicipio.lookup("ejb/br/smat/ejb/municipio/MunicipioHome");
			return municipioHome.findByPrimaryKey(municipio).getKeyEstado();
		} catch (RemoteException e) {
		} catch (NamingException e) {
		} catch (FinderException e) {
		}
		return 0;
	}

	/**
	 * Returns the numero.
	 * @return int
	 */
	public int getNumero() {
		atualiza = false;
		return numero;
	}

	/**
	 * Returns the ramoAtividade.
	 * @return RamoAtividadeKey
	 */
	public RamoAtividadeKey getRamoAtividade() {
		atualiza = false;		
		return ramoAtividade;
	}
	
	public int getKeyRamoAtividade(){
		atualiza = false;		
		return ramoAtividade.ramoAtividade;
	}
	
	public int getKeyRamoSuperior(){
		atualiza = false;		
		try {
			InitialContext ctxRamoAtividade     = new InitialContext();
			RamoAtividadeHome ramoAtividadeHome = (RamoAtividadeHome)ctxRamoAtividade.lookup("ejb/br/smat/ejb/ramoatividade/RamoAtividadeHome");
			
			RamoAtividade ra = ramoAtividadeHome.findByPrimaryKey(ramoAtividade);
			
			RamoAtividadeKey keyRamoSuperior = ra.getRamoSuperior();
			
			if(keyRamoSuperior != null)
				return ra.getRamoSuperior().ramoAtividade;
		} catch (RemoteException e) {
		} catch (NamingException e) {
		} catch (FinderException e) {
		}
		
		return 0;				
	}	

	/**
	 * Returns the razaoSocial.
	 * @return String
	 */
	public String getRazaoSocial() {
		atualiza = false;
		return razaoSocial;
	}

	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua() {
		atualiza = false;
		return rua;
	}

	/**
	 * Returns the tipoEmpregador.
	 * @return TipoEmpregadorKey
	 */
	public TipoEmpregadorKey getTipoEmpregador() {
		atualiza = false;
		return tipoEmpregador;
	}
	public int getKeyTipoEmpregador() {
		atualiza = false;		
		return this.tipoEmpregador.tipoEmpregador;
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
	 * Sets the documento.
	 * @param documento The documento to set
	 */
	public void setDocumento(String documento) {
		atualiza = true;		
		this.documento = documento;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(int empregador) {
		atualiza = true;		
		this.empregador = empregador;
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
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero) {
		atualiza = true;		
		this.numero = numero;
	}

	/**
	 * Sets the ramoAtividade.
	 * @param ramoAtividade The ramoAtividade to set
	 */
	public void setRamoAtividade(RamoAtividadeKey ramoAtividade) {
		atualiza = true;		
		this.ramoAtividade = ramoAtividade;
	}

	/**
	 * Sets the razaoSocial.
	 * @param razaoSocial The razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		atualiza = true;		
		this.razaoSocial = razaoSocial;
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
	 * Sets the tipoEmpregador.
	 * @param tipoEmpregador The tipoEmpregador to set
	 */
	public void setTipoEmpregador(TipoEmpregadorKey tipoEmpregador) {
		atualiza = true;		
		this.tipoEmpregador = tipoEmpregador;
	}
	
	public String getNomeRamoAtividade() {
		atualiza = false;			
		try {
			InitialContext ctxRamoAtividade     = new InitialContext();
			RamoAtividadeHome ramoAtividadeHome = (RamoAtividadeHome)ctxRamoAtividade.lookup("ejb/br/smat/ejb/ramoatividade/RamoAtividadeHome");
					
			return ramoAtividadeHome.findByPrimaryKey(ramoAtividade).getNome();
		} catch (RemoteException e) {
		} catch (NamingException e) {
		} catch (FinderException e) {
		}
		
		return null;
	}	
	
	
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		empregador = 0;
		ramoAtividade = null;
		municipio = null;
		tipoEmpregador = null;
		razaoSocial = null;
		documento = null;
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
	public void ejbLoad() throws EJBException{
		atualiza = false;					
		Connection conn = null;

		try{
			conn = Conexao.getConnection();
			EmpregadorKey key = (EmpregadorKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_empregadores ?");
		    stmt.setInt(1,key.empregador);

			System.out.println("ejbLoad() => " + key.empregador);

	    	ResultSet rs = stmt.executeQuery();



		    if(rs.next()){

			    empregador = rs.getInt("empregador");
			    
			    ramoAtividade = new RamoAtividadeKey(rs.getInt("ramoAtividade"));
			    municipio = new MunicipioKey(rs.getInt("municipio"));
			    tipoEmpregador = new TipoEmpregadorKey(rs.getInt("tipoEmpregador"));
			    razaoSocial =  rs.getString("razaoSocial");
			    documento = rs.getString("documento");
			    numero = rs.getInt("numero");
			    rua = rs.getString("rua");
			    bairro = rs.getString("bairro");
			    cep = rs.getString("cep");
			    complemento = rs.getString("complemento");
		    }
		    else{
			   throw new EJBException("EmpregadorBean ejbLoad => Erro ao carregar Empregadores");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new EJBException("EmpregadorBean ejbLoad");							
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new EJBException("EmpregadorBean ejbLoad");				
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
			EmpregadorKey key = (EmpregadorKey)ctx.getPrimaryKey();
			
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_telefonesempregadores null,?");			
			
			
		    stmt.setInt(1,key.empregador);
			stmt.executeUpdate();
			
			
			stmt = conn.prepareStatement
				("exec sp_smat_excluir_empregadores ?");
			
			System.out.println("exec sp_smat_excluir_telefonesempregadores null, " + key.empregador);	
			System.out.println("exec sp_smat_excluir_empregadores " + key.empregador);

		    stmt.setInt(1,key.empregador);
	    	int r = stmt.executeUpdate();
	    	
		    if(r == 0){
			   throw new EJBException("EmpregadorBean ejbRemove => Failed to Delete");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
      		throw new RemoveException("EmpregadorBean ejbRemove");			
		}
		finally
		{
			try{
				conn.close();
			}
			catch(SQLException e){
				throw new RemoveException("EmpregadorBean ejbRemove");						
			}
		}
		
		System.out.println("*********** nao entrou nas excecoes do EmpregadorBeans ***********");
				
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() throws EJBException {

		if(atualiza){
			Connection conn = null;
			try{
				conn = Conexao.getConnection();
				EmpregadorKey key = (EmpregadorKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_empregadores ?,?,?,?,?,?,?,?,?,?,?");
	
			    stmt.setInt(1,key.empregador);
			    stmt.setInt(2,ramoAtividade.ramoAtividade);
			    stmt.setInt(3,municipio.municipio);
			    stmt.setInt(4,tipoEmpregador.tipoEmpregador);
			    stmt.setString(5,razaoSocial);
			    stmt.setString(6,documento);
			    stmt.setInt(7,numero);
			    stmt.setString(8,rua);
			    stmt.setString(9,bairro);
			    stmt.setString(10,cep);
			    stmt.setString(11,complemento);
			    
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("EmpregadorBean ejbStore => Failed to update: "+rs);
			    }
			}
			catch(SQLException e){   				
				e.printStackTrace();
				throw new EJBException("EmpregadorBean ejbStore");										
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new EJBException("EmpregadorBean ejbStore");					
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
	public br.smat.ejb.empregador.EmpregadorKey ejbCreate(int ramoAtividade,
															int municipio,
															int tipoEmpregador,
															String razaoSocial,
															String documento,
															int numero,
															String rua,
															String bairro,
															String cep,
															String complemento)
		throws javax.ejb.CreateException,SQLException {

			Connection 	conn 	= null;			
			EmpregadorKey 	retVal  = null;
			atualiza = false;			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_empregadores null,?,?,?,?,?,?,?,?,?,?");

				stmt.setInt(1,ramoAtividade);
				stmt.setInt(2,municipio);
				stmt.setInt(3,tipoEmpregador);
			    stmt.setString(4,razaoSocial);
			    stmt.setString(5,documento);
			    stmt.setInt(6,numero);
			    stmt.setString(7,rua);
			    stmt.setString(8,bairro);
			    stmt.setString(9,cep);
			    stmt.setString(10,complemento);
			    
			    
				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					empregador = rs.getInt("empregador");
				else
					throw new EJBException("EmpregadorBean ejbCreate => FAILED TO INSERT");

				setRamoAtividade(new RamoAtividadeKey(ramoAtividade));
				setMunicipio(new MunicipioKey(municipio));
				setTipoEmpregador(new TipoEmpregadorKey(tipoEmpregador));
			    setRazaoSocial(razaoSocial);
			    setDocumento(documento);
			    setNumero(numero);
			    setRua(rua);
			    setBairro(bairro);
			    setCep(cep);
			    setComplemento(complemento);
			    
			    
				retVal = new EmpregadorKey(empregador);
			}
			catch(SQLException e){
				e.printStackTrace();
     			throw new SQLException("EmpregadorBean ejbCreate");				
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
					throw new SQLException("EmpregadorBean ejbCreate");
				}
			}
			
			return retVal;
			
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(int ramoAtividade,
								int municipio,
								int tipoEmpregador,
								String razaoSocial,
								String documento,
								int numero,
								String rua,
								String bairro,
								String cep,
								String complemento) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public EmpregadorKey ejbFindByPrimaryKey(EmpregadorKey key)
		throws FinderException,SQLException {

			Connection conn = null;
			atualiza = false;			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_empregadores ?");
				stmt.setInt(1,key.empregador);
				System.out.println("ejbFindByPrimaryKey => " + key.empregador);
				ResultSet rs = stmt.executeQuery();
				System.out.println("ejbFindByPrimaryKey => " + key.empregador);
				if(rs.next())
					return key;
				else
					throw new FinderException("EmpregadorBean ejbFindByPrimaryKey => Empregador not found");
			}
			catch(SQLException e){
					throw new SQLException("EmpregadorBean ejbFindByPrimaryKey => Empregador not found SQLException");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){
					throw new FinderException("EmpregadorBean ejbFindByPrimaryKey Exception ");					
				}
			}
			
	}

	public Collection ejbFindAllEmpregadores() throws FinderException,Exception
	{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza = false;		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_empregadores");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				retVal.addElement(new EmpregadorKey(rs.getInt("empregador")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("EmpregadorBean ejbFindAllEmpregadores => Empregador not Found");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){
				throw new Exception("EmpregadorBean ejbFindAllEmpregadores Exception ");
			}
		}
		return retVal;
	}
	
}
