package br.smat.ejb.regional;
import br.smat.ejb.estado.EstadoKey;
import br.smat.ejb.municipio.MunicipioKey;
/**
 * Remote interface for Enterprise Bean: Regional
 */
public interface Regional extends javax.ejb.EJBObject {
	/**
	 * Returns the bairro.
	 * @return String
	 */
	public String getBairro() throws java.rmi.RemoteException;
	/**
	 * Returns the cep.
	 * @return String
	 */
	public String getCep() throws java.rmi.RemoteException;
	/**
	 * Returns the complemento.
	 * @return String
	 */
	public String getComplemento() throws java.rmi.RemoteException;
	/**
	 * Returns the estado.
	 * @return EstadoKey
	 */
	public EstadoKey getEstado() throws java.rmi.RemoteException;
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
	 * Returns the numero.
	 * @return int
	 */
	public int getNumero() throws java.rmi.RemoteException;
	/**
	 * Returns the regional.
	 * @return int
	 */
	public int getRegional() throws java.rmi.RemoteException;
	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua() throws java.rmi.RemoteException;
	/**
	 * Sets the bairro.
	 * @param bairro The bairro to set
	 */
	public void setBairro(String bairro) throws java.rmi.RemoteException;
	/**
	 * Sets the cep.
	 * @param cep The cep to set
	 */
	public void setCep(String cep) throws java.rmi.RemoteException;
	/**
	 * Sets the complemento.
	 * @param complemento The complemento to set
	 */
	public void setComplemento(String complemento)
		throws java.rmi.RemoteException;
	/**
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(EstadoKey estado) throws java.rmi.RemoteException;
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
	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero) throws java.rmi.RemoteException;
	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(int regional) throws java.rmi.RemoteException;
	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua) throws java.rmi.RemoteException;
	public int getKeyEstado() throws java.rmi.RemoteException;
}
