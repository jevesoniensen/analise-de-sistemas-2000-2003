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
 * Local interface for Enterprise Bean: Acidente
 */
public interface AcidenteLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the acidente.
	 * @return int
	 */
	public int getAcidente();
	/**
	 * Returns the afastamento.
	 * @return String
	 */
	public String getAfastamento();
	/**
	 * Returns the agenteCausador.
	 * @return AgenteCausadorKey
	 */
	public AgenteCausadorKey getAgenteCausador();
	/**
	 * Returns the amputacao.
	 * @return String
	 */
	public String getAmputacao();
	/**
	 * Returns the aposentado.
	 * @return String
	 */
	public String getAposentado();
	/**
	 * Returns the area.
	 * @return AreaKey
	 */
	public AreaKey getArea();
	/**
	 * Returns the dataAcidente.
	 * @return String
	 */
	public String getDataAcidente();
	/**
	 * Returns the dataEmissaoFonte.
	 * @return String
	 */
	public String getDataEmissaoFonte();
	/**
	 * Returns the dataHoraDiagnostico.
	 * @return String
	 */
	public String getDataHoraDiagnostico();
	/**
	 * Returns the descLocalAcidente.
	 * @return String
	 */
	public String getDescLocalAcidente();
	/**
	 * Returns the descricaoDiagnostico.
	 * @return String
	 */
	public String getDescricaoDiagnostico();
	/**
	 * Returns the descricaoSituacaoGeradora.
	 * @return String
	 */
	public String getDescricaoSituacaoGeradora();
	/**
	 * Returns the diagnostico.
	 * @return DiagnosticoKey
	 */
	public DiagnosticoKey getDiagnostico();
	/**
	 * Returns the distritoSaude.
	 * @return String
	 */
	public String getDistritoSaude();
	/**
	 * Returns the duracaoTratamento.
	 * @return int
	 */
	public int getDuracaoTratamento();
	/**
	 * Returns the emitente.
	 * @return EmitenteKey
	 */
	public EmitenteKey getEmitente();
	/**
	 * Returns the empregador.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregador();
	/**
	 * Returns the empregadorTerceiro.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregadorTerceiro();
	/**
	 * Returns the fonte.
	 * @return FonteKey
	 */
	public FonteKey getFonte();
	/**
	 * Returns the horasTrabalhadas.
	 * @return int
	 */
	public int getHorasTrabalhadas();
	/**
	 * Returns the internacao.
	 * @return String
	 */
	public String getInternacao();
	/**
	 * Returns the localAtendimento.
	 * @return LocalAtendimentoKey
	 */
	public LocalAtendimentoKey getLocalAtendimento();
	/**
	 * Returns the medico.
	 * @return MedicoKey
	 */
	public MedicoKey getMedico();
	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio();
	/**
	 * Returns the naturezaLesao.
	 * @return String
	 */
	public String getNaturezaLesao();
	/**
	 * Returns the numDocFonte.
	 * @return String
	 */
	public String getNumDocFonte();
	/**
	 * Returns the obito.
	 * @return String
	 */
	public String getObito();
	/**
	 * Returns the observacaoDiagnostico.
	 * @return String
	 */
	public String getObservacaoDiagnostico();
	/**
	 * Returns the ocupacao.
	 * @return OcupacaoKey
	 */
	public OcupacaoKey getOcupacao();
	/**
	 * Returns the registroPolicial.
	 * @return String
	 */
	public String getRegistroPolicial();
	/**
	 * Returns the remuneracao.
	 * @return float
	 */
	public float getRemuneracao();
	/**
	 * Returns the tipoAcidente.
	 * @return TipoAcidenteKey
	 */
	public TipoAcidenteKey getTipoAcidente();
	/**
	 * Returns the tipoLocalAcidente.
	 * @return TipoLocalAcidenteKey
	 */
	public TipoLocalAcidenteKey getTipoLocalAcidente();
	/**
	 * Returns the trabalhador.
	 * @return TrabalhadorKey
	 */
	public TrabalhadorKey getTrabalhador();
	/**
	 * Returns the ultimaTrabalhado.
	 * @return String
	 */
	public String getUltimaTrabalhado();
	/**
	 * Returns the vinculoEmpregaticio.
	 * @return VinculoEmpregaticioKey
	 */
	public VinculoEmpregaticioKey getVinculoEmpregaticio();
	/**
	 * Sets the afastamento.
	 * @param afastamento The afastamento to set
	 */
	public void setAfastamento(String afastamento);
	/**
	 * Sets the agenteCausador.
	 * @param agenteCausador The agenteCausador to set
	 */
	public void setAgenteCausador(AgenteCausadorKey agenteCausador);
	/**
	 * Sets the amputacao.
	 * @param amputacao The amputacao to set
	 */
	public void setAmputacao(String amputacao);
	/**
	 * Sets the aposentado.
	 * @param aposentado The aposentado to set
	 */
	public void setAposentado(String aposentado);
	/**
	 * Sets the area.
	 * @param area The area to set
	 */
	public void setArea(AreaKey area);
	/**
	 * Sets the dataAcidente.
	 * @param dataAcidente The dataAcidente to set
	 */
	public void setDataAcidente(String dataAcidente);
	/**
	 * Sets the dataEmissaoFonte.
	 * @param dataEmissaoFonte The dataEmissaoFonte to set
	 */
	public void setDataEmissaoFonte(String dataEmissaoFonte);
	/**
	 * Sets the dataHoraDiagnostico.
	 * @param dataHoraDiagnostico The dataHoraDiagnostico to set
	 */
	public void setDataHoraDiagnostico(String dataHoraDiagnostico);
	/**
	 * Sets the descLocalAcidente.
	 * @param descLocalAcidente The descLocalAcidente to set
	 */
	public void setDescLocalAcidente(String descLocalAcidente);
	/**
	 * Sets the descricaoDiagnostico.
	 * @param descricaoDiagnostico The descricaoDiagnostico to set
	 */
	public void setDescricaoDiagnostico(String descricaoDiagnostico);
	/**
	 * Sets the descricaoSituacaoGeradora.
	 * @param descricaoSituacaoGeradora The descricaoSituacaoGeradora to set
	 */
	public void setDescricaoSituacaoGeradora(String descricaoSituacaoGeradora);
	/**
	 * Sets the diagnostico.
	 * @param diagnostico The diagnostico to set
	 */
	public void setDiagnostico(DiagnosticoKey diagnostico);
	/**
	 * Sets the distritoSaude.
	 * @param distritoSaude The distritoSaude to set
	 */
	public void setDistritoSaude(String distritoSaude);
	/**
	 * Sets the duracaoTratamento.
	 * @param duracaoTratamento The duracaoTratamento to set
	 */
	public void setDuracaoTratamento(int duracaoTratamento);
	/**
	 * Sets the emitente.
	 * @param emitente The emitente to set
	 */
	public void setEmitente(EmitenteKey emitente);
	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(EmpregadorKey empregador);
	/**
	 * Sets the empregadorTerceiro.
	 * @param empregadorTerceiro The empregadorTerceiro to set
	 */
	public void setEmpregadorTerceiro(EmpregadorKey empregadorTerceiro);
	/**
	 * Sets the fonte.
	 * @param fonte The fonte to set
	 */
	public void setFonte(FonteKey fonte);
	/**
	 * Sets the horasTrabalhadas.
	 * @param horasTrabalhadas The horasTrabalhadas to set
	 */
	public void setHorasTrabalhadas(int horasTrabalhadas);
	/**
	 * Sets the internacao.
	 * @param internacao The internacao to set
	 */
	public void setInternacao(String internacao);
	/**
	 * Sets the localAtendimento.
	 * @param localAtendimento The localAtendimento to set
	 */
	public void setLocalAtendimento(LocalAtendimentoKey localAtendimento);
	/**
	 * Sets the medico.
	 * @param medico The medico to set
	 */
	public void setMedico(MedicoKey medico);
	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(MunicipioKey municipio);
	/**
	 * Sets the naturezaLesao.
	 * @param naturezaLesao The naturezaLesao to set
	 */
	public void setNaturezaLesao(String naturezaLesao);
	/**
	 * Sets the numDocFonte.
	 * @param numDocFonte The numDocFonte to set
	 */
	public void setNumDocFonte(String numDocFonte);
	/**
	 * Sets the obito.
	 * @param obito The obito to set
	 */
	public void setObito(String obito);
	/**
	 * Sets the observacaoDiagnostico.
	 * @param observacaoDiagnostico The observacaoDiagnostico to set
	 */
	public void setObservacaoDiagnostico(String observacaoDiagnostico);
	/**
	 * Sets the ocupacao.
	 * @param ocupacao The ocupacao to set
	 */
	public void setOcupacao(OcupacaoKey ocupacao);
	/**
	 * Sets the registroPolicial.
	 * @param registroPolicial The registroPolicial to set
	 */
	public void setRegistroPolicial(String registroPolicial);
	/**
	 * Sets the remuneracao.
	 * @param remuneracao The remuneracao to set
	 */
	public void setRemuneracao(float remuneracao);
	/**
	 * Sets the tipoAcidente.
	 * @param tipoAcidente The tipoAcidente to set
	 */
	public void setTipoAcidente(TipoAcidenteKey tipoAcidente);
	/**
	 * Sets the tipoLocalAcidente.
	 * @param tipoLocalAcidente The tipoLocalAcidente to set
	 */
	public void setTipoLocalAcidente(TipoLocalAcidenteKey tipoLocalAcidente);
	/**
	 * Sets the trabalhador.
	 * @param trabalhador The trabalhador to set
	 */
	public void setTrabalhador(TrabalhadorKey trabalhador);
	/**
	 * Sets the ultimaTrabalhado.
	 * @param ultimaTrabalhado The ultimaTrabalhado to set
	 */
	public void setUltimaTrabalhado(String ultimaTrabalhado);
	/**
	 * Sets the vinculoEmpregaticio.
	 * @param vinculoEmpregaticio The vinculoEmpregaticio to set
	 */
	public void setVinculoEmpregaticio(VinculoEmpregaticioKey vinculoEmpregaticio);
	public AuxLocalLesao[] getLocaisLesao();
	public AuxTestemunha[] getTestemunhas();
	/**
	 * Returns the investigacao.
	 * @return int
	 */
	public int getInvestigacao();
}
