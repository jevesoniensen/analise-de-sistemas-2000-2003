package br.smat.web.fiscalizacao.tramite;

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
import br.smat.ejb.grauconformidade.GrauConformidade;
import br.smat.ejb.ramoatividade.RamoAtividade;
import br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacao;
import br.smat.objetosauxiliares.auxitempontofiscalizacao.AuxItemPontoFiscalizacao;
import br.smat.objetosauxiliares.auxtramitefiscalizacao.AuxTramiteFiscalizacao;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjGrauConformidade;
import br.smat.web.obj.ObjRoteiro;
import br.smat.web.obj.ObjStatus;
import br.smat.web.obj.ObjTramiteFiscalizacao;

/**
 * @version 	1.0
 * @author
 */
public class FiscalizacaoTramiteAction extends Action {

	/**
	* Constructor
	*/
	public FiscalizacaoTramiteAction() {

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

			String 	destino 				= ((TramiteFiscalizacaoActionForm) form).getDestino();
			int	fiscalizacao 			= ((TramiteFiscalizacaoActionForm) form).getFiscalizacao();
			int	tramiteFiscalizacao		= ((TramiteFiscalizacaoActionForm) form).getTramiteFiscalizacao();
			int	status					= ((TramiteFiscalizacaoActionForm) form).getStatus();
			int[]	grauConformidade		= ((TramiteFiscalizacaoActionForm) form).getGrauConformidade();
			int[]	item					= ((TramiteFiscalizacaoActionForm) form).getItem();
			String	acao					= ((TramiteFiscalizacaoActionForm) form).getAcao();
			String  statusFiscalizacao		= ((TramiteFiscalizacaoActionForm) form).getStatusFiscalizacao();
										
			if(acao != null && acao.equals("GRAVAR")){
				try{				
					for(int i=1;i<item.length;i++){
						ObjRoteiro r = new ObjRoteiro(tramiteFiscalizacao,fiscalizacao,item[i],grauConformidade[i]);
						r.atualiza();
					}				
					request.setAttribute("mensagem","Dados do trâmite alterados com sucesso!");					
				}
				catch (Exception e) {
						request.setAttribute("mensagem","Erro ao alterar os dados do trâmite!");										
				}
			}
			else
			if(acao != null && acao.equals("ALTERARSTATUS")){
				try {
					if(status>0){
						ObjTramiteFiscalizacao.atualizaStatus(fiscalizacao,tramiteFiscalizacao,status);
						request.setAttribute("mensagem","Status do trâmite alterado com sucesso!");
					}
						
				} catch (Exception e) {
						request.setAttribute("mensagem","Erro ao alterar o status do trâmite!");					
				}
			}
			
			AuxTramiteFiscalizacao[]	colTramites = ObjGenerico.listTramitesFiscalizacao(fiscalizacao);
			
			AuxItemPontoFiscalizacao[]	arItensRoteiro			 = null;
			
			if(fiscalizacao>0 && tramiteFiscalizacao > 0)
				arItensRoteiro = ObjGenerico.listDetalhesItensRoteiro(fiscalizacao,tramiteFiscalizacao);			
				
			if(arItensRoteiro != null && arItensRoteiro.length > 0)
				arItensRoteiro = montaComboGrauConformidade(arItensRoteiro);

			((TramiteFiscalizacaoActionForm) form).setDestino(null);			
			if(destino != null)
			if(destino.length() > 0){
				if(destino.equalsIgnoreCase("RETORNAR")){
						
						ActionForward forward = new ActionForward();
																				
						forward.setName("RETORNAR_");
						forward.setPath("fiscalizacao/Fiscalizacoes.do?fiscalizacao="+fiscalizacao);										
						return forward;
				}
				else
				if(destino.equalsIgnoreCase("CADASTRARROTEIRO")){
						
						ActionForward forward = new ActionForward();
																
						RamoAtividade ramoAtividadeEmpFiscal = (RamoAtividade)request.getSession().getAttribute("ramoAtividadeEmpFiscal");
						
						int ramoAtiv = 0; 
						int ramoSup  = 0;
						
						if(ramoAtividadeEmpFiscal != null){
							ramoAtiv = ramoAtividadeEmpFiscal.getRamoAtividade();
							ramoSup  = ramoAtividadeEmpFiscal.getRamoSuperior().ramoAtividade;
						}
						   
																				
						forward.setName("CADASTRARROTEIRO_");
						forward.setPath("fiscalizacao/CadastroRoteiro.do?fiscalizacao="+fiscalizacao+
						                "&tramiteFiscalizacao="+tramiteFiscalizacao+
						                "&ramoAtividade="+ramoAtiv+"&ramoSuperior="+ramoSup+"&statusFiscalizacao="+statusFiscalizacao+"&status="+status);										
						return forward;
				}	
				else			
				if(destino.equalsIgnoreCase("MEDIDASCORRETIVAS")){
						
						ActionForward forward = new ActionForward();
															
															
						System.out.println("tramite status " + status);												
																				
						forward.setName("MEDIDASCORRETIVAS_");
						forward.setPath("fiscalizacao/MedidasCorretivas.do?fiscalizacao="+fiscalizacao+
						                "&tramiteFiscalizacao="+tramiteFiscalizacao+"&status="+status);										
						return forward;
				}				
			}	

			if(arItensRoteiro != null && arItensRoteiro.length == 0){
				arItensRoteiro = null;		
				if(tramiteFiscalizacao > 0)
					request.setAttribute("mensagem","Não foi cadastrado nenhum item para este trâmite!");				
			}
			
			
				
			Collection colObjStatus = ObjStatus.findAllStatus();
			
			System.out.println("statusFiscalizacao => " + statusFiscalizacao);
			
			request.getSession().setAttribute("colTramites",colTramites);	
			request.getSession().setAttribute("arItensRoteiro" ,arItensRoteiro);
			request.getSession().setAttribute("colObjStatus",colObjStatus);
			request.setAttribute("status",String.valueOf(status));				
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
		return mapping.findForward("TramiteFiscalizacao");
	}
	
	
	public AuxItemPontoFiscalizacao[] montaComboGrauConformidade(AuxItemPontoFiscalizacao[] arItens){
		
		String retorno=null;
		try {
			GrauConformidade[] v = (GrauConformidade[])(ObjGrauConformidade.findAllGrauConformidade()).toArray(new GrauConformidade[0]);
			
			for(int i=0;i<arItens.length;i++){
				retorno = "<select name='grauConformidade' class='SELECT'>";				
				retorno += "<option value = '0' class='OPTION'> -- Não avaliado --</option>";
				for(int j=0; j<v.length; j++){			
				
					if(arItens[i].getGrauConformidade() == v[j].getGrauConformidade())
						retorno += "<option value = '" + v[j].getGrauConformidade() +"' selected>";									
					else
						retorno += "<option value = '" + v[j].getGrauConformidade() +"'>";														
					retorno += v[j].getNome();
					retorno += "</option>";
				}
				retorno += "</select>"; 
				
				arItens[i].setChecked(retorno);	
			}	
			
		} catch (Exception e) {
		}
				
		return arItens;
	}
}
