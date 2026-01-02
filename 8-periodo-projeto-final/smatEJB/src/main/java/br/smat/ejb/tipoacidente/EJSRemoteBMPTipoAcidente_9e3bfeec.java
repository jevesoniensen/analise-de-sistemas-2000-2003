package br.smat.ejb.tipoacidente;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPTipoAcidente_9e3bfeec
 * @generated
 */
public class EJSRemoteBMPTipoAcidente_9e3bfeec
	extends EJSWrapper
	implements TipoAcidente {
	/**
	 * EJSRemoteBMPTipoAcidente_9e3bfeec
	 * @generated
	 */
	public EJSRemoteBMPTipoAcidente_9e3bfeec()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * getTipoAcidente
	 * @generated
	 */
	public int getTipoAcidente() throws java.rmi.RemoteException {
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() throws java.rmi.RemoteException {
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
