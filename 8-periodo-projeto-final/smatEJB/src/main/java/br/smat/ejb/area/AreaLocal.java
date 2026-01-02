package br.smat.ejb.area;
/**
 * Local interface for Enterprise Bean: Area
 */
public interface AreaLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the area.
	 * @return int
	 */
	public int getArea();
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
}
