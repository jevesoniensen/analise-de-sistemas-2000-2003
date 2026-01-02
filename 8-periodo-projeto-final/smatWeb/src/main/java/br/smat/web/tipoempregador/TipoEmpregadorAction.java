package br.smat.web.tipoempregador;

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
import br.smat.ejb.tipoempregador.TipoEmpregadorHome;
import br.smat.web.obj.ObjTipoEmpregador;

/**
 * @version 	1.0
 * @author
 */
public class TipoEmpregadorAction extends Action {

	/**
	* Constructor
	*/
	public TipoEmpregadorAction() {

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
			
			int	tipoEmpregador 	 = (((TipoEmpregadorActionForm) form).getTipoEmpregador());			
			String 	nome 			 = (((TipoEmpregadorActionForm) form).getNome());
			String 	docIdentificador = (((TipoEmpregadorActionForm) form).getDocIdentificador());
			String 	acao			 = (((TipoEmpregadorActionForm) form).getAcao());			 
			
			ObjTipoEmpregador objTipoEmpregador = new ObjTipoEmpregador();	
			String erroBanco = "";			
			
			if(nome != null){				
				if(acao.equals("EXCLUIR")){
					erroBanco = objTipoEmpregador.remove(tipoEmpregador);
					((TipoEmpregadorActionForm) form).apaga();					
				}
				else{
					erroBanco = objTipoEmpregador.armazena(tipoEmpregador,nome,docIdentificador);	
				
					if(tipoEmpregador == 0)					
						((TipoEmpregadorActionForm) form).setTipoEmpregador(objTipoEmpregador.getTipoEmpregador());
				}
					
			}
			
			((TipoEmpregadorActionForm) form).setAcao("GRAVAR");
						
			Collection 	colTiposEmpregadores = objTipoEmpregador.findAllTiposEmpredadores();			
			
			request.getSession().setAttribute("colTiposEmpregadores",colTiposEmpregadores);
			request.getSession().setAttribute("erroBanco",erroBanco);
			//request.setAttribute("colTiposEmpregadores",colTiposEmpregadores);
			//request.setAttribute("erroBanco",erroBanco);
			


		} catch (Exception e) {

			e.printStackTrace();
			return mapping.findForward("erroDefault");

		}
		
		return mapping.findForward("TipoEmpregador");
	}
}
