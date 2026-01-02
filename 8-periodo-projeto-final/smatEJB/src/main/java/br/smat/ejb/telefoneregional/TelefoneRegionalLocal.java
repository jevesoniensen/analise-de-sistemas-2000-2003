package br.smat.ejb.telefoneregional;

import br.smat.ejb.regional.RegionalKey;

/**
 * Local interface for Enterprise Bean: TelefoneRegional
 */
public interface TelefoneRegionalLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the ddd.
	 * @return String
	 */
	public String getDdd();
	/**
	 * Returns the descricao.
	 * @return String
	 */
	public String getDescricao();
	/**
	 * Returns the numero.
	 * @return String
	 */
	public String getNumero();
	/**
	 * Returns the regional.
	 * @return int
	 */
	public RegionalKey getRegional();
	/**
	 * Returns the telefoneRegional.
	 * @return int
	 */
	public int getTelefoneRegional();
	/**
	 * Sets the ddd.
	 * @param ddd The ddd to set
	 */
	public void setDdd(String ddd);
	/**
	 * Sets the descricao.
	 * @param descricao The descricao to set
	 */
	public void setDescricao(String descricao);
	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(String numero);
	public int getRegionalKey();
	/**
	 * Sets the regional.
	 * @param regional The regional to set
	 */
	public void setRegional(RegionalKey regional);
	/**
	 * Sets the telefoneRegional.
	 * @param telefoneRegional The telefoneRegional to set
	 */
	public void setTelefoneRegional(int telefoneRegional);
}
