package br.smat.ejb.municipio;
import br.smat.ejb.regional.RegionalKey;
import br.smat.ejb.regional.Regional;
/**
 * Remote interface for Enterprise Bean: Municipio
 */
public interface Municipio extends javax.ejb.EJBObject {
	/**
	 * Sets the sigla.
	 * @param sigla The sigla to set
	 */
	public void setSigla(String sigla) throws java.rmi.RemoteException;
	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(RegionalKey regional)
		throws java.rmi.RemoteException;
	/**
	 * Sets the populacao.
	 * @param populacao The populacao to set
	 */
	public void setPopulacao(int populacao) throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Returns the sigla.
	 * @return String
	 */
	public String getSigla() throws java.rmi.RemoteException;
	/**
	 * Returns the regional.
	 * @return RegionalKey
	 */
	public RegionalKey getRegional() throws java.rmi.RemoteException;
	/**
	 * Returns the populacao.
	 * @return int
	 */
	public int getPopulacao() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the municipio.
	 * @return int
	 */
	public int getMunicipio() throws java.rmi.RemoteException;
	public int getKeyEstado() throws java.rmi.RemoteException;
}
