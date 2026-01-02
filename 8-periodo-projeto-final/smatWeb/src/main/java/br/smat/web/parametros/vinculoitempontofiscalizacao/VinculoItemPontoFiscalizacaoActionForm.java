package br.smat.web.parametros.vinculoitempontofiscalizacao;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 6 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>destino - [your comment here]
 * <li>ramoSuperior - [your comment here]
 * <li>ramoAtividade - [your comment here]
 * <li>pontoFiscalizacao - [your comment here]
 * <li>item - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class VinculoItemPontoFiscalizacaoActionForm extends ActionForm {

	private String acao = null;
	private String destino = null;
	private int ramoSuperior;
	private int ramoAtividade;
	private int pontoFiscalizacao;
	private int[] item = null;

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
	 * Get ramoSuperior
	 * @return int
	 */
	public int getRamoSuperior() {
		return ramoSuperior;
	}

	/**
	 * Set ramoSuperior
	 * @param <code>int</code>
	 */
	public void setRamoSuperior(int r) {
		ramoSuperior = r;
	}
	/**
	 * Get ramoAtividade
	 * @return int
	 */
	public int getRamoAtividade() {
		return ramoAtividade;
	}

	/**
	 * Set ramoAtividade
	 * @param <code>int</code>
	 */
	public void setRamoAtividade(int r) {
		ramoAtividade = r;
	}
	/**
	 * Get pontoFiscalizacao
	 * @return int
	 */
	public int getPontoFiscalizacao() {
		return pontoFiscalizacao;
	}

	/**
	 * Set pontoFiscalizacao
	 * @param <code>int</code>
	 */
	public void setPontoFiscalizacao(int p) {
		pontoFiscalizacao = p;
	}
	/**
	 * Get item
	 * @return int[]
	 */
	public int[] getItem() {
		return item;
	}

	/**
	 * Set item
	 * @param <code>int[]</code>
	 */
	public void setItem(int[] i) {
		item = i;
	}
	/**
	* Constructor
	*/
	public VinculoItemPontoFiscalizacaoActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		acao = null;
		destino = null;
		ramoSuperior = 0;
		ramoAtividade = 0;
		pontoFiscalizacao = 0;
		item = null;

	}
	
	public void apaga(){
		acao = null;
		destino = null;
		ramoSuperior = 0;
		ramoAtividade = 0;
		pontoFiscalizacao = 0;
		item = null;
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

		ActionErrors errors = new ActionErrors();
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new ActionError("error.field.required"));
		// }
		return errors;

	}
}
