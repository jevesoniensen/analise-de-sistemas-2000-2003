package br.smat.ejb.trabalhador;
import br.smat.ejb.estadocivil.EstadoCivilKey;
import br.smat.ejb.municipio.MunicipioKey;
import br.smat.ejb.estado.EstadoKey;
/**
 * Remote interface for Enterprise Bean: Trabalhador
 */
public interface Trabalhador extends javax.ejb.EJBObject {
	/**
	 * Sets the bairro.
	 * @param bairro The bairro to set
	 */
	public void setBairro(String bairro) throws java.rmi.RemoteException;
	/**
	 * Sets the carteiraTrabalho.
	 * @param carteiraTrabalho The carteiraTrabalho to set
	 */
	public void setCarteiraTrabalho(int carteiraTrabalho)
		throws java.rmi.RemoteException;
	/**
	 * Sets the cep.
	 * @param cep The cep to set
	 */
	public void setCep(String cep) throws java.rmi.RemoteException;
	/**
	 * Sets the complemento.
	 * @param complemento The complemento to set
	 */
	public void setComplemento(String complemento)
		throws java.rmi.RemoteException;
	/**
	 * Sets the cpf.
	 * @param cpf The cpf to set
	 */
	public void setCpf(String cpf) throws java.rmi.RemoteException;
	/**
	 * Sets the dataEmissaoCTPS.
	 * @param dataEmissaoCTPS The dataEmissaoCTPS to set
	 */
	public void setDataEmissaoCTPS(String dataEmissaoCTPS)
		throws java.rmi.RemoteException;
	/**
	 * Sets the dataEmissaoRG.
	 * @param dataEmissaoRG The dataEmissaoRG to set
	 */
	public void setDataEmissaoRG(String dataEmissaoRG)
		throws java.rmi.RemoteException;
	/**
	 * Sets the dataNascimento.
	 * @param dataNascimento The dataNascimento to set
	 */
	public void setDataNascimento(String dataNascimento)
		throws java.rmi.RemoteException;
	/**
	 * Sets the ddd.
	 * @param ddd The ddd to set
	 */
	public void setDdd(String ddd) throws java.rmi.RemoteException;
	/**
	 * Sets the estadoCivil.
	 * @param estadoCivil The estadoCivil to set
	 */
	public void setEstadoCivil(EstadoCivilKey estadoCivil)
		throws java.rmi.RemoteException;
	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(MunicipioKey municipio)
		throws java.rmi.RemoteException;
	/**
	 * Sets the nome.
	 * @param nome The nome to set
	 */
	public void setNome(String nome) throws java.rmi.RemoteException;
	/**
	 * Sets the nomeResponsavel.
	 * @param nomeResponsavel The nomeResponsavel to set
	 */
	public void setNomeResponsavel(String nomeResponsavel)
		throws java.rmi.RemoteException;
	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero) throws java.rmi.RemoteException;
	/**
	 * Sets the orgaoExpedidorRG.
	 * @param orgaoExpedidorRG The orgaoExpedidorRG to set
	 */
	public void setOrgaoExpedidorRG(String orgaoExpedidorRG)
		throws java.rmi.RemoteException;
	/**
	 * Sets the pisPasepNit.
	 * @param pisPasepNit The pisPasepNit to set
	 */
	public void setPisPasepNit(String pisPasepNit)
		throws java.rmi.RemoteException;
	/**
	 * Sets the rg.
	 * @param rg The rg to set
	 */
	public void setRg(String rg) throws java.rmi.RemoteException;
	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua) throws java.rmi.RemoteException;
	/**
	 * Sets the serie.
	 * @param serie The serie to set
	 */
	public void setSerie(int serie) throws java.rmi.RemoteException;
	/**
	 * Sets the sexo.
	 * @param sexo The sexo to set
	 */
	public void setSexo(String sexo) throws java.rmi.RemoteException;
	/**
	 * Sets the telefone.
	 * @param telefone The telefone to set
	 */
	public void setTelefone(String telefone) throws java.rmi.RemoteException;

	/**
	 * Sets the ufCTPS.
	 * @param ufCTPS The ufCTPS to set
	 */
	public void setUfCTPS(EstadoKey ufCTPS) throws java.rmi.RemoteException;
	/**
	 * Sets the ufRG.
	 * @param ufRG The ufRG to set
	 */
	public void setUfRG(EstadoKey ufRG) throws java.rmi.RemoteException;
	/**
	 * Returns the bairro.
	 * @return String
	 */
	public String getBairro() throws java.rmi.RemoteException;
	/**
	 * Returns the carteiraTrabalho.
	 * @return int
	 */
	public int getCarteiraTrabalho() throws java.rmi.RemoteException;
	/**
	 * Returns the cep.
	 * @return String
	 */
	public String getCep() throws java.rmi.RemoteException;
	/**
	 * Returns the complemento.
	 * @return String
	 */
	public String getComplemento() throws java.rmi.RemoteException;
	/**
	 * Returns the cpf.
	 * @return String
	 */
	public String getCpf() throws java.rmi.RemoteException;
	/**
	 * Returns the dataEmissaoCTPS.
	 * @return String
	 */
	public String getDataEmissaoCTPS() throws java.rmi.RemoteException;
	/**
	 * Returns the dataEmissaoRG.
	 * @return String
	 */
	public String getDataEmissaoRG() throws java.rmi.RemoteException;
	/**
	 * Returns the dataNascimento.
	 * @return String
	 */
	public String getDataNascimento() throws java.rmi.RemoteException;
	/**
	 * Returns the ddd.
	 * @return String
	 */
	public String getDdd() throws java.rmi.RemoteException;
	/**
	 * Returns the estadoCivil.
	 * @return EstadoCivilKey
	 */
	public EstadoCivilKey getEstadoCivil() throws java.rmi.RemoteException;
	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio() throws java.rmi.RemoteException;
	/**
	 * Returns the nome.
	 * @return String
	 */
	public String getNome() throws java.rmi.RemoteException;
	/**
	 * Returns the nomeResponsavel.
	 * @return String
	 */
	public String getNomeResponsavel() throws java.rmi.RemoteException;
	/**
	 * Returns the numero.
	 * @return int
	 */
	public int getNumero() throws java.rmi.RemoteException;
	/**
	 * Returns the orgaoExpedidorRG.
	 * @return String
	 */
	public String getOrgaoExpedidorRG() throws java.rmi.RemoteException;
	/**
	 * Returns the pisPasepNit.
	 * @return String
	 */
	public String getPisPasepNit() throws java.rmi.RemoteException;
	/**
	 * Returns the rg.
	 * @return String
	 */
	public String getRg() throws java.rmi.RemoteException;
	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua() throws java.rmi.RemoteException;
	/**
	 * Returns the serie.
	 * @return int
	 */
	public int getSerie() throws java.rmi.RemoteException;
	/**
	 * Returns the sexo.
	 * @return String
	 */
	public String getSexo() throws java.rmi.RemoteException;
	/**
	 * Returns the telefone.
	 * @return String
	 */
	public String getTelefone() throws java.rmi.RemoteException;
	/**
	 * Returns the trabalhador.
	 * @return int
	 */
	public int getTrabalhador() throws java.rmi.RemoteException;
	/**
	 * Returns the ufCTPS.
	 * @return EstadoKey
	 */
	public EstadoKey getUfCTPS() throws java.rmi.RemoteException;
	/**
	 * Returns the ufRG.
	 * @return EstadoKey
	 */
	public EstadoKey getUfRG() throws java.rmi.RemoteException;
}
