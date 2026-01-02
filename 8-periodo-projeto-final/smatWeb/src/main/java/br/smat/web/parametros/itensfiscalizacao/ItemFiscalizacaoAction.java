package br.smat.web.parametros.itensfiscalizacao;

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

import br.smat.controleacesso.ejb.pagina.Pagina;
import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjItemFiscalizacao;

/**
 * @version 	1.0
 * @author
 */
public class ItemFiscalizacaoAction extends Action {

	/**
	* Constructor
	*/
	public ItemFiscalizacaoAction() {

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

		ActionErrors errors = new ActionErrors();
		// return value

		try {
			
			

			String	acao			 = ((ItemFiscalizacaoActionForm)form).getAcao();
			
			if(acao != null)
			if(acao.equals("LISTAR")){
				((ItemFiscalizacaoActionForm)form).apaga();
				acao = "LISTAR";
			}

						
			int 	itemFiscalizacao = ((ItemFiscalizacaoActionForm)form).getItemFiscalizacao();
			String	nome			 = ((ItemFiscalizacaoActionForm)form).getNome();
			String	mensagem		 = null;
			
			if(acao != null){
				if(acao.equals("GRAVAR")){
					try {
						ObjItemFiscalizacao obj = new ObjItemFiscalizacao(itemFiscalizacao,nome);
						obj.save();
						
						 ((ItemFiscalizacaoActionForm)form).apaga();
						 
						
						if(itemFiscalizacao == 0)
							mensagem = "Item de fiscalização incluido com sucesso!";
						else
							mensagem = "Item de fiscalização alterado com sucesso!";						
							
						
					} catch (Exception e) {
						mensagem = "Erro ao incluir o Item de fiscalização!";						
					}
					
					
				}		
				else
				if(acao.equals("EXCLUIR")){
					try {
						if(itemFiscalizacao > 0){
							ObjItemFiscalizacao.remove(itemFiscalizacao);
							((ItemFiscalizacaoActionForm)form).apaga();
												
							mensagem = "Item de fiscalização excluido com sucesso!";												
						}
						else
							mensagem = "É necessário selecionar um item!";
						
					} catch (Exception e) {
						mensagem = "Erro ao excluir o Item de fiscalização!";						
					}
				}
			}
			
			Collection colItemFiscalizacao = ObjItemFiscalizacao.findAllItemFiscalizacao();
			
			System.out.println("colllll => " + colItemFiscalizacao);
			
			request.getSession().setAttribute("colItemFiscalizacao",colItemFiscalizacao);
			request.setAttribute("mensagem",mensagem);


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
		return mapping.findForward("ItemFiscalizacao");

	}
}
