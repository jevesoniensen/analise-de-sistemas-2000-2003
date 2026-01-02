package br.smat.ejb.agentecausador;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: AgenteCausador
 */
public interface AgenteCausadorHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: AgenteCausador
	 */
	public br.smat.ejb.agentecausador.AgenteCausador create(String nome,String descricao,int agenteCausadorPai)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: AgenteCausador
	 */
	public br.smat.ejb.agentecausador.AgenteCausador findByPrimaryKey(
		br.smat.ejb.agentecausador.AgenteCausadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllAgentesCausadores()
		throws FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllAgentesCausadores(int pai)
		throws FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllAgentesCausadoresNot(
		int agenteCausador,
		int agenteCausadorPai)
		throws FinderException, java.rmi.RemoteException;
}
