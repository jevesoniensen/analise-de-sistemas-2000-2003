package br.smat.web.pesquisaempregador;

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
import org.apache.struts.actions.ForwardAction;

import br.smat.objetosauxiliares.auxempregador.AuxEmpregador;
import br.smat.web.obj.ObjEmpregador;
import br.smat.web.obj.ObjGenerico;
import br.smat.controleacesso.ejb.pagina.Pagina;
import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.ejb.empregador.*;

/**
 * @version 	1.0
 * @author
 */
public class PesquisaEmpregadorAction extends Action {

	/**
	* Constructor
	*/
	public PesquisaEmpregadorAction() {

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

		try {

			String 	acao        = ((PesquisaEmpregadorActionForm) form).getAcao();
			
			if(acao != null)
			if(acao.equals("ZERARSESSAO")){
				((PesquisaEmpregadorActionForm) form).apaga();
				acao = "LISTAR";
				request.getSession().removeAttribute("destinoSession");
				request.getSession().removeAttribute("origem");						
			}

			request.getSession().removeAttribute("destinoSession");
								
			int	empregador	= ((PesquisaEmpregadorActionForm) form).getEmpregador();
			String  documento	= ((PesquisaEmpregadorActionForm) form).getDocumento();	
			String  razaoSocial	= ((PesquisaEmpregadorActionForm) form).getRazaoSocial();				
			String 	destino     = ((PesquisaEmpregadorActionForm) form).getDestino();
			String	origem		= ((PesquisaEmpregadorActionForm) form).getOrigem();
			
			if(origem != null && origem.length() > 0){
				request.getSession().setAttribute("origem",origem);
				((PesquisaEmpregadorActionForm) form).setOrigem(null);
			}
									
			AuxEmpregador[]	auxEmpregadors = null;
			
			System.out.println(" empregador " + empregador);
		
			if(empregador > 0){
				Empregador e = ObjEmpregador.findByPrimaryKey(empregador);
				documento = e.getDocumento();
				razaoSocial = e.getRazaoSocial(); 
			}
			else			
			if(razaoSocial != null)
				auxEmpregadors = ObjGenerico.listEmpregadores(razaoSocial);	
			else
				auxEmpregadors = ObjGenerico.listEmpregadores("");				

			request.getSession().removeAttribute("destinoSession");
				
		//	if(destino != null)				
			//	if(destino.length() > 0)
			//		request.getSession().setAttribute("destinoSession",destino);					
				

			request.getSession().setAttribute("auxEmpregadors",auxEmpregadors);			
			
			ActionForward forward = new ActionForward();
			
			if(origem == null || origem.length()==0)
				origem = (String)request.getSession().getAttribute("origem");
			
			System.out.println("origem " + origem );			
			if(origem != null && origem.length() >0)
				request.getSession().setAttribute("destinoSession","origem");			
			
			if(documento == null)
				documento = "";
			
			if(razaoSocial == null || razaoSocial.trim().length() == 0){
				documento = "";
				razaoSocial = "";
			}
			
			if(acao != null)			
				if(acao.equalsIgnoreCase("RETORNAR") && origem != null){

					if(origem != null && origem.equalsIgnoreCase("PASSOUM")){									
						forward.setName("PASSOUM_");
						forward.setPath("cadastroacidente/AcidentePassoUm.do?empresa="+empregador+"&documento="+documento+"&razaoSocial="+razaoSocial+"&destino=RETORNAR&acao=LISTAR");
						request.getSession().removeAttribute("destinoSession");
						request.getSession().removeAttribute("origem");						
					}					
					else
					if(origem != null && origem.equalsIgnoreCase("PASSODOIS")){
						forward.setName("PASSODOIS_");
						forward.setPath("cadastroacidente/AcidentePassoDois.do?empresaTerceira="+empregador+"&documentoEmpresaTerceira="+documento+"&razaoSocialEmpresaterceira="+razaoSocial+"&destino=RETORNAR&acao=LISTAR");
						request.getSession().removeAttribute("destinoSession");
						request.getSession().removeAttribute("origem");												
					}	
					else					
					if(origem != null && origem.equalsIgnoreCase("CADASTROFISCALIZACAO")){
						forward.setName("CADASTROFISCALIZACAO_");
						forward.setPath("fiscalizacao/Cadastro.do?empregador="+empregador+"&docEmpregador="+documento+"&razaoSocial="+razaoSocial+"&destino=RETORNAR&acao=LISTAR");
						request.getSession().removeAttribute("destinoSession");
						request.getSession().removeAttribute("origem");												
					}											

					return forward;						
				}				


					
//				if(destino.equalsIgnoreCase("PASSOUM")){				
//						
//						forward.setName("PASSOUM_");
//						forward.setPath("smatWeb/cadastroacidente/AcidentePassoUm.do?empresa="+empregador+"&documento="+documento+"&razaoSocial="+razaoSocial+"&destino=RETORNAR&acao=listar");
//					}					
//					else
//					if(destino.equalsIgnoreCase("PASSODOIS")){
//						forward.setName("PASSODOIS_");
//						forward.setPath("smatWeb/cadastroacidente/AcidentePassoDois.do?empresaTerceira="+empregador+"&documentoEmpresaTerceira="+documento+"&razaoSocialEmpresaterceira="+razaoSocial+"&destino=RETORNAR&acao=listar");
//					}	
//					else					
//					if(destino.equalsIgnoreCase("CADASTROFISCALIZACAO")){
//						forward.setName("CADASTROFISCALIZACAO_");
//						forward.setPath("smatWeb/fiscalizacao/Cadastro.do?empregador="+empregador+"&docEmpregador="+documento+"&razaoSocial="+razaoSocial+"&destino=RETORNAR&acao=listar");
//					}											
//
//					return forward;						
//				}				
				
				
		} catch (Exception e) {
			e.printStackTrace();
			// Report the error using the appropriate name and ID.
			//errors.add("name", new ActionError("id"));
				return mapping.findForward("erroDefault");

		}

		// Finish with
		return mapping.findForward("PesquisaEmpregador");

	}
}
