package br.smat.ejb.localatendimento;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPLocalAtendimentoHome_60d99d9d
 * @generated
 */
public class EJSLocalBMPLocalAtendimentoHome_60d99d9d
	extends EJSLocalWrapper
	implements br.smat.ejb.localatendimento.LocalAtendimentoLocalHome {
	/**
	 * EJSLocalBMPLocalAtendimentoHome_60d99d9d
	 * @generated
	 */
	public EJSLocalBMPLocalAtendimentoHome_60d99d9d() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.localatendimento.LocalAtendimentoLocal create(
		java.lang.String nome,
		int municipio)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.localatendimento.LocalAtendimentoLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.localatendimento
				.EJSBMPLocalAtendimentoHomeBean_60d99d9d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.localatendimento
						.EJSBMPLocalAtendimentoHomeBean_60d99d9d) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(nome, municipio);
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
	public br.smat.ejb.localatendimento.LocalAtendimentoLocal findByPrimaryKey(
		br.smat.ejb.localatendimento.LocalAtendimentoKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.localatendimento.LocalAtendimentoLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.localatendimento
				.EJSBMPLocalAtendimentoHomeBean_60d99d9d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.localatendimento
						.EJSBMPLocalAtendimentoHomeBean_60d99d9d) container
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
	 * findAllLocaisAtendimento
	 * @generated
	 */
	public java.util.Collection findAllLocaisAtendimento()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.localatendimento
				.EJSBMPLocalAtendimentoHomeBean_60d99d9d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.localatendimento
						.EJSBMPLocalAtendimentoHomeBean_60d99d9d) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllLocaisAtendimento_Local();
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
				.localatendimento
				.EJSBMPLocalAtendimentoHomeBean_60d99d9d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.localatendimento
						.EJSBMPLocalAtendimentoHomeBean_60d99d9d) container
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
