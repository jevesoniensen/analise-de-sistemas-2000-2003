package br.smat.web.obj;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.agentesaude.AgenteSaude;
import br.smat.ejb.investigacao.Investigacao;
import br.smat.ejb.investigacao.InvestigacaoHome;
import br.smat.ejb.investigacao.InvestigacaoKey;
import br.smat.objetosauxiliares.auxdepoimento.AuxDepoimento;
import br.smat.objetosauxiliares.auxinvestigacao.AuxInvestigacao;
import br.smat.objetosauxiliares.auxmedidacorretiva.AuxMedidaCorretiva;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjInvestigacao {
	
	private	int			investigacao;
	private	int			agenteSaude;
	private	int			acidente;
	private	String			dataAbertura;
	private	String			dataFinalizacao;
	private	String			motivo;
	private	String			obsGerais;
	private	AuxDepoimento[]	auxDepoimento;
	private	AuxMedidaCorretiva[] auxMedidaCorretivaInvestigacao;
	
	
	public ObjInvestigacao(int agenteSaude,
							int acidente,
							String	motivo,
							String	obsGerais){

		this.agenteSaude = 	agenteSaude;
		this.acidente = 	 	acidente;
		this.dataAbertura = 	dataAbertura;
		this.motivo = motivo;
		this.obsGerais = obsGerais;
	}
	
	public ObjInvestigacao( int investigacao,
							 int agenteSaude,
							 int acidente,
							 String	dataAbertura,
							 String	dataFinalizacao,
							 String	motivo,
							 String obsGerais){

		this.investigacao = investigacao;
		this.agenteSaude = 	agenteSaude;
		this.acidente = 	 	acidente;
		this.dataAbertura = 	dataAbertura;
		this.dataFinalizacao = dataFinalizacao;
		this.motivo = motivo;
		this.obsGerais = obsGerais;
	}

	public ObjInvestigacao( int investigacao,
							 int agenteSaude,
							 int acidente,
							 String	dataAbertura,
							 String	dataFinalizacao,
							 String	motivo,
							 String obsGerais,
							 AuxDepoimento[] auxDepoimento,
							 AuxMedidaCorretiva[] auxMedidaCorretivaInvestigacao){

		this.investigacao = investigacao;
		this.agenteSaude = 	agenteSaude;
		this.acidente = 	 	acidente;
		this.dataAbertura = 	dataAbertura;
		this.dataFinalizacao = dataFinalizacao;
		this.motivo = motivo;
		this.obsGerais = obsGerais;
		this.auxDepoimento = auxDepoimento;
		this.auxMedidaCorretivaInvestigacao = auxMedidaCorretivaInvestigacao;
	}	
	public void save()  throws Exception{

		try {
			InitialContext ctx = new InitialContext();
					
			InvestigacaoHome home = (InvestigacaoHome)ctx.lookup("ejb/br/smat/ejb/investigacao/InvestigacaoHome");
			
			Investigacao inv = home.create(agenteSaude,acidente,motivo,obsGerais);

			investigacao = inv.getInvestigacao();
			dataAbertura = inv.getDataAbertura();
			dataFinalizacao = inv.getDataFinalizacao();
			

			
		}
		catch (RemoteException e) {
			System.out.println("****************************");
			System.out.println("****** OBJINVESTIGACAO RemoteException*****");				
		//	e.printStackTrace();
			System.out.println("****************************");					
			throw new  Exception("ObjInvestigacao RemoteException Erro ao inserir investigação " + e.getMessage());
		} catch (NamingException e) {
		} catch (CreateException e) {
			System.out.println("****************************");
			System.out.println("****** OBJINVESTIGACAO CreateException*****");				
		//	e.printStackTrace();
			System.out.println("****************************");					
			//e.printStackTrace();
			throw new  Exception("ObjInvestigacao CreateException Erro ao inserir investigação " + e.getMessage());				
		} catch (Exception e) {
			System.out.println("****************************");
			System.out.println("****** OBJINVESTIGACAO Exception*****");				
	//		e.printStackTrace();
			System.out.println("****************************");				
			throw new  Exception("ObjInvestigacao CreateException Erro ao inserir investigação " + e.getMessage());				
		}
	}
	
	public static ObjInvestigacao findByAcidente(int acidente)  throws Exception{

		ObjInvestigacao obj = null;

		try {
			InitialContext ctx = new InitialContext();
					
			InvestigacaoHome home = (InvestigacaoHome)ctx.lookup("ejb/br/smat/ejb/investigacao/InvestigacaoHome");
			
			Investigacao inv = home.findByAcidente(acidente);
			
			obj = new ObjInvestigacao(inv.getAgenteSaude().agenteSaude,inv.getAcidente().acidente,inv.getTitulo(),inv.getObsGerais());
			
			obj.setDataAbertura(inv.getDataAbertura());
			obj.setDataFinalizacao(inv.getDataFinalizacao());
			obj.setInvestigacao(inv.getInvestigacao());

		}
		catch (FinderException e) {
			return null;
		}
		catch (RemoteException e) {
			System.out.println("****************************");
			System.out.println("****** OBJINVESTIGACAO RemoteException*****");				
		//	e.printStackTrace();
			System.out.println("****************************");					
			throw new  Exception("ObjInvestigacao RemoteException Erro ao inserir investigação " + e.getMessage());
		} catch (NamingException e) {
		}catch (Exception e) {
			System.out.println("****************************");
			System.out.println("****** OBJINVESTIGACAO Exception*****");				
	//		e.printStackTrace();
			System.out.println("****************************");				
			throw new  Exception("ObjInvestigacao CreateException Erro ao inserir investigação " + e.getMessage());				
		}		

		return obj;	
	}
	

	public static Investigacao findByPrimaryKey(int investigacao) throws Exception{		
			InitialContext ctx;
			Investigacao retVal = null;
			try {
				ctx = new InitialContext();
				InvestigacaoHome home = (InvestigacaoHome)ctx.lookup("ejb/br/smat/ejb/investigacao/InvestigacaoHome");
					try {
						retVal = (Investigacao)home.findByPrimaryKey(new InvestigacaoKey(investigacao));
					} catch (RemoteException e) {
						throw new Exception(" ObjInvestigacao findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjInvestigacao findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjInvestigacao findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjInvestigacao findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return retVal;			 		
	}
	
	public static ObjInvestigacao getTramiteInvestigacao(int investigacao) throws Exception{
		
		AuxInvestigacao auxInvestigacao = null;
		ObjInvestigacao objInvestigacao = null;
		
		try{
			auxInvestigacao = ObjGenerico.getTramiteInvestigacao(investigacao);
		}
		catch(Exception e){
			throw new Exception("ObjInvestigacao getTramiteInvestigacao Exception=> " + e.getMessage());
		}
		
		objInvestigacao = new ObjInvestigacao(auxInvestigacao.getInvestigacao(),
											   auxInvestigacao.getAgenteSaude(),
											   auxInvestigacao.getAcidente(),
											   auxInvestigacao.getDataAbertura(),
											   auxInvestigacao.getDataFinalizacao(),
											   auxInvestigacao.getMotivo(),
											   auxInvestigacao.getObsGerais(),
											   auxInvestigacao.getAuxDepoimento(),
											   auxInvestigacao.getAuxMedidaCorretiva());
		return objInvestigacao;
		
	}
	
	public String getNomeAgenteResponsavel(){

		String nomeAgenteSaude = null;
		AgenteSaude a = null;

		if(agenteSaude != 0){
			try{
				a = ObjAgenteSaude.findByPrimaryKey(agenteSaude);
				nomeAgenteSaude = a.getNome();
			}
			catch(Exception e){
				return null;
			}
		}
		return nomeAgenteSaude;
	}						
	/**
	 * Returns the acidente.
	 * @return int
	 */
	public int getAcidente() {
		return acidente;
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
	 * Returns the investigacao.
	 * @return int
	 */
	public int getInvestigacao() {
		return investigacao;
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
	public String getMotivo() {
		return motivo;
	}

	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(int acidente) {
		this.acidente = acidente;
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
	 * Sets the investigacao.
	 * @param investigacao The investigacao to set
	 */
	public void setInvestigacao(int investigacao) {
		this.investigacao = investigacao;
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
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	/**
	 * Returns the auxDepoimento.
	 * @return AuxDepoimento
	 */
	public AuxDepoimento[] getAuxDepoimento() {
		return auxDepoimento;
	}

	/**
	 * Returns the auxMedidaCorretivaInvestigacao.
	 * @return AuxMedidaCorretiva
	 */
	public AuxMedidaCorretiva[] getAuxMedidaCorretivaInvestigacao() {
		return auxMedidaCorretivaInvestigacao;
	}

	/**
	 * Sets the auxDepoimento.
	 * @param auxDepoimento The auxDepoimento to set
	 */
	public void setAuxDepoimento(AuxDepoimento[] auxDepoimento) {
		this.auxDepoimento = auxDepoimento;
	}

	/**
	 * Sets the auxMedidaCorretivaInvestigacao.
	 * @param auxMedidaCorretivaInvestigacao The auxMedidaCorretivaInvestigacao to set
	 */
	public void setAuxMedidaCorretivaInvestigacao(AuxMedidaCorretiva[] auxMedidaCorretivaInvestigacao) {
		this.auxMedidaCorretivaInvestigacao = auxMedidaCorretivaInvestigacao;
	}

}
