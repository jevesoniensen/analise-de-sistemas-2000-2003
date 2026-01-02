package br.smat.web.parametros.locaislesao;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 5 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>destino - [your comment here]
 * <li>localLesao - [your comment here]
 * <li>localLesaoPai - [your comment here]
 * <li>nome - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class LocaisLesaoActionForm extends ActionForm {

	private String acao 				= null;
	private String destino 			= null;
	private int localLesao			= 0;
	private int localLesaoPai			= 0;
	private int localLesaoPaiFalso	= 0;	
	private String nome 				= null;

	private ActionErrors errors = null;

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
	 * Get localLesao
	 * @return int
	 */
	public int getLocalLesao() {
		return localLesao;
	}

	/**
	 * Set localLesao
	 * @param <code>int</code>
	 */
	public void setLocalLesao(int l) {
		localLesao = l;
	}
	/**
	 * Get localLesaoPai
	 * @return int
	 */
	public int getLocalLesaoPai() {
		return localLesaoPai;
	}

	/**
	 * Set localLesaoPai
	 * @param <code>int</code>
	 */
	public void setLocalLesaoPai(int l) {
		localLesaoPai = l;
	}
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
			setErro("nome","error.nomelocallesao.required");
		
		nome = n;
	}
	
	/**
	 * Returns the localLesaoPaiFalso.
	 * @return int
	 */
	public int getLocalLesaoPaiFalso() {
		return localLesaoPaiFalso;
	}

	/**
	 * Sets the localLesaoPaiFalso.
	 * @param localLesaoPaiFalso The localLesaoPaiFalso to set
	 */
	public void setLocalLesaoPaiFalso(int localLesaoPaiFalso) {
		this.localLesaoPaiFalso = localLesaoPaiFalso;
	}	
	
	/**
	* Constructor
	*/
	public LocaisLesaoActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		acao = null;
		destino = null;
		localLesao = 0;
		localLesaoPai = 0;
		nome = null;

	}
	
	public void apaga(){
		acao = null;
		destino = null;
		localLesao = 0;
		localLesaoPai = 0;
		nome = null;		
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,37));//2 - PontosFiscalizacao.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/	
		ActionErrors localErrors = null;
		
		if(acao != null)
			if(!acao.equals("GRAVAR"))
				errors = null;
				
		if(errors != null)
			localErrors = errors;
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
