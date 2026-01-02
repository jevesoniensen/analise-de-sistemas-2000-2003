package br.smat.web.fiscalizacao.cadastro;

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
import br.smat.objetosauxiliares.auxfiscalizacaoempregador.AuxFiscalizacaoEmpregador;
import br.smat.web.obj.ObjAgenteSaude;
import br.smat.web.obj.ObjEmpregador;
import br.smat.web.obj.ObjFiscalizacao;
import br.smat.web.obj.ObjGenerico;

/**
 * @version 	1.0
 * @author
 */
public class CadastroFiscalizacaoAction extends Action {

	/**
	* Constructor
	*/
	public CadastroFiscalizacaoAction() {

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

			String 	acao	 	 	= ((CadastroFiscalizacaoActionForm) form).getAcao();			
			
			ObjFiscalizacao objFiscalizacao = (ObjFiscalizacao)request.getSession().getAttribute("objFiscalizacao");
						
			String 	destino 	 	= ((CadastroFiscalizacaoActionForm) form).getDestino();

			int	fiscalizacao 	= ((CadastroFiscalizacaoActionForm) form).getFiscalizacao();
			int	agenteSaude  	= ((CadastroFiscalizacaoActionForm) form).getAgenteSaude();
			int	empregador	 	= ((CadastroFiscalizacaoActionForm) form).getEmpregador();
			String	dataAbertura	= ((CadastroFiscalizacaoActionForm) form).getDataAbertura();
			String	titulo			= ((CadastroFiscalizacaoActionForm) form).getTitulo();
			String	obsGerais		= ((CadastroFiscalizacaoActionForm) form).getObsGerais();	
			String 	docEmpregador	= ((CadastroFiscalizacaoActionForm) form).getDocEmpregador();
			String 	razaoSocial		= ((CadastroFiscalizacaoActionForm) form).getRazaoSocial();
			String	mensagem        = null;
			
			if(acao != null && acao.equals("ZERARSESSAO")){
				destino = null;
				((CadastroFiscalizacaoActionForm) form).apaga();
				objFiscalizacao=null;										
			}

			if(objFiscalizacao == null){
				objFiscalizacao = new ObjFiscalizacao();
			}
			
			if(destino != null && !destino.equals("RETORNAR") && !destino.equals("ATUALIZAR")){
				objFiscalizacao.setFiscalizacao(fiscalizacao);
				objFiscalizacao.setAgenteSaude(agenteSaude);
				objFiscalizacao.setEmpregador(empregador);
				objFiscalizacao.setDataAbertura(dataAbertura);
				objFiscalizacao.setTitulo(titulo);
				objFiscalizacao.setObsGerais(obsGerais);
				objFiscalizacao.setDocEmpregador(docEmpregador);
				objFiscalizacao.setRazaoSocial(razaoSocial);								
			}
			else
			if(destino != null && destino.equals("ATUALIZAR")){
				destino = null;
				AuxFiscalizacaoEmpregador aux = ObjGenerico.listAuxFiscalizacaoEmpregadorAgente(fiscalizacao);
				((CadastroFiscalizacaoActionForm) form).setDestino(null);
				((CadastroFiscalizacaoActionForm) form).setFiscalizacao(fiscalizacao);
				((CadastroFiscalizacaoActionForm) form).setAgenteSaude(aux.getAgenteSaude());
				((CadastroFiscalizacaoActionForm) form).setEmpregador(aux.getEmpregador());
				((CadastroFiscalizacaoActionForm) form).setDataAbertura(aux.getDataAbertura());
				((CadastroFiscalizacaoActionForm) form).setTitulo(aux.getTitulo());
				((CadastroFiscalizacaoActionForm) form).setObsGerais(aux.getObsGerais());	
				((CadastroFiscalizacaoActionForm) form).setDocEmpregador(aux.getDocEmpregador());
				((CadastroFiscalizacaoActionForm) form).setRazaoSocial(aux.getRazaoSocial());				
				
			}
			else
			if(acao != null){
				((CadastroFiscalizacaoActionForm) form).setDestino(null);
				((CadastroFiscalizacaoActionForm) form).setFiscalizacao(objFiscalizacao.getFiscalizacao());
				((CadastroFiscalizacaoActionForm) form).setAgenteSaude(objFiscalizacao.getAgenteSaude());
//				((CadastroFiscalizacaoActionForm) form).setEmpregador(objFiscalizacao.getEmpregador());
				((CadastroFiscalizacaoActionForm) form).setDataAbertura(objFiscalizacao.getDataAbertura());
				((CadastroFiscalizacaoActionForm) form).setTitulo(objFiscalizacao.getTitulo());
				((CadastroFiscalizacaoActionForm) form).setObsGerais(objFiscalizacao.getObsGerais());	
//				((CadastroFiscalizacaoActionForm) form).setDocEmpregador(objFiscalizacao.getDocEmpregador());
//				((CadastroFiscalizacaoActionForm) form).setRazaoSocial(objFiscalizacao.getRazaoSocial());				
			}
			
			if(acao != null){
				if(acao.equals("GRAVAR")){
					try {
						objFiscalizacao.save();
						
						if(fiscalizacao == 0)
							mensagem = "Fiscalização incluida com sucesso!";
						else
							mensagem = "Fiscalização alterada com sucesso!";
						
						fiscalizacao = objFiscalizacao.getFiscalizacao();
							
						((CadastroFiscalizacaoActionForm) form).setFiscalizacao(fiscalizacao);										
						
					} catch (Exception e) {
						mensagem = "Erro ao incluir a Fiscalização!";						
					}
				}
				else
				if(acao.equals("EXCLUIR")){
					try {
						objFiscalizacao.remove();
						((CadastroFiscalizacaoActionForm) form).apaga();	
						mensagem = "Fiscalização excluida com sucesso!";						
					} catch (Exception e) {
						mensagem = "Erro ao excluir a Fiscalização!";												
					}
				}
			}
			
			Collection colAgenteSaude = ObjAgenteSaude.findAllAgentesSaude();

			System.out.println("Cadastreeeo acao => " + acao + " destino => " + destino);
			
			((CadastroFiscalizacaoActionForm) form).setDestino(null);			
			if(destino != null)
			if(destino.length() > 0){
				if(destino.equalsIgnoreCase("PESQUISAR")){
						ActionForward forward = new ActionForward();
														
						forward.setName("PESQUISAR_");
						forward.setPath("./empregadores/PesquisaEmpregador.do?destino=CADASTROFISCALIZACAO&origem=CADASTROFISCALIZACAO");										
						return forward;
				}
				else
				if(destino.equalsIgnoreCase("DETALHES")){
						ActionForward forward = new ActionForward();
														
						forward.setName("DETALHES_");
						forward.setPath("fiscalizacao/Fiscalizacoes.do?fiscalizacao="+fiscalizacao);										
						return forward;
				}				
			}
			
			
			
			request.getSession().setAttribute("colAgenteSaude" ,colAgenteSaude );
			request.getSession().setAttribute("objFiscalizacao",objFiscalizacao);
			request.setAttribute("mensagem",mensagem);
			request.setAttribute("fiscalizacao",String.valueOf(fiscalizacao));


		} catch (Exception e) {

			// Report the error using the appropriate name and ID.
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
		return mapping.findForward("CadastroFiscalizacao");

	}
}
