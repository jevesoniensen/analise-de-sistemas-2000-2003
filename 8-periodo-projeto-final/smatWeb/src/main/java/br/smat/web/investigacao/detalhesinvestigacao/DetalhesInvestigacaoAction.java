package br.smat.web.investigacao.detalhesinvestigacao;

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
import br.smat.objetosauxiliares.auxlistinvestigacao.AuxListInvestigacao;
import br.smat.web.obj.ObjAcidente;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjInvestigacao;

/**
 * @version 	1.0
 * @author
 */
public class DetalhesInvestigacaoAction extends Action {


	/**
	* Constructor
	*/
	public DetalhesInvestigacaoAction() {

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
		ActionForward forward = new ActionForward();
		// return value

		AuxListInvestigacao auxListInvestigacao[] = null;
		ObjInvestigacao objInvestigacao = null;
		
		int numInvestigacao = 0;
		String acao = null;
		ObjAcidente objAcidente = null;
		
		try {
		
			numInvestigacao = ((DetalhesInvestigacaoActionForm)form).getNumInvestigacao();
			acao = 	((DetalhesInvestigacaoActionForm)form).getAcao();

			if(acao != null && acao.equals("ZERARSESSAO")){
				((DetalhesInvestigacaoActionForm)form).apaga();
				auxListInvestigacao = null;
				objInvestigacao = null;
				numInvestigacao = 0;
				acao = null;
				objAcidente = null;
			}			
			
			if(numInvestigacao != 0){
				objInvestigacao = ObjInvestigacao.getTramiteInvestigacao(numInvestigacao);
				request.getSession().setAttribute("objInvestigacao",objInvestigacao);
				
			}
			else
				request.getSession().removeAttribute("objInvestigacao");
			

			if(acao != null)
			if(acao.equals("ATUALIZAR")){
				
				if(numInvestigacao != 0){

						objAcidente = ObjAcidente.getInstanciaAcidente(objInvestigacao.getAcidente());
						request.getSession().setAttribute("objAcidente",objAcidente);

						request.getSession().removeAttribute("objInvestigacao");

						forward.setName("_GERARINVESTIGACAO");
						forward.setPath("investigacao/CadastroInvestigacao.do?acao=BUSCAR&numInvestigacao="+numInvestigacao);
						return forward;
				}

			}else
			if(acao.equals("MEDIDASCORRETIVAS")){
				
				if(numInvestigacao != 0 ){

						request.getSession().removeAttribute("objInvestigacao");

						forward.setName("_MEDIDASCORRETIVAS");
						forward.setPath("investigacao/MedidasCorretivasInvestigacao.do?numInvestigacao="+numInvestigacao);
						return forward;					
				}
								
			}else
			if(acao.equals("DEPOIMENTOS")){
				
				request.getSession().removeAttribute("objInvestigacao");
				request.getSession().removeAttribute("objDepoimento");
				
				forward.setName("DETALHES_");
				forward.setPath("investigacao/Depoimentos.do?numInvestigacao="+numInvestigacao+"&acidente="+objInvestigacao.getAcidente()+"&dataAbertura="+objInvestigacao.getDataAbertura());
				return forward;	
			}



			auxListInvestigacao = ObjGenerico.getAllInvestigacoes();
			request.getSession().setAttribute("auxListInvestigacao",auxListInvestigacao);
			
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
		return mapping.findForward("DetalhesInvestigacao");

	}
}
