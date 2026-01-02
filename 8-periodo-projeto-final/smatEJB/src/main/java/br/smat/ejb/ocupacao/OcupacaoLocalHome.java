package br.smat.ejb.ocupacao;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Ocupacao
 */
public interface OcupacaoLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Ocupacao
	 */
	public br.smat.ejb.ocupacao.OcupacaoLocal create(String nome, int cbo)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Ocupacao
	 */
	public br.smat.ejb.ocupacao.OcupacaoLocal findByPrimaryKey(
		br.smat.ejb.ocupacao.OcupacaoKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllOcupacoes() throws FinderException;
}
