package br.smat.ejb.representanteempresa;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPRepresentanteEmpresaHome_7d569c42
 * @generated
 */
public class EJSLocalBMPRepresentanteEmpresaHome_7d569c42
	extends EJSLocalWrapper
	implements br.smat.ejb.representanteempresa.RepresentanteEmpresaLocalHome {
	/**
	 * EJSLocalBMPRepresentanteEmpresaHome_7d569c42
	 * @generated
	 */
	public EJSLocalBMPRepresentanteEmpresaHome_7d569c42() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.representanteempresa.RepresentanteEmpresaLocal create(
		int empresa,
		java.lang.String nome)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.representanteempresa.RepresentanteEmpresaLocal _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.representanteempresa
				.EJSBMPRepresentanteEmpresaHomeBean_7d569c42 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.EJSBMPRepresentanteEmpresaHomeBean_7d569c42) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(empresa, nome);
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
		.representanteempresa
		.RepresentanteEmpresaLocal findByPrimaryKey(
			br
				.smat
				.ejb
				.representanteempresa
				.RepresentanteEmpresaKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.representanteempresa.RepresentanteEmpresaLocal _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.representanteempresa
				.EJSBMPRepresentanteEmpresaHomeBean_7d569c42 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.EJSBMPRepresentanteEmpresaHomeBean_7d569c42) container
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
				.representanteempresa
				.EJSBMPRepresentanteEmpresaHomeBean_7d569c42 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.EJSBMPRepresentanteEmpresaHomeBean_7d569c42) container
						.preInvoke(
					this,
					4,
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
				container.postInvoke(this, 4, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * findAllRepresentanteEmpresa
	 * @generated
	 */
	public java.util.Collection findAllRepresentanteEmpresa()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.representanteempresa
				.EJSBMPRepresentanteEmpresaHomeBean_7d569c42 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.EJSBMPRepresentanteEmpresaHomeBean_7d569c42) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllRepresentanteEmpresa_Local();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
		return _EJS_result;
	}
	/**
	 * findAllRepresentanteByEmpresa
	 * @generated
	 */
	public java.util.Collection findAllRepresentanteByEmpresa(int empresa)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.representanteempresa
				.EJSBMPRepresentanteEmpresaHomeBean_7d569c42 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.representanteempresa
						.EJSBMPRepresentanteEmpresaHomeBean_7d569c42) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.findAllRepresentanteByEmpresa_Local(empresa);
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
}
