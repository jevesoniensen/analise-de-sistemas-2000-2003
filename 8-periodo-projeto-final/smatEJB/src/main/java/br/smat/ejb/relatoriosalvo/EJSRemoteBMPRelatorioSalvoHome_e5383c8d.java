package br.smat.ejb.relatoriosalvo;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSRemoteBMPRelatorioSalvoHome_e5383c8d
 * @generated
 */
public class EJSRemoteBMPRelatorioSalvoHome_e5383c8d
	extends EJSWrapper
	implements br.smat.ejb.relatoriosalvo.RelatorioSalvoHome {
	/**
	 * EJSRemoteBMPRelatorioSalvoHome_e5383c8d
	 * @generated
	 */
	public EJSRemoteBMPRelatorioSalvoHome_e5383c8d()
		throws java.rmi.RemoteException {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.relatoriosalvo.RelatorioSalvo findByPrimaryKey(
		br.smat.ejb.relatoriosalvo.RelatorioSalvoKey primaryKey)
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.relatoriosalvo.RelatorioSalvo _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.relatoriosalvo
				.EJSBMPRelatorioSalvoHomeBean_e5383c8d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.EJSBMPRelatorioSalvoHomeBean_e5383c8d) container
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
	 * findAllRelatorios
	 * @generated
	 */
	public java.util.Collection findAllRelatorios()
		throws javax.ejb.FinderException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.util.Collection _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.relatoriosalvo
				.EJSBMPRelatorioSalvoHomeBean_e5383c8d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.EJSBMPRelatorioSalvoHomeBean_e5383c8d) container
						.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = _EJS_beanRef.findAllRelatorios();
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
			br
				.smat
				.ejb
				.relatoriosalvo
				.EJSBMPRelatorioSalvoHomeBean_e5383c8d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.EJSBMPRelatorioSalvoHomeBean_e5383c8d) container
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
				.relatoriosalvo
				.EJSBMPRelatorioSalvoHomeBean_e5383c8d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.EJSBMPRelatorioSalvoHomeBean_e5383c8d) container
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
				.relatoriosalvo
				.EJSBMPRelatorioSalvoHomeBean_e5383c8d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.EJSBMPRelatorioSalvoHomeBean_e5383c8d) container
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
				.relatoriosalvo
				.EJSBMPRelatorioSalvoHomeBean_e5383c8d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.EJSBMPRelatorioSalvoHomeBean_e5383c8d) container
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
	public br.smat.ejb.relatoriosalvo.RelatorioSalvo create(
		int tipoAgrupamento,
		int local,
		java.lang.String queryLocal,
		int periodicidade,
		int campo1,
		java.lang.String queryCampo1,
		int campo2,
		java.lang.String queryCampo2,
		java.lang.String dataInicio,
		java.lang.String dataFim,
		java.lang.String titulo,
		java.lang.String texto)
		throws javax.ejb.CreateException, java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.relatoriosalvo.RelatorioSalvo _EJS_result = null;
		try {
			br
				.smat
				.ejb
				.relatoriosalvo
				.EJSBMPRelatorioSalvoHomeBean_e5383c8d _EJS_beanRef =
				(
					br
						.smat
						.ejb
						.relatoriosalvo
						.EJSBMPRelatorioSalvoHomeBean_e5383c8d) container
						.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result =
				_EJS_beanRef.create(
					tipoAgrupamento,
					local,
					queryLocal,
					periodicidade,
					campo1,
					queryCampo1,
					campo2,
					queryCampo2,
					dataInicio,
					dataFim,
					titulo,
					texto);
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
}
