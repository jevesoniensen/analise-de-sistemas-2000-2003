package br.smat.web.pesquisaacidente;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.util.FuncoesComuns;
import br.smat.util.ValidacoesFormulario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class PesquisaAcidenteActionForm extends ActionForm {


	private int estado;
	private int regional;
	private int municipio;
	private String dataInicial;
	private String dataFinal;
	private String amputacao;
	private String obito;
	private String registroPolicial;	
	private String internacao;
	private int tipoAcidente;
	private int diagnostico;
	private int fonte;
	private int area;
	private String acao;


	/**
	 * Returns the amputacao.
	 * @return String
	 */
	public String getAmputacao() {
		return amputacao;
	}

	/**
	 * Returns the area.
	 * @return int
	 */
	public int getArea() {
		return area;
	}

	/**
	 * Returns the dataFinal.
	 * @return String
	 */
	public String getDataFinal() {
		return dataFinal;
	}

	/**
	 * Returns the dataInicial.
	 * @return String
	 */
	public String getDataInicial() {
		return dataInicial;
	}

	/**
	 * Returns the diagnostico.
	 * @return int
	 */
	public int getDiagnostico() {
		return diagnostico;
	}

	/**
	 * Returns the estado.
	 * @return int
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Returns the fonte.
	 * @return int
	 */
	public int getFonte() {
		return fonte;
	}

	/**
	 * Returns the internacao.
	 * @return String
	 */
	public String getInternacao() {
		return internacao;
	}

	/**
	 * Returns the municipio.
	 * @return int
	 */
	public int getMunicipio() {
		return municipio;
	}

	/**
	 * Returns the obito.
	 * @return String
	 */
	public String getObito() {
		return obito;
	}

	/**
	 * Returns the regional.
	 * @return int
	 */
	public int getRegional() {
		return regional;
	}

	/**
	 * Returns the tipoAcidente.
	 * @return int
	 */
	public int getTipoAcidente() {
		return tipoAcidente;
	}

	/**
	 * Sets the amputacao.
	 * @param amputacao The amputacao to set
	 */
	public void setAmputacao(String amputacao) {
		this.amputacao = amputacao;
	}

	/**
	 * Sets the area.
	 * @param area The area to set
	 */
	public void setArea(int area) {
		this.area = area;
	}

	/**
	 * Sets the dataFinal.
	 * @param dataFinal The dataFinal to set
	 */
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	/**
	 * Sets the dataInicial.
	 * @param dataInicial The dataInicial to set
	 */
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}

	/**
	 * Sets the diagnostico.
	 * @param diagnostico The diagnostico to set
	 */
	public void setDiagnostico(int diagnostico) {
		this.diagnostico = diagnostico;
	}

	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * Sets the fonte.
	 * @param fonte The fonte to set
	 */
	public void setFonte(int fonte) {
		this.fonte = fonte;
	}

	/**
	 * Sets the internacao.
	 * @param internacao The internacao to set
	 */
	public void setInternacao(String internacao) {
		this.internacao = internacao;
	}

	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(int municipio) {
		this.municipio = municipio;
	}

	/**
	 * Sets the obito.
	 * @param obito The obito to set
	 */
	public void setObito(String obito) {
		this.obito = obito;
	}

	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(int regional) {
		this.regional = regional;
	}

	/**
	 * Sets the tipoAcidente.
	 * @param tipoAcidente The tipoAcidente to set
	 */
	public void setTipoAcidente(int tipoAcidente) {
		this.tipoAcidente = tipoAcidente;
	}

	/**
	 * Returns the acao.
	 * @return String
	 */
	public String getAcao() {
		return acao;
	}

	/**
	 * Sets the acao.
	 * @param acao The acao to set
	 */
	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	/**
	 * Returns the registroPolicial.
	 * @return String
	 */
	public String getRegistroPolicial() {
		return registroPolicial;
	}

	/**
	 * Sets the registroPolicial.
	 * @param registroPolicial The registroPolicial to set
	 */
	public void setRegistroPolicial(String registroPolicial) {
		this.registroPolicial = registroPolicial;
	}
		
	/**
	* Constructor
	*/
	public PesquisaAcidenteActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		estado = 0;
		regional = 0;
		municipio = 0;
		dataInicial = null;
		dataFinal = null;
		amputacao = null;
		obito = null;
		registroPolicial = null;	
		internacao = null;
		tipoAcidente = 0;
		diagnostico = 0;
		fonte = 0;
		area = 0;
		acao = null;
	}

	public void apapa(){
		estado = 0;
		regional = 0;
		municipio = 0;
		dataInicial = null;
		dataFinal = null;
		amputacao = null;
		obito = null;
		registroPolicial = null;	
		internacao = null;
		tipoAcidente = 0;
		diagnostico = 0;
		fonte = 0;
		area = 0;
		acao = null;
	}
	public ActionErrors validate(
		ActionMapping mapping,
		HttpServletRequest request) {

/****************************
 * 							*
 * 		Permissão 			*	
 *							* 
 * **************************/
		Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
		
		request.removeAttribute("permissaoPagina");
				
		if(usuario != null){
			
			try{
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,15));//15 - PesquisaAcidente.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors errors = new ActionErrors();
		String erro = null;
		
		if(acao != null)
		if(acao.equals("CONSULTAR")){
			if(estado == 0)
				if(regional == 0)
					if(municipio == 0)
						if(dataInicial == null || dataInicial.trim().length() == 0)
							if(dataFinal == null || dataFinal.trim().length() == 0)
								if(amputacao == null || amputacao.trim().length() == 0)
									if(obito == null || obito.trim().length() == 0)
										if(internacao == null || internacao.trim().length() == 0)
											if(tipoAcidente == 0)
													if(diagnostico == 0)
														if(fonte == 0)
															if(area == 0)
																errors.add("estado", new ActionError("error.pesquisa.required"));
			
			if(errors.empty()){
				if(dataInicial != null && dataInicial.trim().length() != 0){
					
					if((erro = FuncoesComuns.validateData(dataInicial,"datainicialinvestigacao")) != null)
						errors.add("dataInicial", new ActionError(erro));
					
					if(dataFinal == null || dataFinal.trim().length() == 0)
						errors.add("dataFinal", new ActionError("error.datafinalinvestigacao.required"));
					else
						if((erro = FuncoesComuns.validateData(dataFinal,"datafinalinvestigacao")) != null)
							errors.add("dataFinal", new ActionError(erro));							
				}
				else{
					if(dataFinal != null && dataFinal.trim().length() != 0){
						if((erro = FuncoesComuns.validateData(dataFinal,"datafinalinvestigacao")) != null)
							errors.add("dataFinal", new ActionError(erro));	
						errors.add("dataInicial", new ActionError("error.datainicialinvestigacao.required"));				
					}
				}
				
				if((dataInicial != null && dataInicial.trim().length() != 0) && (dataFinal != null && dataFinal.trim().length() != 0))
					if(ValidacoesFormulario.comparaDatas(dataInicial,dataFinal) == 1){

						errors.add("dataInicial", new ActionError("error.datainicialinvestigacao.maiorquefinal"));
					}
			}
		}
		else
			if(acao.equals("LIMPAR")){
				estado = 0;
				regional = 0;
				municipio = 0;
				dataInicial = null;
				dataFinal = null;
				amputacao = null;
				obito = null;
				registroPolicial = null;	
				internacao = null;
				tipoAcidente = 0;
				diagnostico = 0;
				fonte = 0;
				area = 0;
				acao = "LISTAR";
			}
		

		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new ActionError("error.field.required"));
		// }
		return errors;

	}




}
