package br.smat.ejb.emitente;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Emitente
 */
public interface EmitenteLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Emitente
	 */
	public br.smat.ejb.emitente.EmitenteLocal create(String nome)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Emitente
	 */
	public br.smat.ejb.emitente.EmitenteLocal findByPrimaryKey(
		br.smat.ejb.emitente.EmitenteKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllEmitentes() throws FinderException;
}
