package br.smat.objetosauxiliares.generico;
import com.ibm.ejs.container.*;
import com.ibm.ejs.persistence.*;
import com.ibm.ejs.EJSException;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSStatelessGenericoHomeBean_54dad985
 * @generated
 */
public class EJSStatelessGenericoHomeBean_54dad985 extends EJSHome {
	/**
	 * EJSStatelessGenericoHomeBean_54dad985
	 * @generated
	 */
	public EJSStatelessGenericoHomeBean_54dad985()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.objetosauxiliares.generico.Generico create()
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.objetosauxiliares.generico.Generico result = null;
		boolean createFailed = false;
		try {
			result =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.Generico) super
						.createWrapper(
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
	public br.smat.objetosauxiliares.generico.GenericoLocal create_Local()
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		BeanO beanO = null;
		br.smat.objetosauxiliares.generico.GenericoLocal result = null;
		boolean createFailed = false;
		boolean preCreateFlag = false;
		try {
			result =
				(
					br
						.smat
						.objetosauxiliares
						.generico
						.GenericoLocal) super
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
