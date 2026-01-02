package br.smat.web.obj;

import java.rmi.RemoteException;
import java.util.Vector;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;

import com.ibm.ejs.util.dopriv.GetContextClassLoaderPrivileged;

import br.smat.ejb.acidente.Acidente;
import br.smat.ejb.acidente.AcidenteHome;
import br.smat.ejb.acidente.AcidenteKey;
import br.smat.ejb.agentecausador.AgenteCausador;
import br.smat.ejb.area.Area;
import br.smat.ejb.diagnostico.Diagnostico;
import br.smat.ejb.emitente.Emitente;
import br.smat.ejb.empregador.Empregador;
import br.smat.ejb.estado.Estado;
import br.smat.ejb.estadocivil.EstadoCivil;
import br.smat.ejb.fonte.Fonte;
import br.smat.ejb.localatendimento.LocalAtendimento;
import br.smat.ejb.medico.Medico;
import br.smat.ejb.municipio.Municipio;
import br.smat.ejb.ocupacao.Ocupacao;
import br.smat.ejb.regional.Regional;
import br.smat.ejb.tipoacidente.TipoAcidente;
import br.smat.ejb.tipolocalacidente.TipoLocalAcidente;
import br.smat.ejb.trabalhador.Trabalhador;
import br.smat.ejb.vinculoempregaticio.VinculoEmpregaticio;
import br.smat.objetosauxiliares.auxlocallesao.AuxLocalLesao;
import br.smat.objetosauxiliares.auxtestemunha.AuxTestemunha;
import br.smat.transaction.acidentetransaction.AcidenteTransaction;
import br.smat.transaction.acidentetransaction.AcidenteTransactionHome;
import br.smat.util.FuncoesComuns;
import br.smat.util.ValidacoesFormulario;

/**
 * @author administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ObjAcidente {


	private ActionErrors errors = null;	
		
	private String paginaAtual;

	private String destinoPermitido = null;

	/******************************************************
	 * Passo Um
	 *****************************************************/
	private int	acidente;
	private int 	empresa	;
	private int	emitente;
	private String documento;
	private String razaoSocial;
	private String nome;
	private String nomeResponsavel;	
	private String dataNascimento;
	private String sexo;
	private int	estadoCivil;
	private int	ctps;
	private int	serie;
	private String dataEmissaoCTPS;
	private int	ufCTPS;
	private String	remuneracaoMensal;
	private String rg;
	private String dataEmissaoRG;
	private String orgaoExpedidorRG;	
	private int	ufRG;
	private String cpf;
	private String pisPasepNit;
	private int	estado;
	private int	municipio;
	private String rua;
	private int	numero;
	private String bairro;
	private String complemento;
	private String cep;
	private String ddd;
	private String telefone;
	private int	vinculoEmpregaticio;	
	private int 	ocupacao;
	private int 	area;
	private char 	aposentado;
	private int	trabalhador = 0;	

	/******************************************************
	 * Passo Dois
	 *****************************************************/	
	private int	 	empresaTerceira;
	private String 	dataAcidente;
	private String 	hora;
	private int	 	horasTrabalhadas;
	private int 		tipoAcidente;
	private String 	dataUltimodiaTrab;
	private int 		tipoLocalAcidente;
	private String 	descricaoLocal;
	private String 	documentoEmpresaTerceira;
	private String 	razaoSocialEmpresaterceira;
	private int 		estadoAcidente;
	private int 		municipioAcidente;
	private int 		localLesaoPai;
	private int 		localLesao;
	private ObjLocalLesaoAcidente[] vLocalLesaoAcidente;
	private int		agenteCausadorVo;
	private int 		agenteCausadorPai;
	private int 		agenteCausador;
	private String 	descricaoSituacaoGeradora;
	private char 		registroPolicial;
	private char 		amputacao;
	private char		obito;	

	/******************************************************
	 * Passo Tres
	 *****************************************************/	
	private ObjTestemunha[] vTestemunhas;


	/******************************************************
	 * Passo Quatro
	 *****************************************************/	
	private int medico;
	private int 	localAtendimento;
	private String dataAtestado;
	private String horaAtestado;
	private char 	internacao;
	private char 	afastamento;
	private int	duracaoTratamento;
	private String descNaturezaLesao;
	private int 	diagnostico;
	private String observacoes;
	private String descricaoDiagnostico;	
	private int	crm;
	private int 	ufCRM;
	private String medicoNome;
	private int 	fonte;
	private String numDocFonte;
	private String dataEmissaoFonte;
	private String distritoSaude;
	
	
	/******************************************************
	 *  Atributos auxiliares
	 * ***************************************************/
	
	private String nomeEmitente = null;
	private String nomeEstadoCivil = null;	
	private String nomeUFCTPS = null;
	private String nomeUFRG = null;	
	private String nomeEstado = null;
	private String nomeMunicipio = null;	
	private String nomeVinculoEmpregaticio = null;	
	private String	nomeOcupacao = null; 
	private String	nomeArea = null; 
	private String	nomeAposentado = null; 	
	private String	nomeTipoAcidente = null;
	private String nomeTipoLocalAcidente = null;
	private String nomeEstadoAcidente = null;
	private String nomeMunicipioAcidente = null;
	private String nomeAgenteCausador = null;
	private String	nomeRegistroPolicial = null;
	private String	nomeAmputacao = null;
	private String	nomeObito = null;
	private String nomeLocalAtendimento = null;
	private String nomeInternacao = null;
	private String nomeAfastamento = null;
	private String nomeDiagnostico = null;
	private String nomeUFCRM = null;
	private String nomeFonte = null;
	
	
	private int investigacao = 0;
	private String dataAberturaInvestigacao = null;
	private String dataFinalizacaoInvestigacao = null;
			
	/**
	 * Constructor for ObjAcidente.
	 */
	public ObjAcidente() {
		super();
		
		paginaAtual         = null;
		
		acidente 			= 0;
		empresa				= 0;
		emitente 			= 0;
		documento 			= null;
		razaoSocial 		= null;
		nome 				= null;
		nomeResponsavel		= null;
		dataNascimento 		= null;
		sexo 				= null;
		estadoCivil 		= 0;
		ctps 				= 0;
		serie				= 0;
		dataEmissaoCTPS 	= null;
		ufCTPS 				= 0;
		remuneracaoMensal 	= null;
		rg 					= null;
		dataEmissaoRG 		= null;
		orgaoExpedidorRG	= null;
		ufRG 				= 0;
		cpf 				= null;
		pisPasepNit         = null;
		estado				= 0;
		municipio 			= 0;
		rua 				= null;
		numero 				= 0;
		bairro 				= null;
		complemento 		= null;
		cep 				= null;
		ddd 				= null;
		telefone 			= null;
		vinculoEmpregaticio = 0;	
		ocupacao 			= 0;
		area 				= 0;
		aposentado 			= ' ';
		
		empresaTerceira 			= 0;
		dataAcidente 				= null;
		hora 						= null;
		horasTrabalhadas 			= 0;
		tipoAcidente				= 0;
		tipoLocalAcidente			= 0;
		descricaoLocal 				= null;
		documentoEmpresaTerceira 	= null;
		razaoSocialEmpresaterceira 	= null;
		estadoAcidente				= 0;
		municipioAcidente			= 0;
		localLesaoPai				= 0;
		localLesao					= 0;
		vLocalLesaoAcidente 		= null;
		agenteCausadorVo			= 0;
		agenteCausadorPai			= 0;
		agenteCausador				= 0;
		descricaoSituacaoGeradora 	= null;
		registroPolicial  			= ' ';
		amputacao  					= ' ';
		obito  						= ' ';				
		
		vTestemunhas				= null;	

		medico 						= 0;
		localAtendimento			= 0;
		dataAtestado 				= null;
		horaAtestado 				= null;
		internacao					= ' ';
		afastamento					= ' ';
		duracaoTratamento 			= 0;
		descNaturezaLesao 			= null;
		diagnostico					= 0;
		observacoes 				= null;
		crm 						= 0;
		ufCRM						= 0;
		medicoNome 					= null;
		fonte						= 0;
		numDocFonte 				= null;
		dataEmissaoFonte 			= null;
		
	}

					 
	private ObjAcidente(int	acidente,
						 int 	empresa,
					     int emitente,
						 String documento,
						 String razaoSocial,
						 String nome,
						 String nomeResponsavel,
						 String dataNascimento,
						 String sexo,
						 int	estadoCivil,
						 int	ctps,
						 int	serie,
						 String dataEmissaoCTPS,
						 int	ufCTPS,
						 String	remuneracaoMensal,
						 String rg,
						 String dataEmissaoRG,
						 String orgaoExpedidorRG,
						 int	ufRG,
						 String cpf,
						 String pisPasepNit,
						 int	estado,
						 int	municipio,
						 String rua,
						 int	numero,
						 String bairro,
						 String complemento,
						 String cep,
						 String ddd,
						 String telefone,
						 int	vinculoEmpregaticio,
						 int 	ocupacao,
						 int 	area,
						 char 	aposentado,
						 int	trabalhador,
						 int	 	empresaTerceira,
						 String 	dataAcidente,
						 String 	hora,
						 int	 	horasTrabalhadas,
						 int 		tipoAcidente,
						 String 	dataUltimodiaTrab,
						 int 		tipoLocalAcidente,
						 String 	descricaoLocal,
						 String 	documentoEmpresaTerceira,
						 String 	razaoSocialEmpresaterceira,
						 int 		estadoAcidente,
						 int 		municipioAcidente,
						 int 		localLesaoPai,
						 int 		localLesao,
						 ObjLocalLesaoAcidente[] vLocalLesaoAcidente,
						 int		agenteCausadorVo,
						 int 		agenteCausadorPai,
						 int 		agenteCausador,
						 String 	descricaoSituacaoGeradora,
						 char 		registroPolicial,
						 char 		amputacao,
						 char		obito,
						 ObjTestemunha[] vTestemunhas,
						 int medico,
						 int 	localAtendimento,
						 String dataAtestado,
						 String horaAtestado,
						 char 	internacao,
						 char 	afastamento,
						 int	duracaoTratamento,
						 String descNaturezaLesao,
						 int 	diagnostico,
						 String observacoes,
						 String descricaoDiagnostico,
						 int	crm,
						 int 	ufCRM,
						 String medicoNome,
						 int 	fonte,
						 String numDocFonte,
						 String dataEmissaoFonte,
						 String distritoSaude){



		this.acidente = acidente;
		this.empresa = empresa;
     	this.emitente = emitente;
		this.documento = documento;
		this.razaoSocial = razaoSocial;
		this.nome = nome;
		this.nomeResponsavel = nomeResponsavel;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.ctps = ctps;
		this.serie = serie;
		this.dataEmissaoCTPS = dataEmissaoCTPS;
		this.ufCTPS = ufCTPS;
		this.remuneracaoMensal = remuneracaoMensal;
		this.rg = rg;
		this.dataEmissaoRG = dataEmissaoRG;
		this.orgaoExpedidorRG = orgaoExpedidorRG;
		this.ufRG = ufRG;
		this.cpf = cpf;
		this.pisPasepNit = pisPasepNit;
		this.estado = estado;
		this.municipio = municipio;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.ddd = ddd;
		this.telefone = telefone;
		this.vinculoEmpregaticio = vinculoEmpregaticio;
		this.ocupacao = ocupacao;
		this.area = area;
		this.aposentado = aposentado;
		this.trabalhador = trabalhador;
		this.empresaTerceira = empresaTerceira;
		this.dataAcidente = dataAcidente;
		this.hora = hora;
		this.horasTrabalhadas = horasTrabalhadas;
		this.tipoAcidente = tipoAcidente;
		this.dataUltimodiaTrab = dataUltimodiaTrab;
		this.tipoLocalAcidente = tipoLocalAcidente;
		this.descricaoLocal = descricaoLocal;
		this.documentoEmpresaTerceira = documentoEmpresaTerceira;
		this.razaoSocialEmpresaterceira = razaoSocialEmpresaterceira;
		this.estadoAcidente = estadoAcidente;
		this.municipioAcidente = municipioAcidente;
		this.localLesaoPai = localLesaoPai;
		this.localLesao = localLesao;
		this.vLocalLesaoAcidente = vLocalLesaoAcidente;
		this.agenteCausadorVo = agenteCausadorVo;
		this.agenteCausadorPai = agenteCausadorPai;
		this.agenteCausador = agenteCausador;
		this.descricaoSituacaoGeradora = descricaoSituacaoGeradora;
		this.registroPolicial = registroPolicial;
		this.amputacao = amputacao;
		this.obito = obito;
		this.vTestemunhas = vTestemunhas;
		this.medico = medico;
		this.localAtendimento = localAtendimento;
		this.dataAtestado = dataAtestado;
		this.horaAtestado = horaAtestado;
		this.internacao = internacao;
		this.afastamento = afastamento;
		this.duracaoTratamento = duracaoTratamento;
		this.descNaturezaLesao = descNaturezaLesao;
		this.diagnostico = diagnostico;
		this.observacoes = observacoes;
		this.descricaoDiagnostico = descricaoDiagnostico;
		this.crm = crm;
		this.ufCRM = ufCRM;
		this.medicoNome = medicoNome;
		this.fonte = fonte;
		this.numDocFonte = numDocFonte;
		this.dataEmissaoFonte = dataEmissaoFonte;
		this.distritoSaude = distritoSaude;
	}

	/**
	 * Returns the acidente.
	 * @return int
	 */
	public int getAcidente() {
		return acidente;
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
	 * Returns the agenteCausadorVo.
	 * @return int
	 */
	public int getAgenteCausadorVo() {
		return agenteCausadorVo;
	}

	/**
	 * Returns the amputacao.
	 * @return char
	 */
	public char getAmputacao() {
		return amputacao;
	}

	/**
	 * Returns the aposentado.
	 * @return char
	 */
	public char getAposentado() {
		return aposentado;
	}

	/**
	 * Returns the area.
	 * @return int
	 */
	public int getArea() {
		return area;
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
	 * Returns the cpf.
	 * @return String
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Returns the crm.
	 * @return String
	 */
	public int getCrm() {
		return crm;
	}

	/**
	 * Returns the ctps.
	 * @return String
	 */
	public int getCtps() {
		return ctps;
	}

	/**
	 * Returns the dataAcidente.
	 * @return String
	 */
	public String getDataAcidente() {
		return dataAcidente;
	}

	/**
	 * Returns the dataAtestado.
	 * @return String
	 */
	public String getDataAtestado() {
		return dataAtestado;
	}

	/**
	 * Returns the dataEmissaoCTPS.
	 * @return String
	 */
	public String getDataEmissaoCTPS() {
		return dataEmissaoCTPS;
	}

	/**
	 * Returns the dataEmissaoFonte.
	 * @return String
	 */
	public String getDataEmissaoFonte() {
		return dataEmissaoFonte;
	}

	/**
	 * Returns the dataEmissaoRG.
	 * @return String
	 */
	public String getDataEmissaoRG() {
		return dataEmissaoRG;
	}

	/**
	 * Returns the dataNascimento.
	 * @return String
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * Returns the ddd.
	 * @return String
	 */
	public String getDdd() {
		return ddd;
	}

	/**
	 * Returns the descNaturezaLesao.
	 * @return String
	 */
	public String getDescNaturezaLesao() {
		return descNaturezaLesao;
	}

	/**
	 * Returns the descricaoLocal.
	 * @return String
	 */
	public String getDescricaoLocal() {
		return descricaoLocal;
	}

	/**
	 * Returns the descricaoSituacaoGeradora.
	 * @return String
	 */
	public String getDescricaoSituacaoGeradora() {
		return descricaoSituacaoGeradora;
	}

	/**
	 * Returns the diagnostico.
	 * @return int
	 */
	public int getDiagnostico() {
		return diagnostico;
	}

	/**
	 * Returns the documento.
	 * @return String
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * Returns the documentoEmpresaTerceira.
	 * @return String
	 */
	public String getDocumentoEmpresaTerceira() {
		return documentoEmpresaTerceira;
	}

	/**
	 * Returns the duracaoTratamento.
	 * @return String
	 */
	public int getDuracaoTratamento() {
		return duracaoTratamento;
	}

	/**
	 * Returns the emitente.
	 * @return int
	 */
	public int getEmitente() {
		return emitente;
	}

	/**
	 * Returns the empresa.
	 * @return int
	 */
	public int getEmpresa() {
		return empresa;
	}

	/**
	 * Returns the empresaTerceira.
	 * @return String
	 */
	public int getEmpresaTerceira() {
		return empresaTerceira;
	}

	/**
	 * Returns the estado.
	 * @return int
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Returns the estadoAcidente.
	 * @return int
	 */
	public int getEstadoAcidente() {
		return estadoAcidente;
	}

	/**
	 * Returns the estadoCivil.
	 * @return int
	 */
	public int getEstadoCivil() {
		return estadoCivil;
	}

	/**
	 * Returns the fonte.
	 * @return int
	 */
	public int getFonte() {
		return fonte;
	}

	/**
	 * Returns the hora.
	 * @return String
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * Returns the horaAtestado.
	 * @return String
	 */
	public String getHoraAtestado() {
		return horaAtestado;
	}

	/**
	 * Returns the horasTrabalhadas.
	 * @return String
	 */
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	/**
	 * Returns the internacao.
	 * @return int
	 */
	public char getInternacao() {
		return internacao;
	}

	/**
	 * Returns the localAtendimento.
	 * @return int
	 */
	public int getLocalAtendimento() {
		return localAtendimento;
	}

	/**
	 * Returns the localLesao.
	 * @return int
	 */
	public int getLocalLesao() {
		return localLesao;
	}

	/**
	 * Returns the localLesaoPai.
	 * @return int
	 */
	public int getLocalLesaoPai() {
		return localLesaoPai;
	}

	/**
	 * Returns the medico.
	 * @return String
	 */
	public int getMedico() {
		return medico;
	}

	/**
	 * Returns the medicoNome.
	 * @return String
	 */
	public String getMedicoNome() {
		return medicoNome;
	}

	/**
	 * Returns the municipio.
	 * @return int
	 */
	public int getMunicipio() {
		return municipio;
	}

	/**
	 * Returns the municipioAcidente.
	 * @return int
	 */
	public int getMunicipioAcidente() {
		return municipioAcidente;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the numDocFonte.
	 * @return String
	 */
	public String getNumDocFonte() {
		return numDocFonte;
	}

	/**
	 * Returns the numero.
	 * @return String
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Returns the obito.
	 * @return char
	 */
	public char getObito() {
		return obito;
	}

	/**
	 * Returns the afastamento.
	 * @return int
	 */
	public char getAfastamento() {
		return afastamento;
	}

	/**
	 * Returns the observacoes.
	 * @return String
	 */
	public String getObservacoes() {
		return observacoes;
	}

	/**
	 * Returns the ocupacao.
	 * @return int
	 */
	public int getOcupacao() {
		return ocupacao;
	}

	/**
	 * Returns the pisPasepNit.
	 * @return String
	 */
	public String getPisPasepNit() {
		return pisPasepNit;
	}

	/**
	 * Returns the razaoSocial.
	 * @return String
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * Returns the razaoSocialEmpresaterceira.
	 * @return String
	 */
	public String getRazaoSocialEmpresaterceira() {
		return razaoSocialEmpresaterceira;
	}

	/**
	 * Returns the registroPolicial.
	 * @return char
	 */
	public char getRegistroPolicial() {
		return registroPolicial;
	}

	/**
	 * Returns the remuneracaoMensal.
	 * @return String
	 */
	public String getRemuneracaoMensal() {
		return remuneracaoMensal;
	}

	/**
	 * Returns the rg.
	 * @return String
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * Returns the serie.
	 * @return String
	 */
	public int getSerie() {
		return serie;
	}

	/**
	 * Returns the sexo.
	 * @return String
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Returns the telefone.
	 * @return String
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Returns the tipoAcidente.
	 * @return int
	 */
	public int getTipoAcidente() {
		return tipoAcidente;
	}

	/**
	 * Returns the tipoLocalAcidente.
	 * @return int
	 */
	public int getTipoLocalAcidente() {
		return tipoLocalAcidente;
	}

	/**
	 * Returns the ufCRM.
	 * @return int
	 */
	public int getUfCRM() {
		return ufCRM;
	}

	/**
	 * Returns the ufCTPS.
	 * @return int
	 */
	public int getUfCTPS() {
		return ufCTPS;
	}

	/**
	 * Returns the ufRG.
	 * @return int
	 */
	public int getUfRG() {
		return ufRG;
	}

	/**
	 * Returns the vinculoEmpregaticio.
	 * @return int
	 */
	public int getVinculoEmpregaticio() {
		return vinculoEmpregaticio;
	}

	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(int acidente) {
		this.acidente = acidente;
	}

	/**
	 * Sets the afastamento.
	 * @param afastamento The afastamento to set
	 */
	public void setAfastamento(char afastamento) {
		this.afastamento = afastamento;
	}

	/**
	 * Sets the agenteCausador.
	 * @param agenteCausador The agenteCausador to set
	 */
	public void setAgenteCausador(int agenteCausador) {
		System.out.println("Passo dois agenteCausador =>" + agenteCausador);
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
	 * Sets the agenteCausadorVo.
	 * @param agenteCausadorVo The agenteCausadorVo to set
	 */
	public void setAgenteCausadorVo(int agenteCausadorVo) {
		this.agenteCausadorVo = agenteCausadorVo;
	}

	/**
	 * Sets the amputacao.
	 * @param amputacao The amputacao to set
	 */
	public void setAmputacao(char amputacao) {
		this.amputacao = amputacao;
	}

	/**
	 * Sets the aposentado.
	 * @param aposentado The aposentado to set
	 */
	public void setAposentado(char aposentado) {
		this.aposentado = aposentado;
	}

	/**
	 * Sets the area.
	 * @param area The area to set
	 */
	public void setArea(int area) {
		this.area = area;
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
	 * Sets the cpf.
	 * @param cpf The cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Sets the crm.
	 * @param crm The crm to set
	 */
	public void setCrm(int crm) {
		this.crm = crm;
	}

	/**
	 * Sets the ctps.
	 * @param ctps The ctps to set
	 */
	public void setCtps(int ctps) {
		this.ctps = ctps;
	}

	/**
	 * Sets the dataAcidente.
	 * @param dataAcidente The dataAcidente to set
	 */
	public void setDataAcidente(String dataAcidente) {
		this.dataAcidente = dataAcidente;
	}

	/**
	 * Sets the dataAtestado.
	 * @param dataAtestado The dataAtestado to set
	 */
	public void setDataAtestado(String dataAtestado) {
		this.dataAtestado = dataAtestado;
	}

	/**
	 * Sets the dataEmissaoCTPS.
	 * @param dataEmissaoCTPS The dataEmissaoCTPS to set
	 */
	public void setDataEmissaoCTPS(String dataEmissaoCTPS) {
		this.dataEmissaoCTPS = dataEmissaoCTPS;
	}

	/**
	 * Sets the dataEmissaoFonte.
	 * @param dataEmissaoFonte The dataEmissaoFonte to set
	 */
	public void setDataEmissaoFonte(String dataEmissaoFonte) {
		this.dataEmissaoFonte = dataEmissaoFonte;
	}

	/**
	 * Sets the dataEmissaoRG.
	 * @param dataEmissaoRG The dataEmissaoRG to set
	 */
	public void setDataEmissaoRG(String dataEmissaoRG) {
		this.dataEmissaoRG = dataEmissaoRG;
	}

	/**
	 * Sets the dataNascimento.
	 * @param dataNascimento The dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * Sets the ddd.
	 * @param ddd The ddd to set
	 */
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	/**
	 * Sets the descNaturezaLesao.
	 * @param descNaturezaLesao The descNaturezaLesao to set
	 */
	public void setDescNaturezaLesao(String descNaturezaLesao) {
		this.descNaturezaLesao = descNaturezaLesao;
	}

	/**
	 * Sets the descricaoLocal.
	 * @param descricaoLocal The descricaoLocal to set
	 */
	public void setDescricaoLocal(String descricaoLocal) {
		this.descricaoLocal = descricaoLocal;
	}

	/**
	 * Sets the descricaoSituacaoGeradora.
	 * @param descricaoSituacaoGeradora The descricaoSituacaoGeradora to set
	 */
	public void setDescricaoSituacaoGeradora(String descricaoSituacaoGeradora) {
		this.descricaoSituacaoGeradora = descricaoSituacaoGeradora;
	}

	/**
	 * Sets the diagnostico.
	 * @param diagnostico The diagnostico to set
	 */
	public void setDiagnostico(int diagnostico) {
		this.diagnostico = diagnostico;
	}

	/**
	 * Sets the documento.
	 * @param documento The documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	/**
	 * Sets the documentoEmpresaTerceira.
	 * @param documentoEmpresaTerceira The documentoEmpresaTerceira to set
	 */
	public void setDocumentoEmpresaTerceira(String documentoEmpresaTerceira) {
		this.documentoEmpresaTerceira = documentoEmpresaTerceira;
	}

	/**
	 * Sets the duracaoTratamento.
	 * @param duracaoTratamento The duracaoTratamento to set
	 */
	public void setDuracaoTratamento(int duracaoTratamento) {
		this.duracaoTratamento = duracaoTratamento;
	}

	/**
	 * Sets the emitente.
	 * @param emitente The emitente to set
	 */
	public void setEmitente(int emitente) {
		this.emitente = emitente;
	}

	/**
	 * Sets the empresa.
	 * @param empresa The empresa to set
	 */
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}

	/**
	 * Sets the empresaTerceira.
	 * @param empresaTerceira The empresaTerceira to set
	 */
	public void setEmpresaTerceira(int empresaTerceira) {
		this.empresaTerceira = empresaTerceira;
	}

	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * Sets the estadoAcidente.
	 * @param estadoAcidente The estadoAcidente to set
	 */
	public void setEstadoAcidente(int estadoAcidente) {
		this.estadoAcidente = estadoAcidente;
	}

	/**
	 * Sets the estadoCivil.
	 * @param estadoCivil The estadoCivil to set
	 */
	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	/**
	 * Sets the fonte.
	 * @param fonte The fonte to set
	 */
	public void setFonte(int fonte) {
		this.fonte = fonte;
	}

	/**
	 * Sets the hora.
	 * @param hora The hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * Sets the horaAtestado.
	 * @param horaAtestado The horaAtestado to set
	 */
	public void setHoraAtestado(String horaAtestado) {
		this.horaAtestado = horaAtestado;
	}

	/**
	 * Sets the horasTrabalhadas.
	 * @param horasTrabalhadas The horasTrabalhadas to set
	 */
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	/**
	 * Sets the internacao.
	 * @param internacao The internacao to set
	 */
	public void setInternacao(char internacao) {
		this.internacao = internacao;
	}

	/**
	 * Sets the localAtendimento.
	 * @param localAtendimento The localAtendimento to set
	 */
	public void setLocalAtendimento(int localAtendimento) {
		this.localAtendimento = localAtendimento;
	}

	/**
	 * Sets the localLesao.
	 * @param localLesao The localLesao to set
	 */
	public void setLocalLesao(int localLesao) {
		this.localLesao = localLesao;
	}

	/**
	 * Sets the localLesaoPai.
	 * @param localLesaoPai The localLesaoPai to set
	 */
	public void setLocalLesaoPai(int localLesaoPai) {
		this.localLesaoPai = localLesaoPai;
	}

	/**
	 * Sets the medico.
	 * @param medico The medico to set
	 */
	public void setMedico(int medico) {
		this.medico = medico;
	}

	/**
	 * Sets the medicoNome.
	 * @param medicoNome The medicoNome to set
	 */
	public void setMedicoNome(String medicoNome) {
		this.medicoNome = medicoNome;
	}

	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(int municipio) {
		this.municipio = municipio;
	}

	/**
	 * Sets the municipioAcidente.
	 * @param municipioAcidente The municipioAcidente to set
	 */
	public void setMunicipioAcidente(int municipioAcidente) {
		this.municipioAcidente = municipioAcidente;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Sets the numDocFonte.
	 * @param numDocFonte The numDocFonte to set
	 */
	public void setNumDocFonte(String numDocFonte) {
		this.numDocFonte = numDocFonte;
	}

	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Sets the obito.
	 * @param obito The obito to set
	 */
	public void setObito(char obito) {
		this.obito = obito;
	}

	/**
	 * Sets the observacoes.
	 * @param observacoes The observacoes to set
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	/**
	 * Sets the ocupacao.
	 * @param ocupacao The ocupacao to set
	 */
	public void setOcupacao(int ocupacao) {
		this.ocupacao = ocupacao;
	}

	/**
	 * Sets the pisPasepNit.
	 * @param pisPasepNit The pisPasepNit to set
	 */
	public void setPisPasepNit(String pisPasepNit) {
		this.pisPasepNit = pisPasepNit;
	}

	/**
	 * Sets the razaoSocial.
	 * @param razaoSocial The razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	 * Sets the razaoSocialEmpresaterceira.
	 * @param razaoSocialEmpresaterceira The razaoSocialEmpresaterceira to set
	 */
	public void setRazaoSocialEmpresaterceira(String razaoSocialEmpresaterceira) {
		this.razaoSocialEmpresaterceira = razaoSocialEmpresaterceira;
	}

	/**
	 * Sets the registroPolicial.
	 * @param registroPolicial The registroPolicial to set
	 */
	public void setRegistroPolicial(char registroPolicial) {
		this.registroPolicial = registroPolicial;
	}

	/**
	 * Sets the remuneracaoMensal.
	 * @param remuneracaoMensal The remuneracaoMensal to set
	 */
	public void setRemuneracaoMensal(String remuneracaoMensal) {
		this.remuneracaoMensal = remuneracaoMensal;
	}

	/**
	 * Sets the rg.
	 * @param rg The rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * Sets the serie.
	 * @param serie The serie to set
	 */
	public void setSerie(int serie) {
		this.serie = serie;
	}

	/**
	 * Sets the sexo.
	 * @param sexo The sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * Sets the telefone.
	 * @param telefone The telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Sets the tipoAcidente.
	 * @param tipoAcidente The tipoAcidente to set
	 */
	public void setTipoAcidente(int tipoAcidente) {
		this.tipoAcidente = tipoAcidente;
	}

	/**
	 * Sets the tipoLocalAcidente.
	 * @param tipoLocalAcidente The tipoLocalAcidente to set
	 */
	public void setTipoLocalAcidente(int tipoLocalAcidente) {
		this.tipoLocalAcidente = tipoLocalAcidente;
	}

	/**
	 * Sets the ufCRM.
	 * @param ufCRM The ufCRM to set
	 */
	public void setUfCRM(int ufCRM) {
		this.ufCRM = ufCRM;
	}

	/**
	 * Sets the ufCTPS.
	 * @param ufCTPS The ufCTPS to set
	 */
	public void setUfCTPS(int ufCTPS) {
		this.ufCTPS = ufCTPS;
	}

	/**
	 * Sets the ufRG.
	 * @param ufRG The ufRG to set
	 */
	public void setUfRG(int ufRG) {
		this.ufRG = ufRG;
	}

	/**
	 * Sets the vinculoEmpregaticio.
	 * @param vinculoEmpregaticio The vinculoEmpregaticio to set
	 */
	public void setVinculoEmpregaticio(int vinculoEmpregaticio) {
		this.vinculoEmpregaticio = vinculoEmpregaticio;
	}

	/**
	 * Returns the paginaAtual.
	 * @return String
	 */
	public String getPaginaAtual() {
		return paginaAtual;
	}

	/**
	 * Sets the paginaAtual.
	 * @param paginaAtual The paginaAtual to set
	 */
	public void setPaginaAtual(String paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	/**
	 * Returns the trabalhador.
	 * @return int
	 */
	public int getTrabalhador() {
		return trabalhador;
	}

	/**
	 * Sets the trabalhador.
	 * @param trabalhador The trabalhador to set
	 */
	public void setTrabalhador(int trabalhador) {
		this.trabalhador = trabalhador;
	}

	/**
	 * Returns the vLocalLesaoAcidente.
	 * @return Vector
	 */
	public ObjLocalLesaoAcidente[] getVLocalLesaoAcidente() {
		return vLocalLesaoAcidente;
	}

	/**
	 * Returns the vTestemunhas.
	 * @return Vector
	 */
	public ObjTestemunha[] getVTestemunhas() {
		return vTestemunhas;
	}

	/**
	 * Sets the vLocalLesaoAcidente.
	 * @param vLocalLesaoAcidente The vLocalLesaoAcidente to set
	 */
	public void setVLocalLesaoAcidente(ObjLocalLesaoAcidente[] vLocalLesaoAcidente) {
		this.vLocalLesaoAcidente = vLocalLesaoAcidente;
	}

	/**
	 * Sets the vTestemunhas.
	 * @param vTestemunhas The vTestemunhas to set
	 */
	public void setVTestemunhas(ObjTestemunha[] vTestemunhas) {
		this.vTestemunhas = vTestemunhas;
	}

	/**
	 * Returns the nomeEmitente.
	 * @return String
	 */
	public String getNomeEmitente() throws Exception{
		
		if(nomeEmitente == null){
		try {			
			Emitente e = ObjEmitente.findByPrimaryKey(emitente);
			
				nomeEmitente = e.getNome();
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeEmitente RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeEmitentes Exception=> " + e.getMessage());
			}
		}
		
		return nomeEmitente;
	}
	
	public String getNomeSexo(){
		if(sexo.equalsIgnoreCase("M"))
			return "Masculino";
		else
		if(sexo.equalsIgnoreCase("F"))
			return "Feminino";
		else
			return "Não informado";
	}	

	/**
	 * Returns the nomeEstadoCivil.
	 * @return String
	 */
	public String getNomeEstadoCivil() throws Exception{
		
		if(nomeEstadoCivil == null){
			try {
				EstadoCivil e = ObjEstadoCivil.findByPrimaryKey(estadoCivil);
				nomeEstadoCivil = e.getNome();
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeEstadoCivil RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeEstadoCivil Exception=> " + e.getMessage());
			}	
		}
		
		return nomeEstadoCivil;
	}

	/**
	 * Returns the nomeUFCTPS.
	 * @return String
	 */
	public String getNomeUFCTPS() throws Exception{
		
		if(nomeUFCTPS == null){
			try {
				Estado e = ObjEstado.findByPrimaryKey(ufCTPS);
				nomeUFCTPS = e.getSigla();
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeUFCTPS RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeUFCTPS Exception=> " + e.getMessage());
			}		

		}
		
		return nomeUFCTPS;
	}

	/**
	 * Returns the nomeUFRG.
	 * @return String
	 */
	public String getNomeUFRG() throws Exception{

		if(nomeUFRG == null){
			try {
				Estado e = ObjEstado.findByPrimaryKey(ufRG);
				nomeUFRG = e.getSigla();			
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeUFRG RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeUFRG Exception=> " + e.getMessage());
			}	
		}
		
		return nomeUFRG;
	}

	/**
	 * Returns the nomeEstado.
	 * @return String
	 */
	public String getNomeEstado() throws Exception{
		if(nomeEstado == null){
			if(estado > 0){
				try {
					Estado e = ObjEstado.findByPrimaryKey(estado);
					nomeEstado = e.getNome();				
				} catch (RemoteException e) {
					//throw new Exception(" ObjAcidente getNomeEstado RemoteException=> " + e.getMessage());
				} catch (Exception e) {
					//throw new Exception(" ObjAcidente getNomeEstado Exception=> " + e.getMessage());
				}			
			}
		}		
		return nomeEstado;
	}

	/**
	 * Sets the nomeMunicipio.
	 * @param nomeMunicipio The nomeMunicipio to set
	 */
	public String getNomeMunicipio() throws Exception{
		if(nomeMunicipio == null){
			try {
				Municipio m = ObjMunicipio.findByPrimaryKey(municipio);
				nomeMunicipio = m.getNome();				
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeMunicipio RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeMunicipio Exception=> " + e.getMessage());
			}	
		}		
		return this.nomeMunicipio;
	}

	/**
	 * Returns the nomeVinculoEmpregaticio.
	 * @return String
	 */
	public String getNomeVinculoEmpregaticio() throws Exception{
		if(nomeVinculoEmpregaticio == null){
			try {
				VinculoEmpregaticio m = ObjVinculoEmpregaticio.findByPrimaryKey(vinculoEmpregaticio);
				nomeVinculoEmpregaticio = m.getNome();				
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeVinculoEmpregaticio RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeVinculoEmpregaticio Exception=> " + e.getMessage());
			}	
		}				
		return nomeVinculoEmpregaticio;
	}

	/**
	 * Returns the nomeAposentado.
	 * @return String
	 */
	public String getNomeAposentado() {
		if(aposentado == 'S')
			nomeAposentado = "Sim";
		else
		if(aposentado == 'N')
			nomeAposentado = "Não";		
		else
			nomeAposentado = "Não informado";		
		
		return nomeAposentado;
	}

	/**
	 * Returns the nomeArea.
	 * @return String
	 */
	public String getNomeArea() throws Exception{
		if(nomeArea == null){
			try {
				Area m = ObjArea.findByPrimaryKey(area);
				nomeArea = m.getNome();		
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeArea RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeArea Exception=> " + e.getMessage());
			}	
		}			
		return nomeArea;
	}

	/**
	 * Returns the nomeOcupacao.
	 * @return String
	 */
	public String getNomeOcupacao() throws Exception{
		if(nomeOcupacao == null){
			try {
				Ocupacao m = ObjOcupacao.findByPrimaryKey(ocupacao);
				nomeOcupacao = m.getNome();		
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeUFCTPS RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeUFCTPS Exception=> " + e.getMessage());
			}	
		}					
		return nomeOcupacao;
	}

	/**
	 * Returns the nomeTipoAcidente.
	 * @return String
	 */
	public String getNomeTipoAcidente() throws Exception{
		if(nomeTipoAcidente == null){
			try {
				TipoAcidente m = ObjTipoAcidente.findByPrimaryKey(tipoAcidente);
				nomeTipoAcidente = m.getNome();		
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeTipoAcidente RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeTipoAcidente Exception=> " + e.getMessage());
			}		
		}		
		return nomeTipoAcidente;
	}

	/**
	 * Returns the nomeTipoLocalAcidente.
	 * @return String
	 */
	public String getNomeTipoLocalAcidente() throws Exception{
		if(nomeTipoLocalAcidente == null){
			try {
				TipoLocalAcidente m = ObjTipoLocalAcidente.findByPrimaryKey(tipoLocalAcidente);
				nomeTipoLocalAcidente = m.getNome();		
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeTipoLocalAcidente RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeTipoLocalAcidente Exception=> " + e.getMessage());
			}		
		}				
		return nomeTipoLocalAcidente;
	}

	/**
	 * Returns the dataUltimodiaTrab.
	 * @return String
	 */
	public String getDataUltimodiaTrab() {
		return dataUltimodiaTrab;
	}

	/**
	 * Sets the dataUltimodiaTrab.
	 * @param dataUltimodiaTrab The dataUltimodiaTrab to set
	 */
	public void setDataUltimodiaTrab(String dataUltimodiaTrab) {
		this.dataUltimodiaTrab = dataUltimodiaTrab;
	}

	/**
	 * Returns the nomeEstadoAcidente.
	 * @return String
	 */
	public String getNomeEstadoAcidente() throws Exception{
		if(nomeEstadoAcidente == null){
			try {
				Estado m = ObjEstado.findByPrimaryKey(estadoAcidente);
				nomeEstadoAcidente = m.getNome();		
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeEstadoAcidente RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeEstadoAcidente Exception=> " + e.getMessage());
			}	
		}				
		
		return nomeEstadoAcidente;
	}

	/**
	 * Returns the nomeMunicipioAcidente.
	 * @return String
	 */
	public String getNomeMunicipioAcidente() throws Exception{
		
		if(nomeMunicipioAcidente == null){
			try {
				Municipio m = ObjMunicipio.findByPrimaryKey(municipioAcidente);
				nomeMunicipioAcidente = m.getNome();		
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeMunicipioAcidente RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeMunicipioAcidente Exception=> " + e.getMessage());
			}	
		}				
		
		return nomeMunicipioAcidente;
	}

	/**
	 * Returns the nomeAgenteCausador.
	 * @return String
	 */
	public String getNomeAgenteCausador() throws Exception{
		if(nomeAgenteCausador == null){
			try {
				AgenteCausador m = ObjAgenteCausador.findByPrimaryKey(agenteCausador);
				nomeAgenteCausador = m.getNome();		
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeAgenteCausador RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeAgenteCausador Exception=> " + e.getMessage());
			}
		}			
		
		return nomeAgenteCausador;
	}

	/**
	 * Returns the nomeAmputacao.
	 * @return String
	 */
	public String getNomeAmputacao() {
		
		if(amputacao == 'S')
			nomeAmputacao = "Sim";
		else
		if(amputacao == 'N')
			nomeAmputacao = "Não";		
		else
			nomeAmputacao = "Não informado";	
			
		return nomeAmputacao;
	}

	/**
	 * Returns the nomeObito.
	 * @return String
	 */
	public String getNomeObito() {
		
		if(obito == 'S')
			nomeObito = "Sim";
		else
		if(obito == 'N')
			nomeObito = "Não";		
		else
			nomeObito = "Não informado";	
					
		return nomeObito;
	}

	/**
	 * Returns the nomeRegistroPolicial.
	 * @return String
	 */
	public String getNomeRegistroPolicial() {
		
		if(registroPolicial == 'S')
			nomeRegistroPolicial = "Sim";
		else
		if(registroPolicial == 'N')
			nomeRegistroPolicial = "Não";		
		else
			nomeRegistroPolicial = "Não informado";			
		return nomeRegistroPolicial;
	}

	/**
	 * Returns the nomeLocalAtendimento.
	 * @return String
	 */
	public String getNomeLocalAtendimento() throws Exception{
		
		if(nomeLocalAtendimento == null){
			try {
				LocalAtendimento m = ObjLocalAtendimento.findByPrimaryKey(localAtendimento);
				nomeLocalAtendimento = m.getNome();		
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeLocalAtendimento RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeLocalAtendimento Exception=> " + e.getMessage());
			}
		}			
		
		return nomeLocalAtendimento;
	}

	/**
	 * Returns the nomeAfastamento.
	 * @return String
	 */
	public String getNomeAfastamento() {
		
		if(afastamento == 'S')
			nomeAfastamento = "Sim";
		else
		if(afastamento == 'N')
			nomeAfastamento = "Não";		
		else
			nomeAfastamento = "Não informado";	
					
		return nomeAfastamento;
	}

	/**
	 * Returns the nomeInternacao.
	 * @return String
	 */
	public String getNomeInternacao() {
		
		if(internacao == 'S')
			nomeInternacao = "Sim";
		else
		if(internacao == 'N')
			nomeInternacao = "Não";		
		else
			nomeInternacao = "Não informado";						
		
		return nomeInternacao;
	}

	/**
	 * Returns the nomeDiagnostico.
	 * @return String
	 */
	public String getNomeDiagnostico() throws Exception{
		
		if(nomeDiagnostico == null){
			try {
				Diagnostico m = ObjDiagnostico.findByPrimaryKey(diagnostico);
				nomeDiagnostico = m.getNome();		
			} catch (RemoteException e) {
				//throw new Exception(" ObjTestemunha getNomeDiagnostico RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjTestemunha getNomeDiagnostico Exception=> " + e.getMessage());
			}
		}			
		
		return nomeDiagnostico;
	}

	/**
	 * Returns the nomeFonte.
	 * @return String
	 */
	public String getNomeFonte() throws Exception{
		
		if(nomeFonte == null){
			try {
				Fonte m = ObjFonte.findByPrimaryKey(fonte);
				nomeFonte = m.getNome();		
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeFonte RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeFonte Exception=> " + e.getMessage());
			}	
		}			
		
		return nomeFonte;
	}

	/**
	 * Returns the nomeUFCRM.
	 * @return String
	 */
	public String getNomeUFCRM() throws Exception{
		
		if(nomeUFCRM == null){
			try {
				Estado m = ObjEstado.findByPrimaryKey(ufCRM);
				nomeUFCRM = m.getNome();		
			} catch (RemoteException e) {
				//throw new Exception(" ObjAcidente getNomeUFCRM RemoteException=> " + e.getMessage());
			} catch (Exception e) {
				//throw new Exception(" ObjAcidente getNomeUFCRM Exception=> " + e.getMessage());
			}
		}			
		
		
		return nomeUFCRM;
	}

	public int[] getArLocaisLesao(){
		
		int[] locaisLesaoAcidente = null;
		
		if(vLocalLesaoAcidente.length >= 1){
			locaisLesaoAcidente = new int[vLocalLesaoAcidente.length];
			
			for(int i=0; i < vLocalLesaoAcidente.length; i++)
				locaisLesaoAcidente[i] = vLocalLesaoAcidente[i].getLocalLesao();
		}
			
		return locaisLesaoAcidente;
	}

	/**
	 * Returns the nomeResponsavel.
	 * @return String
	 */
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	/**
	 * Sets the nomeResponsavel.
	 * @param nomeResponsavel The nomeResponsavel to set
	 */
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	/**
	 * Returns the orgaoExpedidorRG.
	 * @return String
	 */
	public String getOrgaoExpedidorRG() {
		return orgaoExpedidorRG;
	}

	/**
	 * Sets the orgaoExpedidorRG.
	 * @param orgaoExpedidorRG The orgaoExpedidorRG to set
	 */
	public void setOrgaoExpedidorRG(String orgaoExpedidorRG) {
		this.orgaoExpedidorRG = orgaoExpedidorRG;
	}

	/**
	 * Returns the distritoSaude.
	 * @return String
	 */
	public String getDistritoSaude() {
		return distritoSaude;
	}

	/**
	 * Sets the distritoSaude.
	 * @param distritoSaude The distritoSaude to set
	 */
	public void setDistritoSaude(String distritoSaude) {
		this.distritoSaude = distritoSaude;
	}
	
	public AuxTestemunha[] getAuxTestemunha(){
		
		AuxTestemunha[] at = null;
		
		if(vTestemunhas.length >= 1){
			at = new AuxTestemunha[vTestemunhas.length];
			
			for(int i=0;i<vTestemunhas.length;i++){
				System.out.println("numero da testemunha no getAuxTestemunha=> " + vTestemunhas[i].getNumeroTestemunha());
				
				at[i] = new AuxTestemunha(	vTestemunhas[i].getNomeTestemunha(),
											vTestemunhas[i].getMunicipioTestemunha(),
											vTestemunhas[i].getRuaTestemunha(),
											vTestemunhas[i].getBairroTestemunha(),
											vTestemunhas[i].getNumeroTestemunha(),
											vTestemunhas[i].getComplementoTestemunha(),
											vTestemunhas[i].getCepTestemunha(),
											vTestemunhas[i].getDddTestemunha(),
											vTestemunhas[i].getTelefoneTestemunha());
			}
		}			
		
		return at;
	} 

	/**
	 * Returns the descricaoDiagnostico.
	 * @return String
	 */
	public String getDescricaoDiagnostico() {
		return descricaoDiagnostico;
	}

	/**
	 * Sets the descricaoDiagnostico.
	 * @param descricaoDiagnostico The descricaoDiagnostico to set
	 */
	public void setDescricaoDiagnostico(String descricaoDiagnostico) {
		this.descricaoDiagnostico = descricaoDiagnostico;
	}



	public synchronized void save() throws Exception/*throws Exception*/ {
		
			try {
				InitialContext ctx = new InitialContext();
				
				AcidenteTransactionHome home = (AcidenteTransactionHome)ctx.lookup("ejb/br/smat/transaction/acidentetransaction/AcidenteTransactionHome");
				
				AcidenteTransaction  act = home.create();
				
				if(dataEmissaoCTPS == null || dataEmissaoCTPS.trim().length() == 0)
					dataEmissaoCTPS = null;
					
				if(dataEmissaoRG == null || dataEmissaoRG.trim().length() == 0)
					dataEmissaoRG = null;
					
				if(dataUltimodiaTrab == null || dataUltimodiaTrab.trim().length() == 0)
					dataUltimodiaTrab = null;
					
				if(dataAtestado == null || dataAtestado.trim().length() == 0){
					dataAtestado = null;
					horaAtestado = null;
				}
				
				if(horaAtestado == null || horaAtestado.trim().length() == 0){
					dataAtestado = null;
					horaAtestado = null;
				}
				
				String remuneracaoTrabalhador = "0";
				if(remuneracaoMensal != null)
					if(remuneracaoMensal.length() > 0)
						remuneracaoTrabalhador = remuneracaoMensal.replace(',','.');

				/*************************** Ultimas validações *****************************/						
				errors = null;
								
				if(!(ValidacoesFormulario.comparaDatas(dataNascimento,dataAcidente) == -1)){
					setErro("dataAcidente","error.dataacidente.dataacidentemaiornascimento");
					
				}
											
				if(dataEmissaoCTPS != null)							
				if(!(ValidacoesFormulario.comparaDatas(dataNascimento,dataEmissaoCTPS) == -1)){
					setErro("dataemissaoctps","error.dataacidente.datactpsmaiornascimento");
				}											

				if(dataEmissaoRG != null)							
				if(!(ValidacoesFormulario.comparaDatas(dataNascimento,dataEmissaoRG) == -1)){
					setErro("dataemissaorg","error.dataacidente.datargmaiornascimento");
				}						
					
					
				if(ValidacoesFormulario.comparaDatas(dataAcidente,dataEmissaoFonte) == 1){
					setErro("dataemissaofonte","error.dataemissaofonte.invalida");	
				}					
					
				if(dataAtestado != null)																	
					if(ValidacoesFormulario.comparaDatas(dataAtestado,dataAcidente) == 0){
						if(Integer.parseInt(ValidacoesFormulario.retiraCharAlfabeticos(horaAtestado)) < 
						   Integer.parseInt(ValidacoesFormulario.retiraCharAlfabeticos(hora))){
							setErro("horaatestado","error.horaatestado.invalida");	
						}
					}
					else
					if(ValidacoesFormulario.comparaDatas(dataAtestado,dataAcidente) == -1){
							setErro("dataatestado","error.dataatestado.maiorquedataacidente");	
					}		
					
					if(errors == null || errors.empty()){						
						act.armazenaAcidente(	acidente,
												empresa,
												emitente,
												FuncoesComuns.setNullSeVazio(nome),
												FuncoesComuns.setNullSeVazio(nomeResponsavel),
												FuncoesComuns.setNullSeVazio(dataNascimento),
												FuncoesComuns.setNullSeVazio(sexo),
												estadoCivil,
												ctps,
												serie,
												FuncoesComuns.setNullSeVazio(dataEmissaoCTPS),
												ufCTPS,
												FuncoesComuns.setNullSeVazio(remuneracaoTrabalhador),
												FuncoesComuns.setNullSeVazio(rg),
												FuncoesComuns.setNullSeVazio(dataEmissaoRG),
												FuncoesComuns.setNullSeVazio(orgaoExpedidorRG),
												ufRG,
												FuncoesComuns.setNullSeVazio(cpf),
												FuncoesComuns.setNullSeVazio(pisPasepNit),
												municipio,
												FuncoesComuns.setNullSeVazio(rua),
												numero,
												FuncoesComuns.setNullSeVazio(bairro),
												FuncoesComuns.setNullSeVazio(complemento),
												FuncoesComuns.setNullSeVazio(cep),
												FuncoesComuns.setNullSeVazio(ddd),
												FuncoesComuns.setNullSeVazio(telefone),
												vinculoEmpregaticio,
												ocupacao,
												area,
												FuncoesComuns.setNullSeVazio(String.valueOf(aposentado)),
												trabalhador,
												empresaTerceira,
												FuncoesComuns.setNullSeVazio(dataAcidente),
												FuncoesComuns.setNullSeVazio(hora),
												horasTrabalhadas,
												tipoAcidente,
												FuncoesComuns.setNullSeVazio(dataUltimodiaTrab),
												tipoLocalAcidente,
												FuncoesComuns.setNullSeVazio(descricaoLocal),
												estadoAcidente,
												municipioAcidente,
												this.getArLocaisLesao(),
												agenteCausador,
												FuncoesComuns.setNullSeVazio(descricaoSituacaoGeradora),
												FuncoesComuns.setNullSeVazio(String.valueOf(registroPolicial)),
												FuncoesComuns.setNullSeVazio(String.valueOf(amputacao)),
												FuncoesComuns.setNullSeVazio(String.valueOf(obito)),
												this.getAuxTestemunha(),
												medico,
												FuncoesComuns.setNullSeVazio(medicoNome),
												localAtendimento,
												FuncoesComuns.setNullSeVazio(dataAtestado),
												FuncoesComuns.setNullSeVazio(horaAtestado),
												FuncoesComuns.setNullSeVazio(String.valueOf(internacao)),
												FuncoesComuns.setNullSeVazio(String.valueOf(afastamento)),
												duracaoTratamento,
												FuncoesComuns.setNullSeVazio(descNaturezaLesao),
												diagnostico,
												FuncoesComuns.setNullSeVazio(observacoes),
												crm,
												ufCRM,
												fonte,
												FuncoesComuns.setNullSeVazio(numDocFonte),
												FuncoesComuns.setNullSeVazio(dataEmissaoFonte),
												FuncoesComuns.setNullSeVazio(distritoSaude),
												FuncoesComuns.setNullSeVazio(descricaoDiagnostico));
						
						System.out.println("AAAAAA1");
						act.save();
						System.out.println("AAAAAA2");
					}
			} catch (RemoteException e) {
				System.out.println("****************************");
				System.out.println("****** OBJACIDENTE RemoteException*****");				
			//	e.printStackTrace();
				System.out.println("****************************");					
				throw new  Exception("ObjAcidente RemoteException Erro ao inserir acidente " + e.getMessage());
			} catch (NamingException e) {
			//	System.out.println("****************************");
			//	System.out.println("****** OBJACIDENTE NamingException*****");				
			///	e.printStackTrace();
			//	System.out.println("****************************");					
				//throw new  Exception("ObjAcidente NamingException Erro ao inserir acidente " + e.getMessage());				
			} catch (CreateException e) {
				System.out.println("****************************");
				System.out.println("****** OBJACIDENTE CreateException*****");				
			//	e.printStackTrace();
				System.out.println("****************************");					
				//e.printStackTrace();
				throw new  Exception("ObjAcidente CreateException Erro ao inserir acidente " + e.getMessage());				
			} catch (Exception e) {
				System.out.println("****************************");
				System.out.println("****** OBJACIDENTE Exception*****");				
		//		e.printStackTrace();
				System.out.println("****************************");				
				throw new  Exception("ObjAcidente CreateException Erro ao inserir acidente " + e.getMessage());				
			}		
			System.out.println("passou por alguma?????????????????????????");
	}

	/**
	 * Returns the destinoPermitido.
	 * @return String
	 */
	public String getDestinoPermitido() {
		return destinoPermitido;
	}

	/**
	 * Sets the destinoPermitido.
	 * @param destinoPermitido The destinoPermitido to set
	 */
	public void setDestinoPermitido(String destinoPermitido) {
		this.destinoPermitido = destinoPermitido;
	}
	/**
	 * Returns the errors.
	 * @return ActionErrors
	 */
	public ActionErrors getErrors() {
		return errors;
	}
	
	private void setErro(String campo,String erro){
		
		if(errors == null)
			errors = new ActionErrors();
		
		errors.add(campo,new ActionError(erro));	
	}
	
	public static ObjAcidente getInstanciaAcidente(int acidente) throws Exception{
		
		
			InitialContext ctx;
			Acidente a = null;
			Empregador e = null,eTerc = null;
			Trabalhador t = null;
			Municipio mTrab = null,mAcid = null;
			Regional rTrab = null,rAcid = null;
			Medico med = null;
			AuxLocalLesao[] auxLocalLesao = null;
			AuxTestemunha[] auxTestemunha = null;
			ObjLocalLesaoAcidente[] objLocalLesaoAcidente = null;
			ObjTestemunha[] objTestemunha = null;
			
			ObjAcidente objAcidente = null;			

			//acidente

			String dataDiagnostico = null;
			String horaDiagnostico = null;
			int emitente = 0;
			String remuneracao =null;
			int vinculoEmpregaticio = 0;
			int ocupacao = 0;
			int area = 0;
			int tipoAcidente = 0;
			int tipoLocalAcidente = 0;
			int municipio = 0;
			int agenteCausador = 0;
			int localAtendimento = 0;
			int diagnostico = 0;
			int fonte = 0;
							
			//empregador
			int empregador = 0;
			String documentoEmpregador = null;			
			String razaoSocial = null;
			
			//trabalhador
			int trabalhador = 0;
			String nomeTrabalhador = null;
			String nomeResponsavel = null;
			String dataNascimento = null;
			String sexo = null;
			int estadoCivil = 0;
			int carteiraTrabalho = 0;
			int serie = 0;
			String dataEmissaoCTPS = null;
			int ufCTPS = 0;
			String rg = null;
			String dataEmissaoRG = null;
			String orgaoExpedidorRG = null;
			int ufRG = 0;
			String cpf = null;
			String pisPasepNit = null;
			int    estadoTrabalhador = 0;
			int municipioTrabalhador = 0;
			String ruaTrabalhador = null;
			int numeroTrabalhador = 0;
			String bairroTrabalhador = null;
			String complementoTrabalhador = null;
			String cepTrabalhador = null;
			String dddTrabalhador = null;			
			String telefoneTrabalhador = null;
			
			//empresaTerceira
			int empresaTerc = 0;
			String documentoEmpresaTerc = null;
			String razaoSocialEmpresaTerc = null;
			
			//medico
			int medico = 0;
			int crm = 0;
			int estadoMedico = 0;
			String nomeMedico = null;
			
	
			try {
				ctx = new InitialContext();
				AcidenteHome home = (AcidenteHome)ctx.lookup("ejb/br/smat/ejb/acidente/AcidenteHome");
				a = (Acidente)home.findByPrimaryKey(new AcidenteKey(acidente));
				
				if(a.getDataHoraDiagnostico() != null){
					dataDiagnostico = a.getDataHoraDiagnostico().substring(0,10);
					horaDiagnostico = a.getDataHoraDiagnostico().substring(11,16);
				}
				
				if(a.getEmitente() != null)
					emitente = a.getEmitente().emitente;

				remuneracao = String.valueOf(a.getRemuneracao());
				
				if(a.getVinculoEmpregaticio() != null)
					vinculoEmpregaticio = a.getVinculoEmpregaticio().vinculoEmpregaticio;
				
				if(a.getOcupacao() != null)
					ocupacao = a.getOcupacao().ocupacao;

				if(a.getArea() != null)
					area = a.getArea().area;
					
				if(a.getTipoAcidente() != null)
					tipoAcidente = a.getTipoAcidente().tipoAcidente;
					
				if(a.getTipoLocalAcidente() != null)
					tipoLocalAcidente = a.getTipoLocalAcidente().tipoLocalAcidente;
					
				if(a.getMunicipio() != null)
					municipio = a.getMunicipio().municipio;
				
				if(a.getAgenteCausador() != null)
					agenteCausador = a.getAgenteCausador().agenteCausador;
				
				if(a.getLocalAtendimento() != null)
					localAtendimento = a.getLocalAtendimento().localAtendimento;

				if(a.getDiagnostico() != null)					
					diagnostico = a.getDiagnostico().diagnostico;

				if(a.getFonte() != null)
					fonte = a.getFonte().fonte;
				
				if(a.getEmpregador() != null){
				
					
					empregador = a.getEmpregador().empregador;
					
					e = ObjEmpregador.findByPrimaryKey(empregador);
					

					documentoEmpregador = e.getDocumento();			
					razaoSocial = e.getRazaoSocial();

				}
				

				if(a.getEmpregadorTerceiro() != null){
					empresaTerc = a.getEmpregadorTerceiro().empregador;

					eTerc = ObjEmpregador.findByPrimaryKey(empresaTerc);

					
					documentoEmpresaTerc = eTerc.getDocumento();
					razaoSocialEmpresaTerc = eTerc.getRazaoSocial();					
				}


				if(a.getTrabalhador() != null){

					trabalhador = a.getTrabalhador().trabalhador;
					
					t = ObjTrabalhador.findByPrimaryKey(trabalhador);
										
					nomeTrabalhador = t.getNome();
					nomeResponsavel = t.getNomeResponsavel();
					dataNascimento = t.getDataNascimento();
					sexo = t.getSexo();
					
					if(t.getEstadoCivil() != null)
						estadoCivil = t.getEstadoCivil().estadoCivil;

					carteiraTrabalho = t.getCarteiraTrabalho();
					serie = t.getSerie();
					dataEmissaoCTPS = t.getDataEmissaoCTPS();
					
					if(t.getUfCTPS() != null)
						ufCTPS = t.getUfCTPS().estado;

					rg = t.getRg();
					dataEmissaoRG = t.getDataEmissaoRG();
					orgaoExpedidorRG = t.getOrgaoExpedidorRG();

					if(t.getUfRG() != null)					
						ufRG = t.getUfRG().estado;
						
					cpf = t.getCpf();
					
					pisPasepNit = t.getPisPasepNit();
					
					
					if(t.getMunicipio() != null)
						mTrab = ObjMunicipio.findByPrimaryKey(t.getMunicipio().municipio);


					if(mTrab != null){
						rTrab = ObjRegional.findByPrimaryKey(mTrab.getRegional().regional);
					}

					if(rTrab != null)					
						estadoTrabalhador = rTrab.getEstado().estado;

									
					if(t.getMunicipio() != null)
						municipioTrabalhador = t.getMunicipio().municipio;

					
					ruaTrabalhador = t.getRua();
					numeroTrabalhador = t.getNumero();
					bairroTrabalhador = t.getBairro();
					complementoTrabalhador = t.getComplemento();
					cepTrabalhador = t.getCep();
					dddTrabalhador = t.getDdd();			
					telefoneTrabalhador = t.getTelefone();
				}

							
				mAcid = ObjMunicipio.findByPrimaryKey(a.getMunicipio().municipio);
				rAcid = ObjRegional.findByPrimaryKey(mAcid.getRegional().regional);
				
				if(a.getMedico() != null){

					medico = a.getMedico().medico;
					
					med = ObjMedico.findByPrimaryKey(medico);
					
					crm = med.getCrm();
					estadoMedico = med.getUfCRM().estado;
					nomeMedico = med.getNome();					
				}

				auxLocalLesao = a.getLocaisLesao();
				
				auxTestemunha = a.getTestemunhas();
			
				if(auxLocalLesao != null){
					objLocalLesaoAcidente = new ObjLocalLesaoAcidente[auxLocalLesao.length];

					for(int i = 0;i<auxLocalLesao.length;i++)
						objLocalLesaoAcidente[i] = new ObjLocalLesaoAcidente(i+1,auxLocalLesao[i].getLocalLesao(),a.getAcidente(),auxLocalLesao[i].getNomeLocalLesao());
				}
	
				if(auxTestemunha != null){
					objTestemunha = new ObjTestemunha[auxTestemunha.length];

					for(int i = 0;i<auxTestemunha.length;i++){
						 				
						objTestemunha[i] = new ObjTestemunha(i + 1,
															 a.getAcidente(),
															 i + 1,
															 auxTestemunha[i].getNome(),
															 auxTestemunha[i].getEstado(),
															 auxTestemunha[i].getMunicipio(),
															 auxTestemunha[i].getRua(),
															 auxTestemunha[i].getBairro(),
															 auxTestemunha[i].getNumero(),
															 auxTestemunha[i].getComplemento(),
															 auxTestemunha[i].getCep(),
															 auxTestemunha[i].getTelefone(),
															 auxTestemunha[i].getDdd());
					}
					
				}

				System.out.println("descricao do local => " + a.getDescLocalAcidente());

				objAcidente = new ObjAcidente(a.getAcidente(),
												empregador,
												emitente,
												documentoEmpregador,
												razaoSocial,
												nomeTrabalhador,
												nomeResponsavel,
												dataNascimento,
												sexo,
												estadoCivil,
												carteiraTrabalho,
												serie,
												dataEmissaoCTPS,
												ufCTPS,
												remuneracao,
												rg,
												dataEmissaoRG,
												orgaoExpedidorRG,
												ufRG,
												cpf,
												pisPasepNit,
												estadoTrabalhador,
												municipioTrabalhador,
												ruaTrabalhador,
												numeroTrabalhador,
												bairroTrabalhador,
												complementoTrabalhador,
												cepTrabalhador,
												dddTrabalhador,
												telefoneTrabalhador,
												vinculoEmpregaticio,
												ocupacao,
												area,
												a.getAposentado().trim().charAt(0),
												trabalhador,
												empresaTerc,
												a.getDataAcidente().substring(0,10),
												a.getDataAcidente().substring(11,16),
												a.getHorasTrabalhadas(),
												tipoAcidente,
												a.getUltimaTrabalhado(),
												tipoLocalAcidente,
												a.getDescLocalAcidente(),
												documentoEmpresaTerc,
												razaoSocialEmpresaTerc,
												rAcid.getEstado().estado,
												municipio,
												0,
												0,
												objLocalLesaoAcidente,
												0,
												0,
												agenteCausador,
												a.getDescricaoSituacaoGeradora(),
												a.getRegistroPolicial().trim().charAt(0),
												a.getAmputacao().trim().charAt(0),
												a.getObito().trim().charAt(0),
												objTestemunha,
												medico,
												localAtendimento,
												dataDiagnostico,
												horaDiagnostico,
												a.getInternacao().trim().charAt(0),
												a.getAfastamento().trim().charAt(0),
												a.getDuracaoTratamento(),
												a.getNaturezaLesao(),
												diagnostico,
												a.getObservacaoDiagnostico(),
												a.getDescricaoDiagnostico(),
												crm,
												estadoMedico,
												nomeMedico,
												fonte,
												a.getNumDocFonte(),
												a.getDataEmissaoFonte(),
												a.getDistritoSaude());
				
				objAcidente.setInvestigacao(a.getInvestigacao());

			}catch (NamingException e1) {
				System.out.println("ObjAcidente getInstanciaAcidente NamingException=> " + e1.getMessage());
				throw new Exception("ObjAcidente getInstanciaAcidente NamingException=> " + e1.getMessage());
			}catch (RemoteException e1) {
				System.out.println(" ObjAcidente getInstanciaAcidente RemoteException=> " + e1.getMessage());
				throw new Exception(" ObjAcidente getInstanciaAcidente RemoteException=> " + e1.getMessage());
			} catch (FinderException e1) {
				throw new Exception("ObjAcidente getInstanciaAcidente FinderException=> " + e1.getMessage());
			} catch (Exception e1) {
				System.out.println("ObjAcidente getInstanciaAcidente FinderException=> " + e1.getMessage());				
						throw new Exception("ObjUsuario getInstanciaAcidente Exception=> " + e1.getMessage());
			}

			return objAcidente;
		
		
	}
	
	
	/**
	 * Returns the investigacao.
	 * @return int
	 */
	public int getInvestigacao() {
		return investigacao;
	}

	/**
	 * Sets the investigacao.
	 * @param investigacao The investigacao to set
	 */
	public void setInvestigacao(int investigacao) {
		this.investigacao = investigacao;
	}

	/**
	 * Returns the dataAberturaInvestigacao.
	 * @return String
	 */
	public String getDataAberturaInvestigacao() {
		return dataAberturaInvestigacao;
	}

	/**
	 * Returns the dataFinalizacaoInvestigacao.
	 * @return String
	 */
	public String getDataFinalizacaoInvestigacao() {
		return dataFinalizacaoInvestigacao;
	}

	/**
	 * Sets the dataAberturaInvestigacao.
	 * @param dataAberturaInvestigacao The dataAberturaInvestigacao to set
	 */
	public void setDataAberturaInvestigacao(String dataAberturaInvestigacao) {
		this.dataAberturaInvestigacao = dataAberturaInvestigacao;
	}

	/**
	 * Sets the dataFinalizacaoInvestigacao.
	 * @param dataFinalizacaoInvestigacao The dataFinalizacaoInvestigacao to set
	 */
	public void setDataFinalizacaoInvestigacao(String dataFinalizacaoInvestigacao) {
		this.dataFinalizacaoInvestigacao = dataFinalizacaoInvestigacao;
	}

}
