package br.smat.web.login;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class LoginActionForm extends ActionForm {


	private String nomeUsuario;
	private String senha;
	private String acao;

	private ActionErrors errors;
	
	/**
	 * Returns the nomeUsuario.
	 * @return String
	 */
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	/**
	 * Returns the senha.
	 * @return String
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * Sets the nomeUsuario.
	 * @param nomeUsuario The nomeUsuario to set
	 */
	public void setNomeUsuario(String nomeUsuario) {

		if(nomeUsuario == null || nomeUsuario.trim().length() == 0){
			setErro("usuario","error.usuariosenha.invalidos");
			nomeUsuario = null;
		}
					
		this.nomeUsuario = nomeUsuario;
	}

	/**
	 * Sets the senha.
	 * @param senha The senha to set
	 */
	public void setSenha(String senha) {

		if(senha == null || senha.trim().length() == 0){
			setErro("senha","error.usuariosenha.invalidos");
			senha = null;
		}
					
		this.senha = senha;
	}
	
	/**
	* Constructor
	*/
	public LoginActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

	}
	public ActionErrors validate(
		ActionMapping mapping,
		HttpServletRequest request) {

		ActionErrors localErrors;
		
		if(acao != null)
			if(!acao.equals("GRAVAR"))
				errors = null;

		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new ActionError("error.field.required"));

		
		if(errors != null)
			localErrors = errors;
		else
			localErrors = new ActionErrors();
		
		errors = null;			
		
		return localErrors;

	}

	public void setErro(String campo,String erro){
		
		if(errors == null){
			errors = new ActionErrors();
			errors.add(campo,new ActionError(erro));
		}
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

}
