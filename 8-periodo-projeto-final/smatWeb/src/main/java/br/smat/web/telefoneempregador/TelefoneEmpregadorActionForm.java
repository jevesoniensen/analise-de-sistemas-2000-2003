package br.smat.web.telefoneempregador;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.util.*;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 3 fields on this form:
 * <ul>
 * <li>numero - [your comment here]
 * <li>ddd - [your comment here]
 * <li>descricao - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class TelefoneEmpregadorActionForm extends ActionForm {

	private int	telefoneEmpregador;
	private int	empregador;
	private String numero    = null;
	private String ddd 	  = null;
	private String descricao = null;
	private String acao      = null;
	private ActionErrors errors;	
	
	/**
	* Constructor
	*/
	public TelefoneEmpregadorActionForm() {
		super();
		apaga();
		errors =  new ActionErrors();

	}
	
	public void apaga(){
		telefoneEmpregador  = 0;
		numero    			= null;
		ddd       			= null;
		descricao 			= null;
		acao				= "LISTAR";		
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,12));//12 - TelefoneEmpregador.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors localErrors;
		
		if(acao != null)
			if(acao.equals("EXCLUIR"))
				errors = null;
				
		if(errors != null)
			localErrors = errors;
		else
			localErrors = new ActionErrors();
		
		errors = null;				
		
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		return localErrors;

	}

	/**
	 * Get numero
	 * @return String
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Set numero
	 * @param <code>String</code>
	 */
	public void setNumero(String t) {
		String erro;
		
		if(t != null)
			if((erro=FuncoesComuns.validateTelefone(t,"telefoneempregador")) != null)
				setErro("telefoneempregador",erro);		
		
		numero = t;
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
			if(ValidacoesFormulario.retiraCharAlfabeticos(d).length() < 2)
				setErro("dddempregador","error.dddempregador.required");
		ddd = d;
	}
	/**
	 * Get descricao
	 * @return String
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Set descricao
	 * @param <code>String</code>
	 */
	public void setDescricao(String d) {
		
		if (d != null)
			if (d.length() == 0){
		   		setErro("descricao","error.descricao.required");		
			}
		descricao = d;
	}
	
	/**
	 * Returns the acao.
	 * @return String
	 */
	public String getAcao() {
		return acao;
	}

	/**
	 * Sets the acao.
	 * @param acao The acao to set
	 */
	public void setAcao(String acao) {
		this.acao = acao;
	}

	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() {
		return empregador;
	}

	/**
	 * Returns the telefoneEmpregador.
	 * @return int
	 */
	public int getTelefoneEmpregador() {
		return telefoneEmpregador;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(int empregador) {
		this.empregador = empregador;
	}

	/**
	 * Sets the telefoneEmpregador.
	 * @param telefoneEmpregador The telefoneEmpregador to set
	 */
	public void setTelefoneEmpregador(int telefoneEmpregador) {
		this.telefoneEmpregador = telefoneEmpregador;
	}
	
	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
	}		
}
