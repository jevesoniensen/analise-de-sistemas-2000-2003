package br.smat.ejb.fiscalizacao;
import br.smat.ejb.agentesaude.AgenteSaudeKey;
import br.smat.ejb.empregador.EmpregadorKey;
/**
 * Remote interface for Enterprise Bean: Fiscalizacao
 */
public interface Fiscalizacao extends javax.ejb.EJBObject {
	/**
	 * Returns the agenteSaude.
	 * @return AgenteSaudeKey
	 */
	public AgenteSaudeKey getAgenteSaude() throws java.rmi.RemoteException;
	/**
	 * Returns the dataAbertura.
	 * @return String
	 */
	public String getDataAbertura() throws java.rmi.RemoteException;
	/**
	 * Returns the dataFinalizacao.
	 * @return String
	 */
	public String getDataFinalizacao() throws java.rmi.RemoteException;
	/**
	 * Returns the empregador.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregador() throws java.rmi.RemoteException;
	/**
	 * Returns the fiscalizacao.
	 * @return int
	 */
	public int getFiscalizacao() throws java.rmi.RemoteException;
	/**
	 * Returns the obsGerais.
	 * @return String
	 */
	public String getObsGerais() throws java.rmi.RemoteException;
	/**
	 * Returns the titulo.
	 * @return String
	 */
	public String getTitulo() throws java.rmi.RemoteException;
	/**
	 * Sets the agenteSaude.
	 * @param agenteSaude The agenteSaude to set
	 */
	public void setAgenteSaude(AgenteSaudeKey agenteSaude)
		throws java.rmi.RemoteException;
	/**
	 * Sets the dataAbertura.
	 * @param dataAbertura The dataAbertura to set
	 */
	public void setDataAbertura(String dataAbertura)
		throws java.rmi.RemoteException;
	/**
	 * Sets the dataFinalizacao.
	 * @param dataFinalizacao The dataFinalizacao to set
	 */
	public void setDataFinalizacao(String dataFinalizacao)
		throws java.rmi.RemoteException;
	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(EmpregadorKey empregador)
		throws java.rmi.RemoteException;
	/**
	 * Sets the obsGerais.
	 * @param obsGerais The obsGerais to set
	 */
	public void setObsGerais(String obsGerais) throws java.rmi.RemoteException;
	/**
	 * Sets the titulo.
	 * @param titulo The titulo to set
	 */
	public void setTitulo(String titulo) throws java.rmi.RemoteException;
}
