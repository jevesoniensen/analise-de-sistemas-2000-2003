package br.smat.web.pessoas.cadastrorepresentante;

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
import br.smat.ejb.empregador.Empregador;
import br.smat.ejb.representanteempresa.RepresentanteEmpresa;
import br.smat.web.obj.ObjEmpregador;
import br.smat.web.obj.ObjRepresentanteEmpresa;

/**
 * @version 	1.0
 * @author
 */
public class CadastroRepresentanteAction extends Action {

	/**
	* Constructor
	*/
	public CadastroRepresentanteAction() {

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

		int representante = ((CadastroRepresentanteActionForm)form).getRepresentante();
		int empregador = ((CadastroRepresentanteActionForm)form).getEmpregador();
		int numInvestigacao = ((CadastroRepresentanteActionForm)form).getNumInvestigacao();
		int dadoInvestigacao = ((CadastroRepresentanteActionForm)form).getDadoInvestigacao();
		int tipoDepoimento = ((CadastroRepresentanteActionForm)form).getTipoDepoimento();
		int acidente = ((CadastroRepresentanteActionForm)form).getAcidente();
		String acao  = ((CadastroRepresentanteActionForm)form).getAcao();
		String nome = ((CadastroRepresentanteActionForm)form).getNome();
		
		Collection colRepresentanteEmpresa = null;
		
		String erroBanco = null;

		try {

			if(empregador != 0){
				
				if(acao != null){
				if(!acao.equals("GRAVAR") && !acao.equals("EXCLUIR"))
					colRepresentanteEmpresa = ObjRepresentanteEmpresa.findAllRepresentanteByEmpresa(empregador);
				}else
					colRepresentanteEmpresa = ObjRepresentanteEmpresa.findAllRepresentanteByEmpresa(empregador);
				
				Empregador e = ObjEmpregador.findByPrimaryKey(empregador);
				request.setAttribute("nomeEmpregador",e.getRazaoSocial());
			}
		
			if(acao != null)
			if(acao.equals("LIMPAR")){
				((CadastroRepresentanteActionForm)form).apaga();
				representante = 0;
			}else
			if(acao.equals("LISTARREPRESENTANTE")){

				if(representante != 0){
					RepresentanteEmpresa rep = ObjRepresentanteEmpresa.findByPrimaryKey(representante);
					
					if(rep != null)
						((CadastroRepresentanteActionForm)form).setNome(rep.getNome());
					
				}
			}else
			if(acao.equals("GRAVAR")){

				try{			
					ObjRepresentanteEmpresa objRepresentanteEmpresa = new ObjRepresentanteEmpresa(representante,nome,empregador);
					objRepresentanteEmpresa.save();
					if(representante == 0){
						((CadastroRepresentanteActionForm)form).setRepresentante(objRepresentanteEmpresa.getRepresentanteEmpresa());
						representante = objRepresentanteEmpresa.getRepresentanteEmpresa();
						erroBanco = "Representante cadastrado com sucesso!";						
						
					}else{
						erroBanco = "Representante atualizado com sucesso!";
					}
				}catch(Exception e){
					erroBanco = "Erro ao cadastrar representante!";
				}

				colRepresentanteEmpresa = ObjRepresentanteEmpresa.findAllRepresentanteByEmpresa(empregador);

			}else
			if(acao.equals("EXCLUIR")){
				
				try{
					if(representante != 0){
						RepresentanteEmpresa rep = ObjRepresentanteEmpresa.findByPrimaryKey(representante);
						rep.remove();
						((CadastroRepresentanteActionForm)form).apaga();
						representante = 0;
						nome = null;
						erroBanco = "Representante excluído com sucesso!";
					}else
						erroBanco = "É necessário selecionar um representante para que ele possa ser excluído!";
				}catch(Exception e1){
					erroBanco = "Não foi possível excluir o Representante da empresa! Provavelmente ele esteja vinculado a um depoimento!";
				}
				colRepresentanteEmpresa = ObjRepresentanteEmpresa.findAllRepresentanteByEmpresa(empregador);

			}else
			if(acao.equals("RETORNAR")){
				forward.setName("RETORNAR");
				forward.setPath("pessoas/PesquisaPessoa.do?numInvestigacao="+numInvestigacao+"&acidente="+acidente+"&dadoInvestigacao="+dadoInvestigacao+"&tipoDepoimento="+tipoDepoimento+"&nomePessoa="+nome+"&empregador="+empregador+"&acao=LISTAR");
				return forward;
			}
			request.setAttribute("erroBanco",erroBanco);
			request.getSession().setAttribute("colRepresentanteEmpresa",colRepresentanteEmpresa);

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
		return mapping.findForward("CadastroRepresentante");

	}
}
