package br.smat.web.parametros.regionais;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.util.FuncoesComuns;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 10 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>regional - [your comment here]
 * <li>nome - [your comment here]
 * <li>estado - [your comment here]
 * <li>rua - [your comment here]
 * <li>numero - [your comment here]
 * <li>complemento - [your comment here]
 * <li>bairro - [your comment here]
 * <li>cep - [your comment here]
 * <li>municipio - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class RegionalActionForm extends ActionForm {

	private String acao = null;
	private int regional;
	private String nome = null;
	private int estado;
	private String rua = null;
	private int numero;
	private String complemento = null;
	private String bairro = null;
	private String cep = null;
	private int municipio;

	private ActionErrors errors;

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
	 * Get regional
	 * @return int
	 */
	public int getRegional() {
		return regional;
	}

	/**
	 * Set regional
	 * @param <code>int</code>
	 */
	public void setRegional(int r) {
		regional = r;
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
		if(n == null || n.trim().length() == 0)
			setErro("nome","error.nomeregional.required");
		
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
		if(e == 0)
			setErro("estado","error.estadoregional.required");
		estado = e;
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
		if(r == null || r.trim().length() ==0)
			setErro("rua","error.ruaregional.required");
		rua = r;
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

		if(n == 0)
			setErro("numero","error.numeroregional.required");
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
		if(b == null || b.trim().length() ==0)
			setErro("bairro","error.bairroregional.required");
		bairro = b;
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
		
		if(c != null && c.trim().length() != 0){
			if(c.trim().length() > 0)
				if((erro = FuncoesComuns.validateCEP(c,"cepregional")) != null)
					setErro("cep",erro);	
		}else
			setErro("cep","error.cepregional.required");	
		
		
		cep = c;
	}
	/**
	 * Get municipio
	 * @return String[]
	 */
	public int getMunicipio() {
		return municipio;
	}

	/**
	 * Set municipio
	 * @param <code>String[]</code>
	 */
	public void setMunicipio(int m) {
		municipio = m;
	}
	/**
	* Constructor
	*/
	public RegionalActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		acao = null;
		regional = 0;
		nome = null;
		estado = 0;
		rua = null;
		numero = 0;
		complemento = null;
		bairro = null;
		cep = null;
		municipio = 0;

	}
	
	public void apaga(){
		acao = null;
		regional = 0;
		nome = null;
		estado = 0;
		rua = null;
		numero = 0;
		complemento = null;
		bairro = null;
		cep = null;
		municipio = 0;
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,42));//42 - Regional.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors localErrors;

		if(acao != null)
			if(!acao.equals("GRAVAR"))
				errors = null;
				
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
}
