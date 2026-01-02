package br.smat.objetosauxiliares.auxdepoimento;

import java.io.Serializable;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxDepoimento  implements Serializable{
	
		private int dadoInvestigacao = 0;
		private int tipoDepoimento = 0;
		private String nomeTipoDepoimento = null;
		private int pessoa = 0;
		private String nomePessoa = null;
		private String dataHora = null;
		private int agenteCausadorVo = 0;
		private int agenteCausadorPai = 0;
		private int agenteCausador = 0;
		private String nomeAgenteCausador = null;
		private String descricao = null;
		
		public AuxDepoimento(int dadoInvestigacao,
							  int tipoDepoimento,
							  String nomeTipoDepoimento,		
							  int pessoa,
							  String nomePessoa,
							  String dataHora,
							  int agenteCausador,
							  String nomeAgenteCausador,
							  String descricao){
							  	
			this.dadoInvestigacao = dadoInvestigacao;
			this.tipoDepoimento = tipoDepoimento;
			this.nomeTipoDepoimento = nomeTipoDepoimento;
			this.pessoa = pessoa;
			this.nomePessoa = nomePessoa;
			this.dataHora = dataHora;
			this.agenteCausador = agenteCausador;
			this.nomeAgenteCausador = nomeAgenteCausador;
			this.descricao = descricao;
		}

		public AuxDepoimento(int dadoInvestigacao,
							  int tipoDepoimento,
							  String nomeTipoDepoimento,		
							  int pessoa,
							  String nomePessoa,
							  String dataHora,
							  int agenteCausadorVo,
							  int agenteCausadorPai,
							  int agenteCausador,
							  String nomeAgenteCausador,
							  String descricao){
							  	
			this.dadoInvestigacao = dadoInvestigacao;
			this.tipoDepoimento = tipoDepoimento;
			this.nomeTipoDepoimento = nomeTipoDepoimento;
			this.pessoa = pessoa;
			this.nomePessoa = nomePessoa;
			this.dataHora = dataHora;
			this.agenteCausadorVo = agenteCausadorVo;
			this.agenteCausadorPai = agenteCausadorPai;
			this.agenteCausador = agenteCausador;
			this.nomeAgenteCausador = nomeAgenteCausador;
			this.descricao = descricao;
		}
		
		/**
		 * Returns the agenteCausador.
		 * @return int
		 */
		public int getAgenteCausador() {
			return agenteCausador;
		}

		/**
		 * Returns the dadoInvestigacao.
		 * @return int
		 */
		public int getDadoInvestigacao() {
			return dadoInvestigacao;
		}

		/**
		 * Returns the dataHora.
		 * @return String
		 */
		public String getDataHora() {
			return dataHora;
		}

		/**
		 * Returns the descricao.
		 * @return String
		 */
		public String getDescricao() {
			return descricao;
		}

		/**
		 * Returns the nomeAgenteCausador.
		 * @return String
		 */
		public String getNomeAgenteCausador() {
			return nomeAgenteCausador;
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
		 * Sets the agenteCausador.
		 * @param agenteCausador The agenteCausador to set
		 */
		public void setAgenteCausador(int agenteCausador) {
			this.agenteCausador = agenteCausador;
		}

		/**
		 * Sets the dadoInvestigacao.
		 * @param dadoInvestigacao The dadoInvestigacao to set
		 */
		public void setDadoInvestigacao(int dadoInvestigacao) {
			this.dadoInvestigacao = dadoInvestigacao;
		}

		/**
		 * Sets the dataHora.
		 * @param dataHora The dataHora to set
		 */
		public void setDataHora(String dataHora) {
			this.dataHora = dataHora;
		}

		/**
		 * Sets the descricao.
		 * @param descricao The descricao to set
		 */
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		/**
		 * Sets the nomeAgenteCausador.
		 * @param nomeAgenteCausador The nomeAgenteCausador to set
		 */
		public void setNomeAgenteCausador(String nomeAgenteCausador) {
			this.nomeAgenteCausador = nomeAgenteCausador;
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
			this.pessoa = pessoa;
		}

		/**
		 * Returns the nomeTipoDepoimento.
		 * @return String
		 */
		public String getNomeTipoDepoimento() {
			return nomeTipoDepoimento;
		}

		/**
		 * Returns the tipoDepoimento.
		 * @return int
		 */
		public int getTipoDepoimento() {
			return tipoDepoimento;
		}

		/**
		 * Sets the nomeTipoDepoimento.
		 * @param nomeTipoDepoimento The nomeTipoDepoimento to set
		 */
		public void setNomeTipoDepoimento(String nomeTipoDepoimento) {
			this.nomeTipoDepoimento = nomeTipoDepoimento;
		}

		/**
		 * Sets the tipoDepoimento.
		 * @param tipoDepoimento The tipoDepoimento to set
		 */
		public void setTipoDepoimento(int tipoDepoimento) {
			this.tipoDepoimento = tipoDepoimento;
		}

		/**
		 * Returns the agenteCausadorPai.
		 * @return int
		 */
		public int getAgenteCausadorPai() {
			return agenteCausadorPai;
		}

		/**
		 * Returns the agenteCausadorVo.
		 * @return int
		 */
		public int getAgenteCausadorVo() {
			return agenteCausadorVo;
		}

		/**
		 * Sets the agenteCausadorPai.
		 * @param agenteCausadorPai The agenteCausadorPai to set
		 */
		public void setAgenteCausadorPai(int agenteCausadorPai) {
			this.agenteCausadorPai = agenteCausadorPai;
		}

		/**
		 * Sets the agenteCausadorVo.
		 * @param agenteCausadorVo The agenteCausadorVo to set
		 */
		public void setAgenteCausadorVo(int agenteCausadorVo) {
			this.agenteCausadorVo = agenteCausadorVo;
		}

}
