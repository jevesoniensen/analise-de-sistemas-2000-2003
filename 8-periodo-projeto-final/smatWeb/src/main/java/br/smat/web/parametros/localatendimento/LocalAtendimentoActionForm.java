package br.smat.web.parametros.localatendimento;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 5 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>localAtendimento - [your comment here]
 * <li>nome - [your comment here]
 * <li>estado - [your comment here]
 * <li>municipio - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class LocalAtendimentoActionForm extends ActionForm {

	private String acao = null;
	private int localAtendimento;
	private String nome = null;
	private int estado;
	private int municipio = 0;

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
	 * Get localAtendimento
	 * @return int
	 */
	public int getLocalAtendimento() {
		return localAtendimento;
	}

	/**
	 * Set localAtendimento
	 * @param <code>int</code>
	 */
	public void setLocalAtendimento(int l) {
		localAtendimento = l;
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

		if(n == null || n.trim().length() ==0){
			setErro("nome","error.nomelocalatendimento.required");
		}
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
		if(m == 0){
			setErro("municipio","error.municipiolocalatendimento.required");
		}

		municipio = m;
	}
	/**
	* Constructor
	*/
	public LocalAtendimentoActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		acao = null;
		localAtendimento = 0;
		nome = null;
		estado = 0;
		municipio = 0;

	}
	

	public void apaga(){
		acao = null;
		localAtendimento = 0;
		nome = null;
		estado = 0;
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,39));//39 - LocalAtendimento.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors localErrors = null;
		
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
