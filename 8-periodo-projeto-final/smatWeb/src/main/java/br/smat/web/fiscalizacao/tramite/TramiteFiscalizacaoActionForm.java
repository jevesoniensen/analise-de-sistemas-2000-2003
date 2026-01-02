package br.smat.web.fiscalizacao.tramite;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 7 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>destino - [your comment here]
 * <li>fiscalizacao - [your comment here]
 * <li>status - [your comment here]
 * <li>data - [your comment here]
 * <li>item - [your comment here]
 * <li>grauConformidade - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class TramiteFiscalizacaoActionForm extends ActionForm {

	private String 	acao 				= null;
	private String 	destino 			= null;
	private int 		fiscalizacao		= 0;
	private int 		status				= 0;
	private String 	data 				= null;
	private int[] 	item 				= null;
	private int[]		grauConformidade 	= null;
	private int		tramiteFiscalizacao = 0;
	private String		statusFiscalizacao	= null;

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
	 * Get fiscalizacao
	 * @return int
	 */
	public int getFiscalizacao() {
		return fiscalizacao;
	}

	/**
	 * Set fiscalizacao
	 * @param <code>int</code>
	 */
	public void setFiscalizacao(int f) {
		fiscalizacao = f;
	}
	/**
	 * Get status
	 * @return int
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * Set status
	 * @param <code>int</code>
	 */
	public void setStatus(int s) {
		status = s;
	}
	/**
	 * Get data
	 * @return String
	 */
	public String getData() {
		return data;
	}

	/**
	 * Set data
	 * @param <code>String</code>
	 */
	public void setData(String d) {
		data = d;
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
	 * Get grauConformidade
	 * @return int[]
	 */
	public int[] getGrauConformidade() {
		return grauConformidade;
	}

	/**
	 * Set grauConformidade
	 * @param <code>int[]</code>
	 */
	public void setGrauConformidade(int[] g) {
		grauConformidade = g;
	}
	/**
	* Constructor
	*/
	public TramiteFiscalizacaoActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		acao = null;
		destino = null;
		fiscalizacao = 0;
		status = 0;
		data = null;
		item = null;
		grauConformidade = null;

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
				System.out.println("validate form !!!");
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,21));//21 - /Fiscalizacao/Tramite.do
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
	 * Returns the tramiteFiscalizacao.
	 * @return int
	 */
	public int getTramiteFiscalizacao() {
		return tramiteFiscalizacao;
	}

	/**
	 * Sets the tramiteFiscalizacao.
	 * @param tramiteFiscalizacao The tramiteFiscalizacao to set
	 */
	public void setTramiteFiscalizacao(int tramiteFiscalizacao) {
		this.tramiteFiscalizacao = tramiteFiscalizacao;
	}

	/**
	 * Returns the statusFiscalizacao.
	 * @return String
	 */
	public String getStatusFiscalizacao() {
		return statusFiscalizacao;
	}

	/**
	 * Sets the statusFiscalizacao.
	 * @param statusFiscalizacao The statusFiscalizacao to set
	 */
	public void setStatusFiscalizacao(String statusFiscalizacao) {
		this.statusFiscalizacao = statusFiscalizacao;
	}

}
