package br.smat.ejb.relatoriosalvo;
import br.smat.ejb.campo.CampoKey;
/**
 * Remote interface for Enterprise Bean: RelatorioSalvo
 */
public interface RelatorioSalvo extends javax.ejb.EJBObject {
	/**
	 * Returns the campo1.
	 * @return CampoKey
	 */
	public CampoKey getCampo1() throws java.rmi.RemoteException;
	/**
	 * Returns the campo2.
	 * @return CampoKey
	 */
	public CampoKey getCampo2() throws java.rmi.RemoteException;
	/**
	 * Returns the dataFim.
	 * @return String
	 */
	public String getDataFim() throws java.rmi.RemoteException;
	/**
	 * Returns the dataInicio.
	 * @return String
	 */
	public String getDataInicio() throws java.rmi.RemoteException;
	/**
	 * Returns the local.
	 * @return int
	 */
	public int getLocal() throws java.rmi.RemoteException;
	/**
	 * Returns the periodicidade.
	 * @return int
	 */
	public int getPeriodicidade() throws java.rmi.RemoteException;
	/**
	 * Returns the queryCampo1.
	 * @return String
	 */
	public String getQueryCampo1() throws java.rmi.RemoteException;
	/**
	 * Returns the queryCampo2.
	 * @return String
	 */
	public String getQueryCampo2() throws java.rmi.RemoteException;
	/**
	 * Returns the queryLocal.
	 * @return String
	 */
	public String getQueryLocal() throws java.rmi.RemoteException;
	/**
	 * Returns the relatorio.
	 * @return int
	 */
	public int getRelatorio() throws java.rmi.RemoteException;
	/**
	 * Returns the texto.
	 * @return String
	 */
	public String getTexto() throws java.rmi.RemoteException;
	/**
	 * Returns the tipoAgrupamento.
	 * @return int
	 */
	public int getTipoAgrupamento() throws java.rmi.RemoteException;
	/**
	 * Returns the titulo.
	 * @return String
	 */
	public String getTitulo() throws java.rmi.RemoteException;
	/**
	 * Sets the campo1.
	 * @param campo1 The campo1 to set
	 */
	public void setCampo1(CampoKey campo1) throws java.rmi.RemoteException;
	/**
	 * Sets the campo2.
	 * @param campo2 The campo2 to set
	 */
	public void setCampo2(CampoKey campo2) throws java.rmi.RemoteException;
	/**
	 * Sets the dataFim.
	 * @param dataFim The dataFim to set
	 */
	public void setDataFim(String dataFim) throws java.rmi.RemoteException;
	/**
	 * Sets the dataInicio.
	 * @param dataInicio The dataInicio to set
	 */
	public void setDataInicio(String dataInicio)
		throws java.rmi.RemoteException;
	/**
	 * Sets the local.
	 * @param local The local to set
	 */
	public void setLocal(int local) throws java.rmi.RemoteException;
	/**
	 * Sets the periodicidade.
	 * @param periodicidade The periodicidade to set
	 */
	public void setPeriodicidade(int periodicidade)
		throws java.rmi.RemoteException;
	/**
	 * Sets the queryCampo1.
	 * @param queryCampo1 The queryCampo1 to set
	 */
	public void setQueryCampo1(String queryCampo1)
		throws java.rmi.RemoteException;
	/**
	 * Sets the queryCampo2.
	 * @param queryCampo2 The queryCampo2 to set
	 */
	public void setQueryCampo2(String queryCampo2)
		throws java.rmi.RemoteException;
	/**
	 * Sets the queryLocal.
	 * @param queryLocal The queryLocal to set
	 */
	public void setQueryLocal(String queryLocal)
		throws java.rmi.RemoteException;
	/**
	 * Sets the texto.
	 * @param texto The texto to set
	 */
	public void setTexto(String texto) throws java.rmi.RemoteException;
	/**
	 * Sets the tipoAgrupamento.
	 * @param tipoAgrupamento The tipoAgrupamento to set
	 */
	public void setTipoAgrupamento(int tipoAgrupamento)
		throws java.rmi.RemoteException;
	/**
	 * Sets the titulo.
	 * @param titulo The titulo to set
	 */
	public void setTitulo(String titulo) throws java.rmi.RemoteException;
	/**
	 * Returns the dataCriacao.
	 * @return String
	 */
	public String getDataCriacao() throws java.rmi.RemoteException;
}
