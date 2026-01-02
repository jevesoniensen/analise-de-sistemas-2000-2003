package br.smat.ejb.regional;
import br.smat.ejb.estado.EstadoKey;
import br.smat.ejb.municipio.MunicipioKey;
/**
 * Local interface for Enterprise Bean: Regional
 */
public interface RegionalLocal extends javax.ejb.EJBLocalObject {
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
	 * Returns the estado.
	 * @return EstadoKey
	 */
	public EstadoKey getEstado();
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
	 * Returns the regional.
	 * @return int
	 */
	public int getRegional();
	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua();
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
	 * Sets the estado.
	 * @param estado The estado to set
	 */
	public void setEstado(EstadoKey estado);
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
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(int regional);
	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua);
	public int getKeyEstado();
}
