package br.smat.ejb.ramoatividade;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;
/**
 * Local interface for Enterprise Bean: RamoAtividade
 */
public interface RamoAtividadeLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the cnae.
	 * @return int
	 */
	public int getCnae();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the ramoAtividade.
	 * @return int
	 */
	public int getRamoAtividade();
	/**
	 * Returns the ramoSuperior.
	 * @return RamoAtividadeKey
	 */
	public RamoAtividadeKey getRamoSuperior();
	/**
	 * Sets the cnae.
	 * @param cnae The cnae to set
	 */
	public void setCnae(int cnae);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the ramoSuperior.
	 * @param ramoSuperior The ramoSuperior to set
	 */
	public void setRamoSuperior(RamoAtividadeKey ramoSuperior);
}
