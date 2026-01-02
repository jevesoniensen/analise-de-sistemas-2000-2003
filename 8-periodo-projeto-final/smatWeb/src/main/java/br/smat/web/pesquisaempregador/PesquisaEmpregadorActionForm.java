package br.smat.web.pesquisaempregador;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 1 field on this form:
 * <ul>
 * <li>razaoSocial - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class PesquisaEmpregadorActionForm extends ActionForm {

	private String razaoSocial = null;
	private String documento	= null;
	private int	empregador 	= 0;
	private String destino		= null;
	private String acao		= null;
	private String	origem		= null;

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
	* Constructor
	*/
	public PesquisaEmpregadorActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		razaoSocial = null;

	}
	
	public void apaga(){
		razaoSocial = null;
		documento	= null;
		empregador 	= 0;
		destino		= null;
		acao		= null;
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,11));//11 - PesquisaEmpregador.do
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
	 * Returns the documento.
	 * @return String
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() {
		return empregador;
	}

	/**
	 * Sets the documento.
	 * @param documento The documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(int empregador) {
		this.empregador = empregador;
	}

	/**
	 * Returns the destino.
	 * @return String
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * Sets the destino.
	 * @param destino The destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
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
	 * Returns the origem.
	 * @return String
	 */
	public String getOrigem() {
		return origem;
	}

	/**
	 * Sets the origem.
	 * @param origem The origem to set
	 */
	public void setOrigem(String origem) {
		this.origem = origem;
	}

}
