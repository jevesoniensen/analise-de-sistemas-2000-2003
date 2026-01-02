package br.smat.web.obj;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.agentecausador.AgenteCausadorKey;
import br.smat.ejb.agentesaude.AgenteSaudeKey;
import br.smat.ejb.dadoinvestigacao.DadoInvestigacao;
import br.smat.ejb.dadoinvestigacao.DadoInvestigacaoHome;
import br.smat.ejb.dadoinvestigacao.DadoInvestigacaoKey;
import br.smat.ejb.representanteempresa.RepresentanteEmpresaKey;
import br.smat.ejb.testemunha.TestemunhaKey;
import br.smat.ejb.tipodepoimento.TipoDepoimentoKey;
import br.smat.ejb.trabalhador.TrabalhadorKey;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjDepoimento {
	
	int investigacao = 0;
	int dadoInvestigacao = 0;
	int pessoa = 0;
	String dataHora = null;
	int agenteCausador = 0;
	int agenteCausadorPai = 0;
	int agenteCausadorVo = 0;
	String descricao = null;
	int tipoDepoimento = 0;
	String nomePessoa;
	String dataAbertura;
	
	public ObjDepoimento(int investigacao,
						  int pessoa,
						  String dataHora,
						  int agenteCausador,
						  String descricao,
						  int tipoDepoimento){
		this.investigacao = investigacao;
		this.pessoa = pessoa;
		this.dataHora = dataHora;
		this.agenteCausador = agenteCausador;
		this.descricao = descricao;
		this.tipoDepoimento = tipoDepoimento;
	}

	public ObjDepoimento(int investigacao,
						  int dadoInvestigacao,
						  int pessoa,
						  String dataHora,
						  int agenteCausador,
						  String descricao,
						  int tipoDepoimento){
		this.investigacao = investigacao;
		this.dadoInvestigacao = dadoInvestigacao;
		this.pessoa = pessoa;
		this.dataHora = dataHora;
		this.agenteCausador = agenteCausador;
		this.descricao = descricao;
		this.tipoDepoimento = tipoDepoimento;
	}

	public ObjDepoimento(String dataHora,
						  int tipoDepoimento,
						  int pessoa,
						  String nomePessoa,
						  String descricao,
						  int agenteCausador,
						  int agenteCausadorPai,
						  int agenteCausadorVo,
						  String dataAbertura){

		this.dataHora = dataHora;	
		this.tipoDepoimento = tipoDepoimento;
		this.pessoa = pessoa;
		this.nomePessoa = nomePessoa;
		this.descricao = descricao;
		this.agenteCausador = agenteCausador;
		this.agenteCausadorPai = agenteCausadorPai;
		this.agenteCausadorVo = agenteCausadorVo;
		this.dataAbertura = dataAbertura;

	}	
	public void save() throws Exception{

		DadoInvestigacao depoimento = null;
		
		try {
			InitialContext ctx = new InitialContext();
					
			DadoInvestigacaoHome home = (DadoInvestigacaoHome)ctx.lookup("ejb/br/smat/ejb/dadoinvestigacao/DadoInvestigacaoHome");
			
			if(dadoInvestigacao == 0){
			
				depoimento = home.create(investigacao,pessoa,dataHora,agenteCausador,descricao,tipoDepoimento);
	
				dadoInvestigacao = depoimento.getDadoInvestigacao();			
			}else{
				depoimento = home.findByPrimaryKey(new DadoInvestigacaoKey(investigacao,dadoInvestigacao));
				
				System.out.println("DEPOIMENTOOOOOOOOOOOOOOOOOO => " + depoimento);
				
				depoimento.setDataHora(dataHora);
				depoimento.setAgenteCausador(new AgenteCausadorKey(agenteCausador));
				depoimento.setDescricao(descricao);
				depoimento.setTipoDepoimento(new TipoDepoimentoKey(tipoDepoimento));
				
				switch(tipoDepoimento){
					case 1:
						depoimento.setAgenteSaude(new AgenteSaudeKey(pessoa));
						break;
					case 2:
						depoimento.setTestemunha(new TestemunhaKey(pessoa));
						break;
					case 3:
						depoimento.setRepresentanteEmpresa(new RepresentanteEmpresaKey(pessoa));
						break;
					case 4:
						depoimento.setTrabalhador(new TrabalhadorKey(pessoa));
						break;															
				}
			}
			
			

			
		}catch (RemoteException e) {
			System.out.println("****************************");
			System.out.println("****** OBJDEPOIMENTO RemoteException*****");				
		//	e.printStackTrace();
			System.out.println("****************************");					
			throw new  Exception("ObjDepoimento RemoteException Erro ao inserir depoimento " + e.getMessage());
		} catch (NamingException e) {
		} catch (CreateException e) {
			System.out.println("****************************");
			System.out.println("****** OBJDEPOIMENTO CreateException*****");				
		//	e.printStackTrace();
			System.out.println("****************************");					
			//e.printStackTrace();
			throw new  Exception("ObjDepoimento CreateException Erro ao inserir depoimento " + e.getMessage());				
		} catch (Exception e) {
			System.out.println("****************************");
			System.out.println("****** OBJDEPOIMENTO Exception*****");				
	//		e.printStackTrace();
			System.out.println("****************************");				
			throw new  Exception("ObjDepoimento CreateException Erro ao inserir depoimento " + e.getMessage());				
		}
	}

	public static DadoInvestigacao findByPrimaryKey(int investigacao,int dadoInvestigacao) throws Exception{		
			InitialContext ctx;
			DadoInvestigacao dado = null;
			try {
				ctx = new InitialContext();
				DadoInvestigacaoHome home = (DadoInvestigacaoHome)ctx.lookup("ejb/br/smat/ejb/dadoinvestigacao/DadoInvestigacaoHome");
					try {
						dado = (DadoInvestigacao)home.findByPrimaryKey(new DadoInvestigacaoKey(investigacao,dadoInvestigacao));
					}  catch (RemoteException e) {
						throw new Exception(" ObjArea findByPrimaryKey RemoteException=> " + e.getMessage());
					} catch (FinderException e) {
						throw new Exception("ObjArea findByPrimaryKey FinderException=> " + e.getMessage());
					} catch (Exception e) {
						throw new Exception("ObjArea findByPrimaryKey Exception=> " + e.getMessage());
					}								
			} catch (NamingException e) {
				throw new Exception("ObjArea findByPrimaryKey NamingException=> " + e.getMessage());
			}
			return dado;
	}		
	/**
	 * Returns the agenteCausador.
	 * @return int
	 */
	public int getAgenteCausador() {
		return agenteCausador;
	}

	/**
	 * Returns the dadoInvestigacao.
	 * @return int
	 */
	public int getDadoInvestigacao() {
		return dadoInvestigacao;
	}

	/**
	 * Returns the dataHora.
	 * @return String
	 */
	public String getDataHora() {
		return dataHora;
	}

	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Returns the investigacao.
	 * @return int
	 */
	public int getInvestigacao() {
		return investigacao;
	}

	/**
	 * Returns the pessoa.
	 * @return int
	 */
	public int getPessoa() {
		return pessoa;
	}

	/**
	 * Sets the agenteCausador.
	 * @param agenteCausador The agenteCausador to set
	 */
	public void setAgenteCausador(int agenteCausador) {
		this.agenteCausador = agenteCausador;
	}

	/**
	 * Sets the dadoInvestigacao.
	 * @param dadoInvestigacao The dadoInvestigacao to set
	 */
	public void setDadoInvestigacao(int dadoInvestigacao) {
		this.dadoInvestigacao = dadoInvestigacao;
	}

	/**
	 * Sets the dataHora.
	 * @param dataHora The dataHora to set
	 */
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Sets the investigacao.
	 * @param investigacao The investigacao to set
	 */
	public void setInvestigacao(int investigacao) {
		this.investigacao = investigacao;
	}

	/**
	 * Sets the pessoa.
	 * @param pessoa The pessoa to set
	 */
	public void setPessoa(int pessoa) {
		this.pessoa = pessoa;
	}

	/**
	 * Returns the tipoDepoimento.
	 * @return int
	 */
	public int getTipoDepoimento() {
		return tipoDepoimento;
	}

	/**
	 * Sets the tipoDepoimento.
	 * @param tipoDepoimento The tipoDepoimento to set
	 */
	public void setTipoDepoimento(int tipoDepoimento) {
		this.tipoDepoimento = tipoDepoimento;
	}

	/**
	 * Returns the agenteCausadorPai.
	 * @return int
	 */
	public int getAgenteCausadorPai() {
		return agenteCausadorPai;
	}

	/**
	 * Returns the agenteCausadorVo.
	 * @return int
	 */
	public int getAgenteCausadorVo() {
		return agenteCausadorVo;
	}

	/**
	 * Sets the agenteCausadorPai.
	 * @param agenteCausadorPai The agenteCausadorPai to set
	 */
	public void setAgenteCausadorPai(int agenteCausadorPai) {
		this.agenteCausadorPai = agenteCausadorPai;
	}

	/**
	 * Sets the agenteCausadorVo.
	 * @param agenteCausadorVo The agenteCausadorVo to set
	 */
	public void setAgenteCausadorVo(int agenteCausadorVo) {
		this.agenteCausadorVo = agenteCausadorVo;
	}

	/**
	 * Returns the nomePessoa.
	 * @return String
	 */
	public String getNomePessoa() {
		return nomePessoa;
	}

	/**
	 * Sets the nomePessoa.
	 * @param nomePessoa The nomePessoa to set
	 */
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	/**
	 * Returns the dataAbertura.
	 * @return String
	 */
	public String getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * Sets the dataAbertura.
	 * @param dataAbertura The dataAbertura to set
	 */
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

}
