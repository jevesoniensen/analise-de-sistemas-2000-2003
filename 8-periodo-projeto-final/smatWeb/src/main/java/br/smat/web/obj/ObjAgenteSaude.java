package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.agentesaude.AgenteSaude;
import br.smat.ejb.agentesaude.AgenteSaudeHome;
import br.smat.ejb.agentesaude.AgenteSaudeKey;
import br.smat.ejb.regional.RegionalKey;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjAgenteSaude {
	
	
	private int 	agenteSaude;
	private int 	regional;
	private String nome;
	private String email;

	/**
	 * Constructor for ObjAgenteSaude.
	 */
	public ObjAgenteSaude() {
		super();
	}

	public ObjAgenteSaude(	int 	agenteSaude) {
		super();
		this.agenteSaude 	= agenteSaude;
	}

	public ObjAgenteSaude(	int 	agenteSaude,
							int 	regional,
							String 	nome,
							String 	email) {
		super();
		this.agenteSaude 	= agenteSaude;
		this.regional 		= regional;
		this.nome			= nome;
		this.email			= email;		
	}
	
	public static Collection findAllAgentesSaude() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				AgenteSaudeHome home = (AgenteSaudeHome)ctx.lookup("ejb/br/smat/ejb/agentesaude/AgenteSaudeHome");
					try {
						col = (Collection)home.findAllAgentesSaude();
					} catch (RemoteException e) {
						throw new Exception(" ObjAgenteSaude findAllAgentesSaude RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjAgenteSaude findAllAgentesSaude FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjAgenteSaude findAllAgentesSaude Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjAgenteSaude findAllAgentesSaude NamingException=> " + e.getMessage());
			}
			
			return col;			 		
	}

	public static AgenteSaude findByPrimaryKey(int agenteSaude) throws Exception{		
			InitialContext ctx;
	
			AgenteSaude agente = null;
			try {
				ctx = new InitialContext();
				AgenteSaudeHome home = (AgenteSaudeHome)ctx.lookup("ejb/br/smat/ejb/agentesaude/AgenteSaudeHome");
					try {
						agente = (AgenteSaude)home.findByPrimaryKey(new AgenteSaudeKey(agenteSaude));
					}  catch (RemoteException e) {
						throw new Exception(" ObjAgenteSaude findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjAgenteSaude findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjAgenteSaude findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjAgenteSaude findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return agente;			 		
	}
	
	public void save() throws Exception{
		
		try {
			InitialContext ctx = new InitialContext();
					
			AgenteSaudeHome home 		= (AgenteSaudeHome)ctx.lookup("ejb/br/smat/ejb/agentesaude/AgenteSaudeHome");
			AgenteSaude agenteSaudeH 	= null;		
			
			if(this.agenteSaude == 0){
				agenteSaudeH = home.create(nome,email,regional);	
				this.agenteSaude = agenteSaudeH.getAgenteSaude();
			}
			else{
				agenteSaudeH = home.findByPrimaryKey(new AgenteSaudeKey(agenteSaude));

				agenteSaudeH.setEmail(email);
				agenteSaudeH.setNome(nome);
				agenteSaudeH.setRegional(new RegionalKey(regional));

			}

		} catch (CreateException e) {		
			throw new Exception("ObjAgenteSaude save Exception=> " + e.getMessage());	
		} catch (RemoteException e) {
			throw new Exception("ObjAgenteSaude save Exception=> " + e.getMessage());
		} catch (NamingException e) {
			throw new Exception("ObjAgenteSaude save Exception=> " + e.getMessage());
		} catch (FinderException e) {
			throw new Exception("ObjMonObjAgenteSaudeitor save Exception=> " + e.getMessage());
		}			
	}


	public void remove() throws Exception{
		
		try {
			InitialContext ctx = new InitialContext();
					
			AgenteSaudeHome home = (AgenteSaudeHome)ctx.lookup("ejb/br/smat/ejb/agentesaude/AgenteSaudeHome");
			AgenteSaude agenteSaudeH = null;		
			
			agenteSaudeH = home.findByPrimaryKey(new AgenteSaudeKey(agenteSaude));

			agenteSaudeH.remove();
			
		} catch (RemoteException e) {
			throw new Exception("ObjAgenteSaude remove Exception=> " + e.getMessage());
		} catch (NamingException e) {
			throw new Exception("ObjAgenteSaude remove Exception=> " + e.getMessage());
		} catch (FinderException e) {
			throw new Exception("ObjAgenteSaude remove Exception=> " + e.getMessage());			
		}			
	}	
	
	/**
	 * Returns the agenteSaude.
	 * @return int
	 */
	public int getAgenteSaude() {
		return agenteSaude;
	}

	/**
	 * Returns the email.
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the regional.
	 * @return int
	 */
	public int getRegional() {
		return regional;
	}

	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(int agenteSaude) {
		this.agenteSaude = agenteSaude;
	}

	/**
	 * Sets the email.
	 * @param email The email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(int regional) {
		this.regional = regional;
	}

}
