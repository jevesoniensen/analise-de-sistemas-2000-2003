package br.smat.web.fiscalizacao.cadastro;

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
 * Users may access 10 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>destino - [your comment here]
 * <li>empregador - [your comment here]
 * <li>fiscalizacao - [your comment here]
 * <li>agenteSaude - [your comment here]
 * <li>docEmpregador - [your comment here]
 * <li>razaoSocial - [your comment here]
 * <li>dataAbertura - [your comment here]
 * <li>titulo - [your comment here]
 * <li>obsGerais - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class CadastroFiscalizacaoActionForm extends ActionForm {

	private String acao = null;
	private String destino = null;
	private int empregador;
	private int fiscalizacao;
	private int agenteSaude = 0;
	private String docEmpregador = null;
	private String razaoSocial = null;
	private String dataAbertura = null;
	private String titulo = null;
	private String obsGerais = null;
	
	private String dataAtual = null;


	private ActionErrors errors = null;
	
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
	 * Get destino
	 * @return String
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * Set destino
	 * @param <code>String</code>
	 */
	public void setDestino(String d) {
		destino = d;
	}
	/**
	 * Get empregador
	 * @return int
	 */
	public int getEmpregador() {
		return empregador;
	}

	/**
	 * Set empregador
	 * @param <code>int</code>
	 */
	public void setEmpregador(int e) {
		
		if(e == 0){
			setErro("empregador","error.empregadorfiscalizacao.required");
		}		
		
		empregador = e;
	}
	/**
	 * Get fiscalizacao
	 * @return int
	 */
	public int getFiscalizacao() {
		return fiscalizacao;
	}

	/**
	 * Set fiscalizacao
	 * @param <code>int</code>
	 */
	public void setFiscalizacao(int f) {
		fiscalizacao = f;
	}
	/**
	 * Get agenteSaude
	 * @return String[]
	 */
	public int getAgenteSaude() {
		return agenteSaude;
	}

	/**
	 * Set agenteSaude
	 * @param <code>String[]</code>
	 */
	public void setAgenteSaude(int a) {
		
		if(a == 0)
			setErro("agenteSaude","error.agentesaudefiscalizacao.required");
		
		agenteSaude = a;
	}
	/**
	 * Get docEmpregador
	 * @return String
	 */
	public String getDocEmpregador() {
		return docEmpregador;
	}

	/**
	 * Set docEmpregador
	 * @param <code>String</code>
	 */
	public void setDocEmpregador(String d) {
		docEmpregador = d;
	}
	/**
	 * Get razaoSocial
	 * @return String
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * Set razaoSocial
	 * @param <code>String</code>
	 */
	public void setRazaoSocial(String r) {
		razaoSocial = r;
	}
	/**
	 * Get dataAbertura
	 * @return String
	 */
	public String getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * Set dataAbertura
	 * @param <code>String</code>
	 */
	public void setDataAbertura(String d) {
		
		String erro = null;
		
		if(d != null){
			if((erro = FuncoesComuns.validateData(d,"dataaberturafiscalizacao")) == null){
				if(ValidacoesFormulario.comparaDatas(d,dataAtual) < 0)
					setErro("dataAbertura","error.dataaberturafiscalizacao.invalida");
			}
			else
				setErro("dataAbertura",erro);
		}
		
		dataAbertura = d;
	}
	/**
	 * Get titulo
	 * @return String
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Set titulo
	 * @param <code>String</code>
	 */
	public void setTitulo(String t) {
		
		if(t == null || t.trim().length() == 0)
			setErro("titulo","error.titulofiscalizacao.required");
		
		titulo = t;
	}
	/**
	 * Get obsGerais
	 * @return String
	 */
	public String getObsGerais() {
		return obsGerais;
	}

	/**
	 * Set obsGerais
	 * @param <code>String</code>
	 */
	public void setObsGerais(String o) {
		
		if(o == null || o.trim().length() == 0)
			setErro("titulo","error.obsgeraisfiscalizacao.required");		
		
		obsGerais = o;
	}
	/**
	* Constructor
	*/
	public CadastroFiscalizacaoActionForm() {

		super();
		
		try {
			dataAtual = ObjGenerico.getDataAtual();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.
		apaga();

	}
	
	public void apaga(){
		
		acao = null;
		destino = null;
		empregador = 0;
		fiscalizacao = 0;
		agenteSaude = 0;
		docEmpregador = null;
		razaoSocial = null;
		dataAbertura = null;
		titulo = null;
		obsGerais = null;
		
		errors = null;
	}
	
	public ActionErrors validate(
		ActionMapping mapping,
		HttpServletRequest request) {
			
		ActionErrors localErrors = null;	

/****************************
 * 							*
 * 		Permissão 			*	
 *							* 
 * **************************/
		Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
		
		request.removeAttribute("permissaoPagina");
		
		if(usuario != null){
			try{
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,18));//18 - /fiscalizacao/Cadastro.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/
		
		
		if(errors != null){
			if(acao != null && acao.equals("GRAVAR"))
				localErrors = errors;
			else
				localErrors = new ActionErrors();
		}
		else
			localErrors = new ActionErrors();
		
		errors = null;		

		if(localErrors.size() > 0);
			request.setAttribute("fiscalizacao",String.valueOf(fiscalizacao));

		return localErrors;

	}
	
	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
	}		
}
