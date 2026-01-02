package br.smat.ejb.session;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSStatelessAcessoBancoHomeBean_3eade627
 * @generated
 */
public class EJSStatelessAcessoBancoHomeBean_3eade627 extends EJSHome {
	/**
	 * EJSStatelessAcessoBancoHomeBean_3eade627
	 * @generated
	 */
	public EJSStatelessAcessoBancoHomeBean_3eade627()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.session.AcessoBanco create()
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.session.AcessoBanco result = null;
		boolean createFailed = false;
		try {
			result =
				(br.smat.ejb.session.AcessoBanco) super.createWrapper(
					new BeanId(this, null));
		} catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			createFailed = true;
			throw ex;
		} catch (Throwable ex) {
			createFailed = true;
			throw new CreateFailureException(ex);
		} finally {
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return result;
	}
	/**
	 * create_Local
	 * @generated
	 */
	public br.smat.ejb.session.AcessoBancoLocal create_Local()
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.ejb.session.AcessoBancoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			result =
				(
					br
						.smat
						.ejb
						.session
						.AcessoBancoLocal) super
						.createWrapper_Local(
					null);
		} catch (javax.ejb.CreateException ex) {
			createFailed = true;
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			createFailed = true;
			throw ex;
		} catch (Throwable ex) {
			createFailed = true;
			throw new CreateFailureException(ex);
		} finally {
			if (createFailed) {
				super.createFailure(beanO);
			}
		}
		return result;
	}
}
