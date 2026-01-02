package br.smat.ejb.trabalhador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao;
import br.smat.ejb.estado.EstadoKey;
import br.smat.ejb.estadocivil.EstadoCivilKey;
import br.smat.ejb.municipio.MunicipioKey;

/**
 * Bean implementation class for Enterprise Bean: Trabalhador
 */
public class TrabalhadorBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private	int 			trabalhador;
	private	MunicipioKey	municipio;
	private	EstadoKey	 	ufRG;
	private	EstadoKey	 	ufCTPS;
	private	EstadoCivilKey	estadoCivil;
	private	String	 		nome;
	private	String	 		cpf;
	private	String	 		rg;
	private	int	 		carteiraTrabalho;
	private	int	 		serie;
	private	String	 		dataEmissaoCTPS;
	private	String	 		dataNascimento;
	private	String	 		sexo;
	private	int	 		numero;
	private	String	 		rua;
	private	String  		bairro;
	private	String 			cep;
	private	String	 		complemento;
	private	String	 		nomeResponsavel;
	private	String       	dataEmissaoRG;
	private	String       	orgaoExpedidorRG;
	private	String	 		pisPasepNit;
	private	String	 		telefone;
	private	String	 		ddd;

	private 	boolean 		atualiza;		

	/**
	 * Returns the bairro.
	 * @return String
	 */
	public String getBairro() {
		atualiza = false;		
		return bairro;
	}

	/**
	 * Returns the carteiraTrabalho.
	 * @return int
	 */
	public int getCarteiraTrabalho() {
		atualiza = false;		
		return carteiraTrabalho;
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
	 * Returns the cpf.
	 * @return String
	 */
	public String getCpf() {
		atualiza = false;		
		return cpf;
	}

	/**
	 * Returns the dataEmissaoCTPS.
	 * @return String
	 */
	public String getDataEmissaoCTPS() {
		atualiza = false;		
		return dataEmissaoCTPS;
	}

	/**
	 * Returns the dataEmissaoRG.
	 * @return String
	 */
	public String getDataEmissaoRG() {
		atualiza = false;		
		return dataEmissaoRG;
	}

	/**
	 * Returns the dataNascimento.
	 * @return String
	 */
	public String getDataNascimento() {
		atualiza = false;		
		return dataNascimento;
	}

	/**
	 * Returns the ddd.
	 * @return String
	 */
	public String getDdd() {
		atualiza = false;		
		return ddd;
	}

	/**
	 * Returns the estadoCivil.
	 * @return EstadoCivilKey
	 */
	public EstadoCivilKey getEstadoCivil() {
		atualiza = false;		
		return estadoCivil;
	}

	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio() {
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
	 * Returns the nomeResponsavel.
	 * @return String
	 */
	public String getNomeResponsavel() {
		atualiza = false;		
		return nomeResponsavel;
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
	 * Returns the orgaoExpedidorRG.
	 * @return String
	 */
	public String getOrgaoExpedidorRG() {
		atualiza = false;		
		return orgaoExpedidorRG;
	}

	/**
	 * Returns the pisPasepNit.
	 * @return String
	 */
	public String getPisPasepNit() {
		atualiza = false;		
		return pisPasepNit;
	}

	/**
	 * Returns the rg.
	 * @return String
	 */
	public String getRg() {
		atualiza = false;		
		return rg;
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
	 * Returns the serie.
	 * @return int
	 */
	public int getSerie() {
		atualiza = false;		
		return serie;
	}

	/**
	 * Returns the sexo.
	 * @return String
	 */
	public String getSexo() {
		atualiza = false;		
		return sexo;
	}

	/**
	 * Returns the telefone.
	 * @return String
	 */
	public String getTelefone() {
		atualiza = false;		
		return telefone;
	}

	/**
	 * Returns the trabalhador.
	 * @return int
	 */
	public int getTrabalhador() {
		atualiza = false;		
		return trabalhador;
	}

	/**
	 * Returns the ufCTPS.
	 * @return EstadoKey
	 */
	public EstadoKey getUfCTPS() {
		atualiza = false;		
		return ufCTPS;
	}

	/**
	 * Returns the ufRG.
	 * @return EstadoKey
	 */
	public EstadoKey getUfRG() {
		atualiza = false;		
		return ufRG;
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
	 * Sets the carteiraTrabalho.
	 * @param carteiraTrabalho The carteiraTrabalho to set
	 */
	public void setCarteiraTrabalho(int carteiraTrabalho) {
		atualiza = true;		
		this.carteiraTrabalho = carteiraTrabalho;
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
	 * Sets the cpf.
	 * @param cpf The cpf to set
	 */
	public void setCpf(String cpf) {
		atualiza = true;
		this.cpf = cpf;
	}

	/**
	 * Sets the dataEmissaoCTPS.
	 * @param dataEmissaoCTPS The dataEmissaoCTPS to set
	 */
	public void setDataEmissaoCTPS(String dataEmissaoCTPS) {
		atualiza = true;
		this.dataEmissaoCTPS = dataEmissaoCTPS;
	}

	/**
	 * Sets the dataEmissaoRG.
	 * @param dataEmissaoRG The dataEmissaoRG to set
	 */
	public void setDataEmissaoRG(String dataEmissaoRG) {
		atualiza = true;
		this.dataEmissaoRG = dataEmissaoRG;
	}

	/**
	 * Sets the dataNascimento.
	 * @param dataNascimento The dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento) {
		atualiza = true;
		this.dataNascimento = dataNascimento;
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
	 * Sets the estadoCivil.
	 * @param estadoCivil The estadoCivil to set
	 */
	public void setEstadoCivil(EstadoCivilKey estadoCivil) {
		atualiza = true;
		this.estadoCivil = estadoCivil;
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
	 * Sets the nomeResponsavel.
	 * @param nomeResponsavel The nomeResponsavel to set
	 */
	public void setNomeResponsavel(String nomeResponsavel) {
		atualiza = true;
		this.nomeResponsavel = nomeResponsavel;
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
	 * Sets the orgaoExpedidorRG.
	 * @param orgaoExpedidorRG The orgaoExpedidorRG to set
	 */
	public void setOrgaoExpedidorRG(String orgaoExpedidorRG) {
		atualiza = true;
		this.orgaoExpedidorRG = orgaoExpedidorRG;
	}

	/**
	 * Sets the pisPasepNit.
	 * @param pisPasepNit The pisPasepNit to set
	 */
	public void setPisPasepNit(String pisPasepNit) {
		atualiza = true;
		this.pisPasepNit = pisPasepNit;
	}

	/**
	 * Sets the rg.
	 * @param rg The rg to set
	 */
	public void setRg(String rg) {
		atualiza = true;
		this.rg = rg;
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
	 * Sets the serie.
	 * @param serie The serie to set
	 */
	public void setSerie(int serie) {
		atualiza = true;
		this.serie = serie;
	}

	/**
	 * Sets the sexo.
	 * @param sexo The sexo to set
	 */
	public void setSexo(String sexo) {
		atualiza = true;
		this.sexo = sexo;
	}

	/**
	 * Sets the telefone.
	 * @param telefone The telefone to set
	 */
	public void setTelefone(String telefone) {
		atualiza = true;
		this.telefone = telefone;
	}

	/**
	 * Sets the trabalhador.
	 * @param trabalhador The trabalhador to set
	 */
	public void setTrabalhador(int trabalhador) {
		atualiza = true;
		this.trabalhador = trabalhador;
	}

	/**
	 * Sets the ufCTPS.
	 * @param ufCTPS The ufCTPS to set
	 */
	public void setUfCTPS(EstadoKey ufCTPS) {
		atualiza = true;
		this.ufCTPS = ufCTPS;
	}

	/**
	 * Sets the ufRG.
	 * @param ufRG The ufRG to set
	 */
	public void setUfRG(EstadoKey ufRG) {
		atualiza = true;
		this.ufRG = ufRG;
	}
	

	/*private String converteData(String data) {
		atualiza = false;
		String dataFormatada = null;

		System.out.println("TrabalhadorBean Data " + data);

		if(data != null)
		{
			dataFormatada =  data.substring(3,5) + "/" + data.substring(0,2) + "/" + data.substring(6);
		}

		return dataFormatada;
	}*/
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		atualiza = false;
	 	trabalhador = 0;
		municipio = null;
		ufRG = null;
		ufCTPS = null;
		estadoCivil = null;
		nome = null;
		cpf = null;
		rg = null;
		carteiraTrabalho = 0;
		serie = 0;
		dataEmissaoCTPS = null;
		dataNascimento = null;
		sexo = null;
		numero = 0;
		rua = null;
	  	bairro = null;
	 	cep = null;
		complemento = null;
		nomeResponsavel = null;
	    dataEmissaoRG = null;
	    orgaoExpedidorRG = null;
		pisPasepNit = null;
		telefone = null;
		ddd = null;		
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {

		Connection conn = null;
		atualiza = false;

		try{
			conn = Conexao.getConnection();
			TrabalhadorKey key = (TrabalhadorKey)ctx.getPrimaryKey();
			
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_trabalhadores ?");
		    stmt.setInt(1,key.trabalhador);
	    	ResultSet rs = stmt.executeQuery();
			
		    if(rs.next()){
		    	
		    	trabalhador = rs.getInt("trabalhador");
		    	
		    	if(rs.getInt("municipio") > 0)
		    		municipio = new MunicipioKey(rs.getInt("municipio"));
				
				if(rs.getInt("UFRG") > 0)
					ufRG = new EstadoKey(rs.getInt("UFRG"));

				if(rs.getInt("UFCTPS") > 0)
					ufCTPS = new EstadoKey(rs.getInt("UFCTPS"));

				if(rs.getInt("estadoCivil") > 0)
					estadoCivil = new EstadoCivilKey(rs.getInt("estadoCivil"));
					
				nome = rs.getString("nome");
				cpf = rs.getString("cpf");
				rg = rs.getString("rg");
				
				if(rs.getInt("carteiraTrabalho") > 0)
					carteiraTrabalho = rs.getInt("carteiraTrabalho");

				if(rs.getInt("serie") > 0)
					serie =  rs.getInt("serie");

				dataEmissaoCTPS = rs.getString("dataEmissaoCTPS");
				dataNascimento = rs.getString("dataNascimento");
				sexo = rs.getString("sexo");
				numero = rs.getInt("numero");
				rua = rs.getString("rua");
				bairro = rs.getString("bairro");
				cep = rs.getString("cep");
				complemento = rs.getString("complemento");
				nomeResponsavel = rs.getString("nomeResponsavel");
				dataEmissaoRG = rs.getString("dataEmissaoRG");
				orgaoExpedidorRG = rs.getString("orgaoExpedidorRG");
				pisPasepNit = rs.getString("PISPASEPNIT");
				telefone = rs.getString("telefone");
				ddd = rs.getString("ddd");
		    }
		    else{
			   throw new EJBException("TrabalhadorBean ejbLoad EJBException");
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
			TrabalhadorKey key = (TrabalhadorKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_trabalhadores ?");
		    stmt.setInt(1,key.trabalhador);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("TrabalhadorBean ejbRemove EJBException");
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
				TrabalhadorKey key = (TrabalhadorKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_trabalhadores ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?");
	
			    stmt.setInt(1,key.trabalhador);
				stmt.setInt(2,municipio.municipio);
				
				if(ufRG == null)
				   	stmt.setNull(3,Types.INTEGER);
				else
				    stmt.setInt(3,ufRG.estado);
	
				if(ufCTPS == null)
				   	stmt.setNull(4,Types.INTEGER);
				else
				    stmt.setInt(4,ufCTPS.estado);			    
	
				if(estadoCivil == null)
				   	stmt.setNull(5,Types.INTEGER);
				else
				    stmt.setInt(5,estadoCivil.estadoCivil);
	
				stmt.setString(6,nome);
				stmt.setString(7,cpf);
				stmt.setString(8,rg);
	
				if(carteiraTrabalho == 0)
				   	stmt.setNull(9,Types.INTEGER);
				else
				    stmt.setInt(9,carteiraTrabalho);
	
				if(serie == 0)
				   	stmt.setNull(10,Types.INTEGER);
				else
				    stmt.setInt(10,serie);
				
				stmt.setString(11,dataEmissaoCTPS);
				stmt.setString(12,dataNascimento);
				stmt.setString(13,sexo);
				stmt.setInt(14,numero);
				stmt.setString(15,rua);
				stmt.setString(16,bairro);
				stmt.setString(17,cep);
				stmt.setString(18,complemento);
				stmt.setString(19,nomeResponsavel);
				stmt.setString(20,dataEmissaoRG);
				stmt.setString(21,orgaoExpedidorRG);
				stmt.setString(22,pisPasepNit);
				stmt.setString(23,telefone);
				stmt.setString(24,ddd);
	
			    int rs = stmt.executeUpdate();
	
			    
			    if(rs != 1){
			    	throw new EJBException("TrabalhadorBean ejbStore EJBException rs:"+rs);
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
	public TrabalhadorKey ejbCreate(int municipio,
									int ufRG,
									int ufCTPS,
									int estadoCivil,
									String nome,
									String cpf,
									String rg,
									int carteiraTrabalho,
									int serie,
									String dataEmissaoCTPS,
									String dataNascimento,
									String sexo,
									int numero,
									String rua,
									String bairro,
									String cep,
									String complemento,
									String nomeResponsavel,
									String dataEmissaoRG,
									String orgaoExpedidorRG,
									String pisPasepNit,
									String telefone,
									String ddd) throws javax.ejb.CreateException {
			
	
			Connection 			conn 	= null;			
			TrabalhadorKey 	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_trabalhadores null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?");

				if(municipio == 0)
					stmt.setNull(1,Types.INTEGER);
				else
					stmt.setInt(1,municipio);
				
				if(ufRG == 0)
				   	stmt.setNull(2,Types.INTEGER);
				else
				    stmt.setInt(2,ufRG);
	
				if(ufCTPS == 0)
				   	stmt.setNull(3,Types.INTEGER);
				else
				    stmt.setInt(3,ufCTPS);			    
	
				if(estadoCivil == 0)
				   	stmt.setNull(4,Types.INTEGER);
				else
				    stmt.setInt(4,estadoCivil);
	
				stmt.setString(5,nome);
				stmt.setString(6,cpf);
				stmt.setString(7,rg);
	
				if(carteiraTrabalho == 0)
				   	stmt.setNull(8,Types.INTEGER);
				else
				    stmt.setInt(8,carteiraTrabalho);
	
				if(serie == 0)
				   	stmt.setNull(9,Types.INTEGER);
				else
				    stmt.setInt(9,serie);
	
							
				stmt.setString(10,dataEmissaoCTPS);
				
				
				System.out.println("Create trabalhador datas trabalhador " + dataEmissaoCTPS + " -  " + dataEmissaoRG + " - " + dataNascimento);
				
			
				stmt.setString(11,dataNascimento);
				stmt.setString(12,sexo);
				stmt.setInt(13,numero);
				stmt.setString(14,rua);
				stmt.setString(15,bairro);
				stmt.setString(16,cep);
				stmt.setString(17,complemento);
				stmt.setString(18,nomeResponsavel);
				stmt.setString(19,dataEmissaoRG);
				stmt.setString(20,orgaoExpedidorRG);
				stmt.setString(21,pisPasepNit);
				stmt.setString(22,telefone);
				stmt.setString(23,ddd);
				
				ResultSet rs = stmt.executeQuery();
	
				
	
				if(rs.next())
					trabalhador = rs.getInt("trabalhador");
				else
					throw new EJBException("TrabalhadorBean ejbCreate EJBException");
				
	
				
				setMunicipio(new MunicipioKey(municipio));
				setUfRG(new EstadoKey(ufRG));
				setUfCTPS(new EstadoKey(ufCTPS));
				setEstadoCivil(new EstadoCivilKey(estadoCivil));
				setNome(nome);
				setCpf(cpf);
				setRg(rg);
				setCarteiraTrabalho(carteiraTrabalho);
				setSerie(serie);
				setDataEmissaoCTPS(dataEmissaoCTPS);
				setDataNascimento(dataNascimento);
				setSexo(sexo);
				setNumero(numero);
				setRua(rua);
				setBairro(bairro);
				setCep(cep);
				setComplemento(complemento);
				setNomeResponsavel(nomeResponsavel);
				setDataEmissaoRG(dataEmissaoRG);
				setOrgaoExpedidorRG(orgaoExpedidorRG);
				setPisPasepNit(pisPasepNit);
				setTelefone(telefone);
				setDdd(ddd);

				atualiza = false;	
		
				retVal = new TrabalhadorKey(trabalhador);

			}catch(SQLException e){
				System.out.println("****************************");
				System.out.println("******Trabalhador Bean *****");
				e.printStackTrace();
				System.out.println("****************************");				
				throw new CreateException("TrabalhadorBean ejbCreate " + e.getMessage());
			}

			finally{
				try{
					conn.close();
				}
				catch(SQLException e){
				e.printStackTrace();					
					throw new CreateException("TrabalhadorBean ejbCreate "  + e.getMessage());					
				}
			}

			return retVal;
	}

	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(int municipio,
								int ufRG,
								int ufCTPS,
								int estadoCivil,
								String nome,
								String cpf,
								String rg,
								int carteiraTrabalho,
								int serie,
								String dataEmissaoCTPS,
								String dataNascimento,
								String sexo,
								int numero,
								String rua,
								String bairro,
								String cep,
								String complemento,
								String nomeResponsavel,
								String dataEmissaoRG,
								String orgaoExpedidorRG,
								String pisPasepNit,
								String telefone,
								String ddd) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.trabalhador.TrabalhadorKey ejbFindByPrimaryKey(
		br.smat.ejb.trabalhador.TrabalhadorKey key)
		throws javax.ejb.FinderException {

			Connection conn = null;
			atualiza = false;		
						
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_trabalhadores ?");
				stmt.setInt(1,key.trabalhador);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("TrabalhadorBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("TrabalhadorBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
			
	}

    public Collection ejbFindAllTrabalhadores() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza = false;				
		
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_trabalhadores");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new TrabalhadorKey(rs.getInt("trabalhador")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("TrabalhadorBean ejbFindAllTiposAcidente FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}
	

	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.trabalhador.TrabalhadorKey ejbFindByAcidente(int acidente)
		throws javax.ejb.FinderException {

			Connection conn = null;
			atualiza = false;		
						
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_trabalhadores null,?");
				stmt.setInt(1,acidente);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return new TrabalhadorKey(rs.getInt("trabalhador"));
				else
					throw new FinderException("TrabalhadorBean ejbFindByAcidente FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("TrabalhadorBean ejbFindByAcidente FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
			
	}
	
	
}
