package br.smat.web.parametros.acidente.ramoatividade;

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
import br.smat.ejb.ramoatividade.RamoAtividade;
import br.smat.objetosauxiliares.auxramoatividade.AuxRamoAtividade;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjRamoAtividade;

/**
 * @version 	1.0
 * @author
 */
public class RamoAtividadeAction extends Action {

	/**
	* Constructor
	*/
	public RamoAtividadeAction() {

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
		// return value

		try {

			String	acao			= ((RamoAtividadeActionForm)form).getAcao();
			
			if(acao != null)
			if(acao.equals("ZERARSESSAO")){
				((RamoAtividadeActionForm)form).apaga();
				acao = "LISTAR";
			}
			
			int	ramoAtividade 	= ((RamoAtividadeActionForm)form).getRamoAtividade();
			int	ramoSuperior	= ((RamoAtividadeActionForm)form).getRamoSuperior();
			String	nome			= ((RamoAtividadeActionForm)form).getNome();
			int	cnae			= ((RamoAtividadeActionForm)form).getCnae();
			String	mensagem		= null;
			
			if(acao != null && acao.equals("PREENCHEFORM")){
				
				RamoAtividade ra = ObjRamoAtividade.findByPrimaryKey(ramoAtividade);
				
				if(ra.getRamoSuperior() != null)
					ramoSuperior 	= ra.getRamoSuperior().ramoAtividade;
				else
					ramoSuperior = 0;
				nome			= ra.getNome();
				cnae			= ra.getCnae();				
				
				((RamoAtividadeActionForm)form).setRamoSuperior(ramoSuperior);	
				((RamoAtividadeActionForm)form).setNome(nome);
				((RamoAtividadeActionForm)form).setCnae(cnae);								
			}
			else
			if(acao != null && acao.equals("GRAVAR")){
				try {
					ObjRamoAtividade ll = new ObjRamoAtividade(ramoAtividade,nome,cnae,ramoSuperior);
					ll.save();
					
					if(ramoAtividade == 0)
						mensagem = "Ramo de atividade incluído com sucesso!";
					else
						mensagem = "Ramo de atividade alterado com sucesso!";
						
					ramoAtividade = ll.getRamoAtividade();
					
					((RamoAtividadeActionForm)form).setRamoAtividade(ramoAtividade);
						
				} catch (Exception e) {
					mensagem = "Erro ao gravar o Ramo de atividade";					
				}
					
					
			}	
			else
			if(acao != null && acao.equals("EXCLUIR")){					
				if(ramoAtividade > 0){
					try {
						ObjRamoAtividade ll = new ObjRamoAtividade(ramoAtividade);
						ll.remove();
						ramoAtividade = 0;
						((RamoAtividadeActionForm)form).apaga();
							
						mensagem = "Ramo de atividade excluido com sucesso!";						
					} catch (Exception e) {
						mensagem = "Erro ao excluir o Ramo de atividade";
					}
				}
				else
					mensagem = "É necessário selecionar um Ramo de atividade!";
			}			

			AuxRamoAtividade[] 	auxRamoAtividades 	= ObjGenerico.listAllRamoAtividade();
			Collection			colRamoSuperior		= ObjRamoAtividade.findAllRamosAtividade(0);	
									
			request.getSession().setAttribute("auxRamoAtividades",auxRamoAtividades);
			request.getSession().setAttribute("colRamoSuperior",colRamoSuperior);			
			request.setAttribute("ramoAtividadeTeste",String.valueOf(ramoAtividade));
			request.setAttribute("mensagem",mensagem);

		} catch (Exception e) {

			e.printStackTrace();
			return mapping.findForward("erroDefault");

		}



		// Finish with
		return mapping.findForward("RamoAtividade");

	}
}
