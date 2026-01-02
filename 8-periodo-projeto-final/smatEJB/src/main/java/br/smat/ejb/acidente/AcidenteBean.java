package br.smat.ejb.acidente;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Collection;
import java.util.Vector;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;

import br.smat.conexao.Conexao; 
import br.smat.ejb.agentecausador.AgenteCausadorKey;
import br.smat.ejb.area.AreaKey;
import br.smat.ejb.diagnostico.DiagnosticoKey;
import br.smat.ejb.emitente.EmitenteKey;
import br.smat.ejb.empregador.EmpregadorKey;
import br.smat.ejb.fonte.FonteKey;
import br.smat.ejb.localatendimento.LocalAtendimentoKey;
import br.smat.ejb.locallesao.LocalLesaoKey;
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
 * Bean implementation class for Enterprise Bean: Acidente
 */
public class AcidenteBean implements javax.ejb.EntityBean {
	private javax.ejb.EntityContext ctx;

       private int 		acidente;
       private AreaKey 	area;
       private	VinculoEmpregaticioKey 	vinculoEmpregaticio;
       private OcupacaoKey				ocupacao;
       private	LocalAtendimentoKey		localAtendimento;
       private	EmpregadorKey			empregador;
       private	MedicoKey				medico;
       private	DiagnosticoKey			diagnostico;
       private FonteKey				fonte;
       private	AgenteCausadorKey		agenteCausador;
       private	TipoLocalAcidenteKey	tipoLocalAcidente;
       private	TrabalhadorKey			trabalhador;
       private	EmpregadorKey			empregadorTerceiro;
       private	TipoAcidenteKey			tipoAcidente;
       private	EmitenteKey				emitente;
       private	MunicipioKey			municipio;
       private	String					dataAcidente;
       private	String					registroPolicial;
       private	String					amputacao;
       private	String					obito;
       private	int					horasTrabalhadas;
       private	String					descLocalAcidente;
       private	String					numDocFonte;
       private	String					dataEmissaoFonte;
       private	String					naturezaLesao;
       private	String					dataHoraDiagnostico;
       private	String					afastamento;
       private	String					internacao;
       private	String					observacaoDiagnostico;
       private	int					duracaoTratamento;
       private	String					aposentado;
       private	float					remuneracao;
       private	String					distritoSaude;
       private	String					ultimaTrabalhado;
       private	String					descricaoSituacaoGeradora;
       private	String					descricaoDiagnostico;
       
       private int investigacao=0;
       
       private boolean				atualiza;				

	/**
	 * Returns the acidente.
	 * @return int
	 */
	public int getAcidente() {
		atualiza = false;
		return acidente;
	}

	/**
	 * Returns the afastamento.
	 * @return String
	 */
	public String getAfastamento() {
		atualiza = false;		
		return afastamento;
	}

	/**
	 * Returns the agenteCausador.
	 * @return AgenteCausadorKey
	 */
	public AgenteCausadorKey getAgenteCausador() {
		atualiza = false;		
		return agenteCausador;
	}

	/**
	 * Returns the amputacao.
	 * @return String
	 */
	public String getAmputacao() {
		atualiza = false;
		return amputacao;
	}

	/**
	 * Returns the aposentado.
	 * @return String
	 */
	public String getAposentado() {
		atualiza = false;
		return aposentado;
	}

	/**
	 * Returns the area.
	 * @return AreaKey
	 */
	public AreaKey getArea() {
		atualiza = false;
		return area;
	}

	/**
	 * Returns the dataAcidente.
	 * @return String
	 */
	public String getDataAcidente() {
		atualiza = false;
		return dataAcidente;
	}

	/**
	 * Returns the dataEmissaoFonte.
	 * @return String
	 */
	public String getDataEmissaoFonte() {
		atualiza = false;
		return dataEmissaoFonte;
	}

	/**
	 * Returns the dataHoraDiagnostico.
	 * @return String
	 */
	public String getDataHoraDiagnostico() {
		atualiza = false;
		return dataHoraDiagnostico;
	}

	/**
	 * Returns the descLocalAcidente.
	 * @return String
	 */
	public String getDescLocalAcidente() {
		atualiza = false;
		return descLocalAcidente;
	}

	/**
	 * Returns the descricaoDiagnostico.
	 * @return String
	 */
	public String getDescricaoDiagnostico() {
		atualiza = false;
		return descricaoDiagnostico;
	}

	/**
	 * Returns the descricaoSituacaoGeradora.
	 * @return String
	 */
	public String getDescricaoSituacaoGeradora() {
		atualiza = false;
		return descricaoSituacaoGeradora;
	}

	/**
	 * Returns the diagnostico.
	 * @return DiagnosticoKey
	 */
	public DiagnosticoKey getDiagnostico() {
		atualiza = false;
		return diagnostico;
	}

	/**
	 * Returns the distritoSaude.
	 * @return String
	 */
	public String getDistritoSaude() {
		atualiza = false;
		return distritoSaude;
	}

	/**
	 * Returns the duracaoTratamento.
	 * @return int
	 */
	public int getDuracaoTratamento() {
		atualiza = false;
		return duracaoTratamento;
	}

	/**
	 * Returns the emitente.
	 * @return EmitenteKey
	 */
	public EmitenteKey getEmitente() {
		atualiza = false;
		return emitente;
	}

	/**
	 * Returns the empregador.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregador() {
		atualiza = false;
		return empregador;
	}

	/**
	 * Returns the empregadorTerceiro.
	 * @return EmpregadorKey
	 */
	public EmpregadorKey getEmpregadorTerceiro() {
		atualiza = false;
		return empregadorTerceiro;
	}

	/**
	 * Returns the fonte.
	 * @return FonteKey
	 */
	public FonteKey getFonte() {
		atualiza = false;
		return fonte;
	}

	/**
	 * Returns the horasTrabalhadas.
	 * @return int
	 */
	public int getHorasTrabalhadas() {
		atualiza = false;
		return horasTrabalhadas;
	}

	/**
	 * Returns the internacao.
	 * @return String
	 */
	public String getInternacao() {
		atualiza = false;
		return internacao;
	}

	/**
	 * Returns the localAtendimento.
	 * @return LocalAtendimentoKey
	 */
	public LocalAtendimentoKey getLocalAtendimento() {
		atualiza = false;
		return localAtendimento;
	}

	/**
	 * Returns the medico.
	 * @return MedicoKey
	 */
	public MedicoKey getMedico() {
		atualiza = false;
		return medico;
	}

	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio() {
		atualiza = false;
		return municipio;
	}

	/**
	 * Returns the naturezaLesao.
	 * @return String
	 */
	public String getNaturezaLesao() {
		atualiza = false;
		return naturezaLesao;
	}

	/**
	 * Returns the numDocFonte.
	 * @return String
	 */
	public String getNumDocFonte() {
		atualiza = false;
		return numDocFonte;
	}

	/**
	 * Returns the obito.
	 * @return String
	 */
	public String getObito() {
		atualiza = false;
		return obito;
	}

	/**
	 * Returns the observacaoDiagnostico.
	 * @return String
	 */
	public String getObservacaoDiagnostico() {
		atualiza = false;
		return observacaoDiagnostico;
	}

	/**
	 * Returns the ocupacao.
	 * @return OcupacaoKey
	 */
	public OcupacaoKey getOcupacao() {
		atualiza = false;
		return ocupacao;
	}

	/**
	 * Returns the registroPolicial.
	 * @return String
	 */
	public String getRegistroPolicial() {
		atualiza = false;
		return registroPolicial;
	}

	/**
	 * Returns the remuneracao.
	 * @return float
	 */
	public float getRemuneracao() {
		atualiza = false;
		return remuneracao;
	}

	/**
	 * Returns the tipoAcidente.
	 * @return TipoAcidenteKey
	 */
	public TipoAcidenteKey getTipoAcidente() {
		atualiza = false;
		return tipoAcidente;
	}

	/**
	 * Returns the tipoLocalAcidente.
	 * @return TipoLocalAcidenteKey
	 */
	public TipoLocalAcidenteKey getTipoLocalAcidente() {
		atualiza = false;
		return tipoLocalAcidente;
	}

	/**
	 * Returns the trabalhador.
	 * @return TrabalhadorKey
	 */
	public TrabalhadorKey getTrabalhador() {
		atualiza = false;
		return trabalhador;
	}

	/**
	 * Returns the ultimaTrabalhado.
	 * @return String
	 */
	public String getUltimaTrabalhado() {
		atualiza = false;
		return ultimaTrabalhado;
	}

	/**
	 * Returns the vinculoEmpregaticio.
	 * @return VinculoEmpregaticioKey
	 */
	public VinculoEmpregaticioKey getVinculoEmpregaticio() {
		atualiza = false;
		return vinculoEmpregaticio;
	}

	/**
	 * Sets the acidente.
	 * @param acidente The acidente to set
	 */
	public void setAcidente(int acidente) {
		atualiza = true;		
		this.acidente = acidente;
	}

	/**
	 * Sets the afastamento.
	 * @param afastamento The afastamento to set
	 */
	public void setAfastamento(String afastamento) {
		atualiza = true;		
		this.afastamento = afastamento;
	}

	/**
	 * Sets the agenteCausador.
	 * @param agenteCausador The agenteCausador to set
	 */
	public void setAgenteCausador(AgenteCausadorKey agenteCausador) {
		atualiza = true;		
		this.agenteCausador = agenteCausador;
	}

	/**
	 * Sets the amputacao.
	 * @param amputacao The amputacao to set
	 */
	public void setAmputacao(String amputacao) {
		atualiza = true;		
		this.amputacao = amputacao;
	}

	/**
	 * Sets the aposentado.
	 * @param aposentado The aposentado to set
	 */
	public void setAposentado(String aposentado) {
		atualiza = true;		
		this.aposentado = aposentado;
	}

	/**
	 * Sets the area.
	 * @param area The area to set
	 */
	public void setArea(AreaKey area) {
		atualiza = true;		
		this.area = area;
	}

	/**
	 * Sets the dataAcidente.
	 * @param dataAcidente The dataAcidente to set
	 */
	public void setDataAcidente(String dataAcidente) {
		atualiza = true;		
		this.dataAcidente = dataAcidente;
	}

	/**
	 * Sets the dataEmissaoFonte.
	 * @param dataEmissaoFonte The dataEmissaoFonte to set
	 */
	public void setDataEmissaoFonte(String dataEmissaoFonte) {
		atualiza = true;		
		this.dataEmissaoFonte = dataEmissaoFonte;
	}

	/**
	 * Sets the dataHoraDiagnostico.
	 * @param dataHoraDiagnostico The dataHoraDiagnostico to set
	 */
	public void setDataHoraDiagnostico(String dataHoraDiagnostico) {
		atualiza = true;		
		this.dataHoraDiagnostico = dataHoraDiagnostico;
	}

	/**
	 * Sets the descLocalAcidente.
	 * @param descLocalAcidente The descLocalAcidente to set
	 */
	public void setDescLocalAcidente(String descLocalAcidente) {
		atualiza = true;		
		this.descLocalAcidente = descLocalAcidente;
	}

	/**
	 * Sets the descricaoDiagnostico.
	 * @param descricaoDiagnostico The descricaoDiagnostico to set
	 */
	public void setDescricaoDiagnostico(String descricaoDiagnostico) {
		atualiza = true;		
		this.descricaoDiagnostico = descricaoDiagnostico;
	}

	/**
	 * Sets the descricaoSituacaoGeradora.
	 * @param descricaoSituacaoGeradora The descricaoSituacaoGeradora to set
	 */
	public void setDescricaoSituacaoGeradora(String descricaoSituacaoGeradora) {
		atualiza = true;		
		this.descricaoSituacaoGeradora = descricaoSituacaoGeradora;
	}

	/**
	 * Sets the diagnostico.
	 * @param diagnostico The diagnostico to set
	 */
	public void setDiagnostico(DiagnosticoKey diagnostico) {
		atualiza = true;		
		this.diagnostico = diagnostico;
	}

	/**
	 * Sets the distritoSaude.
	 * @param distritoSaude The distritoSaude to set
	 */
	public void setDistritoSaude(String distritoSaude) {
		atualiza = true;		
		this.distritoSaude = distritoSaude;
	}

	/**
	 * Sets the duracaoTratamento.
	 * @param duracaoTratamento The duracaoTratamento to set
	 */
	public void setDuracaoTratamento(int duracaoTratamento) {
		atualiza = true;		
		this.duracaoTratamento = duracaoTratamento;
	}

	/**
	 * Sets the emitente.
	 * @param emitente The emitente to set
	 */
	public void setEmitente(EmitenteKey emitente) {
		atualiza = true;		
		this.emitente = emitente;
	}

	/**
	 * Sets the empregador.
	 * @param empregador The empregador to set
	 */
	public void setEmpregador(EmpregadorKey empregador) {
		atualiza = true;		
		this.empregador = empregador;
	}

	/**
	 * Sets the empregadorTerceiro.
	 * @param empregadorTerceiro The empregadorTerceiro to set
	 */
	public void setEmpregadorTerceiro(EmpregadorKey empregadorTerceiro) {
		atualiza = true;		
		this.empregadorTerceiro = empregadorTerceiro;
	}

	/**
	 * Sets the fonte.
	 * @param fonte The fonte to set
	 */
	public void setFonte(FonteKey fonte) {
		atualiza = true;		
		this.fonte = fonte;
	}

	/**
	 * Sets the horasTrabalhadas.
	 * @param horasTrabalhadas The horasTrabalhadas to set
	 */
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		atualiza = true;		
		this.horasTrabalhadas = horasTrabalhadas;
	}

	/**
	 * Sets the internacao.
	 * @param internacao The internacao to set
	 */
	public void setInternacao(String internacao) {
		atualiza = true;		
		this.internacao = internacao;
	}

	/**
	 * Sets the localAtendimento.
	 * @param localAtendimento The localAtendimento to set
	 */
	public void setLocalAtendimento(LocalAtendimentoKey localAtendimento) {
		atualiza = true;		
		this.localAtendimento = localAtendimento;
	}

	/**
	 * Sets the medico.
	 * @param medico The medico to set
	 */
	public void setMedico(MedicoKey medico) {
		atualiza = true;		
		this.medico = medico;
	}

	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(MunicipioKey municipio) {
		atualiza = true;		
		this.municipio = municipio;
	}

	/**
	 * Sets the naturezaLesao.
	 * @param naturezaLesao The naturezaLesao to set
	 */
	public void setNaturezaLesao(String naturezaLesao) {
		atualiza = true;		
		this.naturezaLesao = naturezaLesao;
	}

	/**
	 * Sets the numDocFonte.
	 * @param numDocFonte The numDocFonte to set
	 */
	public void setNumDocFonte(String numDocFonte) {
		atualiza = true;		
		this.numDocFonte = numDocFonte;
	}

	/**
	 * Sets the obito.
	 * @param obito The obito to set
	 */
	public void setObito(String obito) {
		atualiza = true;		
		this.obito = obito;
	}

	/**
	 * Sets the observacaoDiagnostico.
	 * @param observacaoDiagnostico The observacaoDiagnostico to set
	 */
	public void setObservacaoDiagnostico(String observacaoDiagnostico) {
		atualiza = true;		
		this.observacaoDiagnostico = observacaoDiagnostico;
	}

	/**
	 * Sets the ocupacao.
	 * @param ocupacao The ocupacao to set
	 */
	public void setOcupacao(OcupacaoKey ocupacao) {
		atualiza = true;		
		this.ocupacao = ocupacao;
	}

	/**
	 * Sets the registroPolicial.
	 * @param registroPolicial The registroPolicial to set
	 */
	public void setRegistroPolicial(String registroPolicial) {
		atualiza = true;		
		this.registroPolicial = registroPolicial;
	}

	/**
	 * Sets the remuneracao.
	 * @param remuneracao The remuneracao to set
	 */
	public void setRemuneracao(float remuneracao) {
		atualiza = true;		
		this.remuneracao = remuneracao;
	}

	/**
	 * Sets the tipoAcidente.
	 * @param tipoAcidente The tipoAcidente to set
	 */
	public void setTipoAcidente(TipoAcidenteKey tipoAcidente) {
		atualiza = true;		
		this.tipoAcidente = tipoAcidente;
	}

	/**
	 * Sets the tipoLocalAcidente.
	 * @param tipoLocalAcidente The tipoLocalAcidente to set
	 */
	public void setTipoLocalAcidente(TipoLocalAcidenteKey tipoLocalAcidente) {
		atualiza = true;		
		this.tipoLocalAcidente = tipoLocalAcidente;
	}

	/**
	 * Sets the trabalhador.
	 * @param trabalhador The trabalhador to set
	 */
	public void setTrabalhador(TrabalhadorKey trabalhador) {
		atualiza = true;		
		this.trabalhador = trabalhador;
	}

	/**
	 * Sets the ultimaTrabalhado.
	 * @param ultimaTrabalhado The ultimaTrabalhado to set
	 */
	public void setUltimaTrabalhado(String ultimaTrabalhado) {
		atualiza = true;		
		this.ultimaTrabalhado = ultimaTrabalhado;
	}

	/**
	 * Sets the vinculoEmpregaticio.
	 * @param vinculoEmpregaticio The vinculoEmpregaticio to set
	 */
	public void setVinculoEmpregaticio(VinculoEmpregaticioKey vinculoEmpregaticio) {
		atualiza = true;		
		this.vinculoEmpregaticio = vinculoEmpregaticio;
	}
	
	public AuxLocalLesao[]	getLocaisLesao(){

		Vector l = new Vector();
		
		Connection conn = null;
		atualiza = false;		
		try{
			conn = Conexao.getConnection();
			AcidenteKey key = (AcidenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_locaislesaoacidentes ?");
		    stmt.setInt(1,key.acidente);
	    	ResultSet rs = stmt.executeQuery();

		    while(rs.next()){
		    	l.add(new AuxLocalLesao(rs.getInt("localLesao"),rs.getString("nome")));
		    }

		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){}
		}

		if(l.size() == 0)
			return null;

		return (AuxLocalLesao[])l.toArray(new AuxLocalLesao[0]);
	}
	
	public AuxTestemunha[] getTestemunhas(){

		Vector l = new Vector();
		
		Connection conn = null;
		atualiza = false;		
		try{
			conn = Conexao.getConnection();
			AcidenteKey key = (AcidenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_testemunhasacidentes ?");
		    stmt.setInt(1,key.acidente);
	    	ResultSet rs = stmt.executeQuery();
			
						
		    while(rs.next()){

		    	l.addElement(new AuxTestemunha(rs.getString("nome"),
									    rs.getInt("municipio"),
									    rs.getInt("estado"),
										rs.getString("rua"),
										rs.getString("bairro"),
										rs.getInt("numero"),
										rs.getString("complemento"),
										rs.getString("cep"),
										rs.getString("telefone"),
										rs.getString("ddd")));
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){}
		}
		
		if(l.size() == 0)
			return null;

		return (AuxTestemunha[])l.toArray(new AuxTestemunha[0]);
				
	}

	/**
	 * Returns the investigacao.
	 * @return int
	 */
	public int getInvestigacao() {
		
		if(investigacao == 0 ){

			Connection conn = null;
			atualiza = false;		
			try{
				conn = Conexao.getConnection();
				AcidenteKey key = (AcidenteKey)ctx.getPrimaryKey();
				PreparedStatement stmt = conn.prepareStatement
					("exec sp_smat_listar_investigacoes null,?");
		    stmt.setInt(1,key.acidente);
	    	ResultSet rs = stmt.executeQuery();
						
		    if(rs.next()){
				investigacao = rs.getInt("investigacao");
		    }
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){}
			}
		}

		return investigacao;
	}
	/*private String converteData(String data) {
		String dataFormatada = null;

		System.out.println("Data => " + data);

		if(data != null)
		{
			dataFormatada =  data.substring(3,5) + "/" + data.substring(0,2) + "/" + data.substring(6,10);
			
			if(data.length() > 10)
				dataFormatada+= " " + data.substring(11);
		}

		System.out.println("Data formatada => " + dataFormatada);
		
		return dataFormatada;
	}*/

	/**
	 * ejbActivate
	 */
	public void ejbActivate() {

		atualiza = false;		
		acidente= 0;
		area= null;
		vinculoEmpregaticio= null;
		ocupacao= null;
		localAtendimento= null;
		empregador= null;
		medico= null;
		diagnostico= null;
		fonte= null;
		agenteCausador= null;
		tipoLocalAcidente= null;
		trabalhador= null;
		empregadorTerceiro= null;
		tipoAcidente= null;
		emitente= null;
		municipio= null;
		dataAcidente= null;
		registroPolicial= null;
		amputacao= null;
		obito= null;
		horasTrabalhadas= 0;
		descLocalAcidente= null;
		numDocFonte= null;
		dataEmissaoFonte= null;
		naturezaLesao= null;
		dataHoraDiagnostico= null;
		afastamento= null;
		internacao= null;
		observacaoDiagnostico= null;
		duracaoTratamento= 0;
		aposentado= null;
		remuneracao= 0;
		distritoSaude= null;
		ultimaTrabalhado= null;
		descricaoSituacaoGeradora= null;
		descricaoDiagnostico= null;
		investigacao = 0;
	}
	/**
	 * ejbLoad
	 */
	public void ejbLoad() {
		
		Connection conn = null;
		atualiza = false;		
		try{
			conn = Conexao.getConnection();
			AcidenteKey key = (AcidenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_listar_acidentes ?");
		    stmt.setInt(1,key.acidente);
	    	ResultSet rs = stmt.executeQuery();

		    if(rs.next()){
		    	acidente = rs.getInt("acidente");

		    	if(rs.getInt("area") > 0)
			    	area = new AreaKey(rs.getInt("area"));

				if(rs.getInt("vinculoEmpregaticio") > 0)
			    	vinculoEmpregaticio = new VinculoEmpregaticioKey(rs.getInt("vinculoEmpregaticio"));			    			    	

				if(rs.getInt("ocupacao") > 0)
			    	ocupacao = new OcupacaoKey(rs.getInt("ocupacao"));

				if(rs.getInt("localAtendimento") > 0)
			    	localAtendimento = new LocalAtendimentoKey(rs.getInt("localAtendimento"));

				if(rs.getInt("empregador") > 0)
			    	empregador = new EmpregadorKey(rs.getInt("empregador"));

				if(rs.getInt("medico") > 0)
			    	medico = new MedicoKey(rs.getInt("medico"));

				if(rs.getInt("diagnostico") > 0)
			    	diagnostico = new DiagnosticoKey(rs.getInt("diagnostico"));

				if(rs.getInt("fonte") > 0)
			    	fonte = new FonteKey(rs.getInt("fonte"));

				if(rs.getInt("agenteCausador") > 0)
			    	agenteCausador = new AgenteCausadorKey(rs.getInt("agenteCausador"));

				if(rs.getInt("tipoLocalAcidente") > 0)
			    	tipoLocalAcidente = new TipoLocalAcidenteKey(rs.getInt("tipoLocalAcidente"));

				if(rs.getInt("trabalhador") > 0)
			    	trabalhador = new TrabalhadorKey(rs.getInt("trabalhador"));

				if(rs.getInt("empregadorTerceiro") > 0)
			    	empregadorTerceiro = new EmpregadorKey(rs.getInt("empregadorTerceiro"));

				if(rs.getInt("tipoAcidente") > 0)
			    	tipoAcidente = new TipoAcidenteKey(rs.getInt("tipoAcidente"));

				if(rs.getInt("emitente") > 0)
			    	emitente = new EmitenteKey(rs.getInt("emitente"));

				if(rs.getInt("municipio") > 0)
			    	municipio = new MunicipioKey(rs.getInt("municipio"));

			    	
				dataAcidente = rs.getString("dataAcidente");
				registroPolicial = rs.getString("registroPolicial");
				amputacao = rs.getString("amputacao");
				obito = rs.getString("obito");
 				horasTrabalhadas = rs.getInt("horasTrabalhadas");

 				
				descLocalAcidente = rs.getString("descLocalAcidente");
				numDocFonte = rs.getString("numDocFonte");
				dataEmissaoFonte = rs.getString("dataEmissaoFonte");
				naturezaLesao = rs.getString("naturezaLesao");
				dataHoraDiagnostico = rs.getString("dataHoraDiagnostico");
				afastamento = rs.getString("afastamento");
				internacao            = rs.getString("internacao");
				observacaoDiagnostico = rs.getString("observacaoDiagnostico");
				duracaoTratamento     = rs.getInt("duracaoTratamento");
				aposentado = rs.getString("aposentado");
				remuneracao = rs.getFloat("remuneracao");
				
				distritoSaude = rs.getString("distritoSaude");
				ultimaTrabalhado = rs.getString("ultimaTrabalhado");
				descricaoSituacaoGeradora = rs.getString("descricaoSituacaoGeradora");
				descricaoDiagnostico = rs.getString("descricaoDiagnostico");
		    	
		    }
		    else{
			   throw new EJBException("AcidenteBean ejbLoad => Erro ao carregar Acidente");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){}
		}
		
	}
	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}
	/**
	 * ejbRemove
	 */
	public void ejbRemove() throws javax.ejb.RemoveException {

		Connection conn = null;
		atualiza = false;			
		try{
			conn = Conexao.getConnection();
			AcidenteKey key = (AcidenteKey)ctx.getPrimaryKey();
			PreparedStatement stmt = conn.prepareStatement
				("exec sp_smat_excluir_acidentes ?");
		    stmt.setInt(1,key.acidente);
	    	int r = stmt.executeUpdate();
		    if(r == 0){
			   throw new EJBException("AcidenteBean ejbRemove EJBException");
		    }
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try{
				conn.close();
			}
			catch(SQLException e){}
		}
				
	}
	/**
	 * ejbStore
	 */
	public void ejbStore() {
		Connection conn = null;
		
		if(atualiza){
			try{
				conn = Conexao.getConnection();
				AcidenteKey key = (AcidenteKey)ctx.getPrimaryKey();
	
	//			PreparedStatement stmt = conn.prepareStatement
	//				("exec sp_smat_gravar_acidentes ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?");//,?,?,?
	
				CallableStatement stmt = conn.prepareCall("{call  sp_smat_gravar_acidentes (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
					//("exec sp_smat_gravar_acidentes ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?");//
	
				
			    stmt.setInt(1,key.acidente);
	
				if(area == null)
				   	stmt.setNull(2,Types.INTEGER);
				else
				    stmt.setInt(2,area.area);
	
				if(vinculoEmpregaticio == null)
				   	stmt.setNull(3,Types.INTEGER);
				else
				    stmt.setInt(3,vinculoEmpregaticio.vinculoEmpregaticio);
	
				if(ocupacao == null)
				   	stmt.setNull(4,Types.INTEGER);
				else
				    stmt.setInt(4,ocupacao.ocupacao);
	
				if(localAtendimento == null)
				   	stmt.setNull(5,Types.INTEGER);
				else
				    stmt.setInt(5,localAtendimento.localAtendimento);
	
				if(empregador == null)
				   	stmt.setNull(6,Types.INTEGER);
				else
				    stmt.setInt(6,empregador.empregador);
	
				if(medico == null)
				   	stmt.setNull(7,Types.INTEGER);
				else
				    stmt.setInt(7,medico.medico);
	
				if(diagnostico == null)
				   	stmt.setNull(8,Types.INTEGER);
				else
				    stmt.setInt(8,diagnostico.diagnostico);			    
	
				if(fonte == null)
				   	stmt.setNull(9,Types.INTEGER);
				else
				    stmt.setInt(9,fonte.fonte);	
				    
				if(agenteCausador == null)
				   	stmt.setNull(10,Types.INTEGER);
				else
				    stmt.setInt(10,agenteCausador.agenteCausador);
	
				if(tipoLocalAcidente == null)
				   	stmt.setNull(11,Types.INTEGER);
				else
				    stmt.setInt(11,tipoLocalAcidente.tipoLocalAcidente);			    
				    
				if(trabalhador == null)
				   	stmt.setNull(12,Types.INTEGER);
				else
				    stmt.setInt(12,trabalhador.trabalhador);			
	
				if(empregadorTerceiro == null)
				   	stmt.setNull(13,Types.INTEGER);
				else
				    stmt.setInt(13,empregadorTerceiro.empregador);
				    
				if(tipoAcidente == null)
				   	stmt.setNull(14,Types.INTEGER);
				else
				    stmt.setInt(14,tipoAcidente.tipoAcidente);
	
	
				if(emitente == null)
				   	stmt.setNull(15,Types.INTEGER);
				else
				    stmt.setInt(15,emitente.emitente);
	
				if(municipio == null)
				   	stmt.setNull(16,Types.INTEGER);
				else
				    stmt.setInt(16,municipio.municipio);
	
				stmt.setString(17,dataAcidente);
				stmt.setString(18,registroPolicial);
				stmt.setString(19,amputacao);
				stmt.setString(20,obito);
				stmt.setInt(21,horasTrabalhadas);
				stmt.setString(22,descLocalAcidente);
				stmt.setString(23,numDocFonte);
				stmt.setString(24,dataEmissaoFonte);
				stmt.setString(25,naturezaLesao);
				stmt.setString(26,dataHoraDiagnostico);
				stmt.setString(27,afastamento);
				stmt.setString(28,internacao);
				stmt.setString(29,observacaoDiagnostico);
				stmt.setInt(30,duracaoTratamento);
				stmt.setString(31,aposentado);
				stmt.setFloat(32,remuneracao);
				stmt.setString(33,distritoSaude);
				stmt.setString(34,ultimaTrabalhado);
				stmt.setString(35,descricaoSituacaoGeradora);
				stmt.setString(36,descricaoDiagnostico);
				

				
			    stmt.execute();
	
				

			    
			  /*  if(rs != 1){
			    	throw new EJBException("Erro ao alterar LocaisLesao: "+rs);
			    }*/
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			finally{
				try{
					conn.close();
				}
				catch(SQLException e){}
			}
			
		}
		atualiza = false;				
	}
	/**
	 * getEntityContext
	 */
	public javax.ejb.EntityContext getEntityContext() {
		return ctx;
	}
	/**
	 * setEntityContext
	 */
	public void setEntityContext(javax.ejb.EntityContext ctx) {
		this.ctx = ctx;
	}
	/**
	 * unsetEntityContext
	 */
	public void unsetEntityContext() {
		ctx = null;
	}
	/**
	 * ejbCreate
	 */
	public AcidenteKey ejbCreate(	int 	area,
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
		throws javax.ejb.CreateException {


			Connection 			conn 	= null;			
			AcidenteKey 	retVal  = null;
				
			try{
					conn = Conexao.getConnection();
				CallableStatement stmt = conn.prepareCall("{call  sp_smat_gravar_acidentes (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
	
				if(area == 0)
				   	stmt.setNull(1,Types.INTEGER);
				else
				    stmt.setInt(1,area);
	
				if(vinculoEmpregaticio == 0)
				   	stmt.setNull(2,Types.INTEGER);
				else
				    stmt.setInt(2,vinculoEmpregaticio);
	
				if(ocupacao == 0)
				   	stmt.setNull(3,Types.INTEGER);
				else
				    stmt.setInt(3,ocupacao);
	
				if(localAtendimento == 0)
				   	stmt.setNull(4,Types.INTEGER);
				else
				    stmt.setInt(4,localAtendimento);
	
				if(empregador == 0)
				   	stmt.setNull(5,Types.INTEGER);
				else
				    stmt.setInt(5,empregador);
	
				if(medico == 0)
				   	stmt.setNull(6,Types.INTEGER);
				else
				    stmt.setInt(6,medico);
	
				if(diagnostico == 0)
				   	stmt.setNull(7,Types.INTEGER);
				else
				    stmt.setInt(7,diagnostico);			    
	
				if(fonte == 0)
				   	stmt.setNull(8,Types.INTEGER);
				else
				    stmt.setInt(8,fonte);	
				    
				if(agenteCausador == 0)
				   	stmt.setNull(9,Types.INTEGER);
				else
				    stmt.setInt(9,agenteCausador);
	
				if(tipoLocalAcidente == 0)
				   	stmt.setNull(10,Types.INTEGER);
				else
				    stmt.setInt(10,tipoLocalAcidente);			    
				    
				if(trabalhador == 0)
				   	stmt.setNull(11,Types.INTEGER);
				else
				    stmt.setInt(11,trabalhador);			
	
				if(empregadorTerceiro == 0)
				   	stmt.setNull(12,Types.INTEGER);
				else
				    stmt.setInt(12,empregadorTerceiro);
				    
				if(tipoAcidente == 0)
				   	stmt.setNull(13,Types.INTEGER);
				else
				    stmt.setInt(13,tipoAcidente);
	
	
				if(emitente == 0)
				   	stmt.setNull(14,Types.INTEGER);
				else
				    stmt.setInt(14,emitente);
	
				if(municipio == 0)
				   	stmt.setNull(15,Types.INTEGER);
				else
				    stmt.setInt(15,municipio);
	
				stmt.setString(16,dataAcidente);
				stmt.setString(17,registroPolicial);
				stmt.setString(18,amputacao);
				stmt.setString(19,obito);
	
				if(horasTrabalhadas == 0)
				   	stmt.setNull(20,Types.INTEGER);
				else
				    stmt.setInt(20,horasTrabalhadas);
				    			
				
				stmt.setString(21,descLocalAcidente);
				stmt.setString(22,numDocFonte);
				stmt.setString(23,dataEmissaoFonte);
				stmt.setString(24,naturezaLesao);
				stmt.setString(25,dataHoraDiagnostico);
				stmt.setString(26,afastamento);
				stmt.setString(27,internacao);
				stmt.setString(28,observacaoDiagnostico);
				
				if(horasTrabalhadas == 0)
				   	stmt.setNull(29,Types.INTEGER);
				else
				    stmt.setInt(29,duracaoTratamento);			
				
				stmt.setString(30,aposentado);
				stmt.setFloat(31,remuneracao);
				stmt.setString(32,distritoSaude);
				stmt.setString(33,ultimaTrabalhado);
				stmt.setString(34,descricaoSituacaoGeradora);
				stmt.setString(35,descricaoDiagnostico);
	
	
	
	
				ResultSet rs = stmt.executeQuery();
				
				if(rs.next())
					acidente = rs.getInt("acidente");
				else
					throw new EJBException("AcidenteBean ejbCreate EJBException");
			

			
				setAcidente(acidente);
				setAfastamento(afastamento);
				
				if(agenteCausador > 0)
					setAgenteCausador(new AgenteCausadorKey(agenteCausador));
					
				setAmputacao(amputacao);
				setAposentado(aposentado);
				
				if(area > 0)
					setArea(new AreaKey(area));
					
				setDataAcidente(dataAcidente);
				setDataEmissaoFonte(dataEmissaoFonte);
				setDataHoraDiagnostico(dataHoraDiagnostico);
				setDescLocalAcidente(descLocalAcidente);
				setDescricaoDiagnostico(descricaoDiagnostico);
				setDescricaoSituacaoGeradora(descricaoSituacaoGeradora);
				
				if(diagnostico > 0)
					setDiagnostico(new DiagnosticoKey(diagnostico));
				
				setDistritoSaude(distritoSaude);
				setDuracaoTratamento(duracaoTratamento);

				if(emitente > 0)
					setEmitente(new EmitenteKey(emitente));
				
				if(empregador > 0)
					setEmpregador(new EmpregadorKey(empregador));
				
				if(empregadorTerceiro > 0)
					setEmpregadorTerceiro(new EmpregadorKey(empregadorTerceiro));
				
				if(fonte > 0)
					setFonte(new FonteKey(fonte));

				setHorasTrabalhadas(horasTrabalhadas);
				setInternacao(internacao);
				
				if(localAtendimento > 0)
					setLocalAtendimento(new LocalAtendimentoKey(localAtendimento));
				
				if(medico > 0)
					setMedico(new MedicoKey(medico));

				if(municipio > 0)
					setMunicipio(new MunicipioKey(municipio));

				setNaturezaLesao(naturezaLesao);
				setNumDocFonte(numDocFonte);
				setObito(obito);
				setObservacaoDiagnostico(observacaoDiagnostico);
				
				if(ocupacao > 0)
					setOcupacao(new OcupacaoKey(ocupacao));

				setRegistroPolicial(registroPolicial);
				setRemuneracao(remuneracao);
				
				if(tipoAcidente > 0)
					setTipoAcidente(new TipoAcidenteKey(tipoAcidente));

				if(tipoLocalAcidente > 0)
					setTipoLocalAcidente(new TipoLocalAcidenteKey(tipoLocalAcidente));
					
				if(trabalhador > 0)	
					setTrabalhador(new TrabalhadorKey(trabalhador));
					
				setUltimaTrabalhado(ultimaTrabalhado);
				
				if(vinculoEmpregaticio > 0)
					setVinculoEmpregaticio(new VinculoEmpregaticioKey(vinculoEmpregaticio));
		
				retVal = new AcidenteKey(acidente);
			}catch(SQLException e){
				System.out.println("****************************");
				System.out.println("****** Acidente Bean   *****");
				e.printStackTrace();
				System.out.println("****************************");				
				throw new CreateException("AcidenteBean ejbCreate " + e.getMessage());
			}

			finally{
				try{
					atualiza = false;
					conn.close();
				}
				catch(SQLException e){
					e.printStackTrace();					
					throw new CreateException("AcidenteBean ejbCreate "  + e.getMessage());					
				}
			}
			
			return retVal;
			
	}
	/**
	 * ejbPostCreate
	 */
	public void ejbPostCreate( int 	area,
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
								String	descricaoDiagnostico) throws javax.ejb.CreateException {
	}
	/**
	 * ejbFindByPrimaryKey
	 */
	public br.smat.ejb.acidente.AcidenteKey ejbFindByPrimaryKey(
		br.smat.ejb.acidente.AcidenteKey key)
		throws javax.ejb.FinderException {

			Connection conn = null;
			atualiza = false;					
			try{
				conn = Conexao.getConnection();
				PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_acidentes ?");
				stmt.setInt(1,key.acidente);
				ResultSet rs = stmt.executeQuery();
				if(rs.next())
					return key;
				else
					throw new FinderException("AcidenteBean ejbFindByPrimaryKey FinderException 1");
			}
			catch(SQLException e){
					throw new FinderException("AcidenteBean ejbFindByPrimaryKey FinderException 2");
			}
			finally{
				try{			
					conn.close();
				}
				catch(Exception e){}
			}
			
	}

   public Collection ejbFindAllAcidentes() throws FinderException{
		Connection conn = null;
		Vector retVal = new Vector();
		atualiza = false;				
		try
		{
			conn = Conexao.getConnection();
			PreparedStatement stmt = conn.prepareStatement("exec sp_smat_listar_acidentes");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){			
				retVal.addElement(new AcidenteKey(rs.getInt("acidente")));
			}
		}
		catch(Exception e){
			e.printStackTrace();
				throw new FinderException("AcidenteBean ejbFindAllTiposAcidente FinderException");
		}
		finally{
			try{			
				conn.close();
			}
			catch(Exception e){}
		}
		return retVal;
	}	




}
