package br.smat.web.obj;

import java.net.URLEncoder;
import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.estado.Estado;
import br.smat.ejb.municipio.Municipio;
import br.smat.ejb.municipio.MunicipioKey;
import br.smat.ejb.testemunha.Testemunha;
import br.smat.ejb.testemunha.TestemunhaHome;
import br.smat.ejb.testemunha.TestemunhaKey;
import br.smat.util.FuncoesComuns;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjTestemunha {

	private int	index = 0;
	private int	acidente = 0;
	private int	testemunha = 0;	
	private String nomeTestemunha = null;
	private int 	estadoTestemunha;
	private String	nomeEstado = null;
	private int 	municipioTestemunha;
	private String nomeMunicipio;
	private String ruaTestemunha = null;
	private String bairroTestemunha = null;
	private int	numeroTestemunha = 0;
	private String complementoTestemunha = null;
	private String cepTestemunha = null;
	private String telefoneTestemunha = null;
	private String	dddTestemunha  = null;

	/**
	 * Constructor for ObjTestemunha.
	 */
	public ObjTestemunha(	
							int	index,
							int 	acidente,
						  	int	testemunha,	
						  	String 	nomeTestemunha,
							int 	estadoTestemunha,
							int     municipioTestemunha,
							String  ruaTestemunha,
							String  bairroTestemunha,
							int	numeroTestemunha,
							String  complementoTestemunha,
							String  cepTestemunha,
							String  telefoneTestemunha,
							String	dddTestemunha) {
		super();
		setIndex(index);
		setAcidente(acidente);
		setTestemunha(testemunha);
		setNomeTestemunha(nomeTestemunha);
		setEstadoTestemunha(estadoTestemunha);
		setMunicipioTestemunha(municipioTestemunha);
		setRuaTestemunha(ruaTestemunha);
		setBairroTestemunha(bairroTestemunha);
		setNumeroTestemunha(numeroTestemunha);
		setComplementoTestemunha(complementoTestemunha);
		setCepTestemunha(cepTestemunha);
		setTelefoneTestemunha(telefoneTestemunha);
		setDddTestemunha(dddTestemunha);
	}
	
	public ObjTestemunha(int acidente,
						  int estadoTestemunha,
						  int municipioTestemunha,
						  String nomeTestemunha,
						  int numeroTestemunha,
						  String ruaTestemunha,
						  String bairroTestemunha,
						  String cepTestemunha,
						  String complementoTestemunha,
						  String telefoneTestemunha,
						  String dddTestemunha){
		setAcidente(acidente);
		setEstadoTestemunha(estadoTestemunha);
		setMunicipioTestemunha(municipioTestemunha);
		setNomeTestemunha(nomeTestemunha);
		setNumeroTestemunha(numeroTestemunha);
		setRuaTestemunha(ruaTestemunha);
		setBairroTestemunha(bairroTestemunha);
		setCepTestemunha(cepTestemunha);
		setComplementoTestemunha(complementoTestemunha);
		setTelefoneTestemunha(telefoneTestemunha);
		setDddTestemunha(dddTestemunha);					
	}
	

	public void save() throws Exception{

		Testemunha tes = null;
		
		try {
			InitialContext ctx = new InitialContext();
				
			TestemunhaHome home = (TestemunhaHome)ctx.lookup("ejb/br/smat/ejb/testemunha/TestemunhaHome");
			
			if(testemunha == 0){
				tes = home.create(acidente,
								  municipioTestemunha,
								  FuncoesComuns.setNullSeVazio(nomeTestemunha),
								  numeroTestemunha,
								  FuncoesComuns.setNullSeVazio(ruaTestemunha),
								  FuncoesComuns.setNullSeVazio(bairroTestemunha),
								  FuncoesComuns.setNullSeVazio(cepTestemunha),
								  FuncoesComuns.setNullSeVazio(complementoTestemunha),
								  FuncoesComuns.setNullSeVazio(telefoneTestemunha),
								  FuncoesComuns.setNullSeVazio(dddTestemunha));

				testemunha = tes.getTestemunha();

			}else{
				tes = home.findByPrimaryKey(new TestemunhaKey(testemunha));
				
				tes.setBairro(FuncoesComuns.setNullSeVazio(bairroTestemunha));
				tes.setCep(FuncoesComuns.setNullSeVazio(cepTestemunha));
				tes.setComplemento(FuncoesComuns.setNullSeVazio(complementoTestemunha));
				tes.setDdd(dddTestemunha);
				
				if(municipioTestemunha != 0)
					tes.setMunicipio(new MunicipioKey(municipioTestemunha));
				else
					tes.setMunicipio(null);
				
				tes.setNome(FuncoesComuns.setNullSeVazio(nomeTestemunha));
				tes.setNumero(numeroTestemunha);
				tes.setRua(FuncoesComuns.setNullSeVazio(ruaTestemunha));
				tes.setTelefone(FuncoesComuns.setNullSeVazio(telefoneTestemunha));
				
				
				
			}

			
		}
		catch (RemoteException e) {
			System.out.println("****************************");
			System.out.println("****** OBJTESTEMUNHA RemoteException*****");				
		//	e.printStackTrace();
			System.out.println("****************************");					
			throw new  Exception("ObjTestemunha RemoteException Erro ao inserir investigação " + e.getMessage());
		} catch (NamingException e) {
		} catch (CreateException e) {
			System.out.println("****************************");
			System.out.println("****** OBJTESTEMUNHA CreateException*****");				
		//	e.printStackTrace();
			System.out.println("****************************");					
			//e.printStackTrace();
			throw new  Exception("ObjTestemunha CreateException Erro ao inserir investigação " + e.getMessage());				
		} catch (Exception e) {
			System.out.println("****************************");
			System.out.println("****** OBJTESTEMUNHA Exception*****");				
	//		e.printStackTrace();
			System.out.println("****************************");				
			throw new  Exception("ObjTestemunha CreateException Erro ao inserir investigação " + e.getMessage());				
		}

	}


	public static Testemunha findByPrimaryKey(int testemunha) throws Exception{		
			InitialContext ctx;
			Testemunha col = null;
			try {
				ctx = new InitialContext();
				TestemunhaHome home = (TestemunhaHome)ctx.lookup("ejb/br/smat/ejb/testemunha/TestemunhaHome");
					try {
						col = (Testemunha)home.findByPrimaryKey(new TestemunhaKey(testemunha));
					} catch (RemoteException e) {
						throw new Exception(" ObjTestemunha findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjTestemunha findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjTestemunha findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjTestemunha findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}
	
	/**
	 * Returns the acidente.
	 * @return String
	 */
	public int getAcidente() {
		return acidente;
	}

	/**
	 * Returns the bairroTestemunha.
	 * @return String
	 */
	public String getBairroTestemunha() {
		return bairroTestemunha;
	}

	/**
	 * Returns the cepTestemunha.
	 * @return String
	 */
	public String getCepTestemunha() {
		return cepTestemunha;
	}

	/**
	 * Returns the complementoTestemunha.
	 * @return String
	 */
	public String getComplementoTestemunha() {
		return complementoTestemunha;
	}

	/**
	 * Returns the estadoTestemunha.
	 * @return int
	 */
	public int getEstadoTestemunha() {
		return estadoTestemunha;
	}

	/**
	 * Returns the municipioTestemunha.
	 * @return int
	 */
	public int getMunicipioTestemunha() {
		return municipioTestemunha;
	}

	/**
	 * Returns the nomeTestemunha.
	 * @return String
	 */
	public String getNomeTestemunha() {
		return nomeTestemunha;
	}

	/**
	 * Returns the numeroTestemunha.
	 * @return String
	 */
	public int getNumeroTestemunha() {
		return numeroTestemunha;
	}

	/**
	 * Returns the ruaTestemunha.
	 * @return String
	 */
	public String getRuaTestemunha() {
		return ruaTestemunha;
	}

	/**
	 * Returns the telefoneTestemunha.
	 * @return String
	 */
	public String getTelefoneTestemunha() {
		return telefoneTestemunha;
	}

	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(int acidente) {
		this.acidente = acidente;
	}

	/**
	 * Sets the bairroTestemunha.
	 * @param bairroTestemunha The bairroTestemunha to set
	 */
	public void setBairroTestemunha(String bairroTestemunha) {
		this.bairroTestemunha = bairroTestemunha;
	}

	/**
	 * Sets the cepTestemunha.
	 * @param cepTestemunha The cepTestemunha to set
	 */
	public void setCepTestemunha(String cepTestemunha) {
		this.cepTestemunha = cepTestemunha;
	}

	/**
	 * Sets the complementoTestemunha.
	 * @param complementoTestemunha The complementoTestemunha to set
	 */
	public void setComplementoTestemunha(String complementoTestemunha) {
		this.complementoTestemunha = complementoTestemunha;
	}

	/**
	 * Sets the estadoTestemunha.
	 * @param estadoTestemunha The estadoTestemunha to set
	 */
	public void setEstadoTestemunha(int estadoTestemunha) {
		this.estadoTestemunha = estadoTestemunha;
	}

	/**
	 * Sets the municipioTestemunha.
	 * @param municipioTestemunha The municipioTestemunha to set
	 */
	public void setMunicipioTestemunha(int municipioTestemunha) {
		this.municipioTestemunha = municipioTestemunha;
	}

	/**
	 * Sets the nomeTestemunha.
	 * @param nomeTestemunha The nomeTestemunha to set
	 */
	public void setNomeTestemunha(String nomeTestemunha) {
		this.nomeTestemunha = nomeTestemunha;
	}

	/**
	 * Sets the numeroTestemunha.
	 * @param numeroTestemunha The numeroTestemunha to set
	 */
	public void setNumeroTestemunha(int numeroTestemunha) {
		this.numeroTestemunha = numeroTestemunha;
	}

	/**
	 * Sets the ruaTestemunha.
	 * @param ruaTestemunha The ruaTestemunha to set
	 */
	public void setRuaTestemunha(String ruaTestemunha) {
		this.ruaTestemunha = ruaTestemunha;
	}

	/**
	 * Sets the telefoneTestemunha.
	 * @param telefoneTestemunha The telefoneTestemunha to set
	 */
	public void setTelefoneTestemunha(String telefoneTestemunha) {
		this.telefoneTestemunha = telefoneTestemunha;
	}

	/**
	 * Returns the testemunha.
	 * @return int
	 */
	public int getTestemunha() {
		return testemunha;
	}

	/**
	 * Sets the testemunha.
	 * @param testemunha The testemunha to set
	 */
	public void setTestemunha(int testemunha) {
		this.testemunha = testemunha;
	}

	/**
	 * Returns the dddTestemunha.
	 * @return String
	 */
	public String getDddTestemunha() {
		return dddTestemunha;
	}

	/**
	 * Sets the dddTestemunha.
	 * @param dddTestemunha The dddTestemunha to set
	 */
	public void setDddTestemunha(String dddTestemunha) {
		this.dddTestemunha = dddTestemunha;
	}

	/**
	 * Returns the index.
	 * @return int
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Sets the index.
	 * @param index The index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Returns the nomeEstado.
	 * @return String
	 */
	public String getNomeEstado() throws Exception{
		
		if(nomeEstado == null){
			try {			
				Estado e = ObjEstado.findByPrimaryKey(estadoTestemunha);
				nomeEstado = e.getNome();
			} catch (RemoteException e) {
				throw new Exception(" ObjTestemunha getNomeEstado RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				throw new Exception(" ObjTestemunha getNomeEstado Exception=> " + e.getMessage());
			}	
		}
		
		return nomeEstado;
	}

	/**
	 * Returns the nomeMunicipio.
	 * @return String
	 */
	public String getNomeMunicipio() throws Exception{
		
		if(nomeMunicipio == null){
			try {			
				Municipio m = ObjMunicipio.findByPrimaryKey(municipioTestemunha);
				nomeMunicipio = m.getNome();
			} catch (RemoteException e) {
				throw new Exception(" ObjTestemunha getNomeMunicipio RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				throw new Exception(" ObjTestemunha getNomeMunicipio Exception=> " + e.getMessage());
			}
		}
		
		return nomeMunicipio;
	}
}
