package br.smat.ejb.tipoempregador;
/**
 * Local interface for Enterprise Bean: TipoEmpregador
 */
public interface TipoEmpregadorLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the docIdentificador.
	 * @return String
	 */
	public String getDocIdentificador();
	/**
	 * Sets the docIdentificador.
	 * @param docIdentificador The docIdentificador to set
	 */
	public void setDocIdentificador(String docIdentificador);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Returns the tipoEmpregador.
	 * @return int
	 */
	public int getTipoEmpregador();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
}
