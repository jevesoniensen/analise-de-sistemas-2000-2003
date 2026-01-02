package br.smat.transaction.empregadortransaction;
/**
 * Remote interface for Enterprise Bean: EmpregadorTransaction
 */
public interface EmpregadorTransaction extends javax.ejb.EJBObject {
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
		String complemento)
		throws java.rmi.RemoteException;
	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() throws java.rmi.RemoteException;
	/**
	 * Method setEmpregador.
	 * @param empregador
	 */
	public void setEmpregador(int empregador) throws java.rmi.RemoteException;
}
