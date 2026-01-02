package br.smat.web.investigacao.medidascorretivasinvestigacao;

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
import br.smat.ejb.medidacorretivainvestigacao.MedidaCorretivaInvestigacao;
import br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretiva;
import br.smat.objetosauxiliares.auxmedidacorretiva.AuxMedidaCorretiva;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjMedidaCorretivaInvestigacao;
import br.smat.web.obj.ObjTipoMedidaCorretiva;

/**
 * @version 	1.0
 * @author
 */
public class MedidasCorretivasInvestigacaoAction extends Action {

	/**
	* Constructor
	*/
	public MedidasCorretivasInvestigacaoAction() {

		super();

	}
	public ActionForward perform(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws IOException, ServletException {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();
		// return value

		Collection	colMedidaCorretiva	= null;
		AuxMedidaCorretiva[] auxMedidaCorretiva = null;

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
		
		try {

			int numInvestigacao =  ((MedidasCorretivasInvestigacaoActionForm) form).getNumInvestigacao();
			String acao 		=   ((MedidasCorretivasInvestigacaoActionForm) form).getAcao();
			int tipoMedidaCorretiva = ((MedidasCorretivasInvestigacaoActionForm) form).getTipoMedidaCorretiva();
			String observacao = ((MedidasCorretivasInvestigacaoActionForm) form).getObservacoes();
			int prazoDias = ((MedidasCorretivasInvestigacaoActionForm) form).getPrazoDias();
			String erroBanco = null;
			
			colMedidaCorretiva = ObjTipoMedidaCorretiva.findAllTipoMedidaCorretiva();
			

			if(numInvestigacao != 0)
				auxMedidaCorretiva = ObjGenerico.getAllMedidasCorretivasInvestigacao(numInvestigacao);

			if(acao != null)
			if(acao.equals("MOSTRARMEDIDACORRETIVA")){
				
				for(int i = 0; i < auxMedidaCorretiva.length; i++){
					
					if(tipoMedidaCorretiva == auxMedidaCorretiva[i].getTipoMedidaCorretiva()){
						
						((MedidasCorretivasInvestigacaoActionForm) form).setPrazoDias(auxMedidaCorretiva[i].getPrazoDias());
						((MedidasCorretivasInvestigacaoActionForm) form).setObservacoes(auxMedidaCorretiva[i].getObservacao());
						break;
					}
										
				}
			}else
			if(acao.equals("GRAVAR")){
				
				try{
					ObjMedidaCorretivaInvestigacao objMedidaCorretivaInvestigacao = new ObjMedidaCorretivaInvestigacao(numInvestigacao,tipoMedidaCorretiva,prazoDias,observacao);
					objMedidaCorretivaInvestigacao.save();
					erroBanco = "Medida corretiva gravada com sucesso!";
				}catch(Exception e){
					erroBanco = "Não foi possível gravar a medida corretiva!";
				}

				auxMedidaCorretiva = ObjGenerico.getAllMedidasCorretivasInvestigacao(numInvestigacao);
			}else
			if(acao.equals("EXCLUIR")){
				try{
					if(tipoMedidaCorretiva != 0){
						MedidaCorretivaInvestigacao tipo = ObjMedidaCorretivaInvestigacao.findByPrimaryKey(numInvestigacao,tipoMedidaCorretiva);
						tipo.remove();
						erroBanco = "Medida corretiva excluída com sucesso!";
						((MedidasCorretivasInvestigacaoActionForm) form).setPrazoDias(0);
						((MedidasCorretivasInvestigacaoActionForm) form).setObservacoes(null);
						((MedidasCorretivasInvestigacaoActionForm) form).setTipoMedidaCorretiva(0);
					}else{
						erroBanco = "É necessário selecionar uma medida corretiva para que ela possa ser excluída!";
					}
				}catch(Exception e){
					erroBanco = "Erro ao excluir a medida corretiva!";
				}
				auxMedidaCorretiva = ObjGenerico.getAllMedidasCorretivasInvestigacao(numInvestigacao);
			}else
			if(acao.equals("RETORNAR")){
				System.out.println("AQUIII");
				forward.setName("RETORNAR_");
				forward.setPath("investigacao/DetalhesInvestigacao.do?numInvestigacao="+numInvestigacao+"&acao=LISTAR");
				return forward;
			}

			request.setAttribute("erroBanco",erroBanco);
			request.getSession().setAttribute("auxMedidaCorretiva",auxMedidaCorretiva);			
			request.getSession().setAttribute("colMedidaCorretiva",colMedidaCorretiva);
			
			
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
		return mapping.findForward("MedidasCorretivasInvestigacao");

	}
}
