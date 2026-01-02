package br.smat.ejb.tipoacidente;
/**
 * Remote interface for Enterprise Bean: TipoAcidente
 */
public interface TipoAcidente extends javax.ejb.EJBObject {
	/**
	 * Returns the nome.
	 * @return Object
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the tipoAcidente.
	 * @return Object
	 */
	public int getTipoAcidente() throws java.rmi.RemoteException;
}
