package br.smat.web.pessoas.cadastrotestemunha;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.util.FuncoesComuns;
import br.smat.util.ValidacoesFormulario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 15 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>acidente - [your comment here]
 * <li>numInvestigacao - [your comment here]
 * <li>dadoInvestigacao - [your comment here]
 * <li>testemunha - [your comment here]
 * <li>nome - [your comment here]
 * <li>estado - [your comment here]
 * <li>municipio - [your comment here]
 * <li>rua - [your comment here]
 * <li>bairro - [your comment here]
 * <li>numero - [your comment here]
 * <li>complemento - [your comment here]
 * <li>cep - [your comment here]
 * <li>ddd - [your comment here]
 * <li>telefone - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class CadastroTestemunhaActionForm extends ActionForm {

	private String acao = null;
	private int acidente;
	private int numInvestigacao;
	private int dadoInvestigacao;
	private int tipoDepoimento;
	private int testemunha;
	private String nome = null;
	private int estado;
	private int municipio;
	private String rua = null;
	private String bairro = null;
	private int numero;
	private String complemento = null;
	private String cep = null;
	private String ddd = null;
	private String telefone = null;
	private int empregador = 0;

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
	 * Get acidente
	 * @return int
	 */
	public int getAcidente() {
		return acidente;
	}

	/**
	 * Set acidente
	 * @param <code>int</code>
	 */
	public void setAcidente(int a) {
		acidente = a;
	}
	/**
	 * Get numInvestigacao
	 * @return int
	 */
	public int getNumInvestigacao() {
		return numInvestigacao;
	}

	/**
	 * Set numInvestigacao
	 * @param <code>int</code>
	 */
	public void setNumInvestigacao(int n) {
		numInvestigacao = n;
	}
	/**
	 * Get dadoInvestigacao
	 * @return int
	 */
	public int getDadoInvestigacao() {
		return dadoInvestigacao;
	}

	/**
	 * Set dadoInvestigacao
	 * @param <code>int</code>
	 */
	public void setDadoInvestigacao(int d) {
		dadoInvestigacao = d;
	}
	/**
	 * Get testemunha
	 * @return int
	 */
	public int getTestemunha() {
		return testemunha;
	}

	/**
	 * Set testemunha
	 * @param <code>int</code>
	 */
	public void setTestemunha(int t) {
		testemunha = t;
	}
	/**
	 * Get nome
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Set nome
	 * @param <code>String</code>
	 */
	public void setNome(String n) {
		if(n != null)
			if(n.trim().length() == 0)
				setErro("nomeTestemunha","error.nometestemunha.required");
		
		nome = n;
	}
	/**
	 * Get estado
	 * @return int
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Set estado
	 * @param <code>int</code>
	 */
	public void setEstado(int e) {
		estado = e;
	}
	/**
	 * Get municipio
	 * @return int
	 */
	public int getMunicipio() {
		return municipio;
	}

	/**
	 * Set municipio
	 * @param <code>int</code>
	 */
	public void setMunicipio(int m) {
		municipio = m;
	}
	/**
	 * Get rua
	 * @return String
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * Set rua
	 * @param <code>String</code>
	 */
	public void setRua(String r) {
		rua = r;
	}
	/**
	 * Get bairro
	 * @return String
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * Set bairro
	 * @param <code>String</code>
	 */
	public void setBairro(String b) {
		bairro = b;
	}
	/**
	 * Get numero
	 * @return int
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Set numero
	 * @param <code>int</code>
	 */
	public void setNumero(int n) {
		numero = n;
	}
	/**
	 * Get complemento
	 * @return String
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * Set complemento
	 * @param <code>String</code>
	 */
	public void setComplemento(String c) {
		complemento = c;
	}
	/**
	 * Get cep
	 * @return String
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Set cep
	 * @param <code>String</code>
	 */
	public void setCep(String c) {
		String erro = null;
		
		if(c != null)
		if(c.trim().length() > 0)
			if((erro = FuncoesComuns.validateCEP(c,"ceptestemunha")) != null)
				setErro("ceptestemunha",erro);	
						
		cep = c;
	}
	/**
	 * Get ddd
	 * @return String
	 */
	public String getDdd() {
		return ddd;
	}

	/**
	 * Set ddd
	 * @param <code>String</code>
	 */
	public void setDdd(String d) {
		if(d != null)
			if(d.trim().length() > 0)
				if(ValidacoesFormulario.retiraCharAlfabeticos(d).length() < 2)
					setErro("dddtestemunha","error.dddtestemunha.required");		
					
		this.ddd = d;
	}
	/**
	 * Get telefone
	 * @return String
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Set telefone
	 * @param <code>String</code>
	 */
	public void setTelefone(String t) {
		String erro;
		
		if(t != null)
			if(t.trim().length() > 0)
				if((erro=FuncoesComuns.validateTelefone(t,"telefonetestemunha")) != null)
					setErro("telefonetestemunha",erro);
					
		telefone = t;
	}
	/**
	* Constructor
	*/
	public CadastroTestemunhaActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		acao = null;
		acidente = 0;
		numInvestigacao = 0;
		dadoInvestigacao = 0;
		testemunha = 0;
		nome = null;
		estado = 0;
		municipio = 0;
		rua = null;
		bairro = null;
		numero = 0;
		complemento = null;
		cep = null;
		ddd = null;
		telefone = null;
		tipoDepoimento = 0;
		empregador = 0;
	}
	
	public void apaga(){

		acao = null;
		testemunha = 0;
		nome = null;
		estado = 0;
		municipio = 0;
		rua = null;
		bairro = null;
		numero = 0;
		complemento = null;
		cep = null;
		ddd = null;
		telefone = null;
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,33));//33 - CadastroTestemunha.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors localErrors;

		if(acao != null)
			if(!acao.equalsIgnoreCase("GRAVAR"))
				errors = null;

						
		if(errors != null)
			localErrors = errors;
		else
			localErrors = new ActionErrors();
		
		errors = null;				
		
		return localErrors;
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

	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
	}	
	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() {
		return empregador;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(int empregador) {
		this.empregador = empregador;
	}

}
