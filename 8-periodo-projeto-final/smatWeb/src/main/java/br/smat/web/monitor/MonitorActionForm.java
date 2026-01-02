package br.smat.web.monitor;

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
 * <li>monitor - [your comment here]
 * <li>periodicidade - [your comment here]
 * <li>campo - [your comment here]
 * <li>queryCampo - [your comment here]
 * <li>maxAcidente - [your comment here]
 * <li>ultimaExecucao - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class MonitorActionForm extends ActionForm {

	private String acao = null;
	private String destino = null;
	private int monitor;
	private int periodicidade;
	private int campo;
	private int queryCampo;
	private int maxAcidente;
	private String ultimaExecucao = null;

	private ActionErrors errors = new ActionErrors();

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
	 * Get monitor
	 * @return int
	 */
	public int getMonitor() {
		return monitor;
	}

	/**
	 * Set monitor
	 * @param <code>int</code>
	 */
	public void setMonitor(int m) {
		monitor = m;
	}
	/**
	 * Get periodicidade
	 * @return int
	 */
	public int getPeriodicidade() {
		return periodicidade;
	}

	/**
	 * Set periodicidade
	 * @param <code>int</code>
	 */
	public void setPeriodicidade(int p) {
		
		if(p ==0)
			setErro("periodicidade","error.periodicidademonitor.required");
		
		
		periodicidade = p;
	}
	/**
	 * Get campo
	 * @return int
	 */
	public int getCampo() {
		return campo;
	}

	/**
	 * Set campo
	 * @param <code>int</code>
	 */
	public void setCampo(int c) {
		
		if(c ==  0)
			setErro("campo","error.campo.required");
		
		campo = c;
	}
	/**
	 * Get queryCampo
	 * @return int
	 */
	public int getQueryCampo() {
		return queryCampo;
	}

	/**
	 * Set queryCampo
	 * @param <code>int</code>
	 */
	public void setQueryCampo(int q) {

		if(q == 0)
			setErro("queryCampo","error.querycampomonitor.required");

		queryCampo = q;
	}
	/**
	 * Get maxAcidente
	 * @return int
	 */
	public int getMaxAcidente() {
		return maxAcidente;
	}

	/**
	 * Set maxAcidente
	 * @param <code>int</code>
	 */
	public void setMaxAcidente(int m) {
		
		if(m == 0)
			setErro("maxAcidente","error.maxacidente.required");
		
		maxAcidente = m;
	}
	/**
	 * Get ultimaExecucao
	 * @return String
	 */
	public String getUltimaExecucao() {
		return ultimaExecucao;
	}

	/**
	 * Set ultimaExecucao
	 * @param <code>String</code>
	 */
	public void setUltimaExecucao(String u) {		
		ultimaExecucao = u;
	}
	/**
	* Constructor
	*/
	public MonitorActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		acao = null;
		destino = null;
		monitor = 0;
		periodicidade = 0;
		campo = 0;
		queryCampo = 0;
		maxAcidente = 0;
		ultimaExecucao = null;

	}
	
	public void apaga(){

		acao = null;
		destino = null;
		monitor = 0;
		periodicidade = 0;
		campo = 0;
		queryCampo = 0;
		maxAcidente = 0;
		ultimaExecucao = null;
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,25));//7 - Monitor.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/		

		ActionErrors localErrors = null;
		
		//if(errors != null){
		//	if(acao != null && acao.equals("GRAVAR"))
		//		localErrors = errors;
		//	else
		///		localErrors = new ActionErrors();
		//}
		//else
		if(errors != null){
			if(acao != null && acao.equals("GRAVAR"))
				localErrors = errors;
			else
				localErrors = new ActionErrors();	
		}
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
