package br.smat.web.parametrosrelatorio;

import java.util.Vector;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import br.smat.controleacesso.ejb.usuario.Usuario;
import br.smat.objetosauxiliares.auxcampo.AuxCampo;
import br.smat.web.obj.ObjPagina;

/**
 * Form bean for a Struts application.
 * Users may access 12 fields on this form:
 * <ul>
 * <li>datainicial - [your comment here]
 * <li>datafinal - [your comment here]
 * <li>agrupamento - [your comment here]
 * <li>estado - [your comment here]
 * <li>regional - [your comment here]
 * <li>municipio - [your comment here]
 * <li>campo1 - [your comment here]
 * <li>dadoscampo1 - [your comment here]
 * <li>campo2 - [your comment here]
 * <li>dadoscampo2 - [your comment here]
 * <li>titulo - [your comment here]
 * <li>texto - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class ParametrosRelatorioActionForm extends ActionForm {

	private String acao=null;
	private int periodicidade;
	private String agrupamento = null;
	private int estado;
	private int[] regional;
	private int[] regionalSelected;
	private int[] municipio;
	private int[] municipioSelected;
	private int campo1;
	private int[] dadoscampo1 = null;
	private int[] dadosCampo1Selected;
	private int campo2;
	private int[] dadoscampo2 = null;
	private int[] dadosCampo2Selected;	
	private String titulo = null;
	private String texto = null;
	private boolean zeraRegionalMunicipioSelected = false;
	private boolean zeraDadosCampo1Selected = false;
	private boolean zeraCampo2 = false;
	private boolean zeraDadosCampo2 = false;
	private boolean zeraDadosCampo2Selected = false;
	private boolean anoInicialCorreto = false; 
	private boolean anoFinalCorreto = false;
	private boolean mesAnoInicialCorreto = false; 
	private boolean mesAnoFinalCorreto = false;	
	private int	anoInicial;
	private int	anoFinal;
	private String	mesAnoInicial;
	private String	mesAnoFinal;
	private ActionErrors errors;
	
	public  final static int MAXREGISTROS = 4;






	/**
	 * Get agrupamento
	 * @return String
	 */
	public String getAgrupamento() {
		return agrupamento;
	}

	/**
	 * Set agrupamento
	 * @param <code>String</code>
	 */
	public void setAgrupamento(String a) {

		if(!a.equals(agrupamento))
			zeraRegionalMunicipioSelected = true;
		agrupamento = a;
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
			
		if(estado != e)
			zeraRegionalMunicipioSelected = true;
		estado = e;
	}
	/**
	 * Get regional
	 * @return int
	 */
	public int[] getRegional() {
		return regional;
	}

	/**
	 * Set regional
	 * @param <code>int</code>
	 */
	public void setRegional(int[] r) {

		regional = r;
	}
	/**
	 * Get municipio
	 * @return int
	 */
	public int[] getMunicipio() {
		return municipio;
	}

	/**
	 * Set municipio
	 * @param <code>int</code>
	 */
	public void setMunicipio(int[] m) {
		municipio = m;
	}
	/**
	 * Get campo1
	 * @return int
	 */
	public int getCampo1() {
		return campo1;
	}

	/**
	 * Set campo1
	 * @param <code>int</code>
	 */
	public void setCampo1(int c) {

		if(c == 0)
			setErro("campo","error.campo.required");		
		
		if(c == campo2){
			zeraCampo2 = true;
			zeraDadosCampo2Selected = true;
		}
		else{
			zeraCampo2 = false;
	//		zeraDadosCampo2Selected = false;			
		}
		
		if(c != campo1)
			zeraDadosCampo1Selected = true;

		campo1 = c;
	}
	/**
	 * Get dadoscampo1
	 * @return int
	 */
	public int[] getDadoscampo1() {
		return dadoscampo1;
	}

	/**
	 * Set dadoscampo1
	 * @param <code>int</code>
	 */
	public void setDadoscampo1(int[] d) {
		
		dadoscampo1 = d;
	}
	/**
	 * Get campo2
	 * @return int
	 */
	public int getCampo2() {
		return campo2;
	}

	/**
	 * Set campo2
	 * @param <code>int</code>
	 */
	public void setCampo2(int c) {

		if(c != campo2)
			zeraDadosCampo2Selected = true;
		else
			zeraDadosCampo2Selected = false;
		
		campo2 = c;
	}
	/**
	 * Get dadoscampo2
	 * @return String[]
	 */
	public int[] getDadoscampo2() {
		
		return dadoscampo2;
	}

	/**
	 * Set dadoscampo2
	 * @param <code>String[]</code>
	 */
	public void setDadoscampo2(int[] d) {

			
		dadoscampo2 = d;
	}
	/**
	 * Get titulo
	 * @return String
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Set titulo
	 * @param <code>String</code>
	 */
	public void setTitulo(String t) {

		if(t == null || t.trim().length() == 0){
			setErro("titulo","error.titulo.required");
			t = null;
		}
					
		titulo = t;
	}
	/**
	 * Get texto
	 * @return String
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * Set texto
	 * @param <code>String</code>
	 */
	public void setTexto(String t) {
		if(t != null)
			if(t.trim().length() == 0)
				t = null;
		texto = t;
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
	 * Returns the periodicidade.
	 * @return int
	 */
	public int getPeriodicidade() {
		return periodicidade;
	}

	/**
	 * Sets the periodicidade.
	 * @param periodicidade The periodicidade to set
	 */
	public void setPeriodicidade(int periodicidade) {
		if(periodicidade == 0)
			setErro("periodicidade","error.periodicidade.required");		
		this.periodicidade = periodicidade;
	}

	/**
	 * Returns the regionalSelected.
	 * @return int[]
	 */
	public int[] getRegionalSelected() {
		return regionalSelected;
	}

	/**
	 * Sets the regionalSelected.
	 * @param regionalSelected The regionalSelected to set
	 */
	public void setRegionalSelected(int[] regionalSelected) {
		this.regionalSelected = regionalSelected;
	}

	/**
	 * Returns the dadosCampo1Selected.
	 * @return int[]
	 */
	public int[] getDadosCampo1Selected() {
		return dadosCampo1Selected;
	}

	/**
	 * Returns the dadosCampo2Selected.
	 * @return int[]
	 */
	public int[] getDadosCampo2Selected() {
		return dadosCampo2Selected;
	}

	/**
	 * Returns the municipioSelected.
	 * @return int[]
	 */
	public int[] getMunicipioSelected() {
		return municipioSelected;
	}

	/**
	 * Sets the dadosCampo1Selected.
	 * @param dadosCampo1Selected The dadosCampo1Selected to set
	 */
	public void setDadosCampo1Selected(int[] dadosCampo1Selected) {
		
		this.dadosCampo1Selected = dadosCampo1Selected;
	}

	/**
	 * Sets the dadosCampo2Selected.
	 * @param dadosCampo2Selected The dadosCampo2Selected to set
	 */
	public void setDadosCampo2Selected(int[] dadosCampo2Selected) {
		this.dadosCampo2Selected = dadosCampo2Selected;
	}

	/**
	 * Sets the municipioSelected.
	 * @param municipioSelected The municipioSelected to set
	 */
	public void setMunicipioSelected(int[] municipioSelected) {
		this.municipioSelected = municipioSelected;
	}

	/**
	 * Returns the anoFinal.
	 * @return int
	 */
	public int getAnoFinal() {
		return anoFinal;
	}

	/**
	 * Returns the anoInicial.
	 * @return int
	 */
	public int getAnoInicial() {
		return anoInicial;
	}

	/**
	 * Sets the anoFinal.
	 * @param anoFinal The anoFinal to set
	 */
	public void setAnoFinal(int anoFinal) {

		if(periodicidade == 2){
			if(anoFinal != 0){
				if(anoFinal < 0){
					anoFinalCorreto = false;
					setErro("anoFinal","error.anofinal.invalido");
				}
				else{
					if(anoFinal < 1000){
						setErro("anoFinal","error.anofinal.4digitos");
						anoFinalCorreto = false;
					}
					else
						anoFinalCorreto = true;
				}
			}
			else{
				anoFinalCorreto = false;
				setErro("anoFinal","error.anofinal.required");
			}
		}
		this.anoFinal = anoFinal;
	}

	/**
	 * Sets the anoInicial.
	 * @param anoInicial The anoInicial to set
	 */
	public void setAnoInicial(int anoInicial) {

		if(periodicidade == 2)
			if(anoInicial != 0){
				if(anoInicial <= 0){
					anoInicialCorreto = false;
					setErro("anoInicial","error.anoinicial.invalido");
				}
				else
					if(anoInicial < 1000){
						anoInicialCorreto = false;
						setErro("anoInicial","error.anoinicial.4digitos");				
					}
					else
						anoInicialCorreto = true;
			}
			else{
				anoInicialCorreto = false;
				setErro("anoInicial","error.anoinicial.required");
			}

		this.anoInicial = anoInicial;
	}		
	/**
	 * Returns the mesAnoInicial.
	 * @return int
	 */
	public String getMesAnoInicial() {
		return mesAnoInicial;
	}

	/**
	 * Sets the mesAnoInicial.
	 * @param mesAnoInicial The mesAnoInicial to set
	 */
	public void setMesAnoInicial(String mesAnoInicial) {

		if(periodicidade == 1){
			if(mesAnoInicial == null || mesAnoInicial.equals("")){
				mesAnoInicialCorreto = false;
				setErro("mesAnoInicial","error.mesanoinicial.required");
			}
			else
				if(!validaMesAno(mesAnoInicial)){
					mesAnoInicialCorreto = false;
					setErro("mesAnoInicial","error.mesanoinicial.invalido");			
				}
				else
					mesAnoInicialCorreto = true;
		}

		this.mesAnoInicial = mesAnoInicial;
	}

	/**
	 * Returns the mesAnoFinal.
	 * @return int
	 */
	public String getMesAnoFinal() {
		return mesAnoFinal;
	}

	/**
	 * Sets the mesAnoFinal.
	 * @param mesAnoFinal The mesAnoFinal to set
	 */
	public void setMesAnoFinal(String mesAnoFinal) {

		if(periodicidade == 1){		
			if(mesAnoFinal == null || mesAnoFinal.equals("")){
				mesAnoFinalCorreto = false;
				setErro("mesAnoFinal","error.mesanofinal.required");
			}
			else
				if(!validaMesAno(mesAnoFinal)){
					mesAnoFinalCorreto = false;
					setErro("mesAnoFinal","error.mesanofinal.invalido");
				}
				else
					mesAnoFinalCorreto = true;
		}

		this.mesAnoFinal = mesAnoFinal;
	}
	
			
	/**
	* Constructor
	*/
	public ParametrosRelatorioActionForm() {

		super();

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
				request.setAttribute("permissaoPagina",ObjPagina.validaPermissaoPagina(usuario,7));//7 - ParametrosRelatorio.do
			}
			catch(Exception e){
			}
		}
/***************************
 ***************************/		
			
		System.out.println("VALIDATEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
		

		
		AuxCampo[] aRegCampo1Selected = null,aRegCampo2Selected = null;
		Vector colRegionalSelected = null,colMunicipioSelected = null;
		
		ActionErrors localErrors;

		colRegionalSelected = (Vector)request.getSession().getAttribute("colRegionalSelected");
		colMunicipioSelected = (Vector)request.getSession().getAttribute("colMunicipioSelected");
		aRegCampo1Selected = (AuxCampo[])request.getSession().getAttribute("aRegCampo1Selected");		
		aRegCampo2Selected = (AuxCampo[])request.getSession().getAttribute("aRegCampo2Selected");


		if(zeraCampo2)
			campo2 = 0;
			
		if(zeraDadosCampo2)
			dadoscampo2 = null;

		if(zeraRegionalMunicipioSelected){
				regionalSelected = null;
				
				colRegionalSelected = null;
				request.getSession().setAttribute("colRegionalSelected",colRegionalSelected);

				municipioSelected = null;
				colMunicipioSelected = null;
				request.getSession().setAttribute("colMunicipioSelected",colMunicipioSelected);									
		}
		
		if(zeraDadosCampo1Selected){
			aRegCampo1Selected = null;
			dadosCampo1Selected = null;
			dadoscampo1 = null;
			request.getSession().setAttribute("aRegCampo1Selected",aRegCampo1Selected);		
		}
			
		if(zeraDadosCampo2Selected){
			aRegCampo2Selected = null;
			dadosCampo2Selected = null;
			dadoscampo2 = null;
			request.getSession().setAttribute("aRegCampo2Selected",aRegCampo2Selected);		
		}
				


		if(agrupamento == null || agrupamento.trim().length() == 0){
			setErro("agrupamento","error.agrupamento.required");
		}
		else
		if(estado > 0){
			if(agrupamento.equals("2")){
				if(colRegionalSelected == null || colRegionalSelected.size() == 0)
					setErro("dadoscampo2","error.regional.required");
			}
			else
			if(agrupamento.equals("3"))
				if(colMunicipioSelected == null || colMunicipioSelected.size() == 0)
					setErro("dadoscampo2","error.municipio.required");				
		}
		
		if((aRegCampo1Selected == null || aRegCampo1Selected.length == 0) && campo1 > 0 )
			setErro("dadoscampo1","error.dadoscampo1.required");

		if((aRegCampo2Selected == null || aRegCampo2Selected.length == 0) && campo2 > 0 )
			setErro("dadoscampo2","error.dadoscampo2.required");

		if(periodicidade == 1 && anoInicialCorreto && anoFinalCorreto)
			if(anoInicial > anoFinal)
				setErro("anoFinal","error.anofinal.menor");

		if(periodicidade == 2 && mesAnoInicialCorreto && mesAnoFinalCorreto)
			if(!validaMesAnoInicialFinal(mesAnoInicial,mesAnoFinal))
				setErro("mesAnoFinal","error.mesanofinal.menor");

		if(acao != null){
			if(!acao.equals("GRAVAR") && !acao.equals("SALVAR")){
				errors = null;
				if(acao.equals("LIMPAR") || acao.equals("NOVO"))
					agrupamento = null;
				else
					if(acao.equals("ADDCAMPO1")){
						String erro = verificaQuantMaxRegCampo("dadoscampo1",aRegCampo1Selected,aRegCampo2Selected,dadoscampo1);
						if(erro != null){
							dadoscampo1 = null;
							setErro("dadoscampo1",erro);
						}
						
					}
					else
					if(acao.equals("ADDCAMPO2")){
						String erro = verificaQuantMaxRegCampo("dadoscampo2",aRegCampo1Selected,aRegCampo2Selected,dadoscampo2);
						if(erro != null){
							dadoscampo2 = null;
							setErro("dadoscampo2",erro);
						}
					}
			}
		}
		else
			errors = null;
				
		if(errors != null)
			localErrors = errors;
		else
			localErrors = new ActionErrors();
		
		errors = null;			
		
		return localErrors;

	} 


	public void apaga()
	{
		acao = null;
	//	periodicidade = 0;
	//	agrupamento = null;
	//	estado = 0;
		regional = null;
		municipio = null;
	//	campo1 = 0;
		dadoscampo1 = null;
	//	campo2 = 0;
		dadoscampo2 = null;
		titulo = null;
		texto = null;	
		zeraRegionalMunicipioSelected = false;
		zeraDadosCampo2 = false;
		regionalSelected = null;
		zeraDadosCampo1Selected = false;
	}

	public void apagaTudo()
	{
		String acao=null;
		periodicidade = 0;
		agrupamento = null;
		estado = 0;
		regional = null;
		regionalSelected = null;
		municipio = null;
		municipioSelected = null;
		campo1 = 0;
		dadoscampo1 = null;
		dadosCampo1Selected = null;
		campo2 = 0;
		dadoscampo2 = null;
		dadosCampo2Selected = null;	
		titulo = null;
		texto = null;
		zeraRegionalMunicipioSelected = false;
		zeraDadosCampo1Selected = false;
		zeraCampo2 = false;
		zeraDadosCampo2 = false;
		zeraDadosCampo2Selected = false;
		anoInicialCorreto = false; 
		anoFinalCorreto = false;
		mesAnoInicialCorreto = false; 
		mesAnoFinalCorreto = false;	
		anoInicial = 0;
		anoFinal = 0;
		mesAnoInicial = null;
		mesAnoFinal = null;
	}	
	
	public void setErro(String campo,String erro){
		if(errors == null)
			errors = new ActionErrors();

			errors.add(campo,new ActionError(erro));
	}
	
	public String verificaQuantMaxRegCampo(String campo,AuxCampo[] aRegCampo1Selected,AuxCampo[] aRegCampo2Selected,int[] dadoscampo){
		
		String erro = null;
		
		int total = 0,vRegCampo1 = 0,vRegCampo2 = 0,aRegCampo2 = 0,aux=0;
		
		if(aRegCampo1Selected != null)
				vRegCampo1 = aRegCampo1Selected.length;
		
		if(aRegCampo2Selected != null)
			vRegCampo2 = aRegCampo2Selected.length;

		if(dadoscampo != null)
			aRegCampo2 = dadoscampo.length;


		total = vRegCampo1 + vRegCampo2 + aRegCampo2;
		
		if(total > MAXREGISTROS){
			
			if(campo.equals("dadoscampo1"))
				aux = vRegCampo2;
			else
				if(campo.equals("dadoscampo2"))
					aux = vRegCampo1;

			erro = "error.dadoscampos.maxregistros";
			/*switch(aux){

				case 1:
					erro = "error." + campo + ".maxregistros3";
					break;
				case 2:
					erro = "error." + campo + ".maxregistros2";
					break;
				case 3:
					erro = "error." + campo + ".maxregistros1";
					break;
				case 4:
					erro = "error." + campo + ".maxregistros1";
					break;
			}*/
		}

		return erro;
	}


	public boolean validaMesAno(String mesAno){
		
		int mes=0,ano=0;

		if(mesAno.length() != 7)
			return false;

		
		if(mesAno.indexOf('-') != -1)
			return false;

		
		if(mesAno.charAt(2) != '/')
			return false;

			
		try{
			mes = Integer. parseInt(mesAno.substring(0,2));
			ano = Integer. parseInt(mesAno.substring(3,7));
		}catch(NumberFormatException e){			
			return false;
		}

		if(mes > 12)			
			return false;


		if(ano < 1000 || ano > 9999)
			return false;


		return true;
	}

	public boolean validaMesAnoInicialFinal(String mesAnoInicial, String mesAnoFinal){

		int	mesInicial = Integer. parseInt(mesAnoInicial.substring(0,2));
		int	anoInicial = Integer. parseInt(mesAnoInicial.substring(3,7));
		int	mesFinal = Integer. parseInt(mesAnoFinal.substring(0,2));
		int	anoFinal = Integer. parseInt(mesAnoFinal.substring(3,7));
		
		if(anoFinal < anoInicial)
			return false;

		if(anoInicial == anoFinal)
			if(mesFinal < mesInicial)
				return false;
		
		return true;
	}
}