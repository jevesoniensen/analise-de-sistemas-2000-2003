package br.smat.ejb.tramitefiscalizacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPTramiteFiscalizacaoHome_a8af6b73
 * @generated
 */
public class EJSLocalBMPTramiteFiscalizacaoHome_a8af6b73
	extends EJSLocalWrapper
	implements br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoLocalHome {
	/**
	 * EJSLocalBMPTramiteFiscalizacaoHome_a8af6b73
	 * @generated
	 */
	public EJSLocalBMPTramiteFiscalizacaoHome_a8af6b73() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoLocal create(
		int fiscalizacao,
		int status)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoLocal _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.tramitefiscalizacao
				.EJSBMPTramiteFiscalizacaoHomeBean_a8af6b73 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.EJSBMPTramiteFiscalizacaoHomeBean_a8af6b73) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(fiscalizacao, status);
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
		.tramitefiscalizacao
		.TramiteFiscalizacaoLocal findByPrimaryKey(
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoLocal _EJS_result =
			null;
		try {
			br
				.smat
				.ejb
				.tramitefiscalizacao
				.EJSBMPTramiteFiscalizacaoHomeBean_a8af6b73 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.EJSBMPTramiteFiscalizacaoHomeBean_a8af6b73) container
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
				.tramitefiscalizacao
				.EJSBMPTramiteFiscalizacaoHomeBean_a8af6b73 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.EJSBMPTramiteFiscalizacaoHomeBean_a8af6b73) container
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
	 * findAllTramitesFiscalizacao
	 * @generated
	 */
	public java.util.Collection findAllTramitesFiscalizacao(int fiscalizacao)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.tramitefiscalizacao
				.EJSBMPTramiteFiscalizacaoHomeBean_a8af6b73 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.EJSBMPTramiteFiscalizacaoHomeBean_a8af6b73) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.findAllTramitesFiscalizacao_Local(fiscalizacao);
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
