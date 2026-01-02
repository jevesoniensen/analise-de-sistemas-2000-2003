package br.smat.web.empregador;

import java.rmi.RemoteException;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.util.FuncoesComuns;
import br.smat.util.ValidacoesFormulario;
import br.smat.web.obj.ObjPagina;
import br.smat.web.obj.ObjTipoEmpregador;

/**
 * Form bean for a Struts application.
 * Users may access 12 fields on this form:
 * <ul>
 * <li>tipoEmpregador - [your comment here]
 * <li>documento - [your comment here]
 * <li>nome - [your comment here]
 * <li>ramoAtividadeSuperior - [your comment here]
 * <li>ramoAtividade - [your comment here]
 * <li>estado - [your comment here]
 * <li>municipio - [your comment here]
 * <li>rua - [your comment here]
 * <li>numero - [your comment here]
 * <li>bairro - [your comment here]
 * <li>complemento - [your comment here]
 * <li>cep - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class EmpregadorActionForm extends ActionForm {

	private int	empregador;
	private int 	tipoEmpregador;
	private String documento 		= null;
	private String razaoSocial		= null;
	private int 	ramoSuperior;
	private int 	ramoAtividade;
	private int 	estado;
	private int 	municipio;
	private String rua 			= null;
	private int	numero 			;
	private String bairro 			= null;
	private String complemento 	= null;
	private String cep 			= null;
	private String acao			= null;
	private String	destino			= null;
	private ActionErrors errors;		

	/**
	 * Get tipoEmpregador
	 * @return int
	 */
	public int getTipoEmpregador() {
		return tipoEmpregador;
	}

	/**
	 * Set tipoEmpregador
	 * @param <code>int</code>
	 */
	public void setTipoEmpregador(int t) {
		if(t == 0)
			setErro("tipoEmpregador","error.tipoEmpregador.required");
			
		tipoEmpregador = t;
	}
	/**
	 * Get documento
	 * @return String
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * Set documento
	 * @param <code>String</code>
	 */
	public void setDocumento(String d) {		
		documento = d.trim();
	}
	
	/**
	 * Get nome
	 * @return String
	 */
	public String getRazaoSocial() {		
		return razaoSocial;
	}

	/**
	 * Set nome
	 * @param <code>String</code>
	 */
	public void setRazaoSocial(String n) {
		if(n == null || n.trim().length() == 0)
			setErro("razaoSocial","error.razaosocial.required");
					
		razaoSocial = n.trim();
	}
	/**
	 * Get ramoAtividadeSuperior
	 * @return int
	 */
	public int getRamoSuperior() {
		return ramoSuperior;
	}

	/**
	 * Set ramoAtividadeSuperior
	 * @param <code>int</code>
	 */
	public void setRamoSuperior(int r) {
		if(r == 0)
			setErro("ramoSuperior","error.ramosuperior.required");			
			
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
		if(r == 0)
			setErro("ramoAtividade","error.ramoatividade.required");					
			
		ramoAtividade = r;
	}
	/**
	 * Get estado
	 * @return int
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * Set estado
	 * @param <code>int</code>
	 */
	public void setEstado(int e) {
		if(e == 0)
			setErro("estado","error.estado.required");
		
		estado = e;
	}
	/**
	 * Get municipio
	 * @return int
	 */
	public int getMunicipio() {
		return municipio;
	}

	/**
	 * Set municipio
	 * @param <code>int</code>
	 */
	public void setMunicipio(int m) {
		if(m == 0)
			setErro("municipio","error.municipio.required");		
		municipio = m;
	}
	/**
	 * Get rua
	 * @return String
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * Set rua
	 * @param <code>String</code>
	 */
	public void setRua(String r) {
		if(r == null || r.trim().length() == 0)
			setErro("rua","error.rua.required");			
		rua = r;
	}
	/**
	 * Get numero
	 * @return int
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Set numero
	 * @param <code>String</code>
	 */
	public void setNumero(int n) {
			if(n == 0)
				setErro("numero", "error.end.numero.required");

		numero = n;
	}
	/**
	 * Get bairro
	 * @return String
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * Set bairro
	 * @param <code>String</code>
	 */
	public void setBairro(String b) {
		if(b == null || b.trim().length() == 0)
			setErro("bairro","error.bairro.required");		
		bairro = b;
	}
	/**
	 * Get complemento
	 * @return String
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * Set complemento
	 * @param <code>String</code>
	 */
	public void setComplemento(String c) {
		complemento = c.trim();
	}
	/**
	 * Get cep
	 * @return String
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Set cep
	 * @param <code>String</code>
	 */
	public void setCep(String c) {
		String erro = null;
		
		if(c == null || c.trim().length() == 0)
			setErro("cepempregador","error.cepempregador.required");
		else
			if((erro = FuncoesComuns.validateCEP(c,"cepempregador")) != null)
				setErro("cepempregador",erro);	

		cep = c;
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
		
	/**
	* Constructor
	*/
	public EmpregadorActionForm() {

		super();
		apaga();
		errors =  new ActionErrors();
	}
	
	public void apaga(){
		tipoEmpregador = 0;
		documento = null;
		razaoSocial = null;
		ramoSuperior = 0;
		ramoAtividade = 0;
		estado = 0;
		municipio = 0;
		rua = null;
		numero = 0;
		bairro = null;
		complemento = null;
		cep = null;
		empregador = 0;		
	}
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.
		apaga();
		
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,10));//10 - Empregador.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/			

		ActionErrors localErrors;
		String docIdentificador = null;

		System.out.println("acao => " + acao);

		if(tipoEmpregador > 0){
			if(documento.trim().length() > 0){
				try {
					
					docIdentificador = ObjTipoEmpregador.findByPrimaryKey(tipoEmpregador).getDocIdentificador();
					
					if(docIdentificador.trim().equalsIgnoreCase("CPF")){
						if(!ValidacoesFormulario.validaCPF(this.documento))
							setErro("documento","error.cpfempregador.invalido");
					}
					else
					if(docIdentificador.trim().equalsIgnoreCase("CNPJ")){				
						if(!ValidacoesFormulario.validaCNPJ(this.documento))
							setErro("documento","error.cnpjempregador.invalido");					
					}
				} catch (RemoteException e) {
					setErro("docidentificador","error.bancodedados");
				} catch (Exception e) {
					setErro("docidentificador","error.bancodedados");
				}

			}
		}
				
		
		if(acao != null){
			if(!acao.equals("GRAVAR"))
				errors = null;
		}
				
		if(errors != null)
			localErrors = errors;
		else
			localErrors = new ActionErrors();
		
		errors = null;				
		
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		return localErrors;

	}
	
	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
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
