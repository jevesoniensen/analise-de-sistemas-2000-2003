package br.smat.ejb.tipoacidente;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPTipoAcidente_9e3bfeec
 * @generated
 */
public class EJSLocalBMPTipoAcidente_9e3bfeec
	extends EJSLocalWrapper
	implements br.smat.ejb.tipoacidente.TipoAcidenteLocal {
	/**
	 * EJSLocalBMPTipoAcidente_9e3bfeec
	 * @generated
	 */
	public EJSLocalBMPTipoAcidente_9e3bfeec() {
		super();
	}
	/**
	 * getTipoAcidente
	 * @generated
	 */
	public int getTipoAcidente() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.tipoacidente.TipoAcidenteBean beanRef =
				(
					br
						.smat
						.ejb
						.tipoacidente
						.TipoAcidenteBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getTipoAcidente();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.tipoacidente.TipoAcidenteBean beanRef =
				(
					br
						.smat
						.ejb
						.tipoacidente
						.TipoAcidenteBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getNome();
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
