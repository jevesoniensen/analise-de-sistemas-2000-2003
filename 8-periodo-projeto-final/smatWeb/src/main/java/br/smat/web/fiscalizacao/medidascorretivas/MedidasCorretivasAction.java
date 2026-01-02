package br.smat.web.fiscalizacao.medidascorretivas;

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
import br.smat.ejb.medidacorretivafiscalizacao.MedidaCorretivaFiscalizacao;
import br.smat.objetosauxiliares.auxmedidacorretiva.AuxMedidaCorretiva;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjMedidaCorretivaFiscalizacao;
import br.smat.web.obj.ObjTipoMedidaCorretiva;

/**
 * @version 	1.0
 * @author
 */
public class MedidasCorretivasAction extends Action {

	/**
	* Constructor
	*/
	public MedidasCorretivasAction() {

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

		try {

			Collection				colMedidasCorretivas 		= null;
			AuxMedidaCorretiva[]	colMedidasCorretivasFiscal	= null;

			String		acao				= ((MedidasCorretivasFiscalizacaoActionForm) form).getAcao();
			String 		destino 			= ((MedidasCorretivasFiscalizacaoActionForm) form).getDestino();
			int		fiscalizacao		= ((MedidasCorretivasFiscalizacaoActionForm) form).getFiscalizacao();
			int		tramiteFiscalizacao = ((MedidasCorretivasFiscalizacaoActionForm) form).getTramiteFiscalizacao();
			int		prazoDias			= ((MedidasCorretivasFiscalizacaoActionForm) form).getPrazoDias();
			int		tipoMedidaCorretiva = ((MedidasCorretivasFiscalizacaoActionForm) form).getTipoMedidaCorretiva();
			String		observacao			= ((MedidasCorretivasFiscalizacaoActionForm) form).getObservacao();
			int		status				= ((MedidasCorretivasFiscalizacaoActionForm) form).getStatus();	
			String		statusFiscalizacao	= ((MedidasCorretivasFiscalizacaoActionForm) form).getStatusFiscalizacao();

			System.out.println("Inicio Status " + status);



			if(acao != null && acao.equals("GRAVAR")){
				try {
					ObjMedidaCorretivaFiscalizacao objMCF = new ObjMedidaCorretivaFiscalizacao(tramiteFiscalizacao,
																								fiscalizacao,
																								tipoMedidaCorretiva,
																								prazoDias,
																								observacao);								
					objMCF.save();	
					request.setAttribute("mensagem","Medida corretiva gravada com sucesso!");
				} catch (Exception e) {
					request.setAttribute("mensagem","Erro ao gravar medida corretiva do trâmite!");
				}																						
			}
			else
			if(acao != null && acao.equals("PREENCHEFORM")){
				MedidaCorretivaFiscalizacao mc = ObjMedidaCorretivaFiscalizacao.findByPrimaryKey(fiscalizacao,tramiteFiscalizacao,tipoMedidaCorretiva);
				
				
				((MedidasCorretivasFiscalizacaoActionForm) form).setPrazoDias(mc.getPrazoDias());
				((MedidasCorretivasFiscalizacaoActionForm) form).setObservacao(mc.getObservacao());
			}
			else
			if(acao != null && acao.equals("REMOVER")){			
				try {
					if(fiscalizacao >0 && tramiteFiscalizacao > 0 && tipoMedidaCorretiva > 0){
						ObjMedidaCorretivaFiscalizacao objMCF = new ObjMedidaCorretivaFiscalizacao(tramiteFiscalizacao,
																									fiscalizacao,
																									tipoMedidaCorretiva,
																									prazoDias,
																									observacao);												
						objMCF.remove();																							
						((MedidasCorretivasFiscalizacaoActionForm) form).setPrazoDias(0);
						((MedidasCorretivasFiscalizacaoActionForm) form).setObservacao("");				
						((MedidasCorretivasFiscalizacaoActionForm) form).setTipoMedidaCorretiva(0);					
						request.setAttribute("mensagem","Medida corretiva excluida com sucesso!");					
					}
					else
						request.setAttribute("mensagem","Deve ser selecionada uma medidada para ser excluida!");					
				} catch (Exception e) {
					request.setAttribute("mensagem","Erro ao excluir medida corretiva!");
				}
			}
				
			
			Collection	colMedidaCorretiva	= ObjTipoMedidaCorretiva.findAllTipoMedidaCorretiva();
			
			((MedidasCorretivasFiscalizacaoActionForm) form).setDestino(null);			
			if(destino != null)
			if(destino.length() > 0){
				if(destino.equalsIgnoreCase("RETORNAR")){
						
						ActionForward forward = new ActionForward();
						destino = null;
																				
						forward.setName("RETORNAR_");
						forward.setPath("fiscalizacao/Tramite.do?fiscalizacao="+fiscalizacao+"&tramiteFiscalizacao="+tramiteFiscalizacao+"&destino="+null+"&statusFiscalizacao="+statusFiscalizacao);										
						return forward;
				}
			}
			
			colMedidasCorretivasFiscal = ObjGenerico.listAllMedidaCorretivaFiscalizacao(fiscalizacao,tramiteFiscalizacao);

			request.getSession().setAttribute("colMedidaCorretiva",colMedidaCorretiva);
			request.getSession().setAttribute("colMedidasCorretivasFiscal",colMedidasCorretivasFiscal);
				
			request.setAttribute("status",String.valueOf(status));

		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward("erroDefault");		

		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.

/*		if (!errors.empty()) {
			saveErrors(request, errors);

			// Forward control to the appropriate 'failure' URI (change name as desired)
			//	forward = mapping.findForward("failure");

		} else {

			// Forward control to the appropriate 'success' URI (change name as desired)
			// forward = mapping.findForward("success");

		}*/

		// Finish with
		return mapping.findForward("MedidasCorretivasFiscalizacao");

	}
}
