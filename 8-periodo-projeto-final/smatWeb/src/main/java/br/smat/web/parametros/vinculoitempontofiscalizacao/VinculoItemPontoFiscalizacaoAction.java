package br.smat.web.parametros.vinculoitempontofiscalizacao;

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

/**
 * @version 	1.0
 * @author
 */
public class VinculoItemPontoFiscalizacaoAction extends Action {

	/**
	* Constructor
	*/
	public VinculoItemPontoFiscalizacaoAction() {

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

			String	acao				= ((VinculoItemPontoFiscalizacaoActionForm)form).getAcao();
			
			if(acao != null)
			if(acao.equals("ZERARSESSAO")){
				((VinculoItemPontoFiscalizacaoActionForm)form).apaga();
				acao = "LISTAR";
			}
						
			Collection 					objRamoAtividade 		 = null;
			Collection  				objPontoFiscalizacao 	 = null;			
			Collection 					objRamoSuperior   		 = ObjRamoAtividade.findAllRamosAtividade(0);		
			AuxItemPontoFiscalizacao[]	auxItemPontoFiscalizacao = null;
			String						mensagem				 = null;
			
			int 	ramoSuperior 		= ((VinculoItemPontoFiscalizacaoActionForm)form).getRamoSuperior();			
			int 	ramoAtividade 		= ((VinculoItemPontoFiscalizacaoActionForm)form).getRamoAtividade();
			int	pontoFiscalizacao 	= ((VinculoItemPontoFiscalizacaoActionForm)form).getPontoFiscalizacao();			
			int[]	itensFiscalizacao   = ((VinculoItemPontoFiscalizacaoActionForm)form).getItem();

			
			if(ramoSuperior >0)
				objRamoAtividade = ObjRamoAtividade.findAllRamosAtividade(ramoSuperior);
				
			if(ramoAtividade > 0)
				objPontoFiscalizacao = ObjPontoFiscalizacao.findAllPontoFiscalizacao(ramoAtividade);
				
			if(acao != null){	
					if(acao.equals("GRAVAR")){
						
						try {
							String aux = "";
							
							if(itensFiscalizacao != null){
								for(int i=0;i<itensFiscalizacao.length;i++)
									aux += "," + itensFiscalizacao[i];
									
								if(aux.trim().length()>0)	
									aux += ",";
								else
									aux = null;
							}
							else
								aux = null;						
													
							ObjGenerico.gravaItemPontoFiscalizacao(pontoFiscalizacao,aux);
							
							mensagem = "Vinculos gravados com sucesso!";				
							
						} catch (Exception e) {
							mensagem = "Erro ao gravar Vinculos!";				
						}
					}
			}
			
			if(pontoFiscalizacao > 0)
				auxItemPontoFiscalizacao = ObjGenerico.listAuxItemPontoFiscalizacaos(pontoFiscalizacao);			
							
			request.getSession().setAttribute("objRamoSuperior"  		 ,objRamoSuperior);
			request.getSession().setAttribute("objRamoAtividade" 		 ,objRamoAtividade);										
			request.getSession().setAttribute("objPontoFiscalizacao" 	 ,objPontoFiscalizacao);													
			request.getSession().setAttribute("auxItemPontoFiscalizacao" ,auxItemPontoFiscalizacao);	
			request.setAttribute("mensagem",mensagem);			

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
		return mapping.findForward("VinculoItemPontoFiscalizacao");

	}
}
