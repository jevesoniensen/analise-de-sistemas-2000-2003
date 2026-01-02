package br.smat.ejb.agentecausador;
import br.smat.ejb.agentecausador.AgenteCausadorKey;
/**
 * Remote interface for Enterprise Bean: AgenteCausador
 */
public interface AgenteCausador extends javax.ejb.EJBObject {
	/**
	 * Returns the agenteCausador.
	 * @return int
	 */
	public int getAgenteCausador() throws java.rmi.RemoteException;
	/**
	 * Returns the agenteCausadorPai.
	 * @return AgenteCausadorKey
	 */
	public AgenteCausadorKey getAgenteCausadorPai()
		throws java.rmi.RemoteException;
	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Sets the agenteCausadorPai.
	 * @param agenteCausadorPai The agenteCausadorPai to set
	 */
	public void setAgenteCausadorPai(AgenteCausadorKey agenteCausadorPai)
		throws java.rmi.RemoteException;
	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao) throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
}
