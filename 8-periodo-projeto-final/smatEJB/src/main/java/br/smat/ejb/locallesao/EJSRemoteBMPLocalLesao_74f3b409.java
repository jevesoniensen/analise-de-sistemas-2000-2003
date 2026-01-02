package br.smat.ejb.locallesao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPLocalLesao_74f3b409
 * @generated
 */
public class EJSRemoteBMPLocalLesao_74f3b409
	extends EJSWrapper
	implements LocalLesao {
	/**
	 * EJSRemoteBMPLocalLesao_74f3b409
	 * @generated
	 */
	public EJSRemoteBMPLocalLesao_74f3b409() throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getLocalLesaoPai
	 * @generated
	 */
	public br.smat.ejb.locallesao.LocalLesaoKey getLocalLesaoPai()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.locallesao.LocalLesaoKey _EJS_result = null;
		try {
			br.smat.ejb.locallesao.LocalLesaoBean beanRef =
				(br.smat.ejb.locallesao.LocalLesaoBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getLocalLesaoPai();
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
	 * getLocalLesao
	 * @generated
	 */
	public int getLocalLesao() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.locallesao.LocalLesaoBean beanRef =
				(br.smat.ejb.locallesao.LocalLesaoBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getLocalLesao();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.locallesao.LocalLesaoBean beanRef =
				(br.smat.ejb.locallesao.LocalLesaoBean) container.preInvoke(
					this,
					2,
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
			container.postInvoke(this, 2, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * setLocalLesaoPai
	 * @generated
	 */
	public void setLocalLesaoPai(
		br.smat.ejb.locallesao.LocalLesaoKey localLesaoPai)
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.locallesao.LocalLesaoBean beanRef =
				(br.smat.ejb.locallesao.LocalLesaoBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			beanRef.setLocalLesaoPai(localLesaoPai);
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
			br.smat.ejb.locallesao.LocalLesaoBean beanRef =
				(br.smat.ejb.locallesao.LocalLesaoBean) container.preInvoke(
					this,
					4,
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
			container.postInvoke(this, 4, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
}
