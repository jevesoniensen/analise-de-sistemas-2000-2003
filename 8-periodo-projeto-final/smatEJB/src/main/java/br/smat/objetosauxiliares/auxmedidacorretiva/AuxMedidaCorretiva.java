package br.smat.objetosauxiliares.auxmedidacorretiva;

import java.io.Serializable;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class AuxMedidaCorretiva  implements Serializable{
	
	private int	tipoMedidaCorretiva = 0;
	private String	nomeMedidaCorretiva = null;
	private int	prazoDias = 0;
	private String observacao = null;
	
	public AuxMedidaCorretiva(int	tipoMedidaCorretiva,
										   String	nomeMedidaCorretiva,
										   int	prazoDias,
										   String observacao){
										   	
		this.tipoMedidaCorretiva = tipoMedidaCorretiva;
		this.nomeMedidaCorretiva = nomeMedidaCorretiva;
		this.prazoDias = prazoDias;
		this.observacao = observacao;
	}

	/**
	 * Returns the nomeMedidaCorretiva.
	 * @return String
	 */
	public String getNomeMedidaCorretiva() {
		return nomeMedidaCorretiva;
	}

	/**
	 * Returns the observacao.
	 * @return String
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * Returns the prazoDias.
	 * @return int
	 */
	public int getPrazoDias() {
		return prazoDias;
	}

	/**
	 * Returns the tipoMedidaCorretiva.
	 * @return int
	 */
	public int getTipoMedidaCorretiva() {
		return tipoMedidaCorretiva;
	}

	/**
	 * Sets the nomeMedidaCorretiva.
	 * @param nomeMedidaCorretiva The nomeMedidaCorretiva to set
	 */
	public void setNomeMedidaCorretiva(String nomeMedidaCorretiva) {
		this.nomeMedidaCorretiva = nomeMedidaCorretiva;
	}

	/**
	 * Sets the observacao.
	 * @param observacao The observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	/**
	 * Sets the prazoDias.
	 * @param prazoDias The prazoDias to set
	 */
	public void setPrazoDias(int prazoDias) {
		this.prazoDias = prazoDias;
	}

	/**
	 * Sets the tipoMedidaCorretiva.
	 * @param tipoMedidaCorretiva The tipoMedidaCorretiva to set
	 */
	public void setTipoMedidaCorretiva(int tipoMedidaCorretiva) {
		this.tipoMedidaCorretiva = tipoMedidaCorretiva;
	}

}
