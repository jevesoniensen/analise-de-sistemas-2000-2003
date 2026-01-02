package br.smat.web.pessoas.agentesaude;

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
import br.smat.ejb.agentesaude.AgenteSaude;
import br.smat.ejb.estado.Estado;
import br.smat.ejb.regional.Regional;
import br.smat.web.obj.ObjAgenteSaude;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjRegional;

/**
 * @version 	1.0
 * @author
 */
public class AgenteSaudeAction extends Action {

	/**
	* Constructor
	*/
	public AgenteSaudeAction() {

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


		try {

			String 	acao 		= ((AgenteSaudeActionForm) form).getAcao();
			
			if(acao != null)
			if(acao.equals("ZERARSESSAO")){
				((AgenteSaudeActionForm) form).apaga();
				acao = "LISTAR";
			}
			Collection colEstado		= ObjEstado.findAllEstados();
			Collection colRegional  	= null;
			String	mensagem	= null;
			
			int 	estado 		= ((AgenteSaudeActionForm) form).getEstado();			
			int	agenteSaude	= ((AgenteSaudeActionForm) form).getAgenteSaude();			
			String 	nome 		= ((AgenteSaudeActionForm) form).getNome();
			String 	email 		= ((AgenteSaudeActionForm) form).getEmail();
			int	regional	= ((AgenteSaudeActionForm) form).getRegional();
			
			if(acao != null && acao.equals("PREENCHEFORM")){
				AgenteSaude as = ObjAgenteSaude.findByPrimaryKey(agenteSaude);

				nome  		= as.getNome();
				email 		= as.getEmail();
				regional 	= as.getRegional().regional;
				
				Regional r = ObjRegional.findByPrimaryKey(regional);
			
				estado = r.getEstado().estado;
			
				((AgenteSaudeActionForm) form).setNome(nome);
				((AgenteSaudeActionForm) form).setEmail(email);
				((AgenteSaudeActionForm) form).setRegional(regional);	
				((AgenteSaudeActionForm) form).setEstado(estado);	
			}
			else
			if(acao != null && acao.equals("GRAVAR")){
				try {
					ObjAgenteSaude oas = new ObjAgenteSaude(agenteSaude,regional,nome,email);
					oas.save();
					
					if(agenteSaude == 0)
						mensagem = "Agente de saúde incluido com sucesso!";
					else
						mensagem = "Agente de saúde alterado com sucesso!";
						
				} catch (Exception e) {
					e.printStackTrace();
					mensagem = "Erro ao incluir/alterar Agente de saúde!";					
				}
			}
			else
			if(acao != null && acao.equals("EXCLUIR")){
				try {
					if(agenteSaude > 0){
						ObjAgenteSaude oas = new ObjAgenteSaude(agenteSaude);
						oas.remove();
						((AgenteSaudeActionForm) form).apaga();
						mensagem = "Agente de saúde excluido com sucesso!";											
					}
					else
						mensagem = "É necessário selecionar um Agente de saúde!";					
				} catch (Exception e) {
					mensagem = "Erro ao excluir Agente de saúde!";										
				}		
			}
						
			if(estado > 0)
				colRegional = ObjRegional.findAllRegionais(estado);

			Collection colAgenteSaude	= ObjAgenteSaude.findAllAgentesSaude();
			
			request.getSession().setAttribute("colAgenteSaude"	,colAgenteSaude);
			request.getSession().setAttribute("colEstado"		,colEstado);
			request.getSession().setAttribute("colRegional"		,colRegional);						
			request.setAttribute("mensagem",mensagem);

		} catch (Exception e) {

			e.printStackTrace();
			return mapping.findForward("erroDefault");
		}
		// Finish with
		return mapping.findForward("AgenteSaude");

	}
}
