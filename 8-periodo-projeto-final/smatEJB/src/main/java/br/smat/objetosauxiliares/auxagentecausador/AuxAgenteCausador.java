package br.smat.objetosauxiliares.auxagentecausador;

import java.io.Serializable;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxAgenteCausador implements Serializable {

	private int 	agenteCausador = 0;
	private int 	agenteCausadorPai = 0;
	private int	agenteCausadorVo = 0;
	private String	nomeAgenteCausador = null;
	private String	nomeAgenteCausadorPai = null;
	private String	nomeAgenteCausadorVo = null;
	
	private String descricao = null;



	/**
	 * Constructor for AuxAgenteCausador.
	 */
	public AuxAgenteCausador(int 		agenteCausador,
							  int		agenteCausadorPai,
							  int		agenteCausadorVo,
							  String	nomeAgenteCausador,
							  String	nomeAgenteCausadorPai,
							  String	nomeAgenteCausadorVo,
							  String 	descricao) {
		setAgenteCausador(agenteCausador);
		setAgenteCausadorPai(agenteCausadorPai);
		setAgenteCausadorVo(agenteCausadorVo);
		setNomeAgenteCausador(nomeAgenteCausador);
		setNomeAgenteCausadorPai(nomeAgenteCausadorPai);
		setNomeAgenteCausadorVo(nomeAgenteCausadorVo);
		setDescricao(descricao);
	}

	/**
	 * Returns the agenteCausador.
	 * @return int
	 */
	public int getAgenteCausador() {
		return agenteCausador;
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
	 * Returns the nomeAgenteCausadorPai.
	 * @return String
	 */
	public String getNomeAgenteCausadorPai() {
		return nomeAgenteCausadorPai;
	}

	/**
	 * Returns the nomeAgenteCausadorVo.
	 * @return String
	 */
	public String getNomeAgenteCausadorVo() {
		return nomeAgenteCausadorVo;
	}

	/**
	 * Sets the agenteCausador.
	 * @param agenteCausador The agenteCausador to set
	 */
	public void setAgenteCausador(int agenteCausador) {
		this.agenteCausador = agenteCausador;
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
	 * Sets the nomeAgenteCausadorPai.
	 * @param nomeAgenteCausadorPai The nomeAgenteCausadorPai to set
	 */
	public void setNomeAgenteCausadorPai(String nomeAgenteCausadorPai) {
		this.nomeAgenteCausadorPai = nomeAgenteCausadorPai;
	}

	/**
	 * Sets the nomeAgenteCausadorVo.
	 * @param nomeAgenteCausadorVo The nomeAgenteCausadorVo to set
	 */
	public void setNomeAgenteCausadorVo(String nomeAgenteCausadorVo) {
		this.nomeAgenteCausadorVo = nomeAgenteCausadorVo;
	}

}
