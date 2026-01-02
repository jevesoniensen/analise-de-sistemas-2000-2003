package br.smat.ejb.trabalhador;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Home interface for Enterprise Bean: Trabalhador
 */
public interface TrabalhadorHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: Trabalhador
	 */
	public Trabalhador create(int municipio,
								int ufRG,
								int ufCTPS,
								int estadoCivil,
								String nome,
								String cpf,
								String rg,
								int carteiraTrabalho,
								int serie,
								String dataEmissaoCTPS,
								String dataNascimento,
								String sexo,
								int numero,
								String rua,
								String bairro,
								String cep,
								String complemento,
								String nomeResponsavel,
								String dataEmissaoRG,
								String orgaoExpedidorRG,
								String pisPasepNit,
								String telefone,
								String ddd)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: Trabalhador
	 */
	public br.smat.ejb.trabalhador.Trabalhador findByPrimaryKey(
		br.smat.ejb.trabalhador.TrabalhadorKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
	public java.util.Collection findAllTrabalhadores()
		throws FinderException, java.rmi.RemoteException;

	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.trabalhador.Trabalhador findByAcidente(int acidente)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
}
