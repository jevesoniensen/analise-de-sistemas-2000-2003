package br.smat.web.administrador.usuarios;

import java.io.IOException;
import java.util.Collection;

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
import br.smat.web.obj.ObjAcidente;
import br.smat.web.obj.ObjAgenteSaude;
import br.smat.web.obj.ObjGrupo;
import br.smat.web.obj.ObjUsuario;

/**
 * @version 	1.0
 * @author
 */
public class CadastroUsuarioAction extends Action {

	/**
	* Constructor
	*/
	public CadastroUsuarioAction() {

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
		// return value

		try {

			String	acao 		= ((CadastroUsuarioActionForm)form).getAcao();
			
			if(acao != null)
			if(acao.equals("ZERARSESSAO")){
				((CadastroUsuarioActionForm)form).apaga();
				acao = "LISTAR";
			}

			
			Collection 	colAgenteSaude 	= ObjAgenteSaude.findAllAgentesSaude();


			int	loUsuario	= ((CadastroUsuarioActionForm)form).getUsuario();
			String	nome		= ((CadastroUsuarioActionForm)form).getNome();
			String	senha		= ((CadastroUsuarioActionForm)form).getSenha();
			int	agenteSaude = ((CadastroUsuarioActionForm)form).getAgenteSaude();	
			
			String	mensagem	= null;
			
			if(acao != null && acao.equals("PREENCHEFORM")){
				Usuario a = ObjUsuario.findByPrimaryKey(loUsuario);
				
				nome 	= a.getNome();
				senha 	= a.getSenha();
				if(a.getAgenteSaude()!= null)
					agenteSaude = a.getAgenteSaude().agenteSaude;
				else
					agenteSaude = 0;

				((CadastroUsuarioActionForm)form).setAgenteSaude(agenteSaude);
				((CadastroUsuarioActionForm)form).setNome(nome);
				((CadastroUsuarioActionForm)form).setSenha(senha);						
				((CadastroUsuarioActionForm)form).setSenhaConfere(senha);
			}
			else
			if(acao != null && acao.equals("GRAVAR")){
				try {
					ObjUsuario u = new ObjUsuario(loUsuario,nome,senha,agenteSaude);
					u.save();
							
					if(loUsuario == 0)
						mensagem = "Usuário incluido com sucesso!";
					else
						mensagem = "Usuário alterado com sucesso!";											
						
					loUsuario = u.getUsuario();
					((CadastroUsuarioActionForm)form).setUsuario(loUsuario);
					
				} catch (Exception e) {
					mensagem = "Erro ao gravar Usuário";
				}
			}
			else
			if(acao != null && acao.equals("EXCLUIR")){
				try {
					
					
					if(loUsuario > 0){
						ObjUsuario u = new ObjUsuario(loUsuario);
						u.remove();
						mensagem = "Usuário excluido com sucesso!";											
						((CadastroUsuarioActionForm)form).apaga();						
					}
					else
						mensagem = "É necessário selecionar um Usuário!";											
					
				} catch (Exception e) {
					mensagem = "Erro ao excluir Usuário";
				}
			}

			Usuario[]  	colUsuario 		= ObjUsuario.findAll();

			request.getSession().setAttribute("colAgenteSaude",colAgenteSaude);
			request.getSession().setAttribute("colUsuario",colUsuario);
			request.setAttribute("mensagem",mensagem);

		} catch (Exception e) {

			e.printStackTrace();
			return mapping.findForward("erroDefault");
		}

		// Finish with
		return mapping.findForward("CadastroUsuario");

	}
}
