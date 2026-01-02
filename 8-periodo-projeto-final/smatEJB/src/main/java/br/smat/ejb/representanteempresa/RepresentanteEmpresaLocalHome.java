package br.smat.ejb.representanteempresa;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.representanteempresa.RepresentanteEmpresaKey;
/**
 * Local Home interface for Enterprise Bean: RepresentanteEmpresa
 */
public interface RepresentanteEmpresaLocalHome extends javax.ejb.EJBLocalHome {

	/**
	 * Finds an instance using a key for Entity Bean: RepresentanteEmpresa
	 */
	public RepresentanteEmpresaLocal findByPrimaryKey(RepresentanteEmpresaKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllRepresentanteEmpresa()
		throws FinderException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.representanteempresa.RepresentanteEmpresaLocal create(
		int empresa,
		String nome)
		throws javax.ejb.CreateException;
	public java.util.Collection findAllRepresentanteByEmpresa(int empresa)
		throws FinderException;
}
