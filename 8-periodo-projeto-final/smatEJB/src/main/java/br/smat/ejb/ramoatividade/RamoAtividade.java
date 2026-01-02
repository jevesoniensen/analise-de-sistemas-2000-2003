package br.smat.ejb.ramoatividade;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;
/**
 * Remote interface for Enterprise Bean: RamoAtividade
 */
public interface RamoAtividade extends javax.ejb.EJBObject {
	/**
	 * Returns the cnae.
	 * @return int
	 */
	public int getCnae() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the ramoAtividade.
	 * @return int
	 */
	public int getRamoAtividade() throws java.rmi.RemoteException;
	/**
	 * Returns the ramoSuperior.
	 * @return RamoAtividadeKey
	 */
	public RamoAtividadeKey getRamoSuperior() throws java.rmi.RemoteException;
	/**
	 * Sets the cnae.
	 * @param cnae The cnae to set
	 */
	public void setCnae(int cnae) throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Sets the ramoSuperior.
	 * @param ramoSuperior The ramoSuperior to set
	 */
	public void setRamoSuperior(RamoAtividadeKey ramoSuperior)
		throws java.rmi.RemoteException;
}
