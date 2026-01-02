package br.smat.ejb.testemunha;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Testemunha
 */
public interface TestemunhaHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Testemunha
	 */
	public br.smat.ejb.testemunha.Testemunha create(int 	acidente,
													int 	municipio,
													String	nome,
													int	numero,
													String	rua,
													String	bairro,
													String	cep,
													String	complemento,
													String	telefone,
													String	ddd)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Testemunha
	 */
	public br.smat.ejb.testemunha.Testemunha findByPrimaryKey(
		br.smat.ejb.testemunha.TestemunhaKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllTestemunhas(int acidente)
		throws FinderException, java.rmi.RemoteException;
}
