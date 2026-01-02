package br.smat.web.pessoas.cadastrorepresentante;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.ejb.empregador.Empregador;
import br.smat.web.obj.ObjEmpregador;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 8 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>acidente - [your comment here]
 * <li>numInvestigacao - [your comment here]
 * <li>dadoInvestigacao - [your comment here]
 * <li>representante - [your comment here]
 * <li>tipoDepoimento - [your comment here]
 * <li>empregador - [your comment here]
 * <li>nome - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class CadastroRepresentanteActionForm extends ActionForm {

	private String acao = null;
	private int acidente;
	private int numInvestigacao;
	private int dadoInvestigacao;
	private int representante;
	private int tipoDepoimento;
	private int empregador;
	private String nome = null;

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
	 * Get representante
	 * @return int
	 */
	public int getRepresentante() {
		return representante;
	}

	/**
	 * Set representante
	 * @param <code>int</code>
	 */
	public void setRepresentante(int r) {
		representante = r;
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
	 * Get empregador
	 * @return int
	 */
	public int getEmpregador() {
		return empregador;
	}

	/**
	 * Set empregador
	 * @param <code>int</code>
	 */
	public void setEmpregador(int e) {
		empregador = e;
	}
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
		nome = n;
	}
	/**
	* Constructor
	*/
	public CadastroRepresentanteActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		acao = null;
		acidente = 0;
		numInvestigacao = 0;
		dadoInvestigacao = 0;
		representante = 0;
		tipoDepoimento = 0;
		empregador = 0;
		nome = null;

	}
	
	public void apaga(){

		representante = 0;
		nome = null;
		
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,32));//32 - CadastroRepresentante.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors errors = new ActionErrors();
		
		if(acao != null)
		if(acao.equals("GRAVAR"))
			if(nome == null || nome.trim().length() == 0)
				errors.add("nome",new ActionError("error.nomerepresentanteempresa.required"));

		if(!errors.empty()){
			if(empregador != 0){
				try{
					Empregador e = ObjEmpregador.findByPrimaryKey(empregador);
					request.setAttribute("nomeEmpregador",e.getRazaoSocial());
				}catch(Exception e){}
			}
		}
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new ActionError("error.field.required"));
		// }
		return errors;

	}
}
