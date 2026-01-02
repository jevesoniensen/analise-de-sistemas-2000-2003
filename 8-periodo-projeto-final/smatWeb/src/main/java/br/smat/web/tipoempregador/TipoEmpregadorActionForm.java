package br.smat.web.tipoempregador;

import java.util.Collection;
import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.web.obj.ObjPagina;
import br.smat.web.obj.ObjTipoEmpregador;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class TipoEmpregadorActionForm extends ActionForm {

	private int 		  tipoEmpregador;
	private String		  nome;
	private String 	  docIdentificador;
	private String	      acao;		 
	private ActionErrors errors;	
	
	/**
	* Constructor
	*/
	public TipoEmpregadorActionForm() {
		super();
		errors 			 =  new ActionErrors();
		tipoEmpregador   = 0;
		nome 			 = null;
		docIdentificador = null;

	}
	
	public void apaga(){
		tipoEmpregador   = 0;
		nome 			 = null;
		docIdentificador = null;
		acao			 = "GRAVAR";		
	}
	
	public void reset(ActionMapping mapping, HttpServletRequest request) {
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,13));//13 - TipoEmpregador.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/			

		ActionErrors localErrors;
		
		if(acao != "null")
			if(acao.equals("EXCLUIR"))
				errors = null;

		if(errors != null)
			localErrors = errors;
		else
			localErrors = new ActionErrors();
		
		errors = null;
		
		request.getSession().setAttribute("erroBanco","");

		return localErrors;
	}
	/**
	 * Returns the docIdentificador.
	 * @return String
	 */
	public String getDocIdentificador() {
		return docIdentificador;
	}

	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Returns the tipoEmpregador.
	 * @return int
	 */
	public int getTipoEmpregador() {
		return tipoEmpregador;
	}

	/**
	 * Sets the docIdentificador.
	 * @param docIdentificador The docIdentificador to set
	 */
	public void setDocIdentificador(String docIdentificador) {
		this.docIdentificador = docIdentificador;
	}

	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) {
		if(nome != null){
			if (nome.length() == 0)
				setErro("nome", new ActionError("error.nome.required"));
		}
						
		this.nome = nome;
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
	 * Sets the tipoEmpregador.
	 * @param tipoEmpregador The tipoEmpregador to set
	 */
	public void setTipoEmpregador(int tipoEmpregador) {
		this.tipoEmpregador = tipoEmpregador;
	}
	
	public void setErro(String campo,ActionError erro){
		if(errors == null)
			errors = new ActionErrors();
			
			errors.add(campo,erro);
	}
}
