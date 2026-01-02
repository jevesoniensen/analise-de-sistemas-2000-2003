package br.smat.ejb.grauconformidade;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: GrauConformidade
 */
public interface GrauConformidadeHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: GrauConformidade
	 */
	public br.smat.ejb.grauconformidade.GrauConformidade create(
		String nome,
		String descricao)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
		
	/**
	 * Finds an instance using a key for Entity Bean: GrauConformidade
	 */
	public br.smat.ejb.grauconformidade.GrauConformidade findByPrimaryKey(
		br.smat.ejb.grauconformidade.GrauConformidadeKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
		
	public java.util.Collection findAllTipoAcidente()
		throws FinderException, java.rmi.RemoteException;
}
