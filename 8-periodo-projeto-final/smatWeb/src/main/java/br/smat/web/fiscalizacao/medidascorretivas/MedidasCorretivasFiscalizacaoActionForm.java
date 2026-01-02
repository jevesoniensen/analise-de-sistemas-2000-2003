package br.smat.web.fiscalizacao.medidascorretivas;

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
 * <li>observacao - [your comment here]
 * <li>prazoDias - [your comment here]
 * <li>tipoMedidaCorretiva - [your comment here]
 * <li>status - [your comment here]
 * <li>tramiteFiscalizacao - [your comment here]
 * <li>fiscalizacao - [your comment here]
 * <li>acao - [your comment here]
 * <li>destino - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class MedidasCorretivasFiscalizacaoActionForm extends ActionForm {

	private String observacao = null;
	private int 	prazoDias;
	private int 	tipoMedidaCorretiva;
	private int 	status=0;
	private int 	tramiteFiscalizacao;
	private int 	fiscalizacao;
	private String acao = null;
	private String destino = null;
	private int	tipoMedidaCorretivaFalsa;
	private String statusFiscalizacao;

	private ActionErrors errors = null;

	/**
	 * Get observacao
	 * @return String
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * Set observacao
	 * @param <code>String</code>
	 */
	public void setObservacao(String o) {
		
		if(o != null && (o.trim().length() == 0 || o.length() > 255))
			setErro("observacao","error.observacaomedidacorretiva.required");
		
		observacao = o;
	}
	/**
	 * Get prazoDias
	 * @return int
	 */
	public int getPrazoDias() {
		return prazoDias;
	}

	/**
	 * Set prazoDias
	 * @param <code>int</code>
	 */
	public void setPrazoDias(int p) {
		System.out.println("prazoDias " + p);
		if(p == 0)
			setErro("prazoDias","error.prazoDiasfiscalizacao.required");	
		
		prazoDias = p;
	}
	/**
	 * Get tipoMedidaCorretiva
	 * @return int
	 */
	public int getTipoMedidaCorretiva() {
		return tipoMedidaCorretiva;
	}

	/**
	 * Set tipoMedidaCorretiva
	 * @param <code>int</code>
	 */
	public void setTipoMedidaCorretiva(int t) {

		if(t == 0)
			setErro("tipoMedidaCorretiva","error.tipomedidacorretivafiscalizacao.required");

		tipoMedidaCorretiva = t;
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
	* Constructor
	*/
	public MedidasCorretivasFiscalizacaoActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		observacao = null;
		prazoDias = 0;
		tipoMedidaCorretiva = 0;
		status = 0;
		tramiteFiscalizacao = 0;
		fiscalizacao = 0;
		acao = null;
		destino = null;

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
				System.out.println("MedidasCorretivasFiscalizacaoActionForm validate form !!!");
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,24));//21 - /Fiscalizacao/MedidaCorretivaFiscalizacao.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors localErrors = null;
		

		if(errors != null){
			if(acao != null && acao.equals("GRAVAR"))
				localErrors = errors;
			else
				localErrors = new ActionErrors();	
		}
		else
			localErrors = new ActionErrors();
		
		errors = null;		
		
		if(localErrors.size() > 0);
			request.setAttribute("status",String.valueOf(status));
		

		return localErrors;		
		
	}
	
	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
	}			
	/**
	 * Returns the tipoMedidaCorretivaFalsa.
	 * @return int
	 */
	public int getTipoMedidaCorretivaFalsa() {
		return tipoMedidaCorretivaFalsa;
	}

	/**
	 * Sets the tipoMedidaCorretivaFalsa.
	 * @param tipoMedidaCorretivaFalsa The tipoMedidaCorretivaFalsa to set
	 */
	public void setTipoMedidaCorretivaFalsa(int tipoMedidaCorretivaFalsa) {
		this.tipoMedidaCorretivaFalsa = tipoMedidaCorretivaFalsa;
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
