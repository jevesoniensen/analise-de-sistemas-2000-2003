package br.smat.web.investigacao.detalhesinvestigacao;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class DetalhesInvestigacaoActionForm extends ActionForm {

	private	int 	numInvestigacao = 0;
	private	String 	acao = null;

	/**
	* Constructor
	*/
	public DetalhesInvestigacaoActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		numInvestigacao = 0;
		acao = null;

		// Reset values are provided as samples only. Change as appropriate.

	}
	
	public void apaga(){
		numInvestigacao = 0;
		acao = null;
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,23));//23 - PesquisaAcidente.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors errors = new ActionErrors();
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new ActionError("error.field.required"));
		// }
		return errors;

	}
	/**
	 * Returns the acao.
	 * @return String
	 */
	public String getAcao() {
		return acao;
	}

	/**
	 * Returns the numInvestigacao.
	 * @return int
	 */
	public int getNumInvestigacao() {
		return numInvestigacao;
	}

	/**
	 * Sets the acao.
	 * @param acao The acao to set
	 */
	public void setAcao(String acao) {
		this.acao = acao;
	}

	/**
	 * Sets the numInvestigacao.
	 * @param numInvestigacao The numInvestigacao to set
	 */
	public void setNumInvestigacao(int numInvestigacao) {
		this.numInvestigacao = numInvestigacao;
	}

}
