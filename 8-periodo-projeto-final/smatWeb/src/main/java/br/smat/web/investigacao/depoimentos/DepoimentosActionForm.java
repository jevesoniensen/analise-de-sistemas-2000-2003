package br.smat.web.investigacao.depoimentos;

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
 * Users may access 9 fields on this form:
 * <ul>
 * <li>data - [your comment here]
 * <li>tipoDepoimento - [your comment here]
 * <li>nomeTrabalhador - [your comment here]
 * <li>descricao - [your comment here]
 * <li>agenteCausadorVo - [your comment here]
 * <li>agenteCausadorPai - [your comment here]
 * <li>agenteCausador - [your comment here]
 * <li>acao - [your comment here]
 * <li>numInvestigacao - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class DepoimentosActionForm extends ActionForm {

	private String data = null;
	private int tipoDepoimento;
	private int pessoa = 0;
	private String nomePessoa = null;
	private String descricao = null;
	private int agenteCausadorVo;
	private int agenteCausadorPai;
	private int agenteCausador;
	private String acao = null;
	private int numInvestigacao;
	private int dadoInvestigacao;
	private int acidente;
	private String	hora = null;
	private int empregador = 0;
	private String dataAbertura = null;
	

	private ActionErrors errors;
	
//	private boolean erroAgente = false;
	
	/**
	 * Get data
	 * @return String
	 */
	public String getData() {
		return data;
	}

	/**
	 * Set data
	 * @param <code>String</code>
	 */
	public void setData(String d) {

		String erro = null;
		if(d != null)
			if((erro = FuncoesComuns.validateData(d,"datadadoinvestigacao")) != null )
				setErro("data",erro);
					
		data = d;
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
		
		if(t == 0)
			setErro("tipodepoimento","error.tipodepoimento.required");
		tipoDepoimento = t;
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
		descricao = d;
	}
	/**
	 * Get agenteCausadorVo
	 * @return int
	 */
	public int getAgenteCausadorVo() {
		return agenteCausadorVo;
	}

	/**
	 * Set agenteCausadorVo
	 * @param <code>int</code>
	 */
	public void setAgenteCausadorVo(int a) {
		
		
	/*	if(!erroAgente)
			if(a == 0){
				erroAgente = true;
				setErro("agenteCausadorVo","error.agentecausador.required");
			}*/
	
			if(agenteCausadorVo != a){
				agenteCausadorPai = 0;
				agenteCausador = 0;
			}


		
		agenteCausadorVo = a;
		

	}
	/**
	 * Get agenteCausadorPai
	 * @return int
	 */
	public int getAgenteCausadorPai() {
		return agenteCausadorPai;
	}

	/**
	 * Set agenteCausadorPai
	 * @param <code>int</code>
	 */
	public void setAgenteCausadorPai(int a) {

		if(a != agenteCausadorPai)
			agenteCausador = 0;
			
		/*if(!erroAgente)
		if(a == 0){
			setErro("agenteCausadorPai","error.agentecausador.required");
			erroAgente = true;
		}*/
		
			
		agenteCausadorPai = a;
	}
	/**
	 * Get agenteCausador
	 * @return int
	 */
	public int getAgenteCausador() {
		return agenteCausador;
	}

	/**
	 * Set agenteCausador
	 * @param <code>int</code>
	 */
	public void setAgenteCausador(int a) {

		//if(!erroAgente)
		if(a == 0)//{
			setErro("agenteCausador","error.agentecausador.required");
			//erroAgente = true;
		//}
			
		agenteCausador = a;
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
	* Constructor
	*/
	public DepoimentosActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		data = null;
		tipoDepoimento = 0;
		pessoa = 0;
		nomePessoa = null;
		descricao = null;
		agenteCausadorVo = 0;
		agenteCausadorPai = 0;
		agenteCausador = 0;
		acao = null;
		numInvestigacao = 0;
		dadoInvestigacao = 0;
		hora = null;
		empregador=0;
		dataAbertura=null;
		//erroAgente = false;

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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,29));//29 - Depoimentos.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors localErrors;
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new ActionError("error.field.required"));
		// }
		

		if(tipoDepoimento != 4 && tipoDepoimento != 0)
			request.setAttribute("mostraPesquisar","mostraPesquisar");
		else
			request.removeAttribute("mostraPesquisar");

		if(acao != null){
			if(!acao.equals("GRAVAR")){
				errors = null;
			}
			else{
				if(errors != null){

					if(errors.empty())
						if(ValidacoesFormulario.comparaDatas(dataAbertura.substring(0,10),data) == 1){
							setErro("data","error.data.menorquedataabertura");
										
						}else
						if(ValidacoesFormulario.comparaDatas(dataAbertura.substring(0,10),data) == 0)
							if(ValidacoesFormulario.comparaHora(dataAbertura.substring(11),hora) == 1)
								setErro("data","error.data.menorquedataabertura");

				}else
					if(ValidacoesFormulario.comparaDatas(dataAbertura.substring(0,10),data) == 1){
						setErro("data","error.data.menorquedataabertura");
					}else
					if(ValidacoesFormulario.comparaDatas(dataAbertura.substring(0,10),data) == 0)
						if(ValidacoesFormulario.comparaHora(dataAbertura.substring(11),hora) == 1)
							setErro("data","error.data.menorquedataabertura");
			}
		}else
			errors = null;
		

		if(errors != null)
			localErrors = errors;
		else
			localErrors = new ActionErrors();

		if(!localErrors.empty())
			request.setAttribute("dataAbertura",dataAbertura);
		//erroAgente = false;
		errors = null;
		return localErrors;
	}

	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
	}	
	
	public void apaga(){

		data = null;
		tipoDepoimento = 0;
		pessoa = 0;
		nomePessoa = null;
		descricao = null;
		agenteCausadorVo = 0;
		agenteCausadorPai = 0;
		agenteCausador = 0;
		acao = null;
		dadoInvestigacao = 0;
		hora = null;
		//erroAgente = false;
	}
	/**
	 * Returns the dadoInvestigacao.
	 * @return int
	 */
	public int getDadoInvestigacao() {
		return dadoInvestigacao;
	}

	/**
	 * Sets the dadoInvestigacao.
	 * @param dadoInvestigacao The dadoInvestigacao to set
	 */
	public void setDadoInvestigacao(int dadoInvestigacao) {
		this.dadoInvestigacao = dadoInvestigacao;
	}

	/**
	 * Returns the nomePessoa.
	 * @return String
	 */
	public String getNomePessoa() {
		return nomePessoa;
	}

	/**
	 * Returns the pessoa.
	 * @return int
	 */
	public int getPessoa() {
		return pessoa;
	}

	/**
	 * Sets the nomePessoa.
	 * @param nomePessoa The nomePessoa to set
	 */
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	/**
	 * Sets the pessoa.
	 * @param pessoa The pessoa to set
	 */
	public void setPessoa(int pessoa) {
		
		if(pessoa == 0)
			setErro("pessoa","error.pessoadepoimento.required");

		this.pessoa = pessoa;
	}

	/**
	 * Returns the acidente.
	 * @return int
	 */
	public int getAcidente() {
		return acidente;
	}

	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(int acidente) {
		this.acidente = acidente;
	}

	/**
	 * Returns the hora.
	 * @return String
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * Sets the hora.
	 * @param hora The hora to set
	 */
	public void setHora(String h) {

		String erro = null;
				
		if(h != null){
			if((erro = FuncoesComuns.validateHora(h,"horadadoinvestigacao")) != null )
				setErro("hora",erro);	
		}
		
		hora = h;
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

	/**
	 * Returns the dataAbertura.
	 * @return String
	 */
	public String getDataAbertura() {
		return dataAbertura;
	}

	/**
	 * Sets the dataAbertura.
	 * @param dataAbertura The dataAbertura to set
	 */
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

}
