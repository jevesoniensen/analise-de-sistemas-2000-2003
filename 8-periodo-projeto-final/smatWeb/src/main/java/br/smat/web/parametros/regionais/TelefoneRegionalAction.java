package br.smat.web.parametros.regionais;

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
import br.smat.ejb.regional.Regional;
import br.smat.ejb.telefoneregional.TelefoneRegional;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjRegional;
import br.smat.web.obj.ObjTelefoneEmpregador;
import br.smat.web.obj.ObjTelefoneRegional;

/**
 * @version 	1.0
 * @author
 */
public class TelefoneRegionalAction extends Action {

	/**
	* Constructor
	*/
	public TelefoneRegionalAction() {

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
		Usuario usuario 	= (Usuario)request.getSession().getAttribute("usuario");
		Pagina 	pagina 		= null;
		String 	mensagem 	= null;
	
		if(usuario != null){
			pagina = (Pagina)request.getAttribute("permissaoPagina");

			if(!(pagina instanceof  Pagina))
					return mapping.findForward("AccessDenied");

		}
		else
			return mapping.findForward("LoginInit");	
		// return value

		try {

			TelefoneRegional[] 	colTelefoneRegional 	= null;
			Collection 			colRegional 			= null;

			int 	estado 				= ((TelefoneRegionalActionForm)form).getEstado();
			int 	regional			= ((TelefoneRegionalActionForm)form).getRegional();
			int 	telefoneRegional	= ((TelefoneRegionalActionForm)form).getTelefoneRegional();
			String	acao				= ((TelefoneRegionalActionForm)form).getAcao();
			String	descricao			= ((TelefoneRegionalActionForm)form).getDescricao();
			String	ddd					= ((TelefoneRegionalActionForm)form).getDdd();
			String	numero				= ((TelefoneRegionalActionForm)form).getNumero();				
			String	erroBanco			= null;
			
			if(acao != null){
			
				if(acao.equals("PREENCHEFORM")){
					
					Regional r = ObjRegional.findByPrimaryKey(regional);
					
					estado = r.getEstado().estado;
					
					TelefoneRegional t = ObjTelefoneRegional.findByPrimaryKey(regional,telefoneRegional);
				
					descricao 	= t.getDescricao();
					ddd 		= t.getDdd();
					numero 		= t.getNumero();
					
					((TelefoneRegionalActionForm)form).setEstado(estado);
					((TelefoneRegionalActionForm)form).setDescricao(descricao);
					((TelefoneRegionalActionForm)form).setDdd(ddd);
					((TelefoneRegionalActionForm)form).setNumero(numero);
					
				}
				else	
				if(acao.equals("GRAVAR")){
					try {
						
						System.out.println("gravar");
						
						ObjTelefoneRegional tr = new ObjTelefoneRegional(	telefoneRegional,
																			regional,
																			descricao,
																			numero,
																			ddd);
																			
						tr.save();
						
						
						if(telefoneRegional == 0)
							erroBanco = "Telefone regional incluido com sucesso!";
						else
							erroBanco = "Telefone regional alterado com sucesso!";
							
						telefoneRegional = tr.getTelefoneRegional();
						((TelefoneRegionalActionForm)form).setTelefoneRegional(telefoneRegional);
							
					} catch (Exception e) {
						erroBanco = "Erro ao gravar o telefone da regional";
					}					
				}
				else
				if(acao.equals("EXCLUIR")){
					try {
						
						if(telefoneRegional > 0){
							ObjTelefoneRegional tr = new ObjTelefoneRegional(telefoneRegional,regional);
																				
							tr.remove();
							
							erroBanco = "Telefone regional excluido com sucesso!";
														
							((TelefoneRegionalActionForm)form).apaga();
						}
						else
							erroBanco = "É necessário selecionar um telefone!";							
					} catch (Exception e) {
						erroBanco = "Erro ao excluir o telefone da regional";
					}					
				}								
			}
						
			if(estado > 0)
				colRegional = ObjRegional.findAllRegionais(estado); 			
				
			if(regional > 0)
				colTelefoneRegional = ObjTelefoneRegional.findAll(regional);
			
			
			Collection colEstado   = ObjEstado.findAllEstados();	
			
			
			request.getSession().setAttribute("colTelefoneRegional"	,colTelefoneRegional);
			request.getSession().setAttribute("colRegional"			,colRegional);
			request.getSession().setAttribute("colEstado"			,colEstado);	
			request.setAttribute("erroBanco",erroBanco);					

		} catch (Exception e) {

			e.printStackTrace();
			return mapping.findForward("erroDefault");

		}

		// Finish with
		return mapping.findForward("TelefoneRegional");

	}
}
