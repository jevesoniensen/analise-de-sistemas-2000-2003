package br.smat.ejb.testemunha;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPTestemunha_2be5b035
 * @generated
 */
public class EJSRemoteBMPTestemunha_2be5b035
	extends EJSWrapper
	implements Testemunha {
	/**
	 * EJSRemoteBMPTestemunha_2be5b035
	 * @generated
	 */
	public EJSRemoteBMPTestemunha_2be5b035() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getAcidente
	 * @generated
	 */
	public br.smat.ejb.acidente.AcidenteKey getAcidente()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.acidente.AcidenteKey _EJS_result = null;
		try {
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getAcidente();
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
	 * getMunicipio
	 * @generated
	 */
	public br.smat.ejb.municipio.MunicipioKey getMunicipio()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.municipio.MunicipioKey _EJS_result = null;
		try {
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					1,
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
			container.postInvoke(this, 1, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					2,
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
			container.postInvoke(this, 2, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getTestemunha
	 * @generated
	 */
	public int getTestemunha() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getTestemunha();
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
	 * getBairro
	 * @generated
	 */
	public java.lang.String getBairro() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					4,
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
			container.postInvoke(this, 4, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					5,
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
			container.postInvoke(this, 5, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					6,
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
			container.postInvoke(this, 6, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					7,
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
			container.postInvoke(this, 7, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					8,
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
			container.postInvoke(this, 8, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					9,
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
			container.postInvoke(this, 9, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					10,
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
			container.postInvoke(this, 10, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setAcidente
	 * @generated
	 */
	public void setAcidente(br.smat.ejb.acidente.AcidenteKey acidente)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					11,
					_EJS_s);
			beanRef.setAcidente(acidente);
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
		return;
	}
	/**
	 * setBairro
	 * @generated
	 */
	public void setBairro(java.lang.String bairro)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					12,
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
			container.postInvoke(this, 12, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					13,
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
			container.postInvoke(this, 13, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					14,
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
			container.postInvoke(this, 14, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					15,
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
			container.postInvoke(this, 15, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					16,
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
			container.postInvoke(this, 16, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					17,
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
			container.postInvoke(this, 17, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					18,
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
			container.postInvoke(this, 18, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					19,
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
			container.postInvoke(this, 19, _EJS_s);
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
			br.smat.ejb.testemunha.TestemunhaBean beanRef =
				(br.smat.ejb.testemunha.TestemunhaBean) container.preInvoke(
					this,
					20,
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
			container.postInvoke(this, 20, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
}
