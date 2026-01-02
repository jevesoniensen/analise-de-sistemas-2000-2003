package br.smat.web.visualizaacidenteaction;

import java.io.IOException;
import java.util.Enumeration;

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
import br.smat.ejb.acidente.Acidente;
import br.smat.web.obj.ObjAcidente;
import br.smat.web.obj.ObjLocalLesaoAcidente;
import br.smat.web.obj.ObjPagina;
import br.smat.web.obj.ObjTestemunha;

/**
 * @version 	1.0
 * @author
 */
public class VisualizaAcidenteAction extends Action {

	/**
	* Constructor
	*/
	public VisualizaAcidenteAction() {

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
		
		request.removeAttribute("permissaoPagina");
		
		Pagina  pagina = null;

		if(usuario != null){
				try{
					pagina = ObjPagina.validaPermissaoPagina(usuario,6);//6 - VisualizaAcidente.do
				}
				catch(Exception e){}
				
				if(pagina == null)
					return mapping.findForward("AccessDenied");

				request.setAttribute("permissaoPagina",pagina);
					
		}
		else
			return mapping.findForward("LoginInit");
/***************************
 ***************************/

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();
		// return value

		try {

			ObjAcidente	 objAcidente = (ObjAcidente) request.getSession().getAttribute("objAcidente");
			
			ObjTestemunha[] 		vTestemunhas = objAcidente.getVTestemunhas();
			ObjLocalLesaoAcidente[]	vLocalLesaoAcidente = objAcidente.getVLocalLesaoAcidente();


			System.out.println("Agente causador " + objAcidente.getAgenteCausador() + " === " + objAcidente.getNomeAgenteCausador());			
			
			if(vTestemunhas != null)
				request.setAttribute("vTestemunhas",vTestemunhas);
						
			if(vLocalLesaoAcidente != null)
				request.setAttribute("vLocalLesaoAcidente",vLocalLesaoAcidente);
				

	
		} catch (Exception e) {

			// Report the error using the appropriate name and ID.
			//errors.add("name", new ActionError("id"));
			e.printStackTrace();
			return mapping.findForward("erroDefault");

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

		// Finish with
		return mapping.findForward("VisualizaFormAcidente");

	}
}
