package br.smat.ejb.empregador;
import br.smat.ejb.municipio.MunicipioKey;
import br.smat.ejb.ramoatividade.RamoAtividadeKey;
import br.smat.ejb.tipoempregador.TipoEmpregadorKey;
import javax.ejb.FinderException;
import java.util.Collection;
/**
 * Remote interface for Enterprise Bean: Empregador
 */
public interface Empregador extends javax.ejb.EJBObject {
	/**
	 * Returns the bairro.
	 * @return String
	 */
	public String getBairro() throws java.rmi.RemoteException;
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
	 * Returns the documento.
	 * @return String
	 */
	public String getDocumento() throws java.rmi.RemoteException;
	/**
	 * Returns the empregador.
	 * @return int
	 */
	public int getEmpregador() throws java.rmi.RemoteException;
	/**
	 * Returns the municipio.
	 * @return MunicipioKey
	 */
	public MunicipioKey getMunicipio() throws java.rmi.RemoteException;
	/**
	 * Returns the numero.
	 * @return int
	 */
	public int getNumero() throws java.rmi.RemoteException;
	/**
	 * Returns the ramoAtividade.
	 * @return RamoAtividadeKey
	 */
	public RamoAtividadeKey getRamoAtividade() throws java.rmi.RemoteException;
	/**
	 * Returns the razaoSocial.
	 * @return String
	 */
	public String getRazaoSocial() throws java.rmi.RemoteException;
	/**
	 * Returns the rua.
	 * @return String
	 */
	public String getRua() throws java.rmi.RemoteException;
	/**
	 * Returns the tipoEmpregador.
	 * @return TipoEmpregadorKey
	 */
	public TipoEmpregadorKey getTipoEmpregador()
		throws java.rmi.RemoteException;
	/**
	 * Sets the bairro.
	 * @param bairro The bairro to set
	 */
	public void setBairro(String bairro) throws java.rmi.RemoteException;
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
	 * Sets the documento.
	 * @param documento The documento to set
	 */
	public void setDocumento(String documento) throws java.rmi.RemoteException;
	/**
	 * Sets the municipio.
	 * @param municipio The municipio to set
	 */
	public void setMunicipio(MunicipioKey municipio)
		throws java.rmi.RemoteException;
	/**
	 * Sets the numero.
	 * @param numero The numero to set
	 */
	public void setNumero(int numero) throws java.rmi.RemoteException;
	/**
	 * Sets the ramoAtividade.
	 * @param ramoAtividade The ramoAtividade to set
	 */
	public void setRamoAtividade(RamoAtividadeKey ramoAtividade)
		throws java.rmi.RemoteException;
	/**
	 * Sets the razaoSocial.
	 * @param razaoSocial The razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial)
		throws java.rmi.RemoteException;
	/**
	 * Sets the rua.
	 * @param rua The rua to set
	 */
	public void setRua(String rua) throws java.rmi.RemoteException;
	/**
	 * Sets the tipoEmpregador.
	 * @param tipoEmpregador The tipoEmpregador to set
	 */
	public void setTipoEmpregador(TipoEmpregadorKey tipoEmpregador)
		throws java.rmi.RemoteException;
	public String getNomeRamoAtividade() throws java.rmi.RemoteException;
	public int getKeyEstado() throws java.rmi.RemoteException;
	public int getKeyRamoAtividade() throws java.rmi.RemoteException;
	public int getKeyRamoSuperior() throws java.rmi.RemoteException;
	public int getKeyMunicipio() throws java.rmi.RemoteException;
	public int getKeyTipoEmpregador() throws java.rmi.RemoteException;
}
