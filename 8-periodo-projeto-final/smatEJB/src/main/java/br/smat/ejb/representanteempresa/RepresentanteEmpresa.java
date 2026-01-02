package br.smat.ejb.representanteempresa;
import br.smat.ejb.empregador.EmpregadorKey;
/**
 * Remote interface for Enterprise Bean: RepresentanteEmpresa
 */
public interface RepresentanteEmpresa extends javax.ejb.EJBObject {
	/**
	 * Returns the empregador.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregador() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the representanteEmpresa.
	 * @return int
	 */
	public int getRepresentanteEmpresa() throws java.rmi.RemoteException;
	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(EmpregadorKey empregador)
		throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Sets the representanteEmpresa.
	 * @param representanteEmpresa The representanteEmpresa to set
	 */
	public void setRepresentanteEmpresa(int representanteEmpresa)
		throws java.rmi.RemoteException;
}
