package br.smat.ejb.trabalhador;
import br.smat.ejb.estadocivil.EstadoCivilKey;
import br.smat.ejb.municipio.MunicipioKey;
import br.smat.ejb.estado.EstadoKey;
/**
 * Local interface for Enterprise Bean: Trabalhador
 */
public interface TrabalhadorLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Sets the bairro.
	 * @param bairro The bairro to set
	 */
	public void setBairro(String bairro);
	/**
	 * Sets the carteiraTrabalho.
	 * @param carteiraTrabalho The carteiraTrabalho to set
	 */
	public void setCarteiraTrabalho(int carteiraTrabalho);
	/**
	 * Sets the cep.
	 * @param cep The cep to set
	 */
	public void setCep(String cep);
	/**
	 * Sets the complemento.
	 * @param complemento The complemento to set
	 */
	public void setComplemento(String complemento);
	/**
	 * Sets the cpf.
	 * @param cpf The cpf to set
	 */
	public void setCpf(String cpf);
	/**
	 * Sets the dataEmissaoCTPS.
	 * @param dataEmissaoCTPS The dataEmissaoCTPS to set
	 */
	public void setDataEmissaoCTPS(String dataEmissaoCTPS);
	/**
	 * Sets the dataEmissaoRG.
	 * @param dataEmissaoRG The dataEmissaoRG to set
	 */
	public void setDataEmissaoRG(String dataEmissaoRG);
	/**
	 * Sets the dataNascimento.
	 * @param dataNascimento The dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento);
	/**
	 * Sets the ddd.
	 * @param ddd The ddd to set
	 */
	public void setDdd(String ddd);
	/**
	 * Sets the estadoCivil.
	 * @param estadoCivil The estadoCivil to set
	 */
	public void setEstadoCivil(EstadoCivilKey estadoCivil);
	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(MunicipioKey municipio);
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome);
	/**
	 * Sets the nomeResponsavel.
	 * @param nomeResponsavel The nomeResponsavel to set
	 */
	public void setNomeResponsavel(String nomeResponsavel);
	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero);
	/**
	 * Sets the orgaoExpedidorRG.
	 * @param orgaoExpedidorRG The orgaoExpedidorRG to set
	 */
	public void setOrgaoExpedidorRG(String orgaoExpedidorRG);
	/**
	 * Sets the pisPasepNit.
	 * @param pisPasepNit The pisPasepNit to set
	 */
	public void setPisPasepNit(String pisPasepNit);
	/**
	 * Sets the rg.
	 * @param rg The rg to set
	 */
	public void setRg(String rg);
	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua);
	/**
	 * Sets the serie.
	 * @param serie The serie to set
	 */
	public void setSerie(int serie);
	/**
	 * Sets the sexo.
	 * @param sexo The sexo to set
	 */
	public void setSexo(String sexo);
	/**
	 * Sets the telefone.
	 * @param telefone The telefone to set
	 */
	public void setTelefone(String telefone);

	/**
	 * Sets the ufCTPS.
	 * @param ufCTPS The ufCTPS to set
	 */
	public void setUfCTPS(EstadoKey ufCTPS);
	/**
	 * Sets the ufRG.
	 * @param ufRG The ufRG to set
	 */
	public void setUfRG(EstadoKey ufRG);
	/**
	 * Returns the bairro.
	 * @return String
	 */
	public String getBairro();
	/**
	 * Returns the carteiraTrabalho.
	 * @return int
	 */
	public int getCarteiraTrabalho();
	/**
	 * Returns the cep.
	 * @return String
	 */
	public String getCep();
	/**
	 * Returns the complemento.
	 * @return String
	 */
	public String getComplemento();
	/**
	 * Returns the cpf.
	 * @return String
	 */
	public String getCpf();
	/**
	 * Returns the dataEmissaoCTPS.
	 * @return String
	 */
	public String getDataEmissaoCTPS();
	/**
	 * Returns the dataEmissaoRG.
	 * @return String
	 */
	public String getDataEmissaoRG();
	/**
	 * Returns the dataNascimento.
	 * @return String
	 */
	public String getDataNascimento();
	/**
	 * Returns the ddd.
	 * @return String
	 */
	public String getDdd();
	/**
	 * Returns the estadoCivil.
	 * @return EstadoCivilKey
	 */
	public EstadoCivilKey getEstadoCivil();
	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio();
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome();
	/**
	 * Returns the nomeResponsavel.
	 * @return String
	 */
	public String getNomeResponsavel();
	/**
	 * Returns the numero.
	 * @return int
	 */
	public int getNumero();
	/**
	 * Returns the orgaoExpedidorRG.
	 * @return String
	 */
	public String getOrgaoExpedidorRG();
	/**
	 * Returns the pisPasepNit.
	 * @return String
	 */
	public String getPisPasepNit();
	/**
	 * Returns the rg.
	 * @return String
	 */
	public String getRg();
	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua();
	/**
	 * Returns the serie.
	 * @return int
	 */
	public int getSerie();
	/**
	 * Returns the sexo.
	 * @return String
	 */
	public String getSexo();
	/**
	 * Returns the telefone.
	 * @return String
	 */
	public String getTelefone();
	/**
	 * Returns the trabalhador.
	 * @return int
	 */
	public int getTrabalhador();
	/**
	 * Returns the ufCTPS.
	 * @return EstadoKey
	 */
	public EstadoKey getUfCTPS();
	/**
	 * Returns the ufRG.
	 * @return EstadoKey
	 */
	public EstadoKey getUfRG();
}
