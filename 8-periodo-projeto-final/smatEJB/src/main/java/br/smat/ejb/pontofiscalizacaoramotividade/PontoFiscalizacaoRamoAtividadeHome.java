package br.smat.ejb.pontofiscalizacaoramotividade;
import br.smat.ejb.pontofiscalizacaoramotividade.PontoFiscalizacaoRamoAtividadeKey;
/**
 * Home interface for Enterprise Bean: PontoFiscalizacaoRamoAtividade
 */
public interface PontoFiscalizacaoRamoAtividadeHome extends javax.ejb.EJBHome {
	/**
	 * Creates an instance from a key for Entity Bean: PontoFiscalizacaoRamoAtividade
	 */
	public PontoFiscalizacaoRamoAtividade create(int pontoFiscalizacao, int ramoAtividade)
		throws javax.ejb.CreateException, java.rmi.RemoteException;
	/**
	 * Finds an instance using a key for Entity Bean: PontoFiscalizacaoRamoAtividade
	 */
	public PontoFiscalizacaoRamoAtividade findByPrimaryKey(PontoFiscalizacaoRamoAtividadeKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException;
}
