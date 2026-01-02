package br.smat.ejb.telefoneempregador;
import br.smat.ejb.empregador.EmpregadorKey;
/**
 * Remote interface for Enterprise Bean: TelefoneEmpregador
 */
public interface TelefoneEmpregador extends javax.ejb.EJBObject {
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
	 * Returns the empregador.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregador() throws java.rmi.RemoteException;
	/**
	 * Returns the telefoneEmpregador.
	 * @return int
	 */
	public int getTelefoneEmpregador() throws java.rmi.RemoteException;
	/**
	 * Returns the numero.
	 * @return String
	 */
	public String getNumero() throws java.rmi.RemoteException;
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
	public int getKeyEmpregador() throws java.rmi.RemoteException;
}
