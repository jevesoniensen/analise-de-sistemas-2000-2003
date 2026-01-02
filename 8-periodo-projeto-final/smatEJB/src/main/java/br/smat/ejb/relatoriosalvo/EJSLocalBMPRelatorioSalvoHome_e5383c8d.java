package br.smat.ejb.relatoriosalvo;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPRelatorioSalvoHome_e5383c8d
 * @generated
 */
public class EJSLocalBMPRelatorioSalvoHome_e5383c8d
	extends EJSLocalWrapper
	implements br.smat.ejb.relatoriosalvo.RelatorioSalvoLocalHome {
	/**
	 * EJSLocalBMPRelatorioSalvoHome_e5383c8d
	 * @generated
	 */
	public EJSLocalBMPRelatorioSalvoHome_e5383c8d() {
		super();
	}
	/**
	 * findByPrimaryKey
	 * @generated
	 */
	public br.smat.ejb.relatoriosalvo.RelatorioSalvoLocal findByPrimaryKey(
		br.smat.ejb.relatoriosalvo.RelatorioSalvoKey primaryKey)
		throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.relatoriosalvo.RelatorioSalvoLocal _EJS_result = null;
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
	 * findAllRelatorios
	 * @generated
	 */
	public java.util.Collection findAllRelatorios()
		throws javax.ejb.FinderException {
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
			_EJS_result = _EJS_beanRef.findAllRelatorios_Local();
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
	public br.smat.ejb.relatoriosalvo.RelatorioSalvoLocal create(
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
		throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		br.smat.ejb.relatoriosalvo.RelatorioSalvoLocal _EJS_result = null;
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
				_EJS_beanRef.create_Local(
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
