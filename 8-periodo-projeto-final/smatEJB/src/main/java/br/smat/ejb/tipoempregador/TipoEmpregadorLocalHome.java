package br.smat.ejb.tipoempregador;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: TipoEmpregador
 */
public interface TipoEmpregadorLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: TipoEmpregador
	 */
	public br.smat.ejb.tipoempregador.TipoEmpregadorLocal create(String nome, String docIdenticador)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: TipoEmpregador
	 */
	public br.smat.ejb.tipoempregador.TipoEmpregadorLocal findByPrimaryKey(
		br.smat.ejb.tipoempregador.TipoEmpregadorKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllTiposEmpregadores()
		throws FinderException;
}
