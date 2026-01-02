package br.smat.ejb.tipoacidente;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPTipoAcidenteHome_9e3bfeec
 * @generated
 */
public class EJSLocalBMPTipoAcidenteHome_9e3bfeec
	extends EJSLocalWrapper
	implements br.smat.ejb.tipoacidente.TipoAcidenteLocalHome {
	/**
	 * EJSLocalBMPTipoAcidenteHome_9e3bfeec
	 * @generated
	 */
	public EJSLocalBMPTipoAcidenteHome_9e3bfeec() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.tipoacidente.TipoAcidenteLocal create(
		java.lang.String nome)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipoacidente.TipoAcidenteLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tipoacidente
				.EJSBMPTipoAcidenteHomeBean_9e3bfeec _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipoacidente
						.EJSBMPTipoAcidenteHomeBean_9e3bfeec) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(nome);
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
	public br.smat.ejb.tipoacidente.TipoAcidenteLocal findByPrimaryKey(
		br.smat.ejb.tipoacidente.TipoAcidenteKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipoacidente.TipoAcidenteLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tipoacidente
				.EJSBMPTipoAcidenteHomeBean_9e3bfeec _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipoacidente
						.EJSBMPTipoAcidenteHomeBean_9e3bfeec) container
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
	 * findAllTiposAcidente
	 * @generated
	 */
	public java.util.Collection findAllTiposAcidente()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tipoacidente
				.EJSBMPTipoAcidenteHomeBean_9e3bfeec _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipoacidente
						.EJSBMPTipoAcidenteHomeBean_9e3bfeec) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllTiposAcidente_Local();
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
				.tipoacidente
				.EJSBMPTipoAcidenteHomeBean_9e3bfeec _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipoacidente
						.EJSBMPTipoAcidenteHomeBean_9e3bfeec) container
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
