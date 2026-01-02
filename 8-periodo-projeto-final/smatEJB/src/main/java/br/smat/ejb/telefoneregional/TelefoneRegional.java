package br.smat.ejb.telefoneregional;

import br.smat.ejb.regional.RegionalKey;

/**
 * Remote interface for Enterprise Bean: TelefoneRegional
 */
public interface TelefoneRegional extends javax.ejb.EJBObject {
	/**
	 * Returns the ddd.
	 * @return String
	 */
	public String getDdd() throws java.rmi.RemoteException;
	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() throws java.rmi.RemoteException;
	/**
	 * Returns the numero.
	 * @return String
	 */
	public String getNumero() throws java.rmi.RemoteException;
	/**
	 * Returns the regional.
	 * @return int
	 */
	public RegionalKey getRegional() throws java.rmi.RemoteException;
	/**
	 * Returns the telefoneRegional.
	 * @return int
	 */
	public int getTelefoneRegional() throws java.rmi.RemoteException;
	/**
	 * Sets the ddd.
	 * @param ddd The ddd to set
	 */
	public void setDdd(String ddd) throws java.rmi.RemoteException;
	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) throws java.rmi.RemoteException;
	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(String numero) throws java.rmi.RemoteException;
	public int getRegionalKey() throws java.rmi.RemoteException;
	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(RegionalKey regional)
		throws java.rmi.RemoteException;
	/**
	 * Sets the telefoneRegional.
	 * @param telefoneRegional The telefoneRegional to set
	 */
	public void setTelefoneRegional(int telefoneRegional)
		throws java.rmi.RemoteException;
}
