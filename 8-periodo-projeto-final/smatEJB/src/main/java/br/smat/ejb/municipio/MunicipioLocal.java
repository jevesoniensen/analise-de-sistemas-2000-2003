package br.smat.ejb.municipio;
import br.smat.ejb.regional.RegionalKey;
import br.smat.ejb.regional.Regional;
/**
 * Local interface for Enterprise Bean: Municipio
 */
public interface MunicipioLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Sets the sigla.
	 * @param sigla The sigla to set
	 */
	public void setSigla(String sigla);
	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(RegionalKey regional);
	/**
	 * Sets the populacao.
	 * @param populacao The populacao to set
	 */
	public void setPopulacao(int populacao);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Returns the sigla.
	 * @return String
	 */
	public String getSigla();
	/**
	 * Returns the regional.
	 * @return RegionalKey
	 */
	public RegionalKey getRegional();
	/**
	 * Returns the populacao.
	 * @return int
	 */
	public int getPopulacao();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the municipio.
	 * @return int
	 */
	public int getMunicipio();
	public int getKeyEstado();
}
