package br.smat.web.fiscalizacao.fiscalizacoes;

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

import com.ibm.CORBA.iiop.Request;

import br.smat.controleacesso.ejb.pagina.Pagina;
import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.ejb.empregador.Empregador;
import br.smat.ejb.ramoatividade.RamoAtividade;
import br.smat.objetosauxiliares.auxfiscalizacaoempregador.AuxFiscalizacaoEmpregador;
import br.smat.web.obj.ObjEmpregador;
import br.smat.web.obj.ObjFiscalizacao;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjRamoAtividade;

/**
 * @version 	1.0
 * @author
 */
public class FiscalizacoesAction extends Action {

	/**
	* Constructor
	*/
	public FiscalizacoesAction() {

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
			
			AuxFiscalizacaoEmpregador	auxFiscalEmpregador = null;
			AuxFiscalizacaoEmpregador[] auxFiscalizacaoEmpregador = ObjGenerico.listAuxFiscalizacaoEmpregadorAgente();
			
			int 	fiscalizacao 	= ((FiscalizacoesActionForm)form).getFiscalizacao();
			String	destino			= ((FiscalizacoesActionForm)form).getDestino();
			String	acao			= ((FiscalizacoesActionForm)form).getAcao();
			
			if(acao != null && acao.equals("FINALIZAR")){
				try {
					ObjFiscalizacao objFiscalizacao = new ObjFiscalizacao(fiscalizacao);
					objFiscalizacao.finalizaInvestigacao();	
					request.setAttribute("mensagem","Fiscalização finalizada com sucesso!");
				} catch (Exception e) {
					System.out.println("Exceção da fiscalização");
					e.printStackTrace();
					request.setAttribute("mensagem","Erro ao finalizar fiscalização, possivelmente o ultimo trâmite não foi finalizado!");					
				}			
			}
			
			if(fiscalizacao > 0)
				auxFiscalEmpregador = ObjGenerico.listAuxFiscalizacaoEmpregadorAgente(fiscalizacao);
				
			String statusFiscalizacao = null;
						
			if(auxFiscalEmpregador != null && auxFiscalEmpregador.getDataFinalizacao() != null)
				statusFiscalizacao = "FINALIZADO";				
			else
				statusFiscalizacao = "ABERTO";
			
			((FiscalizacoesActionForm) form).setDestino(null);			
			if(destino != null)
			if(destino.length() > 0){
				if(destino.equalsIgnoreCase("CADASTRO")){
						ActionForward forward = new ActionForward();
														
						forward.setName("CADASTRO_");
						forward.setPath("fiscalizacao/Cadastro.do?acao=ATUALIZAR&destino=ATUALIZAR&fiscalizacao="+fiscalizacao);										
						return forward;
				}				
				else
				if(destino.equalsIgnoreCase("TRAMITE")){
						ActionForward forward = new ActionForward();
						
						int 			empregador 		= auxFiscalEmpregador.getEmpregador();						
						Empregador		objEmpregador	= ObjEmpregador.findByPrimaryKey(empregador);
						RamoAtividade	ramoAtividade 	= ObjRamoAtividade.findByPrimaryKey(objEmpregador.getRamoAtividade().ramoAtividade);
							
						request.getSession().setAttribute("ramoAtividadeEmpFiscal",ramoAtividade);
						
																							
						forward.setName("TRAMITE_");
						forward.setPath("fiscalizacao/Tramite.do?fiscalizacao="+fiscalizacao+"&statusFiscalizacao="+statusFiscalizacao);										
						return forward;
				}												
			}				
			
			request.getSession().setAttribute("auxFiscalizacaoEmpregador"	,auxFiscalizacaoEmpregador);			
			request.getSession().setAttribute("auxFiscalEmpregador"			,auxFiscalEmpregador);		
			request.setAttribute("statusFiscalizacao",statusFiscalizacao);
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
		return mapping.findForward("Fiscalizacoes");

	}
}
