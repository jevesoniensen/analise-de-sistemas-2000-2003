package br.smat.web.pessoas.cadastrotestemunha;

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
import br.smat.ejb.testemunha.Testemunha;
import br.smat.objetosauxiliares.auxtestemunha.AuxTestemunha;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjMunicipio;
import br.smat.web.obj.ObjTestemunha;

/**
 * @version 	1.0
 * @author
 */
public class CadastroTestemunhaAction extends Action {

	/**
	* Constructor
	*/
	public CadastroTestemunhaAction() {

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

		int 	acidente				=  ((CadastroTestemunhaActionForm) form).getAcidente();
		int 	numInvestigacao			=  ((CadastroTestemunhaActionForm) form).getNumInvestigacao();
		int	dadoInvestigacao		=  ((CadastroTestemunhaActionForm) form).getDadoInvestigacao();
		int	tipoDepoimento			=  ((CadastroTestemunhaActionForm) form).getTipoDepoimento();
		int	testemunha				=  ((CadastroTestemunhaActionForm) form).getTestemunha();
		String 	nome					=  ((CadastroTestemunhaActionForm) form).getNome(); 
		int 	estado					=  ((CadastroTestemunhaActionForm) form).getEstado();
		int     municipio				=  ((CadastroTestemunhaActionForm) form).getMunicipio(); 
		String  rua						=  ((CadastroTestemunhaActionForm) form).getRua();
		String  bairro					=  ((CadastroTestemunhaActionForm) form).getBairro();
		int	numero					=  ((CadastroTestemunhaActionForm) form).getNumero();
		String  complemento				=  ((CadastroTestemunhaActionForm) form).getComplemento();
		String  cep						=  ((CadastroTestemunhaActionForm) form).getCep();
		String  telefone				=  ((CadastroTestemunhaActionForm) form).getTelefone(); 	
		String  ddd				   		=  ((CadastroTestemunhaActionForm) form).getDdd();
		String  acao				   	=  ((CadastroTestemunhaActionForm) form).getAcao();
		int empregador 				=  ((CadastroTestemunhaActionForm) form).getEmpregador();

		String erroBanco = null;

		Collection  	colEstado				= null;
		Collection  	colMunicipio	= null;
		AuxTestemunha[] auxTestemunha = null;

		try {


			auxTestemunha = ObjGenerico.getAllTestemunhasAcidente(acidente);

			if(acao != null)
				if(acao.equals("LIMPAR")){
					((CadastroTestemunhaActionForm) form).apaga();
					estado = 0;
					
				}else
				if(acao.equals("RETORNAR")){
					forward.setName("RETORNAR_");
					forward.setPath("pessoas/PesquisaPessoa.do?numInvestigacao="+numInvestigacao+"&dadoInvestigacao="+dadoInvestigacao+"&acidente="+acidente+"&tipoDepoimento="+tipoDepoimento+"&acao=LISTAR&nomePessoa="+nome+"&empregador="+empregador);
					return forward;
				}else
				if(acao.equals("GRAVAR")){
					ObjTestemunha objTestemunha = new ObjTestemunha(acidente,estado,municipio,nome,numero,rua,bairro,cep,complemento,telefone,ddd);
					
					try{
						if(testemunha == 0){
							objTestemunha.save();
							((CadastroTestemunhaActionForm) form).setTestemunha(objTestemunha.getTestemunha());
							erroBanco = "Testemunha cadastrada com sucesso!";
						}else{
							objTestemunha.setTestemunha(testemunha);
							objTestemunha.save();
							erroBanco = "Testemunha atualizada com sucesso!";
						}
						auxTestemunha = ObjGenerico.getAllTestemunhasAcidente(acidente);
					}catch(Exception e){
						erroBanco = "Erro ao gravar a Testemunha!";
					}
				}else
				if(acao.equals("LISTARTESTEMUNHA")){
					
					for(int i= 0; i < auxTestemunha.length; i++){
							if(testemunha == auxTestemunha[i].getTestemunha()){

								((CadastroTestemunhaActionForm) form).setNome(auxTestemunha[i].getNome()); 
								((CadastroTestemunhaActionForm) form).setEstado(auxTestemunha[i].getEstado());
								estado = auxTestemunha[i].getEstado();
								((CadastroTestemunhaActionForm) form).setMunicipio(auxTestemunha[i].getMunicipio()); 
								((CadastroTestemunhaActionForm) form).setRua(auxTestemunha[i].getRua());
								((CadastroTestemunhaActionForm) form).setBairro(auxTestemunha[i].getBairro());
								((CadastroTestemunhaActionForm) form).setNumero(auxTestemunha[i].getNumero());
								((CadastroTestemunhaActionForm) form).setComplemento(auxTestemunha[i].getComplemento());
								((CadastroTestemunhaActionForm) form).setCep(auxTestemunha[i].getCep());
								((CadastroTestemunhaActionForm) form).setTelefone(auxTestemunha[i].getTelefone()); 	
								((CadastroTestemunhaActionForm) form).setDdd(auxTestemunha[i].getDdd());
								
							}
					}
				}else
				if(acao.equals("EXCLUIR")){
					
					if(testemunha != 0){
						
						try{
							Testemunha t = ObjTestemunha.findByPrimaryKey(testemunha);
							t.remove();
							erroBanco = "Testemunha excluída com sucesso!";
						}catch(Exception e1){
							erroBanco = "Não foi possível excluir a testemunha! Provavelmente ela esteja vinculada a um depoimento!";
						}
						auxTestemunha = ObjGenerico.getAllTestemunhasAcidente(acidente);
					}else
						erroBanco = "É necessário selecionar uma testemunha para que ela possa ser excluída!";
				}
			
	
			colEstado = ObjEstado.findAllEstados();
		
			if(estado != 0)
				colMunicipio = ObjMunicipio.findAllMunicipios(estado);
				
			
			request.setAttribute("erroBanco",erroBanco);	
			request.getSession().setAttribute("colEstado",colEstado);
			request.getSession().setAttribute("colMunicipio",colMunicipio);

			if(auxTestemunha != null)
				System.out.println("auxTexte => " + auxTestemunha.length);
			else
				System.out.println("auxTexte => null");
			
			request.getSession().setAttribute("auxTestemunha",auxTestemunha);

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
		return mapping.findForward("CadastroTestemunha");

	}
}
