package br.smat.ejb.fiscalizacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPFiscalizacaoHome_af35881e
 * @generated
 */
public class EJSLocalBMPFiscalizacaoHome_af35881e
	extends EJSLocalWrapper
	implements br.smat.ejb.fiscalizacao.FiscalizacaoLocalHome {
	/**
	 * EJSLocalBMPFiscalizacaoHome_af35881e
	 * @generated
	 */
	public EJSLocalBMPFiscalizacaoHome_af35881e() {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.fiscalizacao.FiscalizacaoLocal findByPrimaryKey(
		br.smat.ejb.fiscalizacao.FiscalizacaoKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.fiscalizacao.FiscalizacaoLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.fiscalizacao
				.EJSBMPFiscalizacaoHomeBean_af35881e _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.fiscalizacao
						.EJSBMPFiscalizacaoHomeBean_af35881e) container
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
	 * findAllFiscalizacao
	 * @generated
	 */
	public java.util.Collection findAllFiscalizacao()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.fiscalizacao
				.EJSBMPFiscalizacaoHomeBean_af35881e _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.fiscalizacao
						.EJSBMPFiscalizacaoHomeBean_af35881e) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllFiscalizacao_Local();
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
				.fiscalizacao
				.EJSBMPFiscalizacaoHomeBean_af35881e _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.fiscalizacao
						.EJSBMPFiscalizacaoHomeBean_af35881e) container
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
	public br.smat.ejb.fiscalizacao.FiscalizacaoLocal create(
		int agenteSaude,
		int empregador,
		java.lang.String titulo,
		java.lang.String obsGerais)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.fiscalizacao.FiscalizacaoLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.fiscalizacao
				.EJSBMPFiscalizacaoHomeBean_af35881e _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.fiscalizacao
						.EJSBMPFiscalizacaoHomeBean_af35881e) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create_Local(
					agenteSaude,
					empregador,
					titulo,
					obsGerais);
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
}
