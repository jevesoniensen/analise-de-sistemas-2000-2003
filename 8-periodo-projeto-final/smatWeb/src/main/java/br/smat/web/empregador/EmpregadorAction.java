package br.smat.web.empregador;

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
import br.smat.ejb.empregador.Empregador;
import br.smat.ejb.estado.Estado;
import br.smat.ejb.tipoempregador.TipoEmpregador;
import br.smat.objetosauxiliares.auxempregador.AuxEmpregador;
import br.smat.objetosauxiliares.generico.Generico;
import br.smat.util.FuncoesComuns;
import br.smat.web.obj.ObjEmpregador;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjMunicipio;
import br.smat.web.obj.ObjRamoAtividade;
import br.smat.web.obj.ObjRegional;
import br.smat.web.obj.ObjTipoEmpregador;

/**
 * @version 	1.0
 * @author
 */
public class EmpregadorAction extends Action {

	/**
	* Constructor
	*/
	public EmpregadorAction() {

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
		// return value

		try {

			String	acao		 = (((EmpregadorActionForm) form).getAcao());
			
			if(acao != null)
			if(acao.equals("ZERARSESSAO")){
				((EmpregadorActionForm) form).apaga();
				acao = "LISTAR";
			}
			
			ObjEmpregador     objEmpregador 	= new ObjEmpregador();


			int 	ramoSuperior = (((EmpregadorActionForm) form).getRamoSuperior());
			int	estado		 = (((EmpregadorActionForm) form).getEstado());			
			int	empregador	 = (((EmpregadorActionForm) form).getEmpregador());			
			String	destino		 = (((EmpregadorActionForm) form).getDestino());	
			String	documento 		= (((EmpregadorActionForm) form).getDocumento());			
			
			int municipio = 0;
					
			String 	erroBanco    = null;
			
			System.out.println("Destino " + destino);
			
			int	tipoEmpregador  = (((EmpregadorActionForm) form).getTipoEmpregador());			
			
			if(destino != null && destino.equalsIgnoreCase("BOTAORETORNAR")){								
				if(destino.length() > 0){
					((EmpregadorActionForm) form).setDestino("BOTAORETORNAR");
					request.getSession().setAttribute("destinoSession",destino);					
				}
				else
					request.getSession().removeAttribute("destinoSession");					
			}
			else
				request.getSession().removeAttribute("destinoSession");	

		
			
			if(acao != null){			
				
				int	ramoAtividade   = (((EmpregadorActionForm) form).getRamoAtividade());
				  		municipio       = (((EmpregadorActionForm) form).getMunicipio());
				String	razaoSocial		= (((EmpregadorActionForm) form).getRazaoSocial());
				int	numero 			= (((EmpregadorActionForm) form).getNumero());
				String	rua				= (((EmpregadorActionForm) form).getRua());
				String	bairro 			= (((EmpregadorActionForm) form).getBairro());
				String	cep				= (((EmpregadorActionForm) form).getCep());
				String	complemento		= (((EmpregadorActionForm) form).getComplemento());					
				
				System.out.println("Excluir " + acao);
					
				if(acao.equals("GRAVAR")){

					try{
						objEmpregador.armazena( empregador,
									             			ramoAtividade,
												            municipio,
															tipoEmpregador,
															razaoSocial,
															FuncoesComuns.setNullSeVazio(documento),
															numero,
															rua,
															bairro,
															cep,
															complemento);
					}catch(Exception e){
						erroBanco = "Erro ao gravar o empregador!";
					}

					if(erroBanco == null){
						erroBanco = "Empregador gravado com sucesso!";
						((EmpregadorActionForm) form).setEmpregador(objEmpregador.getEmpregador());
					}					

					
				}
				else
				if(acao.equals("EXCLUIR")){
					
					if(empregador != 0){
						System.out.println("Empregador " +  empregador);
						try{
							objEmpregador.remove(empregador);
						}catch(Exception e){
							erroBanco = "Não foi possível excluir o empregador!";
						}
	
						if(erroBanco == null){
							erroBanco = "Empregador excluído com sucesso!";
							request.getSession().removeAttribute("empregadorBean");
							request.getSession().removeAttribute("colMunicipio");
							System.out.println("estado => " + estado);
							System.out.println("municipio => " + municipio);
							System.out.println("ramoSuperior => " + ramoSuperior);
							municipio = 0;
							estado = 0;
							ramoSuperior = 0;
							((EmpregadorActionForm) form).apaga();
						}
					}else
						erroBanco = "É necessário selecionar um empregador para que ele possa ser excluído!";
				}
				else
				if(acao.equalsIgnoreCase("PREENCHEFORM")){
					
					if(empregador > 0){
						
						Empregador e = objEmpregador.findByPrimaryKey(empregador);
						
						//((EmpregadorActionForm) form).setRamoAtividade(e.getRamoAtividade().ramoAtividade);
						municipio = e.getMunicipio().municipio;
						
						((EmpregadorActionForm) form).setTipoEmpregador(e.getTipoEmpregador().tipoEmpregador);
						((EmpregadorActionForm) form).setRazaoSocial(e.getRazaoSocial());
						
						documento = e.getDocumento();
	
						((EmpregadorActionForm) form).setNumero(e.getNumero());
						((EmpregadorActionForm) form).setRua(e.getRua());
						((EmpregadorActionForm) form).setBairro(e.getBairro());
						((EmpregadorActionForm) form).setCep(e.getCep());
	
						((EmpregadorActionForm) form).setEstado(e.getKeyEstado());
						
						estado = e.getKeyEstado();
						
						if(e.getComplemento() != null)
							((EmpregadorActionForm) form).setComplemento(e.getComplemento());										
						
						if(e.getRamoAtividade().ramoAtividade > 0)
							ramoSuperior = ObjRamoAtividade.findByPrimaryKey(e.getRamoAtividade().ramoAtividade).getRamoSuperior().ramoAtividade;
						
						((EmpregadorActionForm) form).setRamoSuperior(ramoSuperior);	
						((EmpregadorActionForm) form).setRamoAtividade(e.getRamoAtividade().ramoAtividade);											
					}
					acao = null;
					((EmpregadorActionForm) form).setAcao(null);
				}									
			}
		
			String tipoDoc = "";
			
			if(tipoEmpregador > 0){
				TipoEmpregador t = ObjTipoEmpregador.findByPrimaryKey(tipoEmpregador);			
				
				System.out.println("tipodoc " + t.getDocIdentificador());
				request.removeAttribute("DOCCPF");
				request.removeAttribute("DOCCNPJ");
								
				if(t.getDocIdentificador() != null){
					if(t.getDocIdentificador().trim().equalsIgnoreCase("CPF"))
						tipoDoc = "CPF";
					else
					if(t.getDocIdentificador().trim().equalsIgnoreCase("CNPJ")){
						tipoDoc = "CNPJ";
					}
				}				
			}
			
			String auxTipoEmpregador = (String)request.getSession().getAttribute("AuxTipoEmpregador");				
			
			if(auxTipoEmpregador != null)
			if(!auxTipoEmpregador.equalsIgnoreCase(tipoDoc)){
				((EmpregadorActionForm) form).setDocumento("");				
			}
			
			if(documento!= null)
					((EmpregadorActionForm) form).setDocumento(documento);		
			
			
			
			request.setAttribute("TIPODOCEMP",tipoDoc);
			
				
			//Collection 	colEmpregadores 	 = objEmpregador.findAllEmpredadores();			
			
			AuxEmpregador[]	auxEmpregadors		 = ObjGenerico.listEmpregadores();	
			Collection  	colTipoEmpregadores  = ObjTipoEmpregador.findAllTiposEmpredadores();
			Collection  	colRamosSuperiores   = ObjRamoAtividade.findAllRamosAtividade(0);						
			Collection  	colEstado			 = ObjEstado.findAllEstados();
			Collection  	colMunicipio		 = null;			
			Collection  	colRamosAtividade    = null;
			
			if(ramoSuperior > 0)
				colRamosAtividade = ObjRamoAtividade.findAllRamosAtividade(ramoSuperior);
				
			if(estado > 0)
				colMunicipio = ObjMunicipio.findAllMunicipios(estado);
			
			System.out.println("municipio  " + municipio);		
			if(municipio > 0)	
				((EmpregadorActionForm) form).setMunicipio(municipio);	
				
			request.getSession().setAttribute("AuxTipoEmpregador",tipoDoc);																
			request.getSession().setAttribute("auxEmpregadors",auxEmpregadors);
			request.getSession().setAttribute("colTipoEmpregadores",colTipoEmpregadores);
			request.getSession().setAttribute("colRamosSuperiores",colRamosSuperiores);
			request.getSession().setAttribute("colRamosAtividade",colRamosAtividade);
			request.getSession().setAttribute("colEstado",colEstado);
			request.getSession().setAttribute("colMunicipio",colMunicipio);
			
			System.out.println("MSG DO BANCO => " + erroBanco);
			request.setAttribute("erroBanco",erroBanco);				
			
			//if(empregador > 0)        
			///	request.getSession().setAttribute("BOTAOTELEFONE","BOTAOTELEFONE");
			//else
			///	request.getSession().removeAttribute("BOTAOTELEFONE");
							
			((EmpregadorActionForm) form).setAcao("LISTAR");	
			
		} catch (Exception e) {

			// Report the error using the appropriate name and ID.
			e.printStackTrace();
			return mapping.findForward("erroDefault");
		}


		// Finish with
		return mapping.findForward("Empregador");

	}
}
