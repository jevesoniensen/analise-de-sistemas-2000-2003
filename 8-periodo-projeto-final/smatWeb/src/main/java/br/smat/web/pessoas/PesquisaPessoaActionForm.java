package br.smat.web.pessoas;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 6 fields on this form:
 * <ul>
 * <li>numInvestigacao - [your comment here]
 * <li>dadoInvestigacao - [your comment here]
 * <li>pessoa - [your comment here]
 * <li>nomePessoa - [your comment here]
 * <li>tipoDepoimento - [your comment here]
 * <li>acidente - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class PesquisaPessoaActionForm extends ActionForm {

	private int numInvestigacao;
	private int dadoInvestigacao;
	private int pessoa;
	private String nomePessoa = null;
	private int tipoDepoimento;
	private int acidente;
	private int empregador;
	private String acao;

	/**
	 * Get numInvestigacao
	 * @return int
	 */
	public int getNumInvestigacao() {
		return numInvestigacao;
	}

	/**
	 * Set numInvestigacao
	 * @param <code>int</code>
	 */
	public void setNumInvestigacao(int n) {
		numInvestigacao = n;
	}
	/**
	 * Get dadoInvestigacao
	 * @return int
	 */
	public int getDadoInvestigacao() {
		return dadoInvestigacao;
	}

	/**
	 * Set dadoInvestigacao
	 * @param <code>int</code>
	 */
	public void setDadoInvestigacao(int d) {
		dadoInvestigacao = d;
	}
	/**
	 * Get pessoa
	 * @return int
	 */
	public int getPessoa() {
		return pessoa;
	}

	/**
	 * Set pessoa
	 * @param <code>int</code>
	 */
	public void setPessoa(int p) {
		pessoa = p;
	}
	/**
	 * Get nomePessoa
	 * @return String
	 */
	public String getNomePessoa() {
		return nomePessoa;
	}

	/**
	 * Set nomePessoa
	 * @param <code>String</code>
	 */
	public void setNomePessoa(String n) {
		nomePessoa = n;
	}
	/**
	 * Get tipoDepoimento
	 * @return int
	 */
	public int getTipoDepoimento() {
		return tipoDepoimento;
	}

	/**
	 * Set tipoDepoimento
	 * @param <code>int</code>
	 */
	public void setTipoDepoimento(int t) {
		tipoDepoimento = t;
	}
	/**
	 * Get acidente
	 * @return int
	 */
	public int getAcidente() {
		return acidente;
	}

	/**
	 * Set acidente
	 * @param <code>int</code>
	 */
	public void setAcidente(int a) {
		acidente = a;
	}
	/**
	* Constructor
	*/
	public PesquisaPessoaActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		numInvestigacao = 0;
		dadoInvestigacao = 0;
		pessoa = 0;
		nomePessoa = null;
		tipoDepoimento = 0;
		acidente = 0;
		acao = null;
		empregador=0;

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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,34));//34 - PesquisaPessoa.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors errors = new ActionErrors();
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new ActionError("error.field.required"));
		// }
		return errors;

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
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() {
		return empregador;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(int empregador) {
		this.empregador = empregador;
	}

}
