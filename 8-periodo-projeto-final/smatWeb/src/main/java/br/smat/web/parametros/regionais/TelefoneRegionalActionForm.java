package br.smat.web.parametros.regionais;

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
 * Users may access 6 fields on this form:
 * <ul>
 * <li>descricao - [your comment here]
 * <li>numero - [your comment here]
 * <li>ddd - [your comment here]
 * <li>regional - [your comment here]
 * <li>acao - [your comment here]
 * <li>telefoneRegional - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class TelefoneRegionalActionForm extends ActionForm {

	private String descricao = null;
	private String numero = null;
	private String ddd = null;
	private int regional;
	private String acao = null;
	private int 	telefoneRegional = 0;
	private int	estado;

	private ActionErrors errors = null;

	/**
	 * Get descricao
	 * @return String
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Set descricao
	 * @param <code>String</code>
	 */
	public void setDescricao(String d) {
		
			if (d == null || d.trim().length() == 0){
		   		setErro("descricao","error.descricaotelefoneregional.required");		
			}		
		
		descricao = d;
	}
	/**
	 * Get numero
	 * @return String
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Set numero
	 * @param <code>String</code>
	 */
	public void setNumero(String n) {
		String erro;
		
		if(n != null)
			if((erro=FuncoesComuns.validateTelefone(n,"telefoneregional")) != null)
				setErro("telefoneregional",erro);		
						
		numero = n;
	}
	/**
	 * Get ddd
	 * @return String
	 */
	public String getDdd() {
		return ddd;
	}

	/**
	 * Set ddd
	 * @param <code>String</code>
	 */
	public void setDdd(String d) {
		if(d != null)
			if(ValidacoesFormulario.retiraCharAlfabeticos(d).length() < 2)
				setErro("dddregional","error.dddregional.required");		
		ddd = d;
	}
	/**
	 * Get regional
	 * @return int
	 */
	public int getRegional() {
		return regional;
	}

	/**
	 * Set regional
	 * @param <code>int</code>
	 */
	public void setRegional(int r) {
		
		if(r == 0)
			setErro("regional","error.regionaltelefoneregional.required");
		
		regional = r;
	}
	/**
	 * Get acao
	 * @return String
	 */
	public String getAcao() {
		return acao;
	}

	/**
	 * Set acao
	 * @param <code>String</code>
	 */
	public void setAcao(String a) {
		acao = a;
	}
	/**
	 * Get telefoneRegional
	 * @return String
	 */
	public int getTelefoneRegional() {
		return telefoneRegional;
	}

	/**
	 * Set telefoneRegional
	 * @param <code>String</code>
	 */
	public void setTelefoneRegional(int t) {
		telefoneRegional = t;
	}
	/**
	* Constructor
	*/
	public TelefoneRegionalActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.
		apaga();
	}
	
	public void apaga(){
		descricao = null;
		numero = null;
		ddd = null;
		regional = 0;
		acao = null;
		telefoneRegional = 0;
		estado = 0;		
	}
	
	public ActionErrors validate(
		ActionMapping mapping,
		HttpServletRequest request) {

		ActionErrors localErrors = null;
		
/****************************
 * 							*
 * 		Permissão 			*	
 *							* 
 * **************************/
		Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
		
		request.removeAttribute("permissaoPagina");
		
		if(usuario != null){
			try{
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,41));//2 - PontosFiscalizacao.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/	
		if(acao != null)
			if(!acao.equals("GRAVAR"))
				errors = null;
				
		if(errors != null)
			localErrors = errors;
		else
			localErrors = new ActionErrors();
		
		errors = null;				
		
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
	 * Returns the estado.
	 * @return int
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

}
