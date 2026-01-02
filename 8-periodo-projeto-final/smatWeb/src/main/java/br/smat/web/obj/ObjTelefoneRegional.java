package br.smat.web.obj;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.regional.RegionalKey;
import br.smat.ejb.telefoneregional.TelefoneRegional;
import br.smat.ejb.telefoneregional.TelefoneRegionalHome;
import br.smat.ejb.telefoneregional.TelefoneRegionalKey;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjTelefoneRegional {

	private int telefoneRegional;
	private int regional;
	private String descricao;
	private String numero;
	private String	ddd;
	
	/**
	 * Constructor for TelefoneRegional.
	 */
	public ObjTelefoneRegional() {
		super();
	}

	public ObjTelefoneRegional(	int 	telefoneRegional,
								int 	regional,
								String 	descricao,
								String 	numero,
								String	ddd) {
		super();
		this.telefoneRegional = telefoneRegional;
		this.regional = regional;
		this.descricao	= descricao;
		this.numero = numero;
		this.ddd = ddd;
	}

	public ObjTelefoneRegional(int 	telefoneRegional,
								int 	regional) {
		super();
		this.telefoneRegional = telefoneRegional;
		this.regional = regional;
	}
	
	public static TelefoneRegional findByPrimaryKey(int regional,int telefone) throws Exception{		
			InitialContext ctx;
			TelefoneRegional telefoneRegional = null;
			try {
				ctx = new InitialContext();
				TelefoneRegionalHome home = (TelefoneRegionalHome)ctx.lookup("ejb/br/smat/ejb/telefoneregional/TelefoneRegionalHome");
				telefoneRegional = home.findByPrimaryKey(new  TelefoneRegionalKey(telefone,new RegionalKey(regional)));
			}catch (NamingException e) {
				throw new Exception("ObjTelefoneRegional findByPrimaryKey NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjTelefoneRegional findByPrimaryKey RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjTelefoneRegional findByPrimaryKey FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjTelefoneRegional findByPrimaryKey Exception=> " + e.getMessage());
			}
			return telefoneRegional;			 		
	}	
	
	public static TelefoneRegional[] findAll(int regional) throws Exception{		
			InitialContext ctx;
			TelefoneRegional[] col = null;
			try {
				ctx = new InitialContext();
				TelefoneRegionalHome home = (TelefoneRegionalHome)ctx.lookup("ejb/br/smat/ejb/telefoneregional/TelefoneRegionalHome");
				col = (TelefoneRegional[])home.findAllTelefonesRegionais(regional).toArray(new TelefoneRegional[0]);
			}catch (NamingException e) {
				throw new Exception("ObjTelefoneRegional findAllLocaisLesao NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjTelefoneRegional findAllLocaisLesao RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjTelefoneRegional findAllLocaisLesao FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjTelefoneRegional findAllLocaisLesao Exception=> " + e.getMessage());
			}
			return col;			 		
	}	

	public void save()  throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
				TelefoneRegionalHome home = (TelefoneRegionalHome)ctx.lookup("ejb/br/smat/ejb/telefoneregional/TelefoneRegionalHome");
			
			TelefoneRegional telefoneRegionalH = null;		
			
			if(this.telefoneRegional == 0){
				telefoneRegionalH = home.create(regional,descricao,numero,ddd);	
				
				this.telefoneRegional = telefoneRegionalH.getTelefoneRegional();
				System.out.println("gravei iiiiiiiiiiii");
			}
			else{
				telefoneRegionalH = home.findByPrimaryKey(new TelefoneRegionalKey(telefoneRegional,new RegionalKey(regional)));

				telefoneRegionalH.setDdd(ddd);
				telefoneRegionalH.setDescricao(descricao);
				telefoneRegionalH.setNumero(numero);
			}
			
			
		} catch (RemoteException e) {
			throw new Exception("ObjTelefoneRegional save RemoteException=> " + e.getMessage());						
		} catch (NamingException e) {
			throw new Exception("ObjTelefoneRegional save NamingException=> " + e.getMessage());						
		} catch (CreateException e) {
			throw new Exception("ObjTelefoneRegional save CreateException=> " + e.getMessage());						
		} catch (FinderException e) {
			throw new Exception("ObjTelefoneRegional save FinderException=> " + e.getMessage());						
		}		
	}
	
	public void remove() throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
				TelefoneRegionalHome home = (TelefoneRegionalHome)ctx.lookup("ejb/br/smat/ejb/telefoneregional/TelefoneRegionalHome");
			
			TelefoneRegional telefoneRegionalH = home.findByPrimaryKey(new TelefoneRegionalKey(telefoneRegional,new RegionalKey(regional)));
	
			telefoneRegionalH.remove();

		} catch (RemoteException e) {
			throw new Exception("ObjTelefoneRegional remove RemoteException=> " + e.getMessage());
		} catch (NamingException e) {
			throw new Exception("ObjTelefoneRegional remove NamingException=> " + e.getMessage());			
		} catch (FinderException e) {
			throw new Exception("ObjTelefoneRegional remove FinderException=> " + e.getMessage());			
		} catch (RemoveException e) {
			throw new Exception("ObjTelefoneRegional remove RemoteException=> " + e.getMessage());			
		} catch (Exception e) {			
			throw new Exception("ObjTelefoneRegional remove Exception=> " + e.getMessage());			
		} 		
	}
	
	
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
	 * Returns the numero.
	 * @return String
	 */
	public String getNumero() {
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
	 * Returns the telefoneRegional.
	 * @return int
	 */
	public int getTelefoneRegional() {
		return telefoneRegional;
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
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(String numero) {
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
	 * Sets the telefoneRegional.
	 * @param telefoneRegional The telefoneRegional to set
	 */
	public void setTelefoneRegional(int telefoneRegional) {
		this.telefoneRegional = telefoneRegional;
	}


}
