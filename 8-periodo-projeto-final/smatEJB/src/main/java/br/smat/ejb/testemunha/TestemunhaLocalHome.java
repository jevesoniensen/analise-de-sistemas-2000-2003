package br.smat.ejb.testemunha;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Testemunha
 */
public interface TestemunhaLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Testemunha
	 */
	public TestemunhaLocal create(int 	acidente,
									int 	municipio,
									String	nome,
									int	numero,
									String	rua,
									String	bairro,
									String	cep,
									String	complemento,
									String	telefone,
									String	ddd)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Testemunha
	 */
	public br.smat.ejb.testemunha.TestemunhaLocal findByPrimaryKey(
		br.smat.ejb.testemunha.TestemunhaKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllTestemunhas(int acidente)
		throws FinderException;
}
