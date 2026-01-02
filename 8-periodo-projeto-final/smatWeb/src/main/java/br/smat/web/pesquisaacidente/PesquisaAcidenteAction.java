package br.smat.web.pesquisaacidente;

import java.io.IOException;
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
import br.smat.objetosauxiliares.auxpesquisaacidente.AuxPesquisaAcidente;
import br.smat.web.obj.ObjArea;
import br.smat.web.obj.ObjDiagnostico;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjFonte;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjMunicipio;
import br.smat.web.obj.ObjPagina;
import br.smat.web.obj.ObjRegional;
import br.smat.web.obj.ObjTipoAcidente;

/**
 * @version 	1.0
 * @author
 */
public class PesquisaAcidenteAction extends Action {

	/**
	* Constructor
	*/
	public PesquisaAcidenteAction() {

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

		String acao						= (((PesquisaAcidenteActionForm) form).getAcao());
		
		if(acao != null)
		if(acao.equals("ZERARSESSAO")){
			((PesquisaAcidenteActionForm) form).apapa();
			acao = "LISTAR";
		}
		
		request.getSession().removeAttribute("objAcidente");

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward();
		// return value
		int estado					 	= (((PesquisaAcidenteActionForm) form).getEstado());
		int regional					= (((PesquisaAcidenteActionForm) form).getRegional());
		int municipio					= (((PesquisaAcidenteActionForm) form).getMunicipio());
		String dataInicial				= (((PesquisaAcidenteActionForm) form).getDataInicial());
		String dataFinal				= (((PesquisaAcidenteActionForm) form).getDataFinal());
		String amputacao				= (((PesquisaAcidenteActionForm) form).getAmputacao());
		String obito					= (((PesquisaAcidenteActionForm) form).getObito());
		String registroPolicial			= (((PesquisaAcidenteActionForm) form).getRegistroPolicial());
		String internacao				= (((PesquisaAcidenteActionForm) form).getInternacao());
		int tipoAcidente				= (((PesquisaAcidenteActionForm) form).getTipoAcidente());
		int diagnostico				= (((PesquisaAcidenteActionForm) form).getDiagnostico());
		int fonte						= (((PesquisaAcidenteActionForm) form).getFonte());
		int area						= (((PesquisaAcidenteActionForm) form).getArea());
		


			
		Vector colEstado = null;
		Vector colRegional = null;
		Vector colMunicipio = null;
		Vector colTipoAcidente = null;
		Vector colDiagnostico = null;
		Vector colFonte = null;
		Vector colArea = null;
		String[] linha = null;

		try {

			
			colTipoAcidente = new Vector(ObjTipoAcidente.findAllTiposAcidente());
			colDiagnostico = new Vector(ObjDiagnostico.findAllDiagnosticos());
			colFonte = new Vector(ObjFonte.findAllFontes());
			colArea = new Vector(ObjArea.findAllAreas());
			
			colEstado = new Vector(ObjEstado.findAllEstados());
			
			if(estado != 0){
				colRegional = new Vector(ObjRegional.findAllRegionais(estado));
				
				if(regional != 0)
					colMunicipio = new Vector(ObjMunicipio.findAllMunicipiosByRegional(regional));
				else
					colMunicipio = new Vector(ObjMunicipio.findAllMunicipios(estado));
			}
			
			
			
			
			
			

			request.getSession().setAttribute("colEstado",colEstado);
			request.getSession().setAttribute("colRegional",colRegional);
			request.getSession().setAttribute("colMunicipio",colMunicipio);
			request.getSession().setAttribute("colTipoAcidente",colTipoAcidente);
			request.getSession().setAttribute("colDiagnostico",colDiagnostico);
			request.getSession().setAttribute("colFonte",colFonte);
			request.getSession().setAttribute("colArea",colArea);
			
			
			if(acao != null)
				if(acao.equals("CONSULTAR")){
				
					linha = montaTelaPesquisa(ObjGenerico.pesquisaAcidente(estado,
												 regional,
												 municipio,
												 amputacao,
												 obito,
												 registroPolicial,
												 internacao,
												 tipoAcidente,
												 diagnostico,
												 fonte,
												 area,
												 dataInicial,
												 dataFinal));

					request.getSession().removeAttribute("colEstado");
					request.getSession().removeAttribute("colRegional");
					request.getSession().removeAttribute("colMunicipio");
					request.getSession().removeAttribute("colTipoAcidente");
					request.getSession().removeAttribute("colDiagnostico");
					request.getSession().removeAttribute("colFonte");
					request.getSession().removeAttribute("colArea");
				//	request.getSession().removeAttribute("objAcidente");


					request.getSession().setAttribute("linha",linha);

					/****************************
					 * 							*
					 * 		Permissão 			*	
					 *							* 
					 * **************************/
							
							request.removeAttribute("permissaoPagina");
									
							if(usuario != null){
								
								try{
									request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,20));//20 - ResultadoPesquisa.do
								}
								catch(Exception e){
								}
							}
					/***************************
					 ***************************/
					
					return mapping.findForward("ResultadoPesquisa");
				}					

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
		return mapping.findForward("PesquisaAcidente");
	}
	
	private String[] montaTelaPesquisa(AuxPesquisaAcidente[] auxPesquisa){
		
		if(auxPesquisa == null)
			return null;
			
		String lastLinhaLocal="",auxLinhaLocal="";
		String lastLinhaTipoAcidente="",auxLinhaTipoAcidente="";
		String lastLinhaDataAcidente="",auxLinhaDataAcidente="";
		String detalhe="";


		Vector linha = new Vector();
		
		for(int i=0;i<auxPesquisa.length;i++){
		
			auxLinhaLocal = auxPesquisa[i].getNomeEstado() + " >> " + auxPesquisa[i].getNomeRegional() + " >> " + auxPesquisa[i].getNomeMunicipio() + " >> " + auxPesquisa[i].getNomeArea();
				
			if(!lastLinhaLocal.equals(auxLinhaLocal)){
				lastLinhaLocal = auxLinhaLocal;
				linha.add("<TD colspan=9><B><LABEL>"+auxLinhaLocal+"</LABEL></B></TD>");
			}
			
			auxLinhaTipoAcidente = 	auxPesquisa[i].getNomeTipoAcidente() + " >> " +	auxPesquisa[i].getNomeDiagnostico();
			
			if(!lastLinhaTipoAcidente.equals(auxLinhaTipoAcidente)){
				lastLinhaTipoAcidente = auxLinhaTipoAcidente;
				linha.add("<TD colspan=9><B><LABEL>"+auxLinhaTipoAcidente+"</LABEL></B></TD>");
				linha.add("<TD>&nbsp;</TD><TD><B><LABEL>Nº</LABEL></B></TD><TD><B><LABEL>Data</LABEL></B></TD><TD><B><LABEL>Trabalhador</LABEL></B></TD><TD><B><LABEL>Óbito</LABEL></B></TD><TD><B><LABEL>Amputação</LABEL></B></TD><TD><B><LABEL>Registro Policial</LABEL></B></TD><TD><B><LABEL>Internação</LABEL></B></TD><TD><B><LABEL>Fonte</LABEL></B></TD>");
			}

			auxLinhaDataAcidente = auxPesquisa[i].getDataAcidente();

/*			if(!lastLinhaDataAcidente.equals(auxLinhaDataAcidente)){
				lastLinhaDataAcidente = auxLinhaDataAcidente;
				linha.add("<TD colspan=8><B>Data do acidente:</B>"+auxLinhaDataAcidente+"</TD>");
				linha.add("<TD>&nbsp;</TD><TD><B>Nº</B></TD><TD><B>Trabalhador</B></TD><TD><B>Óbito</B></TD><TD><B>Amputação</B></TD><TD><B>Registro Policial</B></TD><TD><B>Internação</B></TD><TD><B>Fonte</B></TD>");

			}*/
			
			detalhe = "<TD><INPUT TYPE=\"Radio\" NAME=\"acidente\" VALUE=\"" + auxPesquisa[i].getAcidente() + "\"></TD><TD><LABEL>"+auxPesquisa[i].getAcidente()+"</LABEL></TD><TD><LABEL>"+auxPesquisa[i].getDataAcidente()+"</LABEL></TD><TD><LABEL>"+auxPesquisa[i].getNomeTrabalhador()+"</LABEL></TD><TD><LABEL>"+auxPesquisa[i].getObito()+"</LABEL></TD><TD><LABEL>"+auxPesquisa[i].getAmputacao()+"</LABEL></TD><TD><LABEL>"+auxPesquisa[i].getRegistroPolicial()+"</LABEL></TD><TD><LABEL>"+auxPesquisa[i].getInternacao()+"</LABEL></TD><TD><LABEL>"+auxPesquisa[i].getNomeFonte()+"</LABEL></TD>";
			
			linha.add(detalhe);
			
		}
		
		return (String[])linha.toArray(new String[0]);
	}
}
