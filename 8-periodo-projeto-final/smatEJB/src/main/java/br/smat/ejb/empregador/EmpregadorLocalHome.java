package br.smat.ejb.empregador;

import br.smat.ejb.municipio.MunicipioKey;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;
import br.smat.ejb.tipoempregador.TipoEmpregadorKey;

import javax.ejb.FinderException;

import java.sql.SQLException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Empregador
 */
public interface EmpregadorLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Empregador
	 */
	public br.smat.ejb.empregador.EmpregadorLocal create(int ramoAtividade,
															int municipio,
															int tipoEmpregador,
															String razaoSocial,
															String documento,
															int numero,
															String rua,
															String bairro,
															String cep,
															String complemento)
		throws javax.ejb.CreateException,SQLException;
	/**
	 * Finds an instance using a key for Entity Bean: Empregador
	 */
	public br.smat.ejb.empregador.EmpregadorLocal findByPrimaryKey(
		br.smat.ejb.empregador.EmpregadorKey primaryKey)
		throws javax.ejb.FinderException,Exception;
	public java.util.Collection findAllEmpregadores() throws FinderException,Exception;

}
