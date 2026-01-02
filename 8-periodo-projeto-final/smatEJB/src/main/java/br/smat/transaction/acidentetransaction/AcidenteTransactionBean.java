package br.smat.transaction.acidentetransaction;

import java.rmi.RemoteException;
import java.sql.SQLException;
import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.RemoveException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.smat.ejb.acidente.Acidente;
import br.smat.ejb.acidente.AcidenteBean;
import br.smat.ejb.acidente.AcidenteHome;
import br.smat.ejb.locallesaoacidente.LocalLesaoAcidente;
import br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteHome;
import br.smat.ejb.medico.Medico;
import br.smat.ejb.medico.MedicoHome;
import br.smat.ejb.testemunha.TestemunhaHome;
import br.smat.ejb.trabalhador.Trabalhador;
import br.smat.ejb.trabalhador.TrabalhadorHome;
import br.smat.objetosauxiliares.auxtestemunha.AuxTestemunha;

/**
 * Bean implementation class for Enterprise Bean: AcidenteTransaction
 */
public class AcidenteTransactionBean implements javax.ejb.SessionBean {
	
	private 	int acidente;
	private	int 	empresa	;
	private	int	emitente;
	private	String 	nome;
	private	String 	nomeResponsavel;
	private	String 	dataNascimento;
	private	String 	sexo;
	private	int	estadoCivil;
	private	int 	ctps;
	private	int 	serie;
	private	String 	dataEmissaoCTPS;
	private	int	ufCTPS;
	private	String 	remuneracaoMensal;
	private	String 	rg;
	private	String 	dataEmissaoRG;
	private	String	orgaoExpedidorRG;
	private	int	ufRG;
	private	String 	cpf;
	private	String 	pisPasepNit;
	private	int	municipio;
	private	String 	rua;
	private	int 	numero;
	private	String 	bairro;
	private	String 	complemento;
	private	String 	cep;
	private	String 	ddd;
	private	String 	telefone;
	private	int	vinculoEmpregaticio;	
	private	int 	ocupacao;
	private	int 	area;
	private	String 	aposentado;
	private	int	trabalhador;		
	private	int 	empresaTerceira;
	private	String 	dataAcidente;
	private	String 	hora;
	private	int 	horasTrabalhadas;
	private	int 	tipoAcidente;
	private	String 	dataUltimodiaTrab;
	private	int 	tipoLocalAcidente;
	private	String 	descricaoLocal;
	private	int 	estadoAcidente;
	private	int 	municipioAcidente;
	private	int[] 	localLesaoAcidente;
	private	int 	agenteCausador;
	private	String 	descricaoSituacaoGeradora;
	private	String 	registroPolicial;
	private	String 	amputacao;
	private	String	obito;	
	private	AuxTestemunha[] vTestemunhas;
	private	int 	medico;
	private	String	nomeMedico;
	private	int 	localAtendimento;
	private	String 	dataAtestado;
	private	String 	horaAtestado;
	private	String 	internacao;
	private	String	afastamento;
	private	int 	duracaoTratamento;
	private	String 	descNaturezaLesao;
	private	int 	diagnostico;
	private	String 	observacoes;
	private	int 	crm;
	private	int 	ufCRM;
	private	int 	fonte;
	private	String 	numDocFonte;
	private	String 	dataEmissaoFonte;
	private	String	distritoSaude;
	private	String  descricaoDiagnostico;		

	
	private javax.ejb.SessionContext mySessionCtx;

	/**
	 * getSessionContext
	 */
	public javax.ejb.SessionContext getSessionContext() {
		return mySessionCtx;
	}
	/**
	 * setSessionContext
	 */
	public void setSessionContext(javax.ejb.SessionContext ctx) {
		mySessionCtx = ctx;
	}
	/**
	 * ejbCreate
	 */
	public void ejbCreate() throws javax.ejb.CreateException {
	}
	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() {
	}

	
	public String armazenaAcidente(int	acidente,
									int 	empresa	,
									int	emitente,
									String 	nome,
									String 	nomeResponsavel,									
									String 	dataNascimento,
									String 	sexo,
									int	estadoCivil,
									int 	ctps,
									int 	serie,
									String 	dataEmissaoCTPS,
									int	ufCTPS,
									String 	remuneracaoMensal,
									String 	rg,
									String 	dataEmissaoRG,
									String	orgaoExpedidorRG,
									int	ufRG,
									String 	cpf,
									String 	pisPasepNit,
									int	municipio,
									String 	rua,
									int 	numero,
									String 	bairro,
									String 	complemento,
									String 	cep,
									String 	ddd,
									String 	telefone,
									int	vinculoEmpregaticio,	
									int 	ocupacao,
									int 	area,
									String 	aposentado,
									int	trabalhador,		
									int 	empresaTerceira,
									String 	dataAcidente,
									String 	hora,
									int 	horasTrabalhadas,
									int 	tipoAcidente,
									String 	dataUltimodiaTrab,
									int 	tipoLocalAcidente,
									String 	descricaoLocal,
									int 	estadoAcidente,
									int 	municipioAcidente,
									int[] 	localLesaoAcidente,
									int 	agenteCausador,
									String 	descricaoSituacaoGeradora,
									String 	registroPolicial,
									String 	amputacao,
									String	obito,	
									AuxTestemunha[] vTestemunhas,
									int 	medico,
									String	nomeMedico,
									int 	localAtendimento,
									String 	dataAtestado,
									String 	horaAtestado,
									String 	internacao,
									String	afastamento,
									int 	duracaoTratamento,
									String 	descNaturezaLesao,
									int 	diagnostico,
									String 	observacoes,
									int 	crm,
									int 	ufCRM,
									int 	fonte,
									String 	numDocFonte,
									String 	dataEmissaoFonte,
									String	distritoSaude,
									String  descricaoDiagnostico) throws Exception {
										
		this.acidente = acidente ;
		this.empresa	 = empresa ;
		this.emitente = emitente ;
		this.nome = nome ;
		this.nomeResponsavel = nomeResponsavel ;
		this.dataNascimento = dataNascimento ;
		this.sexo = sexo ;
		this.estadoCivil = estadoCivil ;
		this.ctps = ctps ;
		this.serie = serie ;
		this.dataEmissaoCTPS = dataEmissaoCTPS ;
		this.ufCTPS = ufCTPS ;
		this.remuneracaoMensal = remuneracaoMensal ;
		this.rg = rg ;
		this.dataEmissaoRG = dataEmissaoRG ;
		this.orgaoExpedidorRG = orgaoExpedidorRG ;
		this.ufRG = ufRG ;
		this.cpf = cpf ;
		this.pisPasepNit = pisPasepNit ;
		this.municipio = municipio  ;
		this.rua = rua ;
		this.numero = numero ;
		this.bairro = bairro ;
		this.complemento =complemento  ;
		this.cep = cep ;
		this.ddd = ddd ;
		this.telefone = telefone ;
		this.vinculoEmpregaticio = vinculoEmpregaticio ;	
		this.ocupacao = ocupacao ;
		this.area = area ;
		this.aposentado = aposentado  ;
		this.trabalhador = trabalhador ;		
		this.empresaTerceira = empresaTerceira ;
		this.dataAcidente = dataAcidente ;
		this.hora = hora ;
		this.horasTrabalhadas = horasTrabalhadas ;
		this.tipoAcidente = tipoAcidente ;
		this.dataUltimodiaTrab = dataUltimodiaTrab ;
		this.tipoLocalAcidente = tipoLocalAcidente ;
		this.descricaoLocal = descricaoLocal ;
		this.estadoAcidente = estadoAcidente  ;
		this.municipioAcidente = municipioAcidente ;
		this.localLesaoAcidente = localLesaoAcidente ;
		this.agenteCausador = agenteCausador ;
		this.descricaoSituacaoGeradora = descricaoSituacaoGeradora ;
		this.registroPolicial = registroPolicial ;
		this.amputacao = amputacao ;
		this.obito = obito ;	
		this.vTestemunhas = vTestemunhas ;
		this.medico = medico ;
		this.nomeMedico = nomeMedico ;
		this.localAtendimento = localAtendimento ;
		this.dataAtestado = dataAtestado ;
		this.horaAtestado = horaAtestado ;
		this.internacao = internacao ;
		this.afastamento = afastamento ;
		this.duracaoTratamento = duracaoTratamento ;
		this.descNaturezaLesao = descNaturezaLesao ;
		this.diagnostico = diagnostico ;
		this.observacoes = observacoes ;
		this.crm = crm ;
		this.ufCRM = ufCRM ;
		this.fonte = fonte ;
		this.numDocFonte = numDocFonte ;
		this.dataEmissaoFonte = dataEmissaoFonte ;
		this.distritoSaude = distritoSaude ;
		this.descricaoDiagnostico = descricaoDiagnostico ;										
				
		return "Acidente inserido com sucesso!";
	}
	
	
	public void save() throws Exception{

		TrabalhadorHome 		trabalhadorHome 		= null;
		MedicoHome 				medicoHome 				= null;
		AcidenteHome 			acidenteHome			= null;
		LocalLesaoAcidenteHome 	localLesaoAcidenteHome 	= null;
		TestemunhaHome 			testemunhaHome 			= null;
		InitialContext 			ctx 					= null;
		
		Medico					medicoBean				= null;
		Trabalhador 			trabalhadorBean			= null;


		String 	dataHoraAcidente = null;
		String	dataHoraAtestado = null;		

		try {
			ctx 					= new InitialContext();										
			trabalhadorHome 		= (TrabalhadorHome) ctx.lookup(	"ejb/br/smat/ejb/trabalhador/TrabalhadorHome");																							
			medicoHome 				= (MedicoHome) ctx.lookup("ejb/br/smat/ejb/medico/MedicoHome");													
			acidenteHome 			= (AcidenteHome) ctx.lookup("ejb/br/smat/ejb/acidente/AcidenteHome");													
			localLesaoAcidenteHome 	= (LocalLesaoAcidenteHome) ctx.lookup("ejb/br/smat/ejb/locallesaoacidente/LocalLesaoAcidenteHome");																												   		
			testemunhaHome 			= (TestemunhaHome) ctx.lookup("ejb/br/smat/ejb/testemunha/TestemunhaHome");																												  			
		} catch (NamingException e) {

			System.out.println("***** CONTEXT *****");
			e.printStackTrace();
			System.out.println("*******************");

		//	throw new  Exception("AcidenteTransactionBean CONTEXT" + e.getMessage());		
		}
		
	
		/*************************
		 * Cria o Trabalhador    *
		 ************************/
		try{
			trabalhadorBean =  trabalhadorHome.create(	municipio,ufRG,ufCTPS,estadoCivil,nome,cpf,rg,ctps,serie,
														dataEmissaoCTPS,dataNascimento,sexo,numero,rua,bairro,cep,
														complemento,nomeResponsavel,dataEmissaoRG,
														orgaoExpedidorRG,pisPasepNit,telefone,ddd);
		}catch (CreateException e) {
			System.out.println("****TRABALHADOR****");
			e.printStackTrace();
			System.out.println("*******************");

			throw new  RemoteException("AcidenteTransactionBean trabalhador" + e.getMessage());							
		}
				
			
		/*************************
		 * Cria o Médico         *
		 ************************/																
		if(nomeMedico != null && crm > 0 && ufCRM > 0){
			try{																	
				medicoBean = medicoHome.create(nomeMedico,crm,ufCRM);
				medico = medicoBean.getMedico();
			}catch (CreateException e) {
		//		System.out.println("****   MEDICO  ****");
		//		e.printStackTrace();
		//		System.out.println("*******************");
	
				throw new  RemoteException("AcidenteTransactionBean medico" + e.getMessage());							
			}
		}
		
		System.out.println("PQ VEIO AQUIIIIIIIIIIIIII?");

		/*************************
		 * Cria o Acidente       *
		 ************************/
			
		if(dataAcidente != null && hora != null)			
			dataHoraAcidente = dataAcidente+" "+hora;
			
		if(dataAtestado != null && horaAtestado != null)	
			dataHoraAtestado = dataAtestado+" "+horaAtestado;	
				
				
	 	float remuneracaoTrabalhador = Float.parseFloat(remuneracaoMensal);
			
		Acidente acidenteBean = null;		
		
		System.out.println("descricaoLocal no transaction => " + descricaoLocal);
			
		try {
			acidenteBean = acidenteHome.create(area,vinculoEmpregaticio,ocupacao,localAtendimento,empresa,
											   medico,diagnostico,fonte,agenteCausador,
											   tipoLocalAcidente,trabalhadorBean.getTrabalhador(),
											   empresaTerceira,tipoAcidente,emitente,municipioAcidente,
											   dataHoraAcidente,registroPolicial,amputacao,obito,
											   horasTrabalhadas,descricaoLocal,numDocFonte,dataEmissaoFonte,
											   descNaturezaLesao,dataHoraAtestado,afastamento,
											   internacao,observacoes,duracaoTratamento,aposentado,
											   remuneracaoTrabalhador,distritoSaude,dataUltimodiaTrab,
											   descricaoSituacaoGeradora,descricaoDiagnostico);
		}catch (CreateException e) {
			System.out.println("****  ACIDENTE ****");
			e.printStackTrace();
			System.out.println("*******************");

			throw new  RemoteException("AcidenteTransactionBean medico" + e.getMessage());							
		}

		/*****************************
		 * Cria o LocalLesaoAcidente *
		 ****************************/
					
		for(int i = 0; i < localLesaoAcidente.length;i++){
			try{
				localLesaoAcidenteHome.create(localLesaoAcidente[i],acidenteBean.getAcidente());
			}catch (CreateException e) {
				System.out.println("****  LOCALLESAOACIDENTE ****");
				e.printStackTrace();
				System.out.println("*****************************");
	
				throw new  RemoteException("AcidenteTransactionBean localLesaoAcidente" + e.getMessage());							
			}
		}
						
		/*************************
		 * Cria a Testemunha     *
		 ************************/
					
		if(vTestemunhas != null){
			for(int i=0; i<vTestemunhas.length;i++){
				try{
					System.out.println("numero da testemunha no bean => " + vTestemunhas[i].getNumero());

					testemunhaHome.create(	acidenteBean.getAcidente(),vTestemunhas[i].getMunicipio(),
											vTestemunhas[i].getNome(),vTestemunhas[i].getNumero(),
											vTestemunhas[i].getRua(),vTestemunhas[i].getBairro(),
											vTestemunhas[i].getCep(),vTestemunhas[i].getComplemento(),
											vTestemunhas[i].getTelefone(),vTestemunhas[i].getDdd());
				}catch (CreateException e) {
					System.out.println("****  TESTEMUNHA ****");
					e.printStackTrace();
					System.out.println("*********************");
		
					throw new  RemoteException("AcidenteTransactionBean testemunha" + e.getMessage());							
				}
			}
		}
		System.out.println("--- Fim Transação alteradooooo  ---- ");
	}
}
