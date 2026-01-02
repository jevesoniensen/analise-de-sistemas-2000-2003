package br.smat.ejb.ocupacao;
/**
 * Remote interface for Enterprise Bean: Ocupacao
 */
public interface Ocupacao extends javax.ejb.EJBObject {
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Sets the cbo.
	 * @param cbo The cbo to set
	 */
	public void setCbo(int cbo) throws java.rmi.RemoteException;
	/**
	 * Returns the ocupacao.
	 * @return int
	 */
	public int getOcupacao() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the cbo.
	 * @return int
	 */
	public int getCbo() throws java.rmi.RemoteException;
}
