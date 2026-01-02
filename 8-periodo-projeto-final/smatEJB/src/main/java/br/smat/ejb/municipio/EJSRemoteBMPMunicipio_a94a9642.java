package br.smat.ejb.municipio;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPMunicipio_a94a9642
 * @generated
 */
public class EJSRemoteBMPMunicipio_a94a9642
	extends EJSWrapper
	implements Municipio {
	/**
	 * EJSRemoteBMPMunicipio_a94a9642
	 * @generated
	 */
	public EJSRemoteBMPMunicipio_a94a9642() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getRegional
	 * @generated
	 */
	public br.smat.ejb.regional.RegionalKey getRegional()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.regional.RegionalKey _EJS_result = null;
		try {
			br.smat.ejb.municipio.MunicipioBean beanRef =
				(br.smat.ejb.municipio.MunicipioBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getRegional();
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
	public int getMunicipio() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.municipio.MunicipioBean beanRef =
				(br.smat.ejb.municipio.MunicipioBean) container.preInvoke(
					this,
					2,
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
			container.postInvoke(this, 2, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getPopulacao
	 * @generated
	 */
	public int getPopulacao() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.municipio.MunicipioBean beanRef =
				(br.smat.ejb.municipio.MunicipioBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getPopulacao();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.municipio.MunicipioBean beanRef =
				(br.smat.ejb.municipio.MunicipioBean) container.preInvoke(
					this,
					4,
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
			container.postInvoke(this, 4, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getSigla
	 * @generated
	 */
	public java.lang.String getSigla() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.municipio.MunicipioBean beanRef =
				(br.smat.ejb.municipio.MunicipioBean) container.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = beanRef.getSigla();
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
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.municipio.MunicipioBean beanRef =
				(br.smat.ejb.municipio.MunicipioBean) container.preInvoke(
					this,
					6,
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
			container.postInvoke(this, 6, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * setPopulacao
	 * @generated
	 */
	public void setPopulacao(int populacao) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.municipio.MunicipioBean beanRef =
				(br.smat.ejb.municipio.MunicipioBean) container.preInvoke(
					this,
					7,
					_EJS_s);
			beanRef.setPopulacao(populacao);
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
		return;
	}
	/**
	 * setRegional
	 * @generated
	 */
	public void setRegional(br.smat.ejb.regional.RegionalKey regional)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.municipio.MunicipioBean beanRef =
				(br.smat.ejb.municipio.MunicipioBean) container.preInvoke(
					this,
					8,
					_EJS_s);
			beanRef.setRegional(regional);
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
		return;
	}
	/**
	 * setSigla
	 * @generated
	 */
	public void setSigla(java.lang.String sigla)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.municipio.MunicipioBean beanRef =
				(br.smat.ejb.municipio.MunicipioBean) container.preInvoke(
					this,
					9,
					_EJS_s);
			beanRef.setSigla(sigla);
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
		return;
	}
	/**
	 * getKeyEstado
	 * @generated
	 */
	public int getKeyEstado() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.municipio.MunicipioBean beanRef =
				(br.smat.ejb.municipio.MunicipioBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getKeyEstado();
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
}
