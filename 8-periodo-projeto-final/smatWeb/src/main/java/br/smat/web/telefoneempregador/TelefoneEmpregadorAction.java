package br.smat.web.telefoneempregador;

import java.io.IOException;
import java.util.Collection;
import java.util.Vector;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.pagina.Pagina;
import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.ejb.empregador.Empregador;
import br.smat.ejb.telefoneempregador.TelefoneEmpregador;
import br.smat.web.obj.ObjEmpregador;
import br.smat.web.obj.ObjTelefoneEmpregador;

/**
 * @version 	1.0
 * @author
 */
public class TelefoneEmpregadorAction extends Action {

	/**
	* Constructor
	*/
	public TelefoneEmpregadorAction() {

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
			

		ActionErrors errors = new ActionErrors();
		// return value

		try {
			
		int	telefoneEmpregador = (((TelefoneEmpregadorActionForm) form).getTelefoneEmpregador());
		int	empregador         = (((TelefoneEmpregadorActionForm) form).getEmpregador());				
		String 	descricao          = (((TelefoneEmpregadorActionForm) form).getDescricao());
		String 	ddd		           = (((TelefoneEmpregadorActionForm) form).getDdd());
		String 	numero             = (((TelefoneEmpregadorActionForm) form).getNumero());
		String  acao	           = (((TelefoneEmpregadorActionForm) form).getAcao());	 							 	
		
		ObjTelefoneEmpregador objTelefoneEmpregador = new ObjTelefoneEmpregador();
		ObjEmpregador		  objEmpregador         = new ObjEmpregador();		
		
		Collection colTelefoneEmpregador = (Collection)request.getSession().getAttribute("colTelefoneEmpregador");
		Empregador	empregadorBean = (Empregador)request.getSession().getAttribute("empregadorBean");
		
		if(empregadorBean == null || empregadorBean.getEmpregador() != empregador)
			empregadorBean = objEmpregador.findByPrimaryKey(empregador);
			
		System.out.println("aaaaaaaaaaaaaaaa => " + empregadorBean.getEmpregador());
				
		String erroBanco = "";
		
		if(acao != null){
			if(acao.equals("GRAVAR")){
				
				if(colTelefoneEmpregador != null && telefoneEmpregador == 0)
					if(colTelefoneEmpregador.size() > 2 )
						erroBanco = "É possivel cadastrar apenas 3 telefones !";
						
				if(erroBanco.equals("")){
					objTelefoneEmpregador.armazena(empregador,telefoneEmpregador,descricao,ddd,numero);
					((TelefoneEmpregadorActionForm) form).setTelefoneEmpregador(objTelefoneEmpregador.getTelefoneEmpregador());
				}
					
			}		
			else
			if(acao.equals("EXCLUIR")){		
				System.out.println("EXCLUIR");
				objTelefoneEmpregador.remove(telefoneEmpregador,empregador);
				((TelefoneEmpregadorActionForm) form).apaga();
			}
		}
		
		System.out.println("empregador =>" + empregador);
		colTelefoneEmpregador = objTelefoneEmpregador.findAllTelefonesEmpregador(empregador);
		
						
		request.getSession().setAttribute("empregadorBean",empregadorBean);
		request.getSession().setAttribute("colTelefoneEmpregador",colTelefoneEmpregador);
		request.getSession().setAttribute("erroBanco",erroBanco);
		

		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward("erroDefault");

		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.
/*
		if (!errors.empty()) {
			saveErrors(request, errors);

			// Forward control to the appropriate 'failure' URI (change name as desired)
			//	forward = mapping.findForward("failure");

		} else {

			// Forward control to the appropriate 'success' URI (change name as desired)
			// forward = mapping.findForward("success");

		}*/

		// Finish with
		return mapping.findForward("TelefoneEmpregador");

	}
}
