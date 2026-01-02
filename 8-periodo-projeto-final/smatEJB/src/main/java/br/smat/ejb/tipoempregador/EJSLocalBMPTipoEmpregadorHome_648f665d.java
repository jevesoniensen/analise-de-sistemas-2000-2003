package br.smat.ejb.tipoempregador;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPTipoEmpregadorHome_648f665d
 * @generated
 */
public class EJSLocalBMPTipoEmpregadorHome_648f665d
	extends EJSLocalWrapper
	implements br.smat.ejb.tipoempregador.TipoEmpregadorLocalHome {
	/**
	 * EJSLocalBMPTipoEmpregadorHome_648f665d
	 * @generated
	 */
	public EJSLocalBMPTipoEmpregadorHome_648f665d() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.tipoempregador.TipoEmpregadorLocal create(
		java.lang.String nome,
		java.lang.String docIdenticador)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipoempregador.TipoEmpregadorLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tipoempregador
				.EJSBMPTipoEmpregadorHomeBean_648f665d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipoempregador
						.EJSBMPTipoEmpregadorHomeBean_648f665d) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(nome, docIdenticador);
		} catch (javax.ejb.CreateException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.tipoempregador.TipoEmpregadorLocal findByPrimaryKey(
		br.smat.ejb.tipoempregador.TipoEmpregadorKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipoempregador.TipoEmpregadorLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tipoempregador
				.EJSBMPTipoEmpregadorHomeBean_648f665d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipoempregador
						.EJSBMPTipoEmpregadorHomeBean_648f665d) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findByPrimaryKey_Local(primaryKey);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	/**
	 * findAllTiposEmpregadores
	 * @generated
	 */
	public java.util.Collection findAllTiposEmpregadores()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tipoempregador
				.EJSBMPTipoEmpregadorHomeBean_648f665d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipoempregador
						.EJSBMPTipoEmpregadorHomeBean_648f665d) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllTiposEmpregadores_Local();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 2, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(java.lang.Object arg0)
		throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br
				.smat
				.ejb
				.tipoempregador
				.EJSBMPTipoEmpregadorHomeBean_648f665d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipoempregador
						.EJSBMPTipoEmpregadorHomeBean_648f665d) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_beanRef.remove(arg0);
		} catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (javax.ejb.EJBException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 3, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
}
