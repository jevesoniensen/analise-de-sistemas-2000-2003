package br.smat.web.parametros.localatendimento;

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
import br.smat.ejb.localatendimento.LocalAtendimento;
import br.smat.objetosauxiliares.auxlocalatendimento.AuxLocalAtendimento;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjLocalAtendimento;
import br.smat.web.obj.ObjMunicipio;

/**
 * @version 	1.0
 * @author
 */
public class LocalAtendimentoAction extends Action {

	/**
	* Constructor
	*/
	public LocalAtendimentoAction() {

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
		// return value

		String erroBanco = null;
		Collection colEstado = null;
		Collection colMunicipio = null;
		AuxLocalAtendimento[] auxLocalAtendimento = null;
		
		try {

			String	acao = ((LocalAtendimentoActionForm)form).getAcao();
			
			if(acao != null)
			if(acao.equals("ZERARSESSAO")){
				((LocalAtendimentoActionForm)form).apaga();
				acao = "LISTAR";
			}
						
			int 	estado = ((LocalAtendimentoActionForm)form).getEstado();
			int 	municipio = ((LocalAtendimentoActionForm)form).getMunicipio();
			int 	localAtendimento = ((LocalAtendimentoActionForm)form).getLocalAtendimento();
			String 	nome = ((LocalAtendimentoActionForm)form).getNome();


			auxLocalAtendimento = ObjGenerico.getAllLocaisAtendimento();


			if(acao != null)
			if(acao.equals("MOSTRALOCAL")){
				
				for(int i = 0; i < auxLocalAtendimento.length; i++){
					
					if(localAtendimento == auxLocalAtendimento[i].getLocalAtendimento()){
						
						((LocalAtendimentoActionForm)form).setEstado(auxLocalAtendimento[i].getEstado());
						estado = auxLocalAtendimento[i].getEstado();
						((LocalAtendimentoActionForm)form).setMunicipio(auxLocalAtendimento[i].getMunicipio());
						((LocalAtendimentoActionForm)form).setLocalAtendimento(auxLocalAtendimento[i].getLocalAtendimento());
						((LocalAtendimentoActionForm)form).setNome(auxLocalAtendimento[i].getNome());
						
					}
				}
				
			}else
			if(acao.equals("LIMPAR")){
				((LocalAtendimentoActionForm)form).apaga();
				estado = 0;
			}else
			if(acao.equals("GRAVAR")){

				ObjLocalAtendimento objLocalAtendimento = new ObjLocalAtendimento(localAtendimento,nome,municipio);
				try{
					objLocalAtendimento.save();
					
					if(localAtendimento == 0){
						((LocalAtendimentoActionForm)form).setLocalAtendimento(objLocalAtendimento.getLocalAtendimento());
						erroBanco = "Local atendimento inserido com sucesso!";
					}else{
						erroBanco = "Local atendimento atualiado com sucesso!";
					}
					
				}catch(Exception e){
					erroBanco = "Erro ao gravar o local de atendimento!";
				}
				
				auxLocalAtendimento = ObjGenerico.getAllLocaisAtendimento();
			}else
			if(acao.equals("EXCLUIR")){
				
				if(localAtendimento != 0){
					try{
						LocalAtendimento loc = ObjLocalAtendimento.findByPrimaryKey(localAtendimento);
						loc.remove();
						erroBanco = "Local de atendimento excluído com sucesso!";
						((LocalAtendimentoActionForm)form).apaga();
						estado = 0;
					}catch(Exception e){
						erroBanco = "Erro ao excluir o Local de atendimento!";
					}
				}else{
					erroBanco = "É necessário selecionar um local de atendimento para que ele possa ser excluído!";
				}
				auxLocalAtendimento = ObjGenerico.getAllLocaisAtendimento();
			}
			
			colEstado = ObjEstado.findAllEstados();
			
			if(estado != 0)
				colMunicipio = ObjMunicipio.findAllMunicipios(estado);
			
			request.setAttribute("erroBanco",erroBanco);
			request.getSession().setAttribute("auxLocalAtendimento",auxLocalAtendimento);	
			request.getSession().setAttribute("colEstado",colEstado);
			request.getSession().setAttribute("colMunicipio",colMunicipio);

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
		System.out.println("OIIIIIIIIII");
		return mapping.findForward("LocalAtendimento");

	}
}
