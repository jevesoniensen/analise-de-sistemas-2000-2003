package br.smat.ejb.representanteempresa;
import br.smat.ejb.empregador.EmpregadorKey;
/**
 * Local interface for Enterprise Bean: RepresentanteEmpresa
 */
public interface RepresentanteEmpresaLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the empregador.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregador();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the representanteEmpresa.
	 * @return int
	 */
	public int getRepresentanteEmpresa();
	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(EmpregadorKey empregador);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the representanteEmpresa.
	 * @param representanteEmpresa The representanteEmpresa to set
	 */
	public void setRepresentanteEmpresa(int representanteEmpresa);
}
