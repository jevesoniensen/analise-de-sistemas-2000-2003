package br.smat.web.acidentepassodois;

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
import br.smat.ejb.locallesao.LocalLesao;
import br.smat.web.obj.ObjAcidente;
import br.smat.web.obj.ObjAgenteCausador;
import br.smat.web.obj.ObjArea;
import br.smat.web.obj.ObjEmitente;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjEstadoCivil;
import br.smat.web.obj.ObjLocalLesao;
import br.smat.web.obj.ObjLocalLesaoAcidente;
import br.smat.web.obj.ObjMunicipio;
import br.smat.web.obj.ObjOcupacao;
import br.smat.web.obj.ObjTipoAcidente;
import br.smat.web.obj.ObjTipoLocalAcidente;
import br.smat.web.obj.ObjVinculoEmpregaticio;

/**
 * @version 	1.0
 * @author
 */
public class AcidentePassoDoisAction extends Action {

	/**
	* Constructor
	*/
	public AcidentePassoDoisAction() {

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

		try {
			
			ObjAcidente	 objAcidente 		= (ObjAcidente) request.getSession().getAttribute("objAcidente");
			
			if(objAcidente != null){
				
				String permitido = objAcidente.getDestinoPermitido();

				if(permitido != null ){
				   if(!permitido.equalsIgnoreCase("PASSODOIS")){
				   		objAcidente = null;
				   }				   	   	
				}
				else
					objAcidente = null;
				   	
				System.out.println("permitido " + permitido + " acidente " + objAcidente);
			}
			
			if(objAcidente == null){
				Collection		colEmitente			 	= ObjEmitente.findAllEmitentes();	
				Collection		colEstadoCivil		 	= ObjEstadoCivil.findAllEstadosCivis();
				Collection		colOcupacao			 	= ObjOcupacao.findAllOcupacoes();
				Collection 		colVinculoEmpregaticio  = ObjVinculoEmpregaticio.findAllVinculosEmpregaticios();
				Collection 		colArea					= ObjArea.findAllAreas();							
							
				request.getSession().setAttribute("colEmitente",colEmitente);
				request.getSession().setAttribute("colEstadoCivil",colEstadoCivil);
				request.getSession().setAttribute("colOcupacao",colOcupacao);
				request.getSession().setAttribute("colVinculoEmpregaticio",colVinculoEmpregaticio);
				request.getSession().setAttribute("colArea",colArea);
							
				forward.setName("PASSOUM_");
				forward.setPath("./cadastroacidente/AcidentePassoUm.do?destino=PASSOUM&acao=ZERARSESSAO");							
				return forward;					
			}
			
			Vector		 vLocalLesaoAcidente = (Vector) request.getSession().getAttribute("vLocalLesaoAcidente");
			
			if(vLocalLesaoAcidente == null)
				vLocalLesaoAcidente = new Vector();
			
			String		 paginaAtual = (((AcidentePassoDoisActionForm) form).getPaginaAtual());							
			
			((AcidentePassoDoisActionForm) form).setPaginaAtual("PASSODOIS");			
										
			int	estadoAcidente	  	= (((AcidentePassoDoisActionForm) form).getEstadoAcidente());
			int	localLesaoPai	  	= (((AcidentePassoDoisActionForm) form).getLocalLesaoPai());			
			int	agenteCausadorVo  	= (((AcidentePassoDoisActionForm) form).getAgenteCausadorVo());			
			int	agenteCausadorPai 	= (((AcidentePassoDoisActionForm) form).getAgenteCausadorPai());	
			int     agenteCausador		= (((AcidentePassoDoisActionForm) form).getAgenteCausador());
			int	index			  	= (((AcidentePassoDoisActionForm) form).getIndex());	
			int	localLesao		  	= (((AcidentePassoDoisActionForm) form).getLocalLesao());				
			int	acidente		  	= (((AcidentePassoDoisActionForm) form).getAcidente());							
			String	destino		 = (((AcidentePassoDoisActionForm) form).getDestino());					
			String	acao		 = (((AcidentePassoDoisActionForm) form).getAcao());								
						
			if(destino == null || (!destino.equalsIgnoreCase("RETORNAR") && !destino.equalsIgnoreCase("PASSODOIS"))){	
				
				if(agenteCausadorVo != objAcidente.getAgenteCausadorVo())
					agenteCausador = 0;
								
				objAcidente.setAgenteCausador(agenteCausador);
				objAcidente.setAgenteCausadorPai(agenteCausadorPai);
				objAcidente.setAgenteCausadorVo(agenteCausadorVo);
				objAcidente.setAmputacao(((AcidentePassoDoisActionForm) form).getAmputacao());
				objAcidente.setDataAcidente(((AcidentePassoDoisActionForm) form).getDataAcidente());
				objAcidente.setDataUltimodiaTrab(((AcidentePassoDoisActionForm) form).getDataUltimodiaTrab());			
				objAcidente.setDescricaoLocal(((AcidentePassoDoisActionForm) form).getDescricaoLocal());
				objAcidente.setDescricaoSituacaoGeradora(((AcidentePassoDoisActionForm) form).getDescricaoSituacaoGeradora());
				objAcidente.setDocumentoEmpresaTerceira(((AcidentePassoDoisActionForm) form).getDocumentoEmpresaTerceira());
				objAcidente.setDistritoSaude(((AcidentePassoDoisActionForm) form).getDistritoSaude());
				objAcidente.setEmpresaTerceira(((AcidentePassoDoisActionForm) form).getEmpresaTerceira());
				objAcidente.setEstadoAcidente(estadoAcidente);
				objAcidente.setHora(((AcidentePassoDoisActionForm) form).getHora());
				objAcidente.setHorasTrabalhadas(((AcidentePassoDoisActionForm) form).getHorasTrabalhadas());
				objAcidente.setLocalLesao(localLesao);
				objAcidente.setLocalLesaoPai(localLesaoPai);
				objAcidente.setMunicipioAcidente(((AcidentePassoDoisActionForm) form).getMunicipioAcidente());
				objAcidente.setObito(((AcidentePassoDoisActionForm) form).getObito());
				objAcidente.setRazaoSocialEmpresaterceira(((AcidentePassoDoisActionForm) form).getRazaoSocialEmpresaterceira());
				objAcidente.setRegistroPolicial(((AcidentePassoDoisActionForm) form).getRegistroPolicial());
				objAcidente.setTipoAcidente(((AcidentePassoDoisActionForm) form).getTipoAcidente());
				objAcidente.setTipoLocalAcidente(((AcidentePassoDoisActionForm) form).getTipoLocalAcidente());																																																
				objAcidente.setPaginaAtual("PASSODOIS");
			}
			else
			if(destino.equalsIgnoreCase("RETORNAR")){
				objAcidente.setEmpresaTerceira(((AcidentePassoDoisActionForm) form).getEmpresaTerceira());
				objAcidente.setDocumentoEmpresaTerceira(((AcidentePassoDoisActionForm) form).getDocumentoEmpresaTerceira());
				objAcidente.setRazaoSocialEmpresaterceira(((AcidentePassoDoisActionForm) form).getRazaoSocialEmpresaterceira());
			}
			else
			if(destino.equalsIgnoreCase("PASSODOIS"))
				destino = null;
				
			Collection  	colEstado						= ObjEstado.findAllEstados();
			Collection  	colMunicipioAcidente			= null;	
			Collection  	colTipoAcidente					= ObjTipoAcidente.findAllTiposAcidente();	
			Collection  	colTipoLocalAcidente			= ObjTipoLocalAcidente.findAllTiposLocalAcidente();			
			Collection		colLocalLesaoPai				= ObjLocalLesao.findAllLocaisLesao();
			Collection		colLocalLesao					= null;
			
			Collection		colAgenteCausadorVo				= ObjAgenteCausador.findAllAgentesCausadores();
			Collection		colAgenteCausadorPai			= null;
			Collection		colAgenteCausador				= null;

			if(objAcidente.getEstadoAcidente() > 0)
				colMunicipioAcidente = ObjMunicipio.findAllMunicipios(objAcidente.getEstadoAcidente());				
						
			if(objAcidente.getLocalLesaoPai() > 0)			 
				colLocalLesao = ObjLocalLesao.findAllLocaisLesao(objAcidente.getLocalLesaoPai());			
		
			if(objAcidente.getAgenteCausadorVo() > 0)			 
				colAgenteCausadorPai = ObjAgenteCausador.findAllAgentesCausadores(objAcidente.getAgenteCausadorVo());
	
			if(objAcidente.getAgenteCausadorPai() > 0)			 
				colAgenteCausador = ObjAgenteCausador.findAllAgentesCausadores(objAcidente.getAgenteCausadorPai());
				
/*			request.getSession().setAttribute("colMunicipioAcidente",colMunicipioAcidente);				
			request.getSession().setAttribute("colLocalLesao"       ,colLocalLesao       );						
			request.getSession().setAttribute("colAgenteCausadorPai",colAgenteCausadorPai);
			request.getSession().setAttribute("colAgenteCausador"   ,colAgenteCausador   );					*/

		
/*			if(estadoAcidente > 0)
				colMunicipioAcidente = ObjMunicipio.findAllMunicipios(estadoAcidente);				
				
			if(localLesaoPai > 0)			 
				colLocalLesao = ObjLocalLesao.findAllLocaisLesao(localLesaoPai);			

			if(agenteCausadorVo > 0)			 
				colAgenteCausadorPai = ObjAgenteCausador.findAllAgentesCausadores(agenteCausadorVo);

			if(agenteCausadorPai > 0)			 
				colAgenteCausador = ObjAgenteCausador.findAllAgentesCausadores(agenteCausadorPai);
				
			System.out.println("acao" + acao);			*/
				
			if(acao != null)			
			if(acao.equals("INSERIRLOCALESAO")){
				if(vLocalLesaoAcidente.size() < 3){	
					
					boolean insere = true;
					
					for(int i=0; i<vLocalLesaoAcidente.size();i++){
						if(localLesao == ((ObjLocalLesaoAcidente)vLocalLesaoAcidente.elementAt(i)).getLocalLesao()){
							insere = false;
							break;
						}						
					}
					if(insere){
						String nomeLocalLesao = ((LocalLesao)ObjLocalLesao.findByPrimaryKey(localLesao)).getNome();
						vLocalLesaoAcidente.add(new ObjLocalLesaoAcidente(vLocalLesaoAcidente.size()+1,localLesao,acidente,nomeLocalLesao));		
					}
				}
				acao = "LISTAR";
				destino = null;
			}
			else
			if(acao.equals("EXCLUIRLOCALLESAO")){
				for(int i=0; i<vLocalLesaoAcidente.size();i++){
					if(index == ((ObjLocalLesaoAcidente)vLocalLesaoAcidente.elementAt(i)).getIndex()){
						vLocalLesaoAcidente.removeElementAt(i);
						break;
					}						
				}
				acao = "LISTAR";
				destino = null;				
			}				
			
			objAcidente.setVLocalLesaoAcidente((ObjLocalLesaoAcidente[])vLocalLesaoAcidente.toArray(new ObjLocalLesaoAcidente[0]));
			
			request.getSession().setAttribute("objAcidente"         ,objAcidente         );			
			request.getSession().setAttribute("vLocalLesaoAcidente" ,vLocalLesaoAcidente );			
			request.getSession().setAttribute("colEstado"           ,colEstado           );
			request.getSession().setAttribute("colMunicipioAcidente",colMunicipioAcidente);				
			request.getSession().setAttribute("colTipoAcidente"     ,colTipoAcidente     );
			request.getSession().setAttribute("colTipoLocalAcidente",colTipoLocalAcidente);				
			request.getSession().setAttribute("colLocalLesaoPai"    ,colLocalLesaoPai    );
			request.getSession().setAttribute("colLocalLesao"       ,colLocalLesao       );				
			request.getSession().setAttribute("colAgenteCausadorVo" ,colAgenteCausadorVo );
			request.getSession().setAttribute("colAgenteCausadorPai",colAgenteCausadorPai);
			request.getSession().setAttribute("colAgenteCausador"   ,colAgenteCausador   );
						
			((AcidentePassoDoisActionForm) form).setDestino(null);			
			if(destino != null)
			if(destino.length() > 0)
			{
				if(destino.equalsIgnoreCase("AVANCAR"))
					objAcidente.setDestinoPermitido("PASSOTRES");
				else
				if( destino.equalsIgnoreCase("VOLTAR"))
					objAcidente.setDestinoPermitido("PASSOUM");

				if((!destino.equalsIgnoreCase("RETORNAR"))){
					
					if(destino.equalsIgnoreCase("PESQUISAR")){
													
							forward.setName("PESQUISAR_");
							forward.setPath("./empregadores/PesquisaEmpregador.do?destino=PASSODOIS&origem=PASSODOIS");										
							return forward;						
					}
					else{												
						if(destino.equalsIgnoreCase("VOLTAR")){
							Collection		colEmitente			 	= ObjEmitente.findAllEmitentes();	
							Collection		colEstadoCivil		 	= ObjEstadoCivil.findAllEstadosCivis();
							Collection		colOcupacao			 	= ObjOcupacao.findAllOcupacoes();
							Collection 		colVinculoEmpregaticio  = ObjVinculoEmpregaticio.findAllVinculosEmpregaticios();
							Collection 		colArea					= ObjArea.findAllAreas();							
							
							request.getSession().setAttribute("colEmitente",colEmitente);
							request.getSession().setAttribute("colEstadoCivil",colEstadoCivil);
							request.getSession().setAttribute("colOcupacao",colOcupacao);
							request.getSession().setAttribute("colVinculoEmpregaticio",colVinculoEmpregaticio);
							request.getSession().setAttribute("colArea",colArea);
							
							forward.setName("PASSOUM_");
							forward.setPath("./cadastroacidente/AcidentePassoUm.do?destino=PASSOUM&acao=listar");							
							return forward;										
						}
						else
						if(destino.equalsIgnoreCase("AVANCAR")){
							forward.setName("PASSOTRES_");
							forward.setPath("./cadastroacidente/AcidentePassoTres.do?destino=PASSOTRES&acao=listar");							
							return forward;																	
						}
					}
				}		
			}

			((AcidentePassoDoisActionForm) form).setAgenteCausadorVo(objAcidente.getAgenteCausadorVo());			
			((AcidentePassoDoisActionForm) form).setAgenteCausadorPai(objAcidente.getAgenteCausadorPai());
			((AcidentePassoDoisActionForm) form).setAgenteCausador(objAcidente.getAgenteCausador());			
			((AcidentePassoDoisActionForm) form).setAmputacao(objAcidente.getAmputacao());
			((AcidentePassoDoisActionForm) form).setDataAcidente(objAcidente.getDataAcidente());
			((AcidentePassoDoisActionForm) form).setDataUltimodiaTrab(objAcidente.getDataUltimodiaTrab());			
			((AcidentePassoDoisActionForm) form).setDescricaoLocal(objAcidente.getDescricaoLocal());
			((AcidentePassoDoisActionForm) form).setDescricaoSituacaoGeradora(objAcidente.getDescricaoSituacaoGeradora());
			((AcidentePassoDoisActionForm) form).setDistritoSaude(objAcidente.getDistritoSaude());
			((AcidentePassoDoisActionForm) form).setDocumentoEmpresaTerceira(objAcidente.getDocumentoEmpresaTerceira());
			((AcidentePassoDoisActionForm) form).setEstadoAcidente(objAcidente.getEstadoAcidente());
			((AcidentePassoDoisActionForm) form).setEmpresaTerceira(objAcidente.getEmpresaTerceira());
			((AcidentePassoDoisActionForm) form).setHora(objAcidente.getHora());
			((AcidentePassoDoisActionForm) form).setHorasTrabalhadas(objAcidente.getHorasTrabalhadas());
			((AcidentePassoDoisActionForm) form).setLocalLesao(objAcidente.getLocalLesao());
			((AcidentePassoDoisActionForm) form).setLocalLesaoPai(objAcidente.getLocalLesaoPai());
			((AcidentePassoDoisActionForm) form).setRazaoSocialEmpresaterceira(objAcidente.getRazaoSocialEmpresaterceira());
			((AcidentePassoDoisActionForm) form).setMunicipioAcidente(objAcidente.getMunicipioAcidente());
			((AcidentePassoDoisActionForm) form).setObito(objAcidente.getObito());
			((AcidentePassoDoisActionForm) form).setRegistroPolicial(objAcidente.getRegistroPolicial());
			((AcidentePassoDoisActionForm) form).setTipoAcidente(objAcidente.getTipoAcidente());
			((AcidentePassoDoisActionForm) form).setTipoLocalAcidente(objAcidente.getTipoLocalAcidente());	
			((AcidentePassoDoisActionForm) form).setPaginaAtual("PASSODOIS");																			

		} catch (Exception e) {
			
			e.printStackTrace();
			return mapping.findForward("erroDefault");
			// Report the error using the appropriate name and ID.
			//errors.add("name", new ActionError("id"));

		}



		// Finish with
		return mapping.findForward("AcidentePassoDois");

	}
}
