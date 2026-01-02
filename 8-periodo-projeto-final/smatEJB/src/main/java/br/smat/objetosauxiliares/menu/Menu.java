package br.smat.objetosauxiliares.menu;

import java.io.Serializable;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class Menu implements Serializable{
	
		private 	int		modulo;
	   	private 	String 		nome;
		private 	String		estrutura;
		private	int		moduloPai;
		private	int		nivel;
		private	int		paginaDefault;
		private	String		nomePaginaDefault;
		private	int		filhos;
		private	String		posicaoMenu;
		private	int		height;
		private	int		width;
		private	String		bgColor;
		private	String		bgHighColor;
		private	String		fontColor;
		private	String		fontHighColor;

		public Menu(int 	modulo,
	   				 String nome,
					 String	estrutura,
					 int	moduloPai,
					 int	nivel,
					 int 	paginaDefault,
					 String	nomePaginaDefault,
			   		 int	filhos){

			this.modulo = modulo;
	   		this.nome = nome;
			this.estrutura = estrutura;
			this.moduloPai = moduloPai;
			this.nivel = nivel;
			this.paginaDefault = paginaDefault;
			this.nomePaginaDefault = nomePaginaDefault;
			this.filhos = filhos;
		}
			   		 
		
		
		/**
		 * Returns the estrutura.
		 * @return String
		 */
		public String getEstrutura() {
			return estrutura;
		}

		/**
		 * Returns the filhos.
		 * @return int
		 */
		public int getFilhos() {
			return filhos;
		}

		/**
		 * Returns the modulo.
		 * @return int
		 */
		public int getModulo() {
			return modulo;
		}

		/**
		 * Returns the moduloPai.
		 * @return int
		 */
		public int getModuloPai() {
			return moduloPai;
		}

		/**
		 * Returns the nivel.
		 * @return int
		 */
		public int getNivel() {
			return nivel;
		}

		/**
		 * Returns the nome.
		 * @return String
		 */
		public String getNome() {
			return nome;
		}

		/**
		 * Returns the nomePaginaDefault.
		 * @return int
		 */
		public String getNomePaginaDefault() {
			return nomePaginaDefault;
		}

		/**
		 * Returns the paginaDefault.
		 * @return int
		 */
		public int getPaginaDefault() {
			return paginaDefault;
		}

		/**
		 * Sets the estrutura.
		 * @param estrutura The estrutura to set
		 */
		public void setEstrutura(String estrutura) {
			this.estrutura = estrutura;
		}

		/**
		 * Sets the filhos.
		 * @param filhos The filhos to set
		 */
		public void setFilhos(int filhos) {
			this.filhos = filhos;
		}

		/**
		 * Sets the modulo.
		 * @param modulo The modulo to set
		 */
		public void setModulo(int modulo) {
			this.modulo = modulo;
		}

		/**
		 * Sets the moduloPai.
		 * @param moduloPai The moduloPai to set
		 */
		public void setModuloPai(int moduloPai) {
			this.moduloPai = moduloPai;
		}

		/**
		 * Sets the nivel.
		 * @param nivel The nivel to set
		 */
		public void setNivel(int nivel) {
			this.nivel = nivel;
		}

		/**
		 * Sets the nome.
		 * @param nome The nome to set
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}

		/**
		 * Sets the nomePaginaDefault.
		 * @param nomePaginaDefault The nomePaginaDefault to set
		 */
		public void setNomePaginaDefault(String nomePaginaDefault) {
			this.nomePaginaDefault = nomePaginaDefault;
		}

		/**
		 * Sets the paginaDefault.
		 * @param paginaDefault The paginaDefault to set
		 */
		public void setPaginaDefault(int paginaDefault) {
			this.paginaDefault = paginaDefault;
		}

		/**
		 * Returns the posicaoMenu.
		 * @return String
		 */
		public String getPosicaoMenu() {
			return posicaoMenu;
		}

		/**
		 * Sets the posicaoMenu.
		 * @param posicaoMenu The posicaoMenu to set
		 */
		public void setPosicaoMenu(String posicaoMenu) {
			this.posicaoMenu = posicaoMenu;
		}

		/**
		 * Returns the bgColor.
		 * @return String
		 */
		public String getBgColor() {
			return bgColor;
		}

		/**
		 * Returns the bgHighColor.
		 * @return String
		 */
		public String getBgHighColor() {
			return bgHighColor;
		}

		/**
		 * Returns the height.
		 * @return String
		 */
		public int getHeight() {
			return height;
		}

		/**
		 * Returns the width.
		 * @return String
		 */
		public int getWidth() {
			return width;
		}

		/**
		 * Sets the bgColor.
		 * @param bgColor The bgColor to set
		 */
		public void setBgColor(String bgColor) {
			this.bgColor = bgColor;
		}

		/**
		 * Sets the bgHighColor.
		 * @param bgHighColor The bgHighColor to set
		 */
		public void setBgHighColor(String bgHighColor) {
			this.bgHighColor = bgHighColor;
		}

		/**
		 * Sets the height.
		 * @param height The height to set
		 */
		public void setHeight(int height) {
			this.height = height;
		}

		/**
		 * Sets the width.
		 * @param width The width to set
		 */
		public void setWidth(int width) {
			this.width = width;
		}

		/**
		 * Returns the fontColor.
		 * @return String
		 */
		public String getFontColor() {
			return fontColor;
		}

		/**
		 * Returns the fontHighColor.
		 * @return String
		 */
		public String getFontHighColor() {
			return fontHighColor;
		}

		/**
		 * Sets the fontColor.
		 * @param fontColor The fontColor to set
		 */
		public void setFontColor(String fontColor) {
			this.fontColor = fontColor;
		}

		/**
		 * Sets the fontHighColor.
		 * @param fontHighColor The fontHighColor to set
		 */
		public void setFontHighColor(String fontHighColor) {
			this.fontHighColor = fontHighColor;
		}

}
