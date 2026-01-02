package br.smat.ejb.localatendimento;
import br.smat.ejb.municipio.MunicipioKey;
/**
 * Remote interface for Enterprise Bean: LocalAtendimento
 */
public interface LocalAtendimento extends javax.ejb.EJBObject {
	/**
	 * Returns the localAtendimento.
	 * @return int
	 */
	public int getLocalAtendimento() throws java.rmi.RemoteException;
	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(MunicipioKey municipio)
		throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
}
