package br.smat.ejb.ocupacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPOcupacaoHome_a0be9c79
 * @generated
 */
public class EJSLocalBMPOcupacaoHome_a0be9c79
	extends EJSLocalWrapper
	implements br.smat.ejb.ocupacao.OcupacaoLocalHome {
	/**
	 * EJSLocalBMPOcupacaoHome_a0be9c79
	 * @generated
	 */
	public EJSLocalBMPOcupacaoHome_a0be9c79() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.ocupacao.OcupacaoLocal create(
		java.lang.String nome,
		int cbo)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.ocupacao.OcupacaoLocal _EJS_result = null;
		try {
			br.smat.ejb.ocupacao.EJSBMPOcupacaoHomeBean_a0be9c79 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.ocupacao
						.EJSBMPOcupacaoHomeBean_a0be9c79) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(nome, cbo);
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
	public br.smat.ejb.ocupacao.OcupacaoLocal findByPrimaryKey(
		br.smat.ejb.ocupacao.OcupacaoKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.ocupacao.OcupacaoLocal _EJS_result = null;
		try {
			br.smat.ejb.ocupacao.EJSBMPOcupacaoHomeBean_a0be9c79 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.ocupacao
						.EJSBMPOcupacaoHomeBean_a0be9c79) container
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
	 * findAllOcupacoes
	 * @generated
	 */
	public java.util.Collection findAllOcupacoes()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br.smat.ejb.ocupacao.EJSBMPOcupacaoHomeBean_a0be9c79 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.ocupacao
						.EJSBMPOcupacaoHomeBean_a0be9c79) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllOcupacoes_Local();
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
			br.smat.ejb.ocupacao.EJSBMPOcupacaoHomeBean_a0be9c79 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.ocupacao
						.EJSBMPOcupacaoHomeBean_a0be9c79) container
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
