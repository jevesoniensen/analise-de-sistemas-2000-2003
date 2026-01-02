package br.smat.ejb.acidente;
import br.smat.ejb.agentecausador.AgenteCausadorKey;
import br.smat.ejb.area.AreaKey;
import br.smat.ejb.diagnostico.DiagnosticoKey;
import br.smat.ejb.emitente.EmitenteKey;
import br.smat.ejb.empregador.EmpregadorKey;
import br.smat.ejb.fonte.FonteKey;
import br.smat.ejb.localatendimento.LocalAtendimentoKey;
import br.smat.ejb.medico.MedicoKey;
import br.smat.ejb.municipio.MunicipioKey;
import br.smat.ejb.ocupacao.OcupacaoKey;
import br.smat.ejb.tipoacidente.TipoAcidenteKey;
import br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey;
import br.smat.ejb.trabalhador.TrabalhadorKey;
import br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioKey;
import br.smat.objetosauxiliares.auxlocallesao.AuxLocalLesao;
import br.smat.objetosauxiliares.auxtestemunha.AuxTestemunha;
/**
 * Remote interface for Enterprise Bean: Acidente
 */
public interface Acidente extends javax.ejb.EJBObject {
	/**
	 * Returns the acidente.
	 * @return int
	 */
	public int getAcidente() throws java.rmi.RemoteException;
	/**
	 * Returns the afastamento.
	 * @return String
	 */
	public String getAfastamento() throws java.rmi.RemoteException;
	/**
	 * Returns the agenteCausador.
	 * @return AgenteCausadorKey
	 */
	public AgenteCausadorKey getAgenteCausador()
		throws java.rmi.RemoteException;
	/**
	 * Returns the amputacao.
	 * @return String
	 */
	public String getAmputacao() throws java.rmi.RemoteException;
	/**
	 * Returns the aposentado.
	 * @return String
	 */
	public String getAposentado() throws java.rmi.RemoteException;
	/**
	 * Returns the area.
	 * @return AreaKey
	 */
	public AreaKey getArea() throws java.rmi.RemoteException;
	/**
	 * Returns the dataAcidente.
	 * @return String
	 */
	public String getDataAcidente() throws java.rmi.RemoteException;
	/**
	 * Returns the dataEmissaoFonte.
	 * @return String
	 */
	public String getDataEmissaoFonte() throws java.rmi.RemoteException;
	/**
	 * Returns the dataHoraDiagnostico.
	 * @return String
	 */
	public String getDataHoraDiagnostico() throws java.rmi.RemoteException;
	/**
	 * Returns the descLocalAcidente.
	 * @return String
	 */
	public String getDescLocalAcidente() throws java.rmi.RemoteException;
	/**
	 * Returns the descricaoDiagnostico.
	 * @return String
	 */
	public String getDescricaoDiagnostico() throws java.rmi.RemoteException;
	/**
	 * Returns the descricaoSituacaoGeradora.
	 * @return String
	 */
	public String getDescricaoSituacaoGeradora()
		throws java.rmi.RemoteException;
	/**
	 * Returns the diagnostico.
	 * @return DiagnosticoKey
	 */
	public DiagnosticoKey getDiagnostico() throws java.rmi.RemoteException;
	/**
	 * Returns the distritoSaude.
	 * @return String
	 */
	public String getDistritoSaude() throws java.rmi.RemoteException;
	/**
	 * Returns the duracaoTratamento.
	 * @return int
	 */
	public int getDuracaoTratamento() throws java.rmi.RemoteException;
	/**
	 * Returns the emitente.
	 * @return EmitenteKey
	 */
	public EmitenteKey getEmitente() throws java.rmi.RemoteException;
	/**
	 * Returns the empregador.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregador() throws java.rmi.RemoteException;
	/**
	 * Returns the empregadorTerceiro.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregadorTerceiro()
		throws java.rmi.RemoteException;
	/**
	 * Returns the fonte.
	 * @return FonteKey
	 */
	public FonteKey getFonte() throws java.rmi.RemoteException;
	/**
	 * Returns the horasTrabalhadas.
	 * @return int
	 */
	public int getHorasTrabalhadas() throws java.rmi.RemoteException;
	/**
	 * Returns the internacao.
	 * @return String
	 */
	public String getInternacao() throws java.rmi.RemoteException;
	/**
	 * Returns the localAtendimento.
	 * @return LocalAtendimentoKey
	 */
	public LocalAtendimentoKey getLocalAtendimento()
		throws java.rmi.RemoteException;
	/**
	 * Returns the medico.
	 * @return MedicoKey
	 */
	public MedicoKey getMedico() throws java.rmi.RemoteException;
	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio() throws java.rmi.RemoteException;
	/**
	 * Returns the naturezaLesao.
	 * @return String
	 */
	public String getNaturezaLesao() throws java.rmi.RemoteException;
	/**
	 * Returns the numDocFonte.
	 * @return String
	 */
	public String getNumDocFonte() throws java.rmi.RemoteException;
	/**
	 * Returns the obito.
	 * @return String
	 */
	public String getObito() throws java.rmi.RemoteException;
	/**
	 * Returns the observacaoDiagnostico.
	 * @return String
	 */
	public String getObservacaoDiagnostico() throws java.rmi.RemoteException;
	/**
	 * Returns the ocupacao.
	 * @return OcupacaoKey
	 */
	public OcupacaoKey getOcupacao() throws java.rmi.RemoteException;
	/**
	 * Returns the registroPolicial.
	 * @return String
	 */
	public String getRegistroPolicial() throws java.rmi.RemoteException;
	/**
	 * Returns the remuneracao.
	 * @return float
	 */
	public float getRemuneracao() throws java.rmi.RemoteException;
	/**
	 * Returns the tipoAcidente.
	 * @return TipoAcidenteKey
	 */
	public TipoAcidenteKey getTipoAcidente() throws java.rmi.RemoteException;
	/**
	 * Returns the tipoLocalAcidente.
	 * @return TipoLocalAcidenteKey
	 */
	public TipoLocalAcidenteKey getTipoLocalAcidente()
		throws java.rmi.RemoteException;
	/**
	 * Returns the trabalhador.
	 * @return TrabalhadorKey
	 */
	public TrabalhadorKey getTrabalhador() throws java.rmi.RemoteException;
	/**
	 * Returns the ultimaTrabalhado.
	 * @return String
	 */
	public String getUltimaTrabalhado() throws java.rmi.RemoteException;
	/**
	 * Returns the vinculoEmpregaticio.
	 * @return VinculoEmpregaticioKey
	 */
	public VinculoEmpregaticioKey getVinculoEmpregaticio()
		throws java.rmi.RemoteException;
	/**
	 * Sets the afastamento.
	 * @param afastamento The afastamento to set
	 */
	public void setAfastamento(String afastamento)
		throws java.rmi.RemoteException;
	/**
	 * Sets the agenteCausador.
	 * @param agenteCausador The agenteCausador to set
	 */
	public void setAgenteCausador(AgenteCausadorKey agenteCausador)
		throws java.rmi.RemoteException;
	/**
	 * Sets the amputacao.
	 * @param amputacao The amputacao to set
	 */
	public void setAmputacao(String amputacao) throws java.rmi.RemoteException;
	/**
	 * Sets the aposentado.
	 * @param aposentado The aposentado to set
	 */
	public void setAposentado(String aposentado)
		throws java.rmi.RemoteException;
	/**
	 * Sets the area.
	 * @param area The area to set
	 */
	public void setArea(AreaKey area) throws java.rmi.RemoteException;
	/**
	 * Sets the dataAcidente.
	 * @param dataAcidente The dataAcidente to set
	 */
	public void setDataAcidente(String dataAcidente)
		throws java.rmi.RemoteException;
	/**
	 * Sets the dataEmissaoFonte.
	 * @param dataEmissaoFonte The dataEmissaoFonte to set
	 */
	public void setDataEmissaoFonte(String dataEmissaoFonte)
		throws java.rmi.RemoteException;
	/**
	 * Sets the dataHoraDiagnostico.
	 * @param dataHoraDiagnostico The dataHoraDiagnostico to set
	 */
	public void setDataHoraDiagnostico(String dataHoraDiagnostico)
		throws java.rmi.RemoteException;
	/**
	 * Sets the descLocalAcidente.
	 * @param descLocalAcidente The descLocalAcidente to set
	 */
	public void setDescLocalAcidente(String descLocalAcidente)
		throws java.rmi.RemoteException;
	/**
	 * Sets the descricaoDiagnostico.
	 * @param descricaoDiagnostico The descricaoDiagnostico to set
	 */
	public void setDescricaoDiagnostico(String descricaoDiagnostico)
		throws java.rmi.RemoteException;
	/**
	 * Sets the descricaoSituacaoGeradora.
	 * @param descricaoSituacaoGeradora The descricaoSituacaoGeradora to set
	 */
	public void setDescricaoSituacaoGeradora(String descricaoSituacaoGeradora)
		throws java.rmi.RemoteException;
	/**
	 * Sets the diagnostico.
	 * @param diagnostico The diagnostico to set
	 */
	public void setDiagnostico(DiagnosticoKey diagnostico)
		throws java.rmi.RemoteException;
	/**
	 * Sets the distritoSaude.
	 * @param distritoSaude The distritoSaude to set
	 */
	public void setDistritoSaude(String distritoSaude)
		throws java.rmi.RemoteException;
	/**
	 * Sets the duracaoTratamento.
	 * @param duracaoTratamento The duracaoTratamento to set
	 */
	public void setDuracaoTratamento(int duracaoTratamento)
		throws java.rmi.RemoteException;
	/**
	 * Sets the emitente.
	 * @param emitente The emitente to set
	 */
	public void setEmitente(EmitenteKey emitente)
		throws java.rmi.RemoteException;
	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(EmpregadorKey empregador)
		throws java.rmi.RemoteException;
	/**
	 * Sets the empregadorTerceiro.
	 * @param empregadorTerceiro The empregadorTerceiro to set
	 */
	public void setEmpregadorTerceiro(EmpregadorKey empregadorTerceiro)
		throws java.rmi.RemoteException;
	/**
	 * Sets the fonte.
	 * @param fonte The fonte to set
	 */
	public void setFonte(FonteKey fonte) throws java.rmi.RemoteException;
	/**
	 * Sets the horasTrabalhadas.
	 * @param horasTrabalhadas The horasTrabalhadas to set
	 */
	public void setHorasTrabalhadas(int horasTrabalhadas)
		throws java.rmi.RemoteException;
	/**
	 * Sets the internacao.
	 * @param internacao The internacao to set
	 */
	public void setInternacao(String internacao)
		throws java.rmi.RemoteException;
	/**
	 * Sets the localAtendimento.
	 * @param localAtendimento The localAtendimento to set
	 */
	public void setLocalAtendimento(LocalAtendimentoKey localAtendimento)
		throws java.rmi.RemoteException;
	/**
	 * Sets the medico.
	 * @param medico The medico to set
	 */
	public void setMedico(MedicoKey medico) throws java.rmi.RemoteException;
	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(MunicipioKey municipio)
		throws java.rmi.RemoteException;
	/**
	 * Sets the naturezaLesao.
	 * @param naturezaLesao The naturezaLesao to set
	 */
	public void setNaturezaLesao(String naturezaLesao)
		throws java.rmi.RemoteException;
	/**
	 * Sets the numDocFonte.
	 * @param numDocFonte The numDocFonte to set
	 */
	public void setNumDocFonte(String numDocFonte)
		throws java.rmi.RemoteException;
	/**
	 * Sets the obito.
	 * @param obito The obito to set
	 */
	public void setObito(String obito) throws java.rmi.RemoteException;
	/**
	 * Sets the observacaoDiagnostico.
	 * @param observacaoDiagnostico The observacaoDiagnostico to set
	 */
	public void setObservacaoDiagnostico(String observacaoDiagnostico)
		throws java.rmi.RemoteException;
	/**
	 * Sets the ocupacao.
	 * @param ocupacao The ocupacao to set
	 */
	public void setOcupacao(OcupacaoKey ocupacao)
		throws java.rmi.RemoteException;
	/**
	 * Sets the registroPolicial.
	 * @param registroPolicial The registroPolicial to set
	 */
	public void setRegistroPolicial(String registroPolicial)
		throws java.rmi.RemoteException;
	/**
	 * Sets the remuneracao.
	 * @param remuneracao The remuneracao to set
	 */
	public void setRemuneracao(float remuneracao)
		throws java.rmi.RemoteException;
	/**
	 * Sets the tipoAcidente.
	 * @param tipoAcidente The tipoAcidente to set
	 */
	public void setTipoAcidente(TipoAcidenteKey tipoAcidente)
		throws java.rmi.RemoteException;
	/**
	 * Sets the tipoLocalAcidente.
	 * @param tipoLocalAcidente The tipoLocalAcidente to set
	 */
	public void setTipoLocalAcidente(TipoLocalAcidenteKey tipoLocalAcidente)
		throws java.rmi.RemoteException;
	/**
	 * Sets the trabalhador.
	 * @param trabalhador The trabalhador to set
	 */
	public void setTrabalhador(TrabalhadorKey trabalhador)
		throws java.rmi.RemoteException;
	/**
	 * Sets the ultimaTrabalhado.
	 * @param ultimaTrabalhado The ultimaTrabalhado to set
	 */
	public void setUltimaTrabalhado(String ultimaTrabalhado)
		throws java.rmi.RemoteException;
	/**
	 * Sets the vinculoEmpregaticio.
	 * @param vinculoEmpregaticio The vinculoEmpregaticio to set
	 */
	public void setVinculoEmpregaticio(VinculoEmpregaticioKey vinculoEmpregaticio)
		throws java.rmi.RemoteException;

	public AuxLocalLesao[] getLocaisLesao() throws java.rmi.RemoteException;
	public AuxTestemunha[] getTestemunhas() throws java.rmi.RemoteException;
	/**
	 * Returns the investigacao.
	 * @return int
	 */
	public int getInvestigacao() throws java.rmi.RemoteException;
}
