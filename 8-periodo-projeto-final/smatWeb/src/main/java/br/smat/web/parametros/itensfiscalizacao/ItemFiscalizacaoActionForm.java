package br.smat.web.parametros.itensfiscalizacao;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 4 fields on this form:
 * <ul>
 * <li>nome - [your comment here]
 * <li>itemFiscalizacao - [your comment here]
 * <li>destino - [your comment here]
 * <li>acao - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class ItemFiscalizacaoActionForm extends ActionForm {

	private String nome = null;
	private int	itemFiscalizacao = 0;
	private String destino = null;
	private String acao = null;

	private ActionErrors errors;	

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
			setErro("nome","error.nomeitemfiscalizacao.required");				
		
		nome = n;
	}
	/**
	 * Get itemFiscalizacao
	 * @return String
	 */
	public int getItemFiscalizacao() {
		return itemFiscalizacao;
	}

	/**
	 * Set itemFiscalizacao
	 * @param <code>String</code>
	 */
	public void setItemFiscalizacao(int i) {
		itemFiscalizacao = i;
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
	* Constructor
	*/
	public ItemFiscalizacaoActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		nome = null;
		itemFiscalizacao = 0;
		destino = null;
		acao = null;

	}
	
	public void apaga(){
		nome = null;
		itemFiscalizacao = 0;
		destino = null;
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,14));//2 - PontosFiscalizacao.do
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
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new ActionError("error.field.required"));
		// }

	}
	
	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
	}	
}
