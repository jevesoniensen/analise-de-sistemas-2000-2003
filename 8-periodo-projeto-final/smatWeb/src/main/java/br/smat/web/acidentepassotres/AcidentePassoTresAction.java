package br.smat.web.acidentepassotres;

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
import br.smat.ejb.acidente.Acidente;
import br.smat.web.obj.ObjAcidente;
import br.smat.web.obj.ObjAgenteCausador;
import br.smat.web.obj.ObjArea;
import br.smat.web.obj.ObjDiagnostico;
import br.smat.web.obj.ObjEmitente;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjEstadoCivil;
import br.smat.web.obj.ObjFonte;
import br.smat.web.obj.ObjLocalAtendimento;
import br.smat.web.obj.ObjLocalLesao;
import br.smat.web.obj.ObjMunicipio;
import br.smat.web.obj.ObjOcupacao;
import br.smat.web.obj.ObjTestemunha;
import br.smat.web.obj.ObjTipoAcidente;
import br.smat.web.obj.ObjTipoLocalAcidente;
import br.smat.web.obj.ObjVinculoEmpregaticio;

/**
 * @version 	1.0
 * @author
 */
public class AcidentePassoTresAction extends Action {

	/**
	* Constructor
	*/
	public AcidentePassoTresAction() {

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

			ObjAcidente	 objAcidente = (ObjAcidente) request.getSession().getAttribute("objAcidente");
			
			if(objAcidente != null){
				
				String permitido = objAcidente.getDestinoPermitido();
				
				if(permitido != null ){
				   if(!permitido.equalsIgnoreCase("PASSOTRES"))
				   		objAcidente = null;
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

			Vector 		 vTestemunhas = (Vector) request.getSession().getAttribute("vTestemunhas");
			
			if(vTestemunhas == null)
				vTestemunhas = new Vector();			
			
			String		 paginaAtual = (((AcidentePassoTresActionForm) form).getPaginaAtual());							
			String		 acao        = (((AcidentePassoTresActionForm) form).getAcao());				
			
			int 	acidente				=  ((AcidentePassoTresActionForm) form).getAcidente();
 			int	testemunha				=  ((AcidentePassoTresActionForm) form).getTestemunha();
			String 	nomeTestemunha			=  ((AcidentePassoTresActionForm) form).getNomeTestemunha(); 
			int 	estadoTestemunha		=  ((AcidentePassoTresActionForm) form).getEstadoTestemunha();
			int     municipioTestemunha	=  ((AcidentePassoTresActionForm) form).getMunicipioTestemunha(); 
			String  ruaTestemunha			=  ((AcidentePassoTresActionForm) form).getRuaTestemunha();
			String  bairroTestemunha		=  ((AcidentePassoTresActionForm) form).getBairroTestemunha();
			int	numeroTestemunha		=  ((AcidentePassoTresActionForm) form).getNumeroTestemunha();
			String  complementoTestemunha	=  ((AcidentePassoTresActionForm) form).getComplementoTestemunha();
			String  cepTestemunha			=  ((AcidentePassoTresActionForm) form).getCepTestemunha();
			String  telefoneTestemunha		=  ((AcidentePassoTresActionForm) form).getTelefoneTestemunha(); 	
			String  dddTestemunha	   		=  ((AcidentePassoTresActionForm) form).getDddTestemunha();			
			String	destino		 			=  (((AcidentePassoTresActionForm) form).getDestino());			
			int	index		 			=  (((AcidentePassoTresActionForm) form).getIndex());						
			
			((AcidentePassoTresActionForm) form).setPaginaAtual("PASSOTRES");			
			
			Collection  	colEstado				= ObjEstado.findAllEstados();
			Collection  	colMunicipioTestemunha	= null;	
			
			if(estadoTestemunha > 0)
				colMunicipioTestemunha = ObjMunicipio.findAllMunicipios(estadoTestemunha);						
						
			if(destino != null)		
				if(destino.equalsIgnoreCase("PASSOTRES"))
					destino = null;
				
			if(acao != null)			
			if(acao.equals("INSERIRTESTEMUNHA")){
				if(vTestemunhas.size() < 3){	
					vTestemunhas.add(new ObjTestemunha(vTestemunhas.size()+1,acidente,testemunha,nomeTestemunha,estadoTestemunha,municipioTestemunha,ruaTestemunha,bairroTestemunha,numeroTestemunha,complementoTestemunha,cepTestemunha,telefoneTestemunha,dddTestemunha));		
					((AcidentePassoTresActionForm) form).apagaDadosTestemunha();
				}
				acao = "LISTAR";
				destino = null;
			}
			else
			if(acao.equals("EXCLUIRTESTEMUNHA")){
				for(int i=0; i<vTestemunhas.size();i++){
					if(index == ((ObjTestemunha)vTestemunhas.elementAt(i)).getIndex()){
						vTestemunhas.removeElementAt(i);
						break;
					}						
				}
				((AcidentePassoTresActionForm) form).apagaDadosTestemunha();				
				acao = "LISTAR";
				destino = null;				
			}
			else			
			if(acao.equals("LIMPAR")){
				((AcidentePassoTresActionForm) form).apagaDadosTestemunha();				
				acao = "LISTAR";
				destino = null;				
			}	
					
			objAcidente.setVTestemunhas((ObjTestemunha[])vTestemunhas.toArray(new ObjTestemunha[0]));

			request.getSession().setAttribute("objAcidente"           ,objAcidente           );			
			request.getSession().setAttribute("colEstado"             ,colEstado             );
			request.getSession().setAttribute("colMunicipioTestemunha",colMunicipioTestemunha);		
			request.getSession().setAttribute("vTestemunhas"          ,vTestemunhas          );							
												
			((AcidentePassoTresActionForm) form).setDestino(null);			
			if(destino != null)
			if(destino.length() > 0){

				if(destino.equalsIgnoreCase("AVANCAR"))
					objAcidente.setDestinoPermitido("PASSOQUATRO");
				else
				if( destino.equalsIgnoreCase("VOLTAR"))
					objAcidente.setDestinoPermitido("PASSODOIS");								
				
				if(destino.equalsIgnoreCase("VOLTAR")){
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
					return forward;					
				}		
				else
				if(destino.equalsIgnoreCase("AVANCAR")){
					Collection colLocalAtendimento  = ObjLocalAtendimento.findAllLocaisAtendimento();
					Collection colDiagnostico		= ObjDiagnostico.findAllDiagnosticos(); 
					Collection colFonte				= ObjFonte.findAllFontes();
					
					request.getSession().setAttribute("objAcidente"        ,objAcidente        );			
					request.getSession().setAttribute("colLocalAtendimento",colLocalAtendimento);
					request.getSession().setAttribute("colDiagnostico"     ,colDiagnostico     );
					request.getSession().setAttribute("colEstado"          ,colEstado          );
					request.getSession().setAttribute("colFonte"           ,colFonte           );
													
					forward.setName("PASSOQUATRO_");
					forward.setPath("./cadastroacidente/AcidentePassoQuatro.do?destino=PASSOQUATRO&acao=listar");							
					return forward;														
					
				}	
				
				return mapping.findForward(destino);				
			}

		} catch (Exception e) {

			e.printStackTrace();
			return mapping.findForward("erroDefault");
		}

		if (!errors.empty()) {
			saveErrors(request, errors);
		} else {
		}

		// Finish with
		return mapping.findForward("AcidentePassoTres");

	}
}
