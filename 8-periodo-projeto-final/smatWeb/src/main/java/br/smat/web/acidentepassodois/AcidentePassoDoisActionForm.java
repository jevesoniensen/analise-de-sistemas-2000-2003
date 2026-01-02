package br.smat.web.acidentepassodois;

import java.util.Vector;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.util.FuncoesComuns;
import br.smat.util.ValidacoesFormulario;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 23 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>acidente - [your comment here]
 * <li>empresaTerceira - [your comment here]
 * <li>dataAcidente - [your comment here]
 * <li>hora - [your comment here]
 * <li>horasTrabalhadas - [your comment here]
 * <li>tipoAcidente - [your comment here]
 * <li>tipoLocal - [your comment here]
 * <li>descricaoLocal - [your comment here]
 * <li>documentoEmpresaTerceira - [your comment here]
 * <li>razaoSocialEmpresaterceira - [your comment here]
 * <li>estado - [your comment here]
 * <li>municipioAcidente - [your comment here]
 * <li>localLesaoPai - [your comment here]
 * <li>localLesao - [your comment here]
 * <li>locaisLesaoAcidente - [your comment here]
 * <li>agenteCausadorVo - [your comment here]
 * <li>agenteCausadorPai - [your comment here]
 * <li>agenteCausador - [your comment here]
 * <li>descricaoSituacaoGeradora - [your comment here]
 * <li>registroPolicial - [your comment here]
 * <li>amputacao - [your comment here]
 * <li>obito - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class AcidentePassoDoisActionForm extends ActionForm {

	private String 	paginaAtual = null;
	private String 	acao = null;
	private String		destino = null;
		
	private int 		acidente = 0;
	private int	 	empresaTerceira = 0;
	private String 	dataAcidente = null;
	private String 	hora = null;
	private int	 	horasTrabalhadas = 0;
	private int 		tipoAcidente;
	private int 		tipoLocalAcidente;
	private String 	descricaoLocal = null;
	private String 	documentoEmpresaTerceira = null;
	private String 	razaoSocialEmpresaterceira = null;
	private int 		estadoAcidente;
	private int 		municipioAcidente;
	private int 		localLesaoPai;
	private int 		localLesao;
	private int		agenteCausadorVo;
	private int 		agenteCausadorPai;
	private int 		agenteCausador;
	private String 	descricaoSituacaoGeradora = null;
	private char 		registroPolicial;
	private char 		amputacao;
	private char		obito;
	private boolean 	zeraDemaisAgentes = false;
	private int		index = 0;
	private String		distritoSaude = null;
	private String  	dataUltimodiaTrab = null;	
	private ActionErrors errors;

	private String dataAtual;
	private String horaAtual;

	/**
	 * Get acao
	 * @return String
	 */
	public String getAcao() {
		return acao;
	}

	/**
	 * Set acao
	 * @param <code>String</code>
	 */
	public void setAcao(String a) {
		acao = a;
	}

	/**
	 * Get empresaTerceira
	 * @return String
	 */
	public int getEmpresaTerceira() {
		return empresaTerceira;
	}

	/**
	 * Set empresaTerceira
	 * @param <code>String</code>
	 */
	public void setEmpresaTerceira(int e) {
		empresaTerceira = e;
	}
	/**
	 * Get dataAcidente
	 * @return String
	 */
	public String getDataAcidente() {
		return dataAcidente;
	}

	/**
	 * Set dataAcidente
	 * @param <code>String</code>
	 */
	public void setDataAcidente(String d) {
		String erro = null;
		if(d != null)
			if((erro = FuncoesComuns.validateData(d,"dataacidente")) != null )
				setErro("dataacidente",erro);
			else
				if(ValidacoesFormulario.comparaDatas(d,dataAtual) == 1)
					setErro("dataacidente","error.datacidente.datainfmaiorqueatual");	
						
		dataAcidente = d;
	}
	/**
	 * Get hora
	 * @return String
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * Set hora
	 * @param <code>String</code>
	 */
	public void setHora(String h) {
		
		String erro = null;
		if(h != null){
			if((erro = FuncoesComuns.validateHora(h,"horaacidente")) != null )
				setErro("horaacidente",erro);	
		}
		
		hora = h;
	}
	/**
	 * Get horasTrabalhadas
	 * @return String
	 */
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	/**
	 * Set horasTrabalhadas
	 * @param <code>String</code>
	 */
	public void setHorasTrabalhadas(int h) {		
		horasTrabalhadas = h;
	}
	/**
	 * Get tipoAcidente
	 * @return int
	 */
	public int getTipoAcidente() {
		return tipoAcidente;
	}

	/**
	 * Set tipoAcidente
	 * @param <code>int</code>
	 */
	public void setTipoAcidente(int t) {
		
		if(t == 0)
			setErro("tipoacidente","error.tipoacidente.required");
		
		tipoAcidente = t;
	}
	/**
	 * Get tipoLocalAcidente
	 * @return int
	 */
	public int getTipoLocalAcidente() {
		return tipoLocalAcidente;
	}

	/**
	 * Set tipoLocal
	 * @param <code>int</code>
	 */
	public void setTipoLocalAcidente(int t) {
		
		if(t == 0)
			setErro("tipolocalacidente","error.tipolocalacidente.required");
		
		tipoLocalAcidente = t;
	}
	/**
	 * Get descricaoLocal
	 * @return String
	 */
	public String getDescricaoLocal() {
		return descricaoLocal;
	}

	/**
	 * Set descricaoLocal
	 * @param <code>String</code>
	 */
	public void setDescricaoLocal(String d) {
		
		if(d != null)
			if(d.trim().length() > 0)
				if(FuncoesComuns.isNumeric(d.trim()))
					setErro("descricaolocal","error.descricaolocal.invalida");
				else
				if(d.length() >= 255)
					setErro("descricaolocal","error.descricaolocal.maiorquepermitido");
		
		descricaoLocal = d;
	}
	/**
	 * Get documentoEmpresaTerceira
	 * @return String
	 */
	public String getDocumentoEmpresaTerceira() {
		return documentoEmpresaTerceira;
	}

	/**
	 * Set documentoEmpresaTerceira
	 * @param <code>String</code>
	 */
	public void setDocumentoEmpresaTerceira(String d) {
		documentoEmpresaTerceira = d;
	}
	/**
	 * Get razaoSocialEmpresaterceira
	 * @return String
	 */
	public String getRazaoSocialEmpresaterceira() {
		return razaoSocialEmpresaterceira;
	}

	/**
	 * Set razaoSocialEmpresaterceira
	 * @param <code>String</code>
	 */
	public void setRazaoSocialEmpresaterceira(String r) {
		razaoSocialEmpresaterceira = r;
	}
	/**
	 * Get estado
	 * @return int
	 */
	public int getEstadoAcidente() {
		return estadoAcidente;
	}

	/**
	 * Set estado
	 * @param <code>int</code>
	 */
	public void setEstadoAcidente(int e) {
		
		if(e == 0)
			setErro("estadoacidente","error.estadoacidente.required");
		
		estadoAcidente = e;
	}
	/**
	 * Get municipioAcidente
	 * @return int
	 */
	public int getMunicipioAcidente() {
		
		return municipioAcidente;
	}

	/**
	 * Set municipioAcidente
	 * @param <code>int</code>
	 */
	public void setMunicipioAcidente(int m) {
		
		if(m == 0)
			setErro("municipioacidente","error.municipioacidente.required");		
				
		municipioAcidente = m;
	}
	/**
	 * Get localLesaoPai
	 * @return int
	 */
	public int getLocalLesaoPai() {
		return localLesaoPai;
	}

	/**
	 * Set localLesaoPai
	 * @param <code>int</code>
	 */
	public void setLocalLesaoPai(int l) {
		localLesaoPai = l;
	}
	/**
	 * Get localLesao
	 * @return int
	 */
	public int getLocalLesao() {
		return localLesao;
	}

	/**
	 * Set localLesao
	 * @param <code>int</code>
	 */
	public void setLocalLesao(int l) {
		localLesao = l;
	}

	/**
	 * Get agenteCausadorVo
	 * @return int
	 */
	public int getAgenteCausadorVo() {
		return agenteCausadorVo;
	}

	/**
	 * Set agenteCausadorVo
	 * @param <code>int</code>
	 */
	public void setAgenteCausadorVo(int a) {	
	
		if(this.getAgenteCausadorVo() != a)
			zeraDemaisAgentes = true;
		
		this.agenteCausadorVo = a;
	}
	/**
	 * Get agenteCausadorPai
	 * @return int
	 */
	public int getAgenteCausadorPai() {
		return agenteCausadorPai;
	}

	/**
	 * Set agenteCausadorPai
	 * @param <code>int</code>
	 */
	public void setAgenteCausadorPai(int a) {
		agenteCausadorPai = a;
	}
	/**
	 * Get agenteCausador
	 * @return int
	 */
	public int getAgenteCausador() {
				
		return agenteCausador;
	}

	/**
	 * Set agenteCausador
	 * @param <code>int</code>
	 */
	public void setAgenteCausador(int a) {
		
		if(a == 0)
			setErro("agentecausador","error.agentecausador.required");
		
		agenteCausador = a;
	}
	/**
	 * Get descricaoSituacaoGeradora
	 * @return String
	 */
	public String getDescricaoSituacaoGeradora() {
		return descricaoSituacaoGeradora;
	}

	/**
	 * Set descricaoSituacaoGeradora
	 * @param <code>String</code>
	 */
	public void setDescricaoSituacaoGeradora(String d) {
		if(d != null)
			if(d.trim().length() > 0)
				if(FuncoesComuns.isNumeric(d.trim()))
					setErro("descricaolocal","error.descricaosituacaogeradora.invalida");
				else
				if(d.length() >= 255)
					setErro("descricaolocal","error.descricaosituacaogeradora.maiorquepermitido");					
							
		descricaoSituacaoGeradora = d;
	}
	/**
	 * Get registroPolicial
	 * @return char
	 */
	public char getRegistroPolicial() {
		return registroPolicial;
	}

	/**
	 * Set registroPolicial
	 * @param <code>char</code>
	 */
	public void setRegistroPolicial(char r) {
		registroPolicial = r;
	}
	/**
	 * Get amputacao
	 * @return char
	 */
	public char getAmputacao() {
		return amputacao;
	}

	/**
	 * Set amputacao
	 * @param <code>char</code>
	 */
	public void setAmputacao(char a) {
		amputacao = a;
	}
	/**
	 * Get obito
	 * @return char
	 */
	public char getObito() {
		return obito;
	}

	/**
	 * Set obito
	 * @param <code>char</code>
	 */
	public void setObito(char o) {
		obito = o;
	}

	/**
	 * Returns the destino.
	 * @return String
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * Sets the destino.
	 * @param destino The destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
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
	 * Returns the acidente.
	 * @return int
	 */
	public int getAcidente() {
		return acidente;
	}

	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(int acidente) {
		this.acidente = acidente;
	}

	/**
	 * Returns the index.
	 * @return int
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Sets the index.
	 * @param index The index to set
	 */
	public void setIndex(int index) {
		this.index = index;
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
	public void setDataUltimodiaTrab(String d) {
		String erro = null;
		if(d != null)
			if(d.length() > 0)
				if((erro = FuncoesComuns.validateData(d,"dataultimodiatrabalhado")) != null ){
					setErro("dataultimodiatrabalhado",erro);
				}
				else{
					if(ValidacoesFormulario.comparaDatas(d,dataAtual) == 1)
						setErro("dataultimodiatrabalhado","error.dataultimodiatrabalhado.datainfmaiorqueatual");
					else
						d = d.trim();
				}
					
						
		this.dataUltimodiaTrab = d;
	}
	public AcidentePassoDoisActionForm() {

		super();
		
		try{
		dataAtual = ObjGenerico.getDataAtual();
		horaAtual = ObjGenerico.getHoraAtual();
		}
		catch(Exception e){setErro("dataultimodiatrabalhado","error.bancodedados");}

	}

	public void apagaTodos(){
		acao = "LISTAR";
		dataUltimodiaTrab = null;		
		acidente = 0;
		empresaTerceira = 0;
		dataAcidente = null;
		hora = null;
		horasTrabalhadas = 0;
		tipoAcidente = 0;
		tipoLocalAcidente = 0;
		descricaoLocal = null;
		documentoEmpresaTerceira = null;
		razaoSocialEmpresaterceira = null;
		estadoAcidente = 0;
		municipioAcidente = 0;
		localLesaoPai = 0;
		localLesao = 0;
//		locaisLesaoAcidente = null;
		agenteCausadorVo = 0;
		agenteCausadorPai = 0;
		agenteCausador = 0;
		descricaoSituacaoGeradora = null;
		registroPolicial = ' ';		
		amputacao = ' ';
		obito     = ' ';
		zeraDemaisAgentes = false;
	}

	
	public void apaga(){
		acao = "LISTAR";
		dataUltimodiaTrab = null;		
		acidente = 0;
		empresaTerceira = 0;
		dataAcidente = null;
		hora = null;
		horasTrabalhadas = 0;
		tipoAcidente = 0;
		tipoLocalAcidente = 0;
		descricaoLocal = null;
		documentoEmpresaTerceira = null;
		razaoSocialEmpresaterceira = null;
		estadoAcidente = 0;
		municipioAcidente = 0;
		localLesaoPai = 0;
		localLesao = 0;
//		locaisLesaoAcidente = null;
		agenteCausador = 0;
		descricaoSituacaoGeradora = null;
		registroPolicial = ' ';		
		amputacao = ' ';
		obito     = ' ';
		zeraDemaisAgentes = false;
		errors = null;
	}
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.
		apaga();
	}
	public ActionErrors validate(
		ActionMapping mapping,
		HttpServletRequest request) {
				
/****************************
 * 							*
 * 		Permissão 			*	
 *							* 
 * **************************/
		Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
		
		request.removeAttribute("permissaoPagina");
		
		if(usuario != null){
			try{
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,2));//2 - AcidentePassoDois.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/		
			
		zeraDemaisAgentes = false;		
						
		ActionErrors localErrors;

		if(acao != null)
			if(!acao.equalsIgnoreCase("AVANCAR"))
				errors = null;
			else{
				
				Vector vLocalLesaoAcidente = (Vector)request.getSession().getAttribute("vLocalLesaoAcidente");
				
				if(vLocalLesaoAcidente == null || vLocalLesaoAcidente.size() == 0)
					setErro("locallesaoacidente","error.locallesaoacidente.required");

				if(registroPolicial != 'S' && registroPolicial != 'N' && registroPolicial != 'X')
					setErro("registropolicial","error.registropolicial.required");
					
				if(amputacao != 'S' && amputacao != 'N' && amputacao != 'X')
					setErro("amputacao","error.amputacao.required");

				if(obito != 'S' && obito != 'N' && obito != 'X')
					setErro("obito","error.obito.required");										
					
				if(dataAcidente != null && dataAcidente.length() == 10)	
				if(ValidacoesFormulario.comparaDatas(dataAcidente,dataAtual) == 0)
					if(Integer.parseInt(ValidacoesFormulario.retiraCharAlfabeticos(hora)) > 
					   Integer.parseInt(ValidacoesFormulario.retiraCharAlfabeticos(horaAtual)))
						setErro("horaacidente","error.horaacidente.invalida");
			}
						
		if(errors != null)
			localErrors = errors;
		else
			localErrors = new ActionErrors();
		
		errors = null;				
		
		return localErrors;				
	}

	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
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
		
		if(distritoSaude != null)
			distritoSaude = distritoSaude.trim();
		
		this.distritoSaude = distritoSaude;
	}

}
