package br.smat.web.relatoriosalvo;

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
public class RelatorioSalvoActionForm extends ActionForm {

	private String acao;
	private int relSelected;
	private String textarea;

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
	 * Returns the relatorio.
	 * @return int
	 */
	public int getRelSelected() {
		return relSelected;
	}

	/**
	 * Sets the relatorio.
	 * @param relatorio The relatorio to set
	 */
	public void setRelSelected(int relSelected) {
		this.relSelected = relSelected;
	}	
		
	/**
	* Constructor
	*/
	public RelatorioSalvoActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		acao = null;
		relSelected = 0;
		textarea = null;
	
		// Reset values are provided as samples only. Change as appropriate.

	}
	public void apaga(){
		acao = null;
		relSelected = 0;
		textarea = null;		
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,9));//9 - RelatorioSalvo.do
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
	 * Returns the textarea.
	 * @return int
	 */
	public String getTextarea() {
		return textarea;
	}

	/**
	 * Sets the textarea.
	 * @param textarea The textarea to set
	 */
	public void setTextarea(String textarea) {
		this.textarea = textarea;
	}

}
