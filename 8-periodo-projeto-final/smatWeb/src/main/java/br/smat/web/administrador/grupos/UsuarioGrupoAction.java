package br.smat.web.administrador.grupos;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.grupo.Grupo;
import br.smat.controleacesso.ejb.pagina.Pagina;
import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.controleacesso.ejb.usuariogrupo.UsuarioGrupo;
import br.smat.web.obj.ObjGrupo;
import br.smat.web.obj.ObjUsuario;
import br.smat.web.obj.ObjUsuarioGrupo;

/**
 * @version 	1.0
 * @author
 */
public class UsuarioGrupoAction extends Action {

	/**
	* Constructor
	*/
	public UsuarioGrupoAction() {

		super();

	}
	public ActionForward perform(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws IOException, ServletException {



/****************************
 * 							*
 * 		Permissão 			*	
 *							* 
 * **************************/			
		Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
		Pagina pagina = null;
		
		if(usuario != null){
			pagina = (Pagina)request.getAttribute("permissaoPagina");

			if(!(pagina instanceof  Pagina))
					return mapping.findForward("AccessDenied");

		}
		else
			return mapping.findForward("LoginInit");

		
/***************************
 ***************************/

		try {

			String	acao	= ((UsuarioGrupoActionForm)form).getAcao();

			if(acao != null)
			if(acao.equals("ZERARSESSAO")){
				((UsuarioGrupoActionForm)form).apaga();
				acao="LIMPAR";
			}
			
			int 	user 	= ((UsuarioGrupoActionForm)form).getUsuario();
			int	grupo 	= ((UsuarioGrupoActionForm)form).getGrupo();

			String 	mensagem = null;	
			
			if(acao != null && acao.equals("GRAVAR")){
				try {
					ObjUsuarioGrupo u = new ObjUsuarioGrupo(user,grupo);
					u.save();
					mensagem = "O usuário foi cadastrado no grupo com sucesso";
				} catch (Exception e) {
					mensagem = "Erro ao cadastrar o usuário no grupo!";
				}
			}	
			else	
			if(acao != null && acao.equals("EXCLUIR")){
				try {
					ObjUsuarioGrupo u = new ObjUsuarioGrupo(user,grupo);
					u.remove();
					mensagem = "O usuário foi excluido do grupo com sucesso";
				} catch (Exception e) {
					mensagem = "Erro ao excluir o usuário do grupo!";
				}
			}					

			Usuario[] 		colUsuario 		= ObjUsuario.findAll();
			Grupo[]			colGrupo 		= ObjGrupo.findAll();
			UsuarioGrupo[]	colUsuarioGrupo	= ObjUsuarioGrupo.findAll();
			
			request.getSession().setAttribute("colGrupo"		,colGrupo);
			request.getSession().setAttribute("colUsuario"		,colUsuario);
			request.getSession().setAttribute("colUsuarioGrupo"	,colUsuarioGrupo);			
			request.setAttribute("mensagem",mensagem);
			
						
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward("erroDefault");
		}

		// Finish with
		return mapping.findForward("UsuarioGrupo");

	}
}
