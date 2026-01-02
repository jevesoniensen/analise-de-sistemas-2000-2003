package br.smat.ejb.roteiros;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPRoteirosHome_f05933e0
 * @generated
 */
public class EJSLocalBMPRoteirosHome_f05933e0
	extends EJSLocalWrapper
	implements br.smat.ejb.roteiros.RoteirosLocalHome {
	/**
	 * EJSLocalBMPRoteirosHome_f05933e0
	 * @generated
	 */
	public EJSLocalBMPRoteirosHome_f05933e0() {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.roteiros.RoteirosLocal findByPrimaryKey(
		br.smat.ejb.roteiros.RoteirosKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.roteiros.RoteirosLocal _EJS_result = null;
		try {
			br.smat.ejb.roteiros.EJSBMPRoteirosHomeBean_f05933e0 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.roteiros
						.EJSBMPRoteirosHomeBean_f05933e0) container
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
	 * findAllRoteiros
	 * @generated
	 */
	public java.util.Collection findAllRoteiros(
		int tramiteFiscalizacao,
		int fiscalizacao)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br.smat.ejb.roteiros.EJSBMPRoteirosHomeBean_f05933e0 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.roteiros
						.EJSBMPRoteirosHomeBean_f05933e0) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.findAllRoteiros_Local(
					tramiteFiscalizacao,
					fiscalizacao);
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
	 * remove
	 * @generated
	 */
	public void remove(java.lang.Object arg0)
		throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.roteiros.EJSBMPRoteirosHomeBean_f05933e0 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.roteiros
						.EJSBMPRoteirosHomeBean_f05933e0) container
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
	 * create
	 * @generated
	 */
	public br.smat.ejb.roteiros.RoteirosLocal create(
		int tramiteFiscalizacao,
		int fiscalizacao,
		int itemFiscalizacao,
		int grauConformidade,
		java.lang.String nome)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.roteiros.RoteirosLocal _EJS_result = null;
		try {
			br.smat.ejb.roteiros.EJSBMPRoteirosHomeBean_f05933e0 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.roteiros
						.EJSBMPRoteirosHomeBean_f05933e0) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create_Local(
					tramiteFiscalizacao,
					fiscalizacao,
					itemFiscalizacao,
					grauConformidade,
					nome);
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
	 * findAllItemLastTramite
	 * @generated
	 */
	public java.util.Collection findAllItemLastTramite(int fiscalizacao)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br.smat.ejb.roteiros.EJSBMPRoteirosHomeBean_f05933e0 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.roteiros
						.EJSBMPRoteirosHomeBean_f05933e0) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.findAllItemLastTramite_Local(fiscalizacao);
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
