package br.smat.web.fiscalizacao.cadastroroteiro;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 8 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>destino - [your comment here]
 * <li>fiscalizacao - [your comment here]
 * <li>tramiteFiscalizacao - [your comment here]
 * <li>ramoSuperior - [your comment here]
 * <li>ramoAtividade - [your comment here]
 * <li>pontoFiscalizacao - [your comment here]
 * <li>item - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class CadastroRoteiroActionForm extends ActionForm {

	private String 	acao = null;
	private String 	destino = null;
	private int 		fiscalizacao;
	private int 		tramiteFiscalizacao;
	private int 		ramoSuperior;
	private int 		ramoAtividade;
	private int 		pontoFiscalizacao;
	private int		removeItem;	
	private int[]		item = null;
	private boolean	zeraDemaisAgentes = false;
	private int		status;

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
	 * Get tramiteFiscalizacao
	 * @return int
	 */
	public int getTramiteFiscalizacao() {
		return tramiteFiscalizacao;
	}

	/**
	 * Set tramiteFiscalizacao
	 * @param <code>int</code>
	 */
	public void setTramiteFiscalizacao(int t) {
		tramiteFiscalizacao = t;
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
		
		if(r != ramoSuperior)
			zeraDemaisAgentes = true;
			
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
	 * @return String
	 */
	public int[] getItem() {
		return item;
	}

	/**
	 * Set item
	 * @param <code>String</code>
	 */
	public void setItem(int[] i) {
		item = i;
	}
	/**
	* Constructor
	*/
	public CadastroRoteiroActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		acao = null;
		destino = null;
		fiscalizacao = 0;
		tramiteFiscalizacao = 0;
		ramoSuperior = 0;
		ramoAtividade = 0;
		pontoFiscalizacao = 0;
		item = null;
		zeraDemaisAgentes = false;

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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,22));//21 - /Fiscalizacao/Tramite.do
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
	 * Returns the removeItem.
	 * @return int
	 */
	public int getRemoveItem() {
		return removeItem;
	}

	/**
	 * Sets the removeItem.
	 * @param removeItem The removeItem to set
	 */
	public void setRemoveItem(int removeItem) {
		this.removeItem = removeItem;
	}

	/**
	 * Returns the status.
	 * @return int
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 * @param status The status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

}
