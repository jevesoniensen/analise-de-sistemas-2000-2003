package br.smat.web.monitor;


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
import br.smat.ejb.campo.Campo;
import br.smat.ejb.monitor.Monitor;
import br.smat.objetosauxiliares.auxcampo.AuxCampo;
import br.smat.objetosauxiliares.auxmonitor.AuxMonitor;
import br.smat.web.obj.ObjCampo;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjMonitor;

/**
 * @version 	1.0
 * @author
 */
public class MonitorAction extends Action {

	/**
	* Constructor
	*/
	public MonitorAction() {

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
		// return value

		try {

			AuxCampo[] 	auxCampo  	= null;
			String		mensagem 	= null;
			String	acao			= ((MonitorActionForm) form).getAcao();
			
			if(acao != null)
			if(acao.equals("ZERARSESSAO")){
				((MonitorActionForm) form).apaga();
				acao = "LISTAR";
			}
			
						
			int 	campo 			= ((MonitorActionForm) form).getCampo();
			int	monitor 		= ((MonitorActionForm) form).getMonitor();

			int	periodicidade	= ((MonitorActionForm) form).getPeriodicidade();
			int	queryCampo		= ((MonitorActionForm) form).getQueryCampo();
			int	maxAcidente		= ((MonitorActionForm) form).getMaxAcidente();
			
			if(acao != null && acao.equals("PREENCHEFORM")){
				
				Monitor monitorBean = ObjMonitor.findByPrimaryKey(monitor);
				
				campo = monitorBean.getCampo().campo;
				
				((MonitorActionForm) form).setCampo(campo);	
				((MonitorActionForm) form).setMaxAcidente(monitorBean.getMaxAcidente());
				((MonitorActionForm) form).setPeriodicidade(monitorBean.getPeriodicidade());
				((MonitorActionForm) form).setQueryCampo(monitorBean.getQueryCampo());
				((MonitorActionForm) form).setUltimaExecucao(monitorBean.getUltimaDataExecucao());
			}
			else
			if(acao != null &&  acao.equals("GRAVAR")){
				ObjMonitor m;
				try {
					m =
						new ObjMonitor(
							monitor,
							periodicidade,
							campo,
							queryCampo,
							maxAcidente);
					m.save();
					
					if(monitor == 0)
						mensagem = "Monitor incluido com sucesso!";
					else
						mensagem = "Monitor alterado com sucesso!";
					
					monitor = m.getMonitor(); 
					
					((MonitorActionForm) form).setMonitor(monitor);
										
				} catch (Exception e) {
					mensagem = "Erro ao incluir o monitor!";						
				}						
			}
			else
			if(acao != null &&  acao.equals("EXCLUIR")){			
				try {
					
					if(monitor > 0){
					
						ObjMonitor m = new ObjMonitor(monitor,periodicidade,campo,queryCampo,maxAcidente);
						m.remove();
						mensagem = "Monitor excluido com sucesso!";					
					}
					else
						mensagem = "É necessário selecionar um monitor!";
					
				} catch (Exception e) {
					mensagem = "Erro ao excluir o monitor!";						
				}
			}
				
			Campo[] 		arCampo 	= (Campo[])ObjCampo.ejbFindAllCampos().toArray(new Campo[0]);
			AuxMonitor[]	arMonitor	= ObjGenerico.listAllMonitor();

			if(campo > 0)			
				auxCampo = ObjCampo.getRegistrosFilhos(campo);

			request.getSession().setAttribute("arCampo",arCampo);
			request.getSession().setAttribute("auxCampo",auxCampo);
			request.getSession().setAttribute("arMonitor",arMonitor);			
			
			request.setAttribute("mensagem",mensagem);
			

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
		return mapping.findForward("Monitor");
	}
}
