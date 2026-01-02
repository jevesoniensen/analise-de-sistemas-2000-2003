package br.smat.objetosauxiliares.auxpesquisaacidente;

import java.io.Serializable;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxPesquisaAcidente implements Serializable {
	
		private int estado;
		private String nomeEstado;
		private int regional;
		private String nomeRegional;
		private int municipio;
		private String nomeMunicipio;
		private int area;
		private String nomeArea;
		private int tipoAcidente;
		private String nomeTipoAcidente;
		private int diagnostico;
		private String nomeDiagnostico;
		private String dataAcidente;
		private int acidente;
		private int trabalhador;
		private String nomeTrabalhador;
		private String obito;
		private String amputacao;
		private String registroPolicial;
		private String internacao;
		private int fonte;
		private String nomeFonte;

	public AuxPesquisaAcidente(int estado,
								 String nomeEstado,
								 int regional,
								 String nomeRegional,
								 int municipio,
								 String nomeMunicipio,
								 int area,
								 String nomeArea,
								 int tipoAcidente,
								 String nomeTipoAcidente,
								 int diagnostico,
								 String nomeDiagnostico,
								 String dataAcidente,
							 	 int acidente,
								 int trabalhador,
								 String nomeTrabalhador,
								 String obito,
								 String amputacao,
								 String registroPolicial,
								 String internacao,
								 int fonte,
								 String nomeFonte){
		setEstado(estado);
		setNomeEstado(nomeEstado);
		setRegional(regional);
		setNomeRegional(nomeRegional);
		setMunicipio(municipio);
		setNomeMunicipio(nomeMunicipio);
		setArea(area);
		setNomeArea(nomeArea);
		setTipoAcidente(tipoAcidente);
		setNomeTipoAcidente(nomeTipoAcidente);
		setDiagnostico(diagnostico);
		setNomeDiagnostico(nomeDiagnostico);
		setDataAcidente(dataAcidente);
		setAcidente(acidente);
		setTrabalhador(trabalhador);
		setNomeTrabalhador(nomeTrabalhador);
		setObito(obito);
		setAmputacao(amputacao);
		setRegistroPolicial(registroPolicial);
		setInternacao(internacao);
		setFonte(fonte);
		setNomeFonte(nomeFonte);
		
	}
		/**
		 * Returns the acidente.
		 * @return int
		 */
		public int getAcidente() {
			return acidente;
		}

		/**
		 * Returns the amputacao.
		 * @return String
		 */
		public String getAmputacao() {
			
			String a = null;
			
			if(amputacao.equals("S"))
				a = "Sim";
			else
				if(amputacao.equals("N"))
					a = "Não";
				else
					if(amputacao.equals("X"))
						a = "Não informado";

			return a;
		}

		/**
		 * Returns the area.
		 * @return int
		 */
		public int getArea() {
			return area;
		}

		/**
		 * Returns the dataAcidente.
		 * @return String
		 */
		public String getDataAcidente() {
			return dataAcidente;
		}

		/**
		 * Returns the diagnostico.
		 * @return int
		 */
		public int getDiagnostico() {
			return diagnostico;
		}

		/**
		 * Returns the estado.
		 * @return int
		 */
		public int getEstado() {
			return estado;
		}

		/**
		 * Returns the fonte.
		 * @return int
		 */
		public int getFonte() {
			return fonte;
		}

		/**
		 * Returns the internacao.
		 * @return String
		 */
		public String getInternacao() {
			
			String i = null;
			
			if(internacao.equals("S"))
				i = "Sim";
			else
				if(internacao.equals("N"))
					i = "Não";
				else
					if(internacao.equals("X"))
						i = "Não informado";					

			return i;

		}

		/**
		 * Returns the municipio.
		 * @return int
		 */
		public int getMunicipio() {
			return municipio;
		}

		/**
		 * Returns the nomeArea.
		 * @return String
		 */
		public String getNomeArea() {
			
			String a = null;
			
			if(nomeArea == null)
				return "";
			else
				return nomeArea;
		}

		/**
		 * Returns the nomeDiagnostico.
		 * @return String
		 */
		public String getNomeDiagnostico() {

			String d = null;
			
			if(nomeDiagnostico == null)
				return "";
			else
				return nomeDiagnostico;
		}

		/**
		 * Returns the nomeEstado.
		 * @return String
		 */
		public String getNomeEstado() {
			
			String e = null;
			
			if(nomeEstado == null)
				return "";
			else
				return nomeEstado;	

		}

		/**
		 * Returns the nomeFonte.
		 * @return String
		 */
		public String getNomeFonte() {

			String f = null;
			
			if(nomeFonte == null)
				return "";
			else
				return nomeFonte;
			
		}

		/**
		 * Returns the nomeMunicipio.
		 * @return String
		 */
		public String getNomeMunicipio() {

			String m = null;
			
			if(nomeMunicipio == null)
				return "";
			else
				return nomeMunicipio;			
		}

		/**
		 * Returns the nomeRegional.
		 * @return String
		 */
		public String getNomeRegional() {

			String r = null;
			
			if(nomeRegional == null)
				return "";
			else
				return nomeRegional;
		}

		/**
		 * Returns the nomeTipoacidente.
		 * @return String
		 */
		public String getNomeTipoAcidente() {

			String t = null;
			
			if(nomeTipoAcidente == null)
				return "";
			else
				return nomeTipoAcidente;
			
		}

		/**
		 * Returns the nomeTrabalhador.
		 * @return String
		 */
		public String getNomeTrabalhador() {

			String t = null;
			
			if(nomeTrabalhador == null)
				return "";
			else
				return nomeTrabalhador;
		}

		/**
		 * Returns the obito.
		 * @return String
		 */
		public String getObito() {

			String o = null;
			
			if(obito.equals("S"))
				o = "Sim";
			else
				if(obito.equals("N"))
					o = "Não";
				else
					if(obito.equals("X"))
						o = "Não informado";

			return o;

		}

		/**
		 * Returns the regional.
		 * @return int
		 */
		public int getRegional() {
			return regional;
		}

		/**
		 * Returns the registroPolicial.
		 * @return String
		 */
		public String getRegistroPolicial() {

			String r = null;
			
			if(registroPolicial.equals("S"))
				r = "Sim";
			else
				if(registroPolicial.equals("N"))
					r = "Não";
				else
					if(registroPolicial.equals("X"))
						r = "Não informado";					

			return r;

		}

		/**
		 * Returns the tipoacidente.
		 * @return int
		 */
		public int getTipoAcidente() {
			return tipoAcidente;
		}

		/**
		 * Returns the trabalhador.
		 * @return int
		 */
		public int getTrabalhador() {
			return trabalhador;
		}

		/**
		 * Sets the acidente.
		 * @param acidente The acidente to set
		 */
		public void setAcidente(int acidente) {
			this.acidente = acidente;
		}

		/**
		 * Sets the amputacao.
		 * @param amputacao The amputacao to set
		 */
		public void setAmputacao(String amputacao) {
			this.amputacao = amputacao;
		}

		/**
		 * Sets the area.
		 * @param area The area to set
		 */
		public void setArea(int area) {
			this.area = area;
		}

		/**
		 * Sets the dataAcidente.
		 * @param dataAcidente The dataAcidente to set
		 */
		public void setDataAcidente(String dataAcidente) {
			this.dataAcidente = dataAcidente;
		}

		/**
		 * Sets the diagnostico.
		 * @param diagnostico The diagnostico to set
		 */
		public void setDiagnostico(int diagnostico) {
			this.diagnostico = diagnostico;
		}

		/**
		 * Sets the estado.
		 * @param estado The estado to set
		 */
		public void setEstado(int estado) {
			this.estado = estado;
		}

		/**
		 * Sets the fonte.
		 * @param fonte The fonte to set
		 */
		public void setFonte(int fonte) {
			this.fonte = fonte;
		}

		/**
		 * Sets the internacao.
		 * @param internacao The internacao to set
		 */
		public void setInternacao(String internacao) {
			this.internacao = internacao;
		}

		/**
		 * Sets the municipio.
		 * @param municipio The municipio to set
		 */
		public void setMunicipio(int municipio) {
			this.municipio = municipio;
		}

		/**
		 * Sets the nomeArea.
		 * @param nomeArea The nomeArea to set
		 */
		public void setNomeArea(String nomeArea) {
			this.nomeArea = nomeArea;
		}

		/**
		 * Sets the nomeDiagnostico.
		 * @param nomeDiagnostico The nomeDiagnostico to set
		 */
		public void setNomeDiagnostico(String nomeDiagnostico) {
			this.nomeDiagnostico = nomeDiagnostico;
		}

		/**
		 * Sets the nomeEstado.
		 * @param nomeEstado The nomeEstado to set
		 */
		public void setNomeEstado(String nomeEstado) {
			this.nomeEstado = nomeEstado;
		}

		/**
		 * Sets the nomeFonte.
		 * @param nomeFonte The nomeFonte to set
		 */
		public void setNomeFonte(String nomeFonte) {
			this.nomeFonte = nomeFonte;
		}

		/**
		 * Sets the nomeMunicipio.
		 * @param nomeMunicipio The nomeMunicipio to set
		 */
		public void setNomeMunicipio(String nomeMunicipio) {
			this.nomeMunicipio = nomeMunicipio;
		}

		/**
		 * Sets the nomeRegional.
		 * @param nomeRegional The nomeRegional to set
		 */
		public void setNomeRegional(String nomeRegional) {
			this.nomeRegional = nomeRegional;
		}

		/**
		 * Sets the nomeTipoacidente.
		 * @param nomeTipoacidente The nomeTipoacidente to set
		 */
		public void setNomeTipoAcidente(String nomeTipoAcidente) {
			this.nomeTipoAcidente = nomeTipoAcidente;
		}

		/**
		 * Sets the nomeTrabalhador.
		 * @param nomeTrabalhador The nomeTrabalhador to set
		 */
		public void setNomeTrabalhador(String nomeTrabalhador) {
			this.nomeTrabalhador = nomeTrabalhador;
		}

		/**
		 * Sets the obito.
		 * @param obito The obito to set
		 */
		public void setObito(String obito) {
			this.obito = obito;
		}

		/**
		 * Sets the regional.
		 * @param regional The regional to set
		 */
		public void setRegional(int regional) {
			this.regional = regional;
		}

		/**
		 * Sets the registroPolicial.
		 * @param registroPolicial The registroPolicial to set
		 */
		public void setRegistroPolicial(String registroPolicial) {
			this.registroPolicial = registroPolicial;
		}

		/**
		 * Sets the tipoacidente.
		 * @param tipoacidente The tipoacidente to set
		 */
		public void setTipoAcidente(int tipoAcidente) {
			this.tipoAcidente = tipoAcidente;
		}

		/**
		 * Sets the trabalhador.
		 * @param trabalhador The trabalhador to set
		 */
		public void setTrabalhador(int trabalhador) {
			this.trabalhador = trabalhador;
		}

}
