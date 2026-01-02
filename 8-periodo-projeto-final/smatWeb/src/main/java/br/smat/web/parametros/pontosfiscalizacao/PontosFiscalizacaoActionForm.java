package br.smat.web.parametros.pontosfiscalizacao;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 5 fields on this form:
 * <ul>
 * <li>nome - [your comment here]
 * <li>descricao - [your comment here]
 * <li>ramoSuperior - [your comment here]
 * <li>ramoAtividade - [your comment here]
 * <li>filtroPontosFiscalizacao - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class PontosFiscalizacaoActionForm extends ActionForm {

	private String acao 					= null;
	private String destino 				= null;

	private String nome 					= null;
	private String descricao 				= null;
	private int ramoSuperior				= 0;
	private int ramoAtividade				= 0;
	private int filtroPontosFiscalizacao 	= 0;
	private int pontoFiscalizacao			= 0;

	private ActionErrors errors;
	
	/**
	 * Get nome
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Set nome
	 * @param <code>String</code>
	 */
	public void setNome(String n) {
		
		if(n == null || n.trim().length() == 0)
			setErro("nome","error.nomepontofiscalizacao.required");		
		
		nome = n;
	}
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
		
		if(d == null || (d.trim().length() == 0 || d.length() > 255))
			setErro("descricao","error.descricaopontofiscalizacao.required");		
		
		
		descricao = d;
	}
	/**
	 * Get ramoSuperior
	 * @return int
	 */
	public int getRamoSuperior() {
		return ramoSuperior;
	}

	/**
	 * Set ramoSuperior
	 * @param <code>int</code>
	 */
	public void setRamoSuperior(int r) {
		
		if(r==0)
			setErro("ramoSuperior","error.ramosuperiorponto.required");
		
		ramoSuperior = r;
	}
	/**
	 * Get ramoAtividade
	 * @return int
	 */
	public int getRamoAtividade() {
		return ramoAtividade;
	}

	/**
	 * Set ramoAtividade
	 * @param <code>int</code>
	 */
	public void setRamoAtividade(int r) {
		
		if(r==0)
			setErro("ramoAtividade","error.ramoatividadeponto.required");		
		ramoAtividade = r;
	}
	/**
	 * Get filtroPontosFiscalizacao
	 * @return int
	 */
	public int getFiltroPontosFiscalizacao() {
		return filtroPontosFiscalizacao;
	}

	/**
	 * Set filtroPontosFiscalizacao
	 * @param <code>int</code>
	 */
	public void setFiltroPontosFiscalizacao(int f) {
		filtroPontosFiscalizacao = f;
	}
	
	/**
	 * Returns the acao.
	 * @return String
	 */
	public String getAcao() {
		return acao;
	}

	/**
	 * Returns the destino.
	 * @return String
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * Sets the acao.
	 * @param acao The acao to set
	 */
	public void setAcao(String acao) {
		this.acao = acao;
	}

	/**
	 * Sets the destino.
	 * @param destino The destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}	

	/**
	 * Returns the pontoFiscalizacao.
	 * @return int
	 */
	public int getPontoFiscalizacao() {
		return pontoFiscalizacao;
	}

	/**
	 * Sets the pontoFiscalizacao.
	 * @param pontoFiscalizacao The pontoFiscalizacao to set
	 */
	public void setPontoFiscalizacao(int pontoFiscalizacao) {
		this.pontoFiscalizacao = pontoFiscalizacao;
	}
	
	/**
	* Constructor
	*/
	public PontosFiscalizacaoActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		nome = null;
		descricao = null;
		ramoSuperior = 0;
		ramoAtividade = 0;
		filtroPontosFiscalizacao = 0;

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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,14));//2 - PontosFiscalizacao.do
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
	
	public void apaga(){
		pontoFiscalizacao		= 0;
		nome 					= null;
		descricao 				= null;
		ramoSuperior				= 0;
		ramoAtividade				= 0;		
	}

	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
	}


}
