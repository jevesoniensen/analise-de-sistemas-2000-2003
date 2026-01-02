package br.smat.web.relatoriosalvo;

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
import br.smat.ejb.relatoriosalvo.RelatorioSalvo;
import br.smat.relatorio.Relatorio;
import br.smat.web.obj.ObjRelatorioSalvo;
import br.smat.web.relatorio.GeraRelatorio;

/**
 * @version 	1.0
 * @author
 */
public class RelatorioSalvoAction extends Action {

	/**
	* Constructor
	*/
	public RelatorioSalvoAction() {

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

		try {
			String acao	= null;			
			acao = 			(((RelatorioSalvoActionForm) form).getAcao());
			
			if(acao != null)
			if(acao.equals("ZERARSESSAO")){
				((RelatorioSalvoActionForm) form).apaga();
				acao = "LISTAR";
			}

			String erroBanco = null;
			Vector colRelatorioSalvo = null;
			RelatorioSalvo relSalvo = null;
			Collection colAux = null;
			int relSelected	= 0;

			
			relSelected = 	(((RelatorioSalvoActionForm) form).getRelSelected());
			

			request.getSession().removeAttribute("visualizaRelatorio");

			if(relSelected > 0)				
				relSalvo = ObjRelatorioSalvo.findByPrimaryKey(relSelected);
			else
				request.getSession().removeAttribute("relSalvo");

			if(acao != null){
				if(acao.equals("GERAR")){
					
					Relatorio rel = GeraRelatorio.geraRelatorio(relSalvo);
					System.out.println("Rel com campo1 => " + rel.getCampo1());
					request.getSession().setAttribute("relatorio",rel);
					request.getSession().setAttribute("visualizaRelatorio","visualizaRelatorio");
				}else
					if(acao.equals("EXCLUIR")){
						try{
							relSalvo.remove();
						}
						catch(Exception e){
							erroBanco = "Erro ao excluir o relatório!";
						}
						
						if(erroBanco == null){
							erroBanco = "Relatório excluído com sucesso!";
							relSalvo = null;
							request.getSession().removeAttribute("relSalvo");
						}
					}
					
				
				
			}
						
			colAux = ObjRelatorioSalvo.findAllRelatorios();
			
			if(colAux != null){
				colRelatorioSalvo = new Vector(colAux);
				request.getSession().setAttribute("colRelatorioSalvo",colRelatorioSalvo);
			}
			else
				request.getSession().removeAttribute("colRelatorioSalvo");


			if(relSalvo != null){
				request.getSession().setAttribute("relSalvo",relSalvo);
				
				if(relSalvo.getTexto() != null)
				((RelatorioSalvoActionForm) form).setTextarea(relSalvo.getTexto());
			}

			System.out.println("erroWwWwWwW => " + erroBanco);
			request.getSession().setAttribute("erroBanco",erroBanco);

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
		return mapping.findForward("RelatorioSalvo");

	}
}
