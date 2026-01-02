package br.smat.web.administrador.grupos;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 4 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>destino - [your comment here]
 * <li>usuario - [your comment here]
 * <li>grupo - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class UsuarioGrupoActionForm extends ActionForm {

	private String acao = null;
	private String destino = null;
	private int usuario = 0;
	private int grupo = 0;
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
		if(u == 0)
			setErro("usuario","error.usuariogrupousuario.required");
					
		usuario = u;
	}
	/**
	 * Get grupo
	 * @return String[]
	 */
	public int getGrupo() {
		return grupo;
	}

	/**
	 * Set grupo
	 * @param <code>String[]</code>
	 */
	public void setGrupo(int g) {
		
		if(g == 0)
			setErro("grupo","error.usuariogrupogrupo.required");
		
		grupo = g;
	}
	/**
	* Constructor
	*/
	public UsuarioGrupoActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		acao = null;
		destino = null;
		usuario = 0;
		grupo = 0;

	}
	
	public void apaga(){
		acao = null;
		destino = null;
		usuario = 0;
		grupo = 0;		
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,35));//26 - Usuario.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors localErrors = null;

		if(errors != null){
			if(acao != null && (acao.equals("GRAVAR") || acao.equals("EXCLUIR"))){			
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
}
