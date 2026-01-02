package br.smat.web.pesquisaacidente;

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

import br.smat.controleacesso.ejb.pagina.Pagina;
import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjAcidente;

/**
 * @version 	1.0
 * @author
 */
public class ResultadoPesquisaAcidenteAction extends Action {

	/**
	* Constructor
	*/
	public ResultadoPesquisaAcidenteAction() {

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
		
		ObjAcidente objAcidente = null;
		String[] linha = null;

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
		int	acidente	= ((ResultadoPesquisaAcidenteActionForm) form).getAcidente();
		String	acao	= ((ResultadoPesquisaAcidenteActionForm) form).getAcao();
		
		try {

			if(acidente != 0){
				request.setAttribute("acidenteChecked",""+acidente);
			}
				
			request.getSession().removeAttribute("objAcidente");
			if(acao != null)
				if(acao.equals("VISUALIZAACIDENTE")){

					if(acidente != 0){
						objAcidente = ObjAcidente.getInstanciaAcidente(acidente);
						request.getSession().setAttribute("objAcidente",objAcidente);
						return mapping.findForward("ResultadoPesquisaAcidente");				
					}
				}
				else
					if(acao.equals("RETORNAR")){
						return mapping.findForward("PesquisaAcidente");
					}
					else
					if(acao.equals("GERARINVESTIGACAO")){

						objAcidente = ObjAcidente.getInstanciaAcidente(acidente);

						String numInvestigacao = "";

						acao = "LISTAR";
						
						if(objAcidente.getInvestigacao() != 0){
							numInvestigacao = ""+objAcidente.getInvestigacao();
							acao="BUSCAR";
						}

						request.getSession().setAttribute("objAcidente",objAcidente);
						
						forward.setName("_GERARINVESTIGACAO");
						forward.setPath("investigacao/CadastroInvestigacao.do?acao="+acao+"&numInvestigacao="+numInvestigacao+"&destino=PESQUISA");
						return forward;						
						//return mapping.findForward("CadastroInvestigacao");
					}
					
				

			// do something here

		} catch (Exception e) {

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
		return mapping.findForward("ResultadoPesquisaAcidente");

	}
}
