package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Collection;

import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.agentecausador.AgenteCausador;
import br.smat.ejb.agentecausador.AgenteCausadorHome;
import br.smat.ejb.agentecausador.AgenteCausadorKey;
import br.smat.util.FuncoesComuns;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjAgenteCausador {

	private int 	agenteCausador;
	private String nome;
	private int 	agenteCausadorPai;
	private String descricao;
	
	/**
	 * Constructor for AgenteCausador.
	 */
	public ObjAgenteCausador(int 	agenteCausador,
							  String nome,
							  int 	agenteCausadorPai,
							  String descricao) {
		setAgenteCausador(agenteCausador);
		setNome(nome);
		setAgenteCausadorPai(agenteCausadorPai);
		setDescricao(descricao);
	}

	public void save() throws Exception{

		InitialContext ctx;
		AgenteCausador agente = null;
		try {
			ctx = new InitialContext();
			AgenteCausadorHome home = (AgenteCausadorHome)ctx.lookup("ejb/br/smat/ejb/agentecausador/AgenteCausadorHome");
			
			if(agenteCausador == 0){
				agente = home.create(nome,FuncoesComuns.setNullSeVazio(descricao),agenteCausadorPai);
				agenteCausador = agente.getAgenteCausador();				
			}else{
				agente =  (AgenteCausador)home.findByPrimaryKey(new AgenteCausadorKey(agenteCausador));
				
				agente.setNome(FuncoesComuns.setNullSeVazio(nome));
				agente.setDescricao(FuncoesComuns.setNullSeVazio(descricao));

//				if(agenteCausadorPai != 0)
//					agente.setAgenteCausadorPai(new AgenteCausadorKey(agenteCausadorPai));
			}
		}catch (NamingException e) {
			throw new Exception("ObjAgenteCausador findByPrimaryKey NamingException=> " + e.getMessage());
		}catch (RemoteException e) {
			throw new Exception(" ObjAgenteCausador findByPrimaryKey RemoteException=> " + e.getMessage());
		} catch (FinderException e) {
			throw new Exception("ObjAgenteCausador findByPrimaryKey FinderException=> " + e.getMessage());
		} catch (Exception e) {
					throw new Exception("ObjAgenteCausador findByPrimaryKey Exception=> " + e.getMessage());
		}	
	}

	public static AgenteCausador findByPrimaryKey(int agenteCausador) throws Exception{		
			InitialContext ctx;
			AgenteCausador col = null;
			try {
				ctx = new InitialContext();
				AgenteCausadorHome home = (AgenteCausadorHome)ctx.lookup("ejb/br/smat/ejb/agentecausador/AgenteCausadorHome");
				col = (AgenteCausador)home.findByPrimaryKey(new AgenteCausadorKey(agenteCausador));
			}catch (NamingException e) {
				throw new Exception("ObjAgenteCausador findByPrimaryKey NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjAgenteCausador findByPrimaryKey RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjAgenteCausador findByPrimaryKey FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjAgenteCausador findByPrimaryKey Exception=> " + e.getMessage());
			}								

			return col;			 		
	}

	public static Collection findAllAgentesCausadores() throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				AgenteCausadorHome home = (AgenteCausadorHome)ctx.lookup("ejb/br/smat/ejb/agentecausador/AgenteCausadorHome");
				col = (Collection)home.findAllAgentesCausadores();
			}catch (NamingException e) {
				throw new Exception("ObjAgenteCausador findAllAgentesCausadores NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjAgenteCausador findAllAgentesCausadores RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjAgenteCausador findAllAgentesCausadores FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjAgenteCausador findAllAgentesCausadores Exception=> " + e.getMessage());
			}
			return col;			 		
	}	
	
	public static Collection findAllAgentesCausadores(int pai) throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				AgenteCausadorHome home = (AgenteCausadorHome)ctx.lookup("ejb/br/smat/ejb/agentecausador/AgenteCausadorHome");
				col = (Collection)home.findAllAgentesCausadores(pai);
			}catch (NamingException e) {
				throw new Exception("ObjAgenteCausador findAllAgentesCausadores NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjAgenteCausador findAllAgentesCausadores RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjAgenteCausador findAllAgentesCausadores FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjAgenteCausador findAllAgentesCausadores Exception=> " + e.getMessage());
			}
			return col;			 		
	}

	public static Collection findAllAgentesCausadoresNot(int agenteCausador,int AgenteCausadorPai) throws Exception{		
			InitialContext ctx;
			Collection col = null;
			try {
				ctx = new InitialContext();
				AgenteCausadorHome home = (AgenteCausadorHome)ctx.lookup("ejb/br/smat/ejb/agentecausador/AgenteCausadorHome");
				col = (Collection)home.findAllAgentesCausadoresNot(agenteCausador,AgenteCausadorPai);
			}catch (NamingException e) {
				throw new Exception("ObjAgenteCausador findAllAgentesCausadoresNot NamingException=> " + e.getMessage());
			}catch (RemoteException e) {
				throw new Exception(" ObjAgenteCausador findAllAgentesCausadoresNot RemoteException=> " + e.getMessage());
			} catch (FinderException e) {
				throw new Exception("ObjAgenteCausador findAllAgentesCausadoresNot FinderException=> " + e.getMessage());
			} catch (Exception e) {
						throw new Exception("ObjAgenteCausador findAllAgentesCausadoresNot Exception=> " + e.getMessage());
			}
			return col;			 		
	}			
	/**
	 * Returns the agenteCausador.
	 * @return int
	 */
	public int getAgenteCausador() {
		return agenteCausador;
	}

	/**
	 * Returns the agenteCausadorPai.
	 * @return int
	 */
	public int getAgenteCausadorPai() {
		return agenteCausadorPai;
	}

	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the agenteCausador.
	 * @param agenteCausador The agenteCausador to set
	 */
	public void setAgenteCausador(int agenteCausador) {
		this.agenteCausador = agenteCausador;
	}

	/**
	 * Sets the agenteCausadorPai.
	 * @param agenteCausadorPai The agenteCausadorPai to set
	 */
	public void setAgenteCausadorPai(int agenteCausadorPai) {
		this.agenteCausadorPai = agenteCausadorPai;
	}

	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

}
