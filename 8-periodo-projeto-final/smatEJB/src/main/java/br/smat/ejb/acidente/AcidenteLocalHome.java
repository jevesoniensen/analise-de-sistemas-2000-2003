package br.smat.ejb.acidente;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local Home interface for Enterprise Bean: Acidente
 */
public interface AcidenteLocalHome extends javax.ejb.EJBLocalHome {
	/**
	 * Creates an instance from a key for Entity Bean: Acidente
	 */
	public br.smat.ejb.acidente.AcidenteLocal create(	int 	area,
									int 	vinculoEmpregaticio,
									int 	ocupacao,
									int 	localAtendimento,
									int 	empregador,
									int 	medico,
									int 	diagnostico,
									int 	fonte,
									int 	agenteCausador,
									int 	tipoLocalAcidente,
									int 	trabalhador,
									int 	empregadorTerceiro,
									int 	tipoAcidente,
									int 	emitente,
									int 	municipio,
									String	dataAcidente,
									String	registroPolicial,
									String	amputacao,
									String	obito,
									int	horasTrabalhadas,
									String	descLocalAcidente,
									String	numDocFonte,
									String	dataEmissaoFonte,
									String	naturezaLesao,
									String	dataHoraDiagnostico,
									String	afastamento,
									String	internacao,
									String	observacaoDiagnostico,
									int	duracaoTratamento,
									String	aposentado,
									float	remuneracao,
									String	distritoSaude,
									String	ultimaTrabalhado,
									String	descricaoSituacaoGeradora,
									String	descricaoDiagnostico)
		throws javax.ejb.CreateException;
	/**
	 * Finds an instance using a key for Entity Bean: Acidente
	 */
	public br.smat.ejb.acidente.AcidenteLocal findByPrimaryKey(
		br.smat.ejb.acidente.AcidenteKey primaryKey)
		throws javax.ejb.FinderException;
	public java.util.Collection findAllAcidentes() throws FinderException;
}
