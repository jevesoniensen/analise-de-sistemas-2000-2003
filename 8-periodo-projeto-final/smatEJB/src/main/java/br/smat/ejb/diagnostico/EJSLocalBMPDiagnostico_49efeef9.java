package br.smat.ejb.diagnostico;
import com.ibm.ejs.container.*;
import javax.ejb.*;
import java.rmi.RemoteException;
/**
 * EJSLocalBMPDiagnostico_49efeef9
 * @generated
 */
public class EJSLocalBMPDiagnostico_49efeef9
	extends EJSLocalWrapper
	implements br.smat.ejb.diagnostico.DiagnosticoLocal {
	/**
	 * EJSLocalBMPDiagnostico_49efeef9
	 * @generated
	 */
	public EJSLocalBMPDiagnostico_49efeef9() {
		super();
	}
	/**
	 * getCid10
	 * @generated
	 */
	public int getCid10() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.diagnostico.DiagnosticoBean beanRef =
				(br.smat.ejb.diagnostico.DiagnosticoBean) container.preInvoke(
					this,
					0,
					_EJS_s);
			_EJS_result = beanRef.getCid10();
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
	 * getDiagnostico
	 * @generated
	 */
	public int getDiagnostico() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		int _EJS_result = 0;
		try {
			br.smat.ejb.diagnostico.DiagnosticoBean beanRef =
				(br.smat.ejb.diagnostico.DiagnosticoBean) container.preInvoke(
					this,
					1,
					_EJS_s);
			_EJS_result = beanRef.getDiagnostico();
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
	 * getNome
	 * @generated
	 */
	public java.lang.String getNome() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		java.lang.String _EJS_result = null;
		try {
			br.smat.ejb.diagnostico.DiagnosticoBean beanRef =
				(br.smat.ejb.diagnostico.DiagnosticoBean) container.preInvoke(
					this,
					2,
					_EJS_s);
			_EJS_result = beanRef.getNome();
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
	 * setCid10
	 * @generated
	 */
	public void setCid10(int cid10) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.diagnostico.DiagnosticoBean beanRef =
				(br.smat.ejb.diagnostico.DiagnosticoBean) container.preInvoke(
					this,
					3,
					_EJS_s);
			beanRef.setCid10(cid10);
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
	 * setNome
	 * @generated
	 */
	public void setNome(java.lang.String nome) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);

		try {
			br.smat.ejb.diagnostico.DiagnosticoBean beanRef =
				(br.smat.ejb.diagnostico.DiagnosticoBean) container.preInvoke(
					this,
					4,
					_EJS_s);
			beanRef.setNome(nome);
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
}
