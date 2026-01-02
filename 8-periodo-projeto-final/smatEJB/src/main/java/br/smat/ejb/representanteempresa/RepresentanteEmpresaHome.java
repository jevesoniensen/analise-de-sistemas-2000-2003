package br.smat.ejb.representanteempresa;
import javax.ejb.FinderException;
import java.util.Collection;
import br.smat.ejb.representanteempresa.RepresentanteEmpresaKey;
/**
 * Home interface for Enterprise Bean: RepresentanteEmpresa
 */
public interface RepresentanteEmpresaHome extends javax.ejb.EJBHome {

	/**
	 * Finds an instance using a key for Entity Bean: RepresentanteEmpresa
	 */
	public br
		.smat
		.ejb
		.representanteempresa
		.RepresentanteEmpresa findByPrimaryKey(
		br.smat.ejb.representanteempresa.RepresentanteEmpresaKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllRepresentanteEmpresa()
		throws FinderException, java.rmi.RemoteException;
	/**
	 * ejbCreate
	 */
	public br.smat.ejb.representanteempresa.RepresentanteEmpresa create(
		int empresa,
		String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	public java.util.Collection findAllRepresentanteByEmpresa(int empresa)
		throws FinderException, java.rmi.RemoteException;
}
