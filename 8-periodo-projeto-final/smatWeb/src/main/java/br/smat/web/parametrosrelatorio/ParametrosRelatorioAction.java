package br.smat.web.parametrosrelatorio;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.Iterator;
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
import br.smat.ejb.campo.Campo;
import br.smat.ejb.municipio.Municipio;
import br.smat.ejb.regional.Regional;
import br.smat.objetosauxiliares.auxcampo.AuxCampo;
import br.smat.relatorio.Relatorio;
import br.smat.web.obj.ObjEstado;
import br.smat.web.obj.ObjMunicipio;
import br.smat.web.obj.ObjPagina;
import br.smat.web.obj.ObjRegional;
import br.smat.web.obj.ObjCampo;
import br.smat.web.relatorio.GeraRelatorio;

import br.smat.util.FuncoesComuns;

/**
 * @version 	1.0
 * @author
 */
public class ParametrosRelatorioAction extends Action {

	/**
	* Constructor
	*/
	public ParametrosRelatorioAction() {

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
			
								
		try {

			String acao = null;
			GeraRelatorio geraRel = null,aux=null;
			int relatorio=0;

			acao = (((ParametrosRelatorioActionForm) form).getAcao());

		
			int estado					 	= (((ParametrosRelatorioActionForm) form).getEstado());
			int[] regional				 	= (((ParametrosRelatorioActionForm) form).getRegional());
			int[] regionalSelected 	 	= (((ParametrosRelatorioActionForm) form).getRegionalSelected());
			int[] municipio	     	 	= (((ParametrosRelatorioActionForm) form).getMunicipio());
			int[] municipioSelected  	 	=  (((ParametrosRelatorioActionForm) form).getMunicipioSelected());
			int campo1      			 	= (((ParametrosRelatorioActionForm) form).getCampo1());
			int campo2     			 	= (((ParametrosRelatorioActionForm) form).getCampo2());
			int[] registroCampo1 		 	= (((ParametrosRelatorioActionForm) form).getDadoscampo1());
			int[] registroCampo1Selected 	= (((ParametrosRelatorioActionForm) form).getDadosCampo1Selected());
			int[] registroCampo2 			= (((ParametrosRelatorioActionForm) form).getDadoscampo2());
			int[] registroCampo2Selected 	= (((ParametrosRelatorioActionForm) form).getDadosCampo2Selected());			
			int periodicidade 				= (((ParametrosRelatorioActionForm) form).getPeriodicidade());
			String mesAnoInicial 			= (((ParametrosRelatorioActionForm) form).getMesAnoInicial());
			String mesAnoFinal 				= (((ParametrosRelatorioActionForm) form).getMesAnoFinal());
			int anoInicial				= (((ParametrosRelatorioActionForm) form).getAnoInicial());
			int anoFinal				= (((ParametrosRelatorioActionForm) form).getAnoFinal());
			String agrupamento 				= (((ParametrosRelatorioActionForm) form).getAgrupamento());
			String titulo 					= (((ParametrosRelatorioActionForm) form).getTitulo());
			String texto 					= (((ParametrosRelatorioActionForm) form).getTexto());
			Vector colEstado = new Vector(ObjEstado.findAllEstados());
			Vector colRegional	= null;			
			Vector colRegionalSelected	= (Vector)request.getSession().getAttribute("colRegionalSelected");
			Vector colMunicipio	= null;
			Vector colMunicipioSelected	= (Vector)request.getSession().getAttribute("colMunicipioSelected");
			Vector colCampo1	= new Vector(ObjCampo.ejbFindAllCampos());
			Vector colCampo2	= new Vector(ObjCampo.ejbFindAllCampos(campo1));
			Vector colRegCampo1 = null;
			Vector colRegCampo1Selected = null;
			Vector colRegCampo2 = null;
			Vector colRegCampo2Selected = null;			
			AuxCampo[] aRegCampo1 = null;
			AuxCampo[] aRegCampo1Selected = (AuxCampo[])request.getSession().getAttribute("aRegCampo1Selected");
			AuxCampo[] aRegCampo2 = null;
			AuxCampo[] aRegCampo2Selected = (AuxCampo[])request.getSession().getAttribute("aRegCampo2Selected");
			

			Regional regAux = null;

			if(periodicidade != 0)
				request.getSession().setAttribute("tipoperiodo",String.valueOf(periodicidade));
			else
				request.getSession().removeAttribute("tipoperiodo");

			
			if(agrupamento != null){
			
				if(agrupamento.equals("2")){
					if(estado > 0 )
						colRegional = new Vector(ObjRegional.findAllRegionais(estado));
					else
						regional = null;
				}
				else
					colRegional = null;
					
				if(agrupamento.equals("3")){
					if(estado > 0)
						colMunicipio = new Vector(ObjMunicipio.findAllMunicipios(estado));
				}
				else
					colMunicipio = null;
			}
			else
			{
				colMunicipio = null;
				colRegional = null;
			}
			if(campo1 > 0) 
				aRegCampo1 = ObjCampo.getRegistros(campo1);
				
			
			if(campo2 > 0)
				aRegCampo2 = ObjCampo.getRegistros(campo2);

			if(aRegCampo1 != null)
				colRegCampo1 = toVector(aRegCampo1);

			if(aRegCampo1Selected != null)
				colRegCampo1Selected = toVector(aRegCampo1Selected);

			if(aRegCampo2 != null)
				colRegCampo2 = toVector(aRegCampo2);

			if(aRegCampo2Selected != null)
				colRegCampo2Selected = toVector(aRegCampo2Selected);							


			
			if(acao != null){
				if(acao.equals("ADDREGIONAL"))
					colRegionalSelected = add(colRegional,colRegionalSelected,regional);
				else
					if(acao.equals("DELREGIONAL"))
						del(colRegionalSelected,regionalSelected);
					else
						if(acao.equals("ADDMUNICIPIO"))
							colMunicipioSelected = add(colMunicipio,colMunicipioSelected,municipio);
						else
							if(acao.equals("DELMUNICIPIO"))
								del(colMunicipioSelected,municipioSelected);
							else
								if(acao.equals("ADDCAMPO1"))
									colRegCampo1Selected = add(colRegCampo1,colRegCampo1Selected,registroCampo1);
								else
									if(acao.equals("DELCAMPO1"))
										del(colRegCampo1Selected,registroCampo1Selected);
									else
										if(acao.equals("ADDCAMPO2"))
											colRegCampo2Selected = add(colRegCampo2,colRegCampo2Selected,registroCampo2);
										else
											if(acao.equals("DELCAMPO2"))
												del(colRegCampo2Selected,registroCampo2Selected);										
									
			}	
			
			
			if(colRegionalSelected != null)
		 		if(colRegional != null)
					colRegional.removeAll(colRegionalSelected);

			if(colMunicipioSelected != null)
				if(colMunicipio != null)
						colMunicipio.removeAll(colMunicipioSelected);

			if(agrupamento !=null)
			if(agrupamento.equals("1")){
				colMunicipioSelected = null;
				colRegionalSelected = null;
			}
			else
				if(agrupamento.equals("2")){
					colMunicipioSelected = null;
				}
				else
					if(agrupamento.equals("3"))
						colRegionalSelected = null;
						
			if(colRegCampo1Selected != null){
				aRegCampo1Selected = (AuxCampo[])colRegCampo1Selected.toArray(new AuxCampo[0]);				
				if(colRegCampo1 != null){
					colRegCampo1.removeAll(colRegCampo1Selected);
					aRegCampo1 = (AuxCampo[])colRegCampo1.toArray(new AuxCampo[0]);
				}
			}

			if(colRegCampo2Selected != null){
				aRegCampo2Selected = (AuxCampo[])colRegCampo2Selected.toArray(new AuxCampo[0]);				
				if(colRegCampo2 != null){
					colRegCampo2.removeAll(colRegCampo2Selected);
					aRegCampo2 = (AuxCampo[])colRegCampo2.toArray(new AuxCampo[0]);
				}
			}

			Relatorio rel = null;
			
			request.getSession().removeAttribute("visualizaRelatorio");
			//request.getSession().removeAttribute("relatorio");
			// Finish with
			String erroBanco = null;

			if(acao != null){
				if(acao.equals("GRAVAR") || acao.equals("SALVAR"))
				{ 
					String dataInicial = null,dataFinal= null;
	
					if(periodicidade ==1){
						dataInicial = "01/" + mesAnoInicial;
						dataFinal   = FuncoesComuns.adicionaUltimoDiaNaData(mesAnoFinal);
					}
					else
						if(periodicidade == 2){
							dataInicial = "01/01/" + anoInicial;
							dataFinal	= "31/12/" + anoFinal;
						}
	
					geraRel = (GeraRelatorio)request.getSession().getAttribute("geraRelatorio");
					
					if(geraRel != null){
						geraRel.setDataInicial(dataInicial);
						geraRel.setDataFinal(dataFinal);
						geraRel.setAgrupamento(agrupamento);
						geraRel.setEstado(estado);
						geraRel.setRegional(toArrayInt(colRegionalSelected));
						geraRel.setMunicipio(toArrayInt(colMunicipioSelected));
						geraRel.setCampo1(campo1);
						geraRel.setDadosCampo1(toArrayInt(colRegCampo1Selected));
						geraRel.setCampo2(campo2);
						geraRel.setDadosCampo2(toArrayInt(colRegCampo2Selected));
						geraRel.setTitulo(titulo);
						geraRel.setTexto(texto);
					}else{
						geraRel = new GeraRelatorio(periodicidade,
						dataInicial,
						dataFinal,				
						agrupamento,
						estado,
						toArrayInt(colRegionalSelected),
						toArrayInt(colMunicipioSelected),
						campo1,
						toArrayInt(colRegCampo1Selected),
						campo2,
						toArrayInt(colRegCampo2Selected),
						titulo,
						texto);
					}
				
					request.getSession().setAttribute("geraRelatorio",geraRel);
					
				/*	request.getSession().removeAttribute("colRegionalSelected");
					request.getSession().removeAttribute("colMunicipioSelected");
					request.getSession().removeAttribute("aRegCampo1Selected");
					request.getSession().removeAttribute("aRegCampo2Selected");
					((ParametrosRelatorioActionForm) form).apagaTudo();*/
					
					if(acao.equals("GRAVAR")){

/****************************
 * 							*
 * 		Permissão Relatório *	
 *							* 
 * **************************/			

		if(usuario != null){
					pagina = ObjPagina.validaPermissaoPagina(usuario,8);//8 - relatorio.jsp

					request.removeAttribute("permissaoPagina");
					
					if(pagina != null)
						request.setAttribute("permissaoPagina",pagina);
					else
						return mapping.findForward("AccessDenied");
		}
		else
			return mapping.findForward("LoginInit");
/***************************
 ***************************/
						
						request.getSession().removeAttribute("relatorio");
						rel = geraRel.geraRelatorio();				
						request.getSession().setAttribute("relatorio",rel);
						request.getSession().setAttribute("visualizaRelatorio","visualizaRelatorio");
					}else{
						
						try{
							geraRel.save();
						}catch(Exception e){
							erroBanco = "Erro ao salvar o relatório!";
						}
						
						if(erroBanco  == null){
							erroBanco = "Relatório salvo com sucesso!";
							request.getSession().setAttribute("geraRelatorio",geraRel);
						}
					}
						
				}
				else
				if(acao.equals("LIMPAR") || acao.equals("NOVO")){
					System.out.println("ENTROU LA NO NOVO");
					colRegional = null;
					colRegionalSelected = null;
					colMunicipio = null;
					colMunicipioSelected = null;
					aRegCampo1 = null;
					aRegCampo1Selected = null;
					aRegCampo2 = null;
					aRegCampo2Selected = null;
					request.getSession().removeAttribute("tipoperiodo");
					((ParametrosRelatorioActionForm) form).apagaTudo();
					if(acao.equals("NOVO")){
						request.getSession().removeAttribute("geraRelatorio");
						request.getSession().removeAttribute("relatorio");
					}
				}
			}
	
	
			request.getSession().setAttribute("colEstado",colEstado);
			request.getSession().setAttribute("colRegional",colRegional);
			request.getSession().setAttribute("colRegionalSelected",colRegionalSelected);	
			request.getSession().setAttribute("colMunicipio",colMunicipio);
			request.getSession().setAttribute("colMunicipioSelected",colMunicipioSelected);
			request.getSession().setAttribute("colCampo1",colCampo1);
			request.getSession().setAttribute("colCampo2",colCampo2);
			request.getSession().setAttribute("aRegCampo1",aRegCampo1);
			request.getSession().setAttribute("aRegCampo1Selected",aRegCampo1Selected);
			request.getSession().setAttribute("aRegCampo2",aRegCampo2);
			request.getSession().setAttribute("aRegCampo2Selected",aRegCampo2Selected);
			request.getSession().setAttribute("erroBanco",erroBanco);

			
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

		

		return mapping.findForward("ParametrosRelatorio");		
		
	}

	public Vector add(Vector colOriginal, Vector colSelected, int[] arAdd){

		Object aux = null;
			
		if(arAdd != null){
			if(colOriginal != null){ 
				for(int i=0;i<colOriginal.size();i++){
					for(int j=0;j < arAdd.length; j++){
						
						aux = colOriginal.elementAt(i);

						if(aux instanceof Regional){
							try{
								if(arAdd[j] == ((Regional)aux).getRegional()){
									if(colSelected == null)
										colSelected = new Vector();
	
									if(!colSelected.contains(aux))
										colSelected.add(aux);
								}
							}catch(RemoteException e){}
						}
						else
						if(aux instanceof Municipio){
							try{
								if(arAdd[j] == ((Municipio)aux).getMunicipio()){
									if(colSelected == null)
										colSelected = new Vector();
									
									if(!colSelected.contains(aux))
										colSelected.add(aux);
								}
							}catch(RemoteException e){}
						}
						else
						if(aux instanceof AuxCampo){
							if(arAdd[j] == ((AuxCampo)aux).getRegistro()){
								if(colSelected == null)
									colSelected = new Vector();
								if(!colSelected.contains(aux))
									colSelected.add(aux);
							}
						}						
					}
				}
			}
		}
						
		return colSelected;			
	}
	
	public void del(Vector colSelected, int[] arDel){
		
		Object aux = null;

		if(arDel != null){
			if(colSelected != null){ 
				for(int i=0;i<colSelected.size();i++){
					for(int j=0;j < arDel.length; j++){
						
						aux = colSelected.elementAt(i);
		
						if(aux instanceof Regional){
							try{
									if(arDel[j] == ((Regional)aux).getRegional())
										colSelected.removeElementAt(i);
							}catch(RemoteException e){}							
						}
						else
							if(aux instanceof Municipio){
								
								try{
										if(arDel[j] == ((Municipio)aux).getMunicipio())
											colSelected.removeElementAt(i);
								}catch(RemoteException e){}							
							}
							else
								if(aux instanceof AuxCampo){
									if(arDel[j] == ((AuxCampo)aux).getRegistro()){
										colSelected.removeElementAt(i);
									}
								}
					}
				}
			}
		}		
	}
	
	public Vector toVector(AuxCampo[] campo){

		Vector aux = new Vector();

		if(campo != null){
			for(int i = 0; i < campo.length; i++){
				aux.add(campo[i]);
			}
		}
	
		return aux;			
	}
	
	public int[] toArrayInt(Vector v){
		
		int[]	array 	= null;
		Object	aux 	= null;

		if(v != null){
			
			array = new int[v.size()];
			
			for(int i=0; i < array.length; i++){
				aux = v.elementAt(i);
				
				if(aux instanceof Regional){
					try{
						array[i] = ((Regional)aux).getRegional();
					}catch(RemoteException e){}
				}
				else
					if(aux instanceof Municipio){
						try{
							array[i] = ((Municipio)aux).getMunicipio();
						}catch(RemoteException e){}	
					}
					else
						if(aux instanceof AuxCampo){
							array[i] = ((AuxCampo)aux).getRegistro();
						}
			}
		}
		
		return array;
	}
	
	public void print(Vector v){
		
	}
}