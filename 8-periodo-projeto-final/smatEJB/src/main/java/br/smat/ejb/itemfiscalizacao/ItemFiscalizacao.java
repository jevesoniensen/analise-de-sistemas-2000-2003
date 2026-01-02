package br.smat.ejb.itemfiscalizacao;
/**
 * Remote interface for Enterprise Bean: ItemFiscalizacao
 */
public interface ItemFiscalizacao extends javax.ejb.EJBObject {
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the itemFiscalizacao.
	 * @return int
	 */
	public int getItemFiscalizacao() throws java.rmi.RemoteException;
}
