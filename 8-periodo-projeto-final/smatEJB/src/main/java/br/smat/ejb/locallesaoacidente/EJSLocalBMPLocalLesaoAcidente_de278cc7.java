package br.smat.ejb.locallesaoacidente;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPLocalLesaoAcidente_de278cc7
 * @generated
 */
public class EJSLocalBMPLocalLesaoAcidente_de278cc7
	extends EJSLocalWrapper
	implements br.smat.ejb.locallesaoacidente.LocalLesaoAcidenteLocal {
	/**
	 * EJSLocalBMPLocalLesaoAcidente_de278cc7
	 * @generated
	 */
	public EJSLocalBMPLocalLesaoAcidente_de278cc7() {
		super();
	}
	/**
	 * getAcidente
	 * @generated
	 */
	public br.smat.ejb.acidente.AcidenteKey getAcidente() {
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
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * getLocalLesao
	 * @generated
	 */
	public br.smat.ejb.locallesao.LocalLesaoKey getLocalLesao() {
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
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 1, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
}
