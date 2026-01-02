package br.smat.ejb.locallesaoacidente;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPLocalLesaoAcidente_de278cc7
 * @generated
 */
public class EJSRemoteBMPLocalLesaoAcidente_de278cc7
	extends EJSWrapper
	implements LocalLesaoAcidente {
	/**
	 * EJSRemoteBMPLocalLesaoAcidente_de278cc7
	 * @generated
	 */
	public EJSRemoteBMPLocalLesaoAcidente_de278cc7()
		throws java.rmi.RemoteException {
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
			br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteBean beanRef =
				(
					br
						.smat
						.ejb
						.locallesaoacidente
						.LocalLesaoAcidenteBean) container
						.preInvoke(
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
	 * getLocalLesao
	 * @generated
	 */
	public br.smat.ejb.locallesao.LocalLesaoKey getLocalLesao()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.locallesao.LocalLesaoKey _EJS_result = null;
		try {
			br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteBean beanRef =
				(
					br
						.smat
						.ejb
						.locallesaoacidente
						.LocalLesaoAcidenteBean) container
						.preInvoke(
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
}
