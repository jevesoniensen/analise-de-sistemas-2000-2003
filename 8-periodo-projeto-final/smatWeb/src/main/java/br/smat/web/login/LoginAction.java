package br.smat.web.login;

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

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.objetosauxiliares.menu.Menu;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjUsuario;

/**
 * @version 	1.0
 * @author
 */
public class LoginAction extends Action {

	/**
	* Constructor
	*/
	public LoginAction() {

		super();

	}
	public ActionForward perform(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws IOException, ServletException {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();
		
		Usuario usuario = null;
		Menu menu[] = null;
		String erroBanco = null;
		// return value

		try {

			String nomeUsuario = (((LoginActionForm) form).getNomeUsuario());
			String senha = (((LoginActionForm) form).getSenha());
			String acao = (((LoginActionForm) form).getAcao());


			if(acao != null)
			if(acao.equals("FALSE")){
				System.out.println("ENTROU NO LOGIN1");
				erroBanco = "Sua sessão expirou! Favor fazer o login novamente!";
				request.setAttribute("erroBanco",erroBanco);
			}
			
			System.out.println("ENTROU NO LOGIN2");

			if(acao != null && acao.trim().length() != 0){
				if(acao.equals("GRAVAR")){
					System.out.println("nomeUsuario => " + nomeUsuario);
					System.out.println("senha => " + senha);
					
					try{
						usuario = ObjUsuario.findByNomeSenha(nomeUsuario,senha);
					}catch(Exception e){
						erroBanco = "Usuário ou senha inválidos!";
						request.setAttribute("erroBanco",erroBanco);
						return mapping.findForward("Login");
					}
					
					System.out.println("logou!!!!!!!!!");
					System.out.println("usuario => " + usuario.getUsuario());
					System.out.println("nome => " + usuario.getNome());
					System.out.println("senha => " + usuario.getSenha());

					menu = ObjGenerico.montaMenu(usuario.getUsuario());
					
					request.getSession().setAttribute("menu",menu);
					request.getSession().setAttribute("usuario",usuario);
				}
				else
					return mapping.findForward("Login");
			}
			else
				return mapping.findForward("Login");

		} catch (Exception e) {

			e.printStackTrace();
			return mapping.findForward("Login");

		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.

		if (!errors.empty()) {
			saveErrors(request, errors);

			// Forward control to the appropriate 'failure' URI (change name as desired)
			//	forward = mapping.findForward("failure");

		} else {

			// Forward control to the appropriate 'success' URI (change name as desired)
			// forward = mapping.findForward("success");

		}

		return mapping.findForward("Smat");
	}
}
