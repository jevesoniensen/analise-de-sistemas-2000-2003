package br.smat.web.pesquisaacidente;

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
public class ResultadoPesquisaAcidenteActionForm extends ActionForm {

	private int acidente;
	private String acao;

	/**
	* Constructor
	*/
	public ResultadoPesquisaAcidenteActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		acidente = 0;
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,20));//20 - ResultadoPesquisa.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors errors = new ActionErrors();

		if(acao != null)
			if(acao.equals("VISUALIZAACIDENTE") || acao.equals("GERARINVESTIGACAO"))
				if(acidente == 0)
					errors.add("acidente",new ActionError("error.resultadopesquisa.acidente.required"));
		

					
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new ActionError("error.field.required"));
		// }
		return errors;

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
