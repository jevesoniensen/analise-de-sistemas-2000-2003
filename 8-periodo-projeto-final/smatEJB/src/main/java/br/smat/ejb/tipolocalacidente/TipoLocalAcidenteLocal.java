package br.smat.ejb.tipolocalacidente;
/**
 * Local interface for Enterprise Bean: TipoLocalAcidente
 */
public interface TipoLocalAcidenteLocal extends javax.ejb.EJBLocalObject {
	public String getNome();
	/**
	 * Returns the tipoLocalAcidente.
	 * @return int
	 */
	public int getTipoLocalAcidente();
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
}
