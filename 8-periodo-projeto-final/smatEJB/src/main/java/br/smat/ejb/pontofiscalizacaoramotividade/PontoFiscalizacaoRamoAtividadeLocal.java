package br.smat.ejb.pontofiscalizacaoramotividade;
import br.smat.ejb.pontofiscalizacao.PontoFiscalizacaoKey;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;
/**
 * Local interface for Enterprise Bean: PontoFiscalizacaoRamoAtividade
 */
public interface PontoFiscalizacaoRamoAtividadeLocal
	extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the pontoFiscalizacao.
	 * @return PontoFiscalizacaoKey
	 */
	public PontoFiscalizacaoKey getPontoFiscalizacao();
	/**
	 * Returns the ramoAtividade.
	 * @return RamoAtividadeKey
	 */
	public RamoAtividadeKey getRamoAtividade();
	/**
	 * Sets the pontoFiscalizacao.
	 * @param pontoFiscalizacao The pontoFiscalizacao to set
	 */
	public void setPontoFiscalizacao(PontoFiscalizacaoKey pontoFiscalizacao);
	/**
	 * Sets the ramoAtividade.
	 * @param ramoAtividade The ramoAtividade to set
	 */
	public void setRamoAtividade(RamoAtividadeKey ramoAtividade);
}
