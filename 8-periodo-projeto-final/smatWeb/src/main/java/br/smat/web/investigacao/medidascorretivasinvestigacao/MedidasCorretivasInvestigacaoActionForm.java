package br.smat.web.investigacao.medidascorretivasinvestigacao;

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
 * <li>medidaCorretiva - [your comment here]
 * <li>prazoDias - [your comment here]
 * <li>observacoes - [your comment here]
 * <li>numInvestigacao - [your comment here]
 * <li>acao - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class MedidasCorretivasInvestigacaoActionForm extends ActionForm {

	private int tipoMedidaCorretiva;
	private int prazoDias;
	private String observacoes = null;
	private int numInvestigacao;
	private String acao = null;
	
	private ActionErrors errors = null;

	/**
	 * Get medidaCorretiva
	 * @return int
	 */
	public int getTipoMedidaCorretiva() {
		return tipoMedidaCorretiva;
	}

	/**
	 * Set medidaCorretiva
	 * @param <code>int</code>
	 */
	public void setTipoMedidaCorretiva(int t) {
		if(t == 0)
			setErro("tipoMedidaCorretiva","error.tipomedidacorretivafiscalizacao.required");

		tipoMedidaCorretiva = t;
	}
	/**
	 * Get prazoDias
	 * @return int
	 */
	public int getPrazoDias() {
		return prazoDias;
	}

	/**
	 * Set prazoDias
	 * @param <code>int</code>
	 */
	public void setPrazoDias(int p) {
		if(p < 1)
			setErro("prazoDias","error.prazoDiasfiscalizacao.required");	
		
		prazoDias = p;
	}
	/**
	 * Get observacoes
	 * @return String
	 */
	public String getObservacoes() {
		return observacoes;
	}

	/**
	 * Set observacoes
	 * @param <code>String</code>
	 */
	public void setObservacoes(String o) {
		
		if(o != null && (o.trim().length() == 0 || o.length() > 255))
			setErro("observacao","error.observacaomedidacorretiva.required");
		
		observacoes = o;
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
	* Constructor
	*/
	public MedidasCorretivasInvestigacaoActionForm() {

		super();

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		tipoMedidaCorretiva = 0;
		prazoDias = 0;
		observacoes = null;
		numInvestigacao = 0;
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,31));//31 - MedidasCorretivasInvestigacao.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/

		ActionErrors localErrors;
		
		if(errors != null){
			if(acao != null && acao.equals("GRAVAR"))
				localErrors = errors;
			else
				localErrors = new ActionErrors();
		}
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
