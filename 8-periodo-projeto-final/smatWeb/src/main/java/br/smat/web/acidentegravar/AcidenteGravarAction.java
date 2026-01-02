package br.smat.web.acidentegravar;

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
import br.smat.web.obj.ObjAcidente;
import br.smat.web.obj.ObjArea;
import br.smat.web.obj.ObjDiagnostico;
import br.smat.web.obj.ObjEmitente;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjEstadoCivil;
import br.smat.web.obj.ObjFonte;
import br.smat.web.obj.ObjLocalAtendimento;
import br.smat.web.obj.ObjOcupacao;
import br.smat.web.obj.ObjVinculoEmpregaticio;

/**
 * @version 	1.0
 * @author
 */
public class AcidenteGravarAction extends Action {

	/**
	* Constructor
	*/
	public AcidenteGravarAction() {

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

		ActionErrors errors = null;
		ActionForward forward = new ActionForward();
		// return value

		try {
			
			ObjAcidente	 objAcidente = (ObjAcidente) request.getSession().getAttribute("objAcidente");
			
			if(objAcidente != null){
				
				String permitido = objAcidente.getDestinoPermitido();
				
				System.out.println("permitido " + permitido);
				
				if(permitido != null ){
				   if(!permitido.equalsIgnoreCase("ACIDENTEGRAVAR"))
				   		objAcidente = null;
				}
				else
					objAcidente = null;
				   	
				System.out.println("permitido " + permitido + " acidente " + objAcidente);
			}
			
			if(objAcidente == null){
				Collection		colEmitente			 	= ObjEmitente.findAllEmitentes();	
				Collection		colEstadoCivil		 	= ObjEstadoCivil.findAllEstadosCivis();
				Collection		colOcupacao			 	= ObjOcupacao.findAllOcupacoes();
				Collection 		colVinculoEmpregaticio  = ObjVinculoEmpregaticio.findAllVinculosEmpregaticios();
				Collection 		colArea					= ObjArea.findAllAreas();							
							
				request.getSession().setAttribute("colEmitente",colEmitente);
				request.getSession().setAttribute("colEstadoCivil",colEstadoCivil);
				request.getSession().setAttribute("colOcupacao",colOcupacao);
				request.getSession().setAttribute("colVinculoEmpregaticio",colVinculoEmpregaticio);
				request.getSession().setAttribute("colArea",colArea);
						
				forward.setName("PASSOUM_");
				forward.setPath("./cadastroacidente/AcidentePassoUm.do?destino=PASSOUM&acao=ZERARSESSAO");							
				return forward;					
			}						
			
			((AcidenteGravarActionForm) form).setPaginaAtual("ACIDENTEGRAVAR");			
			
			String acao = ((AcidenteGravarActionForm) form).getAcao();
													
			String	destino		 = (((AcidenteGravarActionForm) form).getDestino());			
			
			((AcidenteGravarActionForm) form).setDestino(null);		
			if(destino != null)
			if(destino.length() > 0){
				
				if(destino.equalsIgnoreCase("VOLTAR")){

					objAcidente.setDestinoPermitido("PASSOQUATRO");					
					Collection colLocalAtendimento  = ObjLocalAtendimento.findAllLocaisAtendimento();
					Collection colDiagnostico		= ObjDiagnostico.findAllDiagnosticos(); 
			   	    Collection colEstado			= ObjEstado.findAllEstados();							
					Collection colFonte				= ObjFonte.findAllFontes();
							
					request.getSession().setAttribute("colLocalAtendimento",colLocalAtendimento);
					request.getSession().setAttribute("colDiagnostico"     ,colDiagnostico     );
					request.getSession().setAttribute("colEstado"          ,colEstado          );
					request.getSession().setAttribute("colFonte"           ,colFonte           );													
					
					forward.setName("PASSOQUATRO_");
					forward.setPath("./cadastroacidente/AcidentePassoQuatro.do?destino=PASSOQUATRO&acao=listar");							
					return forward;						
				}	
				else
				if(destino.equalsIgnoreCase("NOVO")){
						Collection		colEmitente			 	= ObjEmitente.findAllEmitentes();	
						Collection		colEstadoCivil		 	= ObjEstadoCivil.findAllEstadosCivis();
						Collection		colOcupacao			 	= ObjOcupacao.findAllOcupacoes();
						Collection 		colVinculoEmpregaticio  = ObjVinculoEmpregaticio.findAllVinculosEmpregaticios();
						Collection 		colArea					= ObjArea.findAllAreas();							
							
						request.getSession().setAttribute("colEmitente",colEmitente);
						request.getSession().setAttribute("colEstadoCivil",colEstadoCivil);
						request.getSession().setAttribute("colOcupacao",colOcupacao);
						request.getSession().setAttribute("colVinculoEmpregaticio",colVinculoEmpregaticio);
						request.getSession().setAttribute("colArea",colArea);
							
						forward.setName("PASSOUM_");
						forward.setPath("./cadastroacidente/AcidentePassoUm.do?destino=PASSOUM&acao=ZERARSESSAO");							
						return forward;					
				}
								
				return mapping.findForward(destino);	
			}
			
			String erro = null;
			
			if(acao != null)
				if(acao.equalsIgnoreCase("GRAVAR"))
					if(objAcidente != null){
						
						try{
						  objAcidente.save();
						}catch(Exception e){
							erro = "Erro ao inserir acidente!";

						}
	
						errors = objAcidente.getErrors();
	
						if(erro == null && (errors == null || errors.empty())){
							erro = "Acidente cadastrado com sucesso!";
							request.getSession().removeAttribute("objAcidente");
							request.getSession().removeAttribute("vLocalLesaoAcidente");												
							request.getSession().removeAttribute("vTestemunhas");							
						}

						request.setAttribute("erroBanco",erro);
						
					}


		} catch (Exception e) {
			
			e.printStackTrace();
			return mapping.findForward("erroDefault");
		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.

		if(errors == null)		
			errors = new ActionErrors();


		if (!errors.empty()) {
			saveErrors(request, errors);

			// Forward control to the appropriate 'failure' URI (change name as desired)
			//	forward = mapping.findForward("failure");

		} else {

			// Forward control to the appropriate 'success' URI (change name as desired)
			// forward = mapping.findForward("success");

		}

		// Finish with
		return mapping.findForward("AcidenteGravar");

	}
}
