package br.smat.ejb.estadocivil;
/**
 * Local interface for Enterprise Bean: EstadoCivil
 */
public interface EstadoCivilLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the estadoCivil.
	 * @return int
	 */
	public int getEstadoCivil();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the estadoCivil.
	 * @param estadoCivil The estadoCivil to set
	 */
	public void setEstadoCivil(int estadoCivil);
}
