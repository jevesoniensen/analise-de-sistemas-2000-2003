package br.smat.ejb.agentecausador;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: AgenteCausador
 */
public interface AgenteCausadorLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: AgenteCausador
	 */
	public br.smat.ejb.agentecausador.AgenteCausadorLocal create(String nome,String descricao,int agenteCausadorPai)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: AgenteCausador
	 */
	public br.smat.ejb.agentecausador.AgenteCausadorLocal findByPrimaryKey(
		br.smat.ejb.agentecausador.AgenteCausadorKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllAgentesCausadores()
		throws FinderException;
	public java.util.Collection findAllAgentesCausadores(int pai)
		throws FinderException;
	public java.util.Collection findAllAgentesCausadoresNot(
		int agenteCausador,
		int agenteCausadorPai)
		throws FinderException;
}
