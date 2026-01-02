package br.smat.ejb.trabalhador;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPTrabalhador_ad0c592b
 * @generated
 */
public class EJSRemoteBMPTrabalhador_ad0c592b
	extends EJSWrapper
	implements Trabalhador {
	/**
	 * EJSRemoteBMPTrabalhador_ad0c592b
	 * @generated
	 */
	public EJSRemoteBMPTrabalhador_ad0c592b() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * setBairro
	 * @generated
	 */
	public void setBairro(java.lang.String bairro)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					24,
					_EJS_s);
			beanRef.setBairro(bairro);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 24, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setCarteiraTrabalho
	 * @generated
	 */
	public void setCarteiraTrabalho(int carteiraTrabalho)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					25,
					_EJS_s);
			beanRef.setCarteiraTrabalho(carteiraTrabalho);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 25, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setCep
	 * @generated
	 */
	public void setCep(java.lang.String cep) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					26,
					_EJS_s);
			beanRef.setCep(cep);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 26, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setComplemento
	 * @generated
	 */
	public void setComplemento(java.lang.String complemento)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					27,
					_EJS_s);
			beanRef.setComplemento(complemento);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 27, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setCpf
	 * @generated
	 */
	public void setCpf(java.lang.String cpf) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					28,
					_EJS_s);
			beanRef.setCpf(cpf);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 28, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setDataEmissaoCTPS
	 * @generated
	 */
	public void setDataEmissaoCTPS(java.lang.String dataEmissaoCTPS)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					29,
					_EJS_s);
			beanRef.setDataEmissaoCTPS(dataEmissaoCTPS);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 29, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setDataEmissaoRG
	 * @generated
	 */
	public void setDataEmissaoRG(java.lang.String dataEmissaoRG)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					30,
					_EJS_s);
			beanRef.setDataEmissaoRG(dataEmissaoRG);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 30, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setDataNascimento
	 * @generated
	 */
	public void setDataNascimento(java.lang.String dataNascimento)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					31,
					_EJS_s);
			beanRef.setDataNascimento(dataNascimento);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 31, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setDdd
	 * @generated
	 */
	public void setDdd(java.lang.String ddd) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					32,
					_EJS_s);
			beanRef.setDdd(ddd);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 32, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setEstadoCivil
	 * @generated
	 */
	public void setEstadoCivil(
		br.smat.ejb.estadocivil.EstadoCivilKey estadoCivil)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					33,
					_EJS_s);
			beanRef.setEstadoCivil(estadoCivil);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 33, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setMunicipio
	 * @generated
	 */
	public void setMunicipio(br.smat.ejb.municipio.MunicipioKey municipio)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					34,
					_EJS_s);
			beanRef.setMunicipio(municipio);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 34, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					35,
					_EJS_s);
			beanRef.setNome(nome);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 35, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setNomeResponsavel
	 * @generated
	 */
	public void setNomeResponsavel(java.lang.String nomeResponsavel)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					36,
					_EJS_s);
			beanRef.setNomeResponsavel(nomeResponsavel);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 36, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setNumero
	 * @generated
	 */
	public void setNumero(int numero) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					37,
					_EJS_s);
			beanRef.setNumero(numero);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 37, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setOrgaoExpedidorRG
	 * @generated
	 */
	public void setOrgaoExpedidorRG(java.lang.String orgaoExpedidorRG)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					38,
					_EJS_s);
			beanRef.setOrgaoExpedidorRG(orgaoExpedidorRG);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 38, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setPisPasepNit
	 * @generated
	 */
	public void setPisPasepNit(java.lang.String pisPasepNit)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					39,
					_EJS_s);
			beanRef.setPisPasepNit(pisPasepNit);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 39, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setRg
	 * @generated
	 */
	public void setRg(java.lang.String rg) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					40,
					_EJS_s);
			beanRef.setRg(rg);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 40, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setRua
	 * @generated
	 */
	public void setRua(java.lang.String rua) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					41,
					_EJS_s);
			beanRef.setRua(rua);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 41, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setSerie
	 * @generated
	 */
	public void setSerie(int serie) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					42,
					_EJS_s);
			beanRef.setSerie(serie);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 42, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setSexo
	 * @generated
	 */
	public void setSexo(java.lang.String sexo)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					43,
					_EJS_s);
			beanRef.setSexo(sexo);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 43, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setTelefone
	 * @generated
	 */
	public void setTelefone(java.lang.String telefone)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					44,
					_EJS_s);
			beanRef.setTelefone(telefone);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 44, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setUfCTPS
	 * @generated
	 */
	public void setUfCTPS(br.smat.ejb.estado.EstadoKey ufCTPS)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					45,
					_EJS_s);
			beanRef.setUfCTPS(ufCTPS);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 45, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setUfRG
	 * @generated
	 */
	public void setUfRG(br.smat.ejb.estado.EstadoKey ufRG)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					46,
					_EJS_s);
			beanRef.setUfRG(ufRG);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 46, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * getUfCTPS
	 * @generated
	 */
	public br.smat.ejb.estado.EstadoKey getUfCTPS()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.estado.EstadoKey _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getUfCTPS();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 0, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getUfRG
	 * @generated
	 */
	public br.smat.ejb.estado.EstadoKey getUfRG()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.estado.EstadoKey _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getUfRG();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 1, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getEstadoCivil
	 * @generated
	 */
	public br.smat.ejb.estadocivil.EstadoCivilKey getEstadoCivil()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.estadocivil.EstadoCivilKey _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getEstadoCivil();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 2, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getMunicipio
	 * @generated
	 */
	public br.smat.ejb.municipio.MunicipioKey getMunicipio()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.municipio.MunicipioKey _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getMunicipio();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 3, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getCarteiraTrabalho
	 * @generated
	 */
	public int getCarteiraTrabalho() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = beanRef.getCarteiraTrabalho();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 4, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getNumero
	 * @generated
	 */
	public int getNumero() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getNumero();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 5, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getSerie
	 * @generated
	 */
	public int getSerie() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					6,
					_EJS_s);
			_EJS_result = beanRef.getSerie();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 6, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getTrabalhador
	 * @generated
	 */
	public int getTrabalhador() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					7,
					_EJS_s);
			_EJS_result = beanRef.getTrabalhador();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 7, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getBairro
	 * @generated
	 */
	public java.lang.String getBairro() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					8,
					_EJS_s);
			_EJS_result = beanRef.getBairro();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 8, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getCep
	 * @generated
	 */
	public java.lang.String getCep() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					9,
					_EJS_s);
			_EJS_result = beanRef.getCep();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 9, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getComplemento
	 * @generated
	 */
	public java.lang.String getComplemento() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					10,
					_EJS_s);
			_EJS_result = beanRef.getComplemento();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 10, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getCpf
	 * @generated
	 */
	public java.lang.String getCpf() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					11,
					_EJS_s);
			_EJS_result = beanRef.getCpf();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 11, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getDataEmissaoCTPS
	 * @generated
	 */
	public java.lang.String getDataEmissaoCTPS()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					12,
					_EJS_s);
			_EJS_result = beanRef.getDataEmissaoCTPS();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 12, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getDataEmissaoRG
	 * @generated
	 */
	public java.lang.String getDataEmissaoRG()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					13,
					_EJS_s);
			_EJS_result = beanRef.getDataEmissaoRG();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 13, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getDataNascimento
	 * @generated
	 */
	public java.lang.String getDataNascimento()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					14,
					_EJS_s);
			_EJS_result = beanRef.getDataNascimento();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 14, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getDdd
	 * @generated
	 */
	public java.lang.String getDdd() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					15,
					_EJS_s);
			_EJS_result = beanRef.getDdd();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 15, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					16,
					_EJS_s);
			_EJS_result = beanRef.getNome();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 16, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getNomeResponsavel
	 * @generated
	 */
	public java.lang.String getNomeResponsavel()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					17,
					_EJS_s);
			_EJS_result = beanRef.getNomeResponsavel();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 17, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getOrgaoExpedidorRG
	 * @generated
	 */
	public java.lang.String getOrgaoExpedidorRG()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					18,
					_EJS_s);
			_EJS_result = beanRef.getOrgaoExpedidorRG();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 18, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getPisPasepNit
	 * @generated
	 */
	public java.lang.String getPisPasepNit() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					19,
					_EJS_s);
			_EJS_result = beanRef.getPisPasepNit();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 19, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getRg
	 * @generated
	 */
	public java.lang.String getRg() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					20,
					_EJS_s);
			_EJS_result = beanRef.getRg();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 20, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getRua
	 * @generated
	 */
	public java.lang.String getRua() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					21,
					_EJS_s);
			_EJS_result = beanRef.getRua();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 21, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getSexo
	 * @generated
	 */
	public java.lang.String getSexo() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					22,
					_EJS_s);
			_EJS_result = beanRef.getSexo();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 22, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getTelefone
	 * @generated
	 */
	public java.lang.String getTelefone() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.trabalhador.TrabalhadorBean beanRef =
				(br.smat.ejb.trabalhador.TrabalhadorBean) container.preInvoke(
					this,
					23,
					_EJS_s);
			_EJS_result = beanRef.getTelefone();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 23, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
}
