package br.smat.ejb.agentesaude;
import br.smat.ejb.regional.RegionalKey;
/**
 * Remote interface for Enterprise Bean: AgenteSaude
 */
public interface AgenteSaude extends javax.ejb.EJBObject {
	/**
	 * Returns the agenteSaude.
	 * @return int
	 */
	public int getAgenteSaude() throws java.rmi.RemoteException;
	/**
	 * Returns the email.
	 * @return String
	 */
	public String getEmail() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the regional.
	 * @return RegionalKey
	 */
	public RegionalKey getRegional() throws java.rmi.RemoteException;
	/**
	 * Sets the email.
	 * @param email The email to set
	 */
	public void setEmail(String email) throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(RegionalKey regional)
		throws java.rmi.RemoteException;
}
