package br.smat.ejb.investigacao;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPInvestigacaoHome_50a64b27
 * @generated
 */
public class EJSLocalBMPInvestigacaoHome_50a64b27
	extends EJSLocalWrapper
	implements br.smat.ejb.investigacao.InvestigacaoLocalHome {
	/**
	 * EJSLocalBMPInvestigacaoHome_50a64b27
	 * @generated
	 */
	public EJSLocalBMPInvestigacaoHome_50a64b27() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.investigacao.InvestigacaoLocal create(
		int agenteSaude,
		int acidente,
		java.lang.String titulo,
		java.lang.String obsGerais)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.investigacao.InvestigacaoLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.investigacao
				.EJSBMPInvestigacaoHomeBean_50a64b27 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.EJSBMPInvestigacaoHomeBean_50a64b27) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create_Local(
					agenteSaude,
					acidente,
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
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.investigacao.InvestigacaoLocal findByPrimaryKey(
		br.smat.ejb.investigacao.InvestigacaoKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.investigacao.InvestigacaoLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.investigacao
				.EJSBMPInvestigacaoHomeBean_50a64b27 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.EJSBMPInvestigacaoHomeBean_50a64b27) container
						.preInvoke(
					this,
					2,
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
	 * findAllInvestigacao
	 * @generated
	 */
	public java.util.Collection findAllInvestigacao()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.investigacao
				.EJSBMPInvestigacaoHomeBean_50a64b27 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.EJSBMPInvestigacaoHomeBean_50a64b27) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllInvestigacao_Local();
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
			br
				.smat
				.ejb
				.investigacao
				.EJSBMPInvestigacaoHomeBean_50a64b27 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.EJSBMPInvestigacaoHomeBean_50a64b27) container
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
	 * findByAcidente
	 * @generated
	 */
	public br.smat.ejb.investigacao.InvestigacaoLocal findByAcidente(
		int acidente)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.investigacao.InvestigacaoLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.investigacao
				.EJSBMPInvestigacaoHomeBean_50a64b27 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.investigacao
						.EJSBMPInvestigacaoHomeBean_50a64b27) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findByAcidente_Local(acidente);
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
}
