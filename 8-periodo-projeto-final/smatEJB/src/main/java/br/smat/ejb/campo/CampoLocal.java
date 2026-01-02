package br.smat.ejb.campo;
import java.util.Collection;

import br.smat.objetosauxiliares.auxcampo.AuxCampo;
/**
 * Local interface for Enterprise Bean: Campo
 */
public interface CampoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the campo.
	 * @return int
	 */
	public int getCampo();
	/**
	 * Returns the coluna.
	 * @return String
	 */
	public String getColuna();
	/**
	 * Returns the pai.
	 * @return String
	 */
	public String getPai();
	/**
	 * Returns the tabela.
	 * @return String
	 */
	public String getTabela();
	/**
	 * Sets the coluna.
	 * @param coluna The coluna to set
	 */
	public void setColuna(String coluna);
	/**
	 * Sets the pai.
	 * @param pai The pai to set
	 */
	public void setPai(String pai);
	/**
	 * Sets the tabela.
	 * @param tabela The tabela to set
	 */
	public void setTabela(String tabela);
	/**
	 * Returns the label.
	 * @return String
	 */
	public String getLabel();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Sets the label.
	 * @param label The label to set
	 */
	public void setLabel(String label);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);


	public AuxCampo[] getRegistros();
	public AuxCampo[] getRegistrosFilhos();
}
