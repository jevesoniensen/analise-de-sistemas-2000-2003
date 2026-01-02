package br.smat.ejb.telefoneregional;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPTelefoneRegionalHome_ab70ec97
 * @generated
 */
public class EJSLocalBMPTelefoneRegionalHome_ab70ec97
	extends EJSLocalWrapper
	implements br.smat.ejb.telefoneregional.TelefoneRegionalLocalHome {
	/**
	 * EJSLocalBMPTelefoneRegionalHome_ab70ec97
	 * @generated
	 */
	public EJSLocalBMPTelefoneRegionalHome_ab70ec97() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.telefoneregional.TelefoneRegionalLocal create(
		int regional,
		java.lang.String descricao,
		java.lang.String numero,
		java.lang.String ddd)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.telefoneregional.TelefoneRegionalLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.telefoneregional
				.EJSBMPTelefoneRegionalHomeBean_ab70ec97 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.EJSBMPTelefoneRegionalHomeBean_ab70ec97) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create_Local(regional, descricao, numero, ddd);
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
	public br.smat.ejb.telefoneregional.TelefoneRegionalLocal findByPrimaryKey(
		br.smat.ejb.telefoneregional.TelefoneRegionalKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.telefoneregional.TelefoneRegionalLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.telefoneregional
				.EJSBMPTelefoneRegionalHomeBean_ab70ec97 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.EJSBMPTelefoneRegionalHomeBean_ab70ec97) container
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
	 * findAllTelefonesRegionais
	 * @generated
	 */
	public java.util.Collection findAllTelefonesRegionais(int regional)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.telefoneregional
				.EJSBMPTelefoneRegionalHomeBean_ab70ec97 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.EJSBMPTelefoneRegionalHomeBean_ab70ec97) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.findAllTelefonesRegionais_Local(regional);
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
				.telefoneregional
				.EJSBMPTelefoneRegionalHomeBean_ab70ec97 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.telefoneregional
						.EJSBMPTelefoneRegionalHomeBean_ab70ec97) container
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
