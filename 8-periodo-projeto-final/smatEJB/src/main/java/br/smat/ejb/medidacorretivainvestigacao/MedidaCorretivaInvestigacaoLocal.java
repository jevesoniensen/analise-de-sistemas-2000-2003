package br.smat.ejb.medidacorretivainvestigacao;
import br.smat.ejb.investigacao.InvestigacaoKey;
import br.smat.ejb.tipomedidacorretiva.TipoMedidaCorretivaKey;
/**
 * Local interface for Enterprise Bean: MedidaCorretivaInvestigacao
 */
public interface MedidaCorretivaInvestigacaoLocal
	extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the investigacao.
	 * @return InvestigacaoKey
	 */
	public InvestigacaoKey getInvestigacao();
	/**
	 * Returns the observacao.
	 * @return String
	 */
	public String getObservacao();
	/**
	 * Returns the prazoDias.
	 * @return int
	 */
	public int getPrazoDias();
	/**
	 * Returns the tipoMedidaCorretiva.
	 * @return TipoMedidaCorretivaKey
	 */
	public TipoMedidaCorretivaKey getTipoMedidaCorretiva();
	/**
	 * Sets the investigacao.
	 * @param investigacao The investigacao to set
	 */
	public void setInvestigacao(InvestigacaoKey investigacao);
	/**
	 * Sets the observacao.
	 * @param observacao The observacao to set
	 */
	public void setObservacao(String observacao);
	/**
	 * Sets the prazoDias.
	 * @param prazoDias The prazoDias to set
	 */
	public void setPrazoDias(int prazoDias);
	/**
	 * Sets the tipoMedidaCorretiva.
	 * @param tipoMedidaCorretiva The tipoMedidaCorretiva to set
	 */
	public void setTipoMedidaCorretiva(TipoMedidaCorretivaKey tipoMedidaCorretiva);
}
