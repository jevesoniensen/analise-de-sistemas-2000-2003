package br.smat.web.parametros.acidente.ramoatividade;

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
 * <li>ramoAtividade - [your comment here]
 * <li>ramoSuperior - [your comment here]
 * <li>ramoSuperiorFalso - [your comment here]
 * <li>nome - [your comment here]
 * <li>cnae - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class RamoAtividadeActionForm extends ActionForm {

	private String acao = null;
	private String destino = null;
	private int ramoAtividade;
	private int ramoSuperior;
	private int ramoSuperiorFalso;
	private String nome = null;
	private int cnae;
	
	private ActionErrors errors;	

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
	 * Get ramoSuperiorFalso
	 * @return int
	 */
	public int getRamoSuperiorFalso() {
		return ramoSuperiorFalso;
	}

	/**
	 * Set ramoSuperiorFalso
	 * @param <code>int</code>
	 */
	public void setRamoSuperiorFalso(int r) {
		ramoSuperiorFalso = r;
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
			setErro("nome","error.nomeramoatividade.required");

		nome = n;
	}
	/**
	 * Get cnae
	 * @return int
	 */
	public int getCnae() {
		return cnae;
	}

	/**
	 * Set cnae
	 * @param <code>int</code>
	 */
	public void setCnae(int c) {
		cnae = c;
	}
	/**
	* Constructor
	*/
	public RamoAtividadeActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.
		apaga();
	}
	
	public void apaga(){
		acao = null;
		destino = null;
		ramoAtividade = 0;
		ramoSuperior = 0;
		ramoSuperiorFalso = 0;
		nome = null;
		cnae = 0;		
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,40));//2 - RamoAtividade.do
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
