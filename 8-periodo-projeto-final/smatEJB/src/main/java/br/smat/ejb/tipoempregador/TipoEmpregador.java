package br.smat.ejb.tipoempregador;
/**
 * Remote interface for Enterprise Bean: TipoEmpregador
 */
public interface TipoEmpregador extends javax.ejb.EJBObject {
	/**
	 * Returns the docIdentificador.
	 * @return String
	 */
	public String getDocIdentificador() throws java.rmi.RemoteException;
	/**
	 * Sets the docIdentificador.
	 * @param docIdentificador The docIdentificador to set
	 */
	public void setDocIdentificador(String docIdentificador)
		throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Returns the tipoEmpregador.
	 * @return int
	 */
	public int getTipoEmpregador() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
}
