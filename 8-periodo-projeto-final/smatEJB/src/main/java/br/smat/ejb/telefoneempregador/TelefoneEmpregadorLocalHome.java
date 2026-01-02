package br.smat.ejb.telefoneempregador;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: TelefoneEmpregador
 */
public interface TelefoneEmpregadorLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: TelefoneEmpregador
	 */
	public br.smat.ejb.telefoneempregador.TelefoneEmpregadorLocal create(int empregador,
																		  String descricao,
							  											  String numero,
																		  String ddd)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: TelefoneEmpregador
	 */
	public br
		.smat
		.ejb
		.telefoneempregador
		.TelefoneEmpregadorLocal findByPrimaryKey(
		br.smat.ejb.telefoneempregador.TelefoneEmpregadorKey primaryKey)
		throws javax.ejb.FinderException;

	public java.util.Collection findAllTelefonesEmpregadores(int empregador)
		throws FinderException;
}
