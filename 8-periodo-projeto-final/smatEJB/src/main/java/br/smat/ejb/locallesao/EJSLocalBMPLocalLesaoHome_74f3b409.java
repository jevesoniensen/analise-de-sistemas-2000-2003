package br.smat.ejb.locallesao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPLocalLesaoHome_74f3b409
 * @generated
 */
public class EJSLocalBMPLocalLesaoHome_74f3b409
	extends EJSLocalWrapper
	implements br.smat.ejb.locallesao.LocalLesaoLocalHome {
	/**
	 * EJSLocalBMPLocalLesaoHome_74f3b409
	 * @generated
	 */
	public EJSLocalBMPLocalLesaoHome_74f3b409() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.locallesao.LocalLesaoLocal create(
		java.lang.String nome,
		int localLesaoPai)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.locallesao.LocalLesaoLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.locallesao
				.EJSBMPLocalLesaoHomeBean_74f3b409 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.locallesao
						.EJSBMPLocalLesaoHomeBean_74f3b409) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(nome, localLesaoPai);
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
	public br.smat.ejb.locallesao.LocalLesaoLocal findByPrimaryKey(
		br.smat.ejb.locallesao.LocalLesaoKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.locallesao.LocalLesaoLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.locallesao
				.EJSBMPLocalLesaoHomeBean_74f3b409 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.locallesao
						.EJSBMPLocalLesaoHomeBean_74f3b409) container
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
	 * findAllLocaisLesao
	 * @generated
	 */
	public java.util.Collection findAllLocaisLesao()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.locallesao
				.EJSBMPLocalLesaoHomeBean_74f3b409 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.locallesao
						.EJSBMPLocalLesaoHomeBean_74f3b409) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllLocaisLesao_Local();
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
				.locallesao
				.EJSBMPLocalLesaoHomeBean_74f3b409 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.locallesao
						.EJSBMPLocalLesaoHomeBean_74f3b409) container
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
	 * findAllLocaisLesao
	 * @generated
	 */
	public java.util.Collection findAllLocaisLesao(int pai)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.locallesao
				.EJSBMPLocalLesaoHomeBean_74f3b409 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.locallesao
						.EJSBMPLocalLesaoHomeBean_74f3b409) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllLocaisLesao_Local(pai);
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
}
