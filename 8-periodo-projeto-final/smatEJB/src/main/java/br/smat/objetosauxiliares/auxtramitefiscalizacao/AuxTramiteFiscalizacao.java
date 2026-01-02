package br.smat.objetosauxiliares.auxtramitefiscalizacao;

import java.io.Serializable;

/**
 * @author jeveson
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxTramiteFiscalizacao implements Serializable {

	private int 				tramiteFiscalizacao;
	private int				fiscalizacao;
	private int				status;
	private String				nomeStatus;	
	private String				data;

	/**
	 * Constructor for AuxTramiteFiscalizacao.
	 */
	public AuxTramiteFiscalizacao(	int	tramiteFiscalizacao,
									int	fiscalizacao,
									int	status,
									String	nomeStatus,
									String	data) {
		super();
		
		setTramiteFiscalizacao(tramiteFiscalizacao);
		setFiscalizacao(fiscalizacao);
		setStatus(status);
		setNomeStatus(nomeStatus);
		setData(data);
	}

	/**
	 * Returns the data.
	 * @return String
	 */
	public String getData() {
		return data;
	}

	/**
	 * Returns the fiscalizacao.
	 * @return int
	 */
	public int getFiscalizacao() {
		return fiscalizacao;
	}

	/**
	 * Returns the nomeStatus.
	 * @return String
	 */
	public String getNomeStatus() {
		return nomeStatus;
	}

	/**
	 * Returns the status.
	 * @return int
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * Returns the tramiteFiscalizacao.
	 * @return int
	 */
	public int getTramiteFiscalizacao() {
		return tramiteFiscalizacao;
	}

	/**
	 * Sets the data.
	 * @param data The data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * Sets the fiscalizacao.
	 * @param fiscalizacao The fiscalizacao to set
	 */
	public void setFiscalizacao(int fiscalizacao) {
		this.fiscalizacao = fiscalizacao;
	}

	/**
	 * Sets the nomeStatus.
	 * @param nomeStatus The nomeStatus to set
	 */
	public void setNomeStatus(String nomeStatus) {
		this.nomeStatus = nomeStatus;
	}

	/**
	 * Sets the status.
	 * @param status The status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * Sets the tramiteFiscalizacao.
	 * @param tramiteFiscalizacao The tramiteFiscalizacao to set
	 */
	public void setTramiteFiscalizacao(int tramiteFiscalizacao) {
		this.tramiteFiscalizacao = tramiteFiscalizacao;
	}

}
