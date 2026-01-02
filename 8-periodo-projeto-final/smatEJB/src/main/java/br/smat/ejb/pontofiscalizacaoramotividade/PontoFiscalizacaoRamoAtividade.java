package br.smat.ejb.pontofiscalizacaoramotividade;
import br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;
/**
 * Remote interface for Enterprise Bean: PontoFiscalizacaoRamoAtividade
 */
public interface PontoFiscalizacaoRamoAtividade extends javax.ejb.EJBObject {
	/**
	 * Returns the pontoFiscalizacao.
	 * @return PontoFiscalizacaoKey
	 */
	public PontoFiscalizacaoKey getPontoFiscalizacao()
		throws java.rmi.RemoteException;
	/**
	 * Returns the ramoAtividade.
	 * @return RamoAtividadeKey
	 */
	public RamoAtividadeKey getRamoAtividade() throws java.rmi.RemoteException;
	/**
	 * Sets the pontoFiscalizacao.
	 * @param pontoFiscalizacao The pontoFiscalizacao to set
	 */
	public void setPontoFiscalizacao(PontoFiscalizacaoKey pontoFiscalizacao)
		throws java.rmi.RemoteException;
	/**
	 * Sets the ramoAtividade.
	 * @param ramoAtividade The ramoAtividade to set
	 */
	public void setRamoAtividade(RamoAtividadeKey ramoAtividade)
		throws java.rmi.RemoteException;
}
