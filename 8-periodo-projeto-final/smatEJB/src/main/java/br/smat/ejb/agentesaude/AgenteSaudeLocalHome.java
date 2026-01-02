package br.smat.ejb.agentesaude;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: AgenteSaude
 */
public interface AgenteSaudeLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: AgenteSaude
	 */
	public br.smat.ejb.agentesaude.AgenteSaudeLocal create(String nome,String email,int regional)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: AgenteSaude
	 */
	public br.smat.ejb.agentesaude.AgenteSaudeLocal findByPrimaryKey(
		br.smat.ejb.agentesaude.AgenteSaudeKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllAgentesSaude() throws FinderException;
}
