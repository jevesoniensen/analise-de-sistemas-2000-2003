package br.smat.ejb.tipodepoimento;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPTipoDepoimentoHome_157640b2
 * @generated
 */
public class EJSLocalBMPTipoDepoimentoHome_157640b2
	extends EJSLocalWrapper
	implements br.smat.ejb.tipodepoimento.TipoDepoimentoLocalHome {
	/**
	 * EJSLocalBMPTipoDepoimentoHome_157640b2
	 * @generated
	 */
	public EJSLocalBMPTipoDepoimentoHome_157640b2() {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.tipodepoimento.TipoDepoimentoLocal findByPrimaryKey(
		br.smat.ejb.tipodepoimento.TipoDepoimentoKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipodepoimento.TipoDepoimentoLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tipodepoimento
				.EJSBMPTipoDepoimentoHomeBean_157640b2 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipodepoimento
						.EJSBMPTipoDepoimentoHomeBean_157640b2) container
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
				.tipodepoimento
				.EJSBMPTipoDepoimentoHomeBean_157640b2 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipodepoimento
						.EJSBMPTipoDepoimentoHomeBean_157640b2) container
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
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.tipodepoimento.TipoDepoimentoLocal create(
		java.lang.String nome)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tipodepoimento.TipoDepoimentoLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tipodepoimento
				.EJSBMPTipoDepoimentoHomeBean_157640b2 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipodepoimento
						.EJSBMPTipoDepoimentoHomeBean_157640b2) container
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
	 * findAllTiposDepoimento
	 * @generated
	 */
	public java.util.Collection findAllTiposDepoimento()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tipodepoimento
				.EJSBMPTipoDepoimentoHomeBean_157640b2 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tipodepoimento
						.EJSBMPTipoDepoimentoHomeBean_157640b2) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllTiposDepoimento_Local();
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
