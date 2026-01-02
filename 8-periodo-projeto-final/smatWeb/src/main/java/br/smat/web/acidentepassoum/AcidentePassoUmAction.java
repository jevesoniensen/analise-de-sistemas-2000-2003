package br.smat.web.acidentepassoum;

import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.SysexMessage;
import javax.sound.sampled.EnumControl;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.pagina.Pagina;
import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjAcidente;
import br.smat.web.obj.ObjAgenteCausador;
import br.smat.web.obj.ObjArea;
import br.smat.web.obj.ObjEmitente;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjEstadoCivil;
import br.smat.web.obj.ObjLocalLesao;
import br.smat.web.obj.ObjMunicipio;
import br.smat.web.obj.ObjOcupacao;
import br.smat.web.obj.ObjPagina;
import br.smat.web.obj.ObjTipoAcidente;
import br.smat.web.obj.ObjTipoLocalAcidente;
import br.smat.web.obj.ObjVinculoEmpregaticio;

/**
 * @version 	1.0
 * @author
 */
public class AcidentePassoUmAction extends Action {

	/**
	* Constructor
	*/
	public AcidentePassoUmAction() {

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
		
		if(form == null){
			System.out.println("esse mapping aqui 1");
			return mapping.findForward("AcidentePassoUm");			
		}

		ActionErrors errors = new ActionErrors();

		try {
			
		
			String	acao   	 	 = (((AcidentePassoUmActionForm) form).getAcao());										
			ObjEstado         objEstado         = new ObjEstado();
			ObjMunicipio	  objMunicipio		= new ObjMunicipio();

			ObjAcidente		  objAcidente		= (ObjAcidente) request.getSession().getAttribute("objAcidente");

			int	estado		 = (((AcidentePassoUmActionForm) form).getEstado());
			String	destino		 = (((AcidentePassoUmActionForm) form).getDestino());	
			
			if(acao.equalsIgnoreCase("ZERARSESSAO")){
				((AcidentePassoUmActionForm) form).apaga();	
				objAcidente = null;
				destino = null;
				request.getSession().removeAttribute("objAcidente");
				request.getSession().removeAttribute("vLocalLesaoAcidente");												
				request.getSession().removeAttribute("vTestemunhas");				
			}

			if(objAcidente == null)
				objAcidente = new ObjAcidente();

			objAcidente.setDestinoPermitido(null);

			String	paginaAtual	 = (((AcidentePassoUmActionForm) form).getPaginaAtual());							
			int	empresa		 = ((AcidentePassoUmActionForm) form).getEmpresa();
			String  razaoSocial  = ((AcidentePassoUmActionForm) form).getRazaoSocial();
			String  documento	 = ((AcidentePassoUmActionForm) form).getDocumento();
			
			
			((AcidentePassoUmActionForm) form).setPaginaAtual("PASSOUM");						
				
			
											
			
			Collection  	colEstado				= objEstado.findAllEstados();
			Collection		colEmitente			 	= ObjEmitente.findAllEmitentes();	
			Collection		colEstadoCivil		 	= ObjEstadoCivil.findAllEstadosCivis();
			Collection		colOcupacao			 	= ObjOcupacao.findAllOcupacoes();
			Collection 		colVinculoEmpregaticio  = ObjVinculoEmpregaticio.findAllVinculosEmpregaticios();
			Collection 		colArea					= ObjArea.findAllAreas();
			Collection  	colMunicipio			= null;	
			
			if(estado > 0)
				colMunicipio = objMunicipio.findAllMunicipios(estado);
			else{
				colMunicipio = objMunicipio.findAllMunicipios(1);								
			}

			if(destino == null || (!destino.equalsIgnoreCase("RETORNAR") && !destino.equalsIgnoreCase("PASSOUM"))){
				
				objAcidente.setAcidente(((AcidentePassoUmActionForm) form).getAcidente());
				objAcidente.setAposentado(((AcidentePassoUmActionForm) form).getAposentado());
				objAcidente.setArea(((AcidentePassoUmActionForm) form).getArea());
				objAcidente.setBairro(((AcidentePassoUmActionForm) form).getBairro());
				objAcidente.setCep(((AcidentePassoUmActionForm) form).getCep());
				objAcidente.setComplemento(((AcidentePassoUmActionForm) form).getComplemento());
				objAcidente.setCpf(((AcidentePassoUmActionForm) form).getCpf());
				objAcidente.setCtps(((AcidentePassoUmActionForm) form).getCtps());
				objAcidente.setDataEmissaoCTPS(((AcidentePassoUmActionForm) form).getDataEmissaoCTPS());
				objAcidente.setDataEmissaoRG(((AcidentePassoUmActionForm) form).getDataEmissaoRG());
				objAcidente.setDataNascimento(((AcidentePassoUmActionForm) form).getDataNascimento());
				objAcidente.setDdd(((AcidentePassoUmActionForm) form).getDdd());
				objAcidente.setDocumento(documento);
				objAcidente.setEmitente(((AcidentePassoUmActionForm) form).getEmitente());
				objAcidente.setEmpresa(empresa);
				objAcidente.setEstado(((AcidentePassoUmActionForm) form).getEstado());
				objAcidente.setEstadoCivil(((AcidentePassoUmActionForm) form).getEstadoCivil());
				objAcidente.setMunicipio(((AcidentePassoUmActionForm) form).getMunicipio());
				objAcidente.setNome(((AcidentePassoUmActionForm) form).getNome());
				objAcidente.setNumero(((AcidentePassoUmActionForm) form).getNumero());
				objAcidente.setOcupacao(((AcidentePassoUmActionForm) form).getOcupacao());
				objAcidente.setPaginaAtual("PASSOUM");
				objAcidente.setPisPasepNit(((AcidentePassoUmActionForm) form).getPisPasepNit());
				objAcidente.setRazaoSocial(razaoSocial);
				objAcidente.setRemuneracaoMensal(((AcidentePassoUmActionForm) form).getRemuneracaoMensal());
				objAcidente.setRg(((AcidentePassoUmActionForm) form).getRg());
				objAcidente.setRua(((AcidentePassoUmActionForm) form).getRua());
				objAcidente.setSerie(((AcidentePassoUmActionForm) form).getSerie());
				objAcidente.setSexo(((AcidentePassoUmActionForm) form).getSexo());
				objAcidente.setTelefone(((AcidentePassoUmActionForm) form).getTelefone());
				objAcidente.setUfCTPS(((AcidentePassoUmActionForm) form).getUfCTPS());
				objAcidente.setUfRG(((AcidentePassoUmActionForm) form).getUfRG());
				objAcidente.setVinculoEmpregaticio(((AcidentePassoUmActionForm) form).getVinculoEmpregaticio());
				objAcidente.setTrabalhador(((AcidentePassoUmActionForm) form).getTrabalhador());
				objAcidente.setOrgaoExpedidorRG(((AcidentePassoUmActionForm) form).getOrgaoExpedidorRG());							
				objAcidente.setNomeResponsavel(((AcidentePassoUmActionForm) form).getNomeResponsavel());								
			}
			else
			if(destino.equalsIgnoreCase("RETORNAR")){
				objAcidente.setEmpresa(((AcidentePassoUmActionForm) form).getEmpresa());
				objAcidente.setDocumento(((AcidentePassoUmActionForm) form).getDocumento());
				objAcidente.setRazaoSocial(((AcidentePassoUmActionForm) form).getRazaoSocial());
				destino = null;
			}
			else
			if(destino.equalsIgnoreCase("PASSOUM"))						
				destino = null;

			if(destino != null)
			if(destino.equalsIgnoreCase("AVANCAR")){
				objAcidente.setDestinoPermitido("PASSODOIS");
			}	

			request.getSession().setAttribute("objAcidente",objAcidente);
			request.getSession().setAttribute("colEstado",colEstado);
			request.getSession().setAttribute("colMunicipio",colMunicipio);				
			request.getSession().setAttribute("colEmitente",colEmitente);
			request.getSession().setAttribute("colEstadoCivil",colEstadoCivil);
			request.getSession().setAttribute("colOcupacao",colOcupacao);
			request.getSession().setAttribute("colVinculoEmpregaticio",colVinculoEmpregaticio);
			request.getSession().setAttribute("colArea",colArea);

			((AcidentePassoUmActionForm) form).setDestino(null);			
			if(destino != null)
			if(destino.length() > 0){
				
				if(!destino.equalsIgnoreCase("RETORNAR")){
					ActionForward forward = new ActionForward();
					
					if(destino.equalsIgnoreCase("PESQUISAR")){
														
							forward.setName("PESQUISAR_");
							forward.setPath("./empregadores/PesquisaEmpregador.do?destino=PASSOUM&origem=PASSOUM");
							System.out.println("esse mapping aqui 2");										
							return forward;
					}
					else{						
						
						Collection  	colTipoAcidente					= ObjTipoAcidente.findAllTiposAcidente();	
						Collection  	colTipoLocalAcidente			= ObjTipoLocalAcidente.findAllTiposLocalAcidente();			
						Collection		colLocalLesaoPai				= ObjLocalLesao.findAllLocaisLesao();
						Collection		colAgenteCausadorVo				= ObjAgenteCausador.findAllAgentesCausadores();						
		
						request.getSession().setAttribute("colTipoAcidente"     ,colTipoAcidente     );
						request.getSession().setAttribute("colTipoLocalAcidente",colTipoLocalAcidente);				
						request.getSession().setAttribute("colLocalLesaoPai"    ,colLocalLesaoPai    );
						request.getSession().setAttribute("colAgenteCausadorVo" ,colAgenteCausadorVo );
					
						forward.setName("PASSODOIS_");
						forward.setPath("./cadastroacidente/AcidentePassoDois.do?destino=PASSODOIS&acao=listar");
						System.out.println("esse mapping aqui 3");							
						return forward;																	

					}
				}
			}
			
			if(objAcidente != null){
				((AcidentePassoUmActionForm) form).setAposentado(objAcidente.getAposentado());
				((AcidentePassoUmActionForm) form).setArea(objAcidente.getArea());
				((AcidentePassoUmActionForm) form).setBairro(objAcidente.getBairro());
				((AcidentePassoUmActionForm) form).setCep(objAcidente.getCep());
				((AcidentePassoUmActionForm) form).setComplemento(objAcidente.getComplemento());
				((AcidentePassoUmActionForm) form).setCpf(objAcidente.getCpf());
				((AcidentePassoUmActionForm) form).setCtps(objAcidente.getCtps());
				((AcidentePassoUmActionForm) form).setDataEmissaoCTPS(objAcidente.getDataEmissaoCTPS());
				((AcidentePassoUmActionForm) form).setDataEmissaoRG(objAcidente.getDataEmissaoRG());
				((AcidentePassoUmActionForm) form).setDataNascimento(objAcidente.getDataNascimento());
				((AcidentePassoUmActionForm) form).setDocumento(objAcidente.getDocumento());					
				((AcidentePassoUmActionForm) form).setDdd(objAcidente.getDdd());
				((AcidentePassoUmActionForm) form).setEmitente(objAcidente.getEmitente()); 					
				((AcidentePassoUmActionForm) form).setEstado(objAcidente.getEstado());
				((AcidentePassoUmActionForm) form).setEstadoCivil(objAcidente.getEstadoCivil());
				((AcidentePassoUmActionForm) form).setEmpresa(objAcidente.getEmpresa());					
				((AcidentePassoUmActionForm) form).setMunicipio(objAcidente.getMunicipio());
				((AcidentePassoUmActionForm) form).setNome(objAcidente.getNome());
				((AcidentePassoUmActionForm) form).setNumero(objAcidente.getNumero());
				((AcidentePassoUmActionForm) form).setOcupacao(objAcidente.getOcupacao());
				((AcidentePassoUmActionForm) form).setPisPasepNit(objAcidente.getPisPasepNit());
				((AcidentePassoUmActionForm) form).setRazaoSocial(objAcidente.getRazaoSocial());
				((AcidentePassoUmActionForm) form).setRemuneracaoMensal(objAcidente.getRemuneracaoMensal());
				((AcidentePassoUmActionForm) form).setRg(objAcidente.getRg());
				((AcidentePassoUmActionForm) form).setRua(objAcidente.getRua());
				((AcidentePassoUmActionForm) form).setSerie(objAcidente.getSerie());
				((AcidentePassoUmActionForm) form).setSexo(objAcidente.getSexo());
				((AcidentePassoUmActionForm) form).setTelefone(objAcidente.getTelefone());
				((AcidentePassoUmActionForm) form).setTrabalhador(objAcidente.getTrabalhador());
				((AcidentePassoUmActionForm) form).setUfCTPS(objAcidente.getUfCTPS());
				((AcidentePassoUmActionForm) form).setUfRG(objAcidente.getUfRG());
				((AcidentePassoUmActionForm) form).setVinculoEmpregaticio(objAcidente.getVinculoEmpregaticio());	
				((AcidentePassoUmActionForm) form).setOrgaoExpedidorRG(objAcidente.getOrgaoExpedidorRG());
				((AcidentePassoUmActionForm) form).setNomeResponsavel(objAcidente.getNomeResponsavel());
			}
			

		} catch (Exception e) {

			e.printStackTrace();
			return mapping.findForward("erroDefault");
			// Report the error using the appropriate name and ID.
			//errors.add("name", new ActionError("id"));

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
		System.out.println("esse mapping aqui 5");
		return mapping.findForward("AcidentePassoUm");

	}
}
