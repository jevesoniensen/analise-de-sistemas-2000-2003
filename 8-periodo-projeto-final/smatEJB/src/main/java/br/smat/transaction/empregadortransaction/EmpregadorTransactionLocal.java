package br.smat.transaction.empregadortransaction;
/**
 * Local interface for Enterprise Bean: EmpregadorTransaction
 */
public interface EmpregadorTransactionLocal extends javax.ejb.EJBLocalObject {
	public String armazena(
		int empregador,
		int ramoAtividade,
		int municipio,
		int tipoEmpregador,
		String razaoSocial,
		String documento,
		int numero,
		String rua,
		String bairro,
		String cep,
		String complemento);
	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador();
	/**
	 * Method setEmpregador.
	 * @param empregador
	 */
	public void setEmpregador(int empregador);
}
