package br.smat.web.acidentepassotres;

import java.util.Vector;
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
 * Users may access 12 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>acidente - [your comment here]
 * <li>nomeTestemunha - [your comment here]
 * <li>estadoTestemunha - [your comment here]
 * <li>municipioTestemunha - [your comment here]
 * <li>ruaTestemunha - [your comment here]
 * <li>bairroTestemunha - [your comment here]
 * <li>numeroTestemunha - [your comment here]
 * <li>complementoTestemunha - [your comment here]
 * <li>cepTestemunha - [your comment here]
 * <li>telefoneTestemunha - [your comment here]
 * <li>testemunhas - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class AcidentePassoTresActionForm extends ActionForm {

	private String acao = null;
	private String	destino = null;
	private String	paginaAtual = null;		
	
	private int	index = 0;	
	private int	acidente = 0;
	private String nomeTestemunha = null;
	private int 	estadoTestemunha;
	private int 	municipioTestemunha;
	private String ruaTestemunha = null;
	private String bairroTestemunha = null;
	private int	numeroTestemunha = 0;
	private String complementoTestemunha = null;
	private String cepTestemunha = null;
	private String dddTestemunha = null;
	private String telefoneTestemunha = null;
	private int    testemunha = 0;
	private ActionErrors errors = null;

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
	 * Get nomeTestemunha
	 * @return String
	 */
	public String getNomeTestemunha() {
		return nomeTestemunha;
	}

	/**
	 * Set nomeTestemunha
	 * @param <code>String</code>
	 */
	public void setNomeTestemunha(String n) {
		
		if(n != null)
			if(n.trim().length() == 0)
				setErro("nomeTestemunha","error.nometestemunha.required");
		
		nomeTestemunha = n;
	}
	/**
	 * Get estadoTestemunha
	 * @return int
	 */
	public int getEstadoTestemunha() {
		return estadoTestemunha;
	}

	/**
	 * Set estadoTestemunha
	 * @param <code>int</code>
	 */
	public void setEstadoTestemunha(int e) {
		
		/*if(e == 0)
			setErro("estadoTestemunha","error.estadotestemunha.required");*/
		
		estadoTestemunha = e;
	}
	/**
	 * Get municipioTestemunha
	 * @return int
	 */
	public int getMunicipioTestemunha() {
		return municipioTestemunha;
	}

	/**
	 * Set municipioTestemunha
	 * @param <code>int</code>
	 */
	public void setMunicipioTestemunha(int m) {
		
		/*if(m == 0)
			setErro("municipiotestemunha","error.municipiotestemunha.required");*/
		
		municipioTestemunha = m;
	}
	/**
	 * Get ruaTestemunha
	 * @return String
	 */
	public String getRuaTestemunha() {
		return ruaTestemunha;
	}

	/**
	 * Set ruaTestemunha
	 * @param <code>String</code>
	 */
	public void setRuaTestemunha(String r) {
		ruaTestemunha = r;
	}
	/**
	 * Get bairroTestemunha
	 * @return String
	 */
	public String getBairroTestemunha() {
		return bairroTestemunha;
	}

	/**
	 * Set bairroTestemunha
	 * @param <code>String</code>
	 */
	public void setBairroTestemunha(String b) {
		bairroTestemunha = b;
	}
	/**
	 * Get numeroTestemunha
	 * @return String
	 */
	public int getNumeroTestemunha() {
		return numeroTestemunha;
	}

	/**
	 * Set numeroTestemunha
	 * @param <code>String</code>
	 */
	public void setNumeroTestemunha(int n) {
		numeroTestemunha = n;
	}
	/**
	 * Get complementoTestemunha
	 * @return String
	 */
	public String getComplementoTestemunha() {
		return complementoTestemunha;
	}

	/**
	 * Set complementoTestemunha
	 * @param <code>String</code>
	 */
	public void setComplementoTestemunha(String c) {
		complementoTestemunha = c;
	}
	/**
	 * Get cepTestemunha
	 * @return String
	 */
	public String getCepTestemunha() {
		return cepTestemunha;
	}

	/**
	 * Set cepTestemunha
	 * @param <code>String</code>
	 */
	public void setCepTestemunha(String c) {
		String erro = null;
		
		if(c != null)
		if(c.trim().length() > 0)
			if((erro = FuncoesComuns.validateCEP(c,"ceptestemunha")) != null)
				setErro("ceptestemunha",erro);	
						
		cepTestemunha = c;
	}
	/**
	 * Get telefoneTestemunha
	 * @return String
	 */
	public String getTelefoneTestemunha() {
		return telefoneTestemunha;
	}

	/**
	 * Set telefoneTestemunha
	 * @param <code>String</code>
	 */
	public void setTelefoneTestemunha(String t) {
		String erro;
		
		if(t != null)
			if(t.trim().length() > 0)
				if((erro=FuncoesComuns.validateTelefone(t,"telefonetestemunha")) != null)
					setErro("telefonetestemunha",erro);
					
		telefoneTestemunha = t;
	}

	/**
	* Constructor
	*/
	public AcidentePassoTresActionForm() {

		super();

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

	/**
	 * Returns the paginaAtual.
	 * @return String
	 */
	public String getPaginaAtual() {
		return paginaAtual;
	}

	/**
	 * Sets the paginaAtual.
	 * @param paginaAtual The paginaAtual to set
	 */
	public void setPaginaAtual(String paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	/**
	 * Returns the dddTestemunha.
	 * @return String
	 */
	public String getDddTestemunha() {
		return dddTestemunha;
	}

	/**
	 * Sets the dddTestemunha.
	 * @param dddTestemunha The dddTestemunha to set
	 */
	public void setDddTestemunha(String d) {
		if(d != null)
			if(d.trim().length() > 0)
				if(ValidacoesFormulario.retiraCharAlfabeticos(d).length() < 2)
					setErro("dddtestemunha","error.dddtestemunha.required");		
					
		this.dddTestemunha = d;
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
	 * Returns the testemunha.
	 * @return int
	 */
	public int getTestemunha() {
		return testemunha;
	}

	/**
	 * Sets the testemunha.
	 * @param testemunha The testemunha to set
	 */
	public void setTestemunha(int testemunha) {
		this.testemunha = testemunha;
	}

	/**
	 * Returns the index.
	 * @return int
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Sets the index.
	 * @param index The index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	
	public void apaga(){
		acao = null;
		acidente = 0;
		dddTestemunha = null;
		nomeTestemunha = null;
		estadoTestemunha = 0;
		municipioTestemunha = 0;
		ruaTestemunha = null;
		bairroTestemunha = null;
		numeroTestemunha = 0;
		complementoTestemunha = null;
		cepTestemunha = null;
		telefoneTestemunha = null;
		testemunha = 0;		
		index = 0;
	}
	
	public void apagaDadosTestemunha(){
		nomeTestemunha = null;
		estadoTestemunha = 0;
		municipioTestemunha = 0;
		dddTestemunha = null;		
		ruaTestemunha = null;
		bairroTestemunha = null;
		numeroTestemunha = 0;
		complementoTestemunha = null;
		cepTestemunha = null;
		telefoneTestemunha = null;
		testemunha = 0;				
		index = 0;
	}	

	public void reset(ActionMapping mapping, HttpServletRequest request) {

		apaga();
		// Reset values are provided as samples only. Change as appropriate.
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,3));//3 - AcidentePassoTres.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/
			
		ActionErrors localErrors;

		if(acao != null)
			if(!acao.equalsIgnoreCase("INSERIRTESTEMUNHA"))
				errors = null;

						
		if(errors != null)
			localErrors = errors;
		else
			localErrors = new ActionErrors();
		
		errors = null;				
		
		return localErrors;		
	}

	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
	}		
}
