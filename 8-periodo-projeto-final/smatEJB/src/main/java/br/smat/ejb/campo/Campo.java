package br.smat.ejb.campo;
import java.util.Collection;

import br.smat.objetosauxiliares.auxcampo.AuxCampo;
/**
 * Remote interface for Enterprise Bean: Campo
 */
public interface Campo extends javax.ejb.EJBObject {
	/**
	 * Returns the campo.
	 * @return int
	 */
	public int getCampo() throws java.rmi.RemoteException;
	/**
	 * Returns the coluna.
	 * @return String
	 */
	public String getColuna() throws java.rmi.RemoteException;
	/**
	 * Returns the pai.
	 * @return String
	 */
	public String getPai() throws java.rmi.RemoteException;
	/**
	 * Returns the tabela.
	 * @return String
	 */
	public String getTabela() throws java.rmi.RemoteException;
	/**
	 * Sets the coluna.
	 * @param coluna The coluna to set
	 */
	public void setColuna(String coluna) throws java.rmi.RemoteException;
	/**
	 * Sets the pai.
	 * @param pai The pai to set
	 */
	public void setPai(String pai) throws java.rmi.RemoteException;
	/**
	 * Sets the tabela.
	 * @param tabela The tabela to set
	 */
	public void setTabela(String tabela) throws java.rmi.RemoteException;
	/**
	 * Returns the label.
	 * @return String
	 */
	public String getLabel() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Sets the label.
	 * @param label The label to set
	 */
	public void setLabel(String label) throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;

	public AuxCampo[] getRegistros() throws java.rmi.RemoteException;
	public AuxCampo[] getRegistrosFilhos() throws java.rmi.RemoteException;
}
