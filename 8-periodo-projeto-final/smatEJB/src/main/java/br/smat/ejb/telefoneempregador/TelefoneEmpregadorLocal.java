package br.smat.ejb.telefoneempregador;
import br.smat.ejb.empregador.EmpregadorKey;
/**
 * Local interface for Enterprise Bean: TelefoneEmpregador
 */
public interface TelefoneEmpregadorLocal extends javax.ejb.EJBLocalObject {
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
	 * Returns the empregador.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregador();
	/**
	 * Returns the numero.
	 * @return String
	 */
	public String getNumero();
	/**
	 * Returns the telefoneEmpregador.
	 * @return int
	 */
	public int getTelefoneEmpregador();
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
	public int getKeyEmpregador();
}
