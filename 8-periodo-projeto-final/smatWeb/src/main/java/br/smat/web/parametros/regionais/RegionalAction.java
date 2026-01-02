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
import br.smat.objetosauxiliares.auxregional.AuxRegional;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjMunicipio;
import br.smat.web.obj.ObjRamoAtividade;
import br.smat.web.obj.ObjRegional;

/**
 * @version 	1.0
 * @author
 */
public class RegionalAction extends Action {

	/**
	* Constructor
	*/
	public RegionalAction() {

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
		AuxRegional[] auxRegional = null;
		Collection colEstado = null;
		Collection colMunicipio = null;
		
		try {


			int 	estado = ((RegionalActionForm)form).getEstado();
			int 	regional = ((RegionalActionForm)form).getRegional();
			String	acao = ((RegionalActionForm)form).getAcao();
			String 	nome = ((RegionalActionForm)form).getNome();
			String	rua	 = ((RegionalActionForm)form).getRua();
			int	numero =  ((RegionalActionForm)form).getNumero();
			String 	complemento =  ((RegionalActionForm)form).getComplemento();
			String	bairro =  ((RegionalActionForm)form).getBairro();
			String 	cep =  ((RegionalActionForm)form).getCep();
			int	municipio =  ((RegionalActionForm)form).getMunicipio();

			auxRegional = ObjGenerico.getAllRegionais();				
			colEstado = ObjEstado.findAllEstados();
			
			if(acao != null)
			if(acao.equals("MOSTRAREGIONAL")){
				
				for(int i=0;i<auxRegional.length;i++){
					
					if(auxRegional[i].getRegional() == regional){
						
						((RegionalActionForm)form).setMunicipio(auxRegional[i].getMunicipio());
						((RegionalActionForm)form).setEstado(auxRegional[i].getEstado());
						estado = auxRegional[i].getEstado();
						((RegionalActionForm)form).setNome(auxRegional[i].getNome());
						((RegionalActionForm)form).setNumero(auxRegional[i].getNumero());
						((RegionalActionForm)form).setRua(auxRegional[i].getRua());
						((RegionalActionForm)form).setBairro(auxRegional[i].getBairro());
						((RegionalActionForm)form).setCep(auxRegional[i].getCep());
						((RegionalActionForm)form).setComplemento(auxRegional[i].getComplemento());

					}
				}
				
			}else
			if(acao.equals("LIMPAR")){
					((RegionalActionForm)form).apaga();
					estado = 0;
			}else
			if(acao.equals("GRAVAR")){

				try{
					ObjRegional r = new ObjRegional(regional,nome,estado,rua,numero,complemento,bairro,cep,municipio);
					r.save();

					if(regional == 0){
						((RegionalActionForm)form).setRegional(r.getRegional()) ;
						erroBanco = "Regional inserida com sucesso!";
					}else{
						erroBanco = "Regional atualizada com sucesso!";	
					}

				}catch(Exception e){
					erroBanco = "Não foi possível gravar a regional!";
				}
				
				auxRegional = ObjGenerico.getAllRegionais();
			}else
			if(acao.equals("EXCLUIR")){
				Regional reg = null;
				if(regional != 0){
					try{
						reg = ObjRegional.findByPrimaryKey(regional);
						reg.remove();
						((RegionalActionForm)form).apaga();
						estado = 0;									
						erroBanco = "Regional excluída com sucesso!";
					}catch(Exception e){
						erroBanco = "Não foi possível excluir a regional!";
					}
				}else{
					erroBanco = "É necessário selecionar uma Regional de saúde para que ela possa ser excluída!";
				}
				
				auxRegional = ObjGenerico.getAllRegionais();
			}

			if(estado != 0)
				colMunicipio = ObjMunicipio.findAllMunicipios(estado);
			
			request.setAttribute("erroBanco",erroBanco);
			request.getSession().setAttribute("auxRegional",auxRegional);
			request.getSession().setAttribute("colEstado",colEstado);
			request.getSession().setAttribute("colMunicipio",colMunicipio);

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
		return mapping.findForward("Regional");

	}
}
