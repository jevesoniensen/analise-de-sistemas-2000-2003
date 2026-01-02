package br.smat.ejb.tipolocalacidente;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPTipoLocalAcidenteHome_901fdf7f
 * @generated
 */
public class EJSLocalBMPTipoLocalAcidenteHome_901fdf7f
	extends EJSLocalWrapper
	implements br.smat.ejb.tipolocalacidente.TipoLocalAcidenteLocalHome {
	/**
	 * EJSLocalBMPTipoLocalAcidenteHome_901fdf7f
	 * @generated
	 */
	public EJSLocalBMPTipoLocalAcidenteHome_901fdf7f() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.tipolocalacidente.TipoLocalAcidenteLocal create(
		java.lang.String nome)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipolocalacidente.TipoLocalAcidenteLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tipolocalacidente
				.EJSBMPTipoLocalAcidenteHomeBean_901fdf7f _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipolocalacidente
						.EJSBMPTipoLocalAcidenteHomeBean_901fdf7f) container
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
	public br
		.smat
		.ejb
		.tipolocalacidente
		.TipoLocalAcidenteLocal findByPrimaryKey(
		br.smat.ejb.tipolocalacidente.TipoLocalAcidenteKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipolocalacidente.TipoLocalAcidenteLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tipolocalacidente
				.EJSBMPTipoLocalAcidenteHomeBean_901fdf7f _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipolocalacidente
						.EJSBMPTipoLocalAcidenteHomeBean_901fdf7f) container
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
	 * findAllTiposLocalAcidente
	 * @generated
	 */
	public java.util.Collection findAllTiposLocalAcidente()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tipolocalacidente
				.EJSBMPTipoLocalAcidenteHomeBean_901fdf7f _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipolocalacidente
						.EJSBMPTipoLocalAcidenteHomeBean_901fdf7f) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllTiposLocalAcidente_Local();
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
				.tipolocalacidente
				.EJSBMPTipoLocalAcidenteHomeBean_901fdf7f _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipolocalacidente
						.EJSBMPTipoLocalAcidenteHomeBean_901fdf7f) container
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
