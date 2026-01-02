package br.smat.ejb.tramitefiscalizacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPTramiteFiscalizacao_a8af6b73
 * @generated
 */
public class EJSLocalBMPTramiteFiscalizacao_a8af6b73
	extends EJSLocalWrapper
	implements br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoLocal {
	/**
	 * EJSLocalBMPTramiteFiscalizacao_a8af6b73
	 * @generated
	 */
	public EJSLocalBMPTramiteFiscalizacao_a8af6b73() {
		super();
	}
	/**
	 * getFiscalizacao
	 * @generated
	 */
	public br.smat.ejb.fiscalizacao.FiscalizacaoKey getFiscalizacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.fiscalizacao.FiscalizacaoKey _EJS_result = null;
		try {
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.TramiteFiscalizacaoBean) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getFiscalizacao();
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
	 * getStatus
	 * @generated
	 */
	public br.smat.ejb.status.StatusKey getStatus() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.status.StatusKey _EJS_result = null;
		try {
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.TramiteFiscalizacaoBean) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getStatus();
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
	 * getTramiteFiscalizacao
	 * @generated
	 */
	public int getTramiteFiscalizacao() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.TramiteFiscalizacaoBean) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getTramiteFiscalizacao();
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
	 * getData
	 * @generated
	 */
	public java.lang.String getData() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.TramiteFiscalizacaoBean) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = beanRef.getData();
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
	 * setData
	 * @generated
	 */
	public void setData(java.lang.String data) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.TramiteFiscalizacaoBean) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			beanRef.setData(data);
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
	 * setFiscalizacao
	 * @generated
	 */
	public void setFiscalizacao(
		br.smat.ejb.fiscalizacao.FiscalizacaoKey fiscalizacao) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.TramiteFiscalizacaoBean) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			beanRef.setFiscalizacao(fiscalizacao);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 5, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
	/**
	 * setStatus
	 * @generated
	 */
	public void setStatus(br.smat.ejb.status.StatusKey status) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.tramitefiscalizacao.TramiteFiscalizacaoBean beanRef =
				(
					br
						.smat
						.ejb
						.tramitefiscalizacao
						.TramiteFiscalizacaoBean) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			beanRef.setStatus(status);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		} finally {
			try {
				container.postInvoke(this, 6, _EJS_s);
			} catch (RemoteException ex) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return;
	}
}
