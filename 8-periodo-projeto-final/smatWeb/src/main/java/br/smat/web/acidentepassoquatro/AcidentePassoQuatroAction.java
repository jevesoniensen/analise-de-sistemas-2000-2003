package br.smat.web.acidentepassoquatro;

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
import br.smat.web.obj.ObjAcidente;
import br.smat.web.obj.ObjArea;
import br.smat.web.obj.ObjDiagnostico;
import br.smat.web.obj.ObjEmitente;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjEstadoCivil;
import br.smat.web.obj.ObjFonte;
import br.smat.web.obj.ObjLocalAtendimento;
import br.smat.web.obj.ObjOcupacao;
import br.smat.web.obj.ObjPagina;
import br.smat.web.obj.ObjVinculoEmpregaticio;

/**
 * @version 	1.0
 * @author
 */
public class AcidentePassoQuatroAction extends Action {

	/**
	* Constructor
	*/
	public AcidentePassoQuatroAction() {

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

		ActionErrors 	errors = new ActionErrors();
		ActionForward 	forward = new ActionForward();

		try {
			
			ObjAcidente	 objAcidente 	     = (ObjAcidente) request.getSession().getAttribute("objAcidente");
			
			if(objAcidente != null){
				
				String permitido = objAcidente.getDestinoPermitido();
				
				if(permitido != null ){
				   if(!permitido.equalsIgnoreCase("PASSOQUATRO"))
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
			
			
			Vector		 vLocalLesaoAcidente = (Vector) request.getSession().getAttribute("vLocalLesaoAcidente");
			
			if(vLocalLesaoAcidente == null)
				vLocalLesaoAcidente = new Vector();
			
			String		 paginaAtual = (((AcidentePassoQuatroActionForm) form).getPaginaAtual());							
			
			((AcidentePassoQuatroActionForm) form).setPaginaAtual("PASSOQUATRO");			
			
			String	destino		 = (((AcidentePassoQuatroActionForm) form).getDestino());			
	
			Collection colLocalAtendimento  = ObjLocalAtendimento.findAllLocaisAtendimento();
			Collection colDiagnostico		= ObjDiagnostico.findAllDiagnosticos(); 
	   	    Collection colEstado			= ObjEstado.findAllEstados();		
			Collection colFonte				= ObjFonte.findAllFontes();
			
			request.getSession().setAttribute("objAcidente"        ,objAcidente        );			
			request.getSession().setAttribute("colLocalAtendimento",colLocalAtendimento);
			request.getSession().setAttribute("colDiagnostico"     ,colDiagnostico     );
			request.getSession().setAttribute("colEstado"          ,colEstado          );
			request.getSession().setAttribute("colFonte"           ,colFonte           );
			
			if(destino == null || !destino.equalsIgnoreCase("PASSOQUATRO")){				
				objAcidente.setAcidente(((AcidentePassoQuatroActionForm) form).getAfastamento());
				objAcidente.setAfastamento(((AcidentePassoQuatroActionForm) form).getAfastamento());
				objAcidente.setCrm(((AcidentePassoQuatroActionForm) form).getCrm());
				objAcidente.setDataAtestado(((AcidentePassoQuatroActionForm) form).getDataAtestado());
				objAcidente.setDataEmissaoFonte(((AcidentePassoQuatroActionForm) form).getDataEmissaoFonte());
				objAcidente.setDescNaturezaLesao(((AcidentePassoQuatroActionForm) form).getDescNaturezaLesao());
				objAcidente.setDiagnostico(((AcidentePassoQuatroActionForm) form).getDiagnostico());
				objAcidente.setDuracaoTratamento(((AcidentePassoQuatroActionForm) form).getDuracaoTratamento());
				objAcidente.setFonte(((AcidentePassoQuatroActionForm) form).getFonte());
				objAcidente.setHoraAtestado(((AcidentePassoQuatroActionForm) form).getHoraAtestado());
				objAcidente.setInternacao(((AcidentePassoQuatroActionForm) form).getInternacao());
				objAcidente.setLocalAtendimento(((AcidentePassoQuatroActionForm) form).getLocalAtendimento());
				objAcidente.setMedico(((AcidentePassoQuatroActionForm) form).getMedico());
				objAcidente.setMedicoNome(((AcidentePassoQuatroActionForm) form).getMedicoNome());
				objAcidente.setNumDocFonte(((AcidentePassoQuatroActionForm) form).getNumDocFonte());
				objAcidente.setObservacoes(((AcidentePassoQuatroActionForm) form).getObservacoes());
				objAcidente.setUfCRM(((AcidentePassoQuatroActionForm) form).getUfCRM());
				objAcidente.setDescricaoDiagnostico(((AcidentePassoQuatroActionForm) form).getDescricaoDiagnostico());
			}
			if(destino.equalsIgnoreCase("PASSOQUATRO"))
				destino = null;			
			
									
			((AcidentePassoQuatroActionForm) form).setDestino(null);		
			if(destino != null)
			if(destino.length() > 0){
				
				if(destino.equalsIgnoreCase("AVANCAR"))
					objAcidente.setDestinoPermitido("ACIDENTEGRAVAR");
				else
				if( destino.equalsIgnoreCase("VOLTAR"))
					objAcidente.setDestinoPermitido("PASSOTRES");	

				if(destino.equalsIgnoreCase("VOLTAR")){						
					forward.setName("PASSOTRES_");
					forward.setPath("./cadastroacidente/AcidentePassoTres.do?destino=PASSOTRES&acao=listar");							
					return forward;																						
				}
				else
				if(destino.equalsIgnoreCase("AVANCAR")){
					/****************************
					 * 							*
					 * 		Permissão 			*	
					 *							* 
					 * **************************/			
							
							request.removeAttribute("permissaoPagina");
							
							if(usuario != null){
									try{
										pagina = ObjPagina.validaPermissaoPagina(usuario,5);//5 - AcidenteGravar.do
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
					return mapping.findForward(destino);
				}

			}
			
				((AcidentePassoQuatroActionForm) form).setAfastamento(objAcidente.getAfastamento());
				((AcidentePassoQuatroActionForm) form).setCrm(objAcidente.getCrm());
				((AcidentePassoQuatroActionForm) form).setDataAtestado(objAcidente.getDataAtestado());
				((AcidentePassoQuatroActionForm) form).setDataEmissaoFonte(objAcidente.getDataEmissaoFonte());
				((AcidentePassoQuatroActionForm) form).setDescNaturezaLesao(objAcidente.getDescNaturezaLesao());
				((AcidentePassoQuatroActionForm) form).setDescricaoDiagnostico(objAcidente.getDescricaoDiagnostico());
				((AcidentePassoQuatroActionForm) form).setDiagnostico(objAcidente.getDiagnostico());
				((AcidentePassoQuatroActionForm) form).setDuracaoTratamento(objAcidente.getDuracaoTratamento());
				((AcidentePassoQuatroActionForm) form).setFonte(objAcidente.getFonte());
				((AcidentePassoQuatroActionForm) form).setHoraAtestado(objAcidente.getHoraAtestado());
				((AcidentePassoQuatroActionForm) form).setInternacao(objAcidente.getInternacao());
				((AcidentePassoQuatroActionForm) form).setLocalAtendimento(objAcidente.getLocalAtendimento());
				((AcidentePassoQuatroActionForm) form).setMedico(objAcidente.getMedico());
				((AcidentePassoQuatroActionForm) form).setMedicoNome(objAcidente.getMedicoNome());
				((AcidentePassoQuatroActionForm) form).setNumDocFonte(objAcidente.getNumDocFonte());																																							
				((AcidentePassoQuatroActionForm) form).setObservacoes(objAcidente.getObservacoes());			
				((AcidentePassoQuatroActionForm) form).setUfCRM(objAcidente.getUfCRM());				
				
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
			return mapping.findForward("AcidentePassoQuatro");

	}
}
