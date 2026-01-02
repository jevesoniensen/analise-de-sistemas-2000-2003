package br.smat.ejb.empregador;

import br.smat.ejb.municipio.MunicipioKey;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;
import br.smat.ejb.tipoempregador.TipoEmpregadorKey;

import javax.ejb.FinderException;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Home interface for Enterprise Bean: Empregador
 */
public interface EmpregadorHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Empregador
	 */
	public br.smat.ejb.empregador.Empregador create(int ramoAtividade,
															int municipio,
															int tipoEmpregador,
															String razaoSocial,
															String documento,
															int numero,
															String rua,
															String bairro,
															String cep,
															String complemento)
		throws javax.ejb.CreateException, java.rmi.RemoteException,SQLException;
	/**
	 * Finds an instance using a key for Entity Bean: Empregador
	 */
	public br.smat.ejb.empregador.Empregador findByPrimaryKey(
		br.smat.ejb.empregador.EmpregadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException,SQLException,Exception;
	public java.util.Collection findAllEmpregadores()
		throws FinderException, java.rmi.RemoteException,Exception;
}
