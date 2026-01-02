package br.smat.ejb.testemunha;
import br.smat.ejb.acidente.AcidenteKey;
import br.smat.ejb.municipio.MunicipioKey;
/**
 * Remote interface for Enterprise Bean: Testemunha
 */
public interface Testemunha extends javax.ejb.EJBObject {
	/**
	 * Returns the acidente.
	 * @return AcidenteKey
	 */
	public AcidenteKey getAcidente() throws java.rmi.RemoteException;
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
	 * Returns the ddd.
	 * @return String
	 */
	public String getDdd() throws java.rmi.RemoteException;
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
	 * Returns the rua.
	 * @return String
	 */
	public String getRua() throws java.rmi.RemoteException;
	/**
	 * Returns the telefone.
	 * @return String
	 */
	public String getTelefone() throws java.rmi.RemoteException;
	/**
	 * Returns the testemunha.
	 * @return int
	 */
	public int getTestemunha() throws java.rmi.RemoteException;
	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(AcidenteKey acidente)
		throws java.rmi.RemoteException;
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
	 * Sets the ddd.
	 * @param ddd The ddd to set
	 */
	public void setDdd(String ddd) throws java.rmi.RemoteException;
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
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua) throws java.rmi.RemoteException;
	/**
	 * Sets the telefone.
	 * @param telefone The telefone to set
	 */
	public void setTelefone(String telefone) throws java.rmi.RemoteException;
}
