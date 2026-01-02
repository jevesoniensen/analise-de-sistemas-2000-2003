package br.smat.web.administrador.usuarios;

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
 * <li>usuario - [your comment here]
 * <li>nome - [your comment here]
 * <li>senha - [your comment here]
 * <li>agenteSaude - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class CadastroUsuarioActionForm extends ActionForm {

	private String acao = null;
	private String destino = null;
	private int usuario;
	private String nome = null;
	private String senha = null;
	private int agenteSaude = 0;
	private String senhaConfere = null;

	private ActionErrors errors=null;

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
	 * Get usuario
	 * @return int
	 */
	public int getUsuario() {
		return usuario;
	}

	/**
	 * Set usuario
	 * @param <code>int</code>
	 */
	public void setUsuario(int u) {
		
		usuario = u;
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

		if(n == null || n.trim().length() ==0)
			setErro("nome","error.nomecadastrousuario.required");

		nome = n;
	}
	/**
	 * Get senha
	 * @return String
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * Set senha
	 * @param <code>String</code>
	 */
	public void setSenha(String s) {
		
		if(s == null || s.trim().length() ==0)
			setErro("senha","error.senhacadastrousuario.required");
		
		senha = s;
	}
	/**
	 * Get agenteSaude
	 * @return String[]
	 */
	public int getAgenteSaude() {
		return agenteSaude;
	}

	/**
	 * Set agenteSaude
	 * @param <code>String[]</code>
	 */
	public void setAgenteSaude(int a) {
		agenteSaude = a;
	}
	

	
	/**
	* Constructor
	*/
	public CadastroUsuarioActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		apaga();

	}
	
	public void apaga(){
		acao = null;
		destino = null;
		usuario = 0;
		nome = null;
		senha = null;
		agenteSaude = 0;
		senhaConfere = null;		
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,27));//26 - Usuario.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors localErrors = null;

		if(senha == null || senhaConfere == null)
			setErro("campo","error.senhaconferecadastrousuario.invalida");
		else
		if(!senhaConfere.equals(senha))		
			setErro("campo","error.senhaconferecadastrousuario.invalida");

		if(errors != null){
			if(acao != null && acao.equals("GRAVAR")){
				
				localErrors = errors;
			}
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
	/**
	 * Returns the senhaConfere.
	 * @return String
	 */
	public String getSenhaConfere() {
		return senhaConfere;
	}

	/**
	 * Sets the senhaConfere.
	 * @param senhaConfere The senhaConfere to set
	 */
	public void setSenhaConfere(String senhaConfere) {
		this.senhaConfere = senhaConfere;
	}

}
