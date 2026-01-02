package br.smat.ejb.regional;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPRegionalHome_b33cc976
 * @generated
 */
public class EJSRemoteBMPRegionalHome_b33cc976
	extends EJSWrapper
	implements br.smat.ejb.regional.RegionalHome {
	/**
	 * EJSRemoteBMPRegionalHome_b33cc976
	 * @generated
	 */
	public EJSRemoteBMPRegionalHome_b33cc976()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.regional.Regional findByPrimaryKey(
		br.smat.ejb.regional.RegionalKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.regional.Regional _EJS_result = null;
		try {
			br.smat.ejb.regional.EJSBMPRegionalHomeBean_b33cc976 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.regional
						.EJSBMPRegionalHomeBean_b33cc976) container
						.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findByPrimaryKey(primaryKey);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 1, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * findAllRegionais
	 * @generated
	 */
	public java.util.Collection findAllRegionais()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br.smat.ejb.regional.EJSBMPRegionalHomeBean_b33cc976 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.regional
						.EJSBMPRegionalHomeBean_b33cc976) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllRegionais();
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 2, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getEJBMetaData
	 * @generated
	 */
	public javax.ejb.EJBMetaData getEJBMetaData()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		javax.ejb.EJBMetaData _EJS_result = null;
		try {
			br.smat.ejb.regional.EJSBMPRegionalHomeBean_b33cc976 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.regional
						.EJSBMPRegionalHomeBean_b33cc976) container
						.preInvoke(
					this,
					4,
					_EJS_s);
			_EJS_result = _EJS_beanRef.getEJBMetaData();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 4, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * getHomeHandle
	 * @generated
	 */
	public javax.ejb.HomeHandle getHomeHandle()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		javax.ejb.HomeHandle _EJS_result = null;
		try {
			br.smat.ejb.regional.EJSBMPRegionalHomeBean_b33cc976 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.regional
						.EJSBMPRegionalHomeBean_b33cc976) container
						.preInvoke(
					this,
					5,
					_EJS_s);
			_EJS_result = _EJS_beanRef.getHomeHandle();
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 5, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(java.lang.Object arg0)
		throws java.rmi.RemoteException, javax.ejb.RemoveException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.regional.EJSBMPRegionalHomeBean_b33cc976 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.regional
						.EJSBMPRegionalHomeBean_b33cc976) container
						.preInvoke(
					this,
					6,
					_EJS_s);
			_EJS_beanRef.remove(arg0);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 6, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * remove
	 * @generated
	 */
	public void remove(javax.ejb.Handle arg0)
		throws java.rmi.RemoteException, javax.ejb.RemoveException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.regional.EJSBMPRegionalHomeBean_b33cc976 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.regional
						.EJSBMPRegionalHomeBean_b33cc976) container
						.preInvoke(
					this,
					7,
					_EJS_s);
			_EJS_beanRef.remove(arg0);
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 7, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return;
	}
	/**
	 * create
	 * @generated
	 */
	public br.smat.ejb.regional.Regional create(
		int municipio,
		int estado,
		java.lang.String nome,
		int numero,
		java.lang.String rua,
		java.lang.String bairro,
		java.lang.String cep,
		java.lang.String complemento)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.regional.Regional _EJS_result = null;
		try {
			br.smat.ejb.regional.EJSBMPRegionalHomeBean_b33cc976 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.regional
						.EJSBMPRegionalHomeBean_b33cc976) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create(
					municipio,
					estado,
					nome,
					numero,
					rua,
					bairro,
					cep,
					complemento);
		} catch (javax.ejb.CreateException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 0, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
	/**
	 * findAllRegionais
	 * @generated
	 */
	public java.util.Collection findAllRegionais(int estado)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br.smat.ejb.regional.EJSBMPRegionalHomeBean_b33cc976 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.regional
						.EJSBMPRegionalHomeBean_b33cc976) container
						.preInvoke(
					this,
					3,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllRegionais(estado);
		} catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		} catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		} catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new RemoteException(
				"bean method raised unchecked exception",
				ex);
		} finally {
			container.postInvoke(this, 3, _EJS_s);
			container.putEJSDeployedSupport(_EJS_s);
		}
		return _EJS_result;
	}
}
