package br.smat.ejb.locallesao;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: LocalLesao
 */
public interface LocalLesaoLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: LocalLesao
	 */
	public br.smat.ejb.locallesao.LocalLesaoLocal create(String nome, int localLesaoPai)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: LocalLesao
	 */
	public br.smat.ejb.locallesao.LocalLesaoLocal findByPrimaryKey(
		br.smat.ejb.locallesao.LocalLesaoKey primaryKey)
		throws javax.ejb.FinderException;

	public java.util.Collection findAllLocaisLesao() throws FinderException;
	public java.util.Collection findAllLocaisLesao(int pai)
		throws FinderException;
}
