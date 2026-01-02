package br.smat.web.obj;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.controleacesso.ejb.usuario.UsuarioHome;
import br.smat.controleacesso.ejb.usuario.UsuarioKey;
import br.smat.ejb.agentesaude.AgenteSaudeKey;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjUsuario {

	private int usuario;
	private String nome;
	private String senha;
	private int agenteSaude;	
	
	private ObjUsuario(){
		super();
	}

	public ObjUsuario(int usuario){
		super();
		this.usuario 		= usuario;	
	}

	public ObjUsuario(int usuario,String nome,String senha,int agenteSaude){
		super();
		this.usuario 		= usuario;
		this.nome 			= nome;
		this.senha 		= senha;
		this.agenteSaude 	= agenteSaude;
	}
	
	public void save()  throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			UsuarioHome home = (UsuarioHome)ctx.lookup("ejb/br/smat/controleacesso/ejb/usuario/UsuarioHome");
			
			Usuario usuarioH = null;		
			
			if(usuario == 0){
				usuarioH = home.create(nome,senha,agenteSaude);	
				
				this.usuario = usuarioH.getUsuario();
			}
			else{
				usuarioH = home.findByPrimaryKey(new UsuarioKey(usuario));

				usuarioH.setSenha(senha);
				usuarioH.setNome(nome);
				
				if(agenteSaude > 0)
					usuarioH.setAgenteSaude(new AgenteSaudeKey(agenteSaude));				
				else
					usuarioH.setAgenteSaude(null);				
			}
			
			
		} catch (RemoteException e) {
			throw new Exception("ObjUsuario save RemoteException=> " + e.getMessage());						
		} catch (NamingException e) {
			throw new Exception("ObjUsuario save NamingException=> " + e.getMessage());						
		} catch (CreateException e) {
			throw new Exception("ObjUsuario save CreateException=> " + e.getMessage());						
		} catch (FinderException e) {
			throw new Exception("ObjUsuario save FinderException=> " + e.getMessage());						
		}		
	}
	
	public void remove() throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			UsuarioHome home = (UsuarioHome)ctx.lookup("ejb/br/smat/controleacesso/ejb/usuario/UsuarioHome");
			
			Usuario usuarioH = home.findByPrimaryKey(new UsuarioKey(usuario));
	
			usuarioH.remove();

		} catch (RemoteException e) {
			throw new Exception("ObjUsuario remove RemoteException=> " + e.getMessage());
		} catch (NamingException e) {
			throw new Exception("ObjUsuario remove NamingException=> " + e.getMessage());			
		} catch (FinderException e) {
			throw new Exception("ObjUsuario remove FinderException=> " + e.getMessage());			
		} catch (RemoveException e) {
			throw new Exception("ObjUsuario remove RemoteException=> " + e.getMessage());			
		} catch (Exception e) {			
			throw new Exception("ObjUsuario remove Exception=> " + e.getMessage());			
		} 		
	}

	public static Usuario findByPrimaryKey(int usuario) throws Exception{		
			InitialContext ctx;
			Usuario usuarioH;
			
			try {
				ctx = new InitialContext();
				UsuarioHome home = (UsuarioHome)ctx.lookup("ejb/br/smat/controleacesso/ejb/usuario/UsuarioHome");

				usuarioH = (Usuario)home.findByPrimaryKey(new UsuarioKey(usuario));

			}catch (NamingException e) {
				System.out.println("ObjUsuario ejbFindByNomeSenha NamingException=> " + e.getMessage());
				throw new Exception("ObjUsuario ejbFindByNomeSenha NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				System.out.println(" ObjUsuario ejbFindByNomeSenha RemoteException=> " + e.getMessage());
				throw new Exception(" ObjUsuario ejbFindByNomeSenha RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjUsuario ejbFindByNomeSenha FinderException=> " + e.getMessage());
			} catch (Exception e) {
				System.out.println("ObjUsuario ejbFindByNomeSenha FinderException=> " + e.getMessage());				
						throw new Exception("ObjUsuario ejbFindByNomeSenha Exception=> " + e.getMessage());
			}
			
			return usuarioH;			
	}	
	
	public static Usuario findByNomeSenha(String nome, String senha) throws Exception{		
			InitialContext ctx;
			Usuario usuario;
			
			try {
				ctx = new InitialContext();
				UsuarioHome home = (UsuarioHome)ctx.lookup("ejb/br/smat/controleacesso/ejb/usuario/UsuarioHome");
				System.out.println(home.getClass().getName());
				usuario = (Usuario)home.findByNomeSenha(nome,senha);
				System.out.println(usuario.getClass().getName());
			}catch (NamingException e) {
				System.out.println("ObjUsuario ejbFindByNomeSenha NamingException=> " + e.getMessage());
				throw new Exception("ObjUsuario ejbFindByNomeSenha NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				System.out.println(" ObjUsuario ejbFindByNomeSenha RemoteException=> " + e.getMessage());
				throw new Exception(" ObjUsuario ejbFindByNomeSenha RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjUsuario ejbFindByNomeSenha FinderException=> " + e.getMessage());
			} catch (Exception e) {
				System.out.println("ObjUsuario ejbFindByNomeSenha FinderException=> " + e.getMessage());				
						throw new Exception("ObjUsuario ejbFindByNomeSenha Exception=> " + e.getMessage());
			}
			
			return usuario;			
	}	
	
	public static Usuario[] findAll() throws Exception{		
			InitialContext ctx;
			Usuario[] usuario;
			
			try {
				ctx = new InitialContext();
				UsuarioHome home = (UsuarioHome)ctx.lookup("ejb/br/smat/controleacesso/ejb/usuario/UsuarioHome");

				usuario = (Usuario[])home.findAll().toArray(new Usuario[0]);

			}catch (NamingException e) {
				System.out.println("ObjUsuario ejbFindByNomeSenha NamingException=> " + e.getMessage());
				throw new Exception("ObjUsuario ejbFindByNomeSenha NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				System.out.println(" ObjUsuario ejbFindByNomeSenha RemoteException=> " + e.getMessage());
				throw new Exception(" ObjUsuario ejbFindByNomeSenha RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjUsuario ejbFindByNomeSenha FinderException=> " + e.getMessage());
			} catch (Exception e) {
				System.out.println("ObjUsuario ejbFindByNomeSenha FinderException=> " + e.getMessage());				
						throw new Exception("ObjUsuario ejbFindByNomeSenha Exception=> " + e.getMessage());
			}
			
			return usuario;			
	}	


	/**
	 * Returns the agenteSaude.
	 * @return int
	 */
	public int getAgenteSaude() {
		return agenteSaude;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the senha.
	 * @return String
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * Returns the usuario.
	 * @return int
	 */
	public int getUsuario() {
		return usuario;
	}

	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(int agenteSaude) {
		this.agenteSaude = agenteSaude;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the senha.
	 * @param senha The senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * Sets the usuario.
	 * @param usuario The usuario to set
	 */
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

}
