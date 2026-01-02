package br.smat.web.acidentepassoum;

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
 * Users may access 29 fields on this form:
 * <ul>
 * <li>emitente - [your comment here]
 * <li>documento - [your comment here]
 * <li>razaoSocial - [your comment here]
 * <li>nome - [your comment here]
 * <li>dataNascimento - [your comment here]
 * <li>sexo - [your comment here]
 * <li>estadoCivil - [your comment here]
 * <li>ctps - [your comment here]
 * <li>serie - [your comment here]
 * <li>dataEmissaoCTPS - [your comment here]
 * <li>ufCTPS - [your comment here]
 * <li>remuneracaoMensal - [your comment here]
 * <li>rg - [your comment here]
 * <li>dataEmissaoRG - [your comment here]
 * <li>ufRG - [your comment here]
 * <li>cpf - [your comment here]
 * <li>pisPasepNit - [your comment here]
 * <li>estado - [your comment here]
 * <li>municipio - [your comment here]
 * <li>rua - [your comment here]
 * <li>numero - [your comment here]
 * <li>bairro - [your comment here]
 * <li>complemento - [your comment here]
 * <li>cep - [your comment here]
 * <li>ddd - [your comment here]
 * <li>telefone - [your comment here]
 * <li>ocupacao - [your comment here]
 * <li>area - [your comment here]
 * <li>aposentado - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class AcidentePassoUmActionForm extends ActionForm {

	private String	acao = null;
	private int	acidente = 0;
	private int 	empresa	 = 0;
	private int	emitente = 0;
	private String documento = null;
	private String razaoSocial = null;
	private String nome = null;
	private String nomeResponsavel = null;	
	private String dataNascimento = null;
	private String sexo = null;
	private int	estadoCivil = 0;
	private int	ctps;
	private int	serie;
	private String dataEmissaoCTPS = null;
	private int	ufCTPS = 0;
	private String remuneracaoMensal;
	private String rg = null;
	private String orgaoExpedidorRG = null;	
	private String dataEmissaoRG = null;
	private int	ufRG = 0;
	private String cpf = null;
	private String pisPasepNit = null;
	private int	estado = 0;
	private int	municipio = 0;
	private String rua = null;
	private int	numero = 0;
	private String bairro = null;
	private String complemento = null;
	private String cep = null;
	private String ddd = null;
	private String telefone = null;
	private int	vinculoEmpregaticio = 0;	
	private int 	ocupacao = 0;
	private int 	area = 0;
	private char 	aposentado = ' ';
	private String	destino = null;
	private String	paginaAtual = null;
	private int	trabalhador = 0;
	private char   flagRetorno = 'N';

	private ActionErrors errors;

	private String dataAtual;

	/**
	 * Get emitente
	 * @return int
	 */
	public int getEmitente() {
		return emitente;
	}

	/**
	 * Set emitente
	 * @param <code>int</code>
	 */
	public void setEmitente(int e) {

		if(e == 0)
			setErro("emitente","error.emitente.required");
		
		emitente = e;
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
					
		documento = d;
	}
	/**
	 * Get razaoSocial
	 * @return String
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * Set razaoSocial
	 * @param <code>String</code>
	 */
	public void setRazaoSocial(String r) {
		razaoSocial = r;
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
		if(n == null || n.trim().length() == 0)
			setErro("nome","error.nometrabalhador.required");
		
		nome = n;
	}
	/**
	 * Get dataNascimento
	 * @return String
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * Set dataNascimento
	 * @param <code>String</code>
	 */
	public void setDataNascimento(String d) {
		String erro = null;
		if(d != null){
			if((erro = FuncoesComuns.validateData(d,"datanascimento")) != null )
				setErro("dataNascimento",erro);

			if(ValidacoesFormulario.comparaDatas(d,dataAtual) == 1)
				setErro("dataNascimento","error.datanascimento.datainfmaiorqueatual");
		}

		dataNascimento = d;
	}
	/**
	 * Get sexo
	 * @return String
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Set sexo
	 * @param <code>String</code>
	 */
	public void setSexo(String s) {
		sexo = s;
	}
	/**
	 * Get estadoCivil
	 * @return int
	 */
	public int getEstadoCivil() {
		return estadoCivil;
	}

	/**
	 * Set estadoCivil
	 * @param <code>int</code>
	 */
	public void setEstadoCivil(int e) {
		
//		if(e == 0)
//			setErro("estadoCivil","error.estadocivil.required");
		
		estadoCivil = e;
	}
	/**
	 * Get ctps
	 * @return String
	 */
	public int getCtps() {
		return ctps;
	}

	/**
	 * Set ctps
	 * @param <code>String</code>
	 */
	public void setCtps(int c) {
		ctps = c;
	}
	/**
	 * Get serie
	 * @return String
	 */
	public int getSerie() {
		return serie;
	}

	/**
	 * Set serie
	 * @param <code>String</code>
	 */
	public void setSerie(int s) {
		serie = s;
	}
	/**
	 * Get dataEmissaoCTPS
	 * @return String
	 */
	public String getDataEmissaoCTPS() {
		return dataEmissaoCTPS;
	}

	/**
	 * Set dataEmissaoCTPS
	 * @param <code>String</code>
	 */
	public void setDataEmissaoCTPS(String d) {
		String erro = null;
		if(d != null)
			if(d.trim().length() > 0)
				if((erro = FuncoesComuns.validateData(d,"dataemissaoctps")) != null )
					setErro("dataEmissaoCTPS",erro);
				else
					if(ValidacoesFormulario.comparaDatas(d,dataAtual) == 1)
						setErro("dataEmissaoCTPS","error.dataEmissaoCTPS.datainfmaiorqueatual");
		
		dataEmissaoCTPS = d;
	}
	/**
	 * Get ufCTPS
	 * @return int
	 */
	public int getUfCTPS() {
		return ufCTPS;
	}

	/**
	 * Set ufCTPS
	 * @param <code>int</code>
	 */
	public void setUfCTPS(int u) {
		ufCTPS = u;
	}
	/**
	 * Get remuneracaoMensal
	 * @return String
	 */
	public String getRemuneracaoMensal() {
		return remuneracaoMensal;
	}

	/**
	 * Set remuneracaoMensal
	 * @param <code>String</code>
	 */
	public void setRemuneracaoMensal(String r) {
		String erro;
		
		if(r != null)
			if(r.length() > 0)
				if((erro = FuncoesComuns.validaValores(r,"remuneracaomensal")) != null)
					setErro("remuneracaoMensal",erro);
		
		remuneracaoMensal = r;
	}
	/**
	 * Get rg
	 * @return String
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * Set rg
	 * @param <code>String</code>
	 */
	public void setRg(String r) {
		rg = r;
	}
	/**
	 * Get dataEmissaoRG
	 * @return String
	 */
	public String getDataEmissaoRG() {		
		return dataEmissaoRG;
	}

	/**
	 * Set dataEmissaoRG
	 * @param <code>String</code>
	 */
	public void setDataEmissaoRG(String d) {
		String erro = null;
		if(d != null)
			if(d.trim().length() > 0)
				if((erro = FuncoesComuns.validateData(d,"dataemissaorg")) != null )
					setErro("dataEmissaorg",erro);
				else
					if(ValidacoesFormulario.comparaDatas(d,dataAtual) == 1)
						setErro("dataEmissaorg","error.dataEmissaorg.datainfmaiorqueatual");
		
		dataEmissaoRG = d;
	}
	/**
	 * Get ufRG
	 * @return int
	 */
	public int getUfRG() {
		return ufRG;
	}

	/**
	 * Set ufRG
	 * @param <code>int</code>
	 */
	public void setUfRG(int u) {
		ufRG = u;
	}
	/**
	 * Get cpf
	 * @return String
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Set cpf
	 * @param <code>String</code>
	 */
	public void setCpf(String c) {
		
		if(c != null){
			if(c.trim().length() > 0){
				if(ValidacoesFormulario.validaCPF(c))
					c = ValidacoesFormulario.formataCPF(c);
				else
					setErro("cpf","error.cpf.invalido");
			}
		}
		
		cpf = c;
	}
	/**
	 * Get pisPasepNit
	 * @return String
	 */
	public String getPisPasepNit() {
		return pisPasepNit;
	}

	/**
	 * Set pisPasepNit
	 * @param <code>String</code>
	 */
	public void setPisPasepNit(String p) {
		pisPasepNit = p;
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
		rua = r;
	}
	/**
	 * Get numero
	 * @return String
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Set numero
	 * @param <code>String</code>
	 */
	public void setNumero(int n) {
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
		complemento = c;
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
		
		if(c != null)
		if(c.trim().length() > 0)
			if((erro = FuncoesComuns.validateCEP(c,"ceptrabalhador")) != null)
				setErro("ceptrabalhador",erro);	
		
		cep = c;
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
			if(d.trim().length() > 0)
				if(ValidacoesFormulario.retiraCharAlfabeticos(d).length() < 2)
					setErro("dddTrabalhador","error.dddtrabalhador.required");
			
		ddd = d;
	}
	/**
	 * Get telefone
	 * @return String
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Set telefone
	 * @param <code>String</code>
	 */
	public void setTelefone(String t) {
		String erro;
		
		if(t != null)
			if(t.trim().length() > 0)
				if((erro=FuncoesComuns.validateTelefone(t,"telefonetrabalhador")) != null)
					setErro("telefoneTrabalhador",erro);
			
		telefone = t;
	}
	/**
	 * Get ocupacao
	 * @return int
	 */
	public int getOcupacao() {
		return ocupacao;
	}

	/**
	 * Set ocupacao
	 * @param <code>int</code>
	 */
	public void setOcupacao(int o) {
		
		if(o == 0)
			setErro("ocupacao","error.ocupacao.required");
		
		ocupacao = o;
	}
	/**
	 * Get area
	 * @return int
	 */
	public int getArea() {
		return area;
	}

	/**
	 * Set area
	 * @param <code>int</code>
	 */
	public void setArea(int a) {
		
		if(a == 0)
			setErro("area","error.area.required");			
		
		area = a;
	}
	/**
	 * Get aposentado
	 * @return int
	 */
	public char getAposentado() {
		return aposentado;
	}

	/**
	 * Set aposentado
	 * @param <code>int</code>
	 */
	public void setAposentado(char a) {
		aposentado = a;
	}
	
	/**
	 * Returns the acao.
	 * @return String
	 */
	public String getAcao() {
		return acao;
	}

	/**
	 * Returns the acidente.
	 * @return int
	 */
	public int getAcidente() {
		return acidente;
	}

	/**
	 * Sets the acao.
	 * @param acao The acao to set
	 */
	public void setAcao(String acao) {
		this.acao = acao;
	}

	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(int acidente) {
		this.acidente = acidente;
	}	
	
	/**
	 * Returns the vinculoEmpregaticio.
	 * @return int
	 */
	public int getVinculoEmpregaticio() {
		return vinculoEmpregaticio;
	}

	/**
	 * Sets the vinculoEmpregaticio.
	 * @param vinculoEmpregaticio The vinculoEmpregaticio to set
	 */
	public void setVinculoEmpregaticio(int vinculoEmpregaticio) {
		
		if(vinculoEmpregaticio == 0)
			setErro("vinculoEmpregaticio","error.vinculoEmpregaticio.required");
		
		this.vinculoEmpregaticio = vinculoEmpregaticio;
	}

	/**
	 * Returns the empresa.
	 * @return int
	 */
	public int getEmpresa() {
		return empresa;
	}

	/**
	 * Sets the empresa.
	 * @param empresa The empresa to set
	 */
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
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
	 * Returns the trabalhador.
	 * @return int
	 */
	public int getTrabalhador() {
		return trabalhador;
	}

	/**
	 * Sets the trabalhador.
	 * @param trabalhador The trabalhador to set
	 */
	public void setTrabalhador(int trabalhador) {
		this.trabalhador = trabalhador;
	}

	/**
	 * Returns the flagRetorno.
	 * @return char
	 */
	public char getFlagRetorno() {
		return flagRetorno;
	}

	/**
	 * Sets the flagRetorno.
	 * @param flagRetorno The flagRetorno to set
	 */
	public void setFlagRetorno(char flagRetorno) {
		this.flagRetorno = flagRetorno;
	}
	
	/**
	 * Returns the nomeResponsavel.
	 * @return String
	 */
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	/**
	 * Sets the nomeResponsavel.
	 * @param nomeResponsavel The nomeResponsavel to set
	 */
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	/**
	 * Returns the orgaoExpedidorRG.
	 * @return String
	 */
	public String getOrgaoExpedidorRG() {
		return orgaoExpedidorRG;
	}

	/**
	 * Sets the orgaoExpedidorRG.
	 * @param orgaoExpedidorRG The orgaoExpedidorRG to set
	 */
	public void setOrgaoExpedidorRG(String orgaoExpedidorRG) {
		this.orgaoExpedidorRG = orgaoExpedidorRG;
	}
		
	/**
	* Constructor
	*/
	public AcidentePassoUmActionForm() {

		super();
		try{
			dataAtual = ObjGenerico.getDataAtual();
		}catch(Exception e){setErro("dataatual","error.bancodedados");}
	}
	
	public void apaga(){
		
		acao = "LISTAR";
		acidente = 0;
		empresa = 0;
		emitente = 0;
		documento = null;
		razaoSocial = null;
		nome = null;
		dataNascimento = null;
		sexo = null;
		estadoCivil = 0;
		ctps = 0;
		serie = 0;
		dataEmissaoCTPS = null;
		ufCTPS = 0;
		remuneracaoMensal = null;
		rg = null;
		dataEmissaoRG = null;
		ufRG = 0;
		cpf = null;
		pisPasepNit = null;
		estado = 0;
		municipio = 0;
		rua = null;
		numero = 0;
		bairro = null;
		complemento = null;
		cep = null;
		ddd = null;
		telefone = null;
		ocupacao = 0;
		vinculoEmpregaticio = 0;		
		area = 0;
		aposentado = ' ';	
		errors = null;	
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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,1));//1 - AcidentePassoUm.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/
		
		
		ActionErrors localErrors;

		System.out.println("acao " + acao);
	
		if(acao != null && acao.equalsIgnoreCase("AVANCAR")){
			if(sexo == null || (!sexo.equalsIgnoreCase("M")  && !sexo.equalsIgnoreCase("F")))
				setErro("sexo","error.sexo.required");		
			
			System.out.println("aposentado " + aposentado);	
				
			if(aposentado != 'X' && aposentado != 'S' && aposentado != 'N')
				setErro("aposentado","error.aposentado.required");
		}

		
		if(acao != null)
			if(!acao.equals("AVANCAR"))
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
