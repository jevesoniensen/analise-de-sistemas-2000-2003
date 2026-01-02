package br.smat.web.pessoas;

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
import br.smat.ejb.tipodepoimento.TipoDepoimento;
import br.smat.objetosauxiliares.auxpessoa.AuxPessoa;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjTipoDepoimento;

/**
 * @version 	1.0
 * @author
 */
public class PesquisaPessoaAction extends Action {

	/**
	* Constructor
	*/
	public PesquisaPessoaAction() {

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

		Collection colAuxTipoDepoimento = null;
		Vector colTipoDepoimento = null;
		
		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();

		String 	acao = ((PesquisaPessoaActionForm)form).getAcao();
		int 	tipoDepoimento = ((PesquisaPessoaActionForm)form).getTipoDepoimento();
		int numInvestigacao = ((PesquisaPessoaActionForm)form).getNumInvestigacao();
		int dadoInvestigacao = ((PesquisaPessoaActionForm)form).getDadoInvestigacao();
		int acidente= ((PesquisaPessoaActionForm)form).getAcidente();
		int pessoa = ((PesquisaPessoaActionForm)form).getPessoa();
		int empregador = ((PesquisaPessoaActionForm)form).getEmpregador();
		String 	nomePessoa = ((PesquisaPessoaActionForm)form).getNomePessoa();
		AuxPessoa[] auxPessoa = null;
		
		try {

			
			if(acao != null)
				if(acao.equals("RETORNAR")){
					forward.setName("RETORNAR_");
					forward.setPath("investigacao/Depoimentos.do?investigacao="+numInvestigacao+"&dadoInvestigacao="+dadoInvestigacao+"&acidente="+acidente+"&pessoa="+pessoa+"&nomePessoa="+nomePessoa+"&empregador="+empregador+"&acao=");
					return forward;
				}else
				if(acao.equals("CADASTRAR")){
					
					forward.setName("CADASTRAR");
					
					switch(tipoDepoimento){
						case 2:
							forward.setPath("pessoas/CadastroTestemunha.do?numInvestigacao="+numInvestigacao+"&acidente="+acidente+"&dadoInvestigacao="+dadoInvestigacao+"&tipoDepoimento="+tipoDepoimento+"&acao=LISTAR&empregador="+empregador);
							break;
						case 3:
							forward.setPath("pessoas/CadastroRepresentante.do?numInvestigacao="+numInvestigacao+"&acidente="+acidente+"&dadoInvestigacao="+dadoInvestigacao+"&tipoDepoimento="+tipoDepoimento+"&acao=LISTAR&empregador="+empregador);
							break;
					}
					
					return forward;
				}
				
			
			if(tipoDepoimento != 0 && (nomePessoa != null && nomePessoa.trim().length() != 0 )){
				auxPessoa = ObjGenerico.pesquisarPessoa(tipoDepoimento,nomePessoa,acidente);
			}
			
			
			if(auxPessoa == null)
				request.getSession().removeAttribute("auxPessoa");
				
			// do something here
			
			if(tipoDepoimento != 1 && tipoDepoimento != 4)
				request.setAttribute("mostrarCadastro","mostrarCadastro");
			else
				request.removeAttribute("mostrarCadastro");
			
			colAuxTipoDepoimento = ObjTipoDepoimento.findAllTiposDepoimentos();
			
			if(colAuxTipoDepoimento != null){
				colTipoDepoimento = new Vector(colAuxTipoDepoimento);
				
				for(int i = 0; i < colTipoDepoimento.size(); i++){
					if(((TipoDepoimento)colTipoDepoimento.elementAt(i)).getTipoDepoimento() == 4)
						colTipoDepoimento.removeElementAt(i);
					else
						if(empregador == 0)
							if(((TipoDepoimento)colTipoDepoimento.elementAt(i)).getTipoDepoimento() == 3)
								colTipoDepoimento.removeElementAt(i);

				}
			}
		
			request.getSession().setAttribute("auxPessoa",auxPessoa);
			request.getSession().setAttribute("colTipoDepoimento",colTipoDepoimento);
		

		} catch (Exception e) {

			e.printStackTrace();
			return mapping.findForward("erroDefault");

		}


		// Finish with
		return mapping.findForward("PesquisaPessoa");

	}
}
