package br.smat.ejb.tipodepoimento;
/**
 * Remote interface for Enterprise Bean: TipoDepoimento
 */
public interface TipoDepoimento extends javax.ejb.EJBObject {
	/**
	 * Returns the nome.
	 * @return int
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the tipoDepoimento.
	 * @return int
	 */
	public int getTipoDepoimento() throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
}
