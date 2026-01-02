package br.smat.web.parametros.agentecausador;

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
import br.smat.ejb.agentecausador.AgenteCausador;
import br.smat.objetosauxiliares.auxagentecausador.AuxAgenteCausador;
import br.smat.web.obj.ObjAgenteCausador;
import br.smat.web.obj.ObjGenerico;

/**
 * @version 	1.0
 * @author
 */
public class AgenteCausadorAction extends Action {

	/**
	* Constructor
	*/
	public AgenteCausadorAction() {

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

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();

		Collection		colAgenteCausadorVo	 = null;
		Collection		colAgenteCausadorPai = null;
		AuxAgenteCausador[] auxAgenteCausador = null;
		String erroBanco = null;
		
		String	acao			  = ((AgenteCausadorActionForm)form).getAcao();
		
		if(acao != null)
		if(acao.equals("ZERARSESSAO")){
			((AgenteCausadorActionForm)form).apaga();
			acao = "LISTAR";
		}
		
		int	agenteCausador    = ((AgenteCausadorActionForm)form).getAgenteCausador();
		int	agenteCausadorPai = ((AgenteCausadorActionForm)form).getAgenteCausadorPai();
		int	agenteCausadorVo  = ((AgenteCausadorActionForm)form).getAgenteCausadorVo();
		String	nome			  = ((AgenteCausadorActionForm)form).getNome();
		String	descricao		  = ((AgenteCausadorActionForm)form).getDescricao();

		try {
			
			auxAgenteCausador = ObjGenerico.getAllAgentesCausadores();
			
			
			if(acao != null)
			if(acao.equals("MOSTRAAGENTE")){
				for(int i=0; i < auxAgenteCausador.length; i++){
					
					if(auxAgenteCausador[i].getAgenteCausador() == agenteCausador){
						
						((AgenteCausadorActionForm)form).setAgenteCausador(auxAgenteCausador[i].getAgenteCausador());
						((AgenteCausadorActionForm)form).setAgenteCausadorPai(auxAgenteCausador[i].getAgenteCausadorPai());
						((AgenteCausadorActionForm)form).setAgenteCausadorVo(auxAgenteCausador[i].getAgenteCausadorVo());

						agenteCausadorVo = auxAgenteCausador[i].getAgenteCausadorVo();
						agenteCausadorPai = auxAgenteCausador[i].getAgenteCausadorPai();
						
						System.out.println("*** ACTION ***");
						System.out.println("agenteCausadorVo  => " + agenteCausadorVo);
						System.out.println("agenteCausadorPai => " + agenteCausadorPai);

						((AgenteCausadorActionForm)form).setDescricao(auxAgenteCausador[i].getDescricao());
						((AgenteCausadorActionForm)form).setNome(auxAgenteCausador[i].getNomeAgenteCausador());
						break;						
					}
				}
			}else
			if(acao.equals("LIMPAR")){
				((AgenteCausadorActionForm)form).apaga();
				agenteCausadorVo = 0;
				agenteCausador = 0;				
				agenteCausadorPai = 0;				
			}else
			if(acao.equals("GRAVAR")){
				
				try{
					ObjAgenteCausador agente = new ObjAgenteCausador(agenteCausador,nome,agenteCausadorPai,descricao);
					agente.save();

					if(agenteCausador == 0)
						erroBanco = "Agente causador incluído com sucesso!";
					else
						erroBanco = "Agente causador atualizado com sucesso!";

					((AgenteCausadorActionForm)form).setAgenteCausador(agente.getAgenteCausador());
					agenteCausador = agente.getAgenteCausador();
				}catch(Exception e){
					erroBanco = "Erro ao cadastrar o agente causador!";
				}
				auxAgenteCausador = ObjGenerico.getAllAgentesCausadores();
			}else
			if(acao.equals("EXCLUIR")){

				if(agenteCausador != 0){
					try{
						AgenteCausador ag = ObjAgenteCausador.findByPrimaryKey(agenteCausador);
						ag.remove();
						((AgenteCausadorActionForm)form).apaga();
						agenteCausadorVo = 0;
						agenteCausador   = 0;
						agenteCausadorPai = 0;
						erroBanco = "Agente causador excluído com sucesso!";
					}catch(Exception e){
						if(agenteCausador != 0){
							for(int i=0; i < auxAgenteCausador.length; i++){
								
								if(auxAgenteCausador[i].getAgenteCausador() == agenteCausador){
									
									((AgenteCausadorActionForm)form).setAgenteCausador(auxAgenteCausador[i].getAgenteCausador());
									((AgenteCausadorActionForm)form).setAgenteCausadorPai(auxAgenteCausador[i].getAgenteCausadorPai());
									((AgenteCausadorActionForm)form).setAgenteCausadorVo(auxAgenteCausador[i].getAgenteCausadorVo());
									agenteCausadorVo = auxAgenteCausador[i].getAgenteCausadorVo();
									agenteCausadorPai = auxAgenteCausador[i].getAgenteCausadorPai();
									((AgenteCausadorActionForm)form).setDescricao(auxAgenteCausador[i].getDescricao());
									((AgenteCausadorActionForm)form).setNome(auxAgenteCausador[i].getNomeAgenteCausador());
									break;						
								}
							}
						}
						erroBanco = "Não  foi possível excluir o agente causador!";
					}
					auxAgenteCausador = ObjGenerico.getAllAgentesCausadores();
				}else
					erroBanco = "É necessário selecionar um agente causador para que ele possa ser excluído!";
			}

			colAgenteCausadorVo = ObjAgenteCausador.findAllAgentesCausadores();


			//if(agenteCausador == 0){
			
				if(agenteCausadorVo == 0)
					colAgenteCausadorPai = ObjAgenteCausador.findAllAgentesCausadores();
				else
					colAgenteCausadorPai = ObjAgenteCausador.findAllAgentesCausadores(agenteCausadorVo);
			/*}else{

				colAgenteCausadorVo = ObjAgenteCausador.findAllAgentesCausadoresNot(agenteCausador,0);
				
				if(agenteCausadorVo == 0)
					colAgenteCausadorPai = ObjAgenteCausador.findAllAgentesCausadoresNot(agenteCausador,0);
				else
					colAgenteCausadorPai = ObjAgenteCausador.findAllAgentesCausadoresNot(agenteCausador,agenteCausadorVo);
			}*/

			if(agenteCausador != 0)
				request.setAttribute("agenteCausador",""+agenteCausador);
			else
				request.removeAttribute("agenteCausador");
			
				
			request.setAttribute("erroBanco",erroBanco);
			request.getSession().setAttribute("auxAgenteCausador",auxAgenteCausador);
			request.getSession().setAttribute("colAgenteCausadorVo",colAgenteCausadorVo);
			request.getSession().setAttribute("colAgenteCausadorPai",colAgenteCausadorPai);
				

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
		return mapping.findForward("AgenteCausador");

	}
}
