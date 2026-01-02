package br.smat.ejb.session;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteStatelessAcessoBanco_3eade627
 * @generated
 */
public class EJSRemoteStatelessAcessoBanco_3eade627
	extends EJSWrapper
	implements AcessoBanco {
	/**
	 * EJSRemoteStatelessAcessoBanco_3eade627
	 * @generated
	 */
	public EJSRemoteStatelessAcessoBanco_3eade627()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * cadastraAcidente
	 * @generated
	 */
	public void cadastraAcidente() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.session.AcessoBancoBean beanRef =
				(br.smat.ejb.session.AcessoBancoBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			beanRef.cadastraAcidente();
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
		return;
	}
}
