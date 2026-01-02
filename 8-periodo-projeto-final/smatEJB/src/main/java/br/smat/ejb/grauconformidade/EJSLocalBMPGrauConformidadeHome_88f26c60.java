package br.smat.ejb.grauconformidade;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPGrauConformidadeHome_88f26c60
 * @generated
 */
public class EJSLocalBMPGrauConformidadeHome_88f26c60
	extends EJSLocalWrapper
	implements br.smat.ejb.grauconformidade.GrauConformidadeLocalHome {
	/**
	 * EJSLocalBMPGrauConformidadeHome_88f26c60
	 * @generated
	 */
	public EJSLocalBMPGrauConformidadeHome_88f26c60() {
		super();
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.grauconformidade.GrauConformidadeLocal create(
		java.lang.String nome,
		java.lang.String descricao)
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.grauconformidade.GrauConformidadeLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.grauconformidade
				.EJSBMPGrauConformidadeHomeBean_88f26c60 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.grauconformidade
						.EJSBMPGrauConformidadeHomeBean_88f26c60) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create_Local(nome, descricao);
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
	public br.smat.ejb.grauconformidade.GrauConformidadeLocal findByPrimaryKey(
		br.smat.ejb.grauconformidade.GrauConformidadeKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.grauconformidade.GrauConformidadeLocal _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.grauconformidade
				.EJSBMPGrauConformidadeHomeBean_88f26c60 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.grauconformidade
						.EJSBMPGrauConformidadeHomeBean_88f26c60) container
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
	 * findAllTipoAcidente
	 * @generated
	 */
	public java.util.Collection findAllTipoAcidente()
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.grauconformidade
				.EJSBMPGrauConformidadeHomeBean_88f26c60 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.grauconformidade
						.EJSBMPGrauConformidadeHomeBean_88f26c60) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllTipoAcidente_Local();
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
				.grauconformidade
				.EJSBMPGrauConformidadeHomeBean_88f26c60 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.grauconformidade
						.EJSBMPGrauConformidadeHomeBean_88f26c60) container
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
