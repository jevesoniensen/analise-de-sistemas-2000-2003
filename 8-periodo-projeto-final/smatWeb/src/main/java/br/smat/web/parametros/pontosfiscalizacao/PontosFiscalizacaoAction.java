package br.smat.web.parametros.pontosfiscalizacao;

import java.io.IOException;
import java.sql.Struct;
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
import br.smat.objetosauxiliares.auxpontofiscalizacaoramoatividade.AuxPontoFiscalizacaoRamoAtividade;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjPontoFiscalizacao;
import br.smat.web.obj.ObjRamoAtividade;
import br.smat.web.relatorio.GeraRelatorio;

/**
 * @version 	1.0
 * @author
 */
public class PontosFiscalizacaoAction extends Action {

	/**
	* Constructor
	*/
	public PontosFiscalizacaoAction() {

		super();

	}
	public ActionForward perform(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws IOException, ServletException {

		ActionErrors errors = new ActionErrors();
		
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

		try {
			
			String auxTabela = null;
			Collection 	objRamoAtividade = null;			
			Collection objRamoSuperior  = ObjRamoAtividade.findAllRamosAtividade(0);			
			
			if(form != null){

			String 	acao					 	= ((PontosFiscalizacaoActionForm)form).getAcao();
			
			if(acao != null)
			if(acao.equals("ZERARSESSAO")){
				((PontosFiscalizacaoActionForm)form).apaga();
				acao = "LISTAR";
			}
			
			AuxPontoFiscalizacaoRamoAtividade[] auxPontoFiscalizacaoRamoAtividade = null;
			
			int 	ramoSuperior				= ((PontosFiscalizacaoActionForm)form).getRamoSuperior();
			int 	filtroPontosFiscalizacao 	= ((PontosFiscalizacaoActionForm)form).getFiltroPontosFiscalizacao();			
			int	pontoFiscalizacao			= ((PontosFiscalizacaoActionForm)form).getPontoFiscalizacao();
			int	ramoAtividade				= ((PontosFiscalizacaoActionForm)form).getRamoAtividade();
			String	descricao					= ((PontosFiscalizacaoActionForm)form).getDescricao();
			String	nome						= ((PontosFiscalizacaoActionForm)form).getNome();
				
			if(acao != null && acao.equals("GRAVAR")){
				
				try {
					ObjPontoFiscalizacao pf = new ObjPontoFiscalizacao(pontoFiscalizacao,nome,descricao,ramoAtividade);
					pf.save();
					
					if(pontoFiscalizacao == 0)
						mensagem = "Ponto de fiscalização incluido com sucesso!";
					else
						mensagem = "Ponto de fiscalização alterado com sucesso!";
						
					filtroPontosFiscalizacao = ramoSuperior;
					
					ramoSuperior =0;
					((PontosFiscalizacaoActionForm)form).apaga();
					ramoAtividade = 0;
					((PontosFiscalizacaoActionForm)form).setFiltroPontosFiscalizacao(filtroPontosFiscalizacao);	
					
				} catch (Exception e) {
					mensagem = "Erro ao incluir o Ponto de fiscalização!";
				}
				
			}
			else
			if(acao != null && acao.equals("EXCLUIR")){
				
				try {
					if(pontoFiscalizacao > 0){
						ObjPontoFiscalizacao.remove(pontoFiscalizacao);
						((PontosFiscalizacaoActionForm)form).apaga();					
						((PontosFiscalizacaoActionForm)form).setFiltroPontosFiscalizacao(ramoSuperior);											
						mensagem = "Ponto de fiscalização excluido com sucesso!";
						ramoSuperior = 0;
					}
					else
						mensagem = "É necessário selecionar um Ponto de fiscalização!";		
				} catch (Exception e) {
					mensagem = "Erro ao excluir o Ponto de fiscalização!";
				}						
			}

			if(ramoSuperior >0)
				objRamoAtividade = ObjRamoAtividade.findAllRamosAtividade(ramoSuperior);
			
			auxPontoFiscalizacaoRamoAtividade = ObjGenerico.listPontoFiscalizacaoRamoAtividade(filtroPontosFiscalizacao);
			
			auxTabela = imprimeTabela(auxPontoFiscalizacaoRamoAtividade,filtroPontosFiscalizacao);
			
			}
			
			request.getSession().setAttribute("objRamoSuperior"  ,objRamoSuperior);
			request.getSession().setAttribute("objRamoAtividade" ,objRamoAtividade);
			request.getSession().setAttribute("auxTabela"        ,auxTabela);
			request.setAttribute("mensagem",mensagem);

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
		return mapping.findForward("PontosFiscalizacao");

	}
	
	public String imprimeTabela(AuxPontoFiscalizacaoRamoAtividade[] apfr,int ramoSuperior){
		
		String 	tabela 	 = null;
		int	lastRamo = 0;
		
		if(apfr.length > 0)
		  tabela = "";
		
		for(int i=0;i<apfr.length;i++){
											
		    if(lastRamo == 0 || lastRamo != apfr[i].ramoAtividade){
		    	
		    	if(!tabela.equalsIgnoreCase("")){
		    	  tabela += "</tbody></table>";
		  	      tabela += "</td></tr>";		    	  
		    	}
		    	
		    	tabela += "<tr><th align='center'  bgcolor='#C0C0C0'>"+apfr[i].getNomeRamoAtividade()+"</th></tr>";
		    	tabela += "<tr><td><table border='1' width='100%' bordercolor='#666666'><tbody>";
  			    tabela += "<tr><td><LABEL>Nº</LABEL></td><td><LABEL>Nome</LABEL></td></tr>";
		    }
		    
		    tabela += "<tr><td width=\"10\">";	
		    tabela += "<a href='javascript:preencheForm("+apfr[i].getPontoFiscalizacao();
		    tabela += ",\""+apfr[i].getNomePontoFiscalizacao()+"\",\""+apfr[i].getDescricao();
		    tabela += "\","+apfr[i].ramoAtividade+","+ramoSuperior+")'>";		    
		    tabela += apfr[i].getPontoFiscalizacao()+"</a>";
		    tabela += "</td><td>"; 
		    tabela += "<a href='javascript:preencheForm("+apfr[i].getPontoFiscalizacao();
		    tabela += ",\""+apfr[i].getNomePontoFiscalizacao()+"\",\""+apfr[i].getDescricao();
		    tabela += "\","+apfr[i].ramoAtividade+","+ramoSuperior+")'>";		    		    
		    tabela += apfr[i].getNomePontoFiscalizacao()+"</a>";
		    tabela += "</td></tr>";

    		lastRamo = apfr[i].getRamoAtividade();
		}
		
		if(apfr.length > 0){
	    	tabela += "</tbody></table>";
			tabela += "</td></tr>";		    	  		
		}
				
		return tabela;
	}
}
