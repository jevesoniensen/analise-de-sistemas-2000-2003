package br.smat.ejb.trabalhador;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Trabalhador
 */
public interface TrabalhadorLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Trabalhador
	 */
	public TrabalhadorLocal create(int municipio,
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
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Trabalhador
	 */
	public br.smat.ejb.trabalhador.TrabalhadorLocal findByPrimaryKey(
		br.smat.ejb.trabalhador.TrabalhadorKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllTrabalhadores() throws FinderException;
	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.trabalhador.TrabalhadorLocal findByAcidente(
		int acidente)
		throws javax.ejb.FinderException;
}
