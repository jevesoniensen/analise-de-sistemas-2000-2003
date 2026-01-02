package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.ramoatividade.RamoAtividade;
import br.smat.ejb.ramoatividade.RamoAtividadeHome;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjRamoAtividade {

	private int 				ramoAtividade;
	private String				nome;
	private int 				cnae;
	private int 				ramoSuperior;
	
	public ObjRamoAtividade(){
	}

	public ObjRamoAtividade(	int 	ramoAtividade,
							 	String 	nome,
							 	int	cnae,
								int	ramoSuperior) {
		super();
		this.ramoAtividade		= ramoAtividade;
		this.nome				= nome;
		this.cnae				= cnae;
		this.ramoSuperior		= ramoSuperior;
	}

	public ObjRamoAtividade(	int 	ramoAtividade) {
		super();
		this.ramoAtividade		= ramoAtividade;
	}	

	public static RamoAtividade findByPrimaryKey(int ramoAtividade) throws Exception{		
			InitialContext ctx;
			RamoAtividade col = null;
			try {
				ctx = new InitialContext();
				RamoAtividadeHome home = (RamoAtividadeHome)ctx.lookup("ejb/br/smat/ejb/ramoatividade/RamoAtividadeHome");
					try {
						col = (RamoAtividade)home.findByPrimaryKey(new RamoAtividadeKey(ramoAtividade));
					} catch (RemoteException e) {
						throw new Exception(" ObjRamoAtividade findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjRamoAtividade findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjRamoAtividade findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjRamoAtividade findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public static Collection findAllRamosAtividade(int ramoSuperior) throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				RamoAtividadeHome home = (RamoAtividadeHome)ctx.lookup("ejb/br/smat/ejb/ramoatividade/RamoAtividadeHome");
					try {
						col = (Collection)home.findAllRamosAtividade(ramoSuperior);
					}  catch (RemoteException e) {
						throw new Exception(" ObjRamoAtividade findAllRamosAtividade RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjRamoAtividade findAllRamosAtividade FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjRamoAtividade findAllRamosAtividade Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjRamoAtividade findAllRamosAtividade NamingException=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public void save()  throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			RamoAtividadeHome home = (RamoAtividadeHome)ctx.lookup("ejb/br/smat/ejb/ramoatividade/RamoAtividadeHome");
			
			RamoAtividade ramoAtividadeH= null;		
			
			if(ramoAtividade == 0){
				ramoAtividadeH = home.create(nome,cnae,ramoSuperior);	
				
				this.ramoAtividade = ramoAtividadeH.getRamoAtividade();
			}
			else{
				ramoAtividadeH = home.findByPrimaryKey(new RamoAtividadeKey(ramoAtividade));

				ramoAtividadeH.setCnae(cnae);
				ramoAtividadeH.setNome(nome);
			}
			
			
		} catch (RemoteException e) {
			throw new Exception("ObjRamoAtividade save RemoteException=> " + e.getMessage());						
		} catch (NamingException e) {
			throw new Exception("ObjRamoAtividade save NamingException=> " + e.getMessage());						
		} catch (CreateException e) {
			throw new Exception("ObjRamoAtividade save CreateException=> " + e.getMessage());						
		} catch (FinderException e) {
			throw new Exception("ObjRamoAtividade save FinderException=> " + e.getMessage());						
		}		
	}
	
	public void remove() throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			RamoAtividadeHome home = (RamoAtividadeHome)ctx.lookup("ejb/br/smat/ejb/ramoatividade/RamoAtividadeHome");
			
			RamoAtividade ramoAtividadeH = home.findByPrimaryKey(new RamoAtividadeKey(ramoAtividade));
	
			ramoAtividadeH.remove();

		} catch (RemoteException e) {
			throw new Exception("ObjRamoAtividade remove RemoteException=> " + e.getMessage());
		} catch (NamingException e) {
			throw new Exception("ObjRamoAtividade remove NamingException=> " + e.getMessage());			
		} catch (FinderException e) {
			throw new Exception("ObjRamoAtividade remove FinderException=> " + e.getMessage());			
		} catch (RemoveException e) {
			throw new Exception("ObjRamoAtividade remove RemoteException=> " + e.getMessage());			
		} catch (Exception e) {			
			throw new Exception("ObjRamoAtividade remove Exception=> " + e.getMessage());			
		} 		
	}	
	
	/**
	 * Returns the cnae.
	 * @return int
	 */
	public int getCnae() {
		return cnae;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the ramoAtividade.
	 * @return int
	 */
	public int getRamoAtividade() {
		return ramoAtividade;
	}

	/**
	 * Returns the ramoSuperior.
	 * @return int
	 */
	public int getRamoSuperior() {
		return ramoSuperior;
	}

	/**
	 * Sets the cnae.
	 * @param cnae The cnae to set
	 */
	public void setCnae(int cnae) {
		this.cnae = cnae;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the ramoAtividade.
	 * @param ramoAtividade The ramoAtividade to set
	 */
	public void setRamoAtividade(int ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	/**
	 * Sets the ramoSuperior.
	 * @param ramoSuperior The ramoSuperior to set
	 */
	public void setRamoSuperior(int ramoSuperior) {
		this.ramoSuperior = ramoSuperior;
	}

}
