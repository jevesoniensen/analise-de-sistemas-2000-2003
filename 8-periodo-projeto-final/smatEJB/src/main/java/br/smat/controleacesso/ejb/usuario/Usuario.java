package br.smat.controleacesso.ejb.usuario;
import br.smat.ejb.agentesaude.AgenteSaudeKey;
/**
 * Remote interface for Enterprise Bean: Usuario
 */
public interface Usuario extends javax.ejb.EJBObject {
	/**
	 * Returns the agenteSaude.
	 * @return AgenteSaudeKey
	 */
	public AgenteSaudeKey getAgenteSaude() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the senha.
	 * @return String
	 */
	public String getSenha() throws java.rmi.RemoteException;
	/**
	 * Returns the usuario.
	 * @return int
	 */
	public int getUsuario() throws java.rmi.RemoteException;
	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(AgenteSaudeKey agenteSaude)
		throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Sets the senha.
	 * @param senha The senha to set
	 */
	public void setSenha(String senha) throws java.rmi.RemoteException;
}
