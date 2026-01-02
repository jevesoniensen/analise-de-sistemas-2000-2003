package br.smat.ejb.empregador;
import br.smat.ejb.municipio.MunicipioKey;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;
import br.smat.ejb.tipoempregador.TipoEmpregadorKey;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Local interface for Enterprise Bean: Empregador
 */
public interface EmpregadorLocal extends javax.ejb.EJBLocalObject {
	/**
	 * Returns the bairro.
	 * @return String
	 */
	public String getBairro();
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
	 * Returns the documento.
	 * @return String
	 */
	public String getDocumento();
	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador();
	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio();
	/**
	 * Returns the numero.
	 * @return int
	 */
	public int getNumero();
	/**
	 * Returns the ramoAtividade.
	 * @return RamoAtividadeKey
	 */
	public RamoAtividadeKey getRamoAtividade();
	/**
	 * Returns the razaoSocial.
	 * @return String
	 */
	public String getRazaoSocial();
	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua();
	/**
	 * Returns the tipoEmpregador.
	 * @return TipoEmpregadorKey
	 */
	public TipoEmpregadorKey getTipoEmpregador();
	/**
	 * Sets the bairro.
	 * @param bairro The bairro to set
	 */
	public void setBairro(String bairro);
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
	 * Sets the documento.
	 * @param documento The documento to set
	 */
	public void setDocumento(String documento);
	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(MunicipioKey municipio);
	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero);
	/**
	 * Sets the ramoAtividade.
	 * @param ramoAtividade The ramoAtividade to set
	 */
	public void setRamoAtividade(RamoAtividadeKey ramoAtividade);
	/**
	 * Sets the razaoSocial.
	 * @param razaoSocial The razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial);
	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua);
	/**
	 * Sets the tipoEmpregador.
	 * @param tipoEmpregador The tipoEmpregador to set
	 */
	public void setTipoEmpregador(TipoEmpregadorKey tipoEmpregador);
	public String getNomeRamoAtividade();
	public int getKeyEstado();
	public int getKeyRamoAtividade();
	public int getKeyRamoSuperior();
	public int getKeyMunicipio();
	public int getKeyTipoEmpregador();

}
