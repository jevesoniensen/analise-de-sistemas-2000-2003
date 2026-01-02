package br.smat.ejb.session;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalStatelessAcessoBanco_3eade627
 * @generated
 */
public class EJSLocalStatelessAcessoBanco_3eade627
	extends EJSLocalWrapper
	implements br.smat.ejb.session.AcessoBancoLocal {
	/**
	 * EJSLocalStatelessAcessoBanco_3eade627
	 * @generated
	 */
	public EJSLocalStatelessAcessoBanco_3eade627() {
		super();
	}
	/**
	 * cadastraAcidente
	 * @generated
	 */
	public void cadastraAcidente() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.session.AcessoBancoBean beanRef =
				(br.smat.ejb.session.AcessoBancoBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			beanRef.cadastraAcidente();
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
		return;
	}
}
