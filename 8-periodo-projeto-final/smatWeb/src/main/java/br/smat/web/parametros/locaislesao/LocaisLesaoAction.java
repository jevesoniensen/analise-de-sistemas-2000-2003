package br.smat.web.parametros.locaislesao;

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
import org.omg.CORBA.portable.ValueBase;

import br.smat.controleacesso.ejb.pagina.Pagina;
import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.ejb.locallesao.LocalLesao;
import br.smat.objetosauxiliares.auxlocallesao.AuxLocalLesao;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjLocalLesao;

/**
 * @version 	1.0
 * @author
 */
public class LocaisLesaoAction extends Action {

	/**
	* Constructor
	*/
	public LocaisLesaoAction() {

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
		// return value

		try {

			String	acao			= ((LocaisLesaoActionForm)form).getAcao();

			if(acao != null)
			if(acao.equals("ZERARSESSAO")){
				((LocaisLesaoActionForm)form).apaga();
				acao = "LISTAR";
			}
			
			int	localLesao 		= ((LocaisLesaoActionForm)form).getLocalLesao();
			int	localLesaoPai	= ((LocaisLesaoActionForm)form).getLocalLesaoPai();
			String	nome			= ((LocaisLesaoActionForm)form).getNome();	
			String	mensagem		= null;
			
			if(acao != null && acao.equals("PREENCHEFORM")){
				LocalLesao ll = ObjLocalLesao.findByPrimaryKey(localLesao);
				if(ll.getLocalLesaoPai() != null)
					((LocaisLesaoActionForm)form).setLocalLesaoPai(ll.getLocalLesaoPai().localLesao);	
				else
					((LocaisLesaoActionForm)form).setLocalLesaoPai(0);					
					
				((LocaisLesaoActionForm)form).setNome(ll.getNome());
			}
			else
			if(acao != null && acao.equals("GRAVAR")){
				try {
					ObjLocalLesao ll = new ObjLocalLesao(localLesao,nome,localLesaoPai);
					ll.save();
					
					if(localLesao == 0)
						mensagem = "local da lesão incluido com sucesso!";
					else
						mensagem = "local da lesão alterado com sucesso!";
						
					localLesao = ll.getLocalLesao();
					
					((LocaisLesaoActionForm)form).setLocalLesao(localLesao);
						
				} catch (Exception e) {
					mensagem = "Erro ao gravar o local da lesão";					
				}
					
					
			}	
			else
			if(acao != null && acao.equals("EXCLUIR")){					
				if(localLesao > 0){
					try {
						ObjLocalLesao ll = new ObjLocalLesao(localLesao);
						ll.remove();
						localLesao = 0;
						((LocaisLesaoActionForm)form).apaga();
							
						mensagem = "local lesão excluido com sucesso!";						
					} catch (Exception e) {
						mensagem = "Erro ao excluir o local da lesão";											
					}
				}
				else
					mensagem = "É necessário selecionar um  local da lesão!";
			}

			AuxLocalLesao[] auxLocalLesao 		= ObjGenerico.listAllLocaisLesao(); 
			Collection		colLocalLesaoPai	= ObjLocalLesao.findAllLocaisLesao();
			request.getSession().setAttribute("auxLocalLesao",auxLocalLesao);
			request.getSession().setAttribute("colLocalLesaoPai",colLocalLesaoPai);
			request.getSession().setAttribute("localLesaoTeste",String.valueOf(localLesao));
			request.setAttribute("mensagem",mensagem);
			
		} catch (Exception e) {

			e.printStackTrace();
			return mapping.findForward("erroDefault");

		}


		// Finish with
		return mapping.findForward("LocaisLesao");

	}
}
