package br.smat.ejb.agentesaude;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: AgenteSaude
 */
public interface AgenteSaudeHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: AgenteSaude
	 */
	public br.smat.ejb.agentesaude.AgenteSaude create(String nome,String email,int regional)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: AgenteSaude
	 */
	public br.smat.ejb.agentesaude.AgenteSaude findByPrimaryKey(
		br.smat.ejb.agentesaude.AgenteSaudeKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllAgentesSaude()
		throws FinderException, java.rmi.RemoteException;
}
