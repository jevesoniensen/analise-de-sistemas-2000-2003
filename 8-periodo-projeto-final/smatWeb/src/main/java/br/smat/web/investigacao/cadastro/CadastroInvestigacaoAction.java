package br.smat.web.investigacao.cadastro;

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
import br.smat.ejb.agentesaude.AgenteSaudeKey;
import br.smat.ejb.investigacao.Investigacao;
import br.smat.web.obj.ObjAcidente;
import br.smat.web.obj.ObjAgenteSaude;
import br.smat.web.obj.ObjInvestigacao;

/**
 * @version 	1.0
 * @author
 */
public class CadastroInvestigacaoAction extends Action {

	/**
	* Constructor
	*/
	public CadastroInvestigacaoAction() {

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
		
		String erroBanco = null;
		Collection colAgenteSaude = null;
		Investigacao i = null;

		ObjAcidente objAcidente = null;
		String	acao	= ((CadastroInvestigacaoActionForm) form).getAcao();
		int numInvestigacao = ((CadastroInvestigacaoActionForm) form).getNumInvestigacao();
		int agenteSaude = ((CadastroInvestigacaoActionForm) form).getAgenteSaude();
		String motivo = ((CadastroInvestigacaoActionForm) form).getMotivo();
		String obsGerais = ((CadastroInvestigacaoActionForm) form).getObsGerais();
		String dataAbertura = ((CadastroInvestigacaoActionForm) form).getDataAbertura();
		String dataFinalizacao = ((CadastroInvestigacaoActionForm) form).getDataFinalizacao();
		String destino = ((CadastroInvestigacaoActionForm) form).getDestino();

		
		try {
			
			colAgenteSaude = ObjAgenteSaude.findAllAgentesSaude();
			objAcidente = (ObjAcidente)request.getSession().getAttribute("objAcidente");			
			


						
			if(acao != null){
				if(acao.equals("RETORNAR")){
					
					forward.setName("_RETORNAR");
					forward.setPath("cadastroacidente/ResultadoPesquisaAcidente.do?acao=LISTAR&acidente=" + objAcidente.getAcidente());
					return forward;
				}
				else
				if(acao.equals("GRAVAR")){

					if(numInvestigacao == 0){
						try{
							ObjInvestigacao objInvestigacao = new ObjInvestigacao(agenteSaude,objAcidente.getAcidente(),motivo,obsGerais);
							objInvestigacao.save();
							
							numInvestigacao = objInvestigacao.getInvestigacao();
							dataAbertura = objInvestigacao.getDataAbertura();
							dataFinalizacao = objInvestigacao.getDataFinalizacao();
						
							erroBanco = "Investigação cadastrada com sucesso!";

							((CadastroInvestigacaoActionForm) form).setNumInvestigacao(numInvestigacao);
							((CadastroInvestigacaoActionForm) form).setDataAbertura(dataAbertura);
							((CadastroInvestigacaoActionForm) form).setDataFinalizacao(dataFinalizacao);

						}catch(Exception e){
							erroBanco = "Não foi possível cadastrar a investigação!";
						}
					}
					else{
						try{

							i = ObjInvestigacao.findByPrimaryKey(numInvestigacao);
							i.setAgenteSaude(new AgenteSaudeKey(agenteSaude));
							i.setTitulo(motivo);
							i.setObsGerais(obsGerais);

							erroBanco = "Investigação atualizada com sucesso!";
						
						}catch(Exception e){
							erroBanco = "Não foi possível atualizar a investigação!";							
						}
					}
				}
				else
				if(acao.equals("DETALHES")){
					System.out.println("entrou no detalhes");
					forward.setName("_DETALHES");
					forward.setPath("investigacao/DetalhesInvestigacao.do?numInvestigacao=" + numInvestigacao);

					return forward;
				}
				else
				if(acao.equals("BUSCAR")){

					try{
						i = ObjInvestigacao.findByPrimaryKey(numInvestigacao);
					
					System.out.println("entrou no buscar");


					dataAbertura = i.getDataAbertura();
					dataFinalizacao = i.getDataFinalizacao();
					
					((CadastroInvestigacaoActionForm) form).setAcao("LISTAR");						
					((CadastroInvestigacaoActionForm) form).setAgenteSaude(i.getAgenteSaude().agenteSaude);
					((CadastroInvestigacaoActionForm) form).setMotivo(i.getTitulo());
					((CadastroInvestigacaoActionForm) form).setObsGerais(i.getObsGerais());
					((CadastroInvestigacaoActionForm) form).setDataAbertura(dataAbertura);
					((CadastroInvestigacaoActionForm) form).setDataFinalizacao(dataFinalizacao);
						
					}catch(Exception e){erroBanco = "Erro ao buscar a investigação!";}

				}
				else
				if(acao.equals("EXCLUIR")){

					try{
						i = ObjInvestigacao.findByPrimaryKey(numInvestigacao);
						i.remove();
						((CadastroInvestigacaoActionForm) form).apaga();
						numInvestigacao = 0;
						dataAbertura = null;
						dataFinalizacao = null;
						erroBanco = "Investigação excluída com sucesso!";
					}catch(Exception e){
						erroBanco = "Não foi possível excluir a investigação. Provavelmente ela já possua depoimentos ou medidas corretivas!";
					}					
				}
				else
				if(acao.equals("FINALIZAR")){
					try{
						i = ObjInvestigacao.findByPrimaryKey(numInvestigacao);
						i.finalizar();
						dataFinalizacao = i.getDataFinalizacao();
						((CadastroInvestigacaoActionForm) form).setDataFinalizacao(dataFinalizacao);
						erroBanco = "Investigação finalizada com sucesso!";
					}catch(Exception e){
						erroBanco = "Não foi possível finalizar a investigação!";
					}					
					
				}
			}
			
			if(numInvestigacao != 0)
				request.setAttribute("numInvestigacao",""+numInvestigacao);
				
			if(dataAbertura != null && dataAbertura.trim().length() != 0)
				request.setAttribute("dataAbertura",dataAbertura);

			if(dataFinalizacao != null && dataFinalizacao.trim().length() != 0)
				request.setAttribute("dataFinalizacao",dataFinalizacao);
			
			if(destino != null && destino.trim().length() != 0)
				request.setAttribute("destino",destino);

			request.getSession().setAttribute("colAgenteSaude",colAgenteSaude);
			request.setAttribute("erroBanco",erroBanco);
			
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
		return mapping.findForward("CadastroInvestigacao");

	}
}
