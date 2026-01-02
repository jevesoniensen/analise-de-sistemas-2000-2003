package br.smat.ejb.relatoriosalvo;
import br.smat.ejb.campo.CampoKey;
/**
 * Local interface for Enterprise Bean: RelatorioSalvo
 */
public interface RelatorioSalvoLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the campo1.
	 * @return CampoKey
	 */
	public CampoKey getCampo1();
	/**
	 * Returns the campo2.
	 * @return CampoKey
	 */
	public CampoKey getCampo2();
	/**
	 * Returns the dataFim.
	 * @return String
	 */
	public String getDataFim();
	/**
	 * Returns the dataInicio.
	 * @return String
	 */
	public String getDataInicio();
	/**
	 * Returns the local.
	 * @return int
	 */
	public int getLocal();
	/**
	 * Returns the periodicidade.
	 * @return int
	 */
	public int getPeriodicidade();
	/**
	 * Returns the queryCampo1.
	 * @return String
	 */
	public String getQueryCampo1();
	/**
	 * Returns the queryCampo2.
	 * @return String
	 */
	public String getQueryCampo2();
	/**
	 * Returns the queryLocal.
	 * @return String
	 */
	public String getQueryLocal();
	/**
	 * Returns the relatorio.
	 * @return int
	 */
	public int getRelatorio();
	/**
	 * Returns the texto.
	 * @return String
	 */
	public String getTexto();
	/**
	 * Returns the tipoAgrupamento.
	 * @return int
	 */
	public int getTipoAgrupamento();
	/**
	 * Returns the titulo.
	 * @return String
	 */
	public String getTitulo();
	/**
	 * Sets the campo1.
	 * @param campo1 The campo1 to set
	 */
	public void setCampo1(CampoKey campo1);
	/**
	 * Sets the campo2.
	 * @param campo2 The campo2 to set
	 */
	public void setCampo2(CampoKey campo2);
	/**
	 * Sets the dataFim.
	 * @param dataFim The dataFim to set
	 */
	public void setDataFim(String dataFim);
	/**
	 * Sets the dataInicio.
	 * @param dataInicio The dataInicio to set
	 */
	public void setDataInicio(String dataInicio);
	/**
	 * Sets the local.
	 * @param local The local to set
	 */
	public void setLocal(int local);
	/**
	 * Sets the periodicidade.
	 * @param periodicidade The periodicidade to set
	 */
	public void setPeriodicidade(int periodicidade);
	/**
	 * Sets the queryCampo1.
	 * @param queryCampo1 The queryCampo1 to set
	 */
	public void setQueryCampo1(String queryCampo1);
	/**
	 * Sets the queryCampo2.
	 * @param queryCampo2 The queryCampo2 to set
	 */
	public void setQueryCampo2(String queryCampo2);
	/**
	 * Sets the queryLocal.
	 * @param queryLocal The queryLocal to set
	 */
	public void setQueryLocal(String queryLocal);
	/**
	 * Sets the texto.
	 * @param texto The texto to set
	 */
	public void setTexto(String texto);
	/**
	 * Sets the tipoAgrupamento.
	 * @param tipoAgrupamento The tipoAgrupamento to set
	 */
	public void setTipoAgrupamento(int tipoAgrupamento);
	/**
	 * Sets the titulo.
	 * @param titulo The titulo to set
	 */
	public void setTitulo(String titulo);
	/**
	 * Returns the dataCriacao.
	 * @return String
	 */
	public String getDataCriacao();
}
