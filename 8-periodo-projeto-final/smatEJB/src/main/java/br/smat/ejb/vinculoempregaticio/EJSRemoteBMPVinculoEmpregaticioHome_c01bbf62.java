package br.smat.ejb.vinculoempregaticio;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPVinculoEmpregaticioHome_c01bbf62
 * @generated
 */
public class EJSRemoteBMPVinculoEmpregaticioHome_c01bbf62
	extends EJSWrapper
	implements br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioHome {
	/**
	 * EJSRemoteBMPVinculoEmpregaticioHome_c01bbf62
	 * @generated
	 */
	public EJSRemoteBMPVinculoEmpregaticioHome_c01bbf62()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public br
		.smat
		.ejb
		.vinculoempregaticio
		.VinculoEmpregaticio findByPrimaryKey(
		br.smat.ejb.vinculoempregaticio.VinculoEmpregaticioKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.vinculoempregaticio.VinculoEmpregaticio _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.vinculoempregaticio
				.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.vinculoempregaticio
						.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62) container
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
	 * getEJBMetaData
	 * @generated
	 */
	public javax.ejb.EJBMetaData getEJBMetaData()
		throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		javax.ejb.EJBMetaData _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.vinculoempregaticio
				.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.vinculoempregaticio
						.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62) container
						.preInvoke(
					this,
					3,
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
			container.postInvoke(this, 3, _EJS_s);
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
			br
				.smat
				.ejb
				.vinculoempregaticio
				.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.vinculoempregaticio
						.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62) container
						.preInvoke(
					this,
					4,
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
			container.postInvoke(this, 4, _EJS_s);
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
			br
				.smat
				.ejb
				.vinculoempregaticio
				.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.vinculoempregaticio
						.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62) container
						.preInvoke(
					this,
					5,
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
			container.postInvoke(this, 5, _EJS_s);
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
			br
				.smat
				.ejb
				.vinculoempregaticio
				.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.vinculoempregaticio
						.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62) container
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
	 * create
	 * @generated
	 */
	public br.smat.ejb.vinculoempregaticio.VinculoEmpregaticio create(
		java.lang.String nome)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.vinculoempregaticio.VinculoEmpregaticio _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.vinculoempregaticio
				.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.vinculoempregaticio
						.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = _EJS_beanRef.create(nome);
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
	 * findAllVinculosEmpregaticios
	 * @generated
	 */
	public java.util.Collection findAllVinculosEmpregaticios()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.vinculoempregaticio
				.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62 _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.vinculoempregaticio
						.EJSBMPVinculoEmpregaticioHomeBean_c01bbf62) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllVinculosEmpregaticios();
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
}
