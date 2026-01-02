package br.smat.web.obj;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.agentesaude.AgenteSaudeKey;
import br.smat.ejb.empregador.EmpregadorKey;
import br.smat.ejb.fiscalizacao.Fiscalizacao;
import br.smat.ejb.fiscalizacao.FiscalizacaoHome;
import br.smat.ejb.fiscalizacao.FiscalizacaoKey;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjFiscalizacao {

	private 	int 			fiscalizacao;
	private	int			agenteSaude;
	private	int			empregador;
	private	String			dataAbertura;
	private	String			dataFinalizacao;
	private	String			titulo;
	private	String			obsGerais;	
	private 	String 			docEmpregador;
	private 	String 			razaoSocial;	
	/**
	 * Constructor for ObjFiscalizacao.
	 */
	public ObjFiscalizacao() {
		super();
	}
	public ObjFiscalizacao(int fiscalizacao){
		this.fiscalizacao = fiscalizacao;
	}
	
	public ObjFiscalizacao(int 			fiscalizacao,
							int			agenteSaude,
							int			empregador,	
							String			dataAbertura,
							String			dataFinalizacao,
							String			titulo,
							String			obsGerais){
								
			setFiscalizacao(fiscalizacao);
			setAgenteSaude(agenteSaude);
			setEmpregador(empregador);
			setDataAbertura(dataAbertura);
			setDataFinalizacao(dataFinalizacao);
			setTitulo(titulo);
			setObsGerais(obsGerais);
	}	

	public void save() throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			FiscalizacaoHome 	home = (FiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/fiscalizacao/FiscalizacaoHome");
			Fiscalizacao 		fiscalizacaoH = null;		
			
			if(this.fiscalizacao == 0){
				fiscalizacaoH = home.create(agenteSaude,empregador,titulo,obsGerais);	
				
				this.fiscalizacao = fiscalizacaoH.getFiscalizacao();
			}
			else{
				fiscalizacaoH = home.findByPrimaryKey(new FiscalizacaoKey(this.fiscalizacao));

				fiscalizacaoH.setAgenteSaude(new AgenteSaudeKey(agenteSaude));
				fiscalizacaoH.setEmpregador(new EmpregadorKey(empregador));
				fiscalizacaoH.setDataFinalizacao(dataFinalizacao);
				fiscalizacaoH.setTitulo(titulo);
				fiscalizacaoH.setObsGerais(obsGerais);
			}
			
			
		} catch (RemoteException e) {
				throw new  Exception("ObjFiscalizacao RemoteException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (NamingException e) {
				throw new  Exception("ObjFiscalizacao NamingException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (CreateException e) {
				throw new  Exception("ObjFiscalizacao CreateException Erro ao inserir fiscalização " + e.getMessage());							
		} catch (FinderException e) {
				throw new  Exception("ObjFiscalizacao FinderException Erro ao inserir fiscalização " + e.getMessage());							
		}		
	}
	
	public void finalizaInvestigacao() throws Exception{
		try {
			InitialContext ctx = new InitialContext();
					
			FiscalizacaoHome 	home = (FiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/fiscalizacao/FiscalizacaoHome");
			Fiscalizacao 		fiscalizacaoH = null;		

			fiscalizacaoH = home.findByPrimaryKey(new FiscalizacaoKey(this.fiscalizacao));

			fiscalizacaoH.setDataFinalizacao("FINALIZA");			
			
		} catch (RemoteException e) {
				throw new  Exception("ObjFiscalizacao RemoteException finalizaInvestigacao " + e.getMessage());							
		} catch (NamingException e) {
				throw new  Exception("ObjFiscalizacao NamingException finalizaInvestigacao " + e.getMessage());							
		} catch (FinderException e) {
				throw new  Exception("ObjFiscalizacao FinderException finalizaInvestigacao " + e.getMessage());							
		}		
	}	
	
	public void remove()  throws Exception{
		
		if(fiscalizacao > 0){
			try{
			
				InitialContext ctx = new InitialContext();
						
				FiscalizacaoHome 	home = (FiscalizacaoHome)ctx.lookup("ejb/br/smat/ejb/fiscalizacao/FiscalizacaoHome");
				Fiscalizacao 		fiscalizacaoH = null;		
					
				fiscalizacaoH = home.findByPrimaryKey(new FiscalizacaoKey(this.fiscalizacao));
				
				fiscalizacaoH.remove();			
				
			} catch (RemoteException e) {
				throw new  Exception("ObjFiscalizacao RemoteException Erro ao remover fiscalização " + e.getMessage());											
			} catch (RemoveException e) {				
				throw new  Exception("ObjFiscalizacao RemoveException Erro ao remover fiscalização " + e.getMessage());											
			} catch (NamingException e) {
				throw new  Exception("ObjFiscalizacao NamingException Erro ao remover fiscalização " + e.getMessage());											
			} catch (FinderException e) {
				throw new  Exception("ObjFiscalizacao FinderException Erro ao remover fiscalização " + e.getMessage());											
			}				
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
	 * Returns the dataAbertura.
	 * @return String
	 */
	public String getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * Returns the dataFinalizacao.
	 * @return String
	 */
	public String getDataFinalizacao() {
		return dataFinalizacao;
	}

	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() {
		return empregador;
	}

	/**
	 * Returns the fiscalizacao.
	 * @return int
	 */
	public int getFiscalizacao() {
		return fiscalizacao;
	}

	/**
	 * Returns the obsGerais.
	 * @return String
	 */
	public String getObsGerais() {
		return obsGerais;
	}

	/**
	 * Returns the titulo.
	 * @return String
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(int agenteSaude) {
		this.agenteSaude = agenteSaude;
	}

	/**
	 * Sets the dataAbertura.
	 * @param dataAbertura The dataAbertura to set
	 */
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	/**
	 * Sets the dataFinalizacao.
	 * @param dataFinalizacao The dataFinalizacao to set
	 */
	public void setDataFinalizacao(String dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(int empregador) {
		this.empregador = empregador;
	}

	/**
	 * Sets the fiscalizacao.
	 * @param fiscalizacao The fiscalizacao to set
	 */
	public void setFiscalizacao(int fiscalizacao) {
		this.fiscalizacao = fiscalizacao;
	}

	/**
	 * Sets the obsGerais.
	 * @param obsGerais The obsGerais to set
	 */
	public void setObsGerais(String obsGerais) {
		this.obsGerais = obsGerais;
	}

	/**
	 * Sets the titulo.
	 * @param titulo The titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Returns the docEmpregador.
	 * @return String
	 */
	public String getDocEmpregador() {
		return docEmpregador;
	}

	/**
	 * Returns the razaoSocial.
	 * @return String
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * Sets the docEmpregador.
	 * @param docEmpregador The docEmpregador to set
	 */
	public void setDocEmpregador(String docEmpregador) {
		this.docEmpregador = docEmpregador;
	}

	/**
	 * Sets the razaoSocial.
	 * @param razaoSocial The razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
