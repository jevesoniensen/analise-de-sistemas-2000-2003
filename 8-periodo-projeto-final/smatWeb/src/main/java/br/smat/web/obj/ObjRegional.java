package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.estado.EstadoKey;
import br.smat.ejb.municipio.MunicipioKey;
import br.smat.ejb.regional.Regional;
import br.smat.ejb.regional.RegionalHome;
import br.smat.ejb.regional.RegionalKey;
import br.smat.util.FuncoesComuns;



/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjRegional {

	private int regional;
	private String nome;
	private int estado;
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private int municipio;
		
	public ObjRegional(int regional,
						String nome,
						int estado,
						String rua,
						int numero,
						String complemento,
						String bairro,
						String cep,
						int municipio) {

		setRegional(regional);
		setNome(nome);
		setEstado(estado);
		setRua(rua);
		setNumero(numero);
		setComplemento(complemento);
		setBairro(bairro);
		setCep(cep);
		setMunicipio(municipio);
	}
	
	public void save() throws Exception{
			InitialContext ctx;
			Regional r = null;
			try {
				ctx = new InitialContext();
				RegionalHome home = (RegionalHome)ctx.lookup("ejb/br/smat/ejb/regional/RegionalHome");
					try {
						
						if(regional == 0){
							
							r = home.create(municipio,estado,nome,numero,rua,bairro,cep,FuncoesComuns.setNullSeVazio(complemento));
							regional = r.getRegional();
						}
						else{
							r = home.findByPrimaryKey(new RegionalKey(regional));
							
							if(municipio != 0)
								r.setMunicipio(new MunicipioKey(municipio));
							else
								r.setMunicipio(null);

							r.setEstado(new EstadoKey(estado));
							
							r.setNome(nome);
							r.setNumero(numero);
							r.setRua(rua);
							r.setBairro(bairro);
							r.setCep(cep);
							r.setComplemento(FuncoesComuns.setNullSeVazio(complemento));
							
						}
					} catch (RemoteException e) {
						throw new Exception(" ObjRegional findAllRegionais RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjRegional findAllRegionais FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjRegional findAllRegionais Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjRegional findAllRegionais NamingException=> " + e.getMessage());
			}
	}
	
	public static Collection findAllRegionais(int estado) throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				RegionalHome home = (RegionalHome)ctx.lookup("ejb/br/smat/ejb/regional/RegionalHome");
					try {
						col = (Collection)home.findAllRegionais(estado);
					} catch (RemoteException e) {
						throw new Exception(" ObjRegional findAllRegionais RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjRegional findAllRegionais FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjRegional findAllRegionais Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjRegional findAllRegionais NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	

	public static Regional findByPrimaryKey(int regional) throws Exception{		
			InitialContext ctx;
			Regional r = null;
			try {
				ctx = new InitialContext();
				RegionalHome home = (RegionalHome)ctx.lookup("ejb/br/smat/ejb/regional/RegionalHome");
					try {
						r = (Regional)home.findByPrimaryKey(new RegionalKey(regional));
					} catch (RemoteException e) {
						throw new Exception(" ObjRegional findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjRegional findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjRegional findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjRegional findByPrimaryKey NamingException=> " + e.getMessage());
			}

			return r;
	}	
	
	/**
	 * Returns the bairro.
	 * @return String
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * Returns the cep.
	 * @return String
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Returns the complemento.
	 * @return String
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * Returns the estado.
	 * @return int
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Returns the municipio.
	 * @return int
	 */
	public int getMunicipio() {
		return municipio;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the numero.
	 * @return int
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Returns the regional.
	 * @return int
	 */
	public int getRegional() {
		return regional;
	}

	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * Sets the bairro.
	 * @param bairro The bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * Sets the cep.
	 * @param cep The cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * Sets the complemento.
	 * @param complemento The complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(int municipio) {
		this.municipio = municipio;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(int regional) {
		this.regional = regional;
	}

	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

}
