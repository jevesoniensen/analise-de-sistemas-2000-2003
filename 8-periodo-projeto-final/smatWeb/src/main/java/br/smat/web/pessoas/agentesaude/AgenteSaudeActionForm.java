package br.smat.web.pessoas.agentesaude;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.util.FuncoesComuns;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 6 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>destino - [your comment here]
 * <li>email - [your comment here]
 * <li>nome - [your comment here]
 * <li>regional - [your comment here]
 * <li>agenteSaude - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class AgenteSaudeActionForm extends ActionForm {

	private String acao = null;
	private String destino = null;
	private String email = null;
	private String nome = null;
	private int	estado;
	private int 	regional;
	private int 	agenteSaude;

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
	 * Get email
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Set email
	 * @param <code>String</code>
	 */
	public void setEmail(String e) {
		
		String erro = null;
		
		if(e == null)
			setErro("email","error.emailcadastroagente.required");
		else
		if((erro = FuncoesComuns.validaEmail(e,"emailcadastroagente")) != null)	
			setErro("email",erro);
			
		email = e;
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
			setErro("nome","error.nomecadastroagente.required");

		nome = n;
	}
	/**
	 * Get regional
	 * @return int
	 */
	public int getRegional() {
		return regional;
	}

	/**
	 * Set regional
	 * @param <code>int</code>
	 */
	public void setRegional(int r) {
		
		if(r == 0)
			setErro("regional","error.regionalcadastroagente.required");			
		
		regional = r;
	}
	/**
	 * Get agenteSaude
	 * @return int
	 */
	public int getAgenteSaude() {
		return agenteSaude;
	}

	/**
	 * Set agenteSaude
	 * @param <code>int</code>
	 */
	public void setAgenteSaude(int a) {
		agenteSaude = a;
	}

	/**
	 * Returns the estado.
	 * @return int
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	* Constructor
	*/
	public AgenteSaudeActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		apaga();

	}
	
	public void apaga(){
		acao = null;
		destino = null;
		email = null;
		nome = null;
		regional = 0;
		agenteSaude = 0;
		estado = 0;		
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,26));//26 - pessoas/AgenteSaude.do
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

		return localErrors;

	}
	
	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
	}	

}
