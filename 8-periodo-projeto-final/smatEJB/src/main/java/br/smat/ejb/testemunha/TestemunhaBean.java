package br.smat.ejb.testemunha;

import java.sql.Connection;
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
import br.smat.ejb.acidente.AcidenteKey;
import br.smat.ejb.municipio.MunicipioKey;

/**
 * Bean implementation class for Enterprise Bean: Testemunhas
 */
public class TestemunhaBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;
	
	private	int			testemunha;
	private	AcidenteKey 	acidente;
	private	MunicipioKey	municipio;
	private	String			nome;
	private	int			numero;
	private	String			rua;
	private	String			bairro;
	private	String			cep;
	private	String			complemento;
	private	String			telefone;
	private	String			ddd;
	
	private	boolean		atualiza;
	
	/**
	 * Returns the acidente.
	 * @return AcidenteKey
	 */
	public AcidenteKey getAcidente() {
		atualiza = false;
		return acidente;
	}

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
	 * Returns the ddd.
	 * @return String
	 */
	public String getDdd() {
		atualiza = false;		
		return ddd;
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
	 * Returns the numero.
	 * @return int
	 */
	public int getNumero() {
		atualiza = false;		
		return numero;
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
	 * Returns the telefone.
	 * @return String
	 */
	public String getTelefone() {
		atualiza = false;		
		return telefone;
	}

	/**
	 * Returns the testemunha.
	 * @return int
	 */
	public int getTestemunha() {
		atualiza = false;		
		return testemunha;
	}

	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(AcidenteKey acidente) {
		atualiza = true;		
		this.acidente = acidente;
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
	 * Sets the ddd.
	 * @param ddd The ddd to set
	 */
	public void setDdd(String ddd) {
		atualiza = true;				
		this.ddd = ddd;
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
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua) {
		atualiza = true;				
		this.rua = rua;
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
	 * Sets the testemunha.
	 * @param testemunha The testemunha to set
	 */
	public void setTestemunha(int testemunha) {
		atualiza = true;				
		this.testemunha = testemunha;
	}
		
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		atualiza = false;		
		testemunha = 0;
		acidente = null;
		municipio = null;
		nome = null;
		numero = 0;
		rua = null;
		bairro = null;
		cep = null;
		complemento = null;
		telefone = null;
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
			TestemunhaKey key = (TestemunhaKey) ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_testemunhas ?");
		    stmt.setInt(1,key.testemunha);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
				testemunha 	= rs.getInt("testemunha");
				acidente	= new AcidenteKey(rs.getInt("acidente"));
				
				if(rs.getInt("municipio") >0)
					municipio = new MunicipioKey(rs.getInt("municipio"));


				nome		= rs.getString("nome");
				numero		= rs.getInt("numero");
				rua			= rs.getString("rua");
				bairro		= rs.getString("bairro");
				cep			= rs.getString("cep");
				complemento	= rs.getString("complemento");
				telefone	= rs.getString("telefone");
				ddd			= rs.getString("ddd");
	    			    	
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
				atualiza = false;						
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
			TestemunhaKey key = (TestemunhaKey) ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_excluir_testemunhas ?");
		    stmt.setInt(1,key.testemunha);
	    	int r = stmt.executeUpdate();
		    if(r == 0)
	    	{
			   throw new EJBException("TestemunhaBean ejbRemove");
		    }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new EJBException("TestemunhaBean ejbRemove");
		}
		finally
		{
			try{
				atualiza = false;						
				conn.close();
			}
			catch(SQLException e)
			{
				throw new EJBException("TestemunhaBean ejbRemove");
			}
		}
				
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {

		Connection conn = null;
	
		if(atualiza){
			try{
				conn = Conexao.getConnection();
				TestemunhaKey key = (TestemunhaKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_gravar_testemunhas ?,?,?,?,?,?,?,?,?,?,?");
	
			    stmt.setInt(1,key.testemunha);
			    stmt.setInt(2,acidente.acidente);
			    
			    if(municipio != null)		    
					stmt.setInt(3,municipio.municipio);
				else
					stmt.setNull(3,Types.INTEGER);

				stmt.setString(4,nome);
				
				if(numero > 0)
					stmt.setInt(5,numero);
				else
					stmt.setNull(5,Types.INTEGER);
					
				stmt.setString(6,rua);
				stmt.setString(7,bairro);
				stmt.setString(8,cep);
				stmt.setString(9,complemento);
				stmt.setString(10,telefone);
				stmt.setString(11,ddd);
				
			    int rs = stmt.executeUpdate();
			    
			    if(rs != 1){
			    	throw new EJBException("TestemunhaBean ejbStore rs: "+rs);
			    }
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new EJBException("TestemunhaBean ejbStore");
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){throw new EJBException("TestemunhaBean ejbStore");}
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
	public TestemunhaKey ejbCreate(int 	acidente,
									int 	municipio,
									String	nome,
									int	numero,
									String	rua,
									String	bairro,
									String	cep,
									String	complemento,
									String	telefone,
									String	ddd)
		throws javax.ejb.CreateException {
			
			Connection 			conn 	= null;			
			TestemunhaKey	retVal  = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_gravar_testemunhas null,?,?,?,?,?,?,?,?,?,?");
				
				stmt.setInt(1,acidente);
				
				if(municipio > 0)
				    stmt.setInt(2,municipio);
				else
					stmt.setNull(2,Types.INTEGER);

			    stmt.setString(3,nome);
			    
			    if(numero != 0)
				    stmt.setInt(4,numero);
				else
					stmt.setNull(4,Types.INTEGER);

			    stmt.setString(5,rua);
			    stmt.setString(6,bairro);
			    stmt.setString(7,cep);
			    stmt.setString(8,complemento);
			    stmt.setString(9,telefone);
			    stmt.setString(10,ddd);

				ResultSet rs = stmt.executeQuery();

				if(rs.next())
					testemunha = rs.getInt("testemunha");
				else
					throw new EJBException("TestemunhaBean ejbCreate");

				setAcidente(new AcidenteKey(acidente));
				
				if(municipio > 0 )
				    setMunicipio(new MunicipioKey(municipio));

			    setNome(nome);
			    setNumero(numero);			    
			    setRua(rua);
			    setBairro(bairro);
			    setCep(cep);
			    setComplemento(complemento);
			    setTelefone(telefone);
			    setDdd(ddd);
				    
				retVal = new TestemunhaKey(testemunha);
			}catch(SQLException e){
				System.out.println("****************************");
				System.out.println("******Testemunha Bean *****");
				e.printStackTrace();
				System.out.println("****************************");				
				throw new CreateException("TestemunhaBean ejbCreate " + e.getMessage());
			}
			
			finally{
				try{
					atualiza = false;
					conn.close();
				}
				catch(SQLException e){
				e.printStackTrace();					
					throw new CreateException("TestemunhaBean ejbCreate "  + e.getMessage());					
				}
			}
			
			return retVal;

	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate(int 	acidente,
								int 	municipio,
								String	nome,
								int	numero,
								String	rua,
								String	bairro,
								String	cep,
								String	complemento,
								String	telefone,
								String	ddd) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public TestemunhaKey ejbFindByPrimaryKey(
		TestemunhaKey key)
		throws javax.ejb.FinderException {
			
		Connection conn = null;
			
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement(" exec sp_smat_listar_testemunhas ?,null");
				stmt.setInt(1,key.testemunha);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("TestemunhaBean ejbFindByPrimaryKey => Testemunha not found");
			}
			catch(SQLException e){
					throw new FinderException("TestemunhaBean ejbFindByPrimaryKey => Testemunha not found SQLException");
			}
			finally{
				try{			
					atualiza = false;							
					conn.close();
				}
				catch(Exception e){}
			}
	}

	public Collection ejbFindAllTestemunhas(int acidente) throws FinderException{
			Connection conn = null;
			Vector retVal = new Vector();
			
			try
			{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_testemunhas null,?");
				stmt.setInt(1,acidente);
				ResultSet rs = stmt.executeQuery();
				
				while(rs.next()){
					retVal.addElement(new TestemunhaKey(rs.getInt("testemunha")));
				}
			}
			catch(Exception e){
				e.printStackTrace();
					throw new FinderException("TestemunhaBean ejbFindAllTestemunhas => Testemunha not Found");
			}
			finally{
				try{			
					atualiza = false;							
					conn.close();
				}
				catch(Exception e){}
			}
			return retVal;
	}
	
}
