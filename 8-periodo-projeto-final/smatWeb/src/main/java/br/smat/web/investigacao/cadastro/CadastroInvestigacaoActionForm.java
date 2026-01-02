package br.smat.web.investigacao.cadastro;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 3 fields on this form:
 * <ul>
 * <li>agenteSaude - [your comment here]
 * <li>motivo - [your comment here]
 * <li>obsGerais - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class CadastroInvestigacaoActionForm extends ActionForm {

	private String acao=null;
	private int agenteSaude;
	private String motivo = null;
	private String obsGerais = null;
	private int numInvestigacao = 0;
	private String dataAbertura = null;
	private String dataFinalizacao = null;
	private String destino = null;

	private ActionErrors errors;

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
	 * Get agenteSaude
	 * @return int
	 */
	public int getAgenteSaude() {
		return agenteSaude;
	}

	/**
	 * Set agenteSaude
	 * @param <code>int</code>
	 */
	public void setAgenteSaude(int a) {
		
		if(a == 0)
			setErro("agenteSaude","error.agentesaude.required");	
		agenteSaude = a;
	}
	/**
	 * Get motivo
	 * @return String
	 */
	public String getMotivo() {
		return motivo;
	}

	/**
	 * Set motivo
	 * @param <code>String</code>
	 */
	public void setMotivo(String m) {
		if(m == null || m.trim().length() == 0){
			setErro("motivo","error.motivo.required");
			m = null;
		}

		motivo = m;
	}
	/**
	 * Get obsGerais
	 * @return String
	 */
	public String getObsGerais() {
		return obsGerais;
	}

	/**
	 * Set obsGerais
	 * @param <code>String</code>
	 */
	public void setObsGerais(String o) {
		obsGerais = o;
	}
	/**
	* Constructor
	*/
	public CadastroInvestigacaoActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		agenteSaude = 0;
		motivo = null;
		obsGerais = null;
	//	numInvestigacao = 0;
	//	dataAbertura = null;
	//	dataFinalizacao = null;

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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,28));//28 - CadastroInvestigacao.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors localErrors;
		
		if(acao != null){
			if(!acao.equals("GRAVAR"))
				errors = null;
		}
		else
			errors = null;

		if(errors != null)
			localErrors = errors;
		else
			localErrors = new ActionErrors();
		
		errors = null;			
		
		if(!localErrors.empty()){

			if(numInvestigacao != 0)
				request.setAttribute("numInvestigacao",""+numInvestigacao);
				
			if(dataAbertura != null && dataAbertura.trim().length() != 0)
				request.setAttribute("dataAbertura",dataAbertura);

			if(dataFinalizacao != null && dataFinalizacao.trim().length() != 0)
				request.setAttribute("dataFinalizacao",dataFinalizacao);			
		}
		
		return localErrors;
		
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new ActionError("error.field.required"));
		// }
	}
	
	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
	}
	/**
	 * Returns the numInvestigacao.
	 * @return int
	 */
	public int getNumInvestigacao() {
		return numInvestigacao;
	}

	/**
	 * Sets the numInvestigacao.
	 * @param numInvestigacao The numInvestigacao to set
	 */
	public void setNumInvestigacao(int numInvestigacao) {
		this.numInvestigacao = numInvestigacao;
	}

	/**
	 * Returns the dataAbertura.
	 * @return String
	 */
	public String getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * Returns the dataFinalizacao.
	 * @return String
	 */
	public String getDataFinalizacao() {
		return dataFinalizacao;
	}

	/**
	 * Sets the dataAbertura.
	 * @param dataAbertura The dataAbertura to set
	 */
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	/**
	 * Sets the dataFinalizacao.
	 * @param dataFinalizacao The dataFinalizacao to set
	 */
	public void setDataFinalizacao(String dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	
	public void apaga(){
		acao=null;
		agenteSaude  = 0;
		motivo = null;
		obsGerais = null;
		numInvestigacao = 0;
		dataAbertura = null;
		dataFinalizacao = null;		
	}
	/**
	 * Returns the destino.
	 * @return String
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * Sets the destino.
	 * @param destino The destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

}