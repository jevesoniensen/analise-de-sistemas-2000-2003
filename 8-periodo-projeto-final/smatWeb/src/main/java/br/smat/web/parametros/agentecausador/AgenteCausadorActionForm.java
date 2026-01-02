package br.smat.web.parametros.agentecausador;

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
 * <li>agenteCausador - [your comment here]
 * <li>agenteCausadorVo - [your comment here]
 * <li>agenteCausadorPai - [your comment here]
 * <li>nome - [your comment here]
 * <li>descricao - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class AgenteCausadorActionForm extends ActionForm {

	private String acao = null;
	private int agenteCausador;
	private int agenteCausadorVo;
	private int agenteCausadorVoFalso;
	private int agenteCausadorPai;
	private int agenteCausadorPaiFalso;
	private String nome = null;
	private String descricao = null;

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
	 * Get agenteCausador
	 * @return int
	 */
	public int getAgenteCausador() {
		return agenteCausador;
	}

	/**
	 * Set agenteCausador
	 * @param <code>int</code>
	 */
	public void setAgenteCausador(int a) {
		
		System.out.println("ENTROU NO AGENTE CAUSADOR VO");
		agenteCausador = a;
	}
	/**
	 * Get agenteCausadorVo
	 * @return int
	 */
	public int getAgenteCausadorVo() {
		return agenteCausadorVo;
	}

	/**
	 * Set agenteCausadorVo
	 * @param <code>int</code>
	 */
	public void setAgenteCausadorVo(int a) {
		agenteCausadorVo = a;
	}
	/**
	 * Get agenteCausadorPai
	 * @return int
	 */
	public int getAgenteCausadorPai() {
		return agenteCausadorPai;
	}

	/**
	 * Set agenteCausadorPai
	 * @param <code>int</code>
	 */
	public void setAgenteCausadorPai(int a) {

		if(agenteCausadorVo != 0)
			if(a == 0)
				setErro("agenteCausadorPai","error.nome.agentecausadorpai.required");
		agenteCausadorPai = a;
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
				setErro("nome","error.nome.agentecausador.required");
				
		nome = n;
	}
	/**
	 * Get descricao
	 * @return String
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Set descricao
	 * @param <code>String</code>
	 */
	public void setDescricao(String d) {
		descricao = d;
	}
	/**
	* Constructor
	*/
	public AgenteCausadorActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		acao = null;
		agenteCausador = 0;
		agenteCausadorVo = 0;
		agenteCausadorPai = 0;
		nome = null;
		descricao = null;
		agenteCausadorPaiFalso = 0;
		agenteCausadorVoFalso = 0;

	}
	
	public void apaga(){
		acao = null;
		agenteCausador = 0;
		agenteCausadorVo = 0;
		agenteCausadorVoFalso = 0;
		agenteCausadorPai = 0;
		agenteCausadorPaiFalso = 0;
		nome = null;
		descricao = null;
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,30));//30 - AgenteCausador.do
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
	/**
	 * Returns the agenteCausadorPaiFalso.
	 * @return int
	 */
	public int getAgenteCausadorPaiFalso() {
		return agenteCausadorPaiFalso;
	}

	/**
	 * Sets the agenteCausadorPaiFalso.
	 * @param agenteCausadorPaiFalso The agenteCausadorPaiFalso to set
	 */
	public void setAgenteCausadorPaiFalso(int agenteCausadorPaiFalso) {
		this.agenteCausadorPaiFalso = agenteCausadorPaiFalso;
	}



	/**
	 * Returns the agenteCausadorVoFalso.
	 * @return int
	 */
	public int getAgenteCausadorVoFalso() {
		return agenteCausadorVoFalso;
	}

	/**
	 * Sets the agenteCausadorVoFalso.
	 * @param agenteCausadorVoFalso The agenteCausadorVoFalso to set
	 */
	public void setAgenteCausadorVoFalso(int agenteCausadorVoFalso) {
		this.agenteCausadorVoFalso = agenteCausadorVoFalso;
	}

}
