package br.smat.ejb.testemunha;
import br.smat.ejb.acidente.AcidenteKey;
import br.smat.ejb.municipio.MunicipioKey;
/**
 * Local interface for Enterprise Bean: Testemunha
 */
public interface TestemunhaLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the acidente.
	 * @return AcidenteKey
	 */
	public AcidenteKey getAcidente();
	/**
	 * Returns the bairro.
	 * @return String
	 */
	public String getBairro();
	/**
	 * Returns the cep.
	 * @return String
	 */
	public String getCep();
	/**
	 * Returns the complemento.
	 * @return String
	 */
	public String getComplemento();
	/**
	 * Returns the ddd.
	 * @return String
	 */
	public String getDdd();
	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the numero.
	 * @return int
	 */
	public int getNumero();
	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua();
	/**
	 * Returns the telefone.
	 * @return String
	 */
	public String getTelefone();
	/**
	 * Returns the testemunha.
	 * @return int
	 */
	public int getTestemunha();
	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(AcidenteKey acidente);
	/**
	 * Sets the bairro.
	 * @param bairro The bairro to set
	 */
	public void setBairro(String bairro);
	/**
	 * Sets the cep.
	 * @param cep The cep to set
	 */
	public void setCep(String cep);
	/**
	 * Sets the complemento.
	 * @param complemento The complemento to set
	 */
	public void setComplemento(String complemento);
	/**
	 * Sets the ddd.
	 * @param ddd The ddd to set
	 */
	public void setDdd(String ddd);
	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(MunicipioKey municipio);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero);
	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua);
	/**
	 * Sets the telefone.
	 * @param telefone The telefone to set
	 */
	public void setTelefone(String telefone);
}
