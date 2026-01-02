package br.smat.web.acidentepassoquatro;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.util.FuncoesComuns;
import br.smat.util.ValidacoesFormulario;
import br.smat.web.obj.ObjGenerico;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 18 fields on this form:
 * <ul>
 * <li>acao - [your comment here]
 * <li>acidente - [your comment here]
 * <li>medico - [your comment here]
 * <li>localAtendimento - [your comment here]
 * <li>dataAtestado - [your comment here]
 * <li>horaAtestado - [your comment here]
 * <li>internacao - [your comment here]
 * <li>obito - [your comment here]
 * <li>duracaoTratamento - [your comment here]
 * <li>descNaturezaLesao - [your comment here]
 * <li>diagnostico - [your comment here]
 * <li>observacoes - [your comment here]
 * <li>crm - [your comment here]
 * <li>ufCRM - [your comment here]
 * <li>medicoNome - [your comment here]
 * <li>fonte - [your comment here]
 * <li>numDocFonte - [your comment here]
 * <li>dataEmissaoFonte - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class AcidentePassoQuatroActionForm extends ActionForm {

	private String acao = null;
	private int	acidente = 0;
	private int	medico = 0;
	private int 	localAtendimento;
	private String dataAtestado = null;
	private String horaAtestado = null;
	private char   internacao;
	private char   afastamento;
	private int 	duracaoTratamento = 0;
	private String descNaturezaLesao = null;
	private int 	diagnostico;
	private String observacoes = null;
	private int	crm = 0;
	private int 	ufCRM;
	private String medicoNome = null;
	private int 	fonte;
	private String numDocFonte = null;
	private String dataEmissaoFonte = null;
	private String	destino = null;	
	private String	paginaAtual = null;
	private String descricaoDiagnostico = null;
		
	private ActionErrors errors;

	private String dataAtual;


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
	 * Get medico
	 * @return String
	 */
	public int getMedico() {
		return medico;
	}

	/**
	 * Set medico
	 * @param <code>String</code>
	 */
	public void setMedico(int m) {
		medico = m;
	}
	/**
	 * Get localAtendimento
	 * @return int
	 */
	public int getLocalAtendimento() {
		return localAtendimento;
	}

	/**
	 * Set localAtendimento
	 * @param <code>int</code>
	 */
	public void setLocalAtendimento(int l) {
		localAtendimento = l;
	}
	/**
	 * Get dataAtestado
	 * @return String
	 */
	public String getDataAtestado() {
		return dataAtestado;
	}

	/**
	 * Set dataAtestado
	 * @param <code>String</code>
	 */
	public void setDataAtestado(String d) {
		String erro = null;
		if(d != null)
			if(d.trim().length() > 0)
				if((erro = FuncoesComuns.validateData(d,"dataatestado")) != null )
					setErro("dataatestado",erro);
				else
					if(ValidacoesFormulario.comparaDatas(d,dataAtual) == 1)
						setErro("dataatestado","error.dataatestado.datainfmaiorqueatual");
		dataAtestado = d;
	}
	/**
	 * Get horaAtestado
	 * @return String
	 */
	public String getHoraAtestado() {
		return horaAtestado;
	}

	/**
	 * Set horaAtestado
	 * @param <code>String</code>
	 */
	public void setHoraAtestado(String h) {
		String erro = null;
		if(h != null)
			if(h.trim().length() > 0)
				if((erro = FuncoesComuns.validateHora(h,"horaatestado")) != null )
					setErro("horaatestado",erro);		

		horaAtestado = h;
	}
	/**
	 * Get internacao
	 * @return int
	 */
	public char getInternacao() {
		return internacao;
	}

	/**
	 * Set internacao
	 * @param <code>int</code>
	 */
	public void setInternacao(char i) {
		internacao = i;
	}
	/**
	 * Get obito
	 * @return int
	 */
	public char getAfastamento() {
		return afastamento;
	}

	/**
	 * Set obito
	 * @param <code>int</code>
	 */
	public void setAfastamento(char o) {
		afastamento = o;
	}
	/**
	 * Get duracaoTratamento
	 * @return String
	 */
	public int getDuracaoTratamento() {
		return duracaoTratamento;
	}

	/**
	 * Set duracaoTratamento
	 * @param <code>String</code>
	 */
	public void setDuracaoTratamento(int d) {
		duracaoTratamento = d;
	}
	/**
	 * Get descNaturezaLesao
	 * @return String
	 */
	public String getDescNaturezaLesao() {
		return descNaturezaLesao;
	}

	/**
	 * Set descNaturezaLesao
	 * @param <code>String</code>
	 */
	public void setDescNaturezaLesao(String d) {
		if(d != null)
			if(d.trim().length() > 0)
				if(FuncoesComuns.isNumeric(d.trim()))
					setErro("descricaonaturezalesao","error.descricaonaturezalesao.invalida");
				else
				if(d.length() >= 255)
					setErro("descricaonaturezalesao","error.descricaonaturezalesao.maiorquepermitido");
							
		descNaturezaLesao = d;
	}
	/**
	 * Get diagnostico
	 * @return int
	 */
	public int getDiagnostico() {
		return diagnostico;
	}

	/**
	 * Set diagnostico
	 * @param <code>int</code>
	 */
	public void setDiagnostico(int d) {
		
		if(d == 0)
			setErro("diagnostico","error.diagnostico.required");
		
		diagnostico = d;
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
	public void setObservacoes(String d) {
		
		if(d != null)
			if(d.trim().length() > 0)
				if(FuncoesComuns.isNumeric(d.trim()))
					setErro("descricaonaturezalesao","error.observacoes.invalida");
				else
				if(d.length() >= 255)
					setErro("descricaonaturezalesao","error.observacoes.maiorquepermitido");
							
		observacoes = d;
	}
	/**
	 * Get crm
	 * @return String
	 */
	public int getCrm() {
		return crm;
	}

	/**
	 * Set crm
	 * @param <code>String</code>
	 */
	public void setCrm(int c) {
		crm = c;
	}
	/**
	 * Get ufCRM
	 * @return int
	 */
	public int getUfCRM() {
		return ufCRM;
	}

	/**
	 * Set ufCRM
	 * @param <code>int</code>
	 */
	public void setUfCRM(int u) {
		ufCRM = u;
	}
	/**
	 * Get medicoNome
	 * @return String
	 */
	public String getMedicoNome() {
		return medicoNome;
	}

	/**
	 * Set medicoNome
	 * @param <code>String</code>
	 */
	public void setMedicoNome(String m) {
		medicoNome = m;
	}
	/**
	 * Get fonte
	 * @return int
	 */
	public int getFonte() {
		return fonte;
	}

	/**
	 * Set fonte
	 * @param <code>int</code>
	 */
	public void setFonte(int f) {
		
		if(f == 0)
			setErro("fonte","error.fonte.required");
		
		fonte = f;
	}
	/**
	 * Get numDocFonte
	 * @return String
	 */
	public String getNumDocFonte() {
		return numDocFonte;
	}

	/**
	 * Set numDocFonte
	 * @param <code>String</code>
	 */
	public void setNumDocFonte(String n) {
		
		if(n != null)
			if(n.trim().length() == 0)
				setErro("numdocfonte","error.fontedocumento.required");
		
		numDocFonte = n;
	}
	/**
	 * Get dataEmissaoFonte
	 * @return String
	 */
	public String getDataEmissaoFonte() {
		return dataEmissaoFonte;
	}

	/**
	 * Set dataEmissaoFonte
	 * @param <code>String</code>
	 */
	public void setDataEmissaoFonte(String d) {
		String erro = null;
		if(d != null)
			if((erro = FuncoesComuns.validateData(d,"datafonte")) != null )
				setErro("dataFonte",erro);
			else
				if(ValidacoesFormulario.comparaDatas(d,dataAtual) == 1)
					setErro("dataFonte","error.dataFonte.datainfmaiorqueatual");
		dataEmissaoFonte = d;
	}
	/**
	* Constructor
	*/
	public AcidentePassoQuatroActionForm() {

		super();
		try{
			dataAtual = ObjGenerico.getDataAtual();
		}catch(Exception e){setErro("dataatual","error.bancodedados");}

	}
	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		acao = null;
		acidente = 0;
		medico = 0;
		localAtendimento = 0;
		dataAtestado = null;
		horaAtestado = null;
		internacao = 0;
		afastamento = 0;
		duracaoTratamento = 0;
		descNaturezaLesao = null;
		diagnostico = 0;
		observacoes = null;
		crm = 0;
		ufCRM = 0;
		medicoNome = null;
		fonte = 0;
		numDocFonte = null;
		dataEmissaoFonte = null;

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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,4));//4 - AcidentePassoQuatro.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/			

		ActionErrors localErrors = null;
		
		if(acao != null)
			if(!acao.equalsIgnoreCase("AVANCAR"))
				errors = null;
			else{
				
				if((dataAtestado == null || dataAtestado.trim().length() == 0) && 
				   (horaAtestado != null && horaAtestado.trim().length() > 0))
				   setErro("datahoraatestado","error.datahoraatestado.invalida");
				   
				if((horaAtestado == null || horaAtestado.trim().length() ==0) &&
				   (dataAtestado != null && dataAtestado.trim().length() > 0))
				   setErro("datahoraatestado","error.datahoraatestado.invalida");
									
				if(internacao != 'S' && internacao != 'N' && internacao != 'X')
					setErro("amputacao","error.internacao.required");

				if(afastamento != 'S' && afastamento != 'N' && afastamento != 'X')
					setErro("obito","error.afastamento.required");										
			}		

		if(acao != null)
			if(!acao.equalsIgnoreCase("AVANCAR"))
				errors = null;
	
		if(errors != null)
			localErrors = errors;
		else
			localErrors = new ActionErrors();
		
		errors = null;				
		
		return localErrors;
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

	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
	}	

	/**
	 * Returns the descricaoDiagnostico.
	 * @return String
	 */
	public String getDescricaoDiagnostico() {
		return descricaoDiagnostico;
	}

	/**
	 * Sets the descricaoDiagnostico.
	 * @param descricaoDiagnostico The descricaoDiagnostico to set
	 */
	public void setDescricaoDiagnostico(String d) {
		
		if(d != null)
			if(d.trim().length() > 0)
				if(FuncoesComuns.isNumeric(d.trim()))
					setErro("descricaonaturezalesao","error.descdiagnostico.invalida");
				else
				if(d.length() >= 255)
					setErro("descricaonaturezalesao","error.descdiagnostico.maiorquepermitido");		
		
		this.descricaoDiagnostico = d;
	}

}
