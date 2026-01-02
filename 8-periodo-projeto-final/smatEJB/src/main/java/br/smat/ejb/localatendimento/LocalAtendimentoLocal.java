package br.smat.ejb.localatendimento;
import br.smat.ejb.municipio.MunicipioKey;
/**
 * Local interface for Enterprise Bean: LocalAtendimento
 */
public interface LocalAtendimentoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the localAtendimento.
	 * @return int
	 */
	public int getLocalAtendimento();
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
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(MunicipioKey municipio);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
}
