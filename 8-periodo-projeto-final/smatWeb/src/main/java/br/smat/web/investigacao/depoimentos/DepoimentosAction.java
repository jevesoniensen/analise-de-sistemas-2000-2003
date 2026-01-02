package br.smat.web.investigacao.depoimentos;

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
import br.smat.ejb.agentesaude.AgenteSaude;
import br.smat.ejb.dadoinvestigacao.DadoInvestigacao;
import br.smat.ejb.representanteempresa.RepresentanteEmpresa;
import br.smat.ejb.testemunha.Testemunha;
import br.smat.ejb.tipodepoimento.TipoDepoimento;
import br.smat.ejb.trabalhador.Trabalhador;
import br.smat.objetosauxiliares.auxdepoimento.AuxDepoimento;
import br.smat.web.obj.ObjAcidente;
import br.smat.web.obj.ObjAgenteCausador;
import br.smat.web.obj.ObjAgenteSaude;
import br.smat.web.obj.ObjDepoimento;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjInvestigacao;
import br.smat.web.obj.ObjRepresentanteEmpresa;
import br.smat.web.obj.ObjTestemunha;
import br.smat.web.obj.ObjTipoDepoimento;
import br.smat.web.obj.ObjTrabalhador;

/**
 * @version 	1.0
 * @author
 */
public class DepoimentosAction extends Action {

	/**
	* Constructor
	*/
	public DepoimentosAction() {

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

		Vector 		colTipoDepoimento = null;
		Collection		colAgenteCausadorVo	 = null;
		Collection		colAgenteCausadorPai = null;
		Collection		colAgenteCausador	 = null;
		AuxDepoimento[]	auxDepoimento = null;
		ObjDepoimento objDepoimento = null;
		ObjAcidente		objAcidente = null;

		int tipoDepoimento = ((DepoimentosActionForm)form).getTipoDepoimento();
		int dadoInvestigacao = ((DepoimentosActionForm)form).getDadoInvestigacao();
		int numInvestigacao = ((DepoimentosActionForm)form).getNumInvestigacao();
		int acidente = ((DepoimentosActionForm)form).getAcidente();
		int pessoa = ((DepoimentosActionForm)form).getPessoa();
		String nomePessoa = ((DepoimentosActionForm)form).getNomePessoa();
		int agenteCausadorVo = ((DepoimentosActionForm)form).getAgenteCausadorVo();
		int agenteCausadorPai = ((DepoimentosActionForm)form).getAgenteCausadorPai();
		int agenteCausador = ((DepoimentosActionForm)form).getAgenteCausador();
		String data = ((DepoimentosActionForm)form).getData();
		String hora = ((DepoimentosActionForm)form).getHora();
		String acao = ((DepoimentosActionForm)form).getAcao();
		String descricao = ((DepoimentosActionForm)form).getDescricao();
		String erroBanco = null;
		int empregador = ((DepoimentosActionForm)form).getEmpregador();
		String dataAbertura = ((DepoimentosActionForm)form).getDataAbertura();
		
		
		try {
			
			objDepoimento = (ObjDepoimento)request.getSession().getAttribute("objDepoimento");

			if(objDepoimento != null){
				
				if(tipoDepoimento == objDepoimento.getTipoDepoimento()){
					if(pessoa == 0)
					 	((DepoimentosActionForm)form).setPessoa(objDepoimento.getPessoa());
					 	
					if(nomePessoa == null || nomePessoa.trim().length() == 0)
					 	((DepoimentosActionForm)form).setNomePessoa(objDepoimento.getNomePessoa());
				}

				((DepoimentosActionForm)form).setAgenteCausadorVo(objDepoimento.getAgenteCausadorVo());
				agenteCausadorVo = objDepoimento.getAgenteCausadorVo();
				
				((DepoimentosActionForm)form).setAgenteCausadorPai(objDepoimento.getAgenteCausadorPai());
				agenteCausadorPai = objDepoimento.getAgenteCausadorPai();
				
				((DepoimentosActionForm)form).setAgenteCausador(objDepoimento.getAgenteCausador());

				((DepoimentosActionForm)form).setDataAbertura(objDepoimento.getDataAbertura());
				dataAbertura = objDepoimento.getDataAbertura();
				
				if(objDepoimento.getDataHora() != null && objDepoimento.getDataHora().trim().length() != 0){

					int index = objDepoimento.getDataHora().indexOf(" ");
					
					if(index != -1){
						((DepoimentosActionForm)form).setData(objDepoimento.getDataHora().substring(0,index));
						((DepoimentosActionForm)form).setHora(objDepoimento.getDataHora().substring(index+1));
					}else{
						if(objDepoimento.getDataHora().indexOf("/") != -1)
							((DepoimentosActionForm)form).setData(objDepoimento.getDataHora());
						else
							((DepoimentosActionForm)form).setHora(objDepoimento.getDataHora());
					}

				}

				((DepoimentosActionForm)form).setDescricao(objDepoimento.getDescricao());
				
				request.getSession().removeAttribute("objDepoimento");
				objDepoimento = null;
				
			}
			
			if(numInvestigacao != 0 )
				auxDepoimento = ObjGenerico.getAllDepoimentosInvestigacao(numInvestigacao);
							
								
			if(acao != null)
				if(acao.equals("GRAVAR")){
					
					if(dadoInvestigacao == 0){
						
						
						if(auxDepoimento != null)
						for(int i=0;i < auxDepoimento.length;i++){
							
							System.out.println("auxDepoimentoauxDepoimento => " + auxDepoimento.length);
							
							System.out.println("depoimento => " + tipoDepoimento + " == " +  auxDepoimento[i].getTipoDepoimento());
							System.out.println("pessoa => " + pessoa + " == " +  auxDepoimento[i].getPessoa());
							
							if(tipoDepoimento == auxDepoimento[i].getTipoDepoimento() && pessoa == auxDepoimento[i].getPessoa())
								erroBanco = "Este depoimento não pode ser incluído porque a testemunha já possui um depoimento!";
						}

						if(erroBanco == null){
							try{
								objDepoimento = new ObjDepoimento(numInvestigacao,pessoa,data + " " + hora,agenteCausador,descricao,tipoDepoimento);
								objDepoimento.save();
								((DepoimentosActionForm)form).setDadoInvestigacao(objDepoimento.getDadoInvestigacao());
								erroBanco = "Depoimento cadastrado com sucesso!";
								
							}catch(Exception e){
								erroBanco = "Não foi possível cadastrar o depoimento!";
								
								switch(tipoDepoimento){
									case 2:
										Testemunha te = null;
										try{
											te = ObjTestemunha.findByPrimaryKey(pessoa);

											if(te == null){
												erroBanco += " A Testemunha foi excluída!";
												pessoa = 0;
												nomePessoa = null;
											 	((DepoimentosActionForm)form).setPessoa(0);
											 	((DepoimentosActionForm)form).setNomePessoa(null);											
											}
										}catch(Exception e1){
											erroBanco += " A Testemunha foi excluída!";
											pessoa = 0;
											nomePessoa = null;
										 	((DepoimentosActionForm)form).setPessoa(0);
										 	((DepoimentosActionForm)form).setNomePessoa(null);											
										}
										
										break;
									case 3:
										RepresentanteEmpresa re = null;
										
										try{
											re = ObjRepresentanteEmpresa.findByPrimaryKey(pessoa);

											if(re == null){
												erroBanco += " O Representante da empresa foi excluído!";
												pessoa = 0;
												nomePessoa = null;
											 	((DepoimentosActionForm)form).setPessoa(0);
											 	((DepoimentosActionForm)form).setNomePessoa(null);											
											}

										}catch(Exception e1){
											erroBanco += " O Representante da empresa foi excluído!";
											pessoa = 0;
											nomePessoa = null;
										 	((DepoimentosActionForm)form).setPessoa(0);
										 	((DepoimentosActionForm)form).setNomePessoa(null);																						
										}
										break;
									case 1:
										AgenteSaude ag = null;
										try{
											ag = ObjAgenteSaude.findByPrimaryKey(pessoa);
											if(ag == null){
												erroBanco += " O Agente de saúde  foi excluído!";
												pessoa = 0;
												nomePessoa = null;
											 	((DepoimentosActionForm)form).setPessoa(0);
											 	((DepoimentosActionForm)form).setNomePessoa(null);											
											}
										}catch(Exception e1){
												erroBanco += " O Agente de saúde  foi excluído!";
												pessoa = 0;
												nomePessoa = null;
											 	((DepoimentosActionForm)form).setPessoa(0);
											 	((DepoimentosActionForm)form).setNomePessoa(null);				
										}
										break;
								}
							}
						}
					}else{
						try{
							objDepoimento = new ObjDepoimento(numInvestigacao,dadoInvestigacao,pessoa,data + " " + hora,agenteCausador,descricao,tipoDepoimento);
							objDepoimento.save();
							erroBanco = "Depoimento atualizado com sucesso!";
						}catch(Exception e){
							erroBanco = "Não foi possível atualizar o depoimento!";
						}
					}

					auxDepoimento = ObjGenerico.getAllDepoimentosInvestigacao(numInvestigacao);
				
				}else
				if(acao.equals("LISTARTIPODEPOIMENTO")){
					if(tipoDepoimento == 4){
						
						Trabalhador t = ObjTrabalhador.findByAcidente(acidente);
						System.out.println("TRABALHADOR =>" + t.getTrabalhador());
						((DepoimentosActionForm)form).setPessoa(t.getTrabalhador());
						((DepoimentosActionForm)form).setNomePessoa(t.getNome());
					}
					else{
						
						pessoa = 0;
						((DepoimentosActionForm)form).setPessoa(0);
						nomePessoa = null;
						((DepoimentosActionForm)form).setNomePessoa(null);
					}
					
				}else
				if(acao.equals("MOSTRADEPOIMENTO")){
					
					System.out.println("length => " + auxDepoimento.length);
					
					for(int i=0;i < auxDepoimento.length;i++){
						
						System.out.println(auxDepoimento[i].getDadoInvestigacao() + " == " + dadoInvestigacao);

						if(auxDepoimento[i].getDadoInvestigacao() == dadoInvestigacao){
							((DepoimentosActionForm)form).setTipoDepoimento(auxDepoimento[i].getTipoDepoimento());
							tipoDepoimento = auxDepoimento[i].getTipoDepoimento();
							((DepoimentosActionForm)form).setPessoa(auxDepoimento[i].getPessoa());
							((DepoimentosActionForm)form).setNomePessoa(auxDepoimento[i].getNomePessoa());
							((DepoimentosActionForm)form).setAgenteCausadorVo(auxDepoimento[i].getAgenteCausadorVo());
							agenteCausadorVo = auxDepoimento[i].getAgenteCausadorVo();
							((DepoimentosActionForm)form).setAgenteCausadorPai(auxDepoimento[i].getAgenteCausadorPai());
							agenteCausadorPai = auxDepoimento[i].getAgenteCausadorPai();
							((DepoimentosActionForm)form).setAgenteCausador(auxDepoimento[i].getAgenteCausador());
							((DepoimentosActionForm)form).setData(auxDepoimento[i].getDataHora().substring(0,10));
							((DepoimentosActionForm)form).setHora(auxDepoimento[i].getDataHora().substring(11,16));
							((DepoimentosActionForm)form).setDescricao(auxDepoimento[i].getDescricao());
							break;
						}
					}
				}else
				if(acao.equals("LIMPAR")){
					((DepoimentosActionForm)form).apaga();
					agenteCausadorVo = 0;
					agenteCausadorPai = 0;
					agenteCausador = 0;
					dadoInvestigacao = 0;
					tipoDepoimento = 0;
				}else
				if(acao.equals("EXCLUIR")){
					
					if(dadoInvestigacao != 0){
						try{
							DadoInvestigacao dado = ObjDepoimento.findByPrimaryKey(numInvestigacao,dadoInvestigacao);
							dado.remove();
							((DepoimentosActionForm)form).apaga();
							agenteCausadorVo = 0;
							agenteCausadorPai = 0;
							agenteCausador = 0;
							dadoInvestigacao = 0;
							erroBanco = "Depoimento excluído com sucesso!";
						}catch(Exception e){
							erroBanco = "Não foi possível excluir o Depoimento!";
						}
						auxDepoimento = ObjGenerico.getAllDepoimentosInvestigacao(numInvestigacao);

					}else
						erroBanco = "É necessário selecionar um depoimento para que ele possa ser selecionado!";
				}else
				if(acao.equals("RETORNAR")){
					
					forward.setName("RETORNAR_");
					forward.setPath("investigacao/DetalhesInvestigacao.do?numInvestigacao="+numInvestigacao);
					return forward;					
				}else
				if(acao.equals("PESQUISAR")){

					objDepoimento = new ObjDepoimento(data+" "+hora,tipoDepoimento,pessoa,nomePessoa,descricao,agenteCausador,agenteCausadorPai,agenteCausadorVo,dataAbertura);
					
					request.getSession().setAttribute("objDepoimento",objDepoimento);
					forward.setName("PESQUISAR_");
					forward.setPath("pessoas/PesquisaPessoa.do?numInvestigacao="+numInvestigacao+"&acidente="+acidente+"&tipoDepoimento="+tipoDepoimento+"&dadoInvestigacao="+dadoInvestigacao+"&empregador="+empregador);
					return forward;					
				}
			

			colAgenteCausadorVo = ObjAgenteCausador.findAllAgentesCausadores();

			if(agenteCausadorVo > 0)			 
				colAgenteCausadorPai = ObjAgenteCausador.findAllAgentesCausadores(agenteCausadorVo);
	
			if(agenteCausadorPai > 0)			 
				colAgenteCausador = ObjAgenteCausador.findAllAgentesCausadores(agenteCausadorPai);

			colTipoDepoimento = new Vector(ObjTipoDepoimento.findAllTiposDepoimentos());

			
			if(empregador == 0){

				objAcidente = ObjAcidente.getInstanciaAcidente(acidente);
				empregador = objAcidente.getEmpresa();
				((DepoimentosActionForm)form).setEmpregador(empregador);
				
				if(empregador == 0){
					TipoDepoimento aux = null;
					for(int i=0;i<colTipoDepoimento.size();i++){
						
						aux = (TipoDepoimento)colTipoDepoimento.elementAt(i);
						if(aux.getTipoDepoimento() == 3)
							colTipoDepoimento.removeElementAt(i);
					}
				}
			}
			
			
			if(tipoDepoimento != 4 && tipoDepoimento != 0)
				request.setAttribute("mostraPesquisar","mostraPesquisar");
			else
				request.removeAttribute("mostraPesquisar");
			
			
			request.setAttribute("dataAbertura",dataAbertura);
			request.setAttribute("erroBanco",erroBanco);
			request.getSession().setAttribute("colTipoDepoimento",colTipoDepoimento);
			request.getSession().setAttribute("colAgenteCausadorVo",colAgenteCausadorVo);
			request.getSession().setAttribute("colAgenteCausadorPai",colAgenteCausadorPai);
			request.getSession().setAttribute("colAgenteCausador",colAgenteCausador);
			request.getSession().setAttribute("auxDepoimento",auxDepoimento);

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
		return mapping.findForward("Depoimentos");

	}
}
