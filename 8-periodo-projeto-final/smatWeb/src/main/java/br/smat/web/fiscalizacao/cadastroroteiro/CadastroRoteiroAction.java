package br.smat.web.fiscalizacao.cadastroroteiro;

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
import br.smat.objetosauxiliares.auxitempontofiscalizacao.AuxItemPontoFiscalizacao;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjPontoFiscalizacao;
import br.smat.web.obj.ObjRamoAtividade;
import br.smat.web.obj.ObjRoteiro;

/**
 * @version 	1.0
 * @author
 */
public class CadastroRoteiroAction extends Action {

	/**
	* Constructor
	*/
	public CadastroRoteiroAction() {

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


			String 	destino 			= ((CadastroRoteiroActionForm) form).getDestino();
			int	fiscalizacao		= ((CadastroRoteiroActionForm) form).getFiscalizacao();
			int	tramiteFiscalizacao = ((CadastroRoteiroActionForm) form).getTramiteFiscalizacao();
			
			Collection 					objRamoAtividade 		 = null;
			Collection  				objPontoFiscalizacao 	 = null;			
			Collection 					objRamoSuperior   		 = ObjRamoAtividade.findAllRamosAtividade(0);		
			AuxItemPontoFiscalizacao[]	auxItemPontoFiscalizacao = null;
			AuxItemPontoFiscalizacao[]	arItensRoteiro			 = null;	

			
			int 	ramoSuperior 		= ((CadastroRoteiroActionForm)form).getRamoSuperior();			
			int 	ramoAtividade 		= ((CadastroRoteiroActionForm)form).getRamoAtividade();
			int	pontoFiscalizacao 	= ((CadastroRoteiroActionForm)form).getPontoFiscalizacao();			
			int	removeItem			= ((CadastroRoteiroActionForm)form).getRemoveItem();
			int[]	itensFiscalizacao   = ((CadastroRoteiroActionForm)form).getItem();
			String	acao				= ((CadastroRoteiroActionForm)form).getAcao();
			int	status				= ((CadastroRoteiroActionForm)form).getStatus();


			if(acao != null && acao.equals("ADICIONAR")){
				try {
					ObjRoteiro objRoteiro = null;
					for(int i=0;i<itensFiscalizacao.length;i++){
						objRoteiro = new ObjRoteiro(	tramiteFiscalizacao,
														fiscalizacao,
														itensFiscalizacao[i]);
					
						objRoteiro.save();		
						tramiteFiscalizacao = objRoteiro.getTramiteFiscalizacao();											
						
						request.setAttribute("mensagem","Iten(s) adicionado(s) com sucesso!");
					}
					((CadastroRoteiroActionForm)form).setTramiteFiscalizacao(tramiteFiscalizacao);	
				} catch (Exception e) {
						request.setAttribute("mensagem","Erro ao tentar adicionar iten(s)!");					
				}			
			}
			else
			if(acao != null && acao.equals("REMOVER")){
				try {
					ObjRoteiro objRoteiro = new ObjRoteiro(tramiteFiscalizacao,fiscalizacao,removeItem);				
					objRoteiro.remove();
					request.setAttribute("mensagem","Item removido com sucesso!");
				} catch (Exception e) {
					request.setAttribute("mensagem","Erro ao tentar remover item!");
				}
			}

			
			if(fiscalizacao>0)
				arItensRoteiro = ObjGenerico.listItemRoteiro(fiscalizacao);
							
			if(ramoSuperior >0)
				objRamoAtividade = ObjRamoAtividade.findAllRamosAtividade(ramoSuperior);
				
			if(ramoAtividade > 0)
				objPontoFiscalizacao = ObjPontoFiscalizacao.findAllPontoFiscalizacao(ramoAtividade);
			
			
			((CadastroRoteiroActionForm) form).setDestino(null);			
			if(destino != null)
			if(destino.length() > 0){
				if(destino.equalsIgnoreCase("RETORNAR")){
						
						ActionForward forward = new ActionForward();
																				
						forward.setName("RETORNAR_");
						forward.setPath("fiscalizacao/Tramite.do?fiscalizacao="+fiscalizacao+"&tramiteFiscalizacao"+tramiteFiscalizacao+"&destino="+null+"&statusFiscalizacao=ABERTO&status="+status);										
						return forward;
				}
			}
			
			if(pontoFiscalizacao > 0)
				auxItemPontoFiscalizacao = ObjGenerico.listItemRoteiro(tramiteFiscalizacao,fiscalizacao,pontoFiscalizacao);
				
			if(arItensRoteiro != null && arItensRoteiro.length == 0)
				arItensRoteiro = null;				
							
			request.getSession().setAttribute("objRamoSuperior"  		 ,objRamoSuperior);
			request.getSession().setAttribute("objRamoAtividade" 		 ,objRamoAtividade);										
			request.getSession().setAttribute("objPontoFiscalizacao" 	 ,objPontoFiscalizacao);													
			request.getSession().setAttribute("auxItemPontoFiscalizacao" ,auxItemPontoFiscalizacao);			
			request.getSession().setAttribute("arItensRoteiro" ,arItensRoteiro);						
			

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
		return mapping.findForward("CadastroRoteiro");

	}
}
